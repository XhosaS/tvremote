package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class tyv extends tyu {
    public final ByteBuffer a;

    protected tyv() {
        a.H(true);
        this.a = ByteBuffer.allocate(23).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void j() {
        ByteBuffer byteBuffer = this.a;
        byteBuffer.flip();
        while (byteBuffer.remaining() >= 16) {
            h(byteBuffer);
        }
        byteBuffer.compact();
    }

    @Override // defpackage.tyu
    public final void a(char c) {
        this.a.putChar(c);
        g();
    }

    @Override // defpackage.tyu, defpackage.tza
    public final void c(byte[] bArr, int i) {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr, 0, i).order(ByteOrder.LITTLE_ENDIAN);
        int iRemaining = byteBufferOrder.remaining();
        ByteBuffer byteBuffer = this.a;
        if (iRemaining <= byteBuffer.remaining()) {
            byteBuffer.put(byteBufferOrder);
            g();
            return;
        }
        int iPosition = 16 - byteBuffer.position();
        for (int i2 = 0; i2 < iPosition; i2++) {
            byteBuffer.put(byteBufferOrder.get());
        }
        j();
        while (byteBufferOrder.remaining() >= 16) {
            h(byteBufferOrder);
        }
        byteBuffer.put(byteBufferOrder);
    }

    protected abstract tyy f();

    public final void g() {
        if (this.a.remaining() < 8) {
            j();
        }
    }

    protected abstract void h(ByteBuffer byteBuffer);

    protected void i(ByteBuffer byteBuffer) {
        throw null;
    }

    @Override // defpackage.tza
    public final tyy m() {
        j();
        ByteBuffer byteBuffer = this.a;
        byteBuffer.flip();
        if (byteBuffer.remaining() > 0) {
            i(byteBuffer);
            byteBuffer.position(byteBuffer.limit());
        }
        return f();
    }
}
