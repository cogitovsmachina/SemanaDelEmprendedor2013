package mx.androidtitlan.semanadelemprendedor.util;

import mx.androidtitlan.semanadelemprendedor.R;
import mx.androidtitlan.semanadelemprendedor.entities.ExploreSpeakerRowItem;
import mx.androidtitlan.semanadelemprendedor.entities.MainAgendaRowItem;

public class Utils {
	public static final int ECOSYSTEM_GLOBAL_ALLIANCES = 0;
	public static final int ECOSYSTEM_ENTREPRENEUR_CAMP = 1;
	public static final int ECOSYSTEM_FINANCIAL_CULTURE = 2;
	public static final int ECOSYSTEM_DIGITAL_ENTERPRISE = 3;
	public static final int ECOSYSTEM_INNOVATION = 4;
	public static final int ECOSYSTEM_DIGITAL_MEXICO = 5;
	public static final int ECOSYSTEM_MOVE_MEXICO = 6;
	public static final int ECOSYSTEM_STRATEGIC_SECTORS = 7;
	public static final int LECTURE = 8;

	public static final String[] EVENT_DATES = { "Martes, 6 de Agosto de 2013",
			"Miércoles, 7 de Agosto de 2013", "Jueves, 8 de Agosto de 2013",
			"Viernes, 9 de Agosto de 2013", "Sábado, 10 de Agosto de 2013" };

	public static final int DAY_1 = 0;
	public static final int DAY_2 = 1;
	public static final int DAY_3 = 2;
	public static final int DAY_4 = 3;
	public static final int DAY_5 = 4;

	public static final String[] ECOSYSTEM_NAMES = { "Alianzas Globales",
			"Campamento Emprendedor", "Cultura Financiera", "Empresa Digital",
			"Innovación", "México Digital", "Red Mover a México",
			"Sectores Estratégicos", "Conferencia Magistral" };

	public static final int[] ECOSYSTEM_ICONS = {
			R.drawable.icn_alianzas_globales,
			R.drawable.icn_campamento_emprendedor,
			R.drawable.icn_cultura_financiera, R.drawable.icn_empresa_digital,
			R.drawable.icn_innovacion, R.drawable.icn_mexico_digital,
			R.drawable.icn_red_mover_mexico,
			R.drawable.icn_sectores_estrategicos, R.drawable.ic_launcher };

	/*
	 * SPEAKERS: 1era dimensión: Ecosistema
	 */
	public static final ExploreSpeakerRowItem[][] speakers = {
			// Global Aliances
			new ExploreSpeakerRowItem[] {},

			// Entrepreneur camp
			new ExploreSpeakerRowItem[] { new ExploreSpeakerRowItem(
					"Consejo de la Comunicación",
					R.drawable.logo_consejo_comunicacion,
					0,
					"El Consejo Nacional de la Publicidad fue fundado hace 50 años por un grupo de empresarios profundamente preocupados por promover las grandes causas nacionales, fomentar la participación social e influir positivamente en el ánimo, valores y hábitos de la sociedad mexicana. ",
					"Campamento Emprendedor", 19.439207173794866,
					-99.22560006380081), },

			// Financial Culture
			new ExploreSpeakerRowItem[] {
					new ExploreSpeakerRowItem(
							"Ernest & Young",
							R.drawable.logo_ernest_young,
							1,
							"EY es una firma líder mundial en servicios profesionales de auditoría, asesoramiento fiscal y legal, transacciones y consultoría. Nuestros 167,000 profesionales comparten en todo el mundo una única escala de valores que los guía a hacer siempre lo correcto, y un firme compromiso con la calidad intrínseco a todo lo que hacemos y lo que somos.",
							"Cultura Financiera", 19.440629904474186,
							-99.22382980585098),
					new ExploreSpeakerRowItem(
							"BBVA Bancomer",
							R.drawable.logo_bbva,
							2,
							"BBVA es un gran grupo global de servicios financieros, con una sólida posición de liderazgo en el mercado español y una fuerte presencia internacional en 32 países. Con una franquicia líder en América Latina y una creciente presencia en EEUU y Asia, empleamos a unas 100.000 personas en todo el mundo, y contamos con más de 48 millones de clientes.",
							"Cultura Financiera", 19.440629904474186,
							-99.22382980585098),
					new ExploreSpeakerRowItem(
							"Banamex",
							R.drawable.logo_banamex,
							3,
							"La incorporación a Citigroup nos ha permitido ofrecer una extensa gama de servicios financieros en México y el mundo, por medio de nuestras empresas subsidiarias: \nBanamex \n Acciones y Valores Banamex\n Seguros Banamex \n Afore Banamex\n Fomento Cultural\n Fomento Social"
									+ "Hoy en día, somos parte de la principal compañía de servicios financieros en el mundo, con 200 millones de cuentahabientes en más de 100 países.",
							"Cultura Financiera", 19.440629904474186,
							-99.22382980585098),
					new ExploreSpeakerRowItem(
							"Banorte",
							R.drawable.logo_banorte,
							4,
							"Banorte fue fundado en 1899 en la ciudad de Monterrey, donde comenzó sus operaciones como un pequeño jugador regional. En 1992, en el proceso de privatización de la banca, Banorte fue adquirido por un grupo de empresarios, encabezado por Don Roberto González Barrera. A través de una serie de adquisiciones estratégicas después de la crisis de mediados de los 1990's, como Bancen y Banpaís en 1997 y Bancrecer en 2002, Banorte consolidó una presencia nacional en México. Actualmente opera como Grupo Financiero Banorte (GFNorte), bajo un modelo de banca universal ofreciendo productos y servicios bancarios en el sistema financiero mexicano. Banorte es actualmente la tercera institución bancaria más grande en México medida en tamaño de depósitos y crédito, superando recientemente a HSBC y Santander. Es el segundo proveedor de financiamiento a estados y municipios, así como créditos hipotecarios, y es el tercer jugador más grande en cuanto a préstamos comerciales.",
							"Cultura Financiera", 19.440629904474186,
							-99.22382980585098),
					new ExploreSpeakerRowItem(
							"FOCIR",
							1,
							5,
							"FOCIR es un agente especializado para la inversión de largo plazo en proyectos con potencial de crecimiento, que agregan valor en el sector rural y agroindustrial. Diseñamos y estructuramos fondos de capital privado, ofrecemos servicios de banca de inversión, somos inversionistas en fondos especializados, administramos portafolios de inversiones, fondos de capital privado y programas federales. Para ello, hemos estructurado un modelo de negocio con tres productos fundamentales: Capital Privado, Portafolio de Inversión y Operación de fondos y programas",
							"Cultura Financiera", 19.440629904474186,
							-99.22382980585098),
					new ExploreSpeakerRowItem(
							"Bancomext",
							R.drawable.logo_bancomext,
							6,
							"Bancomext otorga financiamientos destinados a atender los requerimientos tanto de corto como de mediano y largo plazo de las empresas participantes en el comercio exterior mexicano, incluyendo a exportadoras y sus proveedores, importadoras, empresas que sustituyen importaciones y generadoras de divisas.",
							"Cultura Financiera", 19.440629904474186,
							-99.22382980585098),
					new ExploreSpeakerRowItem(
							"Santander",
							R.drawable.logo_santander,
							6,
							"El mayor banco de la Eurozona y uno de los más grandes del mundo. Banco Santander es un banco global y multinacional que en 2012 fue confirmado, por tercera vez en los últimos años, como el Mejor Banco el Mundo, de acuerdo con la clasificación anual de Euromoney. Al cierre del último ejercicio, Santander era el mayor de la Eurozona y uno de los trece mayores del mundo por capitalización bursátil: 63.000 millones de euros.",
							"Cultura Financiera", 19.440629904474186,
							-99.22382980585098),
					// TODO: ASK FOR SHF
					new ExploreSpeakerRowItem(
							"Sociedad Hipotecaria Federal",
							2,
							7,
							"Sociedad Hipotecaria Federal, S.N.C., (SHF) es una institución financiera perteneciente a la Banca de Desarrollo, creada en 2001, con el fin de propiciar el acceso a la vivienda de calidad a los mexicanos que la demandan, al establecer las condiciones para que se destinen recursos públicos y privados a la oferta de créditos hipotecarios. Mediante el otorgamiento de créditos y garantías, SHF promueve la construcción y adquisición de viviendas preferentemente de interés social y medio.",
							"Cultura Financiera", 19.440629904474186,
							-99.22382980585098),
					new ExploreSpeakerRowItem(
							"Nacional Financiera",
							R.drawable.logo_nafin,
							8,
							"Nacional Financiera es un banco estatal en México encargado de apoyar con financiamiento, capacitación y asistencia técnica a las pequeñas y medianas empresas, parte fundamental de las economías de todos los países del orbe, al generar una gran proporción del Producto Interno Bruto y del empleo.",
							"Cultura Financiera", 19.440629904474186,
							-99.22382980585098),
					new ExploreSpeakerRowItem(
							"PRONAFIM",
							R.drawable.logo_pronafim,
							9,
							"El Programa Nacional de Financiamiento al Microempresario (PRONAFIM), es un programa federal creado para contribuir al establecimiento y consolidación del sector microfinanciero con el fin de apoyar, tanto en poblaciones urbanas como rurales, las iniciativas productivas y emprendimientos de hombres y mujeres en situación de pobreza que no tienen acceso al financiamiento de la banca tradicional, para mejorar sus condiciones de vida al crear oportunidades de autoempleo, generación de ingresos y empleos. Opera mediante el Fideicomiso del Programa Nacional de Financiamiento al Microempresario (FINAFIM).",
							"Cultura Financiera", 19.440629904474186,
							-99.22382980585098),
					new ExploreSpeakerRowItem(
							"Financiera Rural",
							R.drawable.logo_financiera_rural,
							10,
							"Financiera Rural (antes conocida como el Banco Nacional de Crédito Rural (Banrural)) es una banca de desarrollo rural del Gobierno Federal que surge en el año 2003 en México con el objetivo de crear un sistema financiero rural eficiente que facilite el acceso al crédito y que contribuya al fortalecimiento de la agricultura, ganadería, así como de las diversas actividades vinculadas con el medio rural.",
							"Cultura Financiera", 19.440629904474186,
							-99.22382980585098),
					new ExploreSpeakerRowItem(
							"HSBC",
							R.drawable.logo_hsbc,
							11,
							"Grupo Financiero HSBC es una de las principales agrupaciones financieras y bancarias de México, con 1,066 sucursales, 6,201 cajeros automáticos, aproximadamente ocho millones y medio de cuentas de clientes y más de 18,500 empleados.",
							"Cultura Financiera", 19.440629904474186,
							-99.22382980585098),
					// new ExploreSpeakerRowItem("Credifiel", imageId, 12, "",
					// "Cultura Financiera",19.440629904474186,
					// -99.22382980585098),
					new ExploreSpeakerRowItem(
							"NR Finance",
							3,
							13,
							"NR Finance México, SA de CV, SOFOM, E.N.R. ofrece servicios de financiamiento para la adquisición de automóviles Nissan y Renault en México. La compañía ofrece una amplia gama de planes de financiación para varios vehículos, los planes de pago inicial bajo y entrega, y financiamientos corporativos y pre-aprobado para los clientes premium.",
							"Cultura Financiera", 19.440629904474186,
							-99.22382980585098),
					new ExploreSpeakerRowItem(
							"VISA",
							R.drawable.logo_visa,
							13,
							"Visa es la red comercial de pagos electrónicos más grande del mundo y es una de las marcas de servicios financieros globales más reconocidas en el ámbito internacional. Visa facilita el comercio global a través de la transferencia de valores e información entre instituciones financieras, comercios, consumidores, compañías y entidades gubernamentales.",
							"Cultura Financiera", 19.440629904474186,
							-99.22382980585098), },

			// Digital Enterprise
			new ExploreSpeakerRowItem[] {
					new ExploreSpeakerRowItem(
							"CableVisión",
							R.drawable.logo_cablevision,
							14,
							"Fundada en 1966, CABLEVISION® es hoy en día una de las proveedoras más grande de servicios de telecomunicación por cable en México. Actualmente, CABLEVISION® ofrece más de un millón de servicios de televisión digital por cable, telefonía digital e Internet de alta velocidad a través de una avanzada red propia de clase mundial y la más avanzada tecnología. Desde sus principios, CABLEVISION® se ha dedicado a encontrar nuevas tecnologías, nuevas soluciones y mejores opciones de entretenimiento y comunicación para mejorar la vida de sus clientes. Nuestra meta es ofrecer los mejores productos y servicios para conectar a nuestros usuarios con lo que es importante para ellos.",
							"Empresa Digital", 19.439681418740047,
							-99.22471091151237),
					new ExploreSpeakerRowItem(
							"Movistar",
							R.drawable.logo_movistar,
							15,
							"En Telefónica México somos líderes en la innovación de productos y servicios de telecomunicaciones, trabajando bajo la marca Movistar y Vivo, que unifica nuestras operaciones en 14 países de Latinoamérica y destaca por la calidad de servicio, mejora continua y cercanía con los usuarios. Desde nuestra llegada, nos hemos distinguido por impulsar el desarrollo de las telecomunicaciones, con productos y servicios de calidad, las más atractivas ofertas comerciales del mercado, cobertura nacional y la mejor atención al cliente. Tenemos más de 20.5 millones de clientes.",
							"Empresa Digital", 19.439681418740047,
							-99.22471091151237),
					new ExploreSpeakerRowItem(
							"Bimbo",
							4,
							16,
							"Fundado en México el año de 1945, Grupo Bimbo es hoy en día una de las empresas de panificación más importantes del mundo por posicionamiento de marca, por volumen de producción y ventas, además de ser líder indiscutible de su ramo en México y Latinoamérica. Con presencia en 17 países de América y Asia, cuenta con cerca de 7,000 productos y con más de 150 marcas de reconocido prestigio.",
							"Empresa Digital", 19.439681418740047,
							-99.22471091151237),
					new ExploreSpeakerRowItem(
							"Telmex",
							R.drawable.logo_telmex,
							17,
							"Telmex es la compañía líder de telecomunicaciones en América Latina, con operaciones en México, Argentina, Brasil, Colombia, Chile, Perú y Estados Unidos. Ha realizado inversiones sin precedente por unos 29 mil millones de dólares durante el periodo 1990-2005, para asegurar el crecimiento y la modernización de su infraestructura, desarrollando así una plataforma tecnológica 100% digital que opera una de las redes de fibra óptica más avanzadas a nivel mundial y que incluye conexiones vía cable submarino con 39 países.",
							"Empresa Digital", 19.439681418740047,
							-99.22471091151237),
					new ExploreSpeakerRowItem(
							"Google",
							R.drawable.logo_google,
							18,
							"El objetivo de Google consiste en organizar la información del mundo y hacerla accesible y útil de manera universal.",
							"Empresa Digital", 19.439681418740047,
							-99.22471091151237),

			},

			// Innovation
			new ExploreSpeakerRowItem[] {

			},

			// Digital Mexico
			new ExploreSpeakerRowItem[] {},

			// Move Mexico
			new ExploreSpeakerRowItem[] {
					new ExploreSpeakerRowItem(
							"STPS",
							5,
							19,
							"La Secretaría del Trabajo y Previsión Social, como dependencia del Poder Ejecutivo Federal, tiene a su cargo el desempeño de las facultades que le atribuyen la Ley Orgánica de la Administración Pública Federal, la Ley Federal del Trabajo, otras leyes y tratados, así como los reglamentos, decretos, acuerdos y órdenes del Presidente de la República.",
							"Red Mover a México", 19.438746838709726,
							-99.22531843185425),
					new ExploreSpeakerRowItem(
							"IMPI",
							22,
							20,
							"El Instituto Mexicano de la Propiedad Industrial es un Organismo público descentralizado con personalidad jurídica y patrimonio propio y con la autoridad legal para administrar el sistema de propiedad industrial en nuestro país.",
							"Red Mover a México", 19.438746838709726,
							-99.22531843185425),
					new ExploreSpeakerRowItem(
							"INAES",
							13,
							21,
							"El Instituto Nacional de Economía Social es un órgano administrativo desconcentrado de la Secretaría de Economía con autonomía técnica, operativa y de gestión, que tiene como finalidad instrumentar políticas de fomento al sector social de la economía a través de la participación, capacitación, difusión, investigación y apoyo a los proyectos productivos del sector.",
							"Red Mover a México", 19.438746838709726,
							-99.22531843185425),
					new ExploreSpeakerRowItem(
							"PROFECO",
							12,
							22,
							"La Procuraduría Federal del Consumidor (PROFECO) es una organización del gobierno de México, creada para proteger a los consumidores contra los abusos o fraudes por parte de las empresas que operan en México. Es un organismo público descentralizado México fue en la segunda nación de América Latina con una Ley Federal de Protección a los Consumidores.",
							"Red Mover a México", 19.438746838709726,
							-99.22531843185425),
					new ExploreSpeakerRowItem(
							"SEP",
							44,
							23,
							"Somos una instancia comprometida con la sociedad; que brinda servicios educativos y asistenciales a niños y niñas de 45 días a 5 años 11 meses de edad a través de tres modalidades de atención; con trabajo de equipo, personal profesional y autogestivo; evaluación constante y con la guía de nuestro código de ética: honestidad, responsabilidad, actitud de servicio e igualdad.La Dirección de Educación Inicial es una instancia que depende de la Dirección General de Operación de Servicios Educativos en el Distrito Federal, de la Administración Federal de Servicios Educativos en el Distrito Federal, y a su vez, de la Secretaría de Educación Pública.",
							"Red Mover a México", 19.438746838709726,
							-99.22531843185425),
					new ExploreSpeakerRowItem(
							"IMJUVE",
							6,
							24,
							"El Instituto Mexicano de la Juventud (IMJUVE), es una dependencia del Gobierno Federal, cuyo trabajo es hacer políticas públicas a favor de los jóvenes mexicanos para otorgarles las herramientas necesarias en educación, salud, empleo y participación social.",
							"Red Mover a México", 19.438746838709726,
							-99.22531843185425),
					new ExploreSpeakerRowItem(
							"COFEMER",
							43,
							25,
							"La Comisión Federal de Mejora Regulatoria (COFEMER) es un órgano administrativo desconcentrado, con autonomía técnica y operativa, sectorizado a la Secretaría de Economía del Gobierno Federal de México. La COFEMER fue creada en el año 2000 mediante reformas a la Ley Federal de Procedimiento Administrativo. El mandato de la COFEMER es promover la transparencia en la elaboración y aplicación de las regulaciones y que éstas generen beneficios superiores a sus costos y el máximo beneficio para la sociedad.",
							"Red Mover a México", 19.438746838709726,
							-99.22531843185425),
					new ExploreSpeakerRowItem(
							"FEDEX",
							R.drawable.logo_fedex,
							26,
							"FedEx es la línea aérea de carga más grande del mundo, con 643 centros de operaciones para su flota aérea en más de 220 países y territorios. Sus 46 centrales telefónicas alrededor del mundo procesan más de 500,000 llamadas de teléfono por día. FedEx emplea a más de 148,000 personas, entre ellas, 43,500 mensajeros que entregan más de 3.1 millones de paquetes cada día laborable del año.",
							"Red Mover a México", 19.438746838709726,
							-99.22531843185425),
					new ExploreSpeakerRowItem(
							"Manpower",
							R.drawable.logo_manpower,
							27,
							"Manpower es una empresa que brinda servicios de recursos humanos que contemplan todo el ciclo del empleo desde búsqueda y selección de personal permanente, eventual o por proyecto; evaluación y selección de empleados; capacitación; reinserción laboral; tercerización y consultoría.",
							"Red Mover a México", 19.438746838709726,
							-99.22531843185425),
					new ExploreSpeakerRowItem(
							"PEMEX",
							R.drawable.logo_pemex,
							28,
							"Pemex es la compañía estatal encargada de administrar la exploración, explotación y ventas del petróleo, siendo la mayor empresa de México. Fue la mayor compañía Latinoaméricana hasta mediados del 2009. Pemex tiene ventas superiores a los 106.000 millones USD al año, una cifra incluso superior al PIB anual de algunos de los países de Latinoamérica.",
							"Red Mover a México", 19.438746838709726,
							-99.22531843185425),

			},
			// Strategic sectors
			new ExploreSpeakerRowItem[] {
			// new ExploreSpeakerRowItem(title,
			// imageId, id, description, "Sectores Estratégicos",
			// 19.441028266829942, -99.22301173210144),
			} };

