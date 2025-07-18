package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nbu extends mix implements nki {
    private yqt b;
    private yqt c;
    private yqt d;
    private final aeey e;

    public nbu(aeey aeeyVar) {
        this.e = aeeyVar;
    }

    private final void m() {
        if (this.c == null) {
            aeey aeeyVar = this.e;
            aefs aefsVar = new aefs();
            int iA = aeeyVar.a(6);
            if (iA != 0) {
                int i = iA + aeeyVar.a;
                aefsVar.e(i + aeeyVar.b.getInt(i), aeeyVar.b);
            } else {
                aefsVar = null;
            }
            this.c = aefsVar == null ? ypv.a : yqt.i(new nar(aefsVar));
        }
    }

    private final void n() {
        if (this.b == null) {
            aeey aeeyVar = this.e;
            aegf aegfVar = new aegf();
            int iA = aeeyVar.a(4);
            if (iA != 0) {
                int i = iA + aeeyVar.a;
                aegfVar.e(i + aeeyVar.b.getInt(i), aeeyVar.b);
            } else {
                aegfVar = null;
            }
            this.b = aegfVar == null ? ypv.a : yqt.i(new nbw(aegfVar));
        }
    }

    private final void o() {
        if (this.d == null) {
            aeey aeeyVar = this.e;
            aefs aefsVar = new aefs();
            int iA = aeeyVar.a(8);
            if (iA != 0) {
                int i = iA + aeeyVar.a;
                aefsVar.e(i + aeeyVar.b.getInt(i), aeeyVar.b);
            } else {
                aefsVar = null;
            }
            this.d = aefsVar == null ? ypv.a : yqt.i(new nar(aefsVar));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aeey aeeyVar = this.e;
        aeey aeeyVar2 = ((nbu) obj).e;
        if (aeeyVar == aeeyVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aeeyVar.b;
        ByteBuffer byteBuffer2 = aeeyVar2.b;
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

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ngp] */
    @Override // defpackage.nki
    public final /* bridge */ /* synthetic */ ngp g() {
        m();
        if (this.c.g()) {
            return this.c.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ngp] */
    @Override // defpackage.nki
    public final /* bridge */ /* synthetic */ ngp h() {
        o();
        if (this.d.g()) {
            return this.d.c();
        }
        return null;
    }

    public final int hashCode() {
        return this.e.b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nkp] */
    @Override // defpackage.nki
    public final /* bridge */ /* synthetic */ nkp i() {
        n();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    @Override // defpackage.nki
    public final boolean j() {
        m();
        return this.c.g();
    }

    @Override // defpackage.nki
    public final boolean k() {
        n();
        return this.b.g();
    }

    @Override // defpackage.nki
    public final boolean l() {
        o();
        return this.d.g();
    }
}
