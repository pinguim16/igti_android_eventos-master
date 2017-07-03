package br.com.igti.android.eventos;

import android.preference.PreferenceManager;
import android.util.Log;
import android.widget.Toast;

import static android.content.ContentValues.TAG;

/**
 * Created by Cesar on 03/07/2017.
 */

public class FutebolQuiz {

    private static final String PREF_PRIMEIRA_VEZ =  “primeiraVez";

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume()");
        boolean primeiraVez =
                PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean(PREF_PRIMEIRA_VEZ, true);
        if (primeiraVez) {

            PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
                    .edit()
                    .putBoolean(PREF_PRIMEIRA_VEZ, false)
                    .commit();
            Toast.makeText(this, "Bem-vindo ao FutebolQuiz!", Toast.LENGTH_SHORT).show();
        }
    }
}

