package com.android.ejemplos.demo;

import android.app.Activity;
import android.os.Bundle;

/** Demonstrates the use of the layout_weight attribute. The absolute values
 *  for this attribute are arbitrary: the only thing that matters are the
 *  relative values. The sizes will be set proportionally. 
 *  <p>
 *  From <a href="http://www.coreservlets.com/android-tutorial/">
 *  the coreservlets.com Android programming tutorial series</a>.
 */

public class LayoutWeightsActivity extends Activity {
    /** Initializes the app when it is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_weights);
    }
}