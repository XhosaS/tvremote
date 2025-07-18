package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class naf extends mix implements nfc {
    private final aeep a;

    public naf(aeep aeepVar) {
        this.a = aeepVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aeep aeepVar = this.a;
        aeep aeepVar2 = ((naf) obj).a;
        if (aeepVar == aeepVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aeepVar.b;
        ByteBuffer byteBuffer2 = aeepVar2.b;
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

    @Override // defpackage.nfc
    public final float g() {
        aeep aeepVar = this.a;
        int iA = aeepVar.a(4);
        if (iA != 0) {
            return aeepVar.b.getFloat(iA + aeepVar.a);
        }
        return 0.0f;
    }

    public final int hashCode() {
        return this.a.b.hashCode();
    }
}
