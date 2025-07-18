package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class naq extends mix implements ngi {
    private final aeex a;

    public naq(aeex aeexVar) {
        this.a = aeexVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aeex aeexVar = this.a;
        aeex aeexVar2 = ((naq) obj).a;
        if (aeexVar == aeexVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aeexVar.b;
        ByteBuffer byteBuffer2 = aeexVar2.b;
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

    @Override // defpackage.ngi
    public final int g() {
        aeex aeexVar = this.a;
        int iA = aeexVar.a(4);
        if (iA != 0) {
            return aeexVar.c(iA);
        }
        return 0;
    }

    @Override // defpackage.ngi
    public final /* bridge */ /* synthetic */ nid h(int i) {
        aefm aefmVar = new aefm();
        aeex aeexVar = this.a;
        int iA = aeexVar.a(4);
        if (iA != 0) {
            int iB = aeexVar.b(iA) + (i * 4);
            aefmVar.e(iB + aeexVar.b.getInt(iB), aeexVar.b);
        } else {
            aefmVar = null;
        }
        if (aefmVar != null) {
            return new nbd(aefmVar);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int hashCode() {
        return this.a.b.hashCode();
    }
}
