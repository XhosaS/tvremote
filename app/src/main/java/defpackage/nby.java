package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nby extends mix implements nku {
    private final aegg b;

    public nby(aegg aeggVar) {
        this.b = aeggVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aegg aeggVar = this.b;
        aegg aeggVar2 = ((nby) obj).b;
        if (aeggVar == aeggVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aeggVar.b;
        ByteBuffer byteBuffer2 = aeggVar2.b;
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

    @Override // defpackage.nku
    public final int g() {
        aegg aeggVar = this.b;
        int iA = aeggVar.a(4);
        if (iA != 0) {
            return aeggVar.c(iA);
        }
        return 0;
    }

    @Override // defpackage.nku
    public final /* bridge */ /* synthetic */ nkq h(int i) {
        aefs aefsVar = new aefs();
        aegg aeggVar = this.b;
        int iA = aeggVar.a(4);
        if (iA != 0) {
            int iB = aeggVar.b(iA) + (i * 4);
            aefsVar.e(iB + aeggVar.b.getInt(iB), aeggVar.b);
        } else {
            aefsVar = null;
        }
        if (aefsVar != null) {
            return new nbx(aefsVar);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int hashCode() {
        return this.b.b.hashCode();
    }
}
