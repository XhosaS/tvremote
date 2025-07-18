package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class btq {
    public int a;
    public ByteBuffer b;
    private int c;
    private int d;

    public btq() {
        if (btr.a == null) {
            btr.a = new bts();
        }
    }

    public final int e(int i) {
        if (i < this.d) {
            return this.b.getShort(this.c + i);
        }
        return 0;
    }

    public final int f(int i) {
        int i2 = i + this.a;
        return i2 + this.b.getInt(i2) + 4;
    }

    protected final int g(int i) {
        int i2 = i + this.a;
        return this.b.getInt(i2 + this.b.getInt(i2));
    }

    public final void h(int i, ByteBuffer byteBuffer) {
        short s;
        this.b = byteBuffer;
        if (byteBuffer != null) {
            this.a = i;
            int i2 = i - byteBuffer.getInt(i);
            this.c = i2;
            s = this.b.getShort(i2);
        } else {
            s = 0;
            this.a = 0;
            this.c = 0;
        }
        this.d = s;
    }
}
