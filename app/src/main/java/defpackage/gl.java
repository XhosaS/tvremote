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
public abstract class gl {
    static final gj a = new gj(new gk());
    public static final int b = -100;
    public static ads c = null;
    public static ads d = null;
    private static Boolean i = null;
    public static boolean e = false;
    public static final wg f = new wg(0);
    public static final Object g = new Object();
    public static final Object h = new Object();

    public static void h(gl glVar) {
        synchronized (g) {
            wf wfVar = new wf(f);
            while (wfVar.hasNext()) {
                gl glVar2 = (gl) ((WeakReference) wfVar.next()).get();
                if (glVar2 == glVar || glVar2 == null) {
                    wfVar.remove();
                }
            }
        }
    }

    static boolean m(Context context) throws PackageManager.NameNotFoundException {
        if (i == null) {
            try {
                ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) hj.class), 640);
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

    public abstract View b(int i2);

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract void i(int i2);

    public abstract void j(View view);

    public abstract void k(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void l(CharSequence charSequence);

    public abstract void n();

    public abstract void o(int i2);
}
