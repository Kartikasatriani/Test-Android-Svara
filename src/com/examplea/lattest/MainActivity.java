package com.examplea.lattest;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	Button b;
	EditText e1,e2;
	String user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        b=(Button)findViewById(R.id.sign);
        e1=(EditText)findViewById(R.id.user);
        e2=(EditText)findViewById(R.id.pass);
        
        b.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				user=e1.getText().toString();
				pass=e2.getText().toString();
				if(user.equals("svara") && pass.equals("123")){
					Intent i=new Intent(MainActivity.this,HomeActivity.class);
					startActivity(i);
					MainActivity.this.finish();
				}
				else{
					Toast.makeText(getApplicationContext(), "Username dan password anda salah", Toast.LENGTH_LONG).show();
				}
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
        
        
        
    }
    
}
