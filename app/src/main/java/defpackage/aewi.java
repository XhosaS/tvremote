package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aewi {
    public static final rjy a;
    public static volatile String b;
    private static final rkq c;

    static {
        rkw rkwVar = new rkw(new yqi() { // from class: aewh
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                String strC;
                Context context = (Context) obj;
                String str = aewi.b;
                if (str != null) {
                    return str;
                }
                synchronized (aewi.class) {
                    strC = aewi.b;
                    if (strC == null) {
                        strC = rff.c(context, "com.google.android.libraries.performance.primes");
                        aewi.b = strC;
                    }
                }
                return strC;
            }
        });
        rkwVar.b = yzq.o(new zdd("CLIENT_LOGGING_PROD"));
        yqw.L(!rkwVar.d);
        yqw.L(true);
        rkwVar.c = true;
        rkq rkqVarB = rkwVar.b();
        c = rkqVarB;
        a = new rjm("com.google.android.libraries.performance.primes", rkqVarB);
        b = null;
    }

    private aewi() {
    }
}
