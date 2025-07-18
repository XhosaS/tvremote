package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bv {
    static final bt a = new bt(new bu());
    public static final int b = -100;
    public static oi c = null;
    public static oi d = null;
    private static Boolean i = null;
    public static boolean e = false;
    public static final mb f = new mb();
    public static final Object g = new Object();
    public static final Object h = new Object();

    public static void i(bv bvVar) {
        synchronized (g) {
            ma maVar = new ma(f);
            while (maVar.hasNext()) {
                bv bvVar2 = (bv) ((WeakReference) maVar.next()).get();
                if (bvVar2 == bvVar || bvVar2 == null) {
                    maVar.remove();
                }
            }
        }
    }

    static boolean n(Context context) throws PackageManager.NameNotFoundException {
        if (i == null) {
            try {
                ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) cn.class), 640);
                if (serviceInfo.metaData != null) {
                    i = Boolean.valueOf(serviceInfo.metaData.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                i = false;
            }
        }
        return i.booleanValue();
    }

    public Context a() {
        throw null;
    }

    public abstract bk b();

    public abstract View c(int i2);

    public abstract void d(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public abstract void j(int i2);

    public abstract void k(View view);

    public abstract void l(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void m(CharSequence charSequence);

    public abstract void o();

    public abstract void p(int i2);
}
