package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nbb extends mix implements nhq {
    private yqt a;
    private final aeff b;

    public nbb(aeff aeffVar) {
        this.b = aeffVar;
    }

    private final void k() {
        if (this.a == null) {
            aeff aeffVar = this.b;
            aefs aefsVar = new aefs();
            int iA = aeffVar.a(6);
            if (iA != 0) {
                int i = iA + aeffVar.a;
                aefsVar.e(i + aeffVar.b.getInt(i), aeffVar.b);
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
        aeff aeffVar = this.b;
        aeff aeffVar2 = ((nbb) obj).b;
        if (aeffVar == aeffVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aeffVar.b;
        ByteBuffer byteBuffer2 = aeffVar2.b;
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
    @Override // defpackage.nhq
    public final /* bridge */ /* synthetic */ ngp g() {
        k();
        if (this.a.g()) {
            return this.a.c();
        }
        return null;
    }

    @Override // defpackage.nhq
    public final boolean h() {
        aeff aeffVar = this.b;
        int iA = aeffVar.a(4);
        return (iA == 0 || aeffVar.b.get(iA + aeffVar.a) == 0) ? false : true;
    }

    public final int hashCode() {
        return this.b.b.hashCode();
    }

    @Override // defpackage.nhq
    public final boolean i() {
        return aart.q(this.b, 4);
    }

    @Override // defpackage.nhq
    public final boolean j() {
        k();
        return this.a.g();
    }
}
