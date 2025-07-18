package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nbk extends mix implements njb {
    private final aefv b;

    public nbk(aefv aefvVar) {
        this.b = aefvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aefv aefvVar = this.b;
        aefv aefvVar2 = ((nbk) obj).b;
        if (aefvVar == aefvVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aefvVar.b;
        ByteBuffer byteBuffer2 = aefvVar2.b;
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

    @Override // defpackage.njb
    public final float g() {
        aefv aefvVar = this.b;
        int iA = aefvVar.a(4);
        if (iA != 0) {
            return aefvVar.b.getFloat(iA + aefvVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.njb
    public final float h() {
        aefv aefvVar = this.b;
        int iA = aefvVar.a(6);
        if (iA != 0) {
            return aefvVar.b.getFloat(iA + aefvVar.a);
        }
        return 0.0f;
    }

    public final int hashCode() {
        return this.b.b.hashCode();
    }
}
