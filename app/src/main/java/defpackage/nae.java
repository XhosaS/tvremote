package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nae extends mix implements nez {
    private final aeeo b;

    public nae(aeeo aeeoVar) {
        this.b = aeeoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aeeo aeeoVar = this.b;
        aeeo aeeoVar2 = ((nae) obj).b;
        if (aeeoVar == aeeoVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aeeoVar.b;
        ByteBuffer byteBuffer2 = aeeoVar2.b;
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

    @Override // defpackage.nez
    public final int g() {
        return (int) (this.b.a(6) != 0 ? r0.b.getInt(r1 + r0.a) & 4294967295L : 0L);
    }

    @Override // defpackage.nez
    public final int h() {
        return (int) (this.b.a(4) != 0 ? r0.b.getInt(r1 + r0.a) & 4294967295L : 0L);
    }

    public final int hashCode() {
        return this.b.b.hashCode();
    }
}
