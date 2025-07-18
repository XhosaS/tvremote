package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mzv extends mix implements ndu {
    private final aefi a;

    public mzv(aefi aefiVar) {
        this.a = aefiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aefi aefiVar = this.a;
        aefi aefiVar2 = ((mzv) obj).a;
        if (aefiVar == aefiVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aefiVar.b;
        ByteBuffer byteBuffer2 = aefiVar2.b;
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

    @Override // defpackage.ndu
    public final int g(int i) {
        return (int) (this.a.a(6) != 0 ? r0.b.getInt(r0.b(r1) + (i * 4)) & 4294967295L : 0L);
    }

    @Override // defpackage.ndu
    public final int h() {
        aefi aefiVar = this.a;
        int iA = aefiVar.a(6);
        if (iA != 0) {
            return aefiVar.c(iA);
        }
        return 0;
    }

    public final int hashCode() {
        return this.a.b.hashCode();
    }

    @Override // defpackage.ndu
    public final int i(int i) {
        return (int) (this.a.a(4) != 0 ? r0.b.getInt(r0.b(r2) + (i * 4)) & 4294967295L : 0L);
    }

    @Override // defpackage.ndu
    public final int j() {
        aefi aefiVar = this.a;
        int iA = aefiVar.a(4);
        if (iA != 0) {
            return aefiVar.c(iA);
        }
        return 0;
    }
}
