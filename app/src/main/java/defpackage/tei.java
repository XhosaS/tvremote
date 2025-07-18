package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tei {
    public static boolean a() {
        return ypx.c(Build.MANUFACTURER).contains("google") || ypx.d("google", Build.BRAND);
    }

    public static boolean b(String str) {
        return ypx.c(Build.PRODUCT).endsWith(str);
    }
}
