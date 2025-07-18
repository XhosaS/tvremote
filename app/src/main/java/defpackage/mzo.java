package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mzo extends mix implements ndh {
    private yqt b;
    private yqt c;
    private yqt d;
    private yqt e;
    private yqt f;
    private final aeek g;

    public mzo(aeek aeekVar) {
        this.g = aeekVar;
    }

    private final void A() {
        if (this.e == null) {
            aeek aeekVar = this.g;
            aefs aefsVar = new aefs();
            int iA = aeekVar.a(22);
            if (iA != 0) {
                int i = iA + aeekVar.a;
                aefsVar.e(i + aeekVar.b.getInt(i), aeekVar.b);
            } else {
                aefsVar = null;
            }
            this.e = aefsVar == null ? ypv.a : yqt.i(new nar(aefsVar));
        }
    }

    private final void B() {
        if (this.c == null) {
            aeek aeekVar = this.g;
            aeej aeejVar = new aeej();
            int iA = aeekVar.a(18);
            if (iA != 0) {
                int i = iA + aeekVar.a;
                aeejVar.e(i + aeekVar.b.getInt(i), aeekVar.b);
            } else {
                aeejVar = null;
            }
            this.c = aeejVar == null ? ypv.a : yqt.i(new mzn(aeejVar));
        }
    }

    private final void x() {
        if (this.b == null) {
            aeek aeekVar = this.g;
            aeel aeelVar = new aeel();
            int iA = aeekVar.a(4);
            if (iA != 0) {
                int i = iA + aeekVar.a;
                aeelVar.e(i + aeekVar.b.getInt(i), aeekVar.b);
            } else {
                aeelVar = null;
            }
            this.b = aeelVar == null ? ypv.a : yqt.i(new mzp(aeelVar));
        }
    }

    private final void y() {
        if (this.d == null) {
            aeek aeekVar = this.g;
            aeei aeeiVar = new aeei();
            int iA = aeekVar.a(20);
            if (iA != 0) {
                int i = iA + aeekVar.a;
                aeeiVar.e(i + aeekVar.b.getInt(i), aeekVar.b);
            } else {
                aeeiVar = null;
            }
            this.d = aeeiVar == null ? ypv.a : yqt.i(new mzm(aeeiVar));
        }
    }

    private final void z() {
        if (this.f == null) {
            aeek aeekVar = this.g;
            aefs aefsVar = new aefs();
            int iA = aeekVar.a(24);
            if (iA != 0) {
                int i = iA + aeekVar.a;
                aefsVar.e(i + aeekVar.b.getInt(i), aeekVar.b);
            } else {
                aefsVar = null;
            }
            this.f = aefsVar == null ? ypv.a : yqt.i(new nar(aefsVar));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aeek aeekVar = this.g;
        aeek aeekVar2 = ((mzo) obj).g;
        if (aeekVar == aeekVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aeekVar.b;
        ByteBuffer byteBuffer2 = aeekVar2.b;
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

    @Override // defpackage.ndh
    public final float g() {
        aeek aeekVar = this.g;
        int iA = aeekVar.a(10);
        if (iA != 0) {
            return aeekVar.b.getFloat(iA + aeekVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.ndh
    public final float h() {
        aeek aeekVar = this.g;
        int iA = aeekVar.a(12);
        if (iA != 0) {
            return aeekVar.b.getFloat(iA + aeekVar.a);
        }
        return 1.0f;
    }

    public final int hashCode() {
        return this.g.b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nda] */
    @Override // defpackage.ndh
    public final /* bridge */ /* synthetic */ nda i() {
        y();
        if (this.d.g()) {
            return this.d.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ndb] */
    @Override // defpackage.ndh
    public final /* bridge */ /* synthetic */ ndb j() {
        B();
        if (this.c.g()) {
            return this.c.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ndi] */
    @Override // defpackage.ndh
    public final /* bridge */ /* synthetic */ ndi k() {
        x();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ngp] */
    @Override // defpackage.ndh
    public final /* bridge */ /* synthetic */ ngp l() {
        z();
        if (this.f.g()) {
            return this.f.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ngp] */
    @Override // defpackage.ndh
    public final /* bridge */ /* synthetic */ ngp m() {
        A();
        if (this.e.g()) {
            return this.e.c();
        }
        return null;
    }

    @Override // defpackage.ndh
    public final boolean n() {
        aeek aeekVar = this.g;
        int iA = aeekVar.a(30);
        return (iA == 0 || aeekVar.b.get(iA + aeekVar.a) == 0) ? false : true;
    }

    @Override // defpackage.ndh
    public final boolean o() {
        aeek aeekVar = this.g;
        int iA = aeekVar.a(28);
        return (iA == 0 || aeekVar.b.get(iA + aeekVar.a) == 0) ? false : true;
    }

    @Override // defpackage.ndh
    public final boolean p() {
        aeek aeekVar = this.g;
        int iA = aeekVar.a(6);
        return (iA == 0 || aeekVar.b.get(iA + aeekVar.a) == 0) ? false : true;
    }

    @Override // defpackage.ndh
    public final boolean q() {
        x();
        return this.b.g();
    }

    @Override // defpackage.ndh
    public final boolean r() {
        y();
        return this.d.g();
    }

    @Override // defpackage.ndh
    public final boolean s() {
        z();
        return this.f.g();
    }

    @Override // defpackage.ndh
    public final boolean t() {
        A();
        return this.e.g();
    }

    @Override // defpackage.ndh
    public final boolean u() {
        B();
        return this.c.g();
    }

    @Override // defpackage.ndh
    public final int v() {
        aeek aeekVar = this.g;
        int iA = aeekVar.a(16);
        int iA2 = ndd.a(iA != 0 ? aeekVar.b.getInt(iA + aeekVar.a) : 0);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }

    @Override // defpackage.ndh
    public final int w() {
        aeek aeekVar = this.g;
        int iA = aeekVar.a(26);
        int iA2 = njq.a(iA != 0 ? aeekVar.b.getInt(iA + aeekVar.a) : 0);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }
}
