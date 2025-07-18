package defpackage;

import java.nio.ByteBuffer;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aafc implements aafz {
    final /* synthetic */ aafd a;
    private final SecretKeySpec b;
    private final SecretKeySpec c;
    private final Cipher d = aafd.i();
    private final Mac e;
    private final byte[] f;
    private final ByteBuffer g;
    private long h;

    public aafc(aafd aafdVar, byte[] bArr) {
        this.a = aafdVar;
        this.h = 0L;
        this.e = aafdVar.j();
        this.h = 0L;
        byte[] bArrB = aacb.b(aafdVar.b);
        byte[] bArrB2 = aacb.b(7);
        this.f = bArrB2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(aafdVar.b + 8);
        this.g = byteBufferAllocate;
        byteBufferAllocate.put((byte) (aafdVar.b + 8));
        byteBufferAllocate.put(bArrB);
        byteBufferAllocate.put(bArrB2);
        byteBufferAllocate.flip();
        byte[] bArrM = aafdVar.m(bArrB, bArr);
        this.b = aafdVar.l(bArrM);
        this.c = aafdVar.k(bArrM);
    }

    @Override // defpackage.aafz
    public final ByteBuffer a() {
        return this.g.asReadOnlyBuffer();
    }

    @Override // defpackage.aafz
    public final synchronized void b(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
        aafd aafdVar = this.a;
        byte[] bArr = this.f;
        int iPosition = byteBuffer3.position();
        byte[] bArrN = aafdVar.n(bArr, this.h, false);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArrN);
        Cipher cipher = this.d;
        cipher.init(1, this.b, ivParameterSpec);
        this.h++;
        cipher.update(byteBuffer, byteBuffer3);
        cipher.doFinal(byteBuffer2, byteBuffer3);
        ByteBuffer byteBufferDuplicate = byteBuffer3.duplicate();
        byteBufferDuplicate.flip();
        byteBufferDuplicate.position(iPosition);
        Mac mac = this.e;
        mac.init(this.c);
        mac.update(bArrN);
        mac.update(byteBufferDuplicate);
        byteBuffer3.put(mac.doFinal(), 0, aafdVar.c);
    }

    @Override // defpackage.aafz
    public final synchronized void c(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        aafd aafdVar = this.a;
        byte[] bArr = this.f;
        int iPosition = byteBuffer2.position();
        byte[] bArrN = aafdVar.n(bArr, this.h, true);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArrN);
        Cipher cipher = this.d;
        cipher.init(1, this.b, ivParameterSpec);
        this.h++;
        cipher.doFinal(byteBuffer, byteBuffer2);
        ByteBuffer byteBufferDuplicate = byteBuffer2.duplicate();
        byteBufferDuplicate.flip();
        byteBufferDuplicate.position(iPosition);
        Mac mac = this.e;
        mac.init(this.c);
        mac.update(bArrN);
        mac.update(byteBufferDuplicate);
        byteBuffer2.put(mac.doFinal(), 0, aafdVar.c);
    }
}
