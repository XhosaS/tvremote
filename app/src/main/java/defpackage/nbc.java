package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nbc extends mix implements nhw {
    private yqt b;
    private yqt c;
    private yqt d;
    private yqt e;
    private yqt f;
    private yqt g;
    private final aefl h;

    public nbc(aefl aeflVar) {
        this.h = aeflVar;
    }

    private final void G() {
        if (this.e == null) {
            aefl aeflVar = this.h;
            aefs aefsVar = new aefs();
            int iA = aeflVar.a(10);
            if (iA != 0) {
                int i = iA + aeflVar.a;
                aefsVar.e(i + aeflVar.b.getInt(i), aeflVar.b);
            } else {
                aefsVar = null;
            }
            this.e = aefsVar == null ? ypv.a : yqt.i(new nar(aefsVar));
        }
    }

    private final void H() {
        if (this.f == null) {
            aefl aeflVar = this.h;
            aefs aefsVar = new aefs();
            int iA = aeflVar.a(12);
            if (iA != 0) {
                int i = iA + aeflVar.a;
                aefsVar.e(i + aeflVar.b.getInt(i), aeflVar.b);
            } else {
                aefsVar = null;
            }
            this.f = aefsVar == null ? ypv.a : yqt.i(new nar(aefsVar));
        }
    }

    private final void I() {
        if (this.d == null) {
            aefl aeflVar = this.h;
            aefs aefsVar = new aefs();
            int iA = aeflVar.a(8);
            if (iA != 0) {
                int i = iA + aeflVar.a;
                aefsVar.e(i + aeflVar.b.getInt(i), aeflVar.b);
            } else {
                aefsVar = null;
            }
            this.d = aefsVar == null ? ypv.a : yqt.i(new nar(aefsVar));
        }
    }

    private final void J() {
        if (this.g == null) {
            aefl aeflVar = this.h;
            aefs aefsVar = new aefs();
            int iA = aeflVar.a(32);
            if (iA != 0) {
                int i = iA + aeflVar.a;
                aefsVar.e(i + aeflVar.b.getInt(i), aeflVar.b);
            } else {
                aefsVar = null;
            }
            this.g = aefsVar == null ? ypv.a : yqt.i(new nar(aefsVar));
        }
    }

    private final void K() {
        if (this.c == null) {
            aefl aeflVar = this.h;
            aeen aeenVar = new aeen();
            int iA = aeflVar.a(6);
            if (iA != 0) {
                int i = iA + aeflVar.a;
                aeenVar.e(i + aeflVar.b.getInt(i), aeflVar.b);
            } else {
                aeenVar = null;
            }
            this.c = aeenVar == null ? ypv.a : yqt.i(new mzr(aeenVar));
        }
    }

    private final void L() {
        if (this.b == null) {
            aefl aeflVar = this.h;
            aeen aeenVar = new aeen();
            int iA = aeflVar.a(4);
            if (iA != 0) {
                int i = iA + aeflVar.a;
                aeenVar.e(i + aeflVar.b.getInt(i), aeflVar.b);
            } else {
                aeenVar = null;
            }
            this.b = aeenVar == null ? ypv.a : yqt.i(new mzr(aeenVar));
        }
    }

    @Override // defpackage.nhw
    public final boolean A() {
        return aart.q(this.h, 28);
    }

    @Override // defpackage.nhw
    public final boolean B() {
        L();
        return this.b.g();
    }

    @Override // defpackage.nhw
    public final int C() {
        aefl aeflVar = this.h;
        int iA = aeflVar.a(20);
        int iA2 = nhy.a(iA != 0 ? aeflVar.b.getInt(iA + aeflVar.a) : 0);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }

    @Override // defpackage.nhw
    public final int D() {
        aefl aeflVar = this.h;
        int iA = aeflVar.a(30);
        int iA2 = nhs.a(iA != 0 ? aeflVar.b.getInt(iA + aeflVar.a) : 0);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }

    @Override // defpackage.nhw
    public final int E() {
        aefl aeflVar = this.h;
        int iA = aeflVar.a(26);
        int iA2 = nia.a(iA != 0 ? aeflVar.b.getInt(iA + aeflVar.a) : 0);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }

    @Override // defpackage.nhw
    public final int F() {
        aefl aeflVar = this.h;
        int iA = aeflVar.a(28);
        int iA2 = nic.a(iA != 0 ? aeflVar.b.getInt(iA + aeflVar.a) : 0);
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
        aefl aeflVar = this.h;
        aefl aeflVar2 = ((nbc) obj).h;
        if (aeflVar == aeflVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aeflVar.b;
        ByteBuffer byteBuffer2 = aeflVar2.b;
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

    @Override // defpackage.nhw
    public final int g() {
        return (int) (this.h.a(34) != 0 ? r0.b.getInt(r1 + r0.a) & 4294967295L : 0L);
    }

    @Override // defpackage.nhw
    public final int h() {
        aefl aeflVar = this.h;
        int iA = aeflVar.a(24);
        if (iA != 0) {
            return aeflVar.b.getInt(iA + aeflVar.a);
        }
        return 0;
    }

    public final int hashCode() {
        return this.h.b.hashCode();
    }

    @Override // defpackage.nhw
    public final int i() {
        aefl aeflVar = this.h;
        int iA = aeflVar.a(22);
        if (iA != 0) {
            return aeflVar.b.getInt(iA + aeflVar.a);
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ndo] */
    @Override // defpackage.nhw
    public final /* bridge */ /* synthetic */ ndo j() {
        K();
        if (this.c.g()) {
            return this.c.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ndo] */
    @Override // defpackage.nhw
    public final /* bridge */ /* synthetic */ ndo k() {
        L();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ngp] */
    @Override // defpackage.nhw
    public final /* bridge */ /* synthetic */ ngp l() {
        G();
        if (this.e.g()) {
            return this.e.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ngp] */
    @Override // defpackage.nhw
    public final /* bridge */ /* synthetic */ ngp m() {
        H();
        if (this.f.g()) {
            return this.f.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ngp] */
    @Override // defpackage.nhw
    public final /* bridge */ /* synthetic */ ngp n() {
        I();
        if (this.d.g()) {
            return this.d.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ngp] */
    @Override // defpackage.nhw
    public final /* bridge */ /* synthetic */ ngp o() {
        J();
        if (this.g.g()) {
            return this.g.c();
        }
        return null;
    }

    @Override // defpackage.nhw
    public final boolean p() {
        aefl aeflVar = this.h;
        int iA = aeflVar.a(36);
        return (iA == 0 || aeflVar.b.get(iA + aeflVar.a) == 0) ? false : true;
    }

    @Override // defpackage.nhw
    public final boolean q() {
        aefl aeflVar = this.h;
        int iA = aeflVar.a(16);
        return (iA == 0 || aeflVar.b.get(iA + aeflVar.a) == 0) ? false : true;
    }

    @Override // defpackage.nhw
    public final boolean r() {
        aefl aeflVar = this.h;
        int iA = aeflVar.a(18);
        return (iA == 0 || aeflVar.b.get(iA + aeflVar.a) == 0) ? false : true;
    }

    @Override // defpackage.nhw
    public final boolean s() {
        aefl aeflVar = this.h;
        int iA = aeflVar.a(14);
        return (iA == 0 || aeflVar.b.get(iA + aeflVar.a) == 0) ? false : true;
    }

    @Override // defpackage.nhw
    public final boolean t() {
        return aart.q(this.h, 34);
    }

    @Override // defpackage.nhw
    public final boolean u() {
        return aart.q(this.h, 18);
    }

    @Override // defpackage.nhw
    public final boolean v() {
        G();
        return this.e.g();
    }

    @Override // defpackage.nhw
    public final boolean w() {
        H();
        return this.f.g();
    }

    @Override // defpackage.nhw
    public final boolean x() {
        I();
        return this.d.g();
    }

    @Override // defpackage.nhw
    public final boolean y() {
        J();
        return this.g.g();
    }

    @Override // defpackage.nhw
    public final boolean z() {
        K();
        return this.c.g();
    }
}
