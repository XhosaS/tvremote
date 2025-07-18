package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xnv {
    public static final rzy a;
    private static final ryq b;
    private static volatile String c;

    static {
        yau yauVar = new yau((tsl) new uhe(15));
        yauVar.e(ImmutableSet.of("PLAY_BILLING_LIBRARY"));
        ryq ryqVarD = yauVar.d();
        b = ryqVarD;
        a = new rzy("com.android.billingclient", ryqVarD);
        c = null;
    }

    private xnv() {
    }

    public static String a(Context context) {
        String strB;
        String str = c;
        if (str != null) {
            return str;
        }
        synchronized (xnv.class) {
            strB = c;
            if (strB == null) {
                strB = rwt.b(context, "com.android.billingclient");
                c = strB;
            }
        }
        return strB;
    }
}