	/*
	 * LECTURES
	 */
	public static final MainAgendaRowItem[][] events = {

			/*
			 * DAY 1
			 */
			new MainAgendaRowItem[] {
					new MainAgendaRowItem(
							"Google Maps: deja que tus clientes te encuentren en el mapa",
							"Tus clientes ya te están buscando, deja que te encuentren poniendo a tu negocio en el mapa. Presencia en Google Maps, con información detallada de su empresa en la plataforma. Esto da oportunidad de utilizar otras plataformas de Google para su negocio.",
							new String[] { "Octavio Cisneros" },
							new String[] { "Google" }, new int[] {}, 0,
							"15:00", "16:00",
							"Palacio de la Canal 11 - Google",
							ECOSYSTEM_DIGITAL_ENTERPRISE, 0),
					new MainAgendaRowItem(
							"El flujo de efectivo: Negocios PyMEs",
							"Evaluar la conveniencia de aplicar estrategias para mejorar el manejo del flujo de efectivo, que involucran acciones que le permitan administrar y favorecer la solvencia económica de su negocio o proyecto de negocio.",
							new String[] { "Lic. María Inglaterra Islas Borboa" },
							new String[] { "BBVA BANCOMER" }, new int[] {}, 0,
							"15:00", "16:00",
							"Palacio de la Canal 2 - BBVA Bancomer",
							ECOSYSTEM_FINANCIAL_CULTURE, 1),
					new MainAgendaRowItem(
							"La inversión de impacto: nueva fuente de financiamiento a MIPYMES",
							"Presentar a los asistentes opciones de financiamiento a programas de MIPYMES. Los emprendedores conocerán de la existencia de fuentes de financiamiento para apoyar programas de emprendedores viables.",
							new String[] { "Mtro. Emilio Illanes Díaz Rivera" },
							new String[] { "COLCAMI - Consorcio Latinoamericano para Capacitación en Microfinanciamiento S.C." },
							new int[] {}, 0, "15:00", "16:00",
							"Sala Naranja - Cultura Financiera", 2, 2),
					new MainAgendaRowItem(
							"Taller de creatividad e innovación de negocios",
							"Mediante dinámicas de juego serio como LEGO Serious Play, los asistentes aprenderán a identificar, generar y evaluar oportunidades de negocio rentables. Aprenderán también a innovar propuestas de valor y modelos de negocio. Al finalizar, se llevarán un lienzo con el modelo de negocio (Business Model Canvas) y al cierre de la Semana se premiarán los proyectos más innovadores.",
							new String[] { "Ing. Arturo Salcedo Cárabez, MBA" },
							new String[] { "CITRUS Innovation" }, new int[] {},
							0, "15:00", "18:00",
							"Taller - Ecosistema Innovación", 4, 3),
					new MainAgendaRowItem(
							"La neurociencia de la innovación",
							"Los asistentes recibirán consejos y métodos prácticos que pueden utilizar para generar ideas en ellos mismos o con sus empleados. En esta conferencia se presentará un resumen de los descubrimientos más recientes de la ciencia del cerebro en el área de la creatividad y la innovación.",
							new String[] { "Dr. Leo Hendrik Reyes Lozano" },
							new String[] { "Intel" }, new int[] {}, 0, "15:30",
							"17:00", "Auditorio - Ecosistema Innovación", 4, 4),
					new MainAgendaRowItem(
							"Wayra México presenta 10 proyectos innovadores de su segunda generación",
							"Emprendedores recién graduados de la segunda generación de Wayra realizarán sus pitches ante el auditorio. Podrán identificar diferentes maneras de cómo realizar un pitch donde se resuma adecuadamente en 7 minutos lo que hace cada proyecto.",
							new String[] { "Marcus Dantus" },
							new String[] { "Demo Day Wayra México - Telefónica" },
							new int[] {}, 0, "15:30", "17:00",
							"Palacio de Iturbide 2 - Eventos Especiales 2",
							ECOSYSTEM_ENTREPRENEUR_CAMP, 5),
					new MainAgendaRowItem(
							"La importancia del diseño para los productos de exportación",
							"En el mercado internacional es imperativo lograr una diferenciación de los productos, por ello la importancia del diseño en la actividad exportadora.",
							new String[] { "Lic. Enrique Ponce de León" },
							new String[] { "Centro Promotor de Diseño" },
							new int[] {}, 0, "15:30", "16:30",
							"Palacio de la Canal 1 - Alianzas Globales",
							ECOSYSTEM_GLOBAL_ALLIANCES, 6),
					new MainAgendaRowItem(
							"Secretos para ser un gran emprendedor",
							"Se mostrará cómo llevar una empresa de cero a millones en ventas: Consejos de un mexicano que lo ha hecho varias veces de forma muy éxitosa desde que estaba en la Universidad.",
							new String[] { "Pablo Hernandez O ´Hagan" },
							new String[] { "Ingenia Group" }, new int[] {}, 0,
							"15:30", "17:00",
							"Palacio de la Canal 5 - Red Mover a México", 6, 7),
					new MainAgendaRowItem(
							"Factura electrónica CFDI: eficiencia 360 °",
							"Impactos y ventajas de la ddopción de factura electrónica.",
							new String[] { "Lic. Nelly V. Maldonado González" },
							new String[] { "Asociación Mexicana de Proveedores Autorizados de Certificación, AMEXIPAC, A.C." },
							new int[] {}, 0, "15:30", "17:00",
							"Palacio de la Canal 6 - Empresa Digital", 3, 8),
					new MainAgendaRowItem(
							"Casos de éxito de pensamiento lateral",
							"El pensamiento lateral o Design Thinking, es una herramienta que cuando es bien manejada como parte de un proceso de trabajo colectivo e interdisciplinario, genera resultados de alto impacto ya sea para impulsar cambios culturales, mover economías, o mejorar la calidad de vida de la gente.",
							new String[] { "Luis Herrera Rojas" },
							new String[] { "MBLM + Premio Quórum" },
							new int[] {}, 0, "15:30", "17:00",
							"Palacio de la Canal 8 - Innovación", 4, 9),
					new MainAgendaRowItem(
							"Calidad en el servicio: Entender y atender las necesidades de nuestros clientes",
							"Se trata de un Taller vivencial, en el cual a través de dinámicas grupales y juegos de roles, se podrá apreciar la importancia de entender y atender al cliente. Se seguirán reglas de oro para el servicio efectivo y el alto impacto en la interacción cliente - proveedor.",
							new String[] { "Jaime Neftali Martínez Hernández" },
							new String[] { "TK Desarrollo Profesional Integral" },
							new int[] {}, 0, "15:30", "16:30",
							"Palacio de la Canal 9 - Campamento Emprendedor",
							1, 10),
					new MainAgendaRowItem(
							"La participación de Financiera Rural en proyectos rurales no tradicionales",
							"Dar a conocer los nuevos esquemas de financiamiento de la Financiera Rural cuyo objetivo es contribuir entre otros, a mejorar la rentabilidad de sus empresas en sus diversas etapas de la cadena productiva, así como dar a conocer las estrategias para financiar proyectos que desarrollen innovación tecnológica, relacionados con la producción de nuevos insumos para bioenergéticas, el uso eficiente y sustentable de la energía en sus procesos, así como cualquier inversión relacionada con la innovación tecnológica en el sector agropecuario.",
							new String[] { "Ing. Carlos A. Treviño Medina" },
							new String[] { "Financiera Rural" }, new int[] {},
							0, "16:00", "17:00",
							"Palacio de la Canal 10 - Streaming",
							ECOSYSTEM_STRATEGIC_SECTORS, 11),
					new MainAgendaRowItem(
							"La nube puede transformar tu negocio",
							"Introducción a las tendencias de tecnología en la nube y como los negocios pueden ser más eficientes y seguros. Hablaremos de como usar herramientas de colaboración y la infraestructura de aplicaciones en la nube para hacer más eficiente a tu negocio.",
							new String[] { "Carlos Restrepo" },
							new String[] { "Google" }, new int[] {}, 0,
							"16:00", "17:00",
							"Palacio de la Canal 11 - Google",
							ECOSYSTEM_DIGITAL_ENTERPRISE, 12),
					new MainAgendaRowItem(
							"Negocios PyMEs: El crédito",
							"Evaluar la conveniencia de adquirir un crédito para tu negocio con base en las necesidades de éste, a partir de las cuales diseñarás una estrategia a seguir para favorecer el pago puntual del crédito elegido sin poner en riesgo las finanzas del negocio.",
							new String[] { "Lic. Cuauhtémoc Escorcia Reyes" },
							new String[] { "BBVA BANCOMER" }, new int[] {}, 0,
							"16:00", "18:00",
							"Palacio de la Canal 2 - BBVA Bancomer",
							ECOSYSTEM_FINANCIAL_CULTURE, 13),
					new MainAgendaRowItem(
							"Modelo de innovación abierta para el sector automotriz",
							"Promueve la generación de valor para el Sector Automotriz, basado en un concepto de innovación abierta donde las empresas mejorarán su competitividad por medio de la cooperación.",
							new String[] { "M. Ricardo López Robles" },
							new String[] { "AIC-Automotive Intelligence Center" },
							new int[] {},
							0,
							"16:00",
							"17:00",
							"Palacio de la Canal 7 - Sectores Estratégicos y Competitividad Regional",
							7, 14),
					new MainAgendaRowItem(
							"Finanzas para emprendedores: una radiografía de ti para tu negocio",
							"Cómo estoy yo, estará mi negocio: Bajo esta premisa, la conferencia busca centrar la atención de los asistentes en el manejo de sus finanzas personales, el uso de los servicios financieros y la relación que mantiene con las instituciones. Los esfuerzos para procurar la salud financiera en nuestras finanzas, se traducirán en las de los negocios.",
							new String[] { "Lic. Alejandro Zamora" },
							new String[] { "Museo Interactivo de Economía (MIDE)" },
							new int[] {}, 0, "16:00", "17:00",
							"Sala Morada - Cultura Financiera", 2, 15),
					new MainAgendaRowItem(
							"Fútbol Financiero",
							"Fútbol Financiero es un juego interactivo para computadora diseñado para que los jóvenes - adultos contemporáneos conozcan los distintos temas financieros a los que se enfrentarán como adultos jóvenes. Combina el deporte con una guía de estudio sobre conceptos básicos de finanzas personales.",
							new String[] { "Taller" },
							new String[] { "Visa México" }, new int[] {}, 0,
							"16:00", "17:30",
							"Sala Naranja - Cultura Financiera", 2, 16),
					new MainAgendaRowItem(
							"Travesía línea de vida",
							"Narra sus ascensos a algunas de las montañas más altas de nuestro planeta, mientras nos incita a reflexionar sobre las fuerzas que nos permiten alcanzar las metas más elevadas. Resaltando el poder de una filosofía clara (misión, visión y valores), de objetivos definidos y compartidos (visualización objetiva), de una planeación realista y una ejecución impecable, Carlos invita al auditori0 a ver a la montaña como un símbolo de reto humano en el que pueden identificar sus metas empresariales y personales.",
							new String[] { "Carlos Carsolio" },
							new String[] { "Explorador, Alpinista, Conferencista, Empresario, Piloto de Parapente y Padre "
									+ "de Familia. Nace en México en 1962. En la escalada vertical de “Gran Pared” se "
									+ "especializó en la apertura de nuevas rutas durante 15 años. Se convirtió en 1996 "
									+ "en el primer alpinista no europeo, y el cuarto en la historia, en escalar las "
									+ "catorce montañas más altas del planeta sin tanques de oxígeno." },
							new int[] { R.drawable.speaker_carlos_carsolio },
							0, "16:00", "17:30", "Valparaiso 3 - Magistrales",
							8, 17),
					new MainAgendaRowItem(
							"Identidad de marca: Aprende estrategias para diferenciarte de los demás",
							"Cómo una buena identidad potencializa y diferencia tu negocio. Las reglas del branding. Mini manual de los 10 pasos que debes tomar en cuenta para construir una identidad poderosa. ",
							new String[] { "Rebeca Castro y Thaina Garza" },
							new String[] { "Branding Boutique" }, new int[] {},
							0, "16:30", "18:00",
							"Palacio de la Canal 4 - Streaming",
							ECOSYSTEM_ENTREPRENEUR_CAMP, 18),
					new MainAgendaRowItem(
							"5 Estrategias ganadoras para construir valor en tu negocio",
							"Revisar con emprendedores y empresarios cómo los cambios tecnológicos y sociales están influyendo en la manera tradicional de hacer negocios, y cómo pueden construir una mejor propuesta de valor a través de cinco estrategias ganadoras de fácil aplicación en sus empresas.",
							new String[] { "Enrique de J. Gómez - Gordillo Ruelas" },
							new String[] { "Consultor en Mercadotecnia y Ventas" },
							new int[] {}, 0, "17:00", "19:00",
							"Palacio de Iturbide 2 - Eventos Especiales 2",
							ECOSYSTEM_STRATEGIC_SECTORS, 19),
					new MainAgendaRowItem(
							"Apoyos de organizaciones del sector privado a las empresas exportadoras",
							"Las Pequeñas y Medianas Empresas conocerán las alternativas que ofrecen las Organizaciones del sector privado en lo que respecta a la internacionalización de su empresa.",
							new String[] { "Lic. Luis Enrique Zavala G. y Lic.Fernando Ruiz H." },
							new String[] { "ANIERM / COMCE" }, new int[] {}, 0,
							"17:00", "18:30",
							"Palacio de la Canal 1 - Alianzas Globales", 0, 20),
					new MainAgendaRowItem(
							"Visibilidad e impacto para tu negocio en internet con Adwords Express",
							"Como sacarle el máximo provecho a Google y la publicidad digital, para poner tu negocio en la mira de tus clientes. Ahora más fácil que nunca.",
							new String[] { "Jorge Gutiérrez Luthe" },
							new String[] { "Google" }, new int[] {}, 0,
							"17:00", "18:00",
							"Palacio de la Canal 11 - Google",
							ECOSYSTEM_DIGITAL_ENTERPRISE, 21),
					new MainAgendaRowItem(
							"Es momento de trascender",
							"Se presentarán aspectos clave para las Pymes que requieren nuevas herramientas y estrategias para competir de manera más productiva en su mercado y en la evaluación de nuevos mercados, así como, oportunidades de expansión.",
							new String[] { "Ing. Héctor F. Alcázar Córdova" },
							new String[] { "Invoption" }, new int[] {}, 0,
							"17:00", "19:00",
							"Palacio de la Canal 5 - Red Mover a México", 6, 22),
					new MainAgendaRowItem(
							"Fundamentos de la filosofía emprendedora",
							"Se ofrecerán los fundamentos de la filosofía emprendedora y un ejercicio de autodiagnóstico para autoevaluarse con base en la teoría expuesta e identificar el nivel de madurez del emprendedor.",
							new String[] { "María de los Ángeles Quiroz Guzmán" },
							new String[] { "Eurosoft" }, new int[] {}, 0,
							"17:00", "18:00",
							"Palacio de la Canal 9 - Campamento Emprendedor",
							1, 23),
					new MainAgendaRowItem(
							"Innovación en la chocolatería: el caso de Que Bo",
							"El chef José Ramón Castillo hablará de la innovación en la la industria del cacao mexicano.",
							new String[] { "Maestro Chocolatero José Ramón Castillo" },
							new String[] { "Que Bo! Chocolateria Mexicana Evolutiva" },
							new int[] {}, 0, "17:30", "19:00",
							"Auditorio - Ecosistema Innovación", 4, 24),
					new MainAgendaRowItem(
							"La evolución de las MIPyMEs en la industria aeronáutica en el Mundo",
							"Presentar una visión inicial del esfuerzo que se requiere para emprender actividades y colaboración para el sector aeronáutico.",
							new String[] { "Ing. Jorge Gutiérrez de Velasco Rodríguez" },
							new String[] { "Universidad Aeronáutica en Querétaro (UNAQ)" },
							new int[] {},
							0,
							"17:30",
							"18:30",
							"Palacio de la Canal 7 - Sectores Estratégicos y Competitividad Regional",
							7, 25),
					new MainAgendaRowItem(
							"La experiencia en el desarrollo y lanzamiento del Vuhl 05",
							"Los creadores de Vuhl 05 compartirán su experiencia en el proceso de diseño y lanzamiento de este auto, cuyo nombre se debe a las siglas de Vehicles of Ultra High-performance and Lightweight. Este auto es el resultado del trabajo de los hermanos Guillermo e Iker Echeverría y Alberto Chapa, tres emprendedores que fundaron la empresa EXTE Diseño en México D.F., responsable exclusiva del diseño exterior e interior del 05.",
							new String[] { "Guillermo Echeverría Miller" },
							new String[] { "Guillermo Echeverría Miller es un emprendedor de 32 años, propietario "
									+ "de la empresa ETXE Diseño. Hace unas semanas lanzó su primer auto: el Vuhi 05, "
									+ "un modelo de dos plazas, deportivo y ultraligero que costará entre 90.000 "
									+ "y 100,000 dólares. También ofrece consultoría de diseño e ingeniería avanzada "
									+ "de nuevos productos y tecnologías." },
							new int[] { R.drawable.speaker_guillermo_echeverria },
							0, "17:30", "19:00", "Valparaiso 3 - Magistrales",
							8, 26),
					new MainAgendaRowItem(
							"Emprendimiento inteligente con Google Analytics",
							"Entiende el comportamiento de tus clientes en tu sitio web. Optimízalo y toma decisiones de negocio utilizando información valiosa en tiempo real. ",
							new String[] { "Jorge Ezquerro" },
							new String[] { "Google" }, new int[] {}, 0,
							"18:00", "19:00",
							"Palacio de la Canal 11 - Google",
							ECOSYSTEM_DIGITAL_ENTERPRISE, 27),
					new MainAgendaRowItem(
							"El mercado femenino y su rentabilidad en México",
							"Las ventajas y áreas de oportunidad que representa el mercado femenino mexicano y cómo capitalizarlo. Booklet con insights relevantes de las mujeres mexicanas.",
							new String[] { "Rebeca Castro y Thaina Garza" },
							new String[] { "Branding Boutique" }, new int[] {},
							0, "18:00", "19:30",
							"Palacio de la Canal 4 - Streaming",
							ECOSYSTEM_MOVE_MEXICO, 28) },

			/*
			 * DAY 2
			 */
			new MainAgendaRowItem[] {
					new MainAgendaRowItem(
							"Cómo promocionar eficientemente su producto o servicio",
							"Conocimientos y experiencia sobre la importancia de la mercadotecnia como una herramienta eficaz para el negocio. ",
							new String[] { "M.A. Juan Carlos Cabrera López" },
							new String[] { "Nacional Financiera, S.N.C." },
							new int[] {},
							1,
							"09:00",
							"11:00",
							"Palacio de la Canal 3 - Cultura Financiera y Alto Impacto",
							2, 29),
					new MainAgendaRowItem(
							"El emprendimiento y la innovación en la UNAM",
							"Dará a conocer cómo se trabaja en la UNAM para acelerar y fortalecer los programas de incubación en el apoyo, creación y desarrollo de nuevas empresas. Fomentar la cultura del emprendimiento en la sociedad. Acercar a posibles inversionistas a los desarrollos científicos y tecnológicos más exitosos con potencial de ser transferidos al mercado.",
							new String[] { "Mtro. Juan Manuel Romero Ortega" },
							new String[] { "UNAM" }, new int[] {}, 1, "10:00",
							"11:00", "Auditorio - Ecosistema Innovación", 4, 30),
					new MainAgendaRowItem(
							"Exportar a China  ¿Es tu opción? Decídete",
							"Conocer acerca de los requisitos que tienen que cumplir los productos para ser exportados a China y estrategias para introducirse en el mercado chino.",
							new String[] { "Lic. Ricardo Antonio Vaca Uribe" },
							new String[] { "Cámara de Comercio y Tecnología China en México " },
							new int[] {}, 1, "10:00", "12:30",
							"Palacio de la Canal 1 - Alianzas Globales", 0, 31),
					new MainAgendaRowItem(
							"Visibilidad e impacto para tu negocio en internet con Adwords Express",
							" ¿Alguna vez has querido anunciar tu negocio en internet, pero no quieres pasar horas entendiendo y configurando una campaña? Con AdWords Express, nosotros nos encargamos de tu publicidad mientras que tu te encargas de tu negocio.",
							new String[] { "Jorge Gutiérrez Luthe" },
							new String[] { "Google" }, new int[] {}, 1,
							"10:00", "11:00",
							"Palacio de la Canal 11 - Google",
							ECOSYSTEM_DIGITAL_ENTERPRISE, 32),
					new MainAgendaRowItem(
							"Acelera tu crecimiento",
							"Conocer la visión y oportunidades que ven distintas aceleradoras para mujeres emprendedoras en México. Al terminar se conocerá cómo se puede participar con distintas aceleradoras y cuáles son los factores clave de éxito para emprendedoras.",
							new String[] { "Moderadora: Guadalupe Castañeda" },
							new String[] { "Ernst&Young" }, new int[] {}, 1,
							"10:00", "11:30",
							"Palacio de la Canal 5 - Red Mover a México", 6, 33),
					new MainAgendaRowItem(
							"La industria aeroespacial en México",
							"Presentar a la Industria Aeroespacial Mexicana y su plan nacional estratégico para los próximos 7 años.",
							new String[] { "Lic. Carlos J. Bello Roch" },
							new String[] { "Federación Méxicana de la Industria Aeroespacial, A.C." },
							new int[] {},
							1,
							"10:00",
							"11:30",
							"Palacio de la Canal 7 - Sectores Estratégicos y Competitividad Regional",
							7, 34),
					new MainAgendaRowItem(
							"La inspiración como motor de la creación",
							"A través de un modelo de colaboración basado en 7 empresas mexicanas, COCOLAB desarrolla proyectos artísticos, culturales y de entretenimiento basados en tecnología en donde la innovación es parte fundamental de cada nuevo proyecto. La innovación radica en el desarrollo tecnológico de software en bases a las necesidades creativas de la agencia y de los clientes. Se llevarán como aportación una metodología para realizar proyectos.",
							new String[] { "Cocolab" }, new String[] { "" },
							new int[] {}, 1, "10:00", "11:00",
							"Palacio de la Canal 8 - Innovación", 4, 35),
					new MainAgendaRowItem(
							"Atrévete a soñar: 5 claves para construir tu idea de negocio",
							"El emprendedor sabrá que riesgos corre al emprender y recibirá 5 consejos que le ayudarán a diseñar su idea de negocio para tener mejores probabilidades de éxito.",
							new String[] { "Gonzalo Abascal Olascoaga" },
							new String[] { "Linko S.A. de C.V." },
							new int[] {}, 1, "10:00", "11:00",
							"Palacio de la Canal 9 - Campamento Emprendedor",
							1, 36),
					new MainAgendaRowItem(
							"Taller de creatividad e innovación de negocios",
							"Mediante dinámicas de juego serio como LEGO Serious Play, los asistentes aprenderán a identificar, generar y evaluar oportunidades de negocio rentables. Aprenderán también a innovar propuestas de valor y modelos de negocio. Al finalizar, se llevarán un lienzo con el modelo de negocio (Business Model Canvas) y al cierre de la Semana se premiarán los proyectos más innovadores.",
							new String[] { "Ing. Arturo Salcedo Cárabez, MBA" },
							new String[] { "CITRUS Innovation" }, new int[] {},
							1, "10:00", "14:00",
							"Taller - Ecosistema Innovación", 4, 37),
					new MainAgendaRowItem(
							"3D Robotics: como desarrollar una empresa mediante las nuevas tecnologías",
							"La historia de éxito un joven emprendedor en el área de la tecnología y la robótica a nivel mundial.",
							new String[] { "Jordi Muñoz Bardales" },
							new String[] { "3D Robotics" }, new int[] {}, 1,
							"11:00", "12:30",
							"Auditorio - Ecosistema Innovación", 4, 38),
					new MainAgendaRowItem(
							"Muestra tu negocio al mundo: en el mapa de la era digital",
							"Tus clientes ya te están buscando. Deja que te encuentren poniendo a tu negocio en el mapa de la era digital, con información detallada de su empresa, conoce la oportunidad de utilizar otras plataformas de Google para sus negocios.",
							new String[] { "Octavio Cisneros" },
							new String[] { "Goolge" }, new int[] {}, 1,
							"11:00", "12:00",
							"Palacio de la Canal 11 - Google",
							ECOSYSTEM_DIGITAL_ENTERPRISE, 39),
					new MainAgendaRowItem(
							"Negocios PyMEs: El crédito",
							"Evaluar la conveniencia de adquirir un crédito para tu negocio con base en las necesidades de éste, a partir de las cuales diseñarás una estrategia a seguir para favorecer el pago puntual del crédito elegido sin poner en riesgo las finanzas del negocio.",
							new String[] { "Lic. María Inglaterra Islas Borboa " },
							new String[] { "BBVA BANCOMER" }, new int[] {}, 1,
							"11:00", "13:00",
							"Palacio de la Canal 2 - BBVA Bancomer",
							ECOSYSTEM_FINANCIAL_CULTURE, 40),
					new MainAgendaRowItem(
							"Democratizando el acceso al capital emprendedor",
							"Alternativas en levantamiento de capital emprendedor para empresas en etapas tempranas.",
							new String[] { "José Villatoro Lacouture" },
							new String[] { "Crowdfunder México" },
							new int[] {},
							1,
							"11:00",
							"12:00",
							"Palacio de la Canal 3 - Cultura Financiera y Alto Impacto",
							2, 41),
					new MainAgendaRowItem(
							"Ciudad mural",
							"Sensibilizar para convertir problemáticas de nuestro país en oportunidades de transformación social y de sanación de comunidades utilizando el diseño y el trabajo en comunidad como herramienta de cohesión. Además de establecer un vínculo entre ciudadanía propositiva y zonas de conflicto dentro la propia ciudad.",
							new String[] { "Colectivo Tomate" },
							new String[] { "" }, new int[] {}, 1, "11:00",
							"12:00", "Palacio de la Canal 8 - Innovación", 4,
							42),
					new MainAgendaRowItem(
							"Cuenta cuentos los vengadores: salvar el día",
							"Comic para fomentar la educación financiera. Con la combinación de los personajes icónicos de Marvel, incluidos los Vengadores y Spiderman, así como la experiencia en educación financiera de Visa, se presenta un original cómic.",
							new String[] { "Cuenta Cuentos " },
							new String[] { "Visa México" }, new int[] {}, 1,
							"11:00", "12:00", "Pasarela - Cultura Financiera",
							2, 43),
					new MainAgendaRowItem(
							"Planeando el emprendurismo",
							"Exponer la importancia de realizar un ejercicio de planeación antes de iniciar cualquier proyecto como condición para valorar sus posibilidades de éxito. Establecer un orden en las ideas del emprendedor.",
							new String[] { "L.C.P. Ma. Elena Pérez Muñoz" },
							new String[] { "Consorcio Latinoamericano para Capacitación en Microfinanciamiento, COLCAMI S.C." },
							new int[] {}, 1, "11:00", "12:00",
							"Sala Morada - Cultura Financiera", 2, 44),
					new MainAgendaRowItem(
							"Perspectivas de la Economía Mexicana",
							"Análisis para entender  la política económica, la coyuntura y las perspectivas económicas de México mediante el uso adecuado de los indicadores económicos disponibles.",
							new String[] { "Dr. Jonathan Heath" },
							new String[] { "Jonathan Heath tiene acumulado 30 años de experiencia en el análisis de la economía "
									+ "mexicana y sus perspectivas, tiempo durante el cual fue el Economista Principal de "
									+ "México para varias instituciones financieras globales y consultorías internacionales."
									+ "Empezó su carrera profesional construyendo modelos macro econométricos para el gobierno "
									+ "mexicano y Wharton Econometrics" },
							new int[] { R.drawable.speaker_jonathan_heath }, 1,
							"11:00", "12:30", "Valparaiso 3 - Magistrales", 8,
							45),
					new MainAgendaRowItem(
							"Estrategia para que México sea potencia económica - tecnológico industrial - en el siglo XXI",
							"Se presentarán diversas alternativas para que nuestro país pueda convertirse en una economía en desarrollo mediante la modernización de su base industrial incorporando tecnología de vanguardia. ",
							new String[] { "Dr. Alberto Montoya Martín del Campo" },
							new String[] { "Colegio Nacional de Economistas" },
							new int[] {},
							1,
							"11:30",
							"13:00",
							"Palacio de la Canal 7 - Sectores Estratégicos y Competitividad Regional",
							7, 46),
					new MainAgendaRowItem(
							"Cómo presentar a inversionistas: Taller de Pitching",
							"Presentará las herramientas necesarias para presentar un Plan de Negocios ante inversionistas.",
							new String[] { "Marcus Dantus" },
							new String[] { "Wayra de México" }, new int[] {},
							1, "11:30", "12:30",
							"Palacio de la Canal 9 - Campamento Emprendedor",
							1, 47),
					new MainAgendaRowItem(
							"Crea la página web de tu negocio:  ¿cómo y por qué?",
							"Queremos que tu negocio este en internet. Alcance, impacto y nuevos clientes son solo algunos de los beneficios. Es gratis y no necesitas conocimientos técnicos. No tienes excusa.",
							new String[] { "Eila Lifflander" },
							new String[] { "Jimdo" }, new int[] {}, 1, "12:00",
							"13:00", "Palacio de la Canal 11 - Google",
							ECOSYSTEM_DIGITAL_ENTERPRISE, 48),
					new MainAgendaRowItem(
							"Es momento de trascender",
							"Se presentarán aspectos clave para las Pymes que requieren nuevas herramientas y estrategias para competir de manera más productiva en su mercado y en la evaluación de nuevos mercados, así como, oportunidades de expansión.",
							new String[] { "Ing. Héctor F. Alcázar Córdova" },
							new String[] { "Invoption" }, new int[] {}, 1,
							"12:00", "13:30",
							"Palacio de la Canal 5 - Red Mover a México", 6, 49),
					new MainAgendaRowItem(
							"Mexico design net",
							"Generación de proyectos para vivir mejor en la ciudad: buenas prácticas sostenibles como innovación.",
							new String[] { "Mtro. Ricardo Salas " },
							new String[] { "Universidad Anáhuac" },
							new int[] {}, 1, "12:00", "13:00",
							"Palacio de la Canal 8 - Innovación", 4, 50),
					new MainAgendaRowItem(
							"El lado humano del servicio: trata a tus clientes como quieren ser tratados",
							"Los participantes desarrollarán un modelo de servicio acorde a las necesidades de los clientes y basado en el desarrollo personal y profesional de las personas que lo brindan, con la finalidad de lograr incrementar la satisfacción y la fidelidad de los clientes.",
							new String[] { "Mtra. Norma Arellano Uribe" },
							new String[] { "Consorcio Latinoamericano para Capacitación en Microfinanciamiento, COLCAMI S.C." },
							new int[] {}, 1, "12:00", "13:00",
							"Pasarela - Cultura Financiera", 2, 51),
					new MainAgendaRowItem(
							"Fútbol Financiero",
							"Fútbol Financiero es un juego interactivo para computadora diseñado para que los jóvenes - adultos contemporáneos conozcan los distintos temas financieros a los que se enfrentarán como adultos jóvenes. Combina el deporte con una guía de estudio sobre conceptos básicos de finanzas personales.",
							new String[] { "Taller" },
							new String[] { "Visa México" }, new int[] {}, 1,
							"12:00", "13:00",
							"Sala Naranja - Cultura Financiera", 2, 52),
					new MainAgendaRowItem(
							"Innovando con diseño",
							"Hablará sobre casos de éxito de empresas que han sido exitosas a traves de la innovación con diseño. Resaltará la importancia de competir con innovación, creativad y diseño.",
							new String[] { "Julio Frías" },
							new String[] { "ITESM" }, new int[] {}, 1, "12:30",
							"14:00", "Auditorio - Ecosistema Innovación", 4, 53),
					new MainAgendaRowItem(
							"La Nube como agente de transformación en los negocios",
							"Conocimiento de valor sobre las aplicaciones empresariales que viven en la nube y la oportunidad que representan.",
							new String[] { "Ing. Jorge Molina" },
							new String[] { "Con más de 15 años de experiencia trabajando en "
									+ "Industrias de la Información, Jorge está a cargo del área de Google Enterprise, "
									+ "con productos como Google Apps, Google Search, Google Maps y Google Earth para "
									+ "empresas. Antes de unirse a Google, fue Gerente regional de Verity y Socio "
									+ "Fundador de Digital Data S.A. Actualmente es mentor del equipo de robótica de "
									+ "la Universidad Panamericana." },
							new int[] { R.drawable.speaker_jorge_molina }, 1,
							"12:30", "14:30", "Valparaiso 3 - Magistrales", 8,
							54),
					new MainAgendaRowItem(
							"Créditos Financieros para la PYME exportadora",
							"Descripción sobre los apoyos de Bancomext a las PyMEs exportadoras e importadoras. Conocer las diferentes opciones con las que cuenta una PyME para hacer más sencillo su proceso de internacionalización.",
							new String[] { "Lic. Fernando Hoyo Oliver" },
							new String[] { "Banco Nacional de Comercio Exterior, S.N.C. (BANCOMEXT)" },
							new int[] {}, 1, "13:00", "15:30",
							"Palacio de la Canal 1 - Alianzas Globales", 0, 55),
					new MainAgendaRowItem(
							"El caso Quicksilver: cómo una empresa mexicana se incrusta en el sector aeronáutico con propiedad intelectual y marca reconocida propios",
							"Expone cómo un proyecto de emprendurismo que tenía como objetivo atraer una empresa aeronáutica a Jalisco para manufactura, presenta la inesperada oportunidad de poder adquirir una empresa norteamericana de prestigio y con propiedad intelectual. El resultado es que México cuenta hoy con una empresa que diseña, manufactura y comercializa aviones ligeros y deportivos en los mercados mundiales. ",
							new String[] { "Ingeniero Guillermo Escutia" },
							new String[] { "Flying Spirit Aircraft SAPI de CV" },
							new int[] {}, 1, "13:00", "15:00",
							"Palacio de la Canal 10 - Streaming",
							ECOSYSTEM_STRATEGIC_SECTORS, 56),
					new MainAgendaRowItem(
							"10 estrategias para crear campañas digitales efectivas",
							"Comprende 10 estrategias sencillas pero poderosas, que van desde el uso del mailing, redes sociales especialmente con facebook para poder segmentar de forma muy precisa tu mercado objetivo a muy bajo costo, apoyándote de a su vez de otras redes sociales como youtube, pinteret y linkedin. ",
							new String[] { "Mtro. Virgilio Serrano Vera" },
							new String[] { "BPM Consultants Group" },
							new int[] {}, 1, "13:00", "14:30",
							"Palacio de la Canal 6 - Empresa Digital", 3, 57),
					new MainAgendaRowItem(
							"Excelencia operacional (OPEX) ",
							"Presentar una idea amplia y genérica del Modelo The Shingo Prize for Operational Excellence el cual se ha convertido en el estándar internacional que impulsa la competitividad de las empresas. Se compartirá una idea general del camino que el modelo sugiere para alcanzar la excelencia operacional.",
							new String[] { "Ing. Abel Gómez Medina" },
							new String[] { "LENSYS" },
							new int[] {},
							1,
							"13:00",
							"14:00",
							"Palacio de la Canal 7 - Sectores Estratégicos y Competitividad Regional",
							7, 58),
					new MainAgendaRowItem(
							"Lideras, gerencias: ambas o ninguna ﾠ﾿qué haces o pretendes hacer con tu negocio?",
							"Diferenciar las habilidades de liderazgo de gestión y su importancia en la PyME y el emprendedurismo. El participante será capaz de entender que cualquier emprendimiento requiere de desarrollar ciertas habilidades personales y de grupo.",
							new String[] { "Ing. Heriberto Álvarez Guzmán" },
							new String[] { "Cámara Mexicana de la Industria de la Construcción y CoRaLCoM Consultoría" },
							new int[] {}, 1, "13:00", "14:30",
							"Palacio de la Canal 8 - Innovación", 4, 59),
					new MainAgendaRowItem(
							"Ser y parecer empresario: Principios y técnicas fundamentales de administración de empresas.",
							"Por medio de ejercicios prácticos y casos de estudio se buscará contextualizar la importancia de la administración como un proceso que permite, planear, organizar, dirigir y controlar los recursos de los que dispone un individuo, empresa o institución en la consecución de sus objetivos, en términos de eficiencia y eficacia. Se abordará la realidad actual del modelo de empresa vigente.",
							new String[] { "Jaime Neftali Martínez Hernández" },
							new String[] { "TK Desarrollo Profesional Integral" },
							new int[] {}, 1, "13:00", "14:00",
							"Palacio de la Canal 9 - Campamento Emprendedor",
							1, 60),
					new MainAgendaRowItem(
							"Visa - Aceptación móvil de tarjetas",
							"El objetivo de la conferencia es presentar la nueva forma de cobrar con tarjetas en dispositivos móviles, sin trámites complicados, sin contratos a largo plazo, sin comisiones fijas mensuales y sin montos mínimos de ventas con tarjetas.",
							new String[] { "Luis Arceo" },
							new String[] { "Visa International / iZettle México" },
							new int[] {}, 1, "13:00", "13:30",
							"Pasarela - Cultura Financiera", 2, 61),
					new MainAgendaRowItem(
							"Película design & thinking",
							"Es un documental inspirado en el concepto de Design Thinking, el cual se refiere a métodos y procesos de solución de problemas. El documental muestra la manera en que diseñadores, hombres de negocios y diversos profesionistas, enfrentan los problemas que se presentan ante el constante cambio económico, social y cultural. Design & Thinking hace un llamado a la mente convencional a transformarse y encontrar soluciones creativas.",
							new String[] { "Mu-Ming Tsai" },
							new String[] { "CEDIM + Quórum" }, new int[] {}, 1,
							"14:00", "15:30",
							"Auditorio - Ecosistema Innovación", 4, 62),
					new MainAgendaRowItem(
							"Los retos de la empresa familiar",
							"Se darán a conocer aspectos de crecimiento, continuidad, desarrollo y administración de las empresas familiares.",
							new String[] { "M.A. Juan Carlos Cabrera López" },
							new String[] { "Nacional Financiera, S.N.C." },
							new int[] {},
							1,
							"14:00",
							"16:00",
							"Palacio de la Canal 3 - Cultura Financiera y Alto Impacto",
							2, 63),
					new MainAgendaRowItem(
							"El flujo de efectivo: Negocios PyMEs",
							"La importancia de administrar tu negocio identificando y mejorando el flujo de efectivo, aprendiendo a no mezclar las finanzas personales con las de tu negocio.",
							new String[] { "Lic. Ana Mota Alvarado" },
							new String[] { "BBVA Bancomer" }, new int[] {}, 1,
							"14:00", "15:00",
							"Sala Morada - Cultura Financiera", 2, 64),
					new MainAgendaRowItem(
							" ¿Cómo puede una PyME ingresar a la industria aeroespacial? ",
							"Se presentará como está conformada la Industria Aeroespacial y los requerimientos generales que se tienen que cubrir para ingresar dicha Industria.",
							new String[] { "Ing. Arnoldo Castilla Gracia" },
							new String[] { "Consultoría Empresarial" },
							new int[] {},
							1,
							"14:30",
							"15:30",
							"Palacio de la Canal 7 - Sectores Estratégicos y Competitividad Regional",
							7, 65),
					new MainAgendaRowItem(
							"Fortalecimiento al emprendedor desde el Legislativo",
							"Al término de la conferencia los asistentes comprenderán la integración, funcionamiento y facultades del Congreso de la Unión. Conocerán en materia de competitividad cuáles son las principales aportaciones de la Cámara de Diputados y concretamente de la Comisión de Economía en materia de Apoyos a MiPyMEs.",
							new String[] { "Dip. Mario Sánchez Ruiz" },
							new String[] { "Comisión de Economia, Cámara de Diputados" },
							new int[] {}, 1, "15:00", "16:30",
							"Palacio de Iturbide 2 - Eventos Especiales 2",
							ECOSYSTEM_STRATEGIC_SECTORS, 66),
					new MainAgendaRowItem(
							"Cómo aumentar mis ventas a través del marketing digital",
							" ¿Te gustaría aprender como atraer a tus clientes más valiosos?  ¿Te gustaría saber cómo hacerlo de una manera efectiva y medible? Aquí te platicaremos sobre la oportunidad que tiene tu negocio para crecer e incrementar sus ventas con herramientas en línea.",
							new String[] { "Jorge Gutiérrez Luthe" },
							new String[] { "Google" }, new int[] {}, 1,
							"15:00", "16:00",
							"Palacio de la Canal 11 - Google",
							ECOSYSTEM_DIGITAL_ENTERPRISE, 67),
					new MainAgendaRowItem(
							"El flujo de efectivo: Negocios PyMEs",
							"Evaluar la conveniencia de aplicar estrategias para mejorar el manejo del flujo de efectivo, que involucran acciones que le permitan administrar y favorecer la solvencia económica de su negocio o proyecto de negocio.",
							new String[] { "Lic. Ana Mota Alvarado" },
							new String[] { "BBVA BANCOMER" }, new int[] {}, 1,
							"15:00", "16:00",
							"Palacio de la Canal 2 - BBVA Bancomer",
							ECOSYSTEM_FINANCIAL_CULTURE, 68),
					new MainAgendaRowItem(
							"Cómo hacer crecer tu Negocio",
							"Los emprendedores recibirán información fundamental acerca de cómo iniciar un negocio, de cómo comercializar un negocio ya establecido y de cómo llevar las Finanzas en el mismo. Al final los emprendedores tendrán mejores fundamentos de Negocio.",
							new String[] { "Act. Carlos Corominas" },
							new String[] { "Visa Inc." }, new int[] {}, 1,
							"15:00", "16:00",
							"Sala Naranja - Cultura Financiera", 2, 69),
					new MainAgendaRowItem(
							"Taller de creatividad e innovación de negocios",
							"Mediante dinámicas de juego serio como LEGO Serious Play, los asistentes aprenderán a identificar, generar y evaluar oportunidades de negocio rentables. Aprenderán también a innovar propuestas de valor y modelos de negocio. Al finalizar, se llevarán un lienzo con el modelo de negocio (Business Model Canvas) y al cierre de la Semana se premiarán los proyectos más innovadores.",
							new String[] { "Ing. Arturo Salcedo Cárabez, MBA" },
							new String[] { "CITRUS Innovation" }, new int[] {},
							1, "15:00", "18:00",
							"Taller - Ecosistema Innovación", 4, 70),
					new MainAgendaRowItem(
							"Oportunidades y estrategias comerciales de México con Brasil",
							"Se presentará la construcción y aprovechamiento de las ventajas comerciales entre México y Brasil.",
							new String[] { "Mtro. Miguel Ruiz Luna" },
							new String[] { "Cámara de Comercio México - Brasil" },
							new int[] {}, 1, "15:30", "16:30",
							"Palacio de la Canal 1 - Alianzas Globales", 0, 71),
					new MainAgendaRowItem(
							"La importancia del comercio electrónico",
							"Explicar qué es el comercio electrónico, hablar de cómo hacer comercio electrónico, mencionar el contexto actual del comercio electrónico y tendencias (oportunidades para los emprendedores). ",
							new String[] { "Francisco Ceballos" },
							new String[] { "Mercado Libre" }, new int[] {}, 1,
							"15:30", "17:00",
							"Palacio de la Canal 5 - Red Mover a México", 6, 72),
					new MainAgendaRowItem(
							"Taller de presentación de inversionistas",
							"Se explicará a los asistentes como hacer una presentación exitosa a inversionistas potenciales. Se revisarán los 10 slides fundamentales y se darán tips de comunicación efectiva.",
							new String[] { "Dimitrio Gómez" },
							new String[] { "Venture Institute" }, new int[] {},
							1, "15:30", "16:30",
							"Palacio de la Canal 9 - Campamento Emprendedor",
							1, 73),
					new MainAgendaRowItem(
							"Emprendedores Wayra: de frente a la innovación",
							"Compartir la experiencia de jovenes innovadores.",
							new String[] { "Wayra" }, new String[] { "" },
							new int[] {}, 1, "16:00", "19:00",
							"Auditorio - Ecosistema Innovación", 4, 74),
					new MainAgendaRowItem(
							"ASPEL: Cómo cumplir con las obligaciones fiscales y administrar tu negocio",
							"Con éstos sistemas es muy fácil administrar tu negocio, optimizar recursos y crecer tus ventas.",
							new String[] { "Gilberto Sánchez Vázquez" },
							new String[] { "TELMEX" }, new int[] {}, 1,
							"16:00", "17:00",
							"Palacio de la Canal 10 - Streaming",
							ECOSYSTEM_FINANCIAL_CULTURE, 75),
					new MainAgendaRowItem(
							"La nube puede transformar tu negocio",
							"Introducción a las tendencias de tecnología en la nube y como los negocios pueden ser más eficientes y seguros. Hablaremos de como usar herramientas de colaboración y la infraestructura de aplicaciones en la nube para hacer más eficiente a tu negocio.",
							new String[] { "Erin Winslow" },
							new String[] { "Google" }, new int[] {}, 1,
							"16:00", "17:00",
							"Palacio de la Canal 11 - Google",
							ECOSYSTEM_DIGITAL_ENTERPRISE, 76),
					new MainAgendaRowItem(
							"Negocios PyMEs: El crédito",
							"Evaluar la conveniencia de adquirir un crédito para tu negocio con base en las necesidades de éste, a partir de las cuales diseñarás una estrategia a seguir para favorecer el pago puntual del crédito elegido sin poner en riesgo las finanzas del negocio.",
							new String[] { "Lic. Cuauhtémoc Escorcia Reyes" },
							new String[] { "BBVA Bancomer" }, new int[] {}, 1,
							"16:00", "18:00",
							"Palacio de la Canal 2 - BBVA Bancomer",
							ECOSYSTEM_FINANCIAL_CULTURE, 77),
					new MainAgendaRowItem(
							"Emprendedurismo de innovación: generando ecosistemas de alto impacto",
							"Se relatarán y analizarán las lecciones aprendidas al emprender en tres lugares geográficos distintos con características igualmente diversas: Israel y la innovación aplicada; Sillicon Valley y el financiamiento a la innovación y; Boston y la innovación en etapa temprana. Objetivo: Establecer las características que debe reunir un ecosistema de alto impacto para contribuir realmente a la competitividad y productividad del país. ",
							new String[] { "Dr. Luis Aguirre-Torres" },
							new String[] { "Green Momentum" },
							new int[] {},
							1,
							"16:00",
							"17:00",
							"Palacio de la Canal 3 - Cultura Financiera y Alto Impacto",
							2, 78),
					new MainAgendaRowItem(
							"Mecanismos de integración de la PyME a la cadena de suministros",
							"Los asistentes podrán identificar y mostrar como las PyMEs pueden integrarse a las cadenas de suministro dentro de un entorno globalizado.",
							new String[] { "Dr. Eduardo Reyes Díaz-Leal" },
							new String[] { "Bufete Internacional" },
							new int[] {},
							1,
							"16:00",
							"17:00",
							"Palacio de la Canal 7 - Sectores Estratégicos y Competitividad Regional",
							7, 79),
					new MainAgendaRowItem(
							"Cuenta cuentos los vengadores: salvar el día",
							"Comic para fomentar la educación financiera. Con la combinación de los personajes icónicos de Marvel, incluidos los Vengadores y Spiderman, así como la experiencia en educación financiera de Visa, se presenta un original cómic.",
							new String[] { "Cuenta cuentos" },
							new String[] { "Visa México" }, new int[] {}, 1,
							"16:00", "17:00", "Pasarela - Cultura Financiera",
							2, 80),
					new MainAgendaRowItem(
							"Fútbol Financiero",
							"Fútbol Financiero es un juego interactivo para computadora diseñado para que los jóvenes - adultos contemporáneos conozcan los distintos temas financieros a los que se enfrentarán como adultos jóvenes. Combina el deporte con una guía de estudio sobre conceptos básicos de finanzas personales.",
							new String[] { "Taller" },
							new String[] { "Visa México" }, new int[] {}, 1,
							"16:00", "17:00",
							"Sala Naranja - Cultura Financiera", 2, 81),
					new MainAgendaRowItem(
							"Innovación en las MiPyMEs y el crecimiento económico",
							"Conocimiento del valor agregado que genera la Innovación en las MiPyMEs.",
							new String[] { "Lic. Ildefonso Guajardo Villarreal" },
							new String[] { "Ildefonso Guajardo Villarreal es Licenciado en Economía por la Universidad Autónoma de "
									+ "Nuevo León, Maestro en Economía por la Universidad Estatal de Arizona y Estudios Doctorales "
									+ "en Finanzas Públicas y Economía por la Universidad de Pensilvania; inició su actividad "
									+ "profesional en el gobierno como Director de Finanzas Públicas en la antigua Secretaría de "
									+ "Programación y Presupuesto en 1984, posteriormente ocupó cargos en las secretarías de "
									+ "Relaciones Exteriores, Turismo y Comercio y Fomento Industrial. Además ha sido profesor "
									+ "visitante de la Universidad Estatal de Arizona y profesor adjunto de la Universidad de "
									+ "Pensilvania." },
							new int[] { R.drawable.speaker_ildefonso_guajardo },
							1, "18:00", "19:00", "Valparaiso 3 - Magistrales",
							8, 82),
					new MainAgendaRowItem(
							"Identidad de marca: Aprende estrategias para diferenciarte de los demás",
							"Cómo una buena identidad potencializa y diferencia tu negocio. Las reglas del branding. Mini manual de los 10 pasos que debes tomar en cuenta para construir una identidad poderosa. ",
							new String[] { "Rebeca Castro y Thaina Garza" },
							new String[] { "Branding Boutique" }, new int[] {},
							1, "16:30", "18:00",
							"Palacio de la Canal 4 - Streaming",
							ECOSYSTEM_ENTREPRENEUR_CAMP, 83),
					new MainAgendaRowItem(
							"Mejorando la competitividad de las PyMEs Mexicanas",
							"Se presentarán las estrategias acerca de cómo mejorar e impulsar la competitividad de las Pequeñas y Medianas Empresas.",
							new String[] { "Lic. Juan Pablo Quintana Calles" },
							new String[] { "PROMEXICO" }, new int[] {}, 1,
							"17:00", "18:30",
							"Palacio de la Canal 1 - Alianzas Globales", 0, 84),
					new MainAgendaRowItem(
							"Presencia web y Office 365",
							"Crea tu pagina web y actualízala cuando lo necesites sin pagar por servicios profesionales. Herramientas para colaborar, innovar y estar en contacto con tu equipo de trabajo.",
							new String[] { "Jacobo Wiebe" },
							new String[] { "TELMEX" }, new int[] {}, 1,
							"17:00", "18:00",
							"Palacio de la Canal 10 - Streaming",
							ECOSYSTEM_DIGITAL_ENTERPRISE, 85),
					new MainAgendaRowItem(
							"Estrategias de monetización web - tu sitio web puede trabajar para tí",
							"Tu página de internet puede generarte ingresos adicionales sin importar de que se trate tu negocio, nosotros te enseñaremos las claves para lograr ingresos por publicidad en Internet.",
							new String[] { "David Hyman" },
							new String[] { "Google" }, new int[] {}, 1,
							"17:00", "18:00",
							"Palacio de la Canal 11 - Google",
							ECOSYSTEM_DIGITAL_ENTERPRISE, 86),
					new MainAgendaRowItem(
							"Visión y tecnología: clave para el desarrollo de las empresas turísticas",
							"En esta charla amena y breve los participantes se formarán un concepto claro de cómo dirigir una empresa, planear su crecimiento, motivar al personal para que colabore en el logro de los objetivos, ser efectivo en las ventas y utilizar de manera eficaz los avances tecnológicos más actuales y accesibles para obtener los resultados que desean.",
							new String[] { "Lic. Enrique Eduardo de la Garza Sánchez" },
							new String[] { "Secretaría de Turismo " },
							new int[] {}, 1, "17:00", "18:30",
							"Palacio de la Canal 6 - Empresa Digital", 3, 87),
					new MainAgendaRowItem(
							"Coach para Emprendedores ",
							"Los participantes encontrarán en el 'Coaching para emprendedores', una forma ideal para avanzar hacia el éxito. Ya que proporciona herramientas para que los resultados sean más rápidos. Así mismo se proveerán apoyos y estructuras para conseguir una mejor calidad de vida, conciliando la vida laboral con la personal, con la firme intensión de superar numerosos retos, tanto individuales como profesionales.",
							new String[] { "Helios Ruiz Esparza González" },
							new String[] { "Centro de Desarrollo y Capacitación Empresarial S.C." },
							new int[] {}, 1, "17:00", "18:00",
							"Palacio de la Canal 9 - Campamento Emprendedor",
							1, 88),
					new MainAgendaRowItem(
							"e-Commerce: la nueva forma de hacer negocios",
							"Sa abordarán los principales temas de la guía para el desarrollo de plataformas de comercio electrónico, entre los que se incluyen las mejores prácticas en diversos aspectos del eCommerce como: dominios, organización, infraestructura, mercadotecnia, entre otro.",
							new String[] { "Lic. Víctor de la Barrera" },
							new String[] { "Visa México" }, new int[] {}, 1,
							"17:00", "18:00",
							"Sala Naranja - Cultura Financiera", 2, 89),
					new MainAgendaRowItem(
							" ¿Qué régimen fiscal es más conveniente para mi negocio?",
							"Se proporcionará información sobre las opciones fiscales para emprendedores.",
							new String[] { "Lic. Rubén Herrero" },
							new String[] { "Impuestum Contadores" },
							new int[] {}, 1, "17:30", "19:00",
							"Palacio de la Canal 5 - Red Mover a México", 6, 90),
					new MainAgendaRowItem(
							"La nueva logística y las PyMEs:  ¿Cómo integrarse y tener mayor rentabilidad?",
							"Permitirá identificar las nuevas tendencias en materia logística y su relación con las PyMEs, para la obtención de una mayor rentabilidad.",
							new String[] { "MBA Francisco Juárez Olay" },
							new String[] { "Global Logistics and Trade" },
							new int[] {},
							1,
							"17:30",
							"18:30",
							"Palacio de la Canal 7 - Sectores Estratégicos y Competitividad Regional",
							7, 91),
					new MainAgendaRowItem(
							"The magic of starting up",
							"La facilidad y alcances en recaudación de fondos a través de internet, sin límites de tiempo ni barreras.",
							new String[] { "Tom Serres" },
							new String[] { "CEO y cofundador de una plataforma de recaudación de fondos en línea, para causas "
									+ "sociales, él es uno de los pensadores más importantes del país en esa temática. A "
									+ "través  de Rally se han ayudado a millones de seguidores a vincularse con organizaciones "
									+ "no lucrativas, organizaciones benéficas, grupos de defensa, campañas políticas, grupos "
									+ "escolares, y las causas independiente para crear conciencia." },
							new int[] { R.drawable.speaker_tom_serres }, 1,
							"16:00", "17:30", "Valparaiso 3 - Magistrales", 8,
							92),
					new MainAgendaRowItem(
							"Crece tu negocio con Google Adwords y los Partners Premium para la PyME",
							"Se presentarán los factores que influyen en la efectividad de una campaña digital.",
							new String[] { "Rogelio Montekio" },
							new String[] { "Google" }, new int[] {}, 1,
							"18:00", "19:30",
							"Palacio de la Canal 11 - Google",
							ECOSYSTEM_DIGITAL_ENTERPRISE, 93),
					new MainAgendaRowItem(
							"El mercado femenino y su rentabilidad en México",
							"Las ventajas y áreas de oportunidad que representa el mercado femenino mexicano y cómo capitalizarlo. Booklet con insights relevantes de las mujeres mexicanas.",
							new String[] { "Rebeca Castro y Thaina Garza" },
							new String[] { "Branding Boutique" }, new int[] {},
							1, "18:00", "19:30",
							"Palacio de la Canal 4 - Streaming",
							ECOSYSTEM_MOVE_MEXICO, 94),
					new MainAgendaRowItem(
							"Beneficios de las redes colaborativas ",
							"Se describirán los beneficios de realizar colaboración e innovación inter-empresarial e inter-sectorial, igualmente se exponen algunos de los elementos que deben tomarse en cuenta para hacerlo. Se exponen algunos ejemplos de lo que están realizando otras redes.",
							new String[] { "Dra. Mónica Velasco E. " },
							new String[] { "Fondo de Información y Documentación para la Industria (INFOTEC)" },
							new int[] {}, 1, "18:30", "19:30",
							"Palacio de la Canal 6 - Empresa Digital", 3, 95) },

			/*
			 * DAY 3
			 */
			new MainAgendaRowItem[] {
					new MainAgendaRowItem(
							"Importancia de los TLC's para las MiPyMEs",
							"Identificar las oportunidades que brindan los Tratados de Libre Comercio que tiene México para las Pequeñas y Medianas Empresas.",
							new String[] { "Lic. Juan Carlos Baker Pineda" },
							new String[] { "Subsecretaría de Comercio Exterior, SE." },
							new int[] {}, 2, "10:00", "11:00",
							"Palacio de la Canal 1 - Alianzas Globales", 0, 96),
					new MainAgendaRowItem(
							"Crece tu negocio con Google AdWords y los Partners Premium para la PyME",
							"Se presentarán los factores que afectan la efectividad de una campaña en Google AdWords.",
							new String[] { "Diego Martínez" },
							new String[] { "Google" }, new int[] {}, 2,
							"10:00", "11:00",
							"Palacio de la Canal 11 - Google",
							ECOSYSTEM_DIGITAL_ENTERPRISE, 97),
					new MainAgendaRowItem(
							"Otros métodos de financiamiento: Introducción al fondeo colectivo",
							"Facilitar actividades teóricas y prácticas con el objetivo de ejemplificar el proceso de crowdfunding. Co-crear, pasar de la idea al prototipo y validarlo a través de Fondeadora.",
							new String[] { "Rene Serrano" },
							new String[] { "Fondeadora de México SAPI de CV" },
							new int[] {}, 2, "10:00", "11:00",
							"Palacio de la Canal 4 - Streaming",
							ECOSYSTEM_FINANCIAL_CULTURE, 98),
					new MainAgendaRowItem(
							"Modelos de capacitación para mujeres emprendedoras",
							"Se presentarán distintos modelos y servicios de desarrollo empresarial para mujeres y casos de éxito. Al terminar se conocerán los servicios y apoyos que brindan distintas organizaciones que trabajan con mujeres emprendedoras.",
							new String[] { "Moderadora: Daniela Hammeken" },
							new String[] { "Freedom from Hunger" },
							new int[] {}, 2, "10:00", "11:30",
							"Palacio de la Canal 5 - Red Mover a México", 6, 99),
					new MainAgendaRowItem(
							"Haga negocios con las cadenas de autoservicio y departamentales",
							"Se mostrará cómo integrar a las MIPyMEs en la cadena comercial de las tiendas de Autoservicio y Departamentales de la ANTAD, hacer negocios con otros proveedores, cómo participar en las grandes ligas con las mismas posibilidades, método de autodiagnóstico y obtención de créditos privados.",
							new String[] { "Ing. Gerardo Sotomayor Reza" },
							new String[] { "Asociación Nacional de Tiendas de Autoservicio y Departamentales (ANTAD)" },
							new int[] {},
							2,
							"10:00",
							"11:00",
							"Palacio de la Canal 7 - Sectores Estratégicos y Competitividad Regional",
							7, 100),
					new MainAgendaRowItem(
							"Taller de creatividad e innovación de negocios",
							"Mediante dinámicas de juego serio como LEGO Serious Play, los asistentes aprenderán a identificar, generar y evaluar oportunidades de negocio rentables. Aprenderán también a innovar propuestas de valor y modelos de negocio. Al finalizar, se llevarán un lienzo con el modelo de negocio (Business Model Canvas) y al cierre de la Semana se premiarán los proyectos más innovadores.",
							new String[] { "Ing. Arturo Salcedo Cárabez, MBA" },
							new String[] { "CITRUS Innovation" }, new int[] {},
							2, "10:00", "14:00",
							"Taller - Ecosistema Innovación", 4, 101),
					new MainAgendaRowItem(
							"Innovación en modelos de negocio y las nuevas reglas de cadena de valor",
							"Se preentarán los fundamentos de innovación en base al manual de Oslo, así como, conocer las nuevas reglas de valor en base a plataformas digitales. Entender el modelo Canvas para diseñar modelos de negocio innovadores.",
							new String[] { "M.C. Horman Millán Sánchez" },
							new String[] { "ITS Trade and Tech Solutions" },
							new int[] {}, 2, "10:30", "12:30",
							"Palacio de la Canal 8 - Innovación", 4, 102),
					new MainAgendaRowItem(
							"Nuevas formas de educar y entretener",
							"Hablar del surgimiento de nuevas maneras de comunicarse y expresarse se han vuelto un tema crucial que no solo atañe a los ámbitos de la tecnología y la ciencia. Hoy en día algunas personas, y especialmente los jóvenes, manejan artefactos de comunicación y servicios que se han vuelto prácticamente invisibles a nuestros ojos y que sin embargo, forman parte de su vida cotidiana y tienen un impacto tangible en su vida social.",
							new String[] { "Maribel Martínez" },
							new String[] { "Diecinueve36" }, new int[] {}, 2,
							"11:00", "12:00",
							"Auditorio - Ecosistema Innovación", 4, 103),
					new MainAgendaRowItem(
							"Redes Sociales",
							"Se presentará el uso de las redes sociales y el impacto en las PYMES.",
							new String[] { "Alejandro Ramos" },
							new String[] { "TELMEX" }, new int[] {}, 2,
							"11:00", "12:00",
							"Palacio de la Canal 10 - Streaming",
							ECOSYSTEM_DIGITAL_ENTERPRISE, 104),
					new MainAgendaRowItem(
							"Muestra tu negocio al mundo: en el mapa de la era digital",
							"Tus clientes ya te están buscando. Deja que te encuentren poniendo a tu negocio en el mapa de la era digital, con información detallada de su empresa. Conoce la oportunidad de utilizar otras plataformas de Google para sus negocios.",
							new String[] { "Octavio Cisneros" },
							new String[] { "Google" }, new int[] {}, 2,
							"11:00", "12:00",
							"Palacio de la Canal 11 - Google",
							ECOSYSTEM_DIGITAL_ENTERPRISE, 105),
					new MainAgendaRowItem(
							"Negocios PyMEs: El crédito",
							"Evaluar la conveniencia de adquirir un crédito para tu negocio con base en las necesidades de éste, a partir de las cuales diseñarás una estrategia a seguir para favorecer el pago puntual del crédito elegido sin poner en riesgo las finanzas del negocio.",
							new String[] { "Lic. María Inglaterra Islas Borboa " },
							new String[] { "BBVA BANCOMER" }, new int[] {}, 2,
							"11:00", "13:00",
							"Palacio de la Canal 2 - BBVA Bancomer",
							ECOSYSTEM_FINANCIAL_CULTURE, 106),
					new MainAgendaRowItem(
							"Cuenta cuentos los vengadores: salvar el día",
							"Cómic para fomentar la educación financiera. Con la combinación de los personajes icónicos de Marvel, incluidos los Vengadores y Spiderman, así como la experiencia en educación financiera de Visa, se presenta un original cómic.",
							new String[] { "Cuenta Cuentos " },
							new String[] { "Visa México" }, new int[] {}, 2,
							"11:00", "12:00", "Pasarela - Cultura Financiera",
							2, 107),
					new MainAgendaRowItem(
							"Consejos de marketing para aprender a emprender",
							"Que los asistentes comiencen a entender qué significa emprender; ya que, esta es una actividad de vida y no es para todos; sino, solamente para aquellos que cuentan con espíritu emprendedor.",
							new String[] { "Enrique Gómez Gordillo" },
							new String[] { "Cuenta con más de 25 años de trayectoria activa en la formación y asesoría de empresarios "
									+ "de 35 giros industriales y comerciales.  Ha colaborado como asesor en más de 100 empresas "
									+ "de todos tamaños y más de 220,000 personas han participado en sus cursos y conferencias "
									+ "en México y Centroamérica. Colaboró como articulista en la revista Entrepreneur "
									+ "(Edición México).  En 2001 publicó el libro 100 Promociones Irresistibles para Micro "
									+ "y Pequeños Negocios. En 2008 publicó el libro De Novato a Chingón de Ventas y Mercadotecnia "
									+ "y en 2009 el libro Botanas de Marketing" },
							new int[] { R.drawable.speaker_enrique_gomez }, 2,
							"12:00", "13:30", "Valparaiso 3 - Magistrales", 8,
							108),
					new MainAgendaRowItem(
							"PROMEXICO como aliado en la internacionalización de las empresas mexicanas",
							"Conocer las estrategias de PROMEXICO dirigidas al fortalecimiento de las exportaciones de las empresas mexicanas.",
							new String[] { "Lic. Miguel Ángel Leaman Rivas" },
							new String[] { "PROMEXICO" }, new int[] {}, 2,
							"11:30", "12:30",
							"Palacio de la Canal 1 - Alianzas Globales", 0, 109),
					new MainAgendaRowItem(
							"La pyme 2.0",
							"Mostrar al empresario los beneficios de utilizar tecnologías de la información en sus empresas.",
							new String[] { "Lic. Christian Holm Rodríguez" },
							new String[] { "inTeam" }, new int[] {}, 2,
							"11:30", "13:00",
							"Palacio de la Canal 6 - Empresa Digital", 3, 110),
					new MainAgendaRowItem(
							"Cómo venderle al autoservicio y no morir en el intento",
							"En un marco de interacción franco y directo entre los participantes y el conferencista, se abordarán, de forma sencilla y amigable, temas fundamentales que debe de considerar el interesado por ingresar al comercio detallista como proveedor confiable.",
							new String[] { "Lic. Mario Winfield Aguilar" },
							new String[] { "Comité Nacional de Productividad e Innovación Tecnológica A.C. (COMPITE)" },
							new int[] {},
							2,
							"11:30",
							"12:30",
							"Palacio de la Canal 7 - Sectores Estratégicos y Competitividad Regional",
							7, 111),
					new MainAgendaRowItem(
							"La constitución de tu sociedad:  ¿qué, con quién y cómo? ",
							"1.- Análisis: De las diferentes estructuras de las sociedades desde la perspectiva de los riesgos involucrados en utilizar la generalidad de la ley (S.A. de C.V., S de R.L., SAPI). 2.- Consecuencias: De los posibles escenarios involucrados con utilizar la generalidad de la ley como fuente de derechos de los socios o accionistas. 3.- Soluciones: Análisis de estrategias legales que permiten aterrizar la generalidad de la ley a los casos específicos más frecuentes en las MiPymes.",
							new String[] { "Lic. Luis Alejandro Medina González" },
							new String[] { "Correduría Pública" },
							new int[] {}, 2, "11:30", "14:30",
							"Palacio de la Canal 9 - Campamento Emprendedor",
							1, 112),
					new MainAgendaRowItem(
							"Emprender como Pepe y Toño",
							"La conferencia está enfocada al fomento de la Cultura Emprendedora, mostrándoles a los presentes el ciclo de valor de la labor empresarial, que todo inicia por una idea hasta ya instalada la empresa, y de qué forma esto aporta al desarrollo económico del país.",
							new String[] { "Lic. Salvador Villalobos Gómez" },
							new String[] { "Consejo de la Comunicación, A.C." },
							new int[] {}, 2, "12:00", "13:00",
							"Palacio de la Canal 10 - Streaming",
							ECOSYSTEM_ENTREPRENEUR_CAMP, 113),
					new MainAgendaRowItem(
							"Agencias digitales: el éxito comercial para tu negocio",
							" ¿Quisieras hacer crecer más tu negocio con una estrategia de marketing digital? Te invitamos a conocer los servicios y excelentes resultados que una agencia digital te ofrece.",
							new String[] { "Eric Gómez" },
							new String[] { "Google" }, new int[] {}, 2,
							"12:00", "13:00",
							"Palacio de la Canal 11 - Google",
							ECOSYSTEM_DIGITAL_ENTERPRISE, 114),
					new MainAgendaRowItem(
							"Comercializa tus productos en un mundo globalizado",
							"Se mostrarán distintas experiencias de éxito para comercializar productos de artesanas. Al terminar se conocerán plataformas y oportunidades para comercialización de productos artesanales. ",
							new String[] { "Moderadora: Pilar Mariscal" },
							new String[] { "Fundación León XIII" },
							new int[] {}, 2, "12:00", "13:30",
							"Palacio de la Canal 5 - Red Mover a México", 6,
							115),
					new MainAgendaRowItem(
							"Financiamiento para emprendedores",
							"Se presentarán diversas opciones de financiamiento y apoyos a los que pueden acceder los emprendedores actualmente en México.",
							new String[] { "Luis García Montes de Oca" },
							new String[] { "Director de Proyectos en la Aceleradora del ITESM - Conferencia Magistral" },
							new int[] {}, 2, "12:30", "14:00",
							"Valparaiso 3 - Magistrales", ECOSYSTEM_FINANCIAL_CULTURE, 116),
					new MainAgendaRowItem(
							"Herramientas ALADI de apoyo a la internacionalización de emprendedores mexicanos",
							"Se expondrán los beneficios y oportunidades que brinda esta Asociación a los emprendedores mexicanos que se encuentran interesados en internacionalizarse.",
							new String[] { "Mtro. Pablo E. Rabczuk Ruiz" },
							new String[] { "Asociación Latinoamericana de Integración (ALADI)" },
							new int[] {}, 2, "13:00", "14:30",
							"Palacio de la Canal 4 - Streaming",
							ECOSYSTEM_DIGITAL_ENTERPRISE, 117),
					new MainAgendaRowItem(
							"Desarrollando un modelo de negocios en un mundo corporativo y de vinculación empresarial",
							"Permitirá conocer los aspectos importantes del modelo de negocios para la incorporación e integración de negocios con corporativos, ante la globalización empresarial.",
							new String[] { "José Agustín Vargas Padilla" },
							new String[] { "TIC Consultoría Innovación y Tecnología" },
							new int[] {},
							2,
							"13:00",
							"14:00",
							"Palacio de la Canal 7 - Sectores Estratégicos y Competitividad Regional",
							7, 118),
					new MainAgendaRowItem(
							"Venture institute: casos de éxito y Demo Day",
							"Conocer mejor cómo funcionan Venture Institute y Venture Partners, conocer a emprendedores exitosos y su experiencia, y la oferta de empresas en el mercado que están buscando inversión.",
							new String[] { "" },
							new String[] { "Venture Partners / Venture Institute" },
							new int[] {}, 2, "13:00", "15:00",
							"Palacio de la Canal 8 - Innovación", 4, 119),
					new MainAgendaRowItem(
							"Visa - Aceptación móvil de tarjetas",
							"El objetivo de la conferencia es presentar la nueva forma de cobrar con tarjetas en dispositivos móviles, sin trámites complicados, sin contratos a largo plazo, sin comisiones fijas mensuales y sin montos mínimos de ventas con tarjetas.",
							new String[] { "Luis Arceo" },
							new String[] { "Visa International / iZettle México" },
							new int[] {}, 2, "13:00", "13:30",
							"Pasarela - Cultura Financiera", 2, 120),
					new MainAgendaRowItem(
							"Finanzas para emprendedores: una radiografía de ti para tu negocio",
							"Cómo estoy yo, estará mi negocio: Bajo esta premisa, la conferencia busca centrar la atención de los asistentes en el manejo de sus finanzas personales, el uso de los servicios financieros y la relación que mantiene con las instituciones. Los esfuerzos para procurar la salud financiera en nuestras finanzas, se traducirán en las de los negocios.",
							new String[] { "Lic. Alejandro Zamora" },
							new String[] { "Museo Interactivo de Economía (MIDE)" },
							new int[] {}, 2, "13:00", "14:00",
							"Sala Morada - Cultura Financiera", 2, 121),
					new MainAgendaRowItem(
							"Fútbol Financiero",
							"Fútbol Financiero es un juego interactivo para computadora diseñado para que los jóvenes - adultos contemporáneos conozcan los distintos temas financieros a los que se enfrentarán como adultos jóvenes. Combina el deporte con una guía de estudio sobre conceptos básicos de finanzas personales.",
							new String[] { "Taller" },
							new String[] { "Visa México" }, new int[] {}, 2,
							"13:00", "14:00",
							"Sala Naranja - Cultura Financiera", 2, 122),
					new MainAgendaRowItem(
							"Película design & thinking",
							"Es un documental inspirado en el concepto de Design Thinking, el cual se refiere a métodos y procesos de solución de problemas. El documental muestra la manera en que diseñadores, hombres de negocios y diversos profesionistas, enfrentan los problemas que se presentan ante el constante cambio económico, social y cultural. Design & Thinking hace un llamado a la mente convencional a transformarse y encontrar soluciones creativas.",
							new String[] { "Mu-Ming Tsai" },
							new String[] { "CEDIM y Premio Quórum" },
							new int[] {}, 2, "14:00", "15:30",
							"Auditorio - Ecosistema Innovación", 4, 123),
					new MainAgendaRowItem(
							"Estrategias de monetización web: tu sitio web puede trabajar para ti",
							"Tu página de internet puede generarte ingresos adicionales sin importar de que se trate tu negocio, nosotros te enseñaremos las claves para lograr ingresos por publicidad en internet.",
							new String[] { "Jorge Hoyos" },
							new String[] { "Google" }, new int[] {}, 2,
							"14:00", "15:00",
							"Palacio de la Canal 11 - Google",
							ECOSYSTEM_DIGITAL_ENTERPRISE, 124),
					new MainAgendaRowItem(
							"El flujo de efectivo: Negocios PyMEs",
							"La importancia de administrar tu negocio identificando y mejorando el flujo de efectivo, aprendiendo a no mezclar las finanzas personales con las de tu negocio.",
							new String[] { "Lic. Ana Mota Alvarado" },
							new String[] { "BBVA Bancomer" }, new int[] {}, 2,
							"14:00", "15:00",
							"Sala Morada - Cultura Financiera", 2, 125),
					new MainAgendaRowItem(
							"Cómo hacer crecer tu negocio",
							"Llos emprendedores recibirán información fundamental acerca de cómo iniciar un negocio, de cómo comercializar un negocio ya establecido y de cómo llevar las finanzas en el mismo. Al final de la conferencia los emprendedores tendrán mejores fundamentos de negocio.",
							new String[] { "Act. Carlos Corominas" },
							new String[] { "Visa Inc." }, new int[] {}, 2,
							"14:00", "15:00",
							"Sala Naranja - Cultura Financiera", 2, 126),
					new MainAgendaRowItem(
							"Mecanismos de participación del emprendedor en el diseño de las regulaciones y los trámites",
							"Los asistentes conocerán los mecanismos de consulta pública, el Registro Federal de Trámites y Servicios y los Programas de Mejora Regulatoria, con los que pueden participar para conocer oportunamente las regulaciones y trámites que el gobierno federal emite cotidianamente, así como la forma en que pueden hacer propuestas de mejora a los trámites y normas que más les afectan u obstaculizan.",
							new String[] { "Lic. Julio César Rocha López" },
							new String[] { "Comisión Federal de Mejora Regulatoria (COFEMER)" },
							new int[] {},
							2,
							"14:30",
							"15:30",
							"Palacio de la Canal 7 - Sectores Estratégicos y Competitividad Regional",
							7, 127),
					new MainAgendaRowItem(
							"Visibilidad e impacto para tu negocio en internet con Adwords Express",
							"Como sacarle el máximo provecho a Google y la publicidad digital, para poner tu negocio en la mira de tus clientes. Ahora más fácil que nunca.",
							new String[] { "Jorge Gutiérrez Luthe" },
							new String[] { "Google" }, new int[] {}, 2,
							"15:00", "16:00",
							"Palacio de la Canal 11 - Google",
							ECOSYSTEM_DIGITAL_ENTERPRISE, 128),
					new MainAgendaRowItem(
							"El flujo de efectivo: Negocios PyMEs",
							"Evaluar la conveniencia de aplicar estrategias para mejorar el manejo del flujo de efectivo, que involucran acciones que le permitan administrar y favorecer la solvencia económica de su negocio o proyecto de negocio.",
							new String[] { "Lic. Ana Mota Alvarado" },
							new String[] { "BBVA BANCOMER" }, new int[] {}, 2,
							"15:00", "16:00",
							"Palacio de la Canal 2 - BBVA Bancomer", 2, 129),
					new MainAgendaRowItem(
							"Taller de creatividad e innovación de negocios",
							"Mediante dinámicas de juego serio como LEGO Serious Play, los asistentes aprenderán a identificar, generar y evaluar oportunidades de negocio rentables. Aprenderán también a innovar propuestas de valor y modelos de negocio. Al finalizar, se llevarán un lienzo con el modelo de negocio (Business Model Canvas) y al cierre de la Semana se premiarán los proyectos más innovadores.",
							new String[] { "Ing. Arturo Salcedo Cárabez, MBA" },
							new String[] { "CITRUS Innovation" }, new int[] {},
							2, "15:00", "18:00",
							"Taller - Ecosistema Innovación", 4, 130),
					new MainAgendaRowItem(
							"Propiedad Industrial: el registro de las marcas",
							"Se explicará a los asistentes la trascendencia de la protección de sus marcas y signos distintivos. Los asistentes visualizarán el activo que representa tener el registro de su marca.",
							new String[] { "Lic. Eliseo Montiel" },
							new String[] { "Instituto Mexicano de la Propiedad Industrial" },
							new int[] {}, 2, "15:30", "17:00",
							"Auditorio - Ecosistema Innovación", 4, 131),
					new MainAgendaRowItem(
							"Cooperación Iberoamericana en materia de PyMEs",
							"Conocer las ventajas para las Pequeñas y Medianas Empresas que tienen los programas, acuerdos y compromisos que se adquieren en la cumbres de Cooperación Iberoamericana.",
							new String[] { "Mtra. Doris Osterlof Obregón" },
							new String[] { "Secretaría General Iberoamericana (SEGIB)" },
							new int[] {}, 2, "15:30", "16:30",
							"Palacio de la Canal 1 - Alianzas Globales", 0, 132),
					new MainAgendaRowItem(
							"m2m y la revolución digital aplicado a las PyMES",
							"Las soluciones digitales han revolucionado el mundo de los negocios, gracias a sus aportaciones para mejorar rentabilidad, tiempos, logística y un sinfín de beneficios. Se describirá la manera en que las soluciones m2m (machine to machine) operan para hacer crecer a las PyMES.",
							new String[] { "M.A.O Eric Alfredo Ríos Rocha" },
							new String[] { "Movistar México" }, new int[] {},
							2, "15:30", "17:00",
							"Palacio de la Canal 10 - Streaming",
							ECOSYSTEM_DIGITAL_ENTERPRISE, 133),
					new MainAgendaRowItem(
							"Todo es posible: todos podemos hacer nuestros sueños realidad",
							"En esta conferencia les contaré mi vida como emprendedor, lo que he aprendido y les compartiré consejos sobre cómo lograr sus objetivos. Los asistentes verán que todo es posible, que los objetivos, con enfoque, perseverancia y paciencia siempre se alcanzan.",
							new String[] { "Lic. Jesús Muñoz" },
							new String[] { "Licenciado en Comercio Internacional por el ITESM y Maestro en Administración por INSEAD" },
							new int[] {}, 2, "15:30", "16:30",
							"Palacio de la Canal 4 - Streaming",
							ECOSYSTEM_ENTREPRENEUR_CAMP, 134),
					new MainAgendaRowItem(
							"Empresas Sociales: un nuevo modelo",
							"Introducción al término de empresa social, exposición de casos de éxito. Se conocerá sobre este nuevo tipo de empresa y cómo incorporar impacto social a cualquier negocio.",
							new String[] { "Moderador: Juan Carlos Domenzain" },
							new String[] { "Promotora Social México" },
							new int[] {}, 2, "15:30", "17:00",
							"Palacio de la Canal 5 - Red Mover a México", 6,
							135),
					new MainAgendaRowItem(
							"Apodérate de tu futuro",
							"La importancia de las certificaciones en particular la de emprendedor de negocios en TI. ",
							new String[] { "Dr. José Raymundo Lira Cortés" },
							new String[] { "Asociación Academia Industria Gobierno en Tecnologías de la Información A.C. (IMPULSA-TI)" },
							new int[] {}, 2, "15:30", "17:00",
							"Palacio de la Canal 6 - Empresa Digital", 3, 136),
					new MainAgendaRowItem(
							"Estrategia y ejecución del lanzamiento para tu negocio",
							"Pasar de un modelo de negocio a realizar las primeras ventas es un trabajo difícil y muchos emprendedores no lo logran. Este taller dará las herramientas necesarias para hacer un lanzamiento exitoso.",
							new String[] { "Dimitrio Gómez" },
							new String[] { "Venture Institute" }, new int[] {},
							2, "15:30", "16:30",
							"Palacio de la Canal 9 - Campamento Emprendedor",
							1, 137),
					new MainAgendaRowItem(
							"Crea la página web de tu negocio:  ¿cómo y por qué?",
							"Queremos que tu negocio este en internet. Alcance, impacto y nuevos clientes son solo algunos de los beneficios. Es gratis y no necesitas conocimientos técnicos. No tienes excusa.",
							new String[] { "Isabella Lomanto" },
							new String[] { "Jimdo" }, new int[] {}, 2, "16:00",
							"17:00", "Palacio de la Canal 11 - Google",
							ECOSYSTEM_DIGITAL_ENTERPRISE, 138),
					new MainAgendaRowItem(
							"Negocios PyMEs: El crédito",
							"Evaluar la conveniencia de adquirir un crédito para tu negocio con base en las necesidades de éste, a partir de las cuales diseñarás una estrategia a seguir para favorecer el pago puntual del crédito elegido sin poner en riesgo las finanzas del negocio.",
							new String[] { "Lic. Cuauhtémoc Escorcia Reyes" },
							new String[] { "BBVA BANCOMER" }, new int[] {}, 2,
							"16:00", "18:00",
							"Palacio de la Canal 2 - BBVA Bancomer", 2, 139),
					new MainAgendaRowItem(
							"Mejores prácticas de emprendedurismo en México",
							"Información veraz de actividades exitosas en el País que han marcado una diferencia con los emprendedores del Mundo.",
							new String[] { "C.P. Martin Romero Corona " },
							new String[] { "Comisión Nacional de Empresarios Jóvenes Coparmex" },
							new int[] {},
							2,
							"16:00",
							"18:00",
							"Palacio de la Canal 3 - Cultura Financiera y Alto Impacto",
							2, 140),
					new MainAgendaRowItem(
							"Innovando la PyME con SAP ",
							"Se conocerán las tendencias de tecnología y cómo las soluciones integradas de planificación de recursos empresariales ayudan a las empresas a ser más productivas y rentables.",
							new String[] { "Luis Avila León de la Barra" },
							new String[] { "SAP" },
							new int[] {},
							2,
							"16:00",
							"17:00",
							"Palacio de la Canal 7 - Sectores Estratégicos y Competitividad Regional",
							7, 141),
					new MainAgendaRowItem(
							"Cuenta cuentos los vengadores: salvar el día",
							"Cómic para fomentar la educación financiera. Con la combinación de los personajes icónicos de Marvel, incluidos los Vengadores y Spiderman, así como la experiencia en educación financiera de Visa, se presenta un original cómic.",
							new String[] { "Cuenta cuentos" },
							new String[] { "Visa México" }, new int[] {}, 2,
							"16:00", "17:00", "Pasarela - Cultura Financiera",
							2, 142),
					new MainAgendaRowItem(
							"Democratización de la Productividad",
							"Democratización de la productividad",
							new String[] { "Dr. Luis Videgaray Caso" },
							new String[] { "Realizó estudios de Economía en el Instituto Tecnológico Autónomo de México (ITAM), "
									+ "en donde presidió el Consejo de Alumnos. Se graduó en 1994 con la tesis de licenciatura "
									+ "Fallas del mercado, regulación e incentivos: el caso de la privatización de los puertos "
									+ "mexicanos, por la que obtuvo el Premio Banamex de Economía en 1995. Obtuvo el doctorado "
									+ "en Economía, con especialidad en Finanzas Públicas, por el Massachusetts Institute of "
									+ "Technology (MIT), donde defendió la tesis «The Fiscal Response to Oil Shocks» («La "
									+ "respuesta fiscal a los choques petroleros») en 1998. Posteriormente ejerció la docencia "
									+ "en el propio ITAM y la Universidad Iberoamericana." },
							new int[] { R.drawable.speaker_luis_videgaray }, 2,
							"17:00", "19:00", "Valparaiso 3 - Magistrales", 8,
							143),
					new MainAgendaRowItem(
							"Identidad de marca: Aprende estrategias para diferenciarte de los demás",
							"Cómo una buena identidad potencializa y diferencia tu negocio. Las reglas del branding. Mini manual de los 10 pasos que debes tomar en cuenta para construir una identidad poderosa. ",
							new String[] { "Rebeca Castro y Thaina Garza" },
							new String[] { "Branding Boutique" }, new int[] {},
							2, "16:30", "18:00",
							"Palacio de la Canal 4 - Streaming",
							ECOSYSTEM_ENTREPRENEUR_CAMP, 144),
					new MainAgendaRowItem(
							"Haciendo negocios con el mercado de América del Norte",
							"Permitirá conocer e identificar los requisitos, oportunidades y estrategias para exportar al Mercado Norteamericano.",
							new String[] { "AmCham - Embajada de Canadá en México" },
							new String[] { "AmCham - Embajada de Canadá en México" },
							new int[] {}, 2, "17:00", "18:30",
							"Palacio de la Canal 1 - Alianzas Globales", 0, 145),
					new MainAgendaRowItem(
							"Cómo atraer prospectos sin límite en tu negocio",
							"Compartir con los empresarios de Pequeñas y Medianas Empresas cómo desarrollar una estrategia de marketing magnético, aplicable a cualquier medio de contacto (on line y off line) orientada a atraer de manera permanente a los mejores prospectos para su negocio.",
							new String[] { "Enrique de J. Gómez - Gordillo Ruelas" },
							new String[] { "Consultor en Mercadotecnia y Ventas" },
							new int[] {}, 2, "17:00", "19:00",
							"Palacio de la Canal 10 - Streaming",
							ECOSYSTEM_INNOVATION, 146),
					new MainAgendaRowItem(
							"La nube puede transformar tu negocio",
							"Puedes trabajar desde cualquier lugar a cualquier hora? Dependes de tu móvil para acceder a los archivos e información de tu negocio? Puedes ser más eficiente en movimiento?",
							new String[] { "Carlos Restrepo" },
							new String[] { "Google" }, new int[] {}, 2,
							"17:00", "18:00",
							"Palacio de la Canal 11 - Google",
							ECOSYSTEM_DIGITAL_ENTERPRISE, 147),
					new MainAgendaRowItem(
							"Taller de negociación ganar - ganar",
							"El participante desarrollará estrategias de negociación y aplicará técnicas que le ayuden a: identificar las oportunidades de negociación, conocer y mejorar sus técnicas de planteamiento de negociación, conocer y explotar las técnicas de negociación, ejercitará mediante casos en diferentes situaciones de negociación.",
							new String[] { "Erick Alberto Pérez Rauda" },
							new String[] { "Rauda Consultores" }, new int[] {},
							2, "17:00", "18:00",
							"Palacio de la Canal 9 - Campamento Emprendedor",
							1, 148),
					new MainAgendaRowItem(
							"Steve Jobs no es el mercado",
							"Una demostración clara de que las iniciativas de innovación operan en función del mercado y no al revés. Se utiliza la herramienta tecnológica denominada Gamification como soporte de la exposición.",
							new String[] { "David César de la Vega Bautista" },
							new String[] { "EvArt Consulting" }, new int[] {},
							2, "17:30", "19:30",
							"Auditorio - Ecosistema Innovación", 4, 149),
					new MainAgendaRowItem(
							"Modelos alternativos de crecimiento y expansión empresarial",
							"Se dará al asistente un acercamiento a temas de acceso a tecnología, capital, capacitación y consultoría, así como alternativas de crecimiento mediante acceso a fondos o modelos colaborativos o alianzas estratégicas como franquicias o distribución.",
							new String[] { "Lic. Enrique U. Alcázar" },
							new String[] { "Alcázar & Compañia, S.A de C.V. NETBA" },
							new int[] {}, 2, "17:30", "19:00",
							"Palacio de la Canal 5 - Red Mover a México", 6,
							150),
					new MainAgendaRowItem(
							"Reactivación económica y prevención social ",
							"Dar a conocer el trabajo de la Comisión Intersecretarial para la Prevención Social de la Violencia y la Delincuencia, en el marco del Programa Nacional en la materia, con especial énfasis en los programas y acciones del sector económico; que contribuyen al desarrollo económico y social de las poblaciones objetivo ubicadas en las demarcaciones atendidas.",
							new String[] { "Dra. Alma Eunice Rendón Cárdenas" },
							new String[] { "Subsecretaría de Prevención y Participación Ciudadana - SEGOB" },
							new int[] {},
							2,
							"17:30",
							"18:30",
							"Palacio de la Canal 7 - Sectores Estratégicos y Competitividad Regional",
							7, 151),
					new MainAgendaRowItem(
							"Innovación: factor de rentabilidad en las organizaciones",
							"Los participantes conocerán metodologías para innovar, entenderán la relación innovación - rentabilidad así como el impacto de la creatividad en las organizaciones.",
							new String[] { "Mtto. Iván Serdán González" },
							new String[] { "QuantumLeapVenture" },
							new int[] {}, 2, "17:30", "18:30",
							"Palacio de la Canal 8 - Innovación", 4, 152),
					new MainAgendaRowItem(
							"POSIBLE: emprendedores de alto impacto",
							"Emprendedores de alto impacto buscan resolver problemas sociales a través de un modelo empresarial en el cual se les incentiva con asesoría, redes de contacto y vinculación con sistemas de apoyo.",
							new String[] { "Panel" },
							new String[] { "POSIBLE tiene como objetivo que más personas consideren emprender para resolver problemas "
									+ "sociales y que tengan un entorno más favorable para hacerlo. Se espera que este esfuerzo "
									+ "contribuya a generar una fuente mas dinámica de proyectos que aprovechen el ecosistema de "
									+ "apoyos al emprendedor." },
							new int[] { R.drawable.speaker_posible }, 2,
							"15:30", "17:00", "Valparaiso 3 - Magistrales", 8,
							153),
					new MainAgendaRowItem(
							"Emprendimiento inteligente con Google Analytics",
							"Entiende el comportamiento de tus clientes en tu sitio web. Optimiza y toma decisiones de negocio utilizando información valiosa en tiempo real. ",
							new String[] { "José Pablo Canal" },
							new String[] { "Google" }, new int[] {}, 2,
							"18:00", "19:00",
							"Palacio de la Canal 11 - Google",
							ECOSYSTEM_DIGITAL_ENTERPRISE, 154),
					new MainAgendaRowItem(
							"El mercado femenino y su rentabilidad en México",
							"Las ventajas y áreas de oportunidad que representa el mercado femenino mexicano y cómo capitalizarlo. Booklet con insights relevantes de las mujeres mexicanas.",
							new String[] { "Rebeca Castro y Thaina Garza" },
							new String[] { "Branding Boutique" }, new int[] {},
							2, "18:00", "19:30",
							"Palacio de la Canal 4 - Streaming",
							ECOSYSTEM_MOVE_MEXICO, 155) },

			/*
			 * DAY 4
			 */
			new MainAgendaRowItem[] {
					new MainAgendaRowItem(
							"Aspectos comerciales para la Exportación a China",
							"Se logrará comprender la parte comercial, logística y aduanera para exportar a China.",
							new String[] { "Lic. Ricardo Antonio Vaca Uribe" },
							new String[] { "Cámara de Comercio y Tecnología China en México " },
							new int[] {}, 3, "10:00", "12:30",
							"Palacio de la Canal 1 - Alianzas Globales", 0, 156),
					new MainAgendaRowItem(
							"Una agencia digital como modelo de negocio para emprender",
							" ¿Estas pensando emprender pero te falta capital?  ¿Quieres hacer algo que tenga un impacto importante sobre tus clientes? Una agencia digital es un negocio que requiere poco capital para iniciar y es una pieza clave para el desarrollo futuro del país. Ven y aprende que necesitas para aprovechar esta gran oportunidad.",
							new String[] { "Alonso Fernández" },
							new String[] { "Google" }, new int[] {}, 3,
							"10:00", "11:00",
							"Palacio de la Canal 11 - Google",
							ECOSYSTEM_DIGITAL_ENTERPRISE, 157),
					new MainAgendaRowItem(
							"Mujeres y liderazgo",
							"Conocer el papel de la mujer como líder y como emprendedora. Conocer el estilo de liderazgo e historias de mujeres emprendedoras con enfoque en la importancia de la equidad de género y la autoestima y el papel de la mujer como emprendedora.",
							new String[] { "Moderadora: Katia Dumont" },
							new String[] { "ANDE" }, new int[] {}, 3, "10:00",
							"11:30",
							"Palacio de la Canal 5 - Red Mover a México", 6,
							158),
					new MainAgendaRowItem(
							"ABC en la medición de marketing digital para e-commerce",
							"Para tomar mejores decisiones de marketing que impacten positivamente en los resultados de un e-commerce, es indispensable contar con datos confiables y transformarlos en información valiosa, por medio del análisis.",
							new String[] { "Mtro. Hebert Hernández Henestrosa" },
							new String[] { "Ábaco Metrics" }, new int[] {}, 3,
							"10:00", "11:30",
							"Palacio de la Canal 6 - Empresa Digital", 3, 159),
					new MainAgendaRowItem(
							"Políticas de desarrollo de clusters en Costa Rica comparadas con el caso mexicano",
							"Los asistentes podrán conocer la política pública para el desarrollo de clusters industriales en Costa Rica y México.",
							new String[] { "Gary Gereffi" },
							new String[] { "Banco Interamericano de Desarrollo (BID)" },
							new int[] {},
							3,
							"10:00",
							"11:30",
							"Palacio de la Canal 7 - Sectores Estratégicos y Competitividad Regional",
							7, 160),
					new MainAgendaRowItem(
							"Presentación del Índice Nacional de Participación Juvenil 2012 (sección MiPyMes) y programas para jóvenes emprendedores ",
							"Informativo. Se presentan datos estadísticos sobre jóvenes emprendedores en México, así como opciones de eventos y talleres a los que pueden asistir para ser canalizados.",
							new String[] { "Greta Ríos y Jorge Madrigal" },
							new String[] { "Ollin, Jóvenes en Movimiento, A.C." },
							new int[] {}, 3, "10:00", "11:00",
							"Palacio de la Canal 9 - Campamento Emprendedor",
							1, 161),
					new MainAgendaRowItem(
							"Taller de creatividad e innovación de negocios",
							"Mediante dinámicas de juego serio como LEGO Serious Play, los asistentes aprenderán a identificar, generar y evaluar oportunidades de negocio rentables. Aprenderán también a innovar propuestas de valor y modelos de negocio. Al finalizar, se llevarán un lienzo con el modelo de negocio (Business Model Canvas) y al cierre de la Semana se premiarán los proyectos más innovadores.",
							new String[] { "Ing. Arturo Salcedo Cárabez, MBA" },
							new String[] { "CITRUS Innovation" }, new int[] {},
							3, "10:00", "14:00",
							"Taller - Ecosistema Innovación", 4, 162),
					new MainAgendaRowItem(
							"Innovación en modelos de negocio y las nuevas reglas de la cadena de valor",
							"Se presentarán temas de competitividad en México, las nuevas reglas del juego en la cadena de valor, herramientas de innovación, metodología Canvas para innovación de modelos de negocio, haciendo énfasis en que la innovación es un esfuerzo de colaboración entre diferentes personas y grupos multidisciplinarios. Fundamentos de innovación en base al manual de Oslo y conocer las nuevas reglas de valor en base a plataformas digitales.",
							new String[] { "M.C. Horman Millán Sánchez" },
							new String[] { "ITS Trade and Tech Solutions" },
							new int[] {}, 3, "10:30", "12:30",
							"Palacio de la Canal 8 - Innovación", 4, 163),
					new MainAgendaRowItem(
							"La nube puede transformar tu negocio",
							"Introducción a las tendencias de tecnología en la nube y como los negocios pueden ser más eficientes y seguros. Hablaremos de como usar herramientas de colaboración y la infraestructura de aplicaciones en la nube para hacer más eficiente a tu negocio.",
							new String[] { "Erin Winslow" },
							new String[] { "Google" }, new int[] {}, 3,
							"11:00", "12:00",
							"Palacio de la Canal 11 - Google",
							ECOSYSTEM_DIGITAL_ENTERPRISE, 164),
					new MainAgendaRowItem(
							"Negocios PyMEs: El crédito",
							"Evaluar la conveniencia de adquirir un crédito para tu negocio con base en las necesidades de éste, a partir de las cuales diseñarás una estrategia a seguir para favorecer el pago puntual del crédito elegido sin poner en riesgo las finanzas del negocio.",
							new String[] { "Lic. María Inglaterra Islas Borboa" },
							new String[] { "BBVA BANCOMER" }, new int[] {}, 3,
							"11:00", "13:00",
							"Palacio de la Canal 2 - BBVA Bancomer", 2, 165),
					new MainAgendaRowItem(
							"Cuenta cuentos los vengadores: salvar el día",
							"Cómic para fomentar la educación financiera. Con la combinación de los personajes icónicos de Marvel, incluidos los Vengadores y Spiderman, así como la experiencia en educación financiera de Visa, se presenta un original cómic.",
							new String[] { "Cuenta cuentos" },
							new String[] { "Visa México" }, new int[] {}, 3,
							"11:00", "12:00", "Pasarela - Cultura Financiera",
							2, 166),
					new MainAgendaRowItem(
							"Anatomía y funcionamiento del cluster de televisores en Baja California",
							"Conocer la estructura del cluster de televisores en Baja California (México) uno de los más importantes en el mundo.",
							new String[] { "Dr. Jorge H. Carrillo" },
							new String[] { "Banco Interamericano de Desarrollo (BID)" },
							new int[] {},
							3,
							"11:30",
							"13:00",
							"Palacio de la Canal 7 - Sectores Estratégicos y Competitividad Regional",
							7, 167),
					new MainAgendaRowItem(
							"La constitución de tu sociedad:  ¿qué, con quién y cómo? ",
							"1.- Análisis: De las diferentes estructuras de las sociedades desde la perspectiva de los riesgos involucrados en utilizar la generalidad de la ley (S.A. de C.V., S de R.L., SAPI). 2.- Consecuencias: De los posibles escenarios involucrados con utilizar la generalidad de la ley como fuente de derechos de los socios o accionistas. 3.- Soluciones: Análisis de estrategias legales que permiten aterrizar la generalidad de la ley a los casos específicos más frecuentes en las MiPymes.",
							new String[] { "Lic. Mónica Martínez Brambila" },
							new String[] { "Correduría Pública" },
							new int[] {}, 3, "11:30", "14:30",
							"Palacio de la Canal 9 - Campamento Emprendedor",
							1, 168),
					new MainAgendaRowItem(
							"Desarrollo rápido de productos innovadores para mercados emergentes",
							"Se mostrará una caja de herramientas para el desarrollo de productos innovadores (bienes o servicio), así como la oportunidad de tomar un curso a profundidad sobre el proceso de innovación en la plataforma de cursos en línea abiertos y masivos 'Coursera'.",
							new String[] { "David Carlos Romero Díaz " },
							new String[] { "ITESM" }, new int[] {}, 3, "12:00",
							"13:30", "Auditorio - Ecosistema Innovación", 4,
							169),
					new MainAgendaRowItem(
							"Estrategias de monetización web: tu sitio web puede trabajar para tí (inglés)",
							"Tu página de internet puede generarte ingresos adicionales sin importar de que se trate tu negocio, nosotros te enseñaremos las claves para lograr ingresos por publicidad en Internet.",
							new String[] { "David Hyman" },
							new String[] { "Google" }, new int[] {}, 3,
							"12:00", "13:00",
							"Palacio de la Canal 11 - Google",
							ECOSYSTEM_DIGITAL_ENTERPRISE, 170),
					new MainAgendaRowItem(
							"Emprendedores de alto impacto",
							"Panel en donde se contará con la participación de cuatro emprendedores disruptivos que compartirán las decisiones clave para un emprendimiento de alto impacto.",
							new String[] { "Dr. Luis Aguirre-Torres" },
							new String[] { "Green Momentum" },
							new int[] {},
							3,
							"12:00",
							"13:00",
							"Palacio de la Canal 3 - Cultura Financiera y Alto Impacto",
							2, 171),
					new MainAgendaRowItem(
							"Fútbol Financiero",
							"Fútbol Financiero es un juego interactivo para computadora diseñado para que los jóvenes - adultos contemporáneos conozcan los distintos temas financieros a los que se enfrentarán como adultos jóvenes. Combina el deporte con una guía de estudio sobre conceptos básicos de finanzas personales.",
							new String[] { "Taller" },
							new String[] { "Visa México" }, new int[] {}, 3,
							"12:00", "13:00",
							"Sala Naranja - Cultura Financiera", 2, 172),
					new MainAgendaRowItem(
							"Innovación en internet: crecimiento para México y para todas las empresas",
							"El acceso libre a la información y la capacidad de conectar a las personas con otras personas, ideas y organizaciones, de forma relevante, fácil y en el momento correcto, se han convertido en un factor trascendental de eficiencia y productividad que abre más y mejores oportunidades para el desempeño profesional y el emprendimiento.",
							new String[] { "Lic. Miguel Ángel Alva" },
							new String[] { "Miguel está a cargo de la dirección estratégica de la marca de Google en Latino América desde "
									+ "2007. Ha dirigido importantes lanzamientos para Google en la región, como YouTube, Google Maps, "
									+ "Google Chrome. También lidera las investigaciones de mercado en el país." },
							new int[] { R.drawable.speaker_miguel_alva }, 3,
							"12:00", "13:30", "Valparaiso 3 - Magistrales", 8,
							173),
					new MainAgendaRowItem(
							"PROMEXICO: exportando al mundo",
							"El participante tendrá información sobre los principales mercados para sus productos.",
							new String[] { "Mtra. Elena Achar Samra y Lic. Ricardo de la Peña" },
							new String[] { "PROMEXICO" }, new int[] {}, 3,
							"13:00", "14:30",
							"Palacio de la Canal 1 - Alianzas Globales", 0, 174),
					new MainAgendaRowItem(
							"El programa de desarrollo de clusters en el BID y México",
							"Los empresarios y asistentes podrán conocer como se han desarrollado los clusters en América Latina y en México.",
							new String[] { "Dr. Carlo Pietrobelli y Dr. Gregorio Arévalo" },
							new String[] { "Banco Interamericano de Desarrollo (BID)" },
							new int[] {}, 3, "13:00", "14:30",
							"Palacio de la Canal 4 - Streaming",
							ECOSYSTEM_STRATEGIC_SECTORS, 175),
					new MainAgendaRowItem(
							"Todo lo que deseas saber sobre comercio electronico y nunca te atreviste a preguntar",
							"Se mostrarán los conceptos básicos del comercio electrónico, los tipos de sistemas para poder iniciarse, brindar estrategias si eres comerciante de productos o si vendes servicios te mostraremos como convertir un servcio intangible en una oportunidad para vender más en línea.",
							new String[] { "Mtro. Virgilio Serrano Vera" },
							new String[] { "BPM Consultants Group" },
							new int[] {}, 3, "13:00", "14:30",
							"Palacio de la Canal 6 - Empresa Digital", 3, 176),
					new MainAgendaRowItem(
							"Integración de la artesanía en una economía contemporánea",
							"Encontrar innovación en el desarrollo productivo de comunidades artesanales en donde el artesano aprenda innovación en los procesos creativos, estrategias de creatividad y replantear la línea productiva que genera.",
							new String[] { "Christian Vivanco" },
							new String[] { "CEDIM, Centro de Estudios Superiores de Diseño de Monterrey" },
							new int[] {}, 3, "13:00", "14:00",
							"Palacio de la Canal 8 - Innovación", 4, 177),
					new MainAgendaRowItem(
							"Visa - Aceptación móvil de tarjetas",
							"El objetivo de la conferencia es presentar la nueva forma de cobrar con tarjetas en dispositivos móviles, sin trámites complicados, sin contratos a largo plazo, sin comisiones fijas mensuales y sin montos mínimos de ventas con tarjetas.",
							new String[] { "Luis Arceo" },
							new String[] { "Visa International / iZettle México" },
							new int[] {}, 3, "13:00", "13:30",
							"Pasarela - Cultura Financiera", 2, 178),
					new MainAgendaRowItem(
							" ¿Existe la transferencia del conocimiento en México?",
							"Abordar el tema de la transferencia de conocimiento, desde diferentes perspectivas, abordando el punto de vista de las empresas, la OT de un Centro de Investigación público, una OT privada, un fondo, un investigador y un consultor legal.",
							new String[] { "Panel - moderadora: MBA. Belén Martínez López" },
							new String[] { "Carameltech, S.A. de C.V." },
							new int[] {}, 3, "13:30", "15:00",
							"Auditorio - Ecosistema Innovación", 4, 179),
					new MainAgendaRowItem(
							"Pon tu negocio en el mapa de la era digital",
							"Tus clientes ya te están buscando. Deja que te encuentren poniendo a tu negocio en el mapa de la era digital, con información detallada de su empresa, conoce la oportunidad de utilizar otras plataformas de Google para sus negocios.",
							new String[] { "Octavio Cisneros" },
							new String[] { "Google" }, new int[] {}, 3,
							"14:00", "15:00",
							"Palacio de la Canal 11 - Google",
							ECOSYSTEM_DIGITAL_ENTERPRISE, 180),
					new MainAgendaRowItem(
							"Ventas para pequeños negocios",
							"Capacitar a empresarios y directivos de las Micro, Pequeñas y Medianas Empresas que tengan interés en conocer la metodología para establecer un modelo efectivo de ventas.",
							new String[] { "M.A. Juan Carlos Cabrera López" },
							new String[] { "Nacional Financiera, S.N.C." },
							new int[] {},
							3,
							"14:00",
							"16:00",
							"Palacio de la Canal 3 - Cultura Financiera y Alto Impacto",
							2, 181),
					new MainAgendaRowItem(
							"El flujo de efectivo: Negocios PyMEs",
							"La importancia de administrar tu negocio identificando y mejorando el flujo de efectivo. Aprendiendo a no mezclar las finanzas personales con las de tu negocio.",
							new String[] { "Lic. Ana Mota Alvarado" },
							new String[] { "BBVA Bancomer" }, new int[] {}, 3,
							"14:00", "15:00",
							"Sala Morada - Cultura Financiera", 2, 182),
					new MainAgendaRowItem(
							"Fortaleciendo la productividad y el ambiente para hacer negocios en México",
							"Los participantes tendrán las herramientas necesarias sobre la operación del SARE, además de que fortalecerán sus capacidades técnicas para mejorar el ambiente para hacer negocios , el cual involucra una política de mejora regulatoria en los tres órdenes de gobierno.",
							new String[] { "Lic. David R. Samadi Castilla" },
							new String[] { "Comisión Federal de Mejora Regulatoria (COFEMER) " },
							new int[] {},
							3,
							"14:30",
							"15:30",
							"Palacio de la Canal 7 - Sectores Estratégicos y Competitividad Regional",
							7, 183),
					new MainAgendaRowItem(
							"Crea la página web de tu negocio:  ¿cómo y por qué?",
							"Queremos que tu negocio este en internet. Alcance, impacto y nuevos clientes son solo algunos de los beneficios. Es gratis y no necesitas conocimientos técnicos. No tienes excusa.",
							new String[] { "Eila Lifflander" },
							new String[] { "Jimdo" }, new int[] {}, 3, "15:00",
							"16:00", "Palacio de la Canal 11 - Google",
							ECOSYSTEM_DIGITAL_ENTERPRISE, 184),
					new MainAgendaRowItem(
							"El flujo de efectivo: Negocios PyMEs",
							"Evaluar la conveniencia de aplicar estrategias para mejorar el manejo del flujo de efectivo, que involucran acciones que le permitan administrar y favorecer la solvencia económica de su negocio o proyecto de negocio.",
							new String[] { "Lic. Ana Mota Alvarado" },
							new String[] { "BBVA BANCOMER" }, new int[] {}, 3,
							"15:00", "16:00",
							"Palacio de la Canal 2 - BBVA Bancomer", 2, 185),
					new MainAgendaRowItem(
							"Cuenta cuentos los vengadores: salvar el día",
							"Cómic para fomentar la educación financiera. Con la combinación de los personajes icónicos de Marvel, incluidos los Vengadores y Spiderman, así como la experiencia en educación financiera de Visa, se presenta un original cómic.",
							new String[] { "Cuenta cuentos" },
							new String[] { "Visa México" }, new int[] {}, 3,
							"15:00", "16:00", "Pasarela - Cultura Financiera",
							2, 186),
					new MainAgendaRowItem(
							"Cómo hacer crecer tu negocio",
							"En esta conferencia los emprendedores recibirán información fundamental acerca de cómo iniciar un negocio, de cómo comercializar un negocio ya establecido y de cómo llevar las Finanzas en el mismo. Al final de la conferencia los emprendedores tendrán mejores fundamentos de Negocio.",
							new String[] { "Act. Carlos Corominas" },
							new String[] { "Visa Inc." }, new int[] {}, 3,
							"15:00", "16:00",
							"Sala Naranja - Cultura Financiera", 2, 187),
					new MainAgendaRowItem(
							"Taller de creatividad e innovación de negocios",
							"Mediante dinámicas de juego serio como LEGO Serious Play, los asistentes aprenderán a identificar, generar y evaluar oportunidades de negocio rentables. Aprenderán también a innovar propuestas de valor y modelos de negocio. Al finalizar, se llevarán un lienzo con el modelo de negocio (Business Model Canvas) y al cierre de la Semana se premiarán los proyectos más innovadores.",
							new String[] { "Ing. Arturo Salcedo Cárabez, MBA" },
							new String[] { "CITRUS Innovation" }, new int[] {},
							3, "15:00", "18:00",
							"Taller - Ecosistema Innovación", 4, 188),
					new MainAgendaRowItem(
							"Propiedad Industrial: protege y patenta",
							"Se explicará a los asistentes la importancia de que los inventos trasciendan a una patente. Los asistentes identificarán cada una de las figuras de protección en materia de invenciones, así como el procedimiento para su registro.",
							new String[] { "QFB Nahanny Canal " },
							new String[] { "Instituto Mexicano de la Propiedad Industrial" },
							new int[] {}, 3, "15:30", "17:00",
							"Auditorio - Ecosistema Innovación", 4, 189),
					new MainAgendaRowItem(
							"Estrategia exitosa para el mercado hispano en USA",
							"Se informará sobre el potencial para sus productos y servicios a través de una estrategia de comercialización o distribución en los principales centros de consumo de Estados Unidos.",
							new String[] { "MBA. Juan Carlos Guerrero A." },
							new String[] { "Consejo Empresarial Hispano" },
							new int[] {}, 3, "15:30", "16:30",
							"Palacio de la Canal 1 - Alianzas Globales", 0, 190),
					new MainAgendaRowItem(
							"Tips legales y financieros para tu empresa",
							"Revisión de tips clave para tu empresa y consejos personalizados, se tendrá una lista de puntos clave para cualquier negocio y podrán solucionar dudas puntuales.",
							new String[] { "Moderadora: Ana Echeverri" },
							new String[] { "Crea" }, new int[] {}, 3, "15:30",
							"17:00",
							"Palacio de la Canal 5 - Red Mover a México", 6,
							191),
					new MainAgendaRowItem(
							"Dinámicas y herramientas para trabajar con emprendedores y líderes comunitarios en el sur del país",
							"Se ofrecerán algunos ejemplos de las dinámicas que se utilizan en el trabajo de impulso al emprendimiento, así como una charla con la descripción del panorama sobre el ecosistema emprendedor en el sur del país.",
							new String[] { "Peter Salmon" },
							new String[] { "HUB Oaxaca" }, new int[] {}, 3,
							"15:30", "16:30",
							"Palacio de la Canal 9 - Campamento Emprendedor",
							1, 192),
					new MainAgendaRowItem(
							"Visibilidad e impacto para tu negocio en internet con Adwords Express",
							" ¿Alguna vez has querido anunciar tu negocio en internet, pero no quieres pasar horas entendiendo y configurando una campaña? Con AdWords Express, nosotros nos encargamos de tu publicidad mientras que tu te encargas de tu negocio.",
							new String[] { "Jorge Gutierrez Luthe" },
							new String[] { "Google" }, new int[] {}, 3,
							"16:00", "17:00",
							"Palacio de la Canal 11 - Google",
							ECOSYSTEM_DIGITAL_ENTERPRISE, 193),
					new MainAgendaRowItem(
							"Negocios PyMEs: El crédito",
							"Evaluar la conveniencia de adquirir un crédito para tu negocio con base en las necesidades de éste, a partir de las cuales diseñarás una estrategia a seguir para favorecer el pago puntual del crédito elegido sin poner en riesgo las finanzas del negocio.",
							new String[] { "Lic. Cuauhtémoc Escorcia Reyes" },
							new String[] { "BBVA BANCOMER" }, new int[] {}, 3,
							"16:00", "18:00",
							"Palacio de la Canal 2 - BBVA Bancomer", 2, 194),
					new MainAgendaRowItem(
							"Implementación de un laboratorio de pruebas y tecnologías aeronáuticas",
							"Se dará a conocer la descripción del proyecto del desarrollo de la implementación del primer laboratorio público aeronáutico de CONACYT.",
							new String[] { "M.C. José Luis Cuéllar Vázquez" },
							new String[] { "CIATEQ, A.C" },
							new int[] {},
							3,
							"16:00",
							"17:00",
							"Palacio de la Canal 7 - Sectores Estratégicos y Competitividad Regional",
							7, 195),
					new MainAgendaRowItem(
							"Principales barreras a la innovación organizacional en Latinoamérica y como sobreponerlas",
							"Los asistentes se harán conscientes de las diez principales barreras que imposibilitan crear una cultura de innovación en sus empresas, con ejemplos de cada una de éstas. Igualmente podrán llegar a sus propias conclusiones respecto a como sobreponer esas barreras en su propia organización. ",
							new String[] { "Luis Arnal " },
							new String[] { "Insitum" }, new int[] {}, 3,
							"16:00", "17:00",
							"Palacio de la Canal 8 - Innovación", 4, 196),
					new MainAgendaRowItem(
							"Fútbol Financiero",
							"Fútbol Financiero es un juego interactivo para computadora diseñado para que los jóvenes - adultos contemporáneos conozcan los distintos temas financieros a los que se enfrentarán como adultos jóvenes. Combina el deporte con una guía de estudio sobre conceptos básicos de finanzas personales.",
							new String[] { "Taller" },
							new String[] { "Visa México" }, new int[] {}, 3,
							"16:00", "17:00",
							"Sala Naranja - Cultura Financiera", 2, 197),
					new MainAgendaRowItem(
							"Las debilidades de las MiPyMEs y su impacto en el desarrollo de la economía",
							"Con su estilo único fuerte, claro  habla acerca de las debilidades que enfrentan las MiPyMEs, destacando los principales problemas de su desarrollo.",
							new String[] { "Mtro. Eduardo Ruiz-Healy" },
							new String[] { "Inició su carrera de periodista escribiendo en los principales diarios y revistas de la Ciudad "
									+ "de México y llegó a la Radio en 1989 con grupo Radio Fórmula en programas de radio y televisión "
									+ "que han sido grandes éxitos: “Fuego Cruzado”, “Línea de Fuego”, “Frente a Usted”, “Fórmula "
									+ "Financiera”, entre muchos otros. Actualmente dirige y conduce el Noticiario “Eduardo Ruiz-Healy”" },
							new int[] { R.drawable.speaker_eduardo_ruiz }, 3,
							"16:00", "17:30", "Valparaiso 3 - Magistrales", 8,
							198),
					new MainAgendaRowItem(
							"Identidad de marca: Aprende estrategias para diferenciarte de los demás",
							"Cómo una buena identidad potencializa y diferencia tu negocio. Las reglas del branding. Mini manual de los 10 pasos que debes tomar en cuenta para construir una identidad poderosa.",
							new String[] { "Rebeca Castro y Thaina Garza" },
							new String[] { "Branding Boutique" }, new int[] {},
							3, "16:30", "18:00",
							"Palacio de la Canal 4 - Streaming",
							ECOSYSTEM_ENTREPRENEUR_CAMP, 199),
					new MainAgendaRowItem(
							"Consorcios de exportación",
							"Conocer como funciona el modelo empresarial italiano (exitoso a nivel mundial):  ¿Que son los consorcio de exportación,consorcios de calidad y distritos industriales?",
							new String[] { "Lic. Alberico Peyron" },
							new String[] { "Cámara de Comercio Italiana en México" },
							new int[] {}, 3, "17:00", "18:00",
							"Palacio de la Canal 1 - Alianzas Globales", 0, 200),
					new MainAgendaRowItem(
							"13 técnicas de ventas para que tu negocio crezca",
							"Colaborar con el desarrollo empresarial de los emprendedores y empresarios asistentes, a través de la revsión de 13 técnicas de ventas desarrolladas a partir de un enfoque de marketing de respuesta directa.",
							new String[] { "Enrique de J. Gómez - Gordillo Ruelas" },
							new String[] { "Consultor en Mercadotecnia y Ventas" },
							new int[] {}, 3, "17:00", "19:00",
							"Palacio de la Canal 10 - Streaming",
							ECOSYSTEM_FINANCIAL_CULTURE, 201),
					new MainAgendaRowItem(
							"Crece tu negocio con Google Adwords y los Partners Premium para la PyME",
							"Se presentarán los factores que afectan la efectividad de una campaña en Google AdWords.",
							new String[] { "Rogelio Montekio" },
							new String[] { "Google" }, new int[] {}, 3,
							"17:00", "18:00",
							"Palacio de la Canal 11 - Google",
							ECOSYSTEM_DIGITAL_ENTERPRISE, 202),
					new MainAgendaRowItem(
							"Profesor Q, descubre la magia de tu poder financiero",
							"Obra de teatro que a través de la magia busca revelar, de manera dinámica y divertida, los conceptos básicos de las finanzas personales. En la obra, el Profesor Q transforma a las finanzas personales en una mágica experiencia de aprendizaje, llena de diversión e ilusionismo.",
							new String[] { "Obra de Teatro" },
							new String[] { "VISA México" },
							new int[] {},
							3,
							"17:00",
							"18:00",
							"Palacio de la Canal 3 - Cultura Financiera y Alto Impacto",
							2, 203),
					new MainAgendaRowItem(
							"Nunca dejes de innovar: Cómo agregar valor a tu modelo de negocio",
							"Se dará a los asistentes las herramientas teóricas y prácticas para que puedan agregar valor a su negocio a través de la innovación en cada uno de los componentes de su modelo (producto, clientes, canales de distribución, costos, ingresos, alianzas clave, etc.).",
							new String[] { "Laura Suárez Samper / Jorge Peralta" },
							new String[] { "Revista Entrepreneur" },
							new int[] {}, 3, "17:00", "18:30",
							"Palacio de la Canal 9 - Campamento Emprendedor",
							1, 204),
					new MainAgendaRowItem(
							"e-Commerce: la nueva forma de hacer negocios",
							"Se abordarán los principales temas de la Guía para el desarrollo de plataformas de comercio electrónico, entre los que se incluyen las mejores prácticas en diversos aspectos del eCommerce como: dominios, organización, infraestructura, mercadotecnia, entre otros.",
							new String[] { "Lic. Víctor de la Barrera" },
							new String[] { "Visa México" }, new int[] {}, 3,
							"17:00", "18:00",
							"Sala Naranja - Cultura Financiera", 2, 205),
					new MainAgendaRowItem(
							"Habilidades y pensamiento de diseño para emprendedores",
							"En los últimos años, muchos startups exitosos han sido fundados por personas que provienen del mundo de diseño. Se analizarán las habilidades y forma de pensar que tienen los diseñadores (i.e. la tolerancia a la incertidumbre, la empatía, la observación, el pensamiento visual, etc.) que cualquier persona puede desarrollar. Se proveen ejemplos y ejercicios para cada una de las habilidades.",
							new String[] { "Luis Arnal" },
							new String[] { "Insitum" }, new int[] {}, 3,
							"17:30", "18:30",
							"Auditorio - Ecosistema Innovación", 4, 206),
					new MainAgendaRowItem(
							"Idea: hacer el bien para que te vaya bien",
							"Los fundadores expondrán como la empresa pasó de idea a una clínica piloto y próximamaente a un proyecto con escala para ayudar a eliminar la ceguera innecesaria en México.",
							new String[] { "Javier Okhuysen y Carlos Orellana" },
							new String[] { "SalaUno" }, new int[] {}, 3,
							"17:30", "19:00",
							"Palacio de la Canal 5 - Red Mover a México", 6,
							207),
					new MainAgendaRowItem(
							"La Asociatividad como herramienta competitiva: más allá de los clusters",
							"El ponente hará un recorrido sobre la evolución histórica de distintos modelos asociativos en el mundo, contrastando diferentes tipos de esquemas asociativos e ilustrando las mejores prácticas asociativas para generar empresas altamente efectivas y promover el desarrollo regional.",
							new String[] { "Dr. Salvador Humberto Ávila Cobo" },
							new String[] { "Conservelopment International Corporation" },
							new int[] {},
							3,
							"17:30",
							"18:30",
							"Palacio de la Canal 7 - Sectores Estratégicos y Competitividad Regional",
							7, 208),
					new MainAgendaRowItem(
							"Neuroinnovación",
							"Los asistentes se llevarán conceptos muy poderosos sobre el cómo innovar y sus implicaciones, que equivalen a muchas horas de lectura de libros e investigación sobre neurociencia aplicada e innovación.",
							new String[] { "Luis Iván de la Fuente Lara" },
							new String[] { "EVO" }, new int[] {}, 3, "17:30",
							"19:00", "Palacio de la Canal 8 - Innovación", 4,
							209),
					new MainAgendaRowItem(
							"Emprendimiento inteligente con Google Analytics",
							"Entiende el comportamiento de tus clientes en tu sitio web. Optimiza y toma decisiones de negocio utilizando información valiosa en tiempo real. ",
							new String[] { "Jorge Bermudez" },
							new String[] { "Google" }, new int[] {}, 3,
							"18:00", "19:00",
							"Palacio de la Canal 11 - Google",
							ECOSYSTEM_DIGITAL_ENTERPRISE, 210),
					new MainAgendaRowItem(
							"El mercado femenino y su rentabilidad en México",
							"Las ventajas y áreas de oportunidad que representa el mercado femenino mexicano y cómo capitalizarlo. Booklet con insights relevantes de las mujeres mexicanas.",
							new String[] { "Rebeca Castro y Thaina Garza" },
							new String[] { "Branding Boutique" }, new int[] {},
							3, "18:00", "19:30",
							"Palacio de la Canal 4 - Streaming",
							ECOSYSTEM_MOVE_MEXICO, 211),
					new MainAgendaRowItem(
							"El arte de negociar",
							"En esta conferencia te enseña cómo lograr lo que más deseas. Por medio de efectivas tácticas y estrategias de negociación podrás convencer a los demás de lo que quieres.",
							new String[] { "María Marín" },
							new String[] { "María Marín es la principal líder de motivación para los Hispanos. En 2012 fue seleccionada por "
									+ "la revista People en Español como una de las 25 mujeres hispanas más poderosas. Es columnista "
									+ "para más de 100 periódicos en Estados Unidos y Latino América. Además es autora de varios "
									+ "bestsellers, incluyendo su mas reciente libro “Si soy tan buena, ¿por qué estoy soltera?”" },
							new int[] { R.drawable.speaker_maria_marin }, 3,
							"17:30", "19:00", "Valparaíso 3 - Magistrales",
							LECTURE, 212) },

			/*
			 * DAY 5
			 */
			new MainAgendaRowItem[] {
					new MainAgendaRowItem(
							"Registra tu marca",
							"Se darán a conocer los principales aspectos y ventajas de registrar las marcas comerciales.",
							new String[] { "M.A. Juan Carlos Cabrera López" },
							new String[] { "Nacional Financiera, S.N.C." },
							new int[] {},
							4,
							"09:00",
							"11:00",
							"Palacio de la Canal 3 - Cultura Financiera y Alto Impacto",
							2, 213),
					new MainAgendaRowItem(
							"Innovación en desarrollo de nuevos productos",
							"En esta conferencia compartimos la metodología utilizada para el desarrollo de nuevos productos. Los asistentes se llevarán una idea de un proceso de innovación aplicado.",
							new String[] { "La Jabonera Centro de Diseño " },
							new String[] { "" }, new int[] {}, 4, "10:00",
							"11:00", "Auditorio - Ecosistema Innovación", 4,
							214),
					new MainAgendaRowItem(
							"Crece tu negocio con Google Adwords y los Partners Premium para la PyME",
							"Se presentarán los factores que afectan la efectividad de una campaña en Google AdWords.",
							new String[] { "Diego Martínez" },
							new String[] { "Google" }, new int[] {}, 4,
							"10:00", "11:00",
							"Palacio de la Canal 11 - Google",
							ECOSYSTEM_DIGITAL_ENTERPRISE, 215),
					new MainAgendaRowItem(
							"Identidad de marca: Aprende estrategias para diferenciarte de los demás",
							"Cómo una buena identidad potencializa y diferencia tu negocio. Las reglas del branding. Mini manual de los 10 pasos que debes tomar en cuenta para construir una identidad poderosa.",
							new String[] { "Thaina Garza y Rebeca Castro" },
							new String[] { "Branding Boutique" }, new int[] {},
							4, "10:00", "11:30",
							"Palacio de la Canal 4 - Streaming",
							ECOSYSTEM_ENTREPRENEUR_CAMP, 216),
					new MainAgendaRowItem(
							"Como acelerar tu negocio en 3 sencillos pasos",
							"Modificar la creencia del público sobre como se maneja un negocio, el rol y actitud del empresario. Establecer bases solidas: cuáles son las 4 + 1 áreas de apalancamiento de la empresa, cómo construir una maquinaria sustentable y sostenible.",
							new String[] { "Mtro. Jorge Arturo Chávez Rueda" },
							new String[] { "Business Coaching Firm" },
							new int[] {}, 4, "10:00", "11:30",
							"Palacio de la Canal 5 - Red Mover a México", 6,
							217),
					new MainAgendaRowItem(
							"El papel de la articulación academia - empresa para el desarrollo competitivo de las MIPyMEs en México",
							"Se analizará la posición tecnológica competitiva de las MIPyMES en México y se describirá cómo las Universidades y Centros de Investigación pueden apoyar al fortalecimiento competitivo en un contexto global de sustitución de importaciones de integración en procesos productivos y de participar en mercados internacionales.",
							new String[] { "Dr. Eduardo A. Ramírez González" },
							new String[] { "Centro Kappa de Conocimiento, S.C." },
							new int[] {},
							4,
							"10:00",
							"11:00",
							"Palacio de la Canal 7 - Sectores Estratégicos y Competitividad Regional",
							7, 218),
					new MainAgendaRowItem(
							"Sensibilización al mundo digital",
							"Se ofrece un macro de oportunidades para PYMES así como una guía de pensamiento para aprovechar herramientas que pueden impulsar su emprendimiento.",
							new String[] { "Sebastián Grassi" },
							new String[] { "CIE " }, new int[] {}, 4, "10:00",
							"11:00",
							"Palacio de la Canal 9 - Campamento Emprendedor",
							1, 219),
					new MainAgendaRowItem(
							"Taller de creatividad e innovación de negocios",
							"Mediante dinámicas de juego serio como LEGO Serious Play, los asistentes aprenderán a identificar, generar y evaluar oportunidades de negocio rentables. Aprenderán también a innovar propuestas de valor y modelos de negocio. Al finalizar, se llevarán un lienzo con el modelo de negocio (Business Model Canvas) y al cierre de la Semana se premiarán los proyectos más innovadores.",
							new String[] { "Ing. Arturo Salcedo Cárabez, MBA" },
							new String[] { "CITRUS Innovation" }, new int[] {},
							4, "10:00", "14:00",
							"Taller - Ecosistema Innovación", 4, 220),
					new MainAgendaRowItem(
							"Muestra tu negocio al mundo: en el mapa de la era digital",
							"Tus clientes ya te están buscando. Deja que te encuentren poniendo a tu negocio en el mapa de la era digital, con información detallada de su empresa, conoce la oportunidad de utilizar otras plataformas de Google para sus negocios.",
							new String[] { "Octavio Cisneros" },
							new String[] { "Google" }, new int[] {}, 4,
							"11:00", "12:00",
							"Palacio de la Canal 11 - Google",
							ECOSYSTEM_DIGITAL_ENTERPRISE, 221),
					new MainAgendaRowItem(
							"Negocios PyMEs: El crédito",
							"Evaluar la conveniencia de adquirir un crédito para tu negocio con base en las necesidades de éste, a partir de las cuales diseñarás una estrategia a seguir para favorecer el pago puntual del crédito elegido sin poner en riesgo las finanzas del negocio.",
							new String[] { "Lic. Cuauhtémoc Escorcia" },
							new String[] { "BBVA BANCOMER " }, new int[] {}, 4,
							"11:00", "13:00",
							"Palacio de la Canal 2 - BBVA Bancomer", 2, 222),
					new MainAgendaRowItem(
							"Cuenta cuentos los vengadores: salvar el día",
							"Cómic para fomentar la educación financiera. Con la combinación de los personajes icónicos de Marvel, incluidos los Vengadores y Spiderman, así como la experiencia en educación financiera de Visa, se presenta un original cómic.",
							new String[] { "Cuenta cuentos" },
							new String[] { "Visa México" }, new int[] {}, 4,
							"11:00", "12:00", "Pasarela - Cultura Financiera",
							2, 223),
					new MainAgendaRowItem(
							"Mujeres emprendedoras: mujeres empresarias",
							"Que las participantes identifiquen los principales obstáculos que les impiden su crecimiento como empresarias y definan algunas acciones para su desarrollo. ",
							new String[] { "M.A. Juan Carlos Cabrera López" },
							new String[] { "Nacional Financiera, S.N.C." },
							new int[] {}, 4, "11:00", "13:00",
							"Sala Morada - Cultura Financiera", 2, 224),
					new MainAgendaRowItem(
							"La puerta de entrada al mercado estadounidense",
							"Se proporcionará información sobre asistencia profesional para expandir sus mercados y lograr su internacionalización.",
							new String[] { "Jill Metcalfe" },
							new String[] { "Casa San Antonio" }, new int[] {},
							4, "11:30", "12:30",
							"Palacio de la Canal 1 - Alianzas Globales", 0, 225),
					new MainAgendaRowItem(
							"El mercado femenino y su rentabilidad en México",
							"Las ventajas y áreas de oportunidad que representa el mercado femenino mexicano y cómo capitalizarlo. Booklet con insights relevantes de las mujeres mexicanas.",
							new String[] { "Rebeca Castro y Thaina Garza" },
							new String[] { "Branding Boutique" }, new int[] {},
							4, "11:30", "13:00",
							"Palacio de la Canal 4 - Streaming",
							ECOSYSTEM_MOVE_MEXICO, 226),
					new MainAgendaRowItem(
							"Nuevas amenazas y ataques cibernéticos: hacia una cultura de prevención sobre seguridad informática entre los emprendedores",
							"Esta conferencia tiene como propósito informar sobre las nuevas modalidades de ataques y delitos cometidos a través del uso de Internet y sistemas de cómputo, así como abordar en forma muy general el marco legal internacional sobre los ciberdelitos y analizar medidas de prevención sobre seguridad de la información que puedan adoptar los emprendedores al hacer uso de las tecnologías de información para promover sus empresas en México y en otros países.",
							new String[] { "Dr. Cristos Velasco San Martin" },
							new String[] { "Protección Datos México (ProtDataMx) " },
							new int[] {}, 4, "11:30", "13:00",
							"Palacio de la Canal 6 - Empresa Digital", 3, 227),
					new MainAgendaRowItem(
							"Empresas sustentables en la era del conocimiento",
							"Brindará las herramientas para que las MiPyMEs utilicen procesos limpios en favor del medio ambiente.",
							new String[] { "Mtro. Gerardo Sánchez Meneses" },
							new String[] { "CICE - BUAP" },
							new int[] {},
							4,
							"11:30",
							"12:30",
							"Palacio de la Canal 7 - Sectores Estratégicos y Competitividad Regional",
							7, 228),
					new MainAgendaRowItem(
							"De la idea al negocio",
							"Taller en el cuál se podrá visualizar a través de la metodología del pensamiento del diseño las piezas necesarias para transformar una idea en un posible modelo de negocios.",
							new String[] { "La Jabonera Centro de Diseño " },
							new String[] { "" }, new int[] {}, 4, "11:30",
							"18:30", "Palacio de la Canal 8 - Innovación", 4,
							229),
					new MainAgendaRowItem(
							"Cultura digital para nuevos negocios",
							"Se ofrece un marco de oportunidades para emprendedores así como una guía de pensamiento para aprovechar herramientas que pueden impulsar su emprendimiento.",
							new String[] { "Agustín Mina Manríquez" },
							new String[] { "NiceFlow " }, new int[] {}, 4,
							"11:30", "12:30",
							"Palacio de la Canal 9 - Campamento Emprendedor",
							1, 230),
					new MainAgendaRowItem(
							"Acelera tu empresa innovando con oportunidades únicas",
							"Concientizar a los asistentes del potencial que tienen sus empresas al ser aceleradas. La idea principal es mostrarles que es tan fácil como aprender las vocales del abecedario.",
							new String[] { "Lic. Ferenz Feher y Lic. Fabián Larrea" },
							new String[] { "Feher & Feher " }, new int[] {}, 4,
							"12:00", "13:30",
							"Palacio de la Canal 10 - Streaming",
							ECOSYSTEM_ENTREPRENEUR_CAMP, 231),
					new MainAgendaRowItem(
							"Crea la página web de tu negocio:  ¿cómo y por qué?",
							"Queremos que tu negocio este en internet. Alcance, impacto y nuevos clientes son solo algunos de los beneficios. Es gratis y no necesitas conocimientos técnicos. No tienes excusa.",
							new String[] { "Isabella Lomanto" },
							new String[] { "Jimdo" }, new int[] {}, 4, "12:00",
							"13:00", "Palacio de la Canal 11 - Google",
							ECOSYSTEM_DIGITAL_ENTERPRISE, 232),
					new MainAgendaRowItem(
							"Fútbol Financiero",
							"Fútbol Financiero es un juego interactivo para computadora diseñado para que los jóvenes - adultos contemporáneos conozcan los distintos temas financieros a los que se enfrentarán como adultos jóvenes. Combina el deporte con una guía de estudio sobre conceptos básicos de finanzas personales.",
							new String[] { "Taller" },
							new String[] { "Visa México" }, new int[] {}, 4,
							"12:00", "13:00",
							"Sala Naranja - Cultura Financiera", 2, 233),
					new MainAgendaRowItem(
							"La innovación en el servicio: como factor de éxito en las organizaciones",
							"Se buscar mostrarle al participante cómo la innovación, particularmente en el sector de los servicios es un factor crítico de éxito para las organizaciones.",
							new String[] { "Miguel Mier" },
							new String[] { "Miguel Mier ha sido el Director de Operaciones de Cinépolis desde el 2003. Previo a su "
									+ "llegada a este puesto, fungió como Director Regional de Operaciones y Gerente de IT, "
									+ "donde desarrolló e implementó el primer software para la operación de salas de cines. "
									+ "Como Director de Operaciones, Miguel esta a cargo de la Operación, Reservación de Filmes, "
									+ "Mercadotecnia, IT, Recursos Humanos, Ventas y Operaciones Internacionales. Durante su "
									+ "gestión, Cinépolis ha pasado de ser una compañía con 530 pantallas en México a ser una "
									+ "empresa que opera 3,000 pantallas en 12 países. Miguel estuvo a cargo del lanzamiento "
									+ "de las oficinas corporativas internacionales de la organización en Costa Rica, India, "
									+ "Brasil y Estados Unidos." },
							new int[] { R.drawable.speaker_miguel_mier }, 4,
							"12:00", "13:30", "Valparaiso 3 - Magistrales", 8,
							234),
					new MainAgendaRowItem(
							"Creatividad: insumo esencial para el crecimiento económico y el desarrollo integral de México",
							"Se hablará sobre la capacidad para convertir a términos cuantitativos las contribuciones derivadas de la creatividad y la innovación en procesos sociales y económicos.",
							new String[] { "Mtro. Ernesto Piedras Feria" },
							new String[] { "Nomismae" }, new int[] {}, 4,
							"12:30", "13:30",
							"Auditorio - Ecosistema Innovación", 4, 235),
					new MainAgendaRowItem(
							"La puerta de entrada al mercado latinoamericano",
							"La oportunidad de realizar negocios a través de herramientas de promoción internacional, desarrollo de agendas de negocios con distribuidores, representantes e importadores especializados del sector al cual se desea exportar, lo que redunda en operaciones concretas de exportación a corto y mediano plazo.",
							new String[] { "Lic. José Gerardo Tajonar Castro" },
							new String[] { "Trade Point México " },
							new int[] {}, 4, "13:00", "14:30",
							"Palacio de la Canal 1 - Alianzas Globales", 0, 236),
					new MainAgendaRowItem(
							"Lean deployment overview (manufactura de clase mundial)",
							"El ponente entregará una idea amplia y genérica del Modelo DEPLOYMENT que integra el Lean Leadership, Lean Management, Lean Manufacturing y que juntos producen la mejora de las operaciones reflejada en los resultados al cliente y al accionista y la sustentabilidad en el mediano y largo plazo.",
							new String[] { "Ing. Francisco Ramírez" },
							new String[] { "LENSYS " },
							new int[] {},
							4,
							"13:00",
							"14:00",
							"Palacio de la Canal 7 - Sectores Estratégicos y Competitividad Regional",
							7, 237),
					new MainAgendaRowItem(
							"Monetización de la innovación: una aproximación práctica",
							"Herramientas de análisis y reflexión respecto a la transformación de una idea de negocio en un modelo viable, sostenible y con retorno de inversión satisfactoria.",
							new String[] { "Carlo Bruno Concha " },
							new String[] { "Innovaris Business Solutions" },
							new int[] {}, 4, "13:00", "14:00",
							"Palacio de la Canal 9 - Campamento Emprendedor",
							1, 238),
					new MainAgendaRowItem(
							"Visa - Aceptación móvil de tarjetas",
							"El objetivo de la conferencia es presentar la nueva forma de cobrar con tarjetas en dispositivos móviles, sin trámites complicados, sin contratos a largo plazo, sin comisiones fijas mensuales y sin montos mínimos de ventas con tarjetas.",
							new String[] { "Luis Arceo" },
							new String[] { "Visa International / iZettle México" },
							new int[] {}, 4, "13:00", "13:30",
							"Pasarela - Cultura Financiera", 2, 239),
					new MainAgendaRowItem(
							"Finanzas para emprendedores: una radiografía de ti para tu negocio",
							"Como estoy yo, estará mi negocio. Bajo esta premisa, la conferencia busca centrar la atención de los asistentes en el manejo de sus finanzas personales, el uso de los servicios financieros y la relación que mantiene con las instituciones. Los esfuerzos para procurar la salud financiera en nuestras finanzas, se traducirán en las de los negocios.",
							new String[] { "Lic. Alejandro Zamora" },
							new String[] { "Museo Interactivo de Economía (MIDE)" },
							new int[] {}, 4, "13:00", "14:00",
							"Sala Morada - Cultura Financiera", 2, 240),
					new MainAgendaRowItem(
							"Mujeres abriendo brecha",
							"Panel y conversatorio de mujeres emprendedoras de diferentes perfiles y alto impacto que tienen radio de acción en diversas esferas del ecosistema emprendedor de México.",
							new String[] { "Dra. Denise Dresser" },
							new String[] { "Denise Dresser es profesora de ciencia política en el Instituto Tecnológico Autónomo de "
									+ "México (ITAM). Obtuvo la licenciatura en Relaciones Internacionales en el Colegio de "
									+ "México y el doctorado en Ciencia Política en la Universidad de Princeton. A lo largo "
									+ "del año da conferencias en una gran cantidad de entidades con audiencias conformadas "
									+ "por estudiantes, empresarios, políticos en activo, miembros de organizaciones de la "
									+ "sociedad civil y ciudadanos no afiliados a ningún partido.\n"
									+ "En mayo de 2010 se hizo acreedora al Premio Nacional de Periodismo en la categoría "
									+ "de Artículo de fondo con “Carta abierta a Carlos Slim”, artículo publicado en la "
									+ "edición 1685 del semanario Proceso el 14 de febrero de 2009." },
							new int[] { R.drawable.speaker_denise_dresser }, 4,
							"13:30", "15:00", "Valparaiso 3 - Magistrales", 8,
							241),
					new MainAgendaRowItem(
							"Crece tu negocio con Google Adwords y los Partners Premium para la PyME",
							"Se presentarán los factores que afectan la efectividad de una campaña en Google AdWords.",
							new String[] { "Diego Martínez" },
							new String[] { "Google" }, new int[] {}, 4,
							"14:00", "15:00",
							"Palacio de la Canal 11 - Google",
							ECOSYSTEM_DIGITAL_ENTERPRISE, 242),
					new MainAgendaRowItem(
							"El flujo de efectivo: Negocios PyMEs",
							"La importancia de administrar tu negocio identificando y mejorando el flujo de efectivo. Aprendiendo a no mezclar las finanzas personales con las de tu negocio.",
							new String[] { "Lic. María Inglaterra Islas Borboa" },
							new String[] { "BBVA Bancomer" }, new int[] {}, 4,
							"14:00", "15:00",
							"Sala Morada - Cultura Financiera", 2, 243),
					new MainAgendaRowItem(
							"Visibilidad e impacto para tu negocio en internet con Adwords Express",
							"Como obtener el máximo provecho a Google y la publicidad en internet, para poner tu negocio en la mira de tus clientes. Ahora más fácil que nunca.",
							new String[] { "Jorge Gutiérrez Luthe" },
							new String[] { "Google" }, new int[] {}, 4,
							"15:00", "16:00",
							"Palacio de la Canal 11 - Google",
							ECOSYSTEM_DIGITAL_ENTERPRISE, 244),
					new MainAgendaRowItem(
							"El flujo de efectivo: Negocios PyMEs",
							"Evaluar la conveniencia de aplicar estrategias para mejorar el manejo del flujo de efectivo, que involucran acciones que le permitan administrar y favorecer la solvencia económica de su negocio o proyecto de negocio.",
							new String[] { "Lic. María Inglaterra Islas Borboa" },
							new String[] { "BBVA BANCOMER" }, new int[] {}, 4,
							"15:00", "16:00",
							"Palacio de la Canal 2 - BBVA Bancomer", 2, 245),
					new MainAgendaRowItem(
							"Sensorama - experiencia sensorial innovadora (evento por invitación cupo limitado)",
							"Sensibilización y una reflexión profunda y vivencial, acerca de temas trascendentes como la vida, sus semejantes, su entorno, su momento de vida y lugar y sentido de su trabajo. ",
							new String[] { "Sensorama " },
							new String[] { "Compañía Artística de Teatro Sensorial Mexicana" },
							new int[] {}, 4, "15:30", "19:30",
							"Auditorio - Ecosistema Innovación", 4, 246),
					new MainAgendaRowItem(
							"Oportunidades para las MiPyMEs en los mercados internacionales",
							"Sensibilizar a los empresarios PyME sobre la necesidad de desarrollar una estrategia de inteligencia comercial para estar en posibilidades de tener éxito en los mercados internacionales.",
							new String[] { "IQOM Inteligencia Comercial" },
							new String[] { "" }, new int[] {}, 4, "15:30",
							"16:30",
							"Palacio de la Canal 1 - Alianzas Globales", 0, 247),
					new MainAgendaRowItem(
							"Tengo una gran idea:  ¿ahora que?",
							"El emprendedor sabrá dar los primeros pasos para concretar su idea de una manera sistemática. Comprenderá que la clave de los grandes negocios no es la gran idea sino su ejecución.",
							new String[] { "Gonzalo Abascal Olascoaga" },
							new String[] { "Linko S.A. de C.V." },
							new int[] {}, 4, "15:30", "16:30",
							"Palacio de la Canal 10 - Streaming",
							ECOSYSTEM_ENTREPRENEUR_CAMP, 248),
					new MainAgendaRowItem(
							"Cómo aumentar mis ventas a través del marketing digital",
							" ¿Te gustaría aprender como atraer a tus clientes más valiosos?  ¿Te gustaría saber cómo hacerlo de una manera efectiva y medible? Aquí te platicaremos sobre la oportunidad que tiene tu negocio para crecer e incrementar sus ventas con herramientas en línea.",
							new String[] { "Jorge Gutiérrez Luthe" },
							new String[] { "Google" }, new int[] {}, 4,
							"16:00", "17:00",
							"Palacio de la Canal 11 - Google",
							ECOSYSTEM_DIGITAL_ENTERPRISE, 249),
					new MainAgendaRowItem(
							"Negocios PyMEs: El crédito",
							"Evaluar la conveniencia de adquirir un crédito para tu negocio con base en las necesidades de éste, a partir de las cuales diseñarás una estrategia a seguir para favorecer el pago puntual del crédito elegido sin poner en riesgo las finanzas del negocio.",
							new String[] { "Lic. Cuauhtémoc Escorcia Reyes" },
							new String[] { "BBVA BANCOMER" }, new int[] {}, 4,
							"16:00", "18:00",
							"Palacio de la Canal 2 - BBVA Bancomer",
							ECOSYSTEM_FINANCIAL_CULTURE, 250),
					new MainAgendaRowItem(
							"13 pasos para elaborar tu plan de negocios",
							"Se transmitirá a empresarios de pequeñas empresas y emprendedores a través de un caso práctico, los elementos básicos de un plan de negocios.",
							new String[] { "M.A. Juan Carlos Cabrera López" },
							new String[] { "Nacional Financiera, S.N.C." },
							new int[] {},
							4,
							"16:00",
							"18:00",
							"Palacio de la Canal 3 - Cultura Financiera y Alto Impacto",
							2, 251),
					new MainAgendaRowItem(
							"Cuenta cuentos los vengadores: salvar el día",
							"Cómic para fomentar la educación financiera. Con la combinación de los personajes icónicos de Marvel, incluidos los Vengadores y Spiderman, así como la experiencia en educación financiera de Visa, se presenta un original cómic.",
							new String[] { "Cuenta cuentos" },
							new String[] { "Visa México" }, new int[] {}, 4,
							"16:00", "17:00", "Pasarela - Cultura Financiera",
							2, 252),
					new MainAgendaRowItem(
							"Fútbol Financiero",
							"Fútbol Financiero es un juego interactivo para computadora diseñado para que los jóvenes - adultos contemporáneos conozcan los distintos temas financieros a los que se enfrentarán como adultos jóvenes. Combina el deporte con una guía de estudio sobre conceptos básicos de finanzas personales.",
							new String[] { "Taller" },
							new String[] { "Visa México" }, new int[] {}, 4,
							"16:00", "17:00",
							"Sala Naranja - Cultura Financiera", 2, 253),
					new MainAgendaRowItem(
							"Liderazgo con visión empresarial para empresarios de PYMEs",
							"Compartir cómo una visión empresarial centrada en el liderazgo ejemplar, puede ayudarte a reinventar tu negocio en tiempos de cambio.",
							new String[] { "Enrique de J. Gómez - Gordillo Ruelas" },
							new String[] { "Consultor en Mercadotecnia y Ventas" },
							new int[] {}, 4, "16:30", "18:00",
							"Palacio de Iturbide 1 - Eventos Especiales 1",
							ECOSYSTEM_MOVE_MEXICO, 254),
					new MainAgendaRowItem(
							"Estrategias de monetización web: tu sitio web puede trabajar para ti",
							"Tu página de internet puede generarte ingresos adicionales sin importar de que se trate tu negocio, nosotros te enseñaremos las claves para lograr ingresos por publicidad en Internet.",
							new String[] { "Jorge Hoyos" },
							new String[] { "Goolge" }, new int[] {}, 4,
							"17:00", "18:00",
							"Palacio de la Canal 11 - Google",
							ECOSYSTEM_DIGITAL_ENTERPRISE, 255),
					new MainAgendaRowItem(
							"Fuck Up Nights",
							"Fuck up Nights comparte experiencias de emprendedores que han fracasado en el intento de crear un negocio. La filosofía radica en que se aprende más de los fracasos que del éxito. ",
							new String[] { "Leticia Gasca Serrano" },
							new String[] { "Fuck Up Nights" }, new int[] {}, 4,
							"17:00", "18:00",
							"Palacio de la Canal 9 - Campamento Emprendedor",
							1, 256),
					new MainAgendaRowItem(
							"e-Commerce: la nueva forma de hacer negocios",
							"Se abordarán los principales temas de la Guía para el desarrollo de plataformas de comercio electrónico, entre los que se incluyen las mejores prácticas en diversos aspectos del eCommerce como: dominios, organización, infraestructura, mercadotecnia, entre otros.",
							new String[] { "Lic. Víctor de la Barrera" },
							new String[] { "Visa México" }, new int[] {}, 4,
							"17:00", "18:00",
							"Sala Naranja - Cultura Financiera", 2, 257),
					new MainAgendaRowItem(
							"Cómo desarrollar una mentalidad empresarial exitosa",
							"Compartir cómo en enfoque de negocios apoyado en una estrategia de marketing de respuesta directa, puede ayudarte a alcanzar mayores niveles de éxito en tu negocio.",
							new String[] { "Enrique de J. Gómez - Gordillo Ruelas" },
							new String[] { "Consultor en Mercadotecnia y Ventas" },
							new int[] {}, 4, "18:00", "19:30",
							"Palacio de Iturbide 1 - Eventos Especiales 1",
							ECOSYSTEM_MOVE_MEXICO, 258),
					new MainAgendaRowItem(
							"Construyendo una gran empresa Start-up",
							"Estrategias empresariales y guía para la creación de una gran empresa y puesta en marcha de Start-ups.",
							new String[] { "Bob Dorf" },
							new String[] { "Bob Dorf ha sido consejero delegado y fundador retirado de Peppers and Rogers Group, "
									+ "la práctica de consultoría de CRM por excelencia, Dorf es considerado un estratega "
									+ "líder en el campo de la gestión de relaciones con los clientes. Su trabajo ha ayudado "
									+ "a concebir y poner en práctica uno a uno las estrategias de marketing de las "
									+ "organizaciones principales que van de la Sociedad Americana del Cáncer para Jaguar "
									+ "Cars, 3M, Bertelsmann, Charles Schwab, Ford, Hewlett Packard, Oracle, Prudential "
									+ "Securities, entre otros. En 1999, fue coautor de The One to One Fieldbook con Don "
									+ "Peppers y Martha Rogers. En marzo de 2012, Dorf y  su coautor Steve Blank publican "
									+ "las Instrucciones de inicio: La Guía Paso a paso para la construcción de una gran "
									+ "empresa, un manual paso a paso para crear una start-up." },
							new int[] { R.drawable.speaker_bob_dorf }, 4,
							"16:00", "17:30", "Conferencia Magistral", LECTURE,
							259), } };
	
