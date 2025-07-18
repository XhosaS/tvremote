package defpackage;

import com.google.protobuf.MessageLite;
import java.nio.ByteBuffer;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class abvw extends abvz {
    private final byte[] a;
    private final int b;
    private int c;

    public abvw(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int i3 = i + i2;
        int length = bArr.length;
        if ((i | i2 | (length - i3)) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        this.a = bArr;
        this.c = i;
        this.b = i3;
    }

    @Override // defpackage.abvz
    public final void A(byte[] bArr, int i) throws abvx {
        x(i);
        f(bArr, 0, i);
    }

    @Override // defpackage.abvz
    public final void P(byte b) throws abvx {
        int i;
        int i2 = this.c;
        try {
            i = i2 + 1;
        } catch (IndexOutOfBoundsException e) {
            e = e;
        }
        try {
            this.a[i2] = b;
            this.c = i;
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            i2 = i;
            throw new abvx(i2, this.b, 1, e);
        }
    }

    @Override // defpackage.abvz
    public final void Q(int i, boolean z) throws abvx {
        x(i << 3);
        P(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.abvz, defpackage.abvf
    public final void a(byte[] bArr, int i, int i2) throws abvx {
        f(bArr, i, i2);
    }

    @Override // defpackage.abvz
    public final int b() {
        return this.b - this.c;
    }

    public final void e(ByteBuffer byteBuffer) throws abvx {
        int iRemaining = byteBuffer.remaining();
        try {
            byteBuffer.get(this.a, this.c, iRemaining);
            this.c += iRemaining;
        } catch (IndexOutOfBoundsException e) {
            throw new abvx(this.c, this.b, iRemaining, e);
        }
    }

    public final void f(byte[] bArr, int i, int i2) throws abvx {
        try {
            System.arraycopy(bArr, i, this.a, this.c, i2);
            this.c += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new abvx(this.c, this.b, i2, e);
        }
    }

    @Override // defpackage.abvz
    public final void h(int i, abvo abvoVar) throws abvx {
        x((i << 3) | 2);
        i(abvoVar);
    }

    @Override // defpackage.abvz
    public final void i(abvo abvoVar) throws abvx {
        x(abvoVar.d());
        abvoVar.o(this);
    }

    @Override // defpackage.abvz
    public final void j(int i, int i2) throws abvx {
        x((i << 3) | 5);
        k(i2);
    }

    @Override // defpackage.abvz
    public final void k(int i) throws abvx {
        int i2 = this.c;
        try {
            byte[] bArr = this.a;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.c = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new abvx(i2, this.b, 4, e);
        }
    }

    @Override // defpackage.abvz
    public final void l(int i, long j) throws abvx {
        x((i << 3) | 1);
        m(j);
    }

    @Override // defpackage.abvz
    public final void m(long j) throws abvx {
        int i = this.c;
        try {
            byte[] bArr = this.a;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.c = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new abvx(i, this.b, 8, e);
        }
    }

    @Override // defpackage.abvz
    public final void n(int i, int i2) throws abvx {
        x(i << 3);
        o(i2);
    }

    @Override // defpackage.abvz
    public final void o(int i) throws abvx {
        if (i >= 0) {
            x(i);
        } else {
            z(i);
        }
    }

    @Override // defpackage.abvz
    public final void p(int i, MessageLite messageLite, abzj abzjVar) throws abvx {
        x((i << 3) | 2);
        x(((abut) messageLite).cJ(abzjVar));
        abzjVar.m(messageLite, this.f);
    }

    @Override // defpackage.abvz
    public final void q(MessageLite messageLite) throws abvx {
        x(messageLite.g());
        messageLite.f(this);
    }

    @Override // defpackage.abvz
    public final void r(int i, MessageLite messageLite) throws abvx {
        x(11);
        w(2, i);
        x(26);
        q(messageLite);
        x(12);
    }

    @Override // defpackage.abvz
    public final void s(int i, abvo abvoVar) throws abvx {
        x(11);
        w(2, i);
        h(3, abvoVar);
        x(12);
    }

    @Override // defpackage.abvz
    public final void t(int i, String str) throws abvx {
        x((i << 3) | 2);
        u(str);
    }

    @Override // defpackage.abvz
    public final void u(String str) throws abvx {
        int i = this.c;
        try {
            int iH = H(str.length() * 3);
            int iH2 = H(str.length());
            if (iH2 != iH) {
                x(acam.a(str));
                byte[] bArr = this.a;
                int i2 = this.c;
                this.c = acam.a.a(str, bArr, i2, this.b - i2);
                return;
            }
            int i3 = i + iH2;
            this.c = i3;
            int iA = acam.a.a(str, this.a, i3, this.b - i3);
            this.c = i;
            x((iA - i) - iH2);
            this.c = iA;
        } catch (acal e) {
            this.c = i;
            L(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new abvx(e2);
        }
    }

    @Override // defpackage.abvz
    public final void v(int i, int i2) throws abvx {
        x((i << 3) | i2);
    }

    @Override // defpackage.abvz
    public final void w(int i, int i2) throws abvx {
        x(i << 3);
        x(i2);
    }

    @Override // defpackage.abvz
    public final void x(int i) throws abvx {
        int i2;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i3 = this.c;
        while ((i & (-128)) != 0) {
            try {
                i2 = i3 + 1;
            } catch (IndexOutOfBoundsException e) {
                indexOutOfBoundsException = e;
                throw new abvx(i3, this.b, 1, indexOutOfBoundsException);
            }
            try {
                this.a[i3] = (byte) (i | 128);
                i >>>= 7;
                i3 = i2;
            } catch (IndexOutOfBoundsException e2) {
                indexOutOfBoundsException = e2;
                i3 = i2;
                throw new abvx(i3, this.b, 1, indexOutOfBoundsException);
            }
        }
        i2 = i3 + 1;
        this.a[i3] = (byte) i;
        this.c = i2;
    }

    @Override // defpackage.abvz
    public final void y(int i, long j) throws abvx {
        x(i << 3);
        z(j);
    }

    @Override // defpackage.abvz
    public final void z(long j) throws abvx {
        int i;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i2 = this.c;
        if (!abvz.e || this.b - i2 < 10) {
            int i3 = i2;
            while ((j & (-128)) != 0) {
                try {
                    int i4 = i3 + 1;
                    try {
                        this.a[i3] = (byte) (((int) j) | 128);
                        j >>>= 7;
                        i3 = i4;
                    } catch (IndexOutOfBoundsException e) {
                        indexOutOfBoundsException = e;
                        i3 = i4;
                        throw new abvx(i3, this.b, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e2) {
                    indexOutOfBoundsException = e2;
                }
            }
            i = i3 + 1;
            try {
                this.a[i3] = (byte) j;
            } catch (IndexOutOfBoundsException e3) {
                indexOutOfBoundsException = e3;
                i3 = i;
                throw new abvx(i3, this.b, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j & (-128)) != 0) {
                acah.f(this.a, i2, (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            acah.f(this.a, i2, (byte) j);
        }
        this.c = i;
    }

    @Override // defpackage.abvz
    public final void O() {
    }
}
