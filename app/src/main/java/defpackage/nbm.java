package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nbm extends mix implements njj {
    private final aega b;

    public nbm(aega aegaVar) {
        this.b = aegaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aega aegaVar = this.b;
        aega aegaVar2 = ((nbm) obj).b;
        if (aegaVar == aegaVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aegaVar.b;
        ByteBuffer byteBuffer2 = aegaVar2.b;
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

    @Override // defpackage.njj
    public final float g() {
        aega aegaVar = this.b;
        int iA = aegaVar.a(10);
        if (iA != 0) {
            return aegaVar.b.getFloat(iA + aegaVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.njj
    public final float h() {
        aega aegaVar = this.b;
        int iA = aegaVar.a(18);
        if (iA != 0) {
            return aegaVar.b.getFloat(iA + aegaVar.a);
        }
        return 0.0f;
    }

    public final int hashCode() {
        return this.b.b.hashCode();
    }

    @Override // defpackage.njj
    public final float i() {
        aega aegaVar = this.b;
        int iA = aegaVar.a(12);
        if (iA != 0) {
            return aegaVar.b.getFloat(iA + aegaVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.njj
    public final float j() {
        aega aegaVar = this.b;
        int iA = aegaVar.a(14);
        if (iA != 0) {
            return aegaVar.b.getFloat(iA + aegaVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.njj
    public final float k() {
        aega aegaVar = this.b;
        int iA = aegaVar.a(16);
        if (iA != 0) {
            return aegaVar.b.getFloat(iA + aegaVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.njj
    public final int l() {
        return (int) (this.b.a(8) != 0 ? r0.b.getInt(r1 + r0.a) & 4294967295L : 0L);
    }

    @Override // defpackage.njj
    public final int m() {
        return (int) (this.b.a(6) != 0 ? r0.b.getInt(r1 + r0.a) & 4294967295L : 0L);
    }

    @Override // defpackage.njj
    public final int n() {
        return (int) (this.b.a(4) != 0 ? r0.b.getInt(r1 + r0.a) & 4294967295L : 0L);
    }
}
