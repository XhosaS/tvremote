package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mzl extends mix implements ncx {
    private final aeeh b;

    public mzl(aeeh aeehVar) {
        this.b = aeehVar;
    }

    @Override // defpackage.ncx
    public final boolean ao() {
        return aart.q(this.b, 14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aeeh aeehVar = this.b;
        aeeh aeehVar2 = ((mzl) obj).b;
        if (aeehVar == aeehVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aeehVar.b;
        ByteBuffer byteBuffer2 = aeehVar2.b;
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

    @Override // defpackage.ncx
    public final int g() {
        aeeh aeehVar = this.b;
        int iA = aeehVar.a(12);
        if (iA != 0) {
            return aeehVar.c(iA);
        }
        return 0;
    }

    @Override // defpackage.ncx
    public final String h() {
        aeeh aeehVar = this.b;
        int iA = aeehVar.a(6);
        if (iA != 0) {
            return aeehVar.d(iA + aeehVar.a);
        }
        return null;
    }

    public final int hashCode() {
        return this.b.b.hashCode();
    }

    @Override // defpackage.ncx
    public final String i() {
        return this.b.g();
    }

    @Override // defpackage.ncx
    public final String j() {
        aeeh aeehVar = this.b;
        int iA = aeehVar.a(4);
        if (iA != 0) {
            return aeehVar.d(iA + aeehVar.a);
        }
        return null;
    }

    @Override // defpackage.ncx
    public final boolean k() {
        aeeh aeehVar = this.b;
        int iA = aeehVar.a(14);
        return (iA == 0 || aeehVar.b.get(iA + aeehVar.a) == 0) ? false : true;
    }

    @Override // defpackage.ncx
    public final boolean l() {
        return this.b.g() != null;
    }

    @Override // defpackage.ncx
    public final int n() {
        aeeh aeehVar = this.b;
        int iA = aeehVar.a(16);
        int iA2 = nct.a(iA != 0 ? aeehVar.b.getInt(iA + aeehVar.a) : 0);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }

    @Override // defpackage.ncx
    public final int o(int i) {
        aeeh aeehVar = this.b;
        int iA = aeehVar.a(12);
        int iA2 = ncz.a(iA != 0 ? aeehVar.b.getInt(aeehVar.b(iA) + (i * 4)) : 0);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }
}
