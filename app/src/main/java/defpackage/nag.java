package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nag extends mix implements nfg {
    private yqt b;
    private yqt c;
    private yqt d;
    private yqt e;
    private final aeeq f;

    public nag(aeeq aeeqVar) {
        this.f = aeeqVar;
    }

    private final void u() {
        if (this.e == null) {
            aeeq aeeqVar = this.f;
            aeep aeepVar = new aeep();
            int iA = aeeqVar.a(20);
            if (iA != 0) {
                int i = iA + aeeqVar.a;
                aeepVar.e(i + aeeqVar.b.getInt(i), aeeqVar.b);
            } else {
                aeepVar = null;
            }
            this.e = aeepVar == null ? ypv.a : yqt.i(new naf(aeepVar));
        }
    }

    private final void v() {
        if (this.d == null) {
            aeeq aeeqVar = this.f;
            aegs aegsVar = new aegs();
            int iA = aeeqVar.a(14);
            if (iA != 0) {
                int i = iA + aeeqVar.a;
                aegsVar.e(i + aeeqVar.b.getInt(i), aeeqVar.b);
            } else {
                aegsVar = null;
            }
            this.d = aegsVar == null ? ypv.a : yqt.i(new ncj(aegsVar));
        }
    }

    private final void w() {
        if (this.c == null) {
            aeeq aeeqVar = this.f;
            aeha aehaVar = new aeha();
            int iA = aeeqVar.a(16);
            if (iA != 0) {
                int i = iA + aeeqVar.a;
                aehaVar.e(i + aeeqVar.b.getInt(i), aeeqVar.b);
            } else {
                aehaVar = null;
            }
            this.c = aehaVar == null ? ypv.a : yqt.i(new naj(aehaVar));
        }
    }

    private final void x() {
        if (this.b == null) {
            aeeq aeeqVar = this.f;
            aegj aegjVar = new aegj();
            int iA = aeeqVar.a(12);
            if (iA != 0) {
                int i = iA + aeeqVar.a;
                aegjVar.e(i + aeeqVar.b.getInt(i), aeeqVar.b);
            } else {
                aegjVar = null;
            }
            this.b = aegjVar == null ? ypv.a : yqt.i(new nai(aegjVar));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aeeq aeeqVar = this.f;
        aeeq aeeqVar2 = ((nag) obj).f;
        if (aeeqVar == aeeqVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aeeqVar.b;
        ByteBuffer byteBuffer2 = aeeqVar2.b;
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

    @Override // defpackage.nfg
    public final float g() {
        aeeq aeeqVar = this.f;
        int iA = aeeqVar.a(4);
        if (iA != 0) {
            return aeeqVar.b.getFloat(iA + aeeqVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.nfg
    public final float h() {
        aeeq aeeqVar = this.f;
        int iA = aeeqVar.a(8);
        if (iA != 0) {
            return aeeqVar.b.getFloat(iA + aeeqVar.a);
        }
        return 0.0f;
    }

    public final int hashCode() {
        return this.f.b.hashCode();
    }

    @Override // defpackage.nfg
    public final int i() {
        return (int) (this.f.a(18) != 0 ? r0.b.getInt(r1 + r0.a) & 4294967295L : 0L);
    }

    @Override // defpackage.nfg
    public final int j() {
        return (int) (this.f.a(6) != 0 ? r0.b.getInt(r1 + r0.a) & 4294967295L : 0L);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nfc] */
    @Override // defpackage.nfg
    public final /* bridge */ /* synthetic */ nfc k() {
        u();
        if (this.e.g()) {
            return this.e.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nfi] */
    @Override // defpackage.nfg
    public final /* bridge */ /* synthetic */ nfi l() {
        x();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nfj] */
    @Override // defpackage.nfg
    public final /* bridge */ /* synthetic */ nfj m() {
        w();
        if (this.c.g()) {
            return this.c.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nmj] */
    @Override // defpackage.nfg
    public final /* bridge */ /* synthetic */ nmj n() {
        v();
        if (this.d.g()) {
            return this.d.c();
        }
        return null;
    }

    @Override // defpackage.nfg
    public final boolean o() {
        aeeq aeeqVar = this.f;
        int iA = aeeqVar.a(10);
        return (iA == 0 || aeeqVar.b.get(iA + aeeqVar.a) == 0) ? false : true;
    }

    @Override // defpackage.nfg
    public final boolean p() {
        return aart.q(this.f, 18);
    }

    @Override // defpackage.nfg
    public final boolean q() {
        u();
        return this.e.g();
    }

    @Override // defpackage.nfg
    public final boolean r() {
        v();
        return this.d.g();
    }

    @Override // defpackage.nfg
    public final boolean s() {
        w();
        return this.c.g();
    }

    @Override // defpackage.nfg
    public final boolean t() {
        x();
        return this.b.g();
    }
}
