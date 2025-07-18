package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ncg extends mix implements nlx {
    private final aegm a;

    public ncg(aegm aegmVar) {
        this.a = aegmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aegm aegmVar = this.a;
        aegm aegmVar2 = ((ncg) obj).a;
        if (aegmVar == aegmVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aegmVar.b;
        ByteBuffer byteBuffer2 = aegmVar2.b;
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

    @Override // defpackage.nlx
    public final long g() {
        aegm aegmVar = this.a;
        int iA = aegmVar.a(6);
        if (iA != 0) {
            return aegmVar.b.getLong(iA + aegmVar.a);
        }
        return 0L;
    }

    @Override // defpackage.nlx
    public final int h() {
        aegm aegmVar = this.a;
        int iA = aegmVar.a(4);
        int iA2 = nlz.a(iA != 0 ? aegmVar.b.getInt(iA + aegmVar.a) : 0);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }

    public final int hashCode() {
        return this.a.b.hashCode();
    }
}
