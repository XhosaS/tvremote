package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mzm extends mix implements nda {
    private final aeei a;

    public mzm(aeei aeeiVar) {
        this.a = aeeiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aeei aeeiVar = this.a;
        aeei aeeiVar2 = ((mzm) obj).a;
        if (aeeiVar == aeeiVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aeeiVar.b;
        ByteBuffer byteBuffer2 = aeeiVar2.b;
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

    @Override // defpackage.nda
    public final int g() {
        aeei aeeiVar = this.a;
        int iA = aeeiVar.a(6);
        if (iA != 0) {
            return aeeiVar.b.getInt(iA + aeeiVar.a);
        }
        return 0;
    }

    @Override // defpackage.nda
    public final int h() {
        aeei aeeiVar = this.a;
        int iA = aeeiVar.a(4);
        if (iA != 0) {
            return aeeiVar.b.getInt(iA + aeeiVar.a);
        }
        return 0;
    }

    public final int hashCode() {
        return this.a.b.hashCode();
    }
}
