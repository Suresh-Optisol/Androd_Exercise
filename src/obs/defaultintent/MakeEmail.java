package obs.defaultintent;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MakeEmail extends Activity {
	
	EditText textTo;
	EditText textSubject;
	EditText textMessage;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.emailintent);
	 textTo=(EditText)findViewById(R.id.edit1);
	 textSubject=(EditText)findViewById(R.id.edit2);
	 textMessage=(EditText)findViewById(R.id.edit3);		 
		Button but=(Button)findViewById(R.id.buttv1);
		but.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String to = textTo.getText().toString();
				  String subject = textSubject.getText().toString();
				  String message = textMessage.getText().toString();
				try{
					 Intent email = new Intent(Intent.ACTION_SEND);
					  email.putExtra(Intent.EXTRA_EMAIL, new String[]{ to});
					  //email.putExtra(Intent.EXTRA_CC, new String[]{ to});
					  //email.putExtra(Intent.EXTRA_BCC, new String[]{to});
					  email.putExtra(Intent.EXTRA_SUBJECT, subject);
					  email.putExtra(Intent.EXTRA_TEXT, message);
		 
					  //need this to prompts email client only
					  email.setType("message/rfc822");
		 
					  startActivity(Intent.createChooser(email, "Choose an Email client :"));
				}
				catch(Exception ex){
					Toast.makeText(getApplicationContext(), "NotSupported", Toast.LENGTH_LONG).show();
				}
			}
		});

	}
}
