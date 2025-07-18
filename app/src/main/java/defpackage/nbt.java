package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nbt extends mix implements nke {
    private yqt b;
    private yqt c;
    private yqt d;
    private yqt e;
    private yqt f;
    private final aege g;

    public nbt(aege aegeVar) {
        this.g = aegeVar;
    }

    private final void s() {
        if (this.c == null) {
            aege aegeVar = this.g;
            aegc aegcVar = new aegc();
            int iA = aegeVar.a(6);
            if (iA != 0) {
                int i = iA + aegeVar.a;
                aegcVar.e(i + aegeVar.b.getInt(i), aegeVar.b);
            } else {
                aegcVar = null;
            }
            this.c = aegcVar == null ? ypv.a : yqt.i(new nbq(aegcVar));
        }
    }

    private final void t() {
        if (this.d == null) {
            aege aegeVar = this.g;
            aegc aegcVar = new aegc();
            int iA = aegeVar.a(8);
            if (iA != 0) {
                int i = iA + aegeVar.a;
                aegcVar.e(i + aegeVar.b.getInt(i), aegeVar.b);
            } else {
                aegcVar = null;
            }
            this.d = aegcVar == null ? ypv.a : yqt.i(new nbq(aegcVar));
        }
    }

    private final void u() {
        if (this.b == null) {
            aege aegeVar = this.g;
            aegc aegcVar = new aegc();
            int iA = aegeVar.a(4);
            if (iA != 0) {
                int i = iA + aegeVar.a;
                aegcVar.e(i + aegeVar.b.getInt(i), aegeVar.b);
            } else {
                aegcVar = null;
            }
            this.b = aegcVar == null ? ypv.a : yqt.i(new nbq(aegcVar));
        }
    }

    private final void v() {
        if (this.f == null) {
            aege aegeVar = this.g;
            aefs aefsVar = new aefs();
            int iA = aegeVar.a(16);
            if (iA != 0) {
                int i = iA + aegeVar.a;
                aefsVar.e(i + aegeVar.b.getInt(i), aegeVar.b);
            } else {
                aefsVar = null;
            }
            this.f = aefsVar == null ? ypv.a : yqt.i(new nar(aefsVar));
        }
    }

    private final void w() {
        if (this.e == null) {
            aege aegeVar = this.g;
            aefs aefsVar = new aefs();
            int iA = aegeVar.a(14);
            if (iA != 0) {
                int i = iA + aegeVar.a;
                aefsVar.e(i + aegeVar.b.getInt(i), aegeVar.b);
            } else {
                aefsVar = null;
            }
            this.e = aefsVar == null ? ypv.a : yqt.i(new nar(aefsVar));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aege aegeVar = this.g;
        aege aegeVar2 = ((nbt) obj).g;
        if (aegeVar == aegeVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aegeVar.b;
        ByteBuffer byteBuffer2 = aegeVar2.b;
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
    @Override // defpackage.nke
    public final /* bridge */ /* synthetic */ ngp g() {
        v();
        if (this.f.g()) {
            return this.f.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ngp] */
    @Override // defpackage.nke
    public final /* bridge */ /* synthetic */ ngp h() {
        w();
        if (this.e.g()) {
            return this.e.c();
        }
        return null;
    }

    public final int hashCode() {
        return this.g.b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, njs] */
    @Override // defpackage.nke
    public final /* bridge */ /* synthetic */ njs i() {
        s();
        if (this.c.g()) {
            return this.c.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, njs] */
    @Override // defpackage.nke
    public final /* bridge */ /* synthetic */ njs j() {
        t();
        if (this.d.g()) {
            return this.d.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, njs] */
    @Override // defpackage.nke
    public final /* bridge */ /* synthetic */ njs k() {
        u();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    @Override // defpackage.nke
    public final boolean l() {
        s();
        return this.c.g();
    }

    @Override // defpackage.nke
    public final boolean m() {
        t();
        return this.d.g();
    }

    @Override // defpackage.nke
    public final boolean n() {
        u();
        return this.b.g();
    }

    @Override // defpackage.nke
    public final boolean o() {
        v();
        return this.f.g();
    }

    @Override // defpackage.nke
    public final boolean p() {
        w();
        return this.e.g();
    }

    @Override // defpackage.nke
    public final int q() {
        aege aegeVar = this.g;
        int iA = aegeVar.a(18);
        int iA2 = njy.a(iA != 0 ? aegeVar.b.getInt(iA + aegeVar.a) : 0);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }

    @Override // defpackage.nke
    public final int r() {
        aege aegeVar = this.g;
        int iA = aegeVar.a(10);
        int iA2 = nka.a(iA != 0 ? aegeVar.b.getInt(iA + aegeVar.a) : 0);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }
}
