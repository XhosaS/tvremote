package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eqd implements ees {
    private final ees a;
    private final byte[] b;
    private final byte[] c;
    private CipherInputStream d;

    public eqd(ees eesVar, byte[] bArr, byte[] bArr2) {
        this.a = eesVar;
        this.b = bArr;
        this.c = bArr2;
    }

    @Override // defpackage.dyu
    public final int a(byte[] bArr, int i, int i2) throws IOException {
        this.d.getClass();
        int i3 = this.d.read(bArr, i, i2);
        if (i3 < 0) {
            return -1;
        }
        return i3;
    }

    @Override // defpackage.ees
    public final long b(eey eeyVar) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(this.c));
                eew eewVar = new eew(this.a, eeyVar);
                this.d = new CipherInputStream(eewVar, cipher);
                eewVar.a();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // defpackage.ees
    public final Uri c() {
        return this.a.c();
    }

    @Override // defpackage.ees
    public final void d() {
        if (this.d != null) {
            this.d = null;
            this.a.d();
        }
    }

    @Override // defpackage.ees
    public final Map e() {
        return this.a.e();
    }

    @Override // defpackage.ees
    public final void f(efy efyVar) {
        efyVar.getClass();
        this.a.f(efyVar);
    }
}
