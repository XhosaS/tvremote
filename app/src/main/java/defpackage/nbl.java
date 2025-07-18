package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nbl extends mix implements njf {
    private final aefz b;

    public nbl(aefz aefzVar) {
        this.b = aefzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aefz aefzVar = this.b;
        aefz aefzVar2 = ((nbl) obj).b;
        if (aefzVar == aefzVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aefzVar.b;
        ByteBuffer byteBuffer2 = aefzVar2.b;
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

    @Override // defpackage.njf
    public final int g() {
        aefz aefzVar = this.b;
        int iA = aefzVar.a(4);
        if (iA != 0) {
            return aefzVar.b.getInt(iA + aefzVar.a);
        }
        return 0;
    }

    public final int hashCode() {
        return this.b.b.hashCode();
    }
}
