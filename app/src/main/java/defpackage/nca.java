package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nca extends mix implements nlk {
    private yqt b;
    private yqt c;
    private yqt d;
    private yqt e;
    private yqt f;
    private yqt g;
    private yqt h;
    private yqt i;
    private yqt j;
    private yqt k;
    private yqt l;
    private final aegh m;

    public nca(aegh aeghVar) {
        this.m = aeghVar;
    }

    private final void P() {
        if (this.k == null) {
            aegh aeghVar = this.m;
            aefd aefdVar = new aefd();
            int iA = aeghVar.a(34);
            if (iA != 0) {
                aefdVar.a(iA + aeghVar.a, aeghVar.b);
            } else {
                aefdVar = null;
            }
            this.k = aefdVar == null ? ypv.a : yqt.i(new nba(aefdVar));
        }
    }

    private final void Q() {
        if (this.l == null) {
            aegh aeghVar = this.m;
            aefu aefuVar = new aefu();
            int iA = aeghVar.a(46);
            if (iA != 0) {
                int i = iA + aeghVar.a;
                aefuVar.e(i + aeghVar.b.getInt(i), aeghVar.b);
            } else {
                aefuVar = null;
            }
            this.l = aefuVar == null ? ypv.a : yqt.i(new nbj(aefuVar));
        }
    }

    private final void R() {
        if (this.c == null) {
            aegh aeghVar = this.m;
            aefd aefdVar = new aefd();
            int iA = aeghVar.a(6);
            if (iA != 0) {
                aefdVar.a(iA + aeghVar.a, aeghVar.b);
            } else {
                aefdVar = null;
            }
            this.c = aefdVar == null ? ypv.a : yqt.i(new nba(aefdVar));
        }
    }

    private final void S() {
        if (this.i == null) {
            aegh aeghVar = this.m;
            aefe aefeVar = new aefe();
            int iA = aeghVar.a(18);
            if (iA != 0) {
                int i = iA + aeghVar.a;
                aefeVar.e(i + aeghVar.b.getInt(i), aeghVar.b);
            } else {
                aefeVar = null;
            }
            this.i = aefeVar == null ? ypv.a : yqt.i(new naz(aefeVar));
        }
    }

    private final void T() {
        if (this.h == null) {
            aegh aeghVar = this.m;
            aefd aefdVar = new aefd();
            int iA = aeghVar.a(16);
            if (iA != 0) {
                aefdVar.a(iA + aeghVar.a, aeghVar.b);
            } else {
                aefdVar = null;
            }
            this.h = aefdVar == null ? ypv.a : yqt.i(new nba(aefdVar));
        }
    }

    private final void U() {
        if (this.g == null) {
            aegh aeghVar = this.m;
            aefd aefdVar = new aefd();
            int iA = aeghVar.a(14);
            if (iA != 0) {
                aefdVar.a(iA + aeghVar.a, aeghVar.b);
            } else {
                aefdVar = null;
            }
            this.g = aefdVar == null ? ypv.a : yqt.i(new nba(aefdVar));
        }
    }

    private final void V() {
        if (this.f == null) {
            aegh aeghVar = this.m;
            aefd aefdVar = new aefd();
            int iA = aeghVar.a(12);
            if (iA != 0) {
                aefdVar.a(iA + aeghVar.a, aeghVar.b);
            } else {
                aefdVar = null;
            }
            this.f = aefdVar == null ? ypv.a : yqt.i(new nba(aefdVar));
        }
    }

    private final void W() {
        if (this.e == null) {
            aegh aeghVar = this.m;
            aefd aefdVar = new aefd();
            int iA = aeghVar.a(10);
            if (iA != 0) {
                aefdVar.a(iA + aeghVar.a, aeghVar.b);
            } else {
                aefdVar = null;
            }
            this.e = aefdVar == null ? ypv.a : yqt.i(new nba(aefdVar));
        }
    }

    private final void X() {
        if (this.j == null) {
            aegh aeghVar = this.m;
            aefe aefeVar = new aefe();
            int iA = aeghVar.a(20);
            if (iA != 0) {
                int i = iA + aeghVar.a;
                aefeVar.e(i + aeghVar.b.getInt(i), aeghVar.b);
            } else {
                aefeVar = null;
            }
            this.j = aefeVar == null ? ypv.a : yqt.i(new naz(aefeVar));
        }
    }

    private final void Y() {
        if (this.b == null) {
            aegh aeghVar = this.m;
            aefe aefeVar = new aefe();
            int iA = aeghVar.a(4);
            if (iA != 0) {
                int i = iA + aeghVar.a;
                aefeVar.e(i + aeghVar.b.getInt(i), aeghVar.b);
            } else {
                aefeVar = null;
            }
            this.b = aefeVar == null ? ypv.a : yqt.i(new naz(aefeVar));
        }
    }

    private final void Z() {
        if (this.d == null) {
            aegh aeghVar = this.m;
            aefd aefdVar = new aefd();
            int iA = aeghVar.a(8);
            if (iA != 0) {
                aefdVar.a(iA + aeghVar.a, aeghVar.b);
            } else {
                aefdVar = null;
            }
            this.d = aefdVar == null ? ypv.a : yqt.i(new nba(aefdVar));
        }
    }

    @Override // defpackage.nlk
    public final boolean A() {
        T();
        return this.h.g();
    }

    @Override // defpackage.nlk
    public final boolean B() {
        U();
        return this.g.g();
    }

    @Override // defpackage.nlk
    public final boolean C() {
        V();
        return this.f.g();
    }

    @Override // defpackage.nlk
    public final boolean D() {
        W();
        return this.e.g();
    }

    @Override // defpackage.nlk
    public final boolean E() {
        X();
        return this.j.g();
    }

    @Override // defpackage.nlk
    public final boolean F() {
        Y();
        return this.b.g();
    }

    @Override // defpackage.nlk
    public final boolean G() {
        Z();
        return this.d.g();
    }

    @Override // defpackage.nlk
    public final int H() {
        aegh aeghVar = this.m;
        int iA = aeghVar.a(26);
        int iA2 = nla.a(iA != 0 ? aeghVar.b.getInt(iA + aeghVar.a) : 0);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }

    @Override // defpackage.nlk
    public final int I() {
        aegh aeghVar = this.m;
        int iA = aeghVar.a(28);
        int iA2 = nla.a(iA != 0 ? aeghVar.b.getInt(iA + aeghVar.a) : 0);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }

    @Override // defpackage.nlk
    public final int J() {
        aegh aeghVar = this.m;
        int iA = aeghVar.a(36);
        int iA2 = nla.a(iA != 0 ? aeghVar.b.getInt(iA + aeghVar.a) : 0);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }

    @Override // defpackage.nlk
    public final int K() {
        aegh aeghVar = this.m;
        int iA = aeghVar.a(22);
        int iA2 = nlc.a(iA != 0 ? aeghVar.b.getInt(iA + aeghVar.a) : 0);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }

    @Override // defpackage.nlk
    public final int L() {
        aegh aeghVar = this.m;
        int iA = aeghVar.a(44);
        int iA2 = nle.a(iA != 0 ? aeghVar.b.getInt(iA + aeghVar.a) : 0);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }

    @Override // defpackage.nlk
    public final int M() {
        aegh aeghVar = this.m;
        int iA = aeghVar.a(24);
        int iA2 = nlg.a(iA != 0 ? aeghVar.b.getInt(iA + aeghVar.a) : 0);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }

    @Override // defpackage.nlk
    public final int N() {
        aegh aeghVar = this.m;
        int iA = aeghVar.a(38);
        int iA2 = nlm.a(iA != 0 ? aeghVar.b.getInt(iA + aeghVar.a) : 0);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }

    @Override // defpackage.nlk
    public final int O() {
        aegh aeghVar = this.m;
        int iA = aeghVar.a(42);
        int iA2 = nlo.a(iA != 0 ? aeghVar.b.getInt(iA + aeghVar.a) : 0);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aegh aeghVar = this.m;
        aegh aeghVar2 = ((nca) obj).m;
        if (aeghVar == aeghVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aeghVar.b;
        ByteBuffer byteBuffer2 = aeghVar2.b;
        if (byteBuffer == null) {
            return byteBuffer2 == null;
        }
        if (byteBuffer2 == null) {
            return false;
        }
        if (byteBuffer.hasArray() && byteBuffer2.hasArray() && byteBuffer.array() == byteBuffer2.array() && byteBuffer.arrayOffset() == byteBuffer2.arrayOffset() && byteBuffer.capacity() == byteBuffer2.capacity() && byteBuffer.position() == byteBuffer2.position() && byteBuffer.remaining() == byteBuffer2.remaining()) {
            return true;
        }
        return byteBuffer.equals(byteBuffer2);
    }

    @Override // defpackage.nlk
    public final float g() {
        aegh aeghVar = this.m;
        int iA = aeghVar.a(40);
        if (iA != 0) {
            return aeghVar.b.getFloat(iA + aeghVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.nlk
    public final float h() {
        aegh aeghVar = this.m;
        int iA = aeghVar.a(30);
        if (iA != 0) {
            return aeghVar.b.getFloat(iA + aeghVar.a);
        }
        return 0.0f;
    }

    public final int hashCode() {
        return this.m.b.hashCode();
    }

    @Override // defpackage.nlk
    public final float i() {
        aegh aeghVar = this.m;
        int iA = aeghVar.a(32);
        if (iA != 0) {
            return aeghVar.b.getFloat(iA + aeghVar.a);
        }
        return 1.0f;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nhm] */
    @Override // defpackage.nlk
    public final /* bridge */ /* synthetic */ nhm j() {
        S();
        if (this.i.g()) {
            return this.i.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nhm] */
    @Override // defpackage.nlk
    public final /* bridge */ /* synthetic */ nhm k() {
        X();
        if (this.j.g()) {
            return this.j.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nhm] */
    @Override // defpackage.nlk
    public final /* bridge */ /* synthetic */ nhm l() {
        Y();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nhn] */
    @Override // defpackage.nlk
    public final /* bridge */ /* synthetic */ nhn m() {
        P();
        if (this.k.g()) {
            return this.k.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nhn] */
    @Override // defpackage.nlk
    public final /* bridge */ /* synthetic */ nhn n() {
        R();
        if (this.c.g()) {
            return this.c.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nhn] */
    @Override // defpackage.nlk
    public final /* bridge */ /* synthetic */ nhn o() {
        T();
        if (this.h.g()) {
            return this.h.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nhn] */
    @Override // defpackage.nlk
    public final /* bridge */ /* synthetic */ nhn p() {
        U();
        if (this.g.g()) {
            return this.g.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nhn] */
    @Override // defpackage.nlk
    public final /* bridge */ /* synthetic */ nhn q() {
        V();
        if (this.f.g()) {
            return this.f.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nhn] */
    @Override // defpackage.nlk
    public final /* bridge */ /* synthetic */ nhn r() {
        W();
        if (this.e.g()) {
            return this.e.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nhn] */
    @Override // defpackage.nlk
    public final /* bridge */ /* synthetic */ nhn s() {
        Z();
        if (this.d.g()) {
            return this.d.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nix] */
    @Override // defpackage.nlk
    public final /* bridge */ /* synthetic */ nix t() {
        Q();
        if (this.l.g()) {
            return this.l.c();
        }
        return null;
    }

    @Override // defpackage.nlk
    public final boolean u() {
        P();
        return this.k.g();
    }

    @Override // defpackage.nlk
    public final boolean v() {
        Q();
        return this.l.g();
    }

    @Override // defpackage.nlk
    public final boolean w() {
        return aart.q(this.m, 30);
    }

    @Override // defpackage.nlk
    public final boolean x() {
        return aart.q(this.m, 32);
    }

    @Override // defpackage.nlk
    public final boolean y() {
        R();
        return this.c.g();
    }

    @Override // defpackage.nlk
    public final boolean z() {
        S();
        return this.i.g();
    }
}
