package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nbh extends mix implements niv {
    private final aefq b;

    public nbh(aefq aefqVar) {
        this.b = aefqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aefq aefqVar = this.b;
        aefq aefqVar2 = ((nbh) obj).b;
        if (aefqVar == aefqVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aefqVar.b;
        ByteBuffer byteBuffer2 = aefqVar2.b;
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

    @Override // defpackage.niv
    public final boolean g() {
        aefq aefqVar = this.b;
        int iA = aefqVar.a(16);
        return (iA == 0 || aefqVar.b.get(iA + aefqVar.a) == 0) ? false : true;
    }

    @Override // defpackage.niv
    public final boolean h() {
        aefq aefqVar = this.b;
        int iA = aefqVar.a(20);
        return (iA == 0 || aefqVar.b.get(iA + aefqVar.a) == 0) ? false : true;
    }

    public final int hashCode() {
        return this.b.b.hashCode();
    }

    @Override // defpackage.niv
    public final boolean i() {
        aefq aefqVar = this.b;
        int iA = aefqVar.a(28);
        return (iA == 0 || aefqVar.b.get(iA + aefqVar.a) == 0) ? false : true;
    }

    @Override // defpackage.niv
    public final boolean j() {
        aefq aefqVar = this.b;
        int iA = aefqVar.a(26);
        return (iA == 0 || aefqVar.b.get(iA + aefqVar.a) == 0) ? false : true;
    }

    @Override // defpackage.niv
    public final boolean k() {
        aefq aefqVar = this.b;
        int iA = aefqVar.a(22);
        return (iA == 0 || aefqVar.b.get(iA + aefqVar.a) == 0) ? false : true;
    }

    @Override // defpackage.niv
    public final boolean l() {
        aefq aefqVar = this.b;
        int iA = aefqVar.a(18);
        return (iA == 0 || aefqVar.b.get(iA + aefqVar.a) == 0) ? false : true;
    }

    @Override // defpackage.niv
    public final boolean m() {
        aefq aefqVar = this.b;
        int iA = aefqVar.a(10);
        return (iA == 0 || aefqVar.b.get(iA + aefqVar.a) == 0) ? false : true;
    }

    @Override // defpackage.niv
    public final boolean n() {
        aefq aefqVar = this.b;
        int iA = aefqVar.a(6);
        return (iA == 0 || aefqVar.b.get(iA + aefqVar.a) == 0) ? false : true;
    }

    @Override // defpackage.niv
    public final boolean o() {
        aefq aefqVar = this.b;
        int iA = aefqVar.a(4);
        return (iA == 0 || aefqVar.b.get(iA + aefqVar.a) == 0) ? false : true;
    }

    @Override // defpackage.niv
    public final boolean p() {
        aefq aefqVar = this.b;
        int iA = aefqVar.a(24);
        return (iA == 0 || aefqVar.b.get(iA + aefqVar.a) == 0) ? false : true;
    }
}
