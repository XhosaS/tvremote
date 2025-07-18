package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ncp extends mix implements nnb {
    private yqt b;
    private final aehd c;

    public ncp(aehd aehdVar) {
        this.c = aehdVar;
    }

    private final void k() {
        if (this.b == null) {
            aehd aehdVar = this.c;
            aefs aefsVar = new aefs();
            int iA = aehdVar.a(6);
            if (iA != 0) {
                int i = iA + aehdVar.a;
                aefsVar.e(i + aehdVar.b.getInt(i), aehdVar.b);
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
        aehd aehdVar = this.c;
        aehd aehdVar2 = ((ncp) obj).c;
        if (aehdVar == aehdVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aehdVar.b;
        ByteBuffer byteBuffer2 = aehdVar2.b;
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

    @Override // defpackage.nnb
    public final int g() {
        aehd aehdVar = this.c;
        int iA = aehdVar.a(4);
        if (iA != 0) {
            return aehdVar.c(iA);
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ngp] */
    @Override // defpackage.nnb
    public final /* bridge */ /* synthetic */ ngp h() {
        k();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    public final int hashCode() {
        return this.c.b.hashCode();
    }

    @Override // defpackage.nnb
    public final /* bridge */ /* synthetic */ nnc i(int i) {
        aehe aeheVar = new aehe();
        aehd aehdVar = this.c;
        int iA = aehdVar.a(4);
        if (iA != 0) {
            int iB = aehdVar.b(iA) + (i * 4);
            aeheVar.e(iB + aehdVar.b.getInt(iB), aehdVar.b);
        } else {
            aeheVar = null;
        }
        if (aeheVar != null) {
            return new ncq(aeheVar);
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.nnb
    public final boolean j() {
        k();
        return this.b.g();
    }
}
