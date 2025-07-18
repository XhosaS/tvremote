package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Trace;
import android.util.Log;
import com.google.android.gms.net.HttpEngineProviderSingleton;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ois {
    public static String b = "0";
    private static final String c = "ois";
    private static odp e;
    private static boolean f;
    private static final nvk d = nvk.d;
    public static final Object a = new Object();

    private ois() {
    }

    public static odp a() {
        odp odpVar;
        synchronized (a) {
            odpVar = e;
        }
        return odpVar;
    }

    @Deprecated
    public static void b(Context context) {
        synchronized (a) {
            if (HttpEngineProviderSingleton.getInstance(context).shouldUseHttpEngine()) {
                f = true;
                return;
            }
            if (c()) {
                return;
            }
            oiu oiuVar = new oiu(context, 37401, 1.0f);
            try {
                new zyg("PlayServices CronetProviderInstaller#installIfNeeded", 1, null);
                try {
                    ocv.aG(context, "Context must not be null");
                    ClassLoader classLoader = ois.class.getClassLoader();
                    ocv.aF(classLoader);
                    try {
                        classLoader.loadClass("org.chromium.net.CronetEngine");
                        new zyg("PlayServices CronetProviderInstaller#installIfNeeded verifyGooglePlayServicesIsAvailable", 1, null);
                        try {
                            nwb.c(context, 11925000);
                            Trace.endSection();
                            try {
                                new zyg("CronetProviderInstaller#installIfNeeded DynamiteModule#load", 1, null);
                                try {
                                    odp odpVarD = odp.d(context, odp.a, "com.google.android.gms.cronet_dynamite");
                                    Trace.endSection();
                                    try {
                                        new zyg("PlayServices CronetProviderInstaller#installIfNeeded loading class", 1, null);
                                        try {
                                            Class<?> clsLoadClass = odpVarD.c.getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                                            if (clsLoadClass.getClassLoader() == ois.class.getClassLoader()) {
                                                Log.e(c, "ImplVersion class is missing from Cronet module.");
                                                throw new nvz();
                                            }
                                            Method method = clsLoadClass.getMethod("getApiLevel", null);
                                            Method method2 = clsLoadClass.getMethod("getCronetVersion", null);
                                            Integer num = (Integer) d(method, new Object[0]);
                                            ocv.aF(num);
                                            int iIntValue = num.intValue();
                                            String str = (String) d(method2, new Object[0]);
                                            ocv.aF(str);
                                            b = str;
                                            Trace.endSection();
                                            if (iIntValue >= 3) {
                                                e = odpVarD;
                                                oiuVar.a();
                                                Trace.endSection();
                                                oiuVar.close();
                                                return;
                                            }
                                            Intent intentI = d.i(context, 2, "cr");
                                            if (intentI == null) {
                                                Log.e(c, "Unable to fetch error resolution intent");
                                                throw new nvz();
                                            }
                                            throw new nwa(2, "Google Play Services update is required. The API Level of the client is 3. The API Level of the implementation is " + iIntValue + ". The Cronet implementation version is " + b, intentI);
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    } catch (Exception e2) {
                                        Log.e(c, "Unable to read Cronet version from the Cronet module ", e2);
                                        throw ((nvz) new nvz().initCause(e2));
                                    }
                                } finally {
                                    try {
                                        Trace.endSection();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                            } catch (odl e3) {
                                Log.e(c, "Unable to load Cronet module", e3);
                                throw ((nvz) new nvz().initCause(e3));
                            }
                        } finally {
                        }
                    } catch (ClassNotFoundException e4) {
                        Log.e(c, "Cronet API is not available. Have you included all required dependencies?");
                        throw ((nvz) new nvz().initCause(e4));
                    }
                } finally {
                }
            } finally {
            }
        }
    }

    public static boolean c() {
        synchronized (a) {
            boolean z = true;
            if (f) {
                return true;
            }
            if (a() == null) {
                z = false;
            }
            return z;
        }
    }

    private static Object d(Method method, Object... objArr) {
        return method.invoke(null, objArr);
    }
}
