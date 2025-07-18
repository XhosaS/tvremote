package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nap extends mix implements ngd {
    private yqt b;
    private yqt c;
    private yqt d;
    private yqt e;
    private yqt f;
    private yqt g;
    private final aeew h;

    public nap(aeew aeewVar) {
        this.h = aeewVar;
    }

    private final void E() {
        if (this.g == null) {
            aeew aeewVar = this.h;
            aeeu aeeuVar = new aeeu();
            int iA = aeewVar.a(38);
            if (iA != 0) {
                int i = iA + aeewVar.a;
                aeeuVar.e(i + aeewVar.b.getInt(i), aeewVar.b);
            } else {
                aeeuVar = null;
            }
            this.g = aeeuVar == null ? ypv.a : yqt.i(new nam(aeeuVar));
        }
    }

    private final void F() {
        if (this.f == null) {
            aeew aeewVar = this.h;
            aefs aefsVar = new aefs();
            int iA = aeewVar.a(36);
            if (iA != 0) {
                int i = iA + aeewVar.a;
                aefsVar.e(i + aeewVar.b.getInt(i), aeewVar.b);
            } else {
                aefsVar = null;
            }
            this.f = aefsVar == null ? ypv.a : yqt.i(new nao(aefsVar));
        }
    }

    private final void G() {
        if (this.b == null) {
            aeew aeewVar = this.h;
            aefe aefeVar = new aefe();
            int iA = aeewVar.a(12);
            if (iA != 0) {
                int i = iA + aeewVar.a;
                aefeVar.e(i + aeewVar.b.getInt(i), aeewVar.b);
            } else {
                aefeVar = null;
            }
            this.b = aefeVar == null ? ypv.a : yqt.i(new naz(aefeVar));
        }
    }

    private final void H() {
        if (this.c == null) {
            aeew aeewVar = this.h;
            aefs aefsVar = new aefs();
            int iA = aeewVar.a(22);
            if (iA != 0) {
                int i = iA + aeewVar.a;
                aefsVar.e(i + aeewVar.b.getInt(i), aeewVar.b);
            } else {
                aefsVar = null;
            }
            this.c = aefsVar == null ? ypv.a : yqt.i(new nar(aefsVar));
        }
    }

    private final void I() {
        if (this.d == null) {
            aeew aeewVar = this.h;
            aefs aefsVar = new aefs();
            int iA = aeewVar.a(30);
            if (iA != 0) {
                int i = iA + aeewVar.a;
                aefsVar.e(i + aeewVar.b.getInt(i), aeewVar.b);
            } else {
                aefsVar = null;
            }
            this.d = aefsVar == null ? ypv.a : yqt.i(new nar(aefsVar));
        }
    }

    private final void J() {
        if (this.e == null) {
            aeew aeewVar = this.h;
            aefs aefsVar = new aefs();
            int iA = aeewVar.a(32);
            if (iA != 0) {
                int i = iA + aeewVar.a;
                aefsVar.e(i + aeewVar.b.getInt(i), aeewVar.b);
            } else {
                aefsVar = null;
            }
            this.e = aefsVar == null ? ypv.a : yqt.i(new nar(aefsVar));
        }
    }

    @Override // defpackage.ngd
    public final int A() {
        aeew aeewVar = this.h;
        int iA = aeewVar.a(6);
        int iA2 = ngf.a(iA != 0 ? aeewVar.b.getInt(iA + aeewVar.a) : 0);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }

    @Override // defpackage.ngd
    public final int B() {
        aeew aeewVar = this.h;
        int iA = aeewVar.a(34);
        int iA2 = ngh.a(iA != 0 ? aeewVar.b.getInt(iA + aeewVar.a) : 0);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }

    @Override // defpackage.ngd
    public final int C() {
        aeew aeewVar = this.h;
        int iA = aeewVar.a(24);
        int iA2 = ngm.a(iA != 0 ? aeewVar.b.getInt(iA + aeewVar.a) : 0);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }

    @Override // defpackage.ngd
    public final int D() {
        aeew aeewVar = this.h;
        int iA = aeewVar.a(26);
        int iA2 = ngo.a(iA != 0 ? aeewVar.b.getInt(iA + aeewVar.a) : 0);
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
        aeew aeewVar = this.h;
        aeew aeewVar2 = ((nap) obj).h;
        if (aeewVar == aeewVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aeewVar.b;
        ByteBuffer byteBuffer2 = aeewVar2.b;
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

    @Override // defpackage.ngd
    @Deprecated
    public final int g() {
        aeew aeewVar = this.h;
        int iA = aeewVar.a(4);
        if (iA != 0) {
            return aeewVar.c(iA);
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nfs] */
    @Override // defpackage.ngd
    public final /* bridge */ /* synthetic */ nfs h() {
        E();
        if (this.g.g()) {
            return this.g.c();
        }
        return null;
    }

    public final int hashCode() {
        return this.h.b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nfz] */
    @Override // defpackage.ngd
    public final /* bridge */ /* synthetic */ nfz i() {
        F();
        if (this.f.g()) {
            return this.f.c();
        }
        return null;
    }

    @Override // defpackage.ngd
    @Deprecated
    public final /* bridge */ /* synthetic */ ngi j(int i) {
        aeex aeexVar = new aeex();
        aeew aeewVar = this.h;
        int iA = aeewVar.a(4);
        if (iA != 0) {
            int iB = aeewVar.b(iA) + (i * 4);
            aeexVar.e(iB + aeewVar.b.getInt(iB), aeewVar.b);
        } else {
            aeexVar = null;
        }
        if (aeexVar != null) {
            return new naq(aeexVar);
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ngp] */
    @Override // defpackage.ngd
    public final /* bridge */ /* synthetic */ ngp k() {
        H();
        if (this.c.g()) {
            return this.c.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ngp] */
    @Override // defpackage.ngd
    public final /* bridge */ /* synthetic */ ngp l() {
        I();
        if (this.d.g()) {
            return this.d.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ngp] */
    @Override // defpackage.ngd
    public final /* bridge */ /* synthetic */ ngp m() {
        J();
        if (this.e.g()) {
            return this.e.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nhm] */
    @Override // defpackage.ngd
    public final /* bridge */ /* synthetic */ nhm n() {
        G();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    @Override // defpackage.ngd
    public final boolean o() {
        aeew aeewVar = this.h;
        int iA = aeewVar.a(40);
        return (iA == 0 || aeewVar.b.get(iA + aeewVar.a) == 0) ? false : true;
    }

    @Override // defpackage.ngd
    public final boolean p() {
        aeew aeewVar = this.h;
        int iA = aeewVar.a(42);
        return (iA == 0 || aeewVar.b.get(iA + aeewVar.a) == 0) ? false : true;
    }

    @Override // defpackage.ngd
    public final boolean q() {
        aeew aeewVar = this.h;
        int iA = aeewVar.a(44);
        return (iA == 0 || aeewVar.b.get(iA + aeewVar.a) == 0) ? false : true;
    }

    @Override // defpackage.ngd
    public final boolean r() {
        E();
        return this.g.g();
    }

    @Override // defpackage.ngd
    public final boolean s() {
        F();
        return this.f.g();
    }

    @Override // defpackage.ngd
    public final boolean t() {
        G();
        return this.b.g();
    }

    @Override // defpackage.ngd
    public final boolean u() {
        return aart.q(this.h, 42);
    }

    @Override // defpackage.ngd
    public final boolean v() {
        return aart.q(this.h, 44);
    }

    @Override // defpackage.ngd
    public final boolean w() {
        H();
        return this.c.g();
    }

    @Override // defpackage.ngd
    public final boolean x() {
        I();
        return this.d.g();
    }

    @Override // defpackage.ngd
    public final boolean y() {
        J();
        return this.e.g();
    }

    @Override // defpackage.ngd
    public final int z() {
        aeew aeewVar = this.h;
        int iA = aeewVar.a(28);
        int iA2 = ngk.a(iA != 0 ? aeewVar.b.getInt(iA + aeewVar.a) : 0);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }
}
