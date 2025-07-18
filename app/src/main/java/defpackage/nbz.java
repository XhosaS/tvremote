package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nbz extends mix implements nky {
    private yqt b;
    private yqt c;
    private yqt d;
    private yqt e;
    private final aegr f;

    public nbz(aegr aegrVar) {
        this.f = aegrVar;
    }

    private final void p() {
        if (this.d == null) {
            aegr aegrVar = this.f;
            aefs aefsVar = new aefs();
            int iA = aegrVar.a(8);
            if (iA != 0) {
                int i = iA + aegrVar.a;
                aefsVar.e(i + aegrVar.b.getInt(i), aegrVar.b);
            } else {
                aefsVar = null;
            }
            this.d = aefsVar == null ? ypv.a : yqt.i(new nar(aefsVar));
        }
    }

    private final void q() {
        if (this.e == null) {
            aegr aegrVar = this.f;
            aefs aefsVar = new aefs();
            int iA = aegrVar.a(10);
            if (iA != 0) {
                int i = iA + aegrVar.a;
                aefsVar.e(i + aegrVar.b.getInt(i), aegrVar.b);
            } else {
                aefsVar = null;
            }
            this.e = aefsVar == null ? ypv.a : yqt.i(new nar(aefsVar));
        }
    }

    private final void r() {
        if (this.b == null) {
            aegr aegrVar = this.f;
            aegf aegfVar = new aegf();
            int iA = aegrVar.a(4);
            if (iA != 0) {
                int i = iA + aegrVar.a;
                aegfVar.e(i + aegrVar.b.getInt(i), aegrVar.b);
            } else {
                aegfVar = null;
            }
            this.b = aegfVar == null ? ypv.a : yqt.i(new nbw(aegfVar));
        }
    }

    private final void s() {
        if (this.c == null) {
            aegr aegrVar = this.f;
            aegf aegfVar = new aegf();
            int iA = aegrVar.a(6);
            if (iA != 0) {
                int i = iA + aegrVar.a;
                aegfVar.e(i + aegrVar.b.getInt(i), aegrVar.b);
            } else {
                aegfVar = null;
            }
            this.c = aegfVar == null ? ypv.a : yqt.i(new nbw(aegfVar));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aegr aegrVar = this.f;
        aegr aegrVar2 = ((nbz) obj).f;
        if (aegrVar == aegrVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aegrVar.b;
        ByteBuffer byteBuffer2 = aegrVar2.b;
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
    @Override // defpackage.nky
    public final /* bridge */ /* synthetic */ ngp g() {
        p();
        if (this.d.g()) {
            return this.d.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ngp] */
    @Override // defpackage.nky
    public final /* bridge */ /* synthetic */ ngp h() {
        q();
        if (this.e.g()) {
            return this.e.c();
        }
        return null;
    }

    public final int hashCode() {
        return this.f.b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nkp] */
    @Override // defpackage.nky
    public final /* bridge */ /* synthetic */ nkp i() {
        r();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nkp] */
    @Override // defpackage.nky
    public final /* bridge */ /* synthetic */ nkp j() {
        s();
        if (this.c.g()) {
            return this.c.c();
        }
        return null;
    }

    @Override // defpackage.nky
    public final String k() {
        aegr aegrVar = this.f;
        int iA = aegrVar.a(12);
        if (iA != 0) {
            return aegrVar.d(iA + aegrVar.a);
        }
        return null;
    }

    @Override // defpackage.nky
    public final boolean l() {
        p();
        return this.d.g();
    }

    @Override // defpackage.nky
    public final boolean m() {
        q();
        return this.e.g();
    }

    @Override // defpackage.nky
    public final boolean n() {
        r();
        return this.b.g();
    }

    @Override // defpackage.nky
    public final boolean o() {
        s();
        return this.c.g();
    }
}
