package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aarv {
    public int a;
    public ByteBuffer b;
    final aarx c = aarx.d();
    private int d;
    private int e;

    public final int a(int i) {
        if (i < this.e) {
            return this.b.getShort(this.d + i);
        }
        return 0;
    }

    public final int b(int i) {
        int i2 = i + this.a;
        return i2 + this.b.getInt(i2) + 4;
    }

    public final int c(int i) {
        int i2 = i + this.a;
        return this.b.getInt(i2 + this.b.getInt(i2));
    }

    public final String d(int i) {
        ByteBuffer byteBuffer = this.b;
        int i2 = i + byteBuffer.getInt(i);
        return this.c.b(byteBuffer, i2 + 4, byteBuffer.getInt(i2));
    }

    public final void e(int i, ByteBuffer byteBuffer) {
        short s;
        this.b = byteBuffer;
        if (byteBuffer != null) {
            this.a = i;
            int i2 = i - byteBuffer.getInt(i);
            this.d = i2;
            s = this.b.getShort(i2);
        } else {
            s = 0;
            this.a = 0;
            this.d = 0;
        }
        this.e = s;
    }

    public final ByteBuffer f(int i) {
        int iA = a(i);
        if (iA == 0) {
            return null;
        }
        ByteBuffer byteBufferOrder = this.b.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int iB = b(iA);
        byteBufferOrder.position(iB);
        byteBufferOrder.limit(iB + c(iA));
        return byteBufferOrder;
    }
}
