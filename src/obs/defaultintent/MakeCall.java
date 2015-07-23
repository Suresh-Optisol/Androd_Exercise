package obs.defaultintent;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MakeCall extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.callintent);
		final EditText tx=(EditText)findViewById(R.id.edit1);
		Button but=(Button)findViewById(R.id.buttv1);
		but.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String number=tx.getText().toString().trim();
				//Toast.makeText(getApplicationContext(), number,Toast.LENGTH_LONG).show();
				try{
					Intent callIntent = new Intent(Intent.ACTION_CALL);						
					callIntent.setData(Uri.parse("tel://"+number));
					startActivity(callIntent);}
				catch(Exception ex){
					Toast.makeText(getApplicationContext(), "NotSupported", Toast.LENGTH_LONG).show();
				}
			}
		});

	}
}
