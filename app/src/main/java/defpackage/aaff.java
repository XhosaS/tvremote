package defpackage;

import java.nio.ByteBuffer;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aaff implements aafz {
    private final SecretKeySpec a;
    private final Cipher b = aafg.i();
    private final byte[] c;
    private final ByteBuffer d;
    private long e;

    public aaff(aafg aafgVar, byte[] bArr) {
        this.e = 0L;
        this.e = 0L;
        byte[] bArrB = aacb.b(aafgVar.a);
        byte[] bArrB2 = aacb.b(7);
        this.c = bArrB2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(aafgVar.a + 8);
        this.d = byteBufferAllocate;
        byteBufferAllocate.put((byte) (aafgVar.a + 8));
        byteBufferAllocate.put(bArrB);
        byteBufferAllocate.put(bArrB2);
        byteBufferAllocate.flip();
        this.a = aafgVar.k(bArrB, bArr);
    }

    @Override // defpackage.aafz
    public final ByteBuffer a() {
        return this.d.asReadOnlyBuffer();
    }

    @Override // defpackage.aafz
    public final synchronized void b(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
        GCMParameterSpec gCMParameterSpecJ = aafg.j(this.c, this.e, false);
        Cipher cipher = this.b;
        cipher.init(1, this.a, gCMParameterSpecJ);
        this.e++;
        if (!byteBuffer2.hasRemaining()) {
            cipher.doFinal(byteBuffer, byteBuffer3);
        } else {
            cipher.update(byteBuffer, byteBuffer3);
            cipher.doFinal(byteBuffer2, byteBuffer3);
        }
    }

    @Override // defpackage.aafz
    public final synchronized void c(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        GCMParameterSpec gCMParameterSpecJ = aafg.j(this.c, this.e, true);
        Cipher cipher = this.b;
        cipher.init(1, this.a, gCMParameterSpecJ);
        this.e++;
        cipher.doFinal(byteBuffer, byteBuffer2);
    }
}
