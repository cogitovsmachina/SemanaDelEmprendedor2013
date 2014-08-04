package mx.androidtitlan.semanadelemprendedor.activity;

import java.util.ArrayList;
import java.util.Random;

import mx.androidtitlan.semanadelemprendedor.R;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;

public class MapActivity extends ActionBarActivity {
	private GoogleMap gMap;
	private SupportMapFragment mMapFragment;
	private static final LatLng DEFAULT_MARKER_POSITION = new LatLng(19.441659, -99.2231956);
	
	private ArrayList<String> DEFAULT_MARKERS = new ArrayList<String>();
	private ArrayList<String> SPONSOR_MARKERS = new ArrayList<String>();
	private String ecosystem = null;
	private String title = null;
	private Double lat = 0.0;
	private Double lon = 0.0;
	private Boolean flag = true;
	
	
	/** List of hues to use for the marker */
    private static final float[] MARKER_HUES = new float[]{
        BitmapDescriptorFactory.HUE_RED,
        BitmapDescriptorFactory.HUE_ORANGE,
        BitmapDescriptorFactory.HUE_YELLOW,
        BitmapDescriptorFactory.HUE_GREEN,
        BitmapDescriptorFactory.HUE_CYAN,
        BitmapDescriptorFactory.HUE_AZURE,
        BitmapDescriptorFactory.HUE_BLUE,
        BitmapDescriptorFactory.HUE_VIOLET,
        BitmapDescriptorFactory.HUE_MAGENTA,
        BitmapDescriptorFactory.HUE_ROSE,
    };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ActionBar ab = getSupportActionBar();
		ab.setDisplayHomeAsUpEnabled(true);
		setContentView(R.layout.activity_map);
		mMapFragment = (SupportMapFragment) getSupportFragmentManager()
				.findFragmentById(R.id.map);
		
		ecosystem = getIntent().getStringExtra("eco");
		title = getIntent().getStringExtra("title");
		lat = getIntent().getDoubleExtra("lat", 0.0);
		lon = getIntent().getDoubleExtra("lon", 0.0);
		
		if(ecosystem != null){
			flag = false;
		}else {
			flag = true;
		}
		// Default Marker and Ecos
		DEFAULT_MARKERS.add("Red Mover a México, 19.438746838709726, -99.22531843185425");
		DEFAULT_MARKERS.add("Campamento Emprendimiento, 19.439207173794866, -99.22560006380081");
		DEFAULT_MARKERS.add("Registro, 19.43892389082005, -99.22490805387497");
		DEFAULT_MARKERS.add("México Digital, 19.43944239946083, -99.2252191901207");
		DEFAULT_MARKERS.add("Empresa Digital, 19.439681418740047, -99.22471091151237");
		DEFAULT_MARKERS.add("Microsoft, 19.439762356405616, -99.22481417655945");
		DEFAULT_MARKERS.add("Google, 19.43956254147055, -99.22458216547966");
		DEFAULT_MARKERS.add("Innovación, 19.439797766621624, -99.22428712248802");
		DEFAULT_MARKERS.add("Cultura Financiera, 19.440629904474186, -99.22382980585098");
		DEFAULT_MARKERS.add("Casos de Éxito, 19.440057019753503, -99.22390088438988");
		DEFAULT_MARKERS.add("Bancos, 19.440401003757653, -99.22351598739624");
		DEFAULT_MARKERS.add("Sectores Estratégicos, 19.441028266829942, -99.22301173210144");
		DEFAULT_MARKERS.add("Patrocinio, 19.440922036963993, -99.22278642654419");
		DEFAULT_MARKERS.add("Alianzas Globales, 19.43918314534743, -99.22487318515778");
		
