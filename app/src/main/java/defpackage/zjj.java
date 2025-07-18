package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class zjj extends zji {
    public final ByteBuffer a = ByteBuffer.allocate(23).order(ByteOrder.LITTLE_ENDIAN);

    protected zjj() {
    }

    private final void k() {
        ByteBuffer byteBuffer = this.a;
        byteBuffer.flip();
        while (byteBuffer.remaining() >= 16) {
            i(byteBuffer);
        }
        byteBuffer.compact();
    }

    @Override // defpackage.zji
    public final void a(char c) {
        this.a.putChar(c);
        h();
    }

    protected abstract zjm c();

    @Override // defpackage.zji
    public final void d(byte[] bArr, int i) {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr, 0, i).order(ByteOrder.LITTLE_ENDIAN);
        int iRemaining = byteBufferOrder.remaining();
        ByteBuffer byteBuffer = this.a;
        if (iRemaining <= byteBuffer.remaining()) {
            byteBuffer.put(byteBufferOrder);
            h();
            return;
        }
        int iPosition = 16 - byteBuffer.position();
        for (int i2 = 0; i2 < iPosition; i2++) {
            byteBuffer.put(byteBufferOrder.get());
        }
        k();
        while (byteBufferOrder.remaining() >= 16) {
            i(byteBufferOrder);
        }
        byteBuffer.put(byteBufferOrder);
    }

    public final void h() {
        if (this.a.remaining() < 8) {
            k();
        }
    }

    protected abstract void i(ByteBuffer byteBuffer);

    protected void j(ByteBuffer byteBuffer) {
        throw null;
    }

    @Override // defpackage.zjo
    public final zjm n() {
        k();
        ByteBuffer byteBuffer = this.a;
        byteBuffer.flip();
        if (byteBuffer.remaining() > 0) {
            j(byteBuffer);
            byteBuffer.position(byteBuffer.limit());
        }
        return c();
    }
}
