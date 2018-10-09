package anil.sardiwal.sharedpref;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * A utility tool to save and read from shared preferences.
 *
 * @author Anil Sardiwal
 * @since 09/10/2018
 */
public class SharedPrefs
{
    
    @SuppressLint("StaticFieldLeak")
    private static Context mContext;
    private SharedPrefs() {
    }

    public static SharedPrefs with(Context context)
    {
        mContext = context;
        return new SharedPrefs();
    }

    // Shared preferences
    private static String PREFS_NAME;
    public static void init(String globalPreferenceName)
    {
        PREFS_NAME = globalPreferenceName;
    }
    /**
     * For saving Strings.
     * @param keyName String for saving preference.
     * @param stringValue Default value
     */
    public void saveString( String keyName, String stringValue)
    {
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(keyName, stringValue);
        editor.apply();
    }

    public String getString( String keyName, String defaultValue)
    {
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getString(keyName, defaultValue);
    }

    /**
     * For saving Ints
     * @param keyName String for saving preference.
     * @param intValue Default value.
     */
    public void saveInt( String keyName, int intValue)
    {
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(keyName, intValue);
        editor.apply();
    }

    public int getInt( String keyName, int defaultValue)
    {
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getInt(keyName, defaultValue);
    }

    /**
     * For saving Booleans
     * @param keyName String for saving preference.
     * @param booleanValue Default value.
     */
    public void saveBoolean( String keyName, Boolean booleanValue)
    {
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(keyName, booleanValue);
        editor.apply();
    }

    public boolean getBoolean( String keyName, Boolean defaultValue)
    {
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getBoolean(keyName, defaultValue);
    }

    /**
     * For saving long
     * @param keyName String for saving preference.
     * @param longValue Default value.
     */
    public void saveLong( String keyName, long longValue)
    {
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putLong(keyName, longValue);
        editor.apply();
    }

    public long getLong( String keyName, long defaultValue)
    {
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getLong(keyName, defaultValue);
    }
}