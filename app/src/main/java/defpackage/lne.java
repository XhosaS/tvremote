package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Trace;
import android.util.Log;
import com.google.android.gms.net.HttpEngineProviderSingleton;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lne {
    public static boolean c = false;
    private static final String d = "lne";
    private static final kcy e = kcy.d;
    public static final Object a = new Object();
    private static kmv f = null;
    public static String b = "0";

    private lne() {
    }

    public static kmv a() {
        kmv kmvVar;
        synchronized (a) {
            kmvVar = f;
        }
        return kmvVar;
    }

    @Deprecated
    public static void b(Context context) {
        synchronized (a) {
            if (HttpEngineProviderSingleton.getInstance(context).shouldUseHttpEngine()) {
                c = true;
                return;
            }
            if (c()) {
                return;
            }
            lnh lnhVar = new lnh(context, 37401, 1.0f);
            try {
                new lni("PlayServices CronetProviderInstaller#installIfNeeded");
                try {
                    kkk.l(context, "Context must not be null");
                    ClassLoader classLoader = lne.class.getClassLoader();
                    kkk.k(classLoader);
                    try {
                        classLoader.loadClass("org.chromium.net.CronetEngine");
                        new lni("PlayServices CronetProviderInstaller#installIfNeeded verifyGooglePlayServicesIsAvailable");
                        try {
                            kdu.b(context, 11925000);
                            Trace.endSection();
                            try {
                                new lni("CronetProviderInstaller#installIfNeeded DynamiteModule#load");
                                try {
                                    kmv kmvVarD = kmv.d(context, kmv.a, "com.google.android.gms.cronet_dynamite");
                                    Trace.endSection();
                                    try {
                                        new lni("PlayServices CronetProviderInstaller#installIfNeeded loading class");
                                        try {
                                            Class<?> clsLoadClass = kmvVarD.e.getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                                            if (clsLoadClass.getClassLoader() == lne.class.getClassLoader()) {
                                                Log.e(d, "ImplVersion class is missing from Cronet module.");
                                                throw new kdr(8);
                                            }
                                            Method method = clsLoadClass.getMethod("getApiLevel", null);
                                            Method method2 = clsLoadClass.getMethod("getCronetVersion", null);
                                            Integer num = (Integer) method.invoke(null, null);
                                            kkk.k(num);
                                            int iIntValue = num.intValue();
                                            String str = (String) method2.invoke(null, null);
                                            kkk.k(str);
                                            b = str;
                                            Trace.endSection();
                                            if (iIntValue >= 3) {
                                                f = kmvVarD;
                                                lnhVar.a = 0;
                                                Trace.endSection();
                                                lnhVar.close();
                                                return;
                                            }
                                            Intent intentH = e.h(context, 2, "cr");
                                            if (intentH == null) {
                                                Log.e(d, "Unable to fetch error resolution intent");
                                                throw new kdr(2);
                                            }
                                            throw new kds(2, "Google Play Services update is required. The API Level of the client is 3. The API Level of the implementation is " + iIntValue + ". The Cronet implementation version is " + b, intentH);
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    } catch (Exception e2) {
                                        Log.e(d, "Unable to read Cronet version from the Cronet module ", e2);
                                        throw ((kdr) new kdr(8).initCause(e2));
                                    }
                                } finally {
                                    try {
                                        Trace.endSection();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                            } catch (kmr e3) {
                                Log.e(d, "Unable to load Cronet module", e3);
                                throw ((kdr) new kdr(8).initCause(e3));
                            }
                        } finally {
                        }
                    } catch (ClassNotFoundException e4) {
                        Log.e(d, "Cronet API is not available. Have you included all required dependencies?");
                        throw ((kdr) new kdr(10).initCause(e4));
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
            if (c) {
                return true;
            }
            if (a() == null) {
                z = false;
            }
            return z;
        }
    }
}
