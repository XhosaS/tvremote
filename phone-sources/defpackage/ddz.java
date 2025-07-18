package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ddz extends ddm {
    private static final Logger a = Logger.getLogger(ddz.class.getName());
    public static final boolean e = dgf.b;
    public cxe f;

    public static int G(int i, dds ddsVar) {
        return W(i) + H(ddsVar);
    }

    public static int H(dds ddsVar) {
        return O(ddsVar.c());
    }

    public static int I(int i, int i2) {
        return W(i) + L(i2);
    }

    @Deprecated
    static int J(int i, dfh dfhVar, dfs dfsVar) {
        int iW = W(i);
        return iW + iW + ((ddi) dfhVar).c(dfsVar);
    }

    public static int K(int i, int i2) {
        return W(i) + L(i2);
    }

    public static int L(int i) {
        return aa(i);
    }

    public static int M(int i, long j) {
        return W(i) + aa(j);
    }

    public static int N(deu deuVar) {
        return O(deuVar.b != null ? deuVar.b.c() : deuVar.a != null ? deuVar.a.h() : 0);
    }

    static int O(int i) {
        return Y(i) + i;
    }

    static int P(dfh dfhVar, dfs dfsVar) {
        return O(((ddi) dfhVar).c(dfsVar));
    }

    public static int Q(int i, int i2) {
        return W(i) + R(i2);
    }

    public static int R(int i) {
        return Y(ab(i));
    }

    public static int S(int i, long j) {
        return W(i) + T(j);
    }

    public static int T(long j) {
        return aa(ac(j));
    }

    public static int U(int i, String str) {
        return W(i) + V(str);
    }

    public static int V(String str) {
        int length;
        try {
            length = dgk.b(str);
        } catch (dgi unused) {
            length = str.getBytes(dep.a).length;
        }
        return O(length);
    }

    public static int W(int i) {
        return Y(dgn.c(i, 0));
    }

    public static int X(int i, int i2) {
        return W(i) + Y(i2);
    }

    public static int Y(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int Z(int i, long j) {
        return W(i) + aa(j);
    }

    public static int aa(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int ab(int i) {
        return (i >> 31) ^ (i + i);
    }

    public static long ac(long j) {
        return (j >> 63) ^ (j + j);
    }

    public static int an(int i) {
        return W(i) + 1;
    }

    public static int ao(int i) {
        return W(i) + 8;
    }

    public static int ap(int i) {
        return W(i) + 4;
    }

    public static int aq(int i) {
        return W(i) + 8;
    }

    public static int ar(int i) {
        return W(i) + 4;
    }

    public static int as(int i) {
        return W(i) + 4;
    }

    public static int at(int i) {
        return W(i) + 8;
    }

    public abstract void A(int i, int i2);

    public abstract void B(int i);

    public abstract void C(int i, long j);

    public abstract void D(long j);

    public abstract void E(byte[] bArr, int i);

    @Override // defpackage.ddm
    public abstract void a(byte[] bArr, int i);

    final void ad(String str, dgi dgiVar) throws ddy {
        a.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dgiVar);
        byte[] bytes = str.getBytes(dep.a);
        try {
            int length = bytes.length;
            B(length);
            a(bytes, length);
        } catch (IndexOutOfBoundsException e2) {
            throw new ddy(e2);
        }
    }

    public final void ae(int i, double d) {
        p(i, Double.doubleToRawLongBits(d));
    }

    public final void af(double d) {
        q(Double.doubleToRawLongBits(d));
    }

    public final void ag(int i, float f) {
        n(i, Float.floatToRawIntBits(f));
    }

    public final void ah(float f) {
        o(Float.floatToRawIntBits(f));
    }

    @Deprecated
    public final void ai(dfh dfhVar) {
        dfhVar.r(this);
    }

    public final void aj(int i, int i2) {
        A(i, ab(i2));
    }

    public final void ak(int i) {
        B(ab(i));
    }

    public final void al(int i, long j) {
        C(i, ac(j));
    }

    public final void am(long j) {
        D(ac(j));
    }

    public abstract int b();

    public abstract void j(byte b);

    public abstract void k(int i, boolean z);

    public abstract void l(int i, dds ddsVar);

    public abstract void m(dds ddsVar);

    public abstract void n(int i, int i2);

    public abstract void o(int i);

    public abstract void p(int i, long j);

    public abstract void q(long j);

    public abstract void r(int i, int i2);

    public abstract void s(int i);

    public abstract void t(int i, dfh dfhVar, dfs dfsVar);

    public abstract void u(dfh dfhVar);

    public abstract void v(int i, dfh dfhVar);

    public abstract void w(int i, dds ddsVar);

    public abstract void x(int i, String str);

    public abstract void y(String str);

    public abstract void z(int i, int i2);
}
