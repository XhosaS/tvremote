package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mzu extends mix implements ndt {
    private yqt a;
    private yqt b;
    private yqt c;
    private final aefh d;

    public mzu(aefh aefhVar) {
        this.d = aefhVar;
    }

    private final void m() {
        if (this.c == null) {
            aefh aefhVar = this.d;
            aefi aefiVar = new aefi();
            int iA = aefhVar.a(8);
            if (iA != 0) {
                int i = iA + aefhVar.a;
                aefiVar.e(i + aefhVar.b.getInt(i), aefhVar.b);
            } else {
                aefiVar = null;
            }
            this.c = aefiVar == null ? ypv.a : yqt.i(new mzv(aefiVar));
        }
    }

    private final void n() {
        if (this.a == null) {
            aefh aefhVar = this.d;
            aefj aefjVar = new aefj();
            int iA = aefhVar.a(4);
            if (iA != 0) {
                int i = iA + aefhVar.a;
                aefjVar.e(i + aefhVar.b.getInt(i), aefhVar.b);
            } else {
                aefjVar = null;
            }
            this.a = aefjVar == null ? ypv.a : yqt.i(new mzw(aefjVar));
        }
    }

    private final void o() {
        if (this.b == null) {
            aefh aefhVar = this.d;
            aefk aefkVar = new aefk();
            int iA = aefhVar.a(6);
            if (iA != 0) {
                int i = iA + aefhVar.a;
                aefkVar.e(i + aefhVar.b.getInt(i), aefhVar.b);
            } else {
                aefkVar = null;
            }
            this.b = aefkVar == null ? ypv.a : yqt.i(new mzx(aefkVar));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aefh aefhVar = this.d;
        aefh aefhVar2 = ((mzu) obj).d;
        if (aefhVar == aefhVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aefhVar.b;
        ByteBuffer byteBuffer2 = aefhVar2.b;
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

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ndu] */
    @Override // defpackage.ndt
    public final /* bridge */ /* synthetic */ ndu g() {
        m();
        if (this.c.g()) {
            return this.c.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ndv] */
    @Override // defpackage.ndt
    public final /* bridge */ /* synthetic */ ndv h() {
        n();
        if (this.a.g()) {
            return this.a.c();
        }
        return null;
    }

    public final int hashCode() {
        return this.d.b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ndw] */
    @Override // defpackage.ndt
    public final /* bridge */ /* synthetic */ ndw i() {
        o();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    @Override // defpackage.ndt
    public final boolean j() {
        m();
        return this.c.g();
    }

    @Override // defpackage.ndt
    public final boolean k() {
        n();
        return this.a.g();
    }

    @Override // defpackage.ndt
    public final boolean l() {
        o();
        return this.b.g();
    }
}
