package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aesl {
    public static final rjy a;
    public static volatile String b;
    private static final rkq c;

    static {
        rkq rkqVarB = new rkw(new yqi() { // from class: aesk
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                String strC;
                Context context = (Context) obj;
                String str = aesl.b;
                if (str != null) {
                    return str;
                }
                synchronized (aesl.class) {
                    strC = aesl.b;
                    if (strC == null) {
                        strC = rff.c(context, "com.google.android.libraries.consentverifier");
                        aesl.b = strC;
                    }
                }
                return strC;
            }
        }).b();
        c = rkqVarB;
        a = new rjm("com.google.android.libraries.consentverifier", rkqVarB);
        b = null;
    }

    private aesl() {
    }
}
