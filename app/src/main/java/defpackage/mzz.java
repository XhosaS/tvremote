package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mzz extends mix implements nel {
    private final aegk a;

    public mzz(aegk aegkVar) {
        this.a = aegkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aegk aegkVar = this.a;
        aegk aegkVar2 = ((mzz) obj).a;
        if (aegkVar == aegkVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aegkVar.b;
        ByteBuffer byteBuffer2 = aegkVar2.b;
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

    @Override // defpackage.nel
    public final int g() {
        aegk aegkVar = this.a;
        int iA = aegkVar.a(4);
        int iA2 = nek.a(iA != 0 ? aegkVar.b.getInt(iA + aegkVar.a) : 0);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }

    public final int hashCode() {
        return this.a.b.hashCode();
    }
}
