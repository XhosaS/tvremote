package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ncj extends mix implements nmj {
    private final aegs a;

    public ncj(aegs aegsVar) {
        this.a = aegsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aegs aegsVar = this.a;
        aegs aegsVar2 = ((ncj) obj).a;
        if (aegsVar == aegsVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aegsVar.b;
        ByteBuffer byteBuffer2 = aegsVar2.b;
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

    @Override // defpackage.nmj
    public final boolean g() {
        aegs aegsVar = this.a;
        int iA = aegsVar.a(18);
        return (iA == 0 || aegsVar.b.get(iA + aegsVar.a) == 0) ? false : true;
    }

    @Override // defpackage.nmj
    public final boolean h() {
        aegs aegsVar = this.a;
        int iA = aegsVar.a(8);
        return (iA == 0 || aegsVar.b.get(iA + aegsVar.a) == 0) ? false : true;
    }

    public final int hashCode() {
        return this.a.b.hashCode();
    }

    @Override // defpackage.nmj
    public final boolean i() {
        aegs aegsVar = this.a;
        int iA = aegsVar.a(10);
        return (iA == 0 || aegsVar.b.get(iA + aegsVar.a) == 0) ? false : true;
    }

    @Override // defpackage.nmj
    public final boolean j() {
        aegs aegsVar = this.a;
        int iA = aegsVar.a(16);
        return (iA == 0 || aegsVar.b.get(iA + aegsVar.a) == 0) ? false : true;
    }

    @Override // defpackage.nmj
    public final boolean k() {
        aegs aegsVar = this.a;
        int iA = aegsVar.a(14);
        return (iA == 0 || aegsVar.b.get(iA + aegsVar.a) == 0) ? false : true;
    }

    @Override // defpackage.nmj
    public final boolean l() {
        aegs aegsVar = this.a;
        int iA = aegsVar.a(4);
        return (iA == 0 || aegsVar.b.get(iA + aegsVar.a) == 0) ? false : true;
    }

    @Override // defpackage.nmj
    public final boolean m() {
        aegs aegsVar = this.a;
        int iA = aegsVar.a(6);
        return (iA == 0 || aegsVar.b.get(iA + aegsVar.a) == 0) ? false : true;
    }

    @Override // defpackage.nmj
    public final boolean n() {
        aegs aegsVar = this.a;
        int iA = aegsVar.a(12);
        return (iA == 0 || aegsVar.b.get(iA + aegsVar.a) == 0) ? false : true;
    }

    @Override // defpackage.nmj
    public final boolean o() {
        return aart.q(this.a, 18);
    }

    @Override // defpackage.nmj
    public final boolean p() {
        return aart.q(this.a, 8);
    }

    @Override // defpackage.nmj
    public final boolean q() {
        return aart.q(this.a, 10);
    }

    @Override // defpackage.nmj
    public final boolean r() {
        return aart.q(this.a, 16);
    }

    @Override // defpackage.nmj
    public final boolean s() {
        return aart.q(this.a, 14);
    }

    @Override // defpackage.nmj
    public final boolean t() {
        return aart.q(this.a, 4);
    }

    @Override // defpackage.nmj
    public final boolean u() {
        return aart.q(this.a, 6);
    }

    @Override // defpackage.nmj
    public final boolean v() {
        return aart.q(this.a, 12);
    }
}
