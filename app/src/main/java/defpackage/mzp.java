package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mzp extends mix implements ndi {
    private yqt a;
    private final aeel b;

    public mzp(aeel aeelVar) {
        this.b = aeelVar;
    }

    private final void m() {
        if (this.a == null) {
            aeel aeelVar = this.b;
            aeet aeetVar = new aeet();
            int iA = aeelVar.a(8);
            if (iA != 0) {
                int i = iA + aeelVar.a;
                aeetVar.e(i + aeelVar.b.getInt(i), aeelVar.b);
            } else {
                aeetVar = null;
            }
            this.a = aeetVar == null ? ypv.a : yqt.i(new nbo(aeetVar));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aeel aeelVar = this.b;
        aeel aeelVar2 = ((mzp) obj).b;
        if (aeelVar == aeelVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aeelVar.b;
        ByteBuffer byteBuffer2 = aeelVar2.b;
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

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, njo] */
    @Override // defpackage.ndi
    public final /* bridge */ /* synthetic */ njo g() {
        m();
        if (this.a.g()) {
            return this.a.c();
        }
        return null;
    }

    @Override // defpackage.ndi
    public final String h() {
        return this.b.g();
    }

    public final int hashCode() {
        return this.b.b.hashCode();
    }

    @Override // defpackage.ndi
    public final String i() {
        return this.b.h();
    }

    @Override // defpackage.ndi
    public final boolean j() {
        return this.b.g() != null;
    }

    @Override // defpackage.ndi
    public final boolean k() {
        m();
        return this.a.g();
    }

    @Override // defpackage.ndi
    public final boolean l() {
        return this.b.h() != null;
    }
}
