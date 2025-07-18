package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aevy {
    public static final rjy a;
    public static volatile String b;
    private static final rkq c;

    static {
        rkw rkwVar = new rkw(new yqi() { // from class: aevx
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                String strC;
                Context context = (Context) obj;
                String str = aevy.b;
                if (str != null) {
                    return str;
                }
                synchronized (aevy.class) {
                    strC = aevy.b;
                    if (strC == null) {
                        strC = rff.c(context, "com.google.android.libraries.mdi.sync");
                        aevy.b = strC;
                    }
                }
                return strC;
            }
        });
        rkwVar.b = yzq.o(yzq.q("MDI_SYNC_COMPONENTS_VERBOSE", "MDI_SYNC_COMPONENTS_GAIA"));
        rkq rkqVarB = rkwVar.b();
        c = rkqVarB;
        a = new rjm("com.google.android.libraries.mdi.sync", rkqVarB);
        b = null;
    }

    private aevy() {
    }
}
