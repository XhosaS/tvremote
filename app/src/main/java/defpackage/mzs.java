package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mzs extends mix implements ndr {
    private yqt a;
    private yqt b;
    private yqt c;
    private final aefa d;

    public mzs(aefa aefaVar) {
        this.d = aefaVar;
    }

    private final void p() {
        if (this.b == null) {
            aefa aefaVar = this.d;
            aefs aefsVar = new aefs();
            int iA = aefaVar.a(10);
            if (iA != 0) {
                int i = iA + aefaVar.a;
                aefsVar.e(i + aefaVar.b.getInt(i), aefaVar.b);
            } else {
                aefsVar = null;
            }
            this.b = aefsVar == null ? ypv.a : yqt.i(new nar(aefsVar));
        }
    }

    private final void q() {
        if (this.a == null) {
            aefa aefaVar = this.d;
            aefs aefsVar = new aefs();
            int iA = aefaVar.a(8);
            if (iA != 0) {
                int i = iA + aefaVar.a;
                aefsVar.e(i + aefaVar.b.getInt(i), aefaVar.b);
            } else {
                aefsVar = null;
            }
            this.a = aefsVar == null ? ypv.a : yqt.i(new nar(aefsVar));
        }
    }

    private final void r() {
        if (this.c == null) {
            aefa aefaVar = this.d;
            aefy aefyVar = new aefy();
            int iA = aefaVar.a(12);
            if (iA != 0) {
                int i = iA + aefaVar.a;
                aefyVar.e(i + aefaVar.b.getInt(i), aefaVar.b);
            } else {
                aefyVar = null;
            }
            this.c = aefyVar == null ? ypv.a : yqt.i(new nat(aefyVar));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aefa aefaVar = this.d;
        aefa aefaVar2 = ((mzs) obj).d;
        if (aefaVar == aefaVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aefaVar.b;
        ByteBuffer byteBuffer2 = aefaVar2.b;
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

    @Override // defpackage.ndr
    public final int g() {
        return (int) (this.d.a(6) != 0 ? r0.b.getInt(r1 + r0.a) & 4294967295L : 0L);
    }

    @Override // defpackage.ndr
    public final int h() {
        return (int) (this.d.a(4) != 0 ? r0.b.getInt(r1 + r0.a) & 4294967295L : 0L);
    }

    public final int hashCode() {
        return this.d.b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ngp] */
    @Override // defpackage.ndr
    public final /* bridge */ /* synthetic */ ngp i() {
        p();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ngp] */
    @Override // defpackage.ndr
    public final /* bridge */ /* synthetic */ ngp j() {
        q();
        if (this.a.g()) {
            return this.a.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ngr] */
    @Override // defpackage.ndr
    public final /* bridge */ /* synthetic */ ngr k() {
        r();
        if (this.c.g()) {
            return this.c.c();
        }
        return null;
    }

    @Override // defpackage.ndr
    public final boolean l() {
        return aart.q(this.d, 6);
    }

    @Override // defpackage.ndr
    public final boolean m() {
        p();
        return this.b.g();
    }

    @Override // defpackage.ndr
    public final boolean n() {
        q();
        return this.a.g();
    }

    @Override // defpackage.ndr
    public final boolean o() {
        r();
        return this.c.g();
    }
}
