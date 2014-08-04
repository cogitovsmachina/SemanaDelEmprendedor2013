package mx.androidtitlan.semanadelemprendedor.fragment;

import mx.androidtitlan.semanadelemprendedor.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class WebViewFragment extends Fragment {
	private WebView mWebView;
	private ProgressBar pb;
	private final static String GPLUS_STREAM_URL = "https://plus.google.com/app/basic/s/%23SemanaDelEmprendedor";

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_googleplus, null);
		mWebView = (WebView) view.findViewById(R.id.frag_gplus_wv);
		pb = (ProgressBar) view.findViewById(R.id.frag_gplus_pb);
		mWebView.getSettings().setBuiltInZoomControls(false);
		mWebView.setWebViewClient(new SimpleWebViewClient());
		mWebView.loadUrl(GPLUS_STREAM_URL);
		return view;
	}

	private class SimpleWebViewClient extends WebViewClient {
		@Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }

		@Override
		public void onPageFinished(WebView view, String url) {
			pb.setVisibility(View.GONE);
            super.onPageFinished(view, url);
		}
	}

}
