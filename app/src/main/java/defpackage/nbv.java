package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nbv extends mix implements nkm {
    private yqt b;
    private yqt c;
    private yqt d;
    private yqt e;
    private yqt f;
    private final aefg g;

    public nbv(aefg aefgVar) {
        this.g = aefgVar;
    }

    private final void r() {
        if (this.b == null) {
            aefg aefgVar = this.g;
            aegf aegfVar = new aegf();
            int iA = aefgVar.a(4);
            if (iA != 0) {
                int i = iA + aefgVar.a;
                aegfVar.e(i + aefgVar.b.getInt(i), aefgVar.b);
            } else {
                aegfVar = null;
            }
            this.b = aegfVar == null ? ypv.a : yqt.i(new nbw(aegfVar));
        }
    }

    private final void s() {
        if (this.c == null) {
            aefg aefgVar = this.g;
            aegf aegfVar = new aegf();
            int iA = aefgVar.a(6);
            if (iA != 0) {
                int i = iA + aefgVar.a;
                aegfVar.e(i + aefgVar.b.getInt(i), aefgVar.b);
            } else {
                aegfVar = null;
            }
            this.c = aegfVar == null ? ypv.a : yqt.i(new nbw(aegfVar));
        }
    }

    private final void t() {
        if (this.e == null) {
            aefg aefgVar = this.g;
            aefs aefsVar = new aefs();
            int iA = aefgVar.a(10);
            if (iA != 0) {
                int i = iA + aefgVar.a;
                aefsVar.e(i + aefgVar.b.getInt(i), aefgVar.b);
            } else {
                aefsVar = null;
            }
            this.e = aefsVar == null ? ypv.a : yqt.i(new nar(aefsVar));
        }
    }

    private final void u() {
        if (this.f == null) {
            aefg aefgVar = this.g;
            aefs aefsVar = new aefs();
            int iA = aefgVar.a(12);
            if (iA != 0) {
                int i = iA + aefgVar.a;
                aefsVar.e(i + aefgVar.b.getInt(i), aefgVar.b);
            } else {
                aefsVar = null;
            }
            this.f = aefsVar == null ? ypv.a : yqt.i(new nar(aefsVar));
        }
    }

    private final void v() {
        if (this.d == null) {
            aefg aefgVar = this.g;
            aefs aefsVar = new aefs();
            int iA = aefgVar.a(8);
            if (iA != 0) {
                int i = iA + aefgVar.a;
                aefsVar.e(i + aefgVar.b.getInt(i), aefgVar.b);
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
        aefg aefgVar = this.g;
        aefg aefgVar2 = ((nbv) obj).g;
        if (aefgVar == aefgVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aefgVar.b;
        ByteBuffer byteBuffer2 = aefgVar2.b;
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

    @Override // defpackage.nkm
    public final int g() {
        return (int) (this.g.a(14) != 0 ? r0.b.getInt(r1 + r0.a) & 4294967295L : 0L);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ngp] */
    @Override // defpackage.nkm
    public final /* bridge */ /* synthetic */ ngp h() {
        t();
        if (this.e.g()) {
            return this.e.c();
        }
        return null;
    }

    public final int hashCode() {
        return this.g.b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ngp] */
    @Override // defpackage.nkm
    public final /* bridge */ /* synthetic */ ngp i() {
        u();
        if (this.f.g()) {
            return this.f.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ngp] */
    @Override // defpackage.nkm
    public final /* bridge */ /* synthetic */ ngp j() {
        v();
        if (this.d.g()) {
            return this.d.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nkp] */
    @Override // defpackage.nkm
    public final /* bridge */ /* synthetic */ nkp k() {
        r();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nkp] */
    @Override // defpackage.nkm
    public final /* bridge */ /* synthetic */ nkp l() {
        s();
        if (this.c.g()) {
            return this.c.c();
        }
        return null;
    }

    @Override // defpackage.nkm
    public final boolean m() {
        r();
        return this.b.g();
    }

    @Override // defpackage.nkm
    public final boolean n() {
        s();
        return this.c.g();
    }

    @Override // defpackage.nkm
    public final boolean o() {
        t();
        return this.e.g();
    }

    @Override // defpackage.nkm
    public final boolean p() {
        u();
        return this.f.g();
    }

    @Override // defpackage.nkm
    public final boolean q() {
        v();
        return this.d.g();
    }
}
