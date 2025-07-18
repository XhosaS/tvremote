package defpackage;

import android.graphics.Color;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bgj {
    public static String a(String str) {
        return "." + str + ",." + str + " *";
    }

    public static String b(int i) {
        Object[] objArr = {Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(Color.alpha(i) / 255.0d)};
        int i2 = bgf.a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }
}
