package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeru {
    public static final rjy a;
    public static volatile String b;
    private static final rkq c;

    static {
        rkw rkwVar = new rkw(new yqi() { // from class: aert
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                String strC;
                Context context = (Context) obj;
                String str = aeru.b;
                if (str != null) {
                    return str;
                }
                synchronized (aeru.class) {
                    strC = aeru.b;
                    if (strC == null) {
                        strC = rff.c(context, "com.google.android.gms.auth_account_client");
                        aeru.b = strC;
                    }
                }
                return strC;
            }
        });
        rkwVar.b = yzq.o(new zdd("ANDROID_AUTH"));
        rkq rkqVarB = rkwVar.b();
        c = rkqVarB;
        a = new rjm("com.google.android.gms.auth_account_client", rkqVarB);
        b = null;
    }

    private aeru() {
    }
}
