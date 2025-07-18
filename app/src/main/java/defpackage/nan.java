package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nan extends mix implements nfy {
    private yqt b;
    private yqt c;
    private final aeev d;

    public nan(aeev aeevVar) {
        this.d = aeevVar;
    }

    private final void l() {
        if (this.c == null) {
            aeev aeevVar = this.d;
            aefs aefsVar = new aefs();
            int iA = aeevVar.a(8);
            if (iA != 0) {
                int i = iA + aeevVar.a;
                aefsVar.e(i + aeevVar.b.getInt(i), aeevVar.b);
            } else {
                aefsVar = null;
            }
            this.c = aefsVar == null ? ypv.a : yqt.i(new nar(aefsVar));
        }
    }

    private final void m() {
        if (this.b == null) {
            aeev aeevVar = this.d;
            aefs aefsVar = new aefs();
            int iA = aeevVar.a(6);
            if (iA != 0) {
                int i = iA + aeevVar.a;
                aefsVar.e(i + aeevVar.b.getInt(i), aeevVar.b);
            } else {
                aefsVar = null;
            }
            this.b = aefsVar == null ? ypv.a : yqt.i(new nar(aefsVar));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aeev aeevVar = this.d;
        aeev aeevVar2 = ((nan) obj).d;
        if (aeevVar == aeevVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aeevVar.b;
        ByteBuffer byteBuffer2 = aeevVar2.b;
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
    @Override // defpackage.nfy
    public final /* bridge */ /* synthetic */ ngp g() {
        l();
        if (this.c.g()) {
            return this.c.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ngp] */
    @Override // defpackage.nfy
    public final /* bridge */ /* synthetic */ ngp h() {
        m();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    public final int hashCode() {
        return this.d.b.hashCode();
    }

    @Override // defpackage.nfy
    public final boolean i() {
        l();
        return this.c.g();
    }

    @Override // defpackage.nfy
    public final boolean j() {
        m();
        return this.b.g();
    }

    @Override // defpackage.nfy
    public final int k() {
        aeev aeevVar = this.d;
        int iA = aeevVar.a(4);
        int iA2 = nfu.a(iA != 0 ? aeevVar.b.getInt(iA + aeevVar.a) : 0);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }
}
