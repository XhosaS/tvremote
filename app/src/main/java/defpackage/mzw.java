package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mzw extends mix implements ndv {
    private final aefj a;

    public mzw(aefj aefjVar) {
        this.a = aefjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aefj aefjVar = this.a;
        aefj aefjVar2 = ((mzw) obj).a;
        if (aefjVar == aefjVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aefjVar.b;
        ByteBuffer byteBuffer2 = aefjVar2.b;
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

    @Override // defpackage.ndv
    public final int g(int i) {
        return (int) (this.a.a(4) != 0 ? r0.b.getInt(r0.b(r2) + (i * 4)) & 4294967295L : 0L);
    }

    @Override // defpackage.ndv
    public final int h() {
        aefj aefjVar = this.a;
        int iA = aefjVar.a(4);
        if (iA != 0) {
            return aefjVar.c(iA);
        }
        return 0;
    }

    public final int hashCode() {
        return this.a.b.hashCode();
    }
}
