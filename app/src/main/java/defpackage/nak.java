package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nak extends mix implements nfn {
    private final aeer b;

    public nak(aeer aeerVar) {
        this.b = aeerVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aeer aeerVar = this.b;
        aeer aeerVar2 = ((nak) obj).b;
        if (aeerVar == aeerVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aeerVar.b;
        ByteBuffer byteBuffer2 = aeerVar2.b;
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

    @Override // defpackage.nfn
    public final int g() {
        return (int) (this.b.a(4) != 0 ? r0.b.getInt(r1 + r0.a) & 4294967295L : 0L);
    }

    public final int hashCode() {
        return this.b.b.hashCode();
    }
}
