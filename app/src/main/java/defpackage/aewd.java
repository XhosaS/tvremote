package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aewd {
    public static final rjy a;
    public static volatile String b;
    private static final rkq c;

    static {
        rkw rkwVar = new rkw(new yqi() { // from class: aewc
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                String strC;
                Context context = (Context) obj;
                String str = aewd.b;
                if (str != null) {
                    return str;
                }
                synchronized (aewd.class) {
                    strC = aewd.b;
                    if (strC == null) {
                        strC = rff.c(context, "com.google.android.libraries.onegoogle");
                        aewd.b = strC;
                    }
                }
                return strC;
            }
        });
        rkwVar.b = yzq.o(yzq.u("ONEGOOGLE_MOBILE", "STREAMZ_CONSENTKIT_MOBILE", "IDENTITY_CONSENT_UI", "GMAIL_ANDROID_PRIMES", "ANDROID_GMAIL", "GMAIL_ANDROID", "GMAIL_SYNC_HEALTH", "GMAIL_COUNTERS", "XPLAT_GMAIL_ANDROID", "CLIENT_LOGGING_PROD"));
        rkq rkqVarB = rkwVar.b();
        c = rkqVarB;
        a = new rjm("com.google.android.libraries.onegoogle", rkqVarB);
        b = null;
    }

    private aewd() {
    }
}
