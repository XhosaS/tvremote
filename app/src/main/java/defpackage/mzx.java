package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mzx extends mix implements ndw {
    private final aefk a;

    public mzx(aefk aefkVar) {
        this.a = aefkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aefk aefkVar = this.a;
        aefk aefkVar2 = ((mzx) obj).a;
        if (aefkVar == aefkVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aefkVar.b;
        ByteBuffer byteBuffer2 = aefkVar2.b;
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

    @Override // defpackage.ndw
    public final int g() {
        return (int) (this.a.a(6) != 0 ? r0.b.getInt(r1 + r0.a) & 4294967295L : 0L);
    }

    @Override // defpackage.ndw
    public final int h() {
        return (int) (this.a.a(4) != 0 ? r0.b.getInt(r1 + r0.a) & 4294967295L : 0L);
    }

    public final int hashCode() {
        return this.a.b.hashCode();
    }
}
