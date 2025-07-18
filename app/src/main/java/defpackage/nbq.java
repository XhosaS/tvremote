package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nbq extends mix implements njs {
    private yqt a;
    private final aegc b;

    public nbq(aegc aegcVar) {
        this.b = aegcVar;
    }

    private final void n() {
        if (this.a == null) {
            aegc aegcVar = this.b;
            aefs aefsVar = new aefs();
            int iA = aegcVar.a(8);
            if (iA != 0) {
                int i = iA + aegcVar.a;
                aefsVar.e(i + aegcVar.b.getInt(i), aegcVar.b);
            } else {
                aefsVar = null;
            }
            this.a = aefsVar == null ? ypv.a : yqt.i(new nbr(aefsVar));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aegc aegcVar = this.b;
        aegc aegcVar2 = ((nbq) obj).b;
        if (aegcVar == aegcVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aegcVar.b;
        ByteBuffer byteBuffer2 = aegcVar2.b;
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

    @Override // defpackage.njs
    public final int g() {
        aegc aegcVar = this.b;
        int iA = aegcVar.a(4);
        if (iA != 0) {
            return aegcVar.c(iA);
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, njv] */
    @Override // defpackage.njs
    public final /* bridge */ /* synthetic */ njv h() {
        n();
        if (this.a.g()) {
            return this.a.c();
        }
        return null;
    }

    public final int hashCode() {
        return this.b.b.hashCode();
    }

    @Override // defpackage.njs
    public final /* bridge */ /* synthetic */ njw i(int i) {
        aegd aegdVar = new aegd();
        aegc aegcVar = this.b;
        int iA = aegcVar.a(4);
        if (iA != 0) {
            int iB = aegcVar.b(iA) + (i * 4);
            aegdVar.e(iB + aegcVar.b.getInt(iB), aegcVar.b);
        } else {
            aegdVar = null;
        }
        if (aegdVar != null) {
            return new nbs(aegdVar);
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.njs
    public final boolean j() {
        aegc aegcVar = this.b;
        int iA = aegcVar.a(10);
        return (iA == 0 || aegcVar.b.get(iA + aegcVar.a) == 0) ? false : true;
    }

    @Override // defpackage.njs
    public final boolean k() {
        n();
        return this.a.g();
    }

    @Override // defpackage.njs
    public final int l() {
        aegc aegcVar = this.b;
        int iA = aegcVar.a(12);
        int iA2 = nju.a(iA != 0 ? aegcVar.b.getInt(iA + aegcVar.a) : 0);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }

    @Override // defpackage.njs
    public final int m() {
        aegc aegcVar = this.b;
        int iA = aegcVar.a(6);
        int iA2 = njq.a(iA != 0 ? aegcVar.b.getInt(iA + aegcVar.a) : 0);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }
}
