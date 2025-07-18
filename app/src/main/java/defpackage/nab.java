package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nab extends mix implements nep {
    private yqt a;
    private yqt b;
    private final aegy c;

    public nab(aegy aegyVar) {
        this.c = aegyVar;
    }

    private final void H() {
        if (this.b == null) {
            aegy aegyVar = this.c;
            aefh aefhVar = new aefh();
            int iA = aegyVar.a(38);
            if (iA != 0) {
                int i = iA + aegyVar.a;
                aefhVar.e(i + aegyVar.b.getInt(i), aegyVar.b);
            } else {
                aefhVar = null;
            }
            this.b = aefhVar == null ? ypv.a : yqt.i(new mzu(aefhVar));
        }
    }

    private final void I() {
        if (this.a == null) {
            aegy aegyVar = this.c;
            aeft aeftVar = new aeft();
            int iA = aegyVar.a(18);
            if (iA != 0) {
                int i = iA + aegyVar.a;
                aeftVar.e(i + aegyVar.b.getInt(i), aegyVar.b);
            } else {
                aeftVar = null;
            }
            this.a = aeftVar == null ? ypv.a : yqt.i(new nac(aeftVar));
        }
    }

    @Override // defpackage.nep
    public final boolean A() {
        return aart.q(this.c, 22);
    }

    @Override // defpackage.nep
    public final boolean B() {
        return aart.q(this.c, 24);
    }

    @Override // defpackage.nep
    public final int C() {
        aegy aegyVar = this.c;
        int iA = aegyVar.a(12);
        int iA2 = neb.a(iA != 0 ? aegyVar.b.getInt(iA + aegyVar.a) : 0);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }

    @Override // defpackage.nep
    public final int D() {
        aegy aegyVar = this.c;
        int iA = aegyVar.a(30);
        int iA2 = ndq.a(iA != 0 ? aegyVar.b.getInt(iA + aegyVar.a) : 0);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }

    @Override // defpackage.nep
    public final int E() {
        aegy aegyVar = this.c;
        int iA = aegyVar.a(24);
        int iA2 = ned.a(iA != 0 ? aegyVar.b.getInt(iA + aegyVar.a) : 0);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }

    @Override // defpackage.nep
    public final int F() {
        aegy aegyVar = this.c;
        int iA = aegyVar.a(28);
        int iA2 = nei.a(iA != 0 ? aegyVar.b.getInt(iA + aegyVar.a) : 0);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }

    @Override // defpackage.nep
    public final int G() {
        aegy aegyVar = this.c;
        int iA = aegyVar.a(16);
        int iA2 = nei.a(iA != 0 ? aegyVar.b.getInt(iA + aegyVar.a) : 0);
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
        aegy aegyVar = this.c;
        aegy aegyVar2 = ((nab) obj).c;
        if (aegyVar == aegyVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aegyVar.b;
        ByteBuffer byteBuffer2 = aegyVar2.b;
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

    @Override // defpackage.nep
    @Deprecated
    public final float g() {
        aegy aegyVar = this.c;
        int iA = aegyVar.a(36);
        if (iA != 0) {
            return aegyVar.b.getFloat(iA + aegyVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.nep
    public final float h() {
        aegy aegyVar = this.c;
        int iA = aegyVar.a(10);
        if (iA != 0) {
            return aegyVar.b.getFloat(iA + aegyVar.a);
        }
        return 0.0f;
    }

    public final int hashCode() {
        return this.c.b.hashCode();
    }

    @Override // defpackage.nep
    public final float i() {
        aegy aegyVar = this.c;
        int iA = aegyVar.a(20);
        if (iA != 0) {
            return aegyVar.b.getFloat(iA + aegyVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.nep
    @Deprecated
    public final int j() {
        return (int) (this.c.a(34) != 0 ? r0.b.getInt(r1 + r0.a) & 4294967295L : 0L);
    }

    @Override // defpackage.nep
    public final int k() {
        return (int) (this.c.a(14) != 0 ? r0.b.getInt(r1 + r0.a) & 4294967295L : 0L);
    }

    @Override // defpackage.nep
    public final int l() {
        return (int) (this.c.a(6) != 0 ? r0.b.getInt(r1 + r0.a) & 4294967295L : 0L);
    }

    @Override // defpackage.nep
    public final int m() {
        return (int) (this.c.a(4) != 0 ? r0.b.getInt(r1 + r0.a) & 4294967295L : 0L);
    }

    @Override // defpackage.nep
    public final int n() {
        return (int) (this.c.a(22) != 0 ? r0.b.getInt(r1 + r0.a) & 4294967295L : 0L);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ndt] */
    @Override // defpackage.nep
    public final /* bridge */ /* synthetic */ ndt o() {
        H();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, neq] */
    @Override // defpackage.nep
    public final /* bridge */ /* synthetic */ neq p() {
        I();
        if (this.a.g()) {
            return this.a.c();
        }
        return null;
    }

    @Override // defpackage.nep
    public final String q() {
        return this.c.h();
    }

    @Override // defpackage.nep
    public final String r() {
        return this.c.i();
    }

    @Override // defpackage.nep
    public final boolean s() {
        aegy aegyVar = this.c;
        int iA = aegyVar.a(26);
        return (iA == 0 || aegyVar.b.get(iA + aegyVar.a) == 0) ? false : true;
    }

    @Override // defpackage.nep
    public final boolean t() {
        H();
        return this.b.g();
    }

    @Override // defpackage.nep
    public final boolean u() {
        return aart.q(this.c, 14);
    }

    @Override // defpackage.nep
    public final boolean v() {
        return this.c.h() != null;
    }

    @Override // defpackage.nep
    public final boolean w() {
        return this.c.i() != null;
    }

    @Override // defpackage.nep
    public final boolean x() {
        return aart.q(this.c, 6);
    }

    @Override // defpackage.nep
    public final boolean y() {
        return aart.q(this.c, 20);
    }

    @Override // defpackage.nep
    public final boolean z() {
        I();
        return this.a.g();
    }
}
