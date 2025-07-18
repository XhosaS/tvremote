package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aesd {
    public static final rjy a;
    public static volatile String b;
    private static final rkq c;

    static {
        rkw rkwVar = new rkw(new yqi() { // from class: aesc
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                String strC;
                Context context = (Context) obj;
                String str = aesd.b;
                if (str != null) {
                    return str;
                }
                synchronized (aesd.class) {
                    strC = aesd.b;
                    if (strC == null) {
                        strC = rff.c(context, "com.google.android.gms.clearcut_client");
                        aesd.b = strC;
                    }
                }
                return strC;
            }
        });
        rkwVar.b = yzq.o(yzq.s("METALOG_COUNTERS", "CLEARCUT_LOG_LOSS", "CLEARCUT_FUNNEL", "CLEARCUT_BACKSTOP"));
        rkq rkqVarB = rkwVar.b();
        c = rkqVarB;
        a = new rjm("com.google.android.gms.clearcut_client", rkqVarB);
        b = null;
    }

    private aesd() {
    }
}
