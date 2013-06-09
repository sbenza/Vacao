package com.example.vacao;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class StockManager extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_stock_manager);

	}

	/** Called when the user clicks a button */
	public void openCattle(View view) {
		Intent intent = new Intent(this, CattleManager.class);
		startActivity(intent);

	}

	public void openVaccine(View view) {
		Intent intent = new Intent(this, VaccineManager.class);
		startActivity(intent);

	}
	
	public void openBull(View view) {
		Intent intent = new Intent(this, BullManager.class);
		startActivity(intent);

	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.stock_manager, menu);
		return true;
	}

}
