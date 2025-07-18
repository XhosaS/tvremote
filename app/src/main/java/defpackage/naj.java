package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class naj extends mix implements nfj {
    private final aeha a;

    public naj(aeha aehaVar) {
        this.a = aehaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aeha aehaVar = this.a;
        aeha aehaVar2 = ((naj) obj).a;
        if (aehaVar == aehaVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aehaVar.b;
        ByteBuffer byteBuffer2 = aehaVar2.b;
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

    @Override // defpackage.nfj
    public final int g() {
        return (int) (this.a.a(4) != 0 ? r0.b.getInt(r1 + r0.a) & 4294967295L : 0L);
    }

    @Override // defpackage.nfj
    public final int h() {
        aeha aehaVar = this.a;
        int iA = aehaVar.a(6);
        int iA2 = nfb.a(iA != 0 ? aehaVar.b.getInt(iA + aehaVar.a) : 0);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }

    public final int hashCode() {
        return this.a.b.hashCode();
    }
}
