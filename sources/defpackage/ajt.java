package defpackage;

import android.os.Build;
import android.os.Process;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajt {
    public static String a;
    public static int b;
    private static Boolean c;

    public static boolean a() {
        Boolean boolValueOf = c;
        if (boolValueOf == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                boolValueOf = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object objI = qr.i(Process.class, "isIsolated", new awy[0]);
                    bit.j(objI);
                    boolValueOf = (Boolean) objI;
                } catch (ReflectiveOperationException unused) {
                    boolValueOf = false;
                }
            }
            c = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }
}
