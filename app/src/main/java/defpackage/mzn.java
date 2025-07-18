package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mzn extends mix implements ndb {
    private final aeej a;

    public mzn(aeej aeejVar) {
        this.a = aeejVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aeej aeejVar = this.a;
        aeej aeejVar2 = ((mzn) obj).a;
        if (aeejVar == aeejVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aeejVar.b;
        ByteBuffer byteBuffer2 = aeejVar2.b;
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

    @Override // defpackage.ndb
    public final float g() {
        aeej aeejVar = this.a;
        int iA = aeejVar.a(6);
        if (iA != 0) {
            return aeejVar.b.getFloat(iA + aeejVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.ndb
    public final float h() {
        aeej aeejVar = this.a;
        int iA = aeejVar.a(4);
        if (iA != 0) {
            return aeejVar.b.getFloat(iA + aeejVar.a);
        }
        return 0.0f;
    }

    public final int hashCode() {
        return this.a.b.hashCode();
    }
}
