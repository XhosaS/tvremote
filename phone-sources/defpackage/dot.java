package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dot extends doe {
    private static final Logger a = Logger.getLogger(dot.class.getName());
    public static final boolean e = dra.b;
    public dhq f;

    public static int D(int i, dol dolVar) {
        return T(i) + E(dolVar);
    }

    public static int E(dol dolVar) {
        return L(dolVar.c());
    }

    public static int F(int i, int i2) {
        return T(i) + I(i2);
    }

    @Deprecated
    static int G(int i, dqa dqaVar, dqk dqkVar) {
        int iT = T(i);
        return iT + iT + ((doa) dqaVar).b(dqkVar);
    }

    public static int H(int i, int i2) {
        return T(i) + I(i2);
    }

    public static int I(int i) {
        return X(i);
    }

    public static int J(int i, long j) {
        return T(i) + X(j);
    }

    public static int K(dpo dpoVar) {
        return L(dpoVar.b != null ? dpoVar.b.c() : dpoVar.a != null ? dpoVar.a.g() : 0);
    }

    static int L(int i) {
        return V(i) + i;
    }

    static int M(dqa dqaVar, dqk dqkVar) {
        return L(((doa) dqaVar).b(dqkVar));
    }

    public static int N(int i, int i2) {
        return T(i) + O(i2);
    }

    public static int O(int i) {
        return V(Y(i));
    }

    public static int P(int i, long j) {
        return T(i) + Q(j);
    }

    public static int Q(long j) {
        return X(Z(j));
    }

    public static int R(int i, String str) {
        return T(i) + S(str);
    }

    public static int S(String str) {
        int length;
        try {
            length = drf.b(str);
        } catch (drd unused) {
            length = str.getBytes(dpk.a).length;
        }
        return L(length);
    }

    public static int T(int i) {
        return V(dri.c(i, 0));
    }

    public static int U(int i, int i2) {
        return T(i) + V(i2);
    }

    public static int V(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int W(int i, long j) {
        return T(i) + X(j);
    }

    public static int X(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int Y(int i) {
        return (i >> 31) ^ (i + i);
    }

    public static long Z(long j) {
        return (j >> 63) ^ (j + j);
    }

    public static int aj(int i) {
        return T(i) + 1;
    }

    public static int ak(int i) {
        return T(i) + 8;
    }

    public static int al(int i) {
        return T(i) + 4;
    }

    public static int am(int i) {
        return T(i) + 8;
    }

    public static int an(int i) {
        return T(i) + 4;
    }

    public static int ao(int i) {
        return T(i) + 4;
    }

    public static int ap(int i) {
        return T(i) + 8;
    }

    public abstract void A(int i, long j);

    public abstract void B(long j);

    @Override // defpackage.doe
    public abstract void a(byte[] bArr, int i);

    final void aa(String str, drd drdVar) throws dos {
        a.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) drdVar);
        byte[] bytes = str.getBytes(dpk.a);
        try {
            int length = bytes.length;
            z(length);
            a(bytes, length);
        } catch (IndexOutOfBoundsException e2) {
            throw new dos(e2);
        }
    }

    public final void ab(int i, double d) {
        o(i, Double.doubleToRawLongBits(d));
    }

    public final void ac(double d) {
        p(Double.doubleToRawLongBits(d));
    }

    public final void ad(int i, float f) {
        m(i, Float.floatToRawIntBits(f));
    }

    public final void ae(float f) {
        n(Float.floatToRawIntBits(f));
    }

    public final void af(int i, int i2) {
        y(i, Y(i2));
    }

    public final void ag(int i) {
        z(Y(i));
    }

    public final void ah(int i, long j) {
        A(i, Z(j));
    }

    public final void ai(long j) {
        B(Z(j));
    }

    public abstract int b();

    public abstract void j(byte b);

    public abstract void k(int i, boolean z);

    public abstract void l(int i, dol dolVar);

    public abstract void m(int i, int i2);

    public abstract void n(int i);

    public abstract void o(int i, long j);

    public abstract void p(long j);

    public abstract void q(int i, int i2);

    public abstract void r(int i);

    public abstract void s(int i, dqa dqaVar, dqk dqkVar);

    public abstract void t(int i, dqa dqaVar);

    public abstract void u(int i, dol dolVar);

    public abstract void v(int i, String str);

    public abstract void x(int i, int i2);

    public abstract void y(int i, int i2);

    public abstract void z(int i);
}
