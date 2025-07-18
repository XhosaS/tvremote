package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nco extends mix implements nmx {
    private yqt a;
    private yqt b;
    private final aehc c;

    public nco(aehc aehcVar) {
        this.c = aehcVar;
    }

    private final void m() {
        if (this.a == null) {
            aehc aehcVar = this.c;
            aegp aegpVar = new aegp();
            int iA = aehcVar.a(6);
            if (iA != 0) {
                aegpVar.a(iA + aehcVar.a, aehcVar.b);
            } else {
                aegpVar = null;
            }
            this.a = aegpVar == null ? ypv.a : yqt.i(new ncb(aegpVar));
        }
    }

    private final void n() {
        if (this.b == null) {
            aehc aehcVar = this.c;
            aegw aegwVar = new aegw();
            int iA = aehcVar.a(8);
            if (iA != 0) {
                aegwVar.a(iA + aehcVar.a, aehcVar.b);
            } else {
                aegwVar = null;
            }
            this.b = aegwVar == null ? ypv.a : yqt.i(new nci(aegwVar));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aehc aehcVar = this.c;
        aehc aehcVar2 = ((nco) obj).c;
        if (aehcVar == aehcVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aehcVar.b;
        ByteBuffer byteBuffer2 = aehcVar2.b;
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

    @Override // defpackage.nmx
    public final float g() {
        aehc aehcVar = this.c;
        int iA = aehcVar.a(4);
        if (iA != 0) {
            return aehcVar.b.getFloat(iA + aehcVar.a);
        }
        return 0.0f;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nlp] */
    @Override // defpackage.nmx
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

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nmi] */
    @Override // defpackage.nmx
    public final /* bridge */ /* synthetic */ nmi i() {
        n();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    @Override // defpackage.nmx
    public final boolean j() {
        return aart.q(this.c, 4);
    }

    @Override // defpackage.nmx
    public final boolean k() {
        m();
        return this.a.g();
    }

    @Override // defpackage.nmx
    public final boolean l() {
        n();
        return this.b.g();
    }
}
