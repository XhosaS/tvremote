package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cld extends ckn {
    private static final Logger a = Logger.getLogger(cld.class.getName());
    public static final boolean e = cod.a;
    public asv f;

    public static int G(int i, ckv ckvVar) {
        return Z(i) + H(ckvVar);
    }

    public static int H(ckv ckvVar) {
        return P(ckvVar.d());
    }

    public static int I(int i, int i2) {
        return Z(i) + L(i2);
    }

    @Deprecated
    static int J(int i, cmz cmzVar, cno cnoVar) {
        int iZ = Z(i);
        return iZ + iZ + ((cke) cmzVar).c(cnoVar);
    }

    public static int K(int i, int i2) {
        return Z(i) + L(i2);
    }

    public static int L(int i) {
        return ad(i);
    }

    public static int M(int i, long j) {
        return Z(i) + ad(j);
    }

    public static int N(int i, cmm cmmVar) {
        return Z(i) + O(cmmVar);
    }

    public static int O(cmm cmmVar) {
        return P(cmmVar.b != null ? cmmVar.b.d() : cmmVar.a != null ? cmmVar.a.n() : 0);
    }

    static int P(int i) {
        return ab(i) + i;
    }

    public static int Q(cmz cmzVar) {
        return P(cmzVar.n());
    }

    static int R(cmz cmzVar, cno cnoVar) {
        return P(((cke) cmzVar).c(cnoVar));
    }

    static int S(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public static int T(int i, int i2) {
        return Z(i) + U(i2);
    }

    public static int U(int i) {
        return ab(ae(i));
    }

    public static int V(int i, long j) {
        return Z(i) + W(j);
    }

    public static int W(long j) {
        return ad(af(j));
    }

    public static int X(int i, String str) {
        return Z(i) + Y(str);
    }

    public static int Y(String str) {
        int length;
        try {
            length = cof.b(str);
        } catch (coe unused) {
            length = str.getBytes(cmf.a).length;
        }
        return P(length);
    }

    public static int Z(int i) {
        return ab(coi.c(i, 0));
    }

    public static int aa(int i, int i2) {
        return Z(i) + ab(i2);
    }

    public static int ab(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int ac(int i, long j) {
        return Z(i) + ad(j);
    }

    public static int ad(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int ae(int i) {
        return (i >> 31) ^ (i + i);
    }

    public static long af(long j) {
        return (j >> 63) ^ (j + j);
    }

    public static cld ag(byte[] bArr) {
        return new clb(bArr, bArr.length);
    }

    public static int as(int i) {
        return Z(i) + 1;
    }

    public static int at(int i) {
        return Z(i) + 8;
    }

    public static int au(int i) {
        return Z(i) + 4;
    }

    public static int av(int i) {
        return Z(i) + 8;
    }

    public static int aw(int i) {
        return Z(i) + 4;
    }

    public static int ax(int i) {
        return Z(i) + 4;
    }

    public static int ay(int i) {
        return Z(i) + 8;
    }

    public abstract void A(int i, int i2);

    public abstract void B(int i, int i2);

    public abstract void C(int i);

    public abstract void D(int i, long j);

    public abstract void E(long j);

    public abstract void F(byte[] bArr, int i);

    @Override // defpackage.ckn
    public abstract void a(byte[] bArr, int i, int i2);

    public final void ah() {
        if (b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void ai(String str, coe coeVar) throws clc {
        a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) coeVar);
        byte[] bytes = str.getBytes(cmf.a);
        try {
            int length = bytes.length;
            C(length);
            a(bytes, 0, length);
        } catch (IndexOutOfBoundsException e2) {
            throw new clc(e2);
        }
    }

    public final void aj(int i, double d) {
        q(i, Double.doubleToRawLongBits(d));
    }

    public final void ak(double d) {
        r(Double.doubleToRawLongBits(d));
    }

    public final void al(int i, float f) {
        o(i, Float.floatToRawIntBits(f));
    }

    public final void am(float f) {
        p(Float.floatToRawIntBits(f));
    }

    @Deprecated
    public final void an(cmz cmzVar) {
        cmzVar.e(this);
    }

    public final void ao(int i, int i2) {
        B(i, ae(i2));
    }

    public final void ap(int i) {
        C(ae(i));
    }

    public final void aq(int i, long j) {
        D(i, af(j));
    }

    public final void ar(long j) {
        E(af(j));
    }

    public abstract int b();

    public abstract void i();

    public abstract void j(byte b);

    public abstract void l(int i, boolean z);

    public abstract void m(int i, ckv ckvVar);

    public abstract void n(ckv ckvVar);

    public abstract void o(int i, int i2);

    public abstract void p(int i);

    public abstract void q(int i, long j);

    public abstract void r(long j);

    public abstract void s(int i, int i2);

    public abstract void t(int i);

    public abstract void u(int i, cmz cmzVar, cno cnoVar);

    public abstract void v(cmz cmzVar);

    public abstract void w(int i, cmz cmzVar);

    public abstract void x(int i, ckv ckvVar);

    public abstract void y(int i, String str);

    public abstract void z(String str);
}
