package defpackage;

import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abvy extends abvv {
    private final OutputStream g;

    public abvy(OutputStream outputStream, int i) {
        super(i);
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.g = outputStream;
    }

    private final void M() throws IOException {
        this.g.write(this.a, 0, this.c);
        this.c = 0;
    }

    private final void N(int i) throws IOException {
        if (this.b - this.c < i) {
            M();
        }
    }

    @Override // defpackage.abvz
    public final void A(byte[] bArr, int i) throws IOException {
        x(i);
        B(bArr, 0, i);
    }

    public final void B(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.b;
        int i4 = this.c;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, this.a, i4, i2);
            this.c += i2;
            this.d += i2;
            return;
        }
        byte[] bArr2 = this.a;
        System.arraycopy(bArr, i, bArr2, i4, i5);
        int i6 = i + i5;
        this.c = i3;
        this.d += i5;
        M();
        int i7 = i2 - i5;
        if (i7 <= i3) {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.c = i7;
        } else {
            this.g.write(bArr, i6, i7);
        }
        this.d += i7;
    }

    @Override // defpackage.abvz
    public final void O() throws IOException {
        if (this.c > 0) {
            M();
        }
    }

    @Override // defpackage.abvz
    public final void P(byte b) throws IOException {
        if (this.c == this.b) {
            M();
        }
        c(b);
    }

    @Override // defpackage.abvz
    public final void Q(int i, boolean z) throws IOException {
        N(11);
        f(i << 3);
        c(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.abvz, defpackage.abvf
    public final void a(byte[] bArr, int i, int i2) throws IOException {
        B(bArr, i, i2);
    }

    @Override // defpackage.abvz
    public final void h(int i, abvo abvoVar) throws IOException {
        x((i << 3) | 2);
        i(abvoVar);
    }

    @Override // defpackage.abvz
    public final void i(abvo abvoVar) throws IOException {
        x(abvoVar.d());
        abvoVar.o(this);
    }

    @Override // defpackage.abvz
    public final void j(int i, int i2) throws IOException {
        N(14);
        f((i << 3) | 5);
        d(i2);
    }

    @Override // defpackage.abvz
    public final void k(int i) throws IOException {
        N(4);
        d(i);
    }

    @Override // defpackage.abvz
    public final void l(int i, long j) throws IOException {
        N(18);
        f((i << 3) | 1);
        e(j);
    }

    @Override // defpackage.abvz
    public final void m(long j) throws IOException {
        N(8);
        e(j);
    }

    @Override // defpackage.abvz
    public final void n(int i, int i2) throws IOException {
        N(20);
        f(i << 3);
        if (i2 >= 0) {
            f(i2);
        } else {
            g(i2);
        }
    }

    @Override // defpackage.abvz
    public final void o(int i) throws IOException {
        if (i >= 0) {
            x(i);
        } else {
            z(i);
        }
    }

    @Override // defpackage.abvz
    public final void p(int i, MessageLite messageLite, abzj abzjVar) throws IOException {
        x((i << 3) | 2);
        x(((abut) messageLite).cJ(abzjVar));
        abzjVar.m(messageLite, this.f);
    }

    @Override // defpackage.abvz
    public final void q(MessageLite messageLite) throws IOException {
        x(messageLite.g());
        messageLite.f(this);
    }

    @Override // defpackage.abvz
    public final void r(int i, MessageLite messageLite) throws IOException {
        x(11);
        w(2, i);
        x(26);
        q(messageLite);
        x(12);
    }

    @Override // defpackage.abvz
    public final void s(int i, abvo abvoVar) throws IOException {
        x(11);
        w(2, i);
        h(3, abvoVar);
        x(12);
    }

    @Override // defpackage.abvz
    public final void t(int i, String str) throws IOException {
        x((i << 3) | 2);
        u(str);
    }

    @Override // defpackage.abvz
    public final void u(String str) throws IOException {
        int iA;
        try {
            int length = str.length() * 3;
            int iH = H(length);
            int i = iH + length;
            int i2 = this.b;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iA2 = acam.a.a(str, bArr, 0, length);
                x(iA2);
                B(bArr, 0, iA2);
                return;
            }
            if (i > i2 - this.c) {
                M();
            }
            int iH2 = H(str.length());
            int i3 = this.c;
            try {
                if (iH2 == iH) {
                    int i4 = i3 + iH2;
                    this.c = i4;
                    acaj acajVar = acam.a;
                    int iA3 = acam.a.a(str, this.a, i4, i2 - i4);
                    this.c = i3;
                    iA = (iA3 - i3) - iH2;
                    f(iA);
                    this.c = iA3;
                } else {
                    iA = acam.a(str);
                    f(iA);
                    this.c = acam.a.a(str, this.a, this.c, iA);
                }
                this.d += iA;
            } catch (acal e) {
                this.d -= this.c - i3;
                this.c = i3;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new abvx(e2);
            }
        } catch (acal e3) {
            L(str, e3);
        }
    }

    @Override // defpackage.abvz
    public final void v(int i, int i2) throws IOException {
        x((i << 3) | i2);
    }

    @Override // defpackage.abvz
    public final void w(int i, int i2) throws IOException {
        N(20);
        f(i << 3);
        f(i2);
    }

    @Override // defpackage.abvz
    public final void x(int i) throws IOException {
        N(5);
        f(i);
    }

    @Override // defpackage.abvz
    public final void y(int i, long j) throws IOException {
        N(20);
        f(i << 3);
        g(j);
    }

    @Override // defpackage.abvz
    public final void z(long j) throws IOException {
        N(10);
        g(j);
    }
}
