package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nah extends mix implements nfh {
    private yqt a;
    private yqt b;
    private final aegi c;

    public nah(aegi aegiVar) {
        this.c = aegiVar;
    }

    private final void l() {
        if (this.b == null) {
            aegi aegiVar = this.c;
            aegp aegpVar = new aegp();
            int iA = aegiVar.a(6);
            if (iA != 0) {
                aegpVar.a(iA + aegiVar.a, aegiVar.b);
            } else {
                aegpVar = null;
            }
            this.b = aegpVar == null ? ypv.a : yqt.i(new ncb(aegpVar));
        }
    }

    private final void m() {
        if (this.a == null) {
            aegi aegiVar = this.c;
            aegp aegpVar = new aegp();
            int iA = aegiVar.a(4);
            if (iA != 0) {
                aegpVar.a(iA + aegiVar.a, aegiVar.b);
            } else {
                aegpVar = null;
            }
            this.a = aegpVar == null ? ypv.a : yqt.i(new ncb(aegpVar));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aegi aegiVar = this.c;
        aegi aegiVar2 = ((nah) obj).c;
        if (aegiVar == aegiVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aegiVar.b;
        ByteBuffer byteBuffer2 = aegiVar2.b;
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

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nlp] */
    @Override // defpackage.nfh
    public final /* bridge */ /* synthetic */ nlp g() {
        l();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nlp] */
    @Override // defpackage.nfh
    public final /* bridge */ /* synthetic */ nlp h() {
        m();
        if (this.a.g()) {
            return this.a.c();
        }
        return null;
    }

    public final int hashCode() {
        return this.c.b.hashCode();
    }

    @Override // defpackage.nfh
    public final boolean i() {
        l();
        return this.b.g();
    }

    @Override // defpackage.nfh
    public final boolean j() {
        m();
        return this.a.g();
    }

    @Override // defpackage.nfh
    public final int k() {
        aegi aegiVar = this.c;
        int iA = aegiVar.a(8);
        int iA2 = nhp.a(iA != 0 ? aegiVar.b.getInt(iA + aegiVar.a) : 0);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }
}
