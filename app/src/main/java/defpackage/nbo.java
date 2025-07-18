package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nbo extends mix implements njo {
    private final aeet a;

    public nbo(aeet aeetVar) {
        this.a = aeetVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aeet aeetVar = this.a;
        aeet aeetVar2 = ((nbo) obj).a;
        if (aeetVar == aeetVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aeetVar.b;
        ByteBuffer byteBuffer2 = aeetVar2.b;
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

    @Override // defpackage.njo
    public final int g() {
        return (int) (this.a.a(8) != 0 ? r0.b.getInt(r1 + r0.a) & 4294967295L : 0L);
    }

    @Override // defpackage.njo
    public final String h() {
        return this.a.g();
    }

    public final int hashCode() {
        return this.a.b.hashCode();
    }

    @Override // defpackage.njo
    public final boolean i() {
        return this.a.g() != null;
    }
}
