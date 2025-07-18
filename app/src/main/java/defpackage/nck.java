package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nck extends mix implements nmn {
    private yqt b;
    private yqt c;
    private yqt d;
    private final aegx e;

    public nck(aegx aegxVar) {
        this.e = aegxVar;
    }

    private final void x() {
        if (this.b == null) {
            aegx aegxVar = this.e;
            aegs aegsVar = new aegs();
            int iA = aegxVar.a(14);
            if (iA != 0) {
                int i = iA + aegxVar.a;
                aegsVar.e(i + aegxVar.b.getInt(i), aegxVar.b);
            } else {
                aegsVar = null;
            }
            this.b = aegsVar == null ? ypv.a : yqt.i(new ncj(aegsVar));
        }
    }

    private final void y() {
        if (this.c == null) {
            aegx aegxVar = this.e;
            aeft aeftVar = new aeft();
            int iA = aegxVar.a(20);
            if (iA != 0) {
                int i = iA + aegxVar.a;
                aeftVar.e(i + aegxVar.b.getInt(i), aegxVar.b);
            } else {
                aeftVar = null;
            }
            this.c = aeftVar == null ? ypv.a : yqt.i(new ncl(aeftVar));
        }
    }

    private final void z() {
        if (this.d == null) {
            aegx aegxVar = this.e;
            aegp aegpVar = new aegp();
            int iA = aegxVar.a(30);
            if (iA != 0) {
                aegpVar.a(iA + aegxVar.a, aegxVar.b);
            } else {
                aegpVar = null;
            }
            this.d = aegpVar == null ? ypv.a : yqt.i(new ncb(aegpVar));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aegx aegxVar = this.e;
        aegx aegxVar2 = ((nck) obj).e;
        if (aegxVar == aegxVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aegxVar.b;
        ByteBuffer byteBuffer2 = aegxVar2.b;
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

    @Override // defpackage.nmn
    public final float g() {
        aegx aegxVar = this.e;
        int iA = aegxVar.a(12);
        if (iA != 0) {
            return aegxVar.b.getFloat(iA + aegxVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.nmn
    public final float h() {
        aegx aegxVar = this.e;
        int iA = aegxVar.a(10);
        if (iA != 0) {
            return aegxVar.b.getFloat(iA + aegxVar.a);
        }
        return 0.0f;
    }

    public final int hashCode() {
        return this.e.b.hashCode();
    }

    @Override // defpackage.nmn
    public final float i() {
        aegx aegxVar = this.e;
        int iA = aegxVar.a(6);
        if (iA != 0) {
            return aegxVar.b.getFloat(iA + aegxVar.a);
        }
        return 1.0f;
    }

    @Override // defpackage.nmn
    public final float j() {
        aegx aegxVar = this.e;
        int iA = aegxVar.a(28);
        if (iA != 0) {
            return aegxVar.b.getFloat(iA + aegxVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.nmn
    public final float k() {
        aegx aegxVar = this.e;
        int iA = aegxVar.a(22);
        if (iA != 0) {
            return aegxVar.b.getFloat(iA + aegxVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.nmn
    public final float l() {
        aegx aegxVar = this.e;
        int iA = aegxVar.a(24);
        if (iA != 0) {
            return aegxVar.b.getFloat(iA + aegxVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.nmn
    public final float m() {
        aegx aegxVar = this.e;
        int iA = aegxVar.a(26);
        if (iA != 0) {
            return aegxVar.b.getFloat(iA + aegxVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.nmn
    public final int n() {
        return (int) (this.e.a(4) != 0 ? r0.b.getInt(r1 + r0.a) & 4294967295L : 0L);
    }

    @Override // defpackage.nmn
    public final int o() {
        return (int) (this.e.a(8) != 0 ? r0.b.getInt(r1 + r0.a) & 4294967295L : 0L);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nlp] */
    @Override // defpackage.nmn
    public final /* bridge */ /* synthetic */ nlp p() {
        z();
        if (this.d.g()) {
            return this.d.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nmj] */
    @Override // defpackage.nmn
    public final /* bridge */ /* synthetic */ nmj q() {
        x();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nmo] */
    @Override // defpackage.nmn
    public final /* bridge */ /* synthetic */ nmo r() {
        y();
        if (this.c.g()) {
            return this.c.c();
        }
        return null;
    }

    @Override // defpackage.nmn
    public final boolean s() {
        aegx aegxVar = this.e;
        int iA = aegxVar.a(16);
        return iA == 0 || aegxVar.b.get(iA + aegxVar.a) != 0;
    }

    @Override // defpackage.nmn
    public final boolean t() {
        x();
        return this.b.g();
    }

    @Override // defpackage.nmn
    public final boolean u() {
        return aart.q(this.e, 16);
    }

    @Override // defpackage.nmn
    public final boolean v() {
        y();
        return this.c.g();
    }

    @Override // defpackage.nmn
    public final boolean w() {
        z();
        return this.d.g();
    }
}
