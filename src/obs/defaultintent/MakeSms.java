package obs.defaultintent;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MakeSms extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.smsintent);
		
		Button but=(Button)findViewById(R.id.buttv1);
		but.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				//Toast.makeText(getApplicationContext(), number,Toast.LENGTH_LONG).show();
				try{
					Intent sendIntent = new Intent(Intent.ACTION_VIEW);
					sendIntent.putExtra("sms_body", "default content"); 
					sendIntent.setType("vnd.android-dir/mms-sms");
					startActivity(sendIntent);
				}
				catch(Exception ex){
					Toast.makeText(getApplicationContext(), "NotSupported", Toast.LENGTH_LONG).show();
				}
			}
		});

	}
}

	