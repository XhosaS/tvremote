package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nbf extends mix implements nil {
    private final aefn a;

    public nbf(aefn aefnVar) {
        this.a = aefnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aefn aefnVar = this.a;
        aefn aefnVar2 = ((nbf) obj).a;
        if (aefnVar == aefnVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aefnVar.b;
        ByteBuffer byteBuffer2 = aefnVar2.b;
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

    @Override // defpackage.nil
    public final int g() {
        aefn aefnVar = this.a;
        int iA = aefnVar.a(4);
        if (iA != 0) {
            return aefnVar.c(iA);
        }
        return 0;
    }

    @Override // defpackage.nil
    public final int h(int i) {
        aefn aefnVar = this.a;
        int iA = aefnVar.a(4);
        int iA2 = nif.a(iA != 0 ? aefnVar.b.getInt(aefnVar.b(iA) + (i * 4)) : 0);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }

    public final int hashCode() {
        return this.a.b.hashCode();
    }
}
