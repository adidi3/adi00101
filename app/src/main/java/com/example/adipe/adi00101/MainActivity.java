package com.example.adipe.adi00101;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
        WebView ll;
        EditText rr, lo, kl;
        Button b1;
        String r, f, h, ka;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            b1=(Button) findViewById(R.id.button);
            rr=(EditText)findViewById(R.id.editText2) ;
            lo=(EditText)findViewById(R.id.editText4) ;
            kl=(EditText)findViewById(R.id.editText5) ;
            ll=(WebView)findViewById(R.id.webView);
            ll.getSettings().setJavaScriptEnabled(true);
            ll.setWebViewClient(new WebViewClient());


        }

        public void press(View view) {
            r ="https://www.google.co.il/search?q=";
            f = rr.getText().toString();
            h = lo.getText().toString();
            ka= kl.getText().toString();
            if ((f.isEmpty())||(h.isEmpty())||(ka.isEmpty())){
                Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
            }
            else if (Double.parseDouble(f)==0){
                Toast.makeText(this , "error", Toast.LENGTH_SHORT).show();
            }
            else{
                r=r+f+"x%5E2%2B"+h+"x%2B"+ka;
                ll.loadUrl(r);
            }


        }

}


