package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nax extends mix implements nhk {
    private final aefb b;

    public nax(aefb aefbVar) {
        this.b = aefbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aefb aefbVar = this.b;
        aefb aefbVar2 = ((nax) obj).b;
        if (aefbVar == aefbVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aefbVar.b;
        ByteBuffer byteBuffer2 = aefbVar2.b;
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

    @Override // defpackage.nhk
    public final boolean g() {
        aefb aefbVar = this.b;
        int iA = aefbVar.a(4);
        return (iA == 0 || aefbVar.b.get(iA + aefbVar.a) == 0) ? false : true;
    }

    public final int hashCode() {
        return this.b.b.hashCode();
    }
}
