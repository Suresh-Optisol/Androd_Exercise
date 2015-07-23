package obs.defaultintent;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
  
	TextView tx1,tx2,tx3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tx1=(TextView)findViewById(R.id.call);
        tx2=(TextView)findViewById(R.id.sms);
        tx3=(TextView)findViewById(R.id.email);
        tx1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in =new Intent(MainActivity.this,MakeCall.class);
				startActivity(in);
				
			}
		});
   
         tx2.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent inte =new Intent(MainActivity.this,MakeSms.class);
			startActivity(inte);
			
			
		}
	  });

       tx3.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		Intent inten =new Intent(MainActivity.this,MakeEmail.class);
		startActivity(inten);
		
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
