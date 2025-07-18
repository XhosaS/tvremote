package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class nbg extends mix implements nir {
    private yqt b;
    private yqt c;
    private yqt d;
    private yqt e;
    private yqt f;
    private yqt g;
    private yqt h;
    private yqt i;
    private yqt j;
    private final aefp k;

    public nbg(aefp aefpVar) {
        this.k = aefpVar;
    }

    private final void B() {
        if (this.d == null) {
            aefp aefpVar = this.k;
            aeen aeenVar = new aeen();
            int iA = aefpVar.a(10);
            if (iA != 0) {
                int i = iA + aefpVar.a;
                aeenVar.e(i + aefpVar.b.getInt(i), aefpVar.b);
            } else {
                aeenVar = null;
            }
            this.d = aeenVar == null ? ypv.a : yqt.i(new mzr(aeenVar));
        }
    }

    private final void C() {
        if (this.f == null) {
            aefp aefpVar = this.k;
            aeen aeenVar = new aeen();
            int iA = aefpVar.a(16);
            if (iA != 0) {
                int i = iA + aefpVar.a;
                aeenVar.e(i + aefpVar.b.getInt(i), aefpVar.b);
            } else {
                aeenVar = null;
            }
            this.f = aeenVar == null ? ypv.a : yqt.i(new mzr(aeenVar));
        }
    }

    private final void D() {
        if (this.e == null) {
            aefp aefpVar = this.k;
            aeen aeenVar = new aeen();
            int iA = aefpVar.a(14);
            if (iA != 0) {
                int i = iA + aefpVar.a;
                aeenVar.e(i + aefpVar.b.getInt(i), aefpVar.b);
            } else {
                aeenVar = null;
            }
            this.e = aeenVar == null ? ypv.a : yqt.i(new mzr(aeenVar));
        }
    }

    private final void E() {
        if (this.h == null) {
            aefp aefpVar = this.k;
            aefe aefeVar = new aefe();
            int iA = aefpVar.a(26);
            if (iA != 0) {
                int i = iA + aefpVar.a;
                aefeVar.e(i + aefpVar.b.getInt(i), aefpVar.b);
            } else {
                aefeVar = null;
            }
            this.h = aefeVar == null ? ypv.a : yqt.i(new naz(aefeVar));
        }
    }

    private final void F() {
        if (this.g == null) {
            aefp aefpVar = this.k;
            aefe aefeVar = new aefe();
            int iA = aefpVar.a(24);
            if (iA != 0) {
                int i = iA + aefpVar.a;
                aefeVar.e(i + aefpVar.b.getInt(i), aefpVar.b);
            } else {
                aefeVar = null;
            }
            this.g = aefeVar == null ? ypv.a : yqt.i(new naz(aefeVar));
        }
    }

    private final void G() {
        if (this.j == null) {
            aefp aefpVar = this.k;
            aefs aefsVar = new aefs();
            int iA = aefpVar.a(30);
            if (iA != 0) {
                int i = iA + aefpVar.a;
                aefsVar.e(i + aefpVar.b.getInt(i), aefpVar.b);
            } else {
                aefsVar = null;
            }
            this.j = aefsVar == null ? ypv.a : yqt.i(new nar(aefsVar));
        }
    }

    private final void H() {
        if (this.i == null) {
            aefp aefpVar = this.k;
            aefs aefsVar = new aefs();
            int iA = aefpVar.a(28);
            if (iA != 0) {
                int i = iA + aefpVar.a;
                aefsVar.e(i + aefpVar.b.getInt(i), aefpVar.b);
            } else {
                aefsVar = null;
            }
            this.i = aefsVar == null ? ypv.a : yqt.i(new nar(aefsVar));
        }
    }

    private final void I() {
        if (this.b == null) {
            aefp aefpVar = this.k;
            aeen aeenVar = new aeen();
            int iA = aefpVar.a(4);
            if (iA != 0) {
                int i = iA + aefpVar.a;
                aeenVar.e(i + aefpVar.b.getInt(i), aefpVar.b);
            } else {
                aeenVar = null;
            }
            this.b = aeenVar == null ? ypv.a : yqt.i(new mzr(aeenVar));
        }
    }

    private final void J() {
        if (this.c == null) {
            aefp aefpVar = this.k;
            aeen aeenVar = new aeen();
            int iA = aefpVar.a(8);
            if (iA != 0) {
                int i = iA + aefpVar.a;
                aeenVar.e(i + aefpVar.b.getInt(i), aefpVar.b);
            } else {
                aeenVar = null;
            }
            this.c = aeenVar == null ? ypv.a : yqt.i(new mzr(aeenVar));
        }
    }

    @Override // defpackage.nir
    public final int A() {
        aefp aefpVar = this.k;
        int iA = aefpVar.a(22);
        int iA2 = nin.a(iA != 0 ? aefpVar.b.getInt(iA + aefpVar.a) : 0);
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
        aefp aefpVar = this.k;
        aefp aefpVar2 = ((nbg) obj).k;
        if (aefpVar == aefpVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aefpVar.b;
        ByteBuffer byteBuffer2 = aefpVar2.b;
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

    @Override // defpackage.nir
    public final int g() {
        return (int) (this.k.a(6) != 0 ? r0.b.getInt(r1 + r0.a) & 4294967295L : 0L);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ndo] */
    @Override // defpackage.nir
    public final /* bridge */ /* synthetic */ ndo h() {
        B();
        if (this.d.g()) {
            return this.d.c();
        }
        return null;
    }

    public final int hashCode() {
        return this.k.b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ndo] */
    @Override // defpackage.nir
    public final /* bridge */ /* synthetic */ ndo i() {
        C();
        if (this.f.g()) {
            return this.f.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ndo] */
    @Override // defpackage.nir
    public final /* bridge */ /* synthetic */ ndo j() {
        D();
        if (this.e.g()) {
            return this.e.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ndo] */
    @Override // defpackage.nir
    public final /* bridge */ /* synthetic */ ndo k() {
        I();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ndo] */
    @Override // defpackage.nir
    public final /* bridge */ /* synthetic */ ndo l() {
        J();
        if (this.c.g()) {
            return this.c.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ngp] */
    @Override // defpackage.nir
    public final /* bridge */ /* synthetic */ ngp m() {
        G();
        if (this.j.g()) {
            return this.j.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ngp] */
    @Override // defpackage.nir
    public final /* bridge */ /* synthetic */ ngp n() {
        H();
        if (this.i.g()) {
            return this.i.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nhm] */
    @Override // defpackage.nir
    public final /* bridge */ /* synthetic */ nhm o() {
        E();
        if (this.h.g()) {
            return this.h.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nhm] */
    @Override // defpackage.nir
    public final /* bridge */ /* synthetic */ nhm p() {
        F();
        if (this.g.g()) {
            return this.g.c();
        }
        return null;
    }

    @Override // defpackage.nir
    public final boolean q() {
        B();
        return this.d.g();
    }

    @Override // defpackage.nir
    public final boolean r() {
        C();
        return this.f.g();
    }

    @Override // defpackage.nir
    public final boolean s() {
        D();
        return this.e.g();
    }

    @Override // defpackage.nir
    public final boolean t() {
        return aart.q(this.k, 18);
    }

    @Override // defpackage.nir
    public final boolean u() {
        E();
        return this.h.g();
    }

    @Override // defpackage.nir
    public final boolean v() {
        F();
        return this.g.g();
    }

    @Override // defpackage.nir
    public final boolean w() {
        G();
        return this.j.g();
    }

    @Override // defpackage.nir
    public final boolean x() {
        H();
        return this.i.g();
    }

    @Override // defpackage.nir
    public final boolean y() {
        I();
        return this.b.g();
    }

    @Override // defpackage.nir
    public final boolean z() {
        J();
        return this.c.g();
    }
}
