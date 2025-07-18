package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nam extends mix implements nfs {
    private yqt a;
    private yqt b;
    private yqt c;
    private yqt d;
    private yqt e;
    private final aeeu f;

    public nam(aeeu aeeuVar) {
        this.f = aeeuVar;
    }

    private final void q() {
        if (this.a == null) {
            aeeu aeeuVar = this.f;
            aefs aefsVar = new aefs();
            int iA = aeeuVar.a(4);
            if (iA != 0) {
                int i = iA + aeeuVar.a;
                aefsVar.e(i + aeeuVar.b.getInt(i), aeeuVar.b);
            } else {
                aefsVar = null;
            }
            this.a = aefsVar == null ? ypv.a : yqt.i(new nay(aefsVar));
        }
    }

    private final void r() {
        if (this.c == null) {
            aeeu aeeuVar = this.f;
            aeff aeffVar = new aeff();
            int iA = aeeuVar.a(8);
            if (iA != 0) {
                int i = iA + aeeuVar.a;
                aeffVar.e(i + aeeuVar.b.getInt(i), aeeuVar.b);
            } else {
                aeffVar = null;
            }
            this.c = aeffVar == null ? ypv.a : yqt.i(new nbb(aeffVar));
        }
    }

    private final void s() {
        if (this.e == null) {
            aeeu aeeuVar = this.f;
            aefr aefrVar = new aefr();
            int iA = aeeuVar.a(12);
            if (iA != 0) {
                int i = iA + aeeuVar.a;
                aefrVar.e(i + aeeuVar.b.getInt(i), aeeuVar.b);
            } else {
                aefrVar = null;
            }
            this.e = aefrVar == null ? ypv.a : yqt.i(new nbi(aefrVar));
        }
    }

    private final void t() {
        if (this.b == null) {
            aeeu aeeuVar = this.f;
            aegq aegqVar = new aegq();
            int iA = aeeuVar.a(6);
            if (iA != 0) {
                int i = iA + aeeuVar.a;
                aegqVar.e(i + aeeuVar.b.getInt(i), aeeuVar.b);
            } else {
                aegqVar = null;
            }
            this.b = aegqVar == null ? ypv.a : yqt.i(new ncc(aegqVar));
        }
    }

    private final void u() {
        if (this.d == null) {
            aeeu aeeuVar = this.f;
            aegt aegtVar = new aegt();
            int iA = aeeuVar.a(10);
            if (iA != 0) {
                int i = iA + aeeuVar.a;
                aegtVar.e(i + aeeuVar.b.getInt(i), aeeuVar.b);
            } else {
                aegtVar = null;
            }
            this.d = aegtVar == null ? ypv.a : yqt.i(new nce(aegtVar));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aeeu aeeuVar = this.f;
        aeeu aeeuVar2 = ((nam) obj).f;
        if (aeeuVar == aeeuVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aeeuVar.b;
        ByteBuffer byteBuffer2 = aeeuVar2.b;
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

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nhl] */
    @Override // defpackage.nfs
    public final /* bridge */ /* synthetic */ nhl g() {
        q();
        if (this.a.g()) {
            return this.a.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nhq] */
    @Override // defpackage.nfs
    public final /* bridge */ /* synthetic */ nhq h() {
        r();
        if (this.c.g()) {
            return this.c.c();
        }
        return null;
    }

    public final int hashCode() {
        return this.f.b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, niw] */
    @Override // defpackage.nfs
    public final /* bridge */ /* synthetic */ niw i() {
        s();
        if (this.e.g()) {
            return this.e.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nlq] */
    @Override // defpackage.nfs
    public final /* bridge */ /* synthetic */ nlq j() {
        t();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nls] */
    @Override // defpackage.nfs
    public final /* bridge */ /* synthetic */ nls k() {
        u();
        if (this.d.g()) {
            return this.d.c();
        }
        return null;
    }

    @Override // defpackage.nfs
    public final boolean l() {
        q();
        return this.a.g();
    }

    @Override // defpackage.nfs
    public final boolean m() {
        r();
        return this.c.g();
    }

    @Override // defpackage.nfs
    public final boolean n() {
        s();
        return this.e.g();
    }

    @Override // defpackage.nfs
    public final boolean o() {
        t();
        return this.b.g();
    }

    @Override // defpackage.nfs
    public final boolean p() {
        u();
        return this.d.g();
    }
}
