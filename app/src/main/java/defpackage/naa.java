package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class naa extends mix implements neo {
    private yqt a;
    private final aego b;

    public naa(aego aegoVar) {
        this.b = aegoVar;
    }

    private final void l() {
        if (this.a == null) {
            aego aegoVar = this.b;
            aegk aegkVar = new aegk();
            int iA = aegoVar.a(8);
            if (iA != 0) {
                int i = iA + aegoVar.a;
                aegkVar.e(i + aegoVar.b.getInt(i), aegoVar.b);
            } else {
                aegkVar = null;
            }
            this.a = aegkVar == null ? ypv.a : yqt.i(new mzz(aegkVar));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aego aegoVar = this.b;
        aego aegoVar2 = ((naa) obj).b;
        if (aegoVar == aegoVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aegoVar.b;
        ByteBuffer byteBuffer2 = aegoVar2.b;
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

    @Override // defpackage.neo
    public final int g() {
        return (int) (this.b.a(6) != 0 ? r0.b.getInt(r1 + r0.a) & 4294967295L : 0L);
    }

    @Override // defpackage.neo
    public final int h() {
        return (int) (this.b.a(4) != 0 ? r0.b.getInt(r1 + r0.a) & 4294967295L : 0L);
    }

    public final int hashCode() {
        return this.b.b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nel] */
    @Override // defpackage.neo
    public final /* bridge */ /* synthetic */ nel i() {
        l();
        if (this.a.g()) {
            return this.a.c();
        }
        return null;
    }

    @Override // defpackage.neo
    public final boolean j() {
        return aart.q(this.b, 6);
    }

    @Override // defpackage.neo
    public final boolean k() {
        l();
        return this.a.g();
    }
}
