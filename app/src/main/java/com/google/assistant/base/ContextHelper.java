package com.google.assistant.base;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.os.Process;
import android.preference.PreferenceManager;
import com.google.assistant.base.annotations.JNINamespace;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
@JNINamespace("base::android")
/* loaded from: classes2.dex */
public class ContextHelper {
    private static final String TAG = "ContextHelper";
    private static Context sApplicationContext;
    private static String sProcessName;

    /* compiled from: PG */
    class Holder {
        private static SharedPreferences sSharedPreferences = ContextHelper.fetchAppSharedPreferences();

        private Holder() {
        }
    }

    public static void clearApplicationContextForTests() {
        sApplicationContext = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SharedPreferences fetchAppSharedPreferences() {
        return PreferenceManager.getDefaultSharedPreferences(sApplicationContext);
    }

    public static SharedPreferences getAppSharedPreferences() {
        return Holder.sSharedPreferences;
    }

    public static AssetManager getApplicationAssets() {
        Context applicationContext = getApplicationContext();
        while (applicationContext instanceof ContextWrapper) {
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        return applicationContext.getAssets();
    }

    public static Context getApplicationContext() {
        return sApplicationContext;
    }

    public static String getProcessName() throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        String str = sProcessName;
        if (str != null) {
            return str;
        }
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            String str2 = (String) cls.getMethod("getProcessName", null).invoke(cls.getMethod("currentActivityThread", null).invoke(null, null), null);
            sProcessName = str2;
            return str2;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void initApplicationContext(Context context) {
        Context context2 = sApplicationContext;
        if (context2 != null && context2 != context) {
            throw new RuntimeException("Attempting to set multiple global application contexts.");
        }
        initJavaSideApplicationContext(context);
    }

    public static void initApplicationContextForTests(Context context) {
        initJavaSideApplicationContext(context);
        Holder.sSharedPreferences = fetchAppSharedPreferences();
    }

    private static void initJavaSideApplicationContext(Context context) {
        if (context == null) {
            throw new RuntimeException("Global application context cannot be set to null.");
        }
        sApplicationContext = context;
    }

    public static boolean isIsolatedProcess() {
        try {
            return ((Boolean) Process.class.getMethod("isIsolated", null).invoke(null, null)).booleanValue();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
