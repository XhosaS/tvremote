package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aafb implements aafy {
    final /* synthetic */ aafd a;
    private SecretKeySpec b;
    private SecretKeySpec c;
    private Cipher d;
    private Mac e;
    private byte[] f;

    public aafb(aafd aafdVar) {
        this.a = aafdVar;
    }

    @Override // defpackage.aafy
    public final synchronized void a(ByteBuffer byteBuffer, int i, boolean z, ByteBuffer byteBuffer2) {
        int iPosition = byteBuffer.position();
        byte[] bArr = this.f;
        long j = i;
        aafd aafdVar = this.a;
        byte[] bArrN = aafdVar.n(bArr, j, z);
        int iRemaining = byteBuffer.remaining();
        int i2 = aafdVar.c;
        if (iRemaining < i2) {
            throw new GeneralSecurityException("Ciphertext too short");
        }
        int i3 = iPosition + (iRemaining - i2);
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.limit(i3);
        ByteBuffer byteBufferDuplicate2 = byteBuffer.duplicate();
        byteBufferDuplicate2.position(i3);
        this.e.init(this.c);
        this.e.update(bArrN);
        this.e.update(byteBufferDuplicate);
        byte[] bArrCopyOf = Arrays.copyOf(this.e.doFinal(), i2);
        byte[] bArr2 = new byte[i2];
        byteBufferDuplicate2.get(bArr2);
        if (!MessageDigest.isEqual(bArr2, bArrCopyOf)) {
            throw new GeneralSecurityException("Tag mismatch");
        }
        byteBuffer.limit(i3);
        this.d.init(1, this.b, new IvParameterSpec(bArrN));
        this.d.doFinal(byteBuffer, byteBuffer2);
    }

    @Override // defpackage.aafy
    public final synchronized void b(ByteBuffer byteBuffer, byte[] bArr) {
        aafd aafdVar = this.a;
        int i = aafdVar.b;
        int i2 = i + 8;
        if (byteBuffer.remaining() != i2) {
            throw new InvalidAlgorithmParameterException("Invalid header length");
        }
        if (byteBuffer.get() != i2) {
            throw new GeneralSecurityException("Invalid ciphertext");
        }
        this.f = new byte[7];
        byte[] bArr2 = new byte[i];
        byteBuffer.get(bArr2);
        byteBuffer.get(this.f);
        byte[] bArrM = aafdVar.m(bArr2, bArr);
        this.b = aafdVar.l(bArrM);
        this.c = aafdVar.k(bArrM);
        this.d = aafd.i();
        this.e = aafdVar.j();
    }
}
