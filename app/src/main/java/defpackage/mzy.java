package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mzy extends mix implements ndx {
    private final aefw a;

    public mzy(aefw aefwVar) {
        this.a = aefwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aefw aefwVar = this.a;
        aefw aefwVar2 = ((mzy) obj).a;
        if (aefwVar == aefwVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aefwVar.b;
        ByteBuffer byteBuffer2 = aefwVar2.b;
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

    @Override // defpackage.ndx
    public final float g() {
        aefw aefwVar = this.a;
        int iA = aefwVar.a(4);
        if (iA != 0) {
            return aefwVar.b.getFloat(iA + aefwVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.ndx
    public final int h() {
        aefw aefwVar = this.a;
        int iA = aefwVar.a(6);
        int iA2 = ndz.a(iA != 0 ? aefwVar.b.getInt(iA + aefwVar.a) : 0);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }

    public final int hashCode() {
        return this.a.b.hashCode();
    }
}
