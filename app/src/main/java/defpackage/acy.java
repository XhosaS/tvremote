package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes.dex */
public class acy {
    public static final adg a;
    public static final wt b;

    static {
        btt.b("TypefaceCompat static init");
        if (Build.VERSION.SDK_INT >= 29) {
            a = new adc();
        } else {
            a = new adb();
        }
        b = new wt(16);
        Trace.endSection();
    }

    public static Typeface a(Context context, Resources resources, int i, String str, int i2, int i3) {
        Typeface typefaceD = a.d(context, resources, i, str, i3);
        if (typefaceD != null) {
            b.f(b(resources, i, str, i2, i3), typefaceD);
        }
        return typefaceD;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static Typeface c(Context context, aen[] aenVarArr, int i) {
        btt.b("TypefaceCompat.createFromFontInfo");
        try {
            return a.b(context, aenVarArr, i);
        } finally {
            Trace.endSection();
        }
    }
}
