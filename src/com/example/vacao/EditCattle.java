package com.example.vacao;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class EditCattle extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_edit_cattle);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.edit_cattle, menu);
		return true;
	}

}
