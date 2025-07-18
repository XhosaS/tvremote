package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nav extends mix implements ngy {
    private yqt a;
    private yqt b;
    private final aegn c;

    public nav(aegn aegnVar) {
        this.c = aegnVar;
    }

    private final void l() {
        if (this.a == null) {
            aegn aegnVar = this.c;
            aefs aefsVar = new aefs();
            int iA = aegnVar.a(4);
            if (iA != 0) {
                int i = iA + aegnVar.a;
                aefsVar.e(i + aegnVar.b.getInt(i), aegnVar.b);
            } else {
                aefsVar = null;
            }
            this.a = aefsVar == null ? ypv.a : yqt.i(new nar(aefsVar));
        }
    }

    private final void m() {
        if (this.b == null) {
            aegn aegnVar = this.c;
            aefs aefsVar = new aefs();
            int iA = aegnVar.a(6);
            if (iA != 0) {
                int i = iA + aegnVar.a;
                aefsVar.e(i + aegnVar.b.getInt(i), aegnVar.b);
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
        aegn aegnVar = this.c;
        aegn aegnVar2 = ((nav) obj).c;
        if (aegnVar == aegnVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aegnVar.b;
        ByteBuffer byteBuffer2 = aegnVar2.b;
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
    @Override // defpackage.ngy
    public final /* bridge */ /* synthetic */ ngp g() {
        l();
        if (this.a.g()) {
            return this.a.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ngp] */
    @Override // defpackage.ngy
    public final /* bridge */ /* synthetic */ ngp h() {
        m();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    public final int hashCode() {
        return this.c.b.hashCode();
    }

    @Override // defpackage.ngy
    public final boolean i() {
        l();
        return this.a.g();
    }

    @Override // defpackage.ngy
    public final boolean j() {
        m();
        return this.b.g();
    }

    @Override // defpackage.ngy
    public final int k() {
        aegn aegnVar = this.c;
        int iA = aegnVar.a(8);
        int iA2 = ngx.a(iA != 0 ? aegnVar.b.getShort(iA + aegnVar.a) : (short) 0);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }
}