		// Sponsor Markers
		SPONSOR_MARKERS.add("FEDEX, 19.438863187261106, -99.22502875328064");
		SPONSOR_MARKERS.add("Manpower, 19.438921361505553, -99.22488927841187");
		SPONSOR_MARKERS.add("Pemex, 19.43871395758227, -99.22505289316177");
		SPONSOR_MARKERS.add("Consejo de la Comunicación, 19.438880892468134, -99.22573417425156");
		SPONSOR_MARKERS.add("Cablevisión, 19.439485397664026, -99.22441720962524");
		SPONSOR_MARKERS.add("Telmex, 19.439444928767223, -99.22447890043259");
		SPONSOR_MARKERS.add("Bimbo, 19.439394342632053, -99.22453254461288");
		SPONSOR_MARKERS.add("Google, 19.439586569861856, -99.22460228204727");
		SPONSOR_MARKERS.add("BBVA Bancomer, 19.440350417920403, -99.22351330518723");
		SPONSOR_MARKERS.add("Banorte, 19.44045917745103, -99.2233818769455");
		SPONSOR_MARKERS.add("Banamex, 19.440474353193668, -99.2235079407692");
		SPONSOR_MARKERS.add("FOCIR, 19.440532526860743, -99.22346770763397");
		SPONSOR_MARKERS.add("Bancomext, 19.440441472416108, -99.22358840703964");
		SPONSOR_MARKERS.add("Santander, 19.440550231885716, -99.22356694936752");
		SPONSOR_MARKERS.add("SHF, 19.4405299975713, -99.22330141067505");
		SPONSOR_MARKERS.add("NAFIN, 19.440322595703197, -99.22345966100693");
		SPONSOR_MARKERS.add("PRONAFIM, 19.440401003757653, -99.22338455915451");
		SPONSOR_MARKERS.add("HSBC, 19.440552761174832, -99.22363936901093");
		SPONSOR_MARKERS.add("Credifiel, 19.44051988041315, 99.22369837760925");
		SPONSOR_MARKERS.add("NR Finance, 19.44081833631351, -99.22368496656418");
		SPONSOR_MARKERS.add("Finrural, 19.44043388454342, -99.22335773706436");
		SPONSOR_MARKERS.add("EY, 19.44048447035467, -99.22396928071976");
		