	/**
	 * Checks if the device is a tablet or a phone
	 * 
	 * @param activityContext
	 *            The Activity Context.
	 * @return Returns true if the device is a Tablet
	 */
//	public static boolean isTabletDevice(Context activityContext) {
//	    // Verifies if the Generalized Size of the device is XLARGE to be
//	    // considered a Tablet
//	    boolean xlarge = ((activityContext.getResources().getConfiguration().screenLayout & 
//	                        Configuration.SCREENLAYOUT_SIZE_MASK) == 
//	                        Configuration.SCREENLAYOUT_SIZE_XLARGE);
//
//	    // If XLarge, checks if the Generalized Density is at least MDPI
//	    // (160dpi)
//	    if (xlarge) {
//	        DisplayMetrics metrics = new DisplayMetrics();
//	        Activity activity = (Activity) activityContext;
//	        activity.getWindowManager().getDefaultDisplay().getMetrics(metrics);
//
//	        // MDPI=160, DEFAULT=160, DENSITY_HIGH=240, DENSITY_MEDIUM=160,
//	        // DENSITY_TV=213, DENSITY_XHIGH=320
//	        if (metrics.densityDpi == DisplayMetrics.DENSITY_DEFAULT
//	                || metrics.densityDpi == DisplayMetrics.DENSITY_HIGH
//	                || metrics.densityDpi == DisplayMetrics.DENSITY_MEDIUM
//	                || metrics.densityDpi == DisplayMetrics.DENSITY_TV
//	                || metrics.densityDpi == DisplayMetrics.DENSITY_XHIGH) {
//
//	            // Yes, this is a tablet!
//	            return true;
//	        }
//	    }
//
//	    // No, this is not a tablet!
//	    return false;
//	}
	
	

}