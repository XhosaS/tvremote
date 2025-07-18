package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class vtj extends vsq {
    private static final Logger a = Logger.getLogger(vtj.class.getName());
    public static final boolean e = vwl.b;
    public ulp f;

    public static int H(int i, vsz vszVar) {
        return aa(i) + I(vszVar);
    }

    public static int I(vsz vszVar) {
        return Q(vszVar.d());
    }

    public static int J(int i, int i2) {
        return aa(i) + M(i2);
    }

    @Deprecated
    static int K(int i, vvj vvjVar, vvy vvyVar) {
        int iAa = aa(i);
        return iAa + iAa + ((vsg) vvjVar).d(vvyVar);
    }

    public static int L(int i, int i2) {
        return aa(i) + M(i2);
    }

    public static int M(int i) {
        return ae(i);
    }

    public static int N(int i, long j) {
        return aa(i) + ae(j);
    }

    public static int O(int i, vuw vuwVar) {
        return aa(i) + P(vuwVar);
    }

    public static int P(vuw vuwVar) {
        return Q(vuwVar.b != null ? vuwVar.b.d() : vuwVar.a != null ? vuwVar.a.l() : 0);
    }

    static int Q(int i) {
        return ac(i) + i;
    }

    public static int R(vvj vvjVar) {
        return Q(vvjVar.l());
    }

    static int S(vvj vvjVar, vvy vvyVar) {
        return Q(((vsg) vvjVar).d(vvyVar));
    }

    static int T(int i) {
        return i > 4096 ? RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT : i;
    }

    public static int U(int i, int i2) {
        return aa(i) + V(i2);
    }

    public static int V(int i) {
        return ac(af(i));
    }

    public static int W(int i, long j) {
        return aa(i) + X(j);
    }

    public static int X(long j) {
        return ae(ag(j));
    }

    public static int Y(int i, String str) {
        return aa(i) + Z(str);
    }

    public static int Z(String str) {
        int length;
        try {
            length = vwn.b(str);
        } catch (vwm unused) {
            length = str.getBytes(vuo.a).length;
        }
        return Q(length);
    }

    public static int aa(int i) {
        return ac(vwq.c(i, 0));
    }

    public static int ab(int i, int i2) {
        return aa(i) + ac(i2);
    }

    public static int ac(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int ad(int i, long j) {
        return aa(i) + ae(j);
    }

    public static int ae(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int af(int i) {
        return (i >> 31) ^ (i + i);
    }

    public static long ag(long j) {
        return (j >> 63) ^ (j + j);
    }

    public static vtj ah(byte[] bArr) {
        return new vth(bArr, 0, bArr.length);
    }

    public static int at(int i) {
        return aa(i) + 1;
    }

    public static int au(int i) {
        return aa(i) + 8;
    }

    public static int av(int i) {
        return aa(i) + 4;
    }

    public static int aw(int i) {
        return aa(i) + 8;
    }

    public static int ax(int i) {
        return aa(i) + 4;
    }

    public static int ay(int i) {
        return aa(i) + 4;
    }

    public static int az(int i) {
        return aa(i) + 8;
    }

    public abstract void A(String str);

    public abstract void B(int i, int i2);

    public abstract void C(int i, int i2);

    public abstract void D(int i);

    public abstract void E(int i, long j);

    public abstract void F(long j);

    public abstract void G(byte[] bArr, int i);

    public final void ai() {
        if (c() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void aj(String str, vwm vwmVar) throws vti {
        a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) vwmVar);
        byte[] bytes = str.getBytes(vuo.a);
        try {
            int length = bytes.length;
            D(length);
            b(bytes, 0, length);
        } catch (IndexOutOfBoundsException e2) {
            throw new vti(e2);
        }
    }

    public final void ak(int i, double d) {
        r(i, Double.doubleToRawLongBits(d));
    }

    public final void al(double d) {
        s(Double.doubleToRawLongBits(d));
    }

    public final void am(int i, float f) {
        p(i, Float.floatToRawIntBits(f));
    }

    public final void an(float f) {
        q(Float.floatToRawIntBits(f));
    }

    @Deprecated
    public final void ao(vvj vvjVar) {
        vvjVar.dO(this);
    }

    public final void ap(int i, int i2) {
        C(i, af(i2));
    }

    public final void aq(int i) {
        D(af(i));
    }

    public final void ar(int i, long j) {
        E(i, ag(j));
    }

    public final void as(long j) {
        F(ag(j));
    }

    @Override // defpackage.vsq
    public abstract void b(byte[] bArr, int i, int i2);

    public abstract int c();

    public abstract void j();

    public abstract void k(byte b);

    public abstract void m(int i, boolean z);

    public abstract void n(int i, vsz vszVar);

    public abstract void o(vsz vszVar);

    public abstract void p(int i, int i2);

    public abstract void q(int i);

    public abstract void r(int i, long j);

    public abstract void s(long j);

    public abstract void t(int i, int i2);

    public abstract void u(int i);

    public abstract void v(int i, vvj vvjVar, vvy vvyVar);

    public abstract void w(vvj vvjVar);

    public abstract void x(int i, vvj vvjVar);

    public abstract void y(int i, vsz vszVar);

    public abstract void z(int i, String str);
}
