package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dfe {
    private final dqh a = new dqh(1000);
    private final afh b = dqu.a(10, new dfc());

    public final String a(daj dajVar) {
        String str;
        dqh dqhVar = this.a;
        synchronized (dqhVar) {
            str = (String) dqhVar.f(dajVar);
        }
        if (str == null) {
            dfd dfdVar = (dfd) this.b.a();
            try {
                MessageDigest messageDigest = dfdVar.a;
                dajVar.a(messageDigest);
                byte[] bArrDigest = messageDigest.digest();
                char[] cArr = dqm.b;
                synchronized (cArr) {
                    for (int i = 0; i < bArrDigest.length; i++) {
                        byte b = bArrDigest[i];
                        int i2 = i + i;
                        char[] cArr2 = dqm.a;
                        cArr[i2] = cArr2[(b & 255) >>> 4];
                        cArr[i2 + 1] = cArr2[b & 15];
                    }
                    str = new String(cArr);
                }
            } finally {
                this.b.b(dfdVar);
            }
        }
        dqh dqhVar2 = this.a;
        synchronized (dqhVar2) {
            dqhVar2.g(dajVar, str);
        }
        return str;
    }
}
