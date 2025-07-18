package defpackage;

import android.util.Log;
import java.security.GeneralSecurityException;
import java.security.ProviderException;
import javax.crypto.BadPaddingException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaak implements zzj {
    private static final String a = "aaak";
    private final zzj b;

    public aaak(String str) {
        this.b = new aaai(str, aaaj.a());
    }

    private static void c() throws InterruptedException {
        try {
            Thread.sleep((int) (Math.random() * 100.0d));
        } catch (InterruptedException unused) {
        }
    }

    @Override // defpackage.zzj
    public final byte[] a(byte[] bArr, byte[] bArr2) throws BadPaddingException, InterruptedException {
        try {
            return this.b.a(bArr, bArr2);
        } catch (GeneralSecurityException e) {
            e = e;
            Log.w(a, "encountered a potentially transient KeyStore error, will wait and retry", e);
            c();
            return this.b.a(bArr, bArr2);
        } catch (ProviderException e2) {
            e = e2;
            Log.w(a, "encountered a potentially transient KeyStore error, will wait and retry", e);
            c();
            return this.b.a(bArr, bArr2);
        } catch (BadPaddingException e3) {
            throw e3;
        }
    }

    @Override // defpackage.zzj
    public final byte[] b(byte[] bArr, byte[] bArr2) throws InterruptedException {
        try {
            return this.b.b(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e) {
            Log.w(a, "encountered a potentially transient KeyStore error, will wait and retry", e);
            c();
            return this.b.b(bArr, bArr2);
        }
    }
}
