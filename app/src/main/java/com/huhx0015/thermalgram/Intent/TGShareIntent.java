package com.huhx0015.thermalgram.Intent;

import android.content.Context;
import android.content.Intent;

/** -----------------------------------------------------------------------------------------------
 *  [TGShareIntent] CLASS
 *  PROGRAMMER: Michael Yoon Huh
 *  DESCRIPTION: TGShareIntent class is used to provide functions to share shortcut data with
 *  external activities.
 *  -----------------------------------------------------------------------------------------------
 */

public class TGShareIntent {

    /** INTENT FUNCTIONALITY ___________________________________________________________________ **/

    // shareThermalIntent(): Prepares an Intent to share thermal image data with external activities.
    public static void shareThermalIntent(String message, Context context) {

        // Sets up an Intent to share the shortcut data with external activities.
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "(THERMALGRAM):\n" + message);
        sendIntent.setType("text/plain");
        context.startActivity(Intent.createChooser(sendIntent, "Sharing my thermals with you!"));
    }
}