package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class afwq extends afmx {
    final ByteBuffer a;

    public afwq(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        this.a = byteBuffer;
    }

    @Override // defpackage.afmx, defpackage.afwn
    public final void b() {
        this.a.mark();
    }

    @Override // defpackage.afmx, defpackage.afwn
    public final void c() {
        this.a.reset();
    }

    @Override // defpackage.afmx, defpackage.afwn
    public final boolean d() {
        return true;
    }

    @Override // defpackage.afwn
    public final int f() {
        a(1);
        return this.a.get() & 255;
    }

    @Override // defpackage.afwn
    public final int g() {
        return this.a.remaining();
    }

    @Override // defpackage.afwn
    public final /* bridge */ /* synthetic */ afwn h(int i) {
        a(i);
        ByteBuffer byteBuffer = this.a;
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.limit(byteBuffer.position() + i);
        byteBuffer.position(byteBuffer.position() + i);
        return new afwq(byteBufferDuplicate);
    }

    @Override // defpackage.afwn
    public final void j(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        a(iRemaining);
        ByteBuffer byteBuffer2 = this.a;
        int iLimit = byteBuffer2.limit();
        byteBuffer2.limit(byteBuffer2.position() + iRemaining);
        byteBuffer.put(byteBuffer2);
        byteBuffer2.limit(iLimit);
    }

    @Override // defpackage.afwn
    public final void k(OutputStream outputStream, int i) throws IOException {
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

    @Override // defpackage.afwn
    public final void l(byte[] bArr, int i, int i2) {
        a(i2);
        this.a.get(bArr, i, i2);
    }

    @Override // defpackage.afwn
    public final void m(int i) {
        a(i);
        ByteBuffer byteBuffer = this.a;
        byteBuffer.position(byteBuffer.position() + i);
    }
}
