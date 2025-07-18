package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nas extends mix implements ngq {
    private final aefx a;

    public nas(aefx aefxVar) {
        this.a = aefxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aefx aefxVar = this.a;
        aefx aefxVar2 = ((nas) obj).a;
        if (aefxVar == aefxVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aefxVar.b;
        ByteBuffer byteBuffer2 = aefxVar2.b;
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

    @Override // defpackage.ngq
    public final String g() {
        return this.a.h();
    }

    @Override // defpackage.ngq
    public final boolean h() {
        return this.a.h() != null;
    }

    public final int hashCode() {
        return this.a.b.hashCode();
    }
}
