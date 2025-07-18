package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ncc extends mix implements nlq {
    private yqt a;
    private final aegq b;

    public ncc(aegq aegqVar) {
        this.b = aegqVar;
    }

    private final void j() {
        if (this.a == null) {
            aegq aegqVar = this.b;
            aefs aefsVar = new aefs();
            int iA = aegqVar.a(6);
            if (iA != 0) {
                int i = iA + aegqVar.a;
                aefsVar.e(i + aegqVar.b.getInt(i), aegqVar.b);
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
        aegq aegqVar = this.b;
        aegq aegqVar2 = ((ncc) obj).b;
        if (aegqVar == aegqVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aegqVar.b;
        ByteBuffer byteBuffer2 = aegqVar2.b;
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

    @Override // defpackage.nlq
    public final int g() {
        aegq aegqVar = this.b;
        int iA = aegqVar.a(4);
        if (iA != 0) {
            return aegqVar.b.getInt(iA + aegqVar.a);
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ngp] */
    @Override // defpackage.nlq
    public final /* bridge */ /* synthetic */ ngp h() {
        j();
        if (this.a.g()) {
            return this.a.c();
        }
        return null;
    }

    public final int hashCode() {
        return this.b.b.hashCode();
    }

    @Override // defpackage.nlq
    public final boolean i() {
        j();
        return this.a.g();
    }
}
