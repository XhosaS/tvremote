package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yai extends xuk {
    final ByteBuffer a;

    public yai(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        this.a = byteBuffer;
    }

    @Override // defpackage.xuk, defpackage.yaf
    public final void b() {
        this.a.mark();
    }

    @Override // defpackage.xuk, defpackage.yaf
    public final void c() {
        this.a.reset();
    }

    @Override // defpackage.xuk, defpackage.yaf
    public final boolean d() {
        return true;
    }

    @Override // defpackage.yaf
    public final int e() {
        a(1);
        return this.a.get() & 255;
    }

    @Override // defpackage.yaf
    public final int f() {
        return this.a.remaining();
    }

    @Override // defpackage.yaf
    public final /* bridge */ /* synthetic */ yaf g(int i) {
        a(i);
        ByteBuffer byteBuffer = this.a;
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.limit(byteBuffer.position() + i);
        byteBuffer.position(byteBuffer.position() + i);
        return new yai(byteBufferDuplicate);
    }

    @Override // defpackage.yaf
    public final void i(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        a(iRemaining);
        ByteBuffer byteBuffer2 = this.a;
        int iLimit = byteBuffer2.limit();
        byteBuffer2.limit(byteBuffer2.position() + iRemaining);
        byteBuffer.put(byteBuffer2);
        byteBuffer2.limit(iLimit);
    }

    @Override // defpackage.yaf
    public final void j(OutputStream outputStream, int i) throws IOException {
        a(i);
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer.hasArray()) {
            outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), i);
            byteBuffer.position(byteBuffer.position() + i);
        } else {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            outputStream.write(bArr);
        }
    }

    @Override // defpackage.yaf
    public final void k(byte[] bArr, int i, int i2) {
        a(i2);
        this.a.get(bArr, i, i2);
    }

    @Override // defpackage.yaf
    public final void l(int i) {
        a(i);
        ByteBuffer byteBuffer = this.a;
        byteBuffer.position(byteBuffer.position() + i);
    }
}
