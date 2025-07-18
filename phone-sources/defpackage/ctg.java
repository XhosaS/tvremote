package defpackage;

import android.hardware.fingerprint.FingerprintManager;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ctg extends FingerprintManager.AuthenticationCallback {
    final /* synthetic */ pku a;

    public ctg(pku pkuVar) {
        this.a = pkuVar;
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationError(int i, CharSequence charSequence) {
        ((ht) ((eux) this.a.a).a).b(i, charSequence);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationFailed() {
        ((ht) ((eux) this.a.a).a).c();
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationHelp(int i, CharSequence charSequence) {
        WeakReference weakReference = ((hz) ((eux) this.a.a).a).a;
        if (weakReference.get() != null) {
            ic icVar = (ic) weakReference.get();
            if (icVar.q == null) {
                icVar.q = new dvv();
            }
            ic.n(icVar.q, charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onAuthenticationSucceeded(android.hardware.fingerprint.FingerprintManager.AuthenticationResult r4) {
        /*
            r3 = this;
            android.hardware.fingerprint.FingerprintManager$CryptoObject r4 = r4.getCryptoObject()
            r0 = 0
            if (r4 != 0) goto L9
        L7:
            r1 = r0
            goto L38
        L9:
            javax.crypto.Cipher r1 = r4.getCipher()
            if (r1 == 0) goto L19
            cvi r1 = new cvi
            javax.crypto.Cipher r4 = r4.getCipher()
            r1.<init>(r4)
            goto L38
        L19:
            java.security.Signature r1 = r4.getSignature()
            if (r1 == 0) goto L29
            cvi r1 = new cvi
            java.security.Signature r4 = r4.getSignature()
            r1.<init>(r4)
            goto L38
        L29:
            javax.crypto.Mac r1 = r4.getMac()
            if (r1 == 0) goto L7
            cvi r1 = new cvi
            javax.crypto.Mac r4 = r4.getMac()
            r1.<init>(r4)
        L38:
            if (r1 != 0) goto L3b
            goto L5e
        L3b:
            java.lang.Object r4 = r1.c
            if (r4 == 0) goto L47
            hr r0 = new hr
            javax.crypto.Cipher r4 = (javax.crypto.Cipher) r4
            r0.<init>(r4)
            goto L5e
        L47:
            java.lang.Object r4 = r1.a
            if (r4 == 0) goto L53
            hr r0 = new hr
            java.security.Signature r4 = (java.security.Signature) r4
            r0.<init>(r4)
            goto L5e
        L53:
            java.lang.Object r4 = r1.b
            if (r4 == 0) goto L5e
            hr r0 = new hr
            javax.crypto.Mac r4 = (javax.crypto.Mac) r4
            r0.<init>(r4)
        L5e:
            pku r4 = r3.a
            zuw r1 = new zuw
            r2 = 2
            r1.<init>(r0, r2)
            java.lang.Object r4 = r4.a
            eux r4 = (defpackage.eux) r4
            java.lang.Object r4 = r4.a
            ht r4 = (defpackage.ht) r4
            r4.B(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctg.onAuthenticationSucceeded(android.hardware.fingerprint.FingerprintManager$AuthenticationResult):void");
    }
}
