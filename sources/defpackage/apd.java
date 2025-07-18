package defpackage;

import android.content.Context;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apd {
    public static volatile apd a;

    public static boolean a(Context context) {
        return "com.google.android.gms".equals(context.getPackageName());
    }

    public static atd b(byg bygVar, crv crvVar) {
        return (atd) ((crv) bygVar.d(crvVar)).a();
    }

    public static cja c(ami amiVar) {
        final apv apvVar = new apv(amiVar);
        amiVar.g(chz.a, new amd() { // from class: apu
            @Override // defpackage.amd
            public final void a(ami amiVar2) {
                boolean z = ((amn) amiVar2).c;
                apv apvVar2 = apvVar;
                if (z) {
                    apvVar2.cancel(false);
                    return;
                }
                if (amiVar2.d()) {
                    apvVar2.c(amiVar2.c());
                    return;
                }
                Exception excB = amiVar2.b();
                if (excB == null) {
                    throw new IllegalStateException();
                }
                apvVar2.d(excB);
            }
        });
        return apvVar;
    }

    public static int d(int i) {
        if (i == 200) {
            return 200;
        }
        switch (i) {
            case 400:
                return 400;
            case 401:
                return 401;
            case 402:
                return 402;
            default:
                return 0;
        }
    }

    public static ddo e(PublicKey publicKey) throws NoSuchAlgorithmException {
        ddp ddpVarB = ddp.b(publicKey.getEncoded());
        try {
            return new ddo(MessageDigest.getInstance("SHA-1").digest(ddpVarB.b.m()));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Could not get SHA-1 digest instance", e);
        }
    }
}
