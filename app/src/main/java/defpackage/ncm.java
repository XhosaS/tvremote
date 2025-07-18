package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ncm extends mix implements nmt {
    private yqt b;
    private yqt c;
    private final aegz d;

    public ncm(aegz aegzVar) {
        this.d = aegzVar;
    }

    private final void o() {
        if (this.b == null) {
            aegz aegzVar = this.d;
            aeen aeenVar = new aeen();
            int iA = aegzVar.a(4);
            if (iA != 0) {
                int i = iA + aegzVar.a;
                aeenVar.e(i + aegzVar.b.getInt(i), aegzVar.b);
            } else {
                aeenVar = null;
            }
            this.b = aeenVar == null ? ypv.a : yqt.i(new mzr(aeenVar));
        }
    }

    private final void p() {
        if (this.c == null) {
            aegz aegzVar = this.d;
            aeen aeenVar = new aeen();
            int iA = aegzVar.a(8);
            if (iA != 0) {
                int i = iA + aegzVar.a;
                aeenVar.e(i + aegzVar.b.getInt(i), aegzVar.b);
            } else {
                aeenVar = null;
            }
            this.c = aeenVar == null ? ypv.a : yqt.i(new mzr(aeenVar));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aegz aegzVar = this.d;
        aegz aegzVar2 = ((ncm) obj).d;
        if (aegzVar == aegzVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aegzVar.b;
        ByteBuffer byteBuffer2 = aegzVar2.b;
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

    @Override // defpackage.nmt
    public final int g() {
        return (int) (this.d.a(12) != 0 ? r0.b.getInt(r1 + r0.a) & 4294967295L : 0L);
    }

    @Override // defpackage.nmt
    public final int h() {
        return (int) (this.d.a(6) != 0 ? r0.b.getInt(r1 + r0.a) & 4294967295L : 0L);
    }

    public final int hashCode() {
        return this.d.b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ndo] */
    @Override // defpackage.nmt
    public final /* bridge */ /* synthetic */ ndo i() {
        o();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ndo] */
    @Override // defpackage.nmt
    public final /* bridge */ /* synthetic */ ndo j() {
        p();
        if (this.c.g()) {
            return this.c.c();
        }
        return null;
    }

    @Override // defpackage.nmt
    public final boolean k() {
        aegz aegzVar = this.d;
        int iA = aegzVar.a(14);
        return (iA == 0 || aegzVar.b.get(iA + aegzVar.a) == 0) ? false : true;
    }

    @Override // defpackage.nmt
    public final boolean l() {
        return aart.q(this.d, 6);
    }

    @Override // defpackage.nmt
    public final boolean m() {
        o();
        return this.b.g();
    }

    @Override // defpackage.nmt
    public final boolean n() {
        p();
        return this.c.g();
    }
}
