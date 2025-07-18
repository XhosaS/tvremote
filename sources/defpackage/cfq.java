package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class cfq extends cfp {
    private final ByteBuffer a;

    protected cfq() {
        bdq.e(true);
        this.a = ByteBuffer.allocate(23).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void h() {
        ByteBuffer byteBuffer = this.a;
        byteBuffer.flip();
        while (byteBuffer.remaining() >= 16) {
            e(byteBuffer);
        }
        byteBuffer.compact();
    }

    private final void i() {
        if (this.a.remaining() < 8) {
            h();
        }
    }

    @Override // defpackage.cfp
    public final cft b(byte[] bArr, int i) {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr, 0, i).order(ByteOrder.LITTLE_ENDIAN);
        int iRemaining = byteBufferOrder.remaining();
        ByteBuffer byteBuffer = this.a;
        if (iRemaining <= byteBuffer.remaining()) {
            byteBuffer.put(byteBufferOrder);
            i();
            return this;
        }
        int iPosition = 16 - byteBuffer.position();
        for (int i2 = 0; i2 < iPosition; i2++) {
            byteBuffer.put(byteBufferOrder.get());
        }
        h();
        while (byteBufferOrder.remaining() >= 16) {
            e(byteBufferOrder);
        }
        byteBuffer.put(byteBufferOrder);
        return this;
    }

    @Override // defpackage.cft
    public final cfs c() {
        h();
        ByteBuffer byteBuffer = this.a;
        byteBuffer.flip();
        if (byteBuffer.remaining() > 0) {
            f(byteBuffer);
            byteBuffer.position(byteBuffer.limit());
        }
        return d();
    }

    protected abstract cfs d();

    protected abstract void e(ByteBuffer byteBuffer);

    protected void f(ByteBuffer byteBuffer) {
        throw null;
    }

    @Override // defpackage.cft
    public final void g() {
        this.a.put((byte) 0);
        i();
    }
}
