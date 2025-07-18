package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aafe implements aafy {
    final /* synthetic */ aafg a;
    private SecretKeySpec b;
    private Cipher c;
    private byte[] d;

    public aafe(aafg aafgVar) {
        this.a = aafgVar;
    }

    @Override // defpackage.aafy
    public final synchronized void a(ByteBuffer byteBuffer, int i, boolean z, ByteBuffer byteBuffer2) {
        this.c.init(2, this.b, aafg.j(this.d, i, z));
        this.c.doFinal(byteBuffer, byteBuffer2);
    }

    @Override // defpackage.aafy
    public final synchronized void b(ByteBuffer byteBuffer, byte[] bArr) {
        aafg aafgVar = this.a;
        int i = aafgVar.a;
        int i2 = i + 8;
        if (byteBuffer.remaining() != i2) {
            throw new InvalidAlgorithmParameterException("Invalid header length");
        }
        if (byteBuffer.get() != i2) {
            throw new GeneralSecurityException("Invalid ciphertext");
        }
        this.d = new byte[7];
        byte[] bArr2 = new byte[i];
        byteBuffer.get(bArr2);
        byteBuffer.get(this.d);
        this.b = aafgVar.k(bArr2, bArr);
        this.c = aafg.i();
    }
}
