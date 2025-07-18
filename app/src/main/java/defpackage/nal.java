package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nal extends mix implements nfr {
    private final aees b;

    public nal(aees aeesVar) {
        this.b = aeesVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aees aeesVar = this.b;
        aees aeesVar2 = ((nal) obj).b;
        if (aeesVar == aeesVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aeesVar.b;
        ByteBuffer byteBuffer2 = aeesVar2.b;
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

    @Override // defpackage.nfr
    public final boolean g() {
        return this.b.g() != null;
    }

    public final int hashCode() {
        return this.b.b.hashCode();
    }
}
