package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nai extends mix implements nfi {
    private yqt a;
    private final aegj b;

    public nai(aegj aegjVar) {
        this.b = aegjVar;
    }

    private final void n() {
        if (this.a == null) {
            aegj aegjVar = this.b;
            aegi aegiVar = new aegi();
            int iA = aegjVar.a(10);
            if (iA != 0) {
                int i = iA + aegjVar.a;
                aegiVar.e(i + aegjVar.b.getInt(i), aegjVar.b);
            } else {
                aegiVar = null;
            }
            this.a = aegiVar == null ? ypv.a : yqt.i(new nah(aegiVar));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aegj aegjVar = this.b;
        aegj aegjVar2 = ((nai) obj).b;
        if (aegjVar == aegjVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aegjVar.b;
        ByteBuffer byteBuffer2 = aegjVar2.b;
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

    @Override // defpackage.nfi
    public final float g() {
        aegj aegjVar = this.b;
        int iA = aegjVar.a(8);
        if (iA != 0) {
            return aegjVar.b.getFloat(iA + aegjVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.nfi
    public final float h(int i) {
        aegj aegjVar = this.b;
        int iA = aegjVar.a(6);
        if (iA != 0) {
            return aegjVar.b.getFloat(aegjVar.b(iA) + (i * 4));
        }
        return 0.0f;
    }

    public final int hashCode() {
        return this.b.b.hashCode();
    }

    @Override // defpackage.nfi
    public final int i(int i) {
        return (int) (this.b.a(4) != 0 ? r0.b.getInt(r0.b(r2) + (i * 4)) & 4294967295L : 0L);
    }

    @Override // defpackage.nfi
    public final int j() {
        aegj aegjVar = this.b;
        int iA = aegjVar.a(4);
        if (iA != 0) {
            return aegjVar.c(iA);
        }
        return 0;
    }

    @Override // defpackage.nfi
    public final int k() {
        aegj aegjVar = this.b;
        int iA = aegjVar.a(6);
        if (iA != 0) {
            return aegjVar.c(iA);
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nfh] */
    @Override // defpackage.nfi
    public final /* bridge */ /* synthetic */ nfh l() {
        n();
        if (this.a.g()) {
            return this.a.c();
        }
        return null;
    }

    @Override // defpackage.nfi
    public final boolean m() {
        n();
        return this.a.g();
    }
}
