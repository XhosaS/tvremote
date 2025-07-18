package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nce extends mix implements nls {
    private yqt a;
    private final aegt b;

    public nce(aegt aegtVar) {
        this.b = aegtVar;
    }

    private final void j() {
        if (this.a == null) {
            aegt aegtVar = this.b;
            aefs aefsVar = new aefs();
            int iA = aegtVar.a(6);
            if (iA != 0) {
                int i = iA + aegtVar.a;
                aefsVar.e(i + aegtVar.b.getInt(i), aegtVar.b);
            } else {
                aefsVar = null;
            }
            this.a = aefsVar == null ? ypv.a : yqt.i(new nar(aefsVar));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aegt aegtVar = this.b;
        aegt aegtVar2 = ((nce) obj).b;
        if (aegtVar == aegtVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aegtVar.b;
        ByteBuffer byteBuffer2 = aegtVar2.b;
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
    @Override // defpackage.nls
    public final /* bridge */ /* synthetic */ ngp g() {
        j();
        if (this.a.g()) {
            return this.a.c();
        }
        return null;
    }

    @Override // defpackage.nls
    public final boolean h() {
        aegt aegtVar = this.b;
        int iA = aegtVar.a(4);
        return (iA == 0 || aegtVar.b.get(iA + aegtVar.a) == 0) ? false : true;
    }

    public final int hashCode() {
        return this.b.b.hashCode();
    }

    @Override // defpackage.nls
    public final boolean i() {
        j();
        return this.a.g();
    }
}
