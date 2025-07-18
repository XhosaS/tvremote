package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nbw extends mix implements nkp {
    private final aegf a;

    public nbw(aegf aegfVar) {
        this.a = aegfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aegf aegfVar = this.a;
        aegf aegfVar2 = ((nbw) obj).a;
        if (aegfVar == aegfVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aegfVar.b;
        ByteBuffer byteBuffer2 = aegfVar2.b;
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

    @Override // defpackage.nkp
    public final float g() {
        aegf aegfVar = this.a;
        int iA = aegfVar.a(4);
        if (iA != 0) {
            return aegfVar.b.getFloat(iA + aegfVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.nkp
    public final int h() {
        aegf aegfVar = this.a;
        int iA = aegfVar.a(6);
        int iA2 = nko.a(iA != 0 ? aegfVar.b.getInt(iA + aegfVar.a) : 0);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }

    public final int hashCode() {
        return this.a.b.hashCode();
    }
}