		//setSponsorMarker("Google");
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		setupMapIfNeed();
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			finish();
			return true;
		}
		return true;
	}
	
	private void setupMapIfNeed() {
		if (gMap == null) {
			gMap = mMapFragment.getMap();
			if (gMap != null) {
				gMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
				gMap.moveCamera(CameraUpdateFactory.newLatLngZoom(
						new LatLng(19.440087371312597, -99.22416508197784), 17));
				gMap.getUiSettings().setZoomControlsEnabled(false);
				gMap.getUiSettings().setCompassEnabled(true);
				initialSetup();
			}
		}
	}

	public void initialSetup(){
		if(flag){
			setUpEcosystem();
		}else{
			setSponsorMarker();
		}
	}

	private void setSponsorMarker() {
		gMap.clear();
		drawingRooms();
		float newHue = MARKER_HUES[new Random().nextInt(MARKER_HUES.length)];
		gMap.addMarker(new MarkerOptions().position(
				new LatLng(lat, lon)).title(
				ecosystem).snippet(title).icon(BitmapDescriptorFactory.defaultMarker(newHue)));
	}

	private void setUpEcosystem() {
		drawingRooms();
		drawingEcosystems();
		grawingInitialMakers();
	}
	
	private void grawingInitialMakers() {
		// Initial Markers-Salas
		gMap.addMarker(new MarkerOptions()
				.position(new LatLng(19.439131294475075, -99.22532379627228))
				.title("Sala D")
				.icon(BitmapDescriptorFactory
						.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
		gMap.addMarker(new MarkerOptions().position(
				new LatLng(19.439806619174426, -99.224554002285)).title(
				"Sala C"));
		gMap.addMarker(new MarkerOptions().position(
				new LatLng(19.440390886591462, -99.22381907701492)).title(
				"Sala B"));
		gMap.addMarker(new MarkerOptions().position(
				new LatLng(19.44095238836136, -99.2231673002243)).title(
				"Sala A"));
		for(int i = 0; i < DEFAULT_MARKERS.size(); i++){
			String name, lat, lon;
			String temp = DEFAULT_MARKERS.get(i);
			int p1 = temp.indexOf(',');
			int p2 = temp.indexOf(',', p1+1);
			name = temp.substring(0, p1);
			lat = temp.substring(p1+1, p2);
			lon = temp.substring(p2+1, temp.length());
			float newHue = MARKER_HUES[new Random().nextInt(MARKER_HUES.length)];
			gMap.addMarker(new MarkerOptions().position(
					new LatLng(Double.parseDouble(lat), Double.parseDouble(lon))).title(
					name).icon(BitmapDescriptorFactory.defaultMarker(newHue)));
			
			name =  null;
			lat = null;
			lon = null;
			p1 = 0;
			p2 = 0;
		}
	}

	private void drawingEcosystems() {
		
		// Drawing Eco
				// RED
				
				PolygonOptions REDPolygon = new PolygonOptions();
				REDPolygon.add(
						new LatLng(19.438681076448155, -99.2254713177681),
						new LatLng(19.438531846601933, -99.22531574964523),
						new LatLng(19.43875695597837, -99.22507166862488),
						new LatLng(19.43890112698809, -99.22522991895676),
						new LatLng(19.438681076448155, -99.2254713177681));
				REDPolygon.fillColor(Color.argb(50, 3, 52, 117));
				REDPolygon.strokeWidth(0);
				gMap.addPolygon(REDPolygon);
				
				// Eco Name
				Bitmap.Config REDconf = Bitmap.Config.ARGB_8888;
				Bitmap REDbmp = Bitmap.createBitmap(50, 50, REDconf);
				Canvas REDcanvas = new Canvas(REDbmp);

				Paint REDpaint = new Paint();
				REDpaint.setColor(Color.WHITE);
				REDpaint.setTextSize(20);

				REDcanvas.drawText("RED", 0, 50, REDpaint); // paint defines the text color,
														// stroke width, size

				// Add name marker to map
				/*gMap.addMarker(new MarkerOptions().position(new LatLng(19.438746838709726, -99.22531843185425))
						.icon(BitmapDescriptorFactory.fromBitmap(REDbmp)));*/
				///////
				
				// Drawing Camp
				PolygonOptions CampPolygon = new PolygonOptions();
				CampPolygon.add(
						new LatLng(19.439111059983805, -99.22593265771866),
						new LatLng(19.438698781675043, -99.22550082206726),
						new LatLng(19.43899724092343, -99.22518163919449),
						new LatLng(19.439406989167317, -99.2256161570549),
						new LatLng(19.439111059983805, -99.22593265771866));
				CampPolygon.fillColor(Color.argb(50, 3, 52, 117));
				CampPolygon.strokeWidth(0);
				gMap.addPolygon(CampPolygon);
				
				//Camp Name
				Bitmap.Config Campconf = Bitmap.Config.ARGB_8888;
				Bitmap Campbmp = Bitmap.createBitmap(130, 60, Campconf);
				Canvas Campcanvas = new Canvas(Campbmp);

				Paint Camppaint = new Paint();
				Camppaint.setColor(Color.WHITE);
				Camppaint.setTextSize(20);

				Campcanvas.drawText("Campamento", 0, 50, Camppaint); // paint defines the text color,
														// stroke width, size
				
				// Add name marker to map
				/*gMap.addMarker(new MarkerOptions().position(new LatLng(19.43907564961802, -99.22555983066559))
						.icon(BitmapDescriptorFactory.fromBitmap(Campbmp)));*/
				/////////
						
				// Drawing México Digital
				PolygonOptions MexDPolygon = new PolygonOptions();
				MexDPolygon.add(
						new LatLng(19.43947780974663, -99.22544181346893),
						new LatLng(19.439143941030824, -99.22506362199783),
						new LatLng(19.43933869786516, -99.22487318515778),
						new LatLng(19.439664978271797,  -99.22525405883789),
						new LatLng(19.43947780974663, -99.22544181346893));
				MexDPolygon.fillColor(Color.argb(50, 3, 52, 117));
				MexDPolygon.strokeWidth(0);
				gMap.addPolygon(MexDPolygon);
				
				// Drawin Alianzas
				PolygonOptions AliPolygon = new PolygonOptions();
				AliPolygon.add(
						new LatLng(19.43931087547455, -99.22482088208199),
						new LatLng(19.43911232463957, -99.22501802444458),
						new LatLng(19.43903644527546, -99.22493755817413),
						new LatLng(19.43923373154841,  -99.22473505139351),
						new LatLng(19.43931087547455, -99.22482088208199));
				AliPolygon.fillColor(Color.argb(50, 3, 52, 117));
				AliPolygon.strokeWidth(0);
				gMap.addPolygon(AliPolygon);
				
				// Drawing Empresa Digital
				PolygonOptions DigiPolygon = new PolygonOptions();
				DigiPolygon.add(
						new LatLng(19.439773738261604, -99.22505557537079),
						new LatLng(19.439363990943374, -99.2246076464653),
						new LatLng(19.439634626633726, -99.22432333230972),
						new LatLng(19.440049431862843,  -99.22475785017014),
						new LatLng(19.439773738261604, -99.22505557537079));
				DigiPolygon.fillColor(Color.argb(50, 3, 52, 117));
				DigiPolygon.strokeWidth(0);
				gMap.addPolygon(DigiPolygon);
				
				// Drawing Innovación
				PolygonOptions InnoPolygon = new PolygonOptions();
				InnoPolygon.add(
						new LatLng(19.439859734481054, -99.22409802675247),
						new LatLng(19.440234070434904, -99.22447890043259),
						new LatLng(19.440041843971834, -99.2246961593628),
						new LatLng(19.439664978271797, -99.22430723905563),
						new LatLng(19.439859734481054, -99.22409802675247));
				InnoPolygon.fillColor(Color.argb(50, 3, 52, 117));
				InnoPolygon.strokeWidth(0);
				gMap.addPolygon(InnoPolygon);
				
				//Drawing Cultura-Financiera
				PolygonOptions CulPolygon = new PolygonOptions();
				CulPolygon.add(
						new LatLng(19.44064887413233, -99.22391027212143),
						new LatLng(19.4405805833526, -99.22382444143295),
						new LatLng(19.44073234060188, -99.22368228435516),
						new LatLng(19.44080568988819, -99.22376543283463),
						new LatLng(19.44064887413233, -99.22391027212143));
				CulPolygon.fillColor(Color.argb(50, 3, 52, 117));
				CulPolygon.strokeWidth(0);
				gMap.addPolygon(CulPolygon);
				
				//Drawing Sectores-Estrategicos
				PolygonOptions SecPolygon = new PolygonOptions();
				SecPolygon.add(
						new LatLng(19.44125337274473, -99.22309756278992),
						new LatLng(19.441040913237924, -99.22330141067505),
						new LatLng(19.441088969579273, -99.22335237264633),
						new LatLng(19.44088662699323, -99.22353744506836),
						new LatLng(19.440671637719184, -99.22329604625702),
						new LatLng(19.44080821917332, -99.2231485247612),
						new LatLng(19.440752574891057, -99.22308683395386),
						new LatLng(19.440884097709308, -99.2229500412941),
						new LatLng(19.44092456624732, -99.22300100326538),
						new LatLng(19.44105355964492, -99.22288298606873),
						new LatLng(19.44125337274473, -99.22309756278992));
				SecPolygon.fillColor(Color.argb(50, 3, 52, 117));
				SecPolygon.strokeWidth(0);
				gMap.addPolygon(SecPolygon);
		
	}

	public void drawingRooms(){
		// Set Text to marker
				Bitmap.Config conf = Bitmap.Config.ARGB_8888;
				Bitmap bmp = Bitmap.createBitmap(300, 50, conf);
				Canvas canvas = new Canvas(bmp);

				Paint paint = new Paint();
				paint.setColor(Color.WHITE);
				paint.setTextSize(30);

				canvas.drawText("Centro Banamex", 0, 50, paint); // paint defines the text color,
														// stroke width, size

				// Add Centro Banamex marker to map
				gMap.addMarker(new MarkerOptions().position(DEFAULT_MARKER_POSITION)
						.icon(BitmapDescriptorFactory.fromBitmap(bmp)));
		// Salas
		PolygonOptions basePoligon = new PolygonOptions();
		basePoligon.add(
				new LatLng(19.43840790984573, -99.22530770301819),
				new LatLng(19.440957446927033, -99.2226094007492),
				new LatLng(19.441407658640856, -99.22311902046204), 
				new LatLng(19.440881568425347, -99.2236715555191), 
				new LatLng(19.44095238836136, -99.22374129295349), 
				new LatLng(19.440309949239253, -99.2243903875351), 
				new LatLng(19.440426296670378, -99.22451913356781), 
				new LatLng(19.439778796864005, -99.2251843214035), 
				new LatLng(19.439859734481054, -99.22527551651001), 
				new LatLng(19.439111059983805, -99.22606945037842), 
				new LatLng(19.43840790984573, -99.22530770301819));
		basePoligon.fillColor(Color.argb(55, 3, 139, 28));
		basePoligon.strokeColor(Color.rgb(3, 139, 28));
		basePoligon.strokeWidth(10);
		// Add polygon to map
		gMap.addPolygon(basePoligon);

		// Sala A
		PolygonOptions salaAPoligon = new PolygonOptions();
		salaAPoligon.add(
				new LatLng(19.440889156277105, -99.22358304262161),
				new LatLng(19.440492058224976, -99.22316461801529), 
				new LatLng(19.440949859078454, -99.22268718481064), 
				new LatLng(19.44134189745715, -99.22313243150711), 
				new LatLng(19.440889156277105, -99.22358304262161));
		//salaAPoligon.fillColor(Color.CYAN);
		salaAPoligon.strokeColor(Color.rgb(11, 111, 242));
		salaAPoligon.strokeWidth(5);
		// Add polygon to map
		gMap.addPolygon(salaAPoligon);

		// Sala B
		PolygonOptions salaBPoligon = new PolygonOptions();
		salaBPoligon.add(
				new LatLng(19.440292244188086, -99.22432869672775),
				new LatLng(19.439854675881158, -99.22383785247803), 
				new LatLng(19.44040859163188, -99.2232558131218), 
				new LatLng(19.440851217014746, -99.22376275062561), 
				new LatLng(19.440292244188086, -99.22432869672775));
		//salaBPoligon.fillColor(Color.MAGENTA);
		salaBPoligon.strokeColor(Color.rgb(201, 170, 14));
		salaBPoligon.strokeWidth(5);
		// Add polygon to map
		gMap.addPolygon(salaBPoligon);

		// Sala C
		PolygonOptions salaCPoligon = new PolygonOptions();
		salaCPoligon.add(
				new LatLng(19.439773738261604, -99.22511726617813),
				new LatLng(19.439232466893586, -99.22452181577682), 
				new LatLng(19.43977626756283, -99.22394782304764), 
				new LatLng(19.44031500782495, -99.22452449798584), 
				new LatLng(19.439773738261604, -99.22511726617813));
		//salaCPoligon.fillColor(Color.GRAY);
		salaCPoligon.strokeColor(Color.rgb(4, 20, 144));
		salaCPoligon.strokeWidth(5);
		// Add polygon to map
		gMap.addPolygon(salaCPoligon);

		// Sala D
		PolygonOptions salaDPoligon = new PolygonOptions();
		salaDPoligon.add(
				new LatLng(19.439108530672225, -99.22598093748093),
				new LatLng(19.438483789503625, -99.22531574964523), 
				new LatLng(19.439151528963812, -99.22459959983826), 
				new LatLng(19.439748445247233, -99.2252916097641), 
				new LatLng(19.439108530672225, -99.22598093748093));
		//salaDPoligon.fillColor(Color.RED);
		salaDPoligon.strokeColor(Color.RED);
		salaDPoligon.strokeWidth(5);
		// Add polygon to map
		gMap.addPolygon(salaDPoligon);
	}
	
	public void doLevelOne(View view){
		gMap.clear();
		setUpEcosystem();
	}
	
	public void doLevelTwo(View view){
		gMap.clear();
		drawingRooms();
		drawSponsorMakers();
	}

	private void drawSponsorMakers() {
		for(int i = 0; i < SPONSOR_MARKERS.size(); i++){
			String name, lat, lon;
			String temp = SPONSOR_MARKERS.get(i);
			int p1 = temp.indexOf(',');
			int p2 = temp.indexOf(',', p1+1);
			name = temp.substring(0, p1);
			lat = temp.substring(p1+1, p2);
			lon = temp.substring(p2+1, temp.length());
			float newHue = MARKER_HUES[new Random().nextInt(MARKER_HUES.length)];
			gMap.addMarker(new MarkerOptions().position(
					new LatLng(Double.parseDouble(lat), Double.parseDouble(lon))).title(
					name).icon(BitmapDescriptorFactory.defaultMarker(newHue)));
			
			name =  null;
			lat = null;
			lon = null;
			p1 = 0;
			p2 = 0;
		}
	}
}
