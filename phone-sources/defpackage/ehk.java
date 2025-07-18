package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ehk extends ehe {
    public dze a;
    public final ehg b = new ehg();
    public ByteBuffer c;
    public boolean d;
    public long e;
    public ByteBuffer f;
    private final int g;

    static {
        dzz.b("media3.decoder");
    }

    public ehk(int i) {
        this.g = i;
    }

    private final ByteBuffer d(int i) {
        int i2 = this.g;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.c;
        throw new ehj(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }

    public final void a(int i) {
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer == null) {
            this.c = d(i);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (iCapacity >= i2) {
            this.c = byteBuffer;
            return;
        }
        ByteBuffer byteBufferD = d(i2);
        byteBufferD.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferD.put(byteBuffer);
        }
        this.c = byteBufferD;
    }

    public final void b() {
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean c() {
        return getFlag(1073741824);
    }

    @Override // defpackage.ehe
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.d = false;
    }
}
