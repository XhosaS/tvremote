package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nbi extends mix implements niw {
    private final aefr a;

    public nbi(aefr aefrVar) {
        this.a = aefrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aefr aefrVar = this.a;
        aefr aefrVar2 = ((nbi) obj).a;
        if (aefrVar == aefrVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aefrVar.b;
        ByteBuffer byteBuffer2 = aefrVar2.b;
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

    @Override // defpackage.niw
    public final float g() {
        aefr aefrVar = this.a;
        int iA = aefrVar.a(12);
        if (iA != 0) {
            return aefrVar.b.getFloat(iA + aefrVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.niw
    public final int h() {
        return (int) (this.a.a(10) != 0 ? r0.b.getInt(r1 + r0.a) & 4294967295L : 0L);
    }

    public final int hashCode() {
        return this.a.b.hashCode();
    }

    @Override // defpackage.niw
    public final int i() {
        return (int) (this.a.a(8) != 0 ? r0.b.getInt(r1 + r0.a) & 4294967295L : 0L);
    }

    @Override // defpackage.niw
    public final boolean j() {
        aefr aefrVar = this.a;
        int iA = aefrVar.a(4);
        return (iA == 0 || aefrVar.b.get(iA + aefrVar.a) == 0) ? false : true;
    }

    @Override // defpackage.niw
    public final boolean k() {
        aefr aefrVar = this.a;
        int iA = aefrVar.a(14);
        return (iA == 0 || aefrVar.b.get(iA + aefrVar.a) == 0) ? false : true;
    }

    @Override // defpackage.niw
    public final boolean l() {
        aefr aefrVar = this.a;
        int iA = aefrVar.a(6);
        return (iA == 0 || aefrVar.b.get(iA + aefrVar.a) == 0) ? false : true;
    }

    @Override // defpackage.niw
    public final boolean m() {
        return aart.q(this.a, 10);
    }

    @Override // defpackage.niw
    public final boolean n() {
        return aart.q(this.a, 12);
    }

    @Override // defpackage.niw
    public final boolean o() {
        return aart.q(this.a, 8);
    }
}
