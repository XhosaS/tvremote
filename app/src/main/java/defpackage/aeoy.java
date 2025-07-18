package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeoy {
    public static final rjy a;
    public static final rjx b;
    private static final rkq c;
    private static volatile String d;

    static {
        rkw rkwVar = new rkw(new yqi() { // from class: aeox
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return aeoy.a((Context) obj);
            }
        });
        rkwVar.b = yzq.o(yzq.r("OPA_TV", "OPA_TV_ANDROID_PRIMES", "STREAMZ_OPA_TV"));
        yqw.L(!rkwVar.c);
        yqw.L(true);
        rkwVar.d = true;
        rkq rkqVarB = rkwVar.b();
        c = rkqVarB;
        rio rioVar = new rio(rkqVarB);
        a = rioVar;
        b = rioVar.c("__phenotype_server_token", "");
        d = null;
    }

    private aeoy() {
    }

    public static String a(Context context) {
        String strC;
        String str = d;
        if (str != null) {
            return str;
        }
        synchronized (aeoy.class) {
            strC = d;
            if (strC == null) {
                strC = rff.c(context, "com.google.android.katniss.oobe");
                d = strC;
            }
        }
        return strC;
    }
}
