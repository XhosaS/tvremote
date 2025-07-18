package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aart {
    public ByteBuffer a;
    public int b;
    int c;
    int[] d;
    int e;
    boolean f;
    boolean g;
    int h;
    int[] i;
    int j;
    int k;
    aarr l;
    final aarx m;

    public aart() {
        throw null;
    }

    public static boolean q(aarv aarvVar, int i) {
        return aarvVar.a(i) != 0;
    }

    public final int a(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        p(1, iRemaining, 1);
        ByteBuffer byteBuffer2 = this.a;
        int i = this.b - iRemaining;
        this.b = i;
        byteBuffer2.position(i);
        this.a.put(byteBuffer);
        return e();
    }

    public final int b(byte[] bArr) {
        int length = bArr.length;
        p(1, length, 1);
        ByteBuffer byteBuffer = this.a;
        int i = this.b - length;
        this.b = i;
        byteBuffer.position(i);
        this.a.put(bArr);
        return e();
    }

    public final int c(CharSequence charSequence) {
        aarx aarxVar = this.m;
        int iA = aarxVar.a(charSequence);
        m(1, 0);
        ByteBuffer byteBuffer = this.a;
        int i = this.b - 1;
        this.b = i;
        byteBuffer.put(i, (byte) 0);
        p(1, iA, 1);
        ByteBuffer byteBuffer2 = this.a;
        int i2 = this.b - iA;
        this.b = i2;
        byteBuffer2.position(i2);
        aarxVar.c(charSequence, this.a);
        return e();
    }

    public final int d() {
        int i;
        if (this.d == null || !this.f) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        h(0);
        int iF = f();
        int i2 = this.e;
        do {
            i2--;
            if (i2 < 0) {
                break;
            }
        } while (this.d[i2] == 0);
        for (int i3 = i2; i3 >= 0; i3--) {
            int i4 = this.d[i3];
            j((short) (i4 != 0 ? iF - i4 : 0));
        }
        j((short) (iF - this.h));
        int i5 = i2 + 3;
        j((short) (i5 + i5));
        int i6 = 0;
        loop2: while (true) {
            if (i6 >= this.j) {
                i = 0;
                break;
            }
            int iCapacity = this.a.capacity() - this.i[i6];
            int i7 = this.b;
            short s = this.a.getShort(iCapacity);
            if (s == this.a.getShort(i7)) {
                for (int i8 = 2; i8 < s; i8 += 2) {
                    if (this.a.getShort(iCapacity + i8) != this.a.getShort(i7 + i8)) {
                        break;
                    }
                }
                i = this.i[i6];
                break loop2;
            }
            i6++;
        }
        if (i != 0) {
            int iCapacity2 = this.a.capacity() - iF;
            this.b = iCapacity2;
            this.a.putInt(iCapacity2, i - iF);
        } else {
            int i9 = this.j;
            int[] iArr = this.i;
            if (i9 == iArr.length) {
                this.i = Arrays.copyOf(iArr, i9 + i9);
            }
            int[] iArr2 = this.i;
            int i10 = this.j;
            this.j = i10 + 1;
            iArr2[i10] = f();
            ByteBuffer byteBuffer = this.a;
            byteBuffer.putInt(byteBuffer.capacity() - iF, f() - iF);
        }
        this.f = false;
        return iF;
    }

    public final int e() {
        if (!this.f) {
            throw new AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.f = false;
        n(this.k);
        return f();
    }

    public final int f() {
        return this.a.capacity() - this.b;
    }

    public final void g(int i, boolean z, boolean z2) {
        if (z != z2) {
            m(1, 0);
            ByteBuffer byteBuffer = this.a;
            int i2 = this.b - 1;
            this.b = i2;
            byteBuffer.put(i2, z ? (byte) 1 : (byte) 0);
            this.d[i] = f();
        }
    }

    public final void h(int i) {
        m(4, 0);
        n(i);
    }

    public final void i(int i) {
        m(4, 0);
        n((f() - i) + 4);
    }

    public final void j(short s) {
        m(2, 0);
        ByteBuffer byteBuffer = this.a;
        int i = this.b - 2;
        this.b = i;
        byteBuffer.putShort(i, s);
    }

    public final void k() {
        if (!this.g) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
    }

    public final void l() {
        if (this.f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    public final void m(int i, int i2) {
        int i3;
        if (i > this.c) {
            this.c = i;
        }
        int i4 = i - 1;
        int i5 = ~((this.a.capacity() - this.b) + i2);
        while (true) {
            int i6 = (i5 + 1) & i4;
            if (this.b >= i6 + i + i2) {
                for (int i7 = 0; i7 < i6; i7++) {
                    ByteBuffer byteBuffer = this.a;
                    int i8 = this.b - 1;
                    this.b = i8;
                    byteBuffer.put(i8, (byte) 0);
                }
                return;
            }
            int iCapacity = this.a.capacity();
            ByteBuffer byteBuffer2 = this.a;
            aarr aarrVar = this.l;
            int iCapacity2 = byteBuffer2.capacity();
            if (iCapacity2 == 0) {
                i3 = 1024;
            } else {
                i3 = 2147483639;
                if (iCapacity2 == 2147483639) {
                    throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
                }
                if (((-1073741824) & iCapacity2) == 0) {
                    i3 = iCapacity2 + iCapacity2;
                }
            }
            byteBuffer2.position(0);
            ByteBuffer byteBufferA = aarrVar.a(i3);
            byteBufferA.position(byteBufferA.clear().capacity() - iCapacity2);
            byteBufferA.put(byteBuffer2);
            this.a = byteBufferA;
            this.b += byteBufferA.capacity() - iCapacity;
        }
    }

    public final void n(int i) {
        ByteBuffer byteBuffer = this.a;
        int i2 = this.b - 4;
        this.b = i2;
        byteBuffer.putInt(i2, i);
    }

    public final void o(int i) {
        l();
        int[] iArr = this.d;
        if (iArr == null || iArr.length < i) {
            this.d = new int[i];
        }
        this.e = i;
        Arrays.fill(this.d, 0, i, 0);
        this.f = true;
        this.h = f();
    }

    public final void p(int i, int i2, int i3) {
        l();
        this.k = i2;
        int i4 = i * i2;
        m(4, i4);
        m(i3, i4);
        this.f = true;
    }

    public final void r(int i, float f) {
        if (f != 0.0d) {
            m(4, 0);
            ByteBuffer byteBuffer = this.a;
            int i2 = this.b - 4;
            this.b = i2;
            byteBuffer.putFloat(i2, f);
            this.d[i] = f();
        }
    }

    public final void s(int i, int i2) {
        if (i2 != 0) {
            h(i2);
            this.d[i] = f();
        }
    }

    public final void t(int i, int i2) {
        if (i2 != 0) {
            i(i2);
            this.d[i] = f();
        }
    }

    public final void u(int i) {
        m(this.c, 4);
        i(i);
        this.a.position(this.b);
        this.g = true;
    }

    public aart(int i) {
        aars aarsVar = aars.a;
        aarx aarxVarD = aarx.d();
        this.c = 1;
        this.d = null;
        this.e = 0;
        this.f = false;
        this.g = false;
        this.i = new int[16];
        this.j = 0;
        this.k = 0;
        this.l = aarsVar;
        ByteBuffer byteBufferA = aarsVar.a(i <= 0 ? 1024 : i);
        this.a = byteBufferA;
        this.m = aarxVarD;
        this.b = byteBufferA.capacity();
    }
}
