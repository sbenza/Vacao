package com.example.vacao;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Te extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TextView textview = new TextView(this);
        textview.setText("This is Apple tab");
        setContentView(textview);
	}

}
