package id.ac.polinema.settingsexample.fragments;

import android.os.Bundle;

import id.ac.polinema.settingsexample.R;

class SettingsFragmentImpl extends SettingsFragment {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        etPreferencesFromResource(R.xml.preferences, rootKey);
    }

    private void etPreferencesFromResource(int preferences, String rootKey) {

    }
}
