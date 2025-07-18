package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nch extends mix implements nmd {
    private yqt b;
    private yqt c;
    private yqt d;
    private yqt e;
    private yqt f;
    private yqt g;
    private final aegu h;

    public nch(aegu aeguVar) {
        this.h = aeguVar;
    }

    private final void A() {
        if (this.e == null) {
            aegu aeguVar = this.h;
            aefs aefsVar = new aefs();
            int iA = aeguVar.a(16);
            if (iA != 0) {
                int i = iA + aeguVar.a;
                aefsVar.e(i + aeguVar.b.getInt(i), aeguVar.b);
            } else {
                aefsVar = null;
            }
            this.e = aefsVar == null ? ypv.a : yqt.i(new nar(aefsVar));
        }
    }

    private final void B() {
        if (this.f == null) {
            aegu aeguVar = this.h;
            aefs aefsVar = new aefs();
            int iA = aeguVar.a(18);
            if (iA != 0) {
                int i = iA + aeguVar.a;
                aefsVar.e(i + aeguVar.b.getInt(i), aeguVar.b);
            } else {
                aefsVar = null;
            }
            this.f = aefsVar == null ? ypv.a : yqt.i(new nar(aefsVar));
        }
    }

    private final void w() {
        if (this.b == null) {
            aegu aeguVar = this.h;
            aegp aegpVar = new aegp();
            int iA = aeguVar.a(6);
            if (iA != 0) {
                aegpVar.a(iA + aeguVar.a, aeguVar.b);
            } else {
                aegpVar = null;
            }
            this.b = aegpVar == null ? ypv.a : yqt.i(new ncb(aegpVar));
        }
    }

    private final void x() {
        if (this.c == null) {
            aegu aeguVar = this.h;
            aegw aegwVar = new aegw();
            int iA = aeguVar.a(8);
            if (iA != 0) {
                aegwVar.a(iA + aeguVar.a, aeguVar.b);
            } else {
                aegwVar = null;
            }
            this.c = aegwVar == null ? ypv.a : yqt.i(new nci(aegwVar));
        }
    }

    private final void y() {
        if (this.g == null) {
            aegu aeguVar = this.h;
            aegl aeglVar = new aegl();
            int iA = aeguVar.a(22);
            if (iA != 0) {
                int i = iA + aeguVar.a;
                aeglVar.e(i + aeguVar.b.getInt(i), aeguVar.b);
            } else {
                aeglVar = null;
            }
            this.g = aeglVar == null ? ypv.a : yqt.i(new ncf(aeglVar));
        }
    }

    private final void z() {
        if (this.d == null) {
            aegu aeguVar = this.h;
            aefs aefsVar = new aefs();
            int iA = aeguVar.a(14);
            if (iA != 0) {
                int i = iA + aeguVar.a;
                aefsVar.e(i + aeguVar.b.getInt(i), aeguVar.b);
            } else {
                aefsVar = null;
            }
            this.d = aefsVar == null ? ypv.a : yqt.i(new nar(aefsVar));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aegu aeguVar = this.h;
        aegu aeguVar2 = ((nch) obj).h;
        if (aeguVar == aeguVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aeguVar.b;
        ByteBuffer byteBuffer2 = aeguVar2.b;
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

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ngp] */
    @Override // defpackage.nmd
    public final /* bridge */ /* synthetic */ ngp g() {
        z();
        if (this.d.g()) {
            return this.d.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ngp] */
    @Override // defpackage.nmd
    public final /* bridge */ /* synthetic */ ngp h() {
        A();
        if (this.e.g()) {
            return this.e.c();
        }
        return null;
    }

    public final int hashCode() {
        return this.h.b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ngp] */
    @Override // defpackage.nmd
    public final /* bridge */ /* synthetic */ ngp i() {
        B();
        if (this.f.g()) {
            return this.f.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nlp] */
    @Override // defpackage.nmd
    public final /* bridge */ /* synthetic */ nlp j() {
        w();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nlu] */
    @Override // defpackage.nmd
    public final /* bridge */ /* synthetic */ nlu k() {
        y();
        if (this.g.g()) {
            return this.g.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nmi] */
    @Override // defpackage.nmd
    public final /* bridge */ /* synthetic */ nmi l() {
        x();
        if (this.c.g()) {
            return this.c.c();
        }
        return null;
    }

    @Override // defpackage.nmd
    public final boolean m() {
        aegu aeguVar = this.h;
        int iA = aeguVar.a(10);
        return (iA == 0 || aeguVar.b.get(iA + aeguVar.a) == 0) ? false : true;
    }

    @Override // defpackage.nmd
    public final boolean n() {
        aegu aeguVar = this.h;
        int iA = aeguVar.a(12);
        return (iA == 0 || aeguVar.b.get(iA + aeguVar.a) == 0) ? false : true;
    }

    @Override // defpackage.nmd
    public final boolean o() {
        w();
        return this.b.g();
    }

    @Override // defpackage.nmd
    public final boolean p() {
        x();
        return this.c.g();
    }

    @Override // defpackage.nmd
    public final boolean q() {
        y();
        return this.g.g();
    }

    @Override // defpackage.nmd
    public final boolean r() {
        z();
        return this.d.g();
    }

    @Override // defpackage.nmd
    public final boolean s() {
        A();
        return this.e.g();
    }

    @Override // defpackage.nmd
    public final boolean t() {
        B();
        return this.f.g();
    }

    @Override // defpackage.nmd
    public final int u() {
        aegu aeguVar = this.h;
        int iA = aeguVar.a(4);
        int iA2 = nmf.a(iA != 0 ? aeguVar.b.getInt(iA + aeguVar.a) : 0);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }

    @Override // defpackage.nmd
    public final int v() {
        aegu aeguVar = this.h;
        int iA = aeguVar.a(20);
        int iA2 = nmh.a(iA != 0 ? aeguVar.b.getInt(iA + aeguVar.a) : 0);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }
}
