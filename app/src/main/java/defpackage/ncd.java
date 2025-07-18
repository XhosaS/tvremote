package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ncd extends miw implements nlr {
    private final aeft a;

    public ncd(aeft aeftVar) {
        super(aeftVar);
        this.a = aeftVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aeft aeftVar = this.a;
        aeft aeftVar2 = ((ncd) obj).a;
        if (aeftVar == aeftVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aeftVar.b;
        ByteBuffer byteBuffer2 = aeftVar2.b;
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
