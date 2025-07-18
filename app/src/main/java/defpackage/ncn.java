package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ncn extends mix implements nmu {
    private final aehb a;

    public ncn(aehb aehbVar) {
        this.a = aehbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aehb aehbVar = this.a;
        aehb aehbVar2 = ((ncn) obj).a;
        if (aehbVar == aehbVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aehbVar.b;
        ByteBuffer byteBuffer2 = aehbVar2.b;
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

    @Override // defpackage.nmu
    public final float g() {
        aehb aehbVar = this.a;
        int iA = aehbVar.a(4);
        if (iA != 0) {
            return aehbVar.b.getFloat(iA + aehbVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.nmu
    public final float h(int i) {
        aehb aehbVar = this.a;
        int iA = aehbVar.a(8);
        if (iA != 0) {
            return aehbVar.b.getFloat(aehbVar.b(iA) + (i * 4));
        }
        return 0.0f;
    }

    public final int hashCode() {
        return this.a.b.hashCode();
    }

    @Override // defpackage.nmu
    public final int i() {
        aehb aehbVar = this.a;
        int iA = aehbVar.a(8);
        if (iA != 0) {
            return aehbVar.c(iA);
        }
        return 0;
    }

    @Override // defpackage.nmu
    public final int j() {
        aehb aehbVar = this.a;
        int iA = aehbVar.a(6);
        int iA2 = nmw.a(iA != 0 ? aehbVar.b.getInt(iA + aehbVar.a) : 0);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }
}
