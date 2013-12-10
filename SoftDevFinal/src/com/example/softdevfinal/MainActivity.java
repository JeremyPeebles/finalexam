package com.example.softdevfinal;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	 public void onClickBtn(View v)
	    {
	        Toast.makeText(this, "Clicked on Button", Toast.LENGTH_LONG).show();
	    }
	 
	 
	 
	 //http://www.mkyong.com/android/android-alert-dialog-example/
	 
	 public void onClickAlert()
	 {
		 AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
					null);
	 
				// set title
				alertDialogBuilder.setTitle("Your Title");
	 
				// set dialog message
				alertDialogBuilder.setMessage("Click yes to exit!");
					alertDialogBuilder.setCancelable(false);
					alertDialogBuilder.setPositiveButton("Yes",new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog,int id) {
							// if this button is clicked, close
							// current activity
							MainActivity.this.finish();
						}
					  })
					.setNegativeButton("No",new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog,int id) {
							// if this button is clicked, just close
							// the dialog box and do nothing
							dialog.cancel();
						}
					});
	 
					// create alert dialog
					AlertDialog alertDialog = alertDialogBuilder.create();
	 
					// show it
					alertDialog.show();
	 }

}



