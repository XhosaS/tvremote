package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mzq extends mix implements ndn {
    private yqt a;
    private final aeem b;

    public mzq(aeem aeemVar) {
        this.b = aeemVar;
    }

    private final void m() {
        if (this.a == null) {
            aeem aeemVar = this.b;
            aefm aefmVar = new aefm();
            int iA = aeemVar.a(8);
            if (iA != 0) {
                int i = iA + aeemVar.a;
                aefmVar.e(i + aeemVar.b.getInt(i), aeemVar.b);
            } else {
                aefmVar = null;
            }
            this.a = aefmVar == null ? ypv.a : yqt.i(new nbd(aefmVar));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aeem aeemVar = this.b;
        aeem aeemVar2 = ((mzq) obj).b;
        if (aeemVar == aeemVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aeemVar.b;
        ByteBuffer byteBuffer2 = aeemVar2.b;
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

    @Override // defpackage.ndn
    public final int g() {
        return (int) (this.b.a(6) != 0 ? r0.b.getInt(r1 + r0.a) & 4294967295L : 0L);
    }

    @Override // defpackage.ndn
    public final int h() {
        return (int) (this.b.a(4) != 0 ? r0.b.getInt(r1 + r0.a) & 4294967295L : 0L);
    }

    public final int hashCode() {
        return this.b.b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nid] */
    @Override // defpackage.ndn
    public final /* bridge */ /* synthetic */ nid i() {
        m();
        if (this.a.g()) {
            return this.a.c();
        }
        return null;
    }

    @Override // defpackage.ndn
    public final boolean j() {
        aeem aeemVar = this.b;
        int iA = aeemVar.a(12);
        return (iA == 0 || aeemVar.b.get(iA + aeemVar.a) == 0) ? false : true;
    }

    @Override // defpackage.ndn
    public final boolean k() {
        m();
        return this.a.g();
    }

    @Override // defpackage.ndn
    public final int l() {
        aeem aeemVar = this.b;
        int iA = aeemVar.a(10);
        int iA2 = ndm.a(iA != 0 ? aeemVar.b.getInt(iA + aeemVar.a) : 0);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }
}
