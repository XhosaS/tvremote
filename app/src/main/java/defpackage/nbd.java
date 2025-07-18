package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nbd extends mix implements nid {
    public final aefm a;
    private yqt b;
    private yqt c;

    public nbd(aefm aefmVar) {
        this.a = aefmVar;
    }

    private final void o() {
        if (this.c == null) {
            aeft aeftVarL = this.a.l();
            this.c = aeftVarL == null ? ypv.a : yqt.i(new ncd(aeftVarL));
        }
    }

    private final void p() {
        if (this.b == null) {
            aefs aefsVarK = this.a.k();
            this.b = aefsVarK == null ? ypv.a : yqt.i(new ncr(aefsVarK));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aefm aefmVar = this.a;
        aefm aefmVar2 = ((nbd) obj).a;
        if (aefmVar == aefmVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aefmVar.b;
        ByteBuffer byteBuffer2 = aefmVar2.b;
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

    @Override // defpackage.nid
    public final int g() {
        return this.a.g();
    }

    @Override // defpackage.nid
    public final /* bridge */ /* synthetic */ nid h(int i) {
        aefm aefmVarI = this.a.i(i);
        if (aefmVarI != null) {
            return new nbd(aefmVarI);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int hashCode() {
        return this.a.b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nlr] */
    @Override // defpackage.nid
    public final /* bridge */ /* synthetic */ nlr i() {
        o();
        if (this.c.g()) {
            return this.c.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nnf] */
    @Override // defpackage.nid
    public final /* bridge */ /* synthetic */ nnf j() {
        p();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    @Override // defpackage.nid
    public final String k() {
        return this.a.m();
    }

    @Override // defpackage.nid
    public final boolean l() {
        return this.a.m() != null;
    }

    @Override // defpackage.nid
    public final boolean m() {
        o();
        return this.c.g();
    }

    @Override // defpackage.nid
    public final boolean n() {
        p();
        return this.b.g();
    }
}
