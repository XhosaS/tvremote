package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nao extends miy implements nfz {
    private final aefs a;

    public nao(aefs aefsVar) {
        super(aefsVar);
        this.a = aefsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aefs aefsVar = this.a;
        aefs aefsVar2 = ((nao) obj).a;
        if (aefsVar == aefsVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aefsVar.b;
        ByteBuffer byteBuffer2 = aefsVar2.b;
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

    public final int hashCode() {
        return this.a.b.hashCode();
    }
}
