package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nv {
    public static final od a;
    public static final mh b;

    static {
        qk.p("TypefaceCompat static init");
        if (Build.VERSION.SDK_INT >= 29) {
            a = new oa();
        } else if (Build.VERSION.SDK_INT >= 28) {
            a = new nz();
        } else if (Build.VERSION.SDK_INT >= 26) {
            a = new ny();
        } else {
            if (nx.a == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (nx.a != null) {
                a = new nx();
            } else {
                a = new nw();
            }
        }
        b = new mh(16);
        Trace.endSection();
    }

    public static Typeface a(Context context, Resources resources, int i, String str, int i2, int i3) {
        Typeface typefaceD = a.d(context, resources, i, str, i3);
        if (typefaceD != null) {
            b.b(b(resources, i, str, i2, i3), typefaceD);
        }
        return typefaceD;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
