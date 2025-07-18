package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ncf extends mix implements nlu {
    private yqt a;
    private final aegl b;

    public ncf(aegl aeglVar) {
        this.b = aeglVar;
    }

    private final void n() {
        if (this.a == null) {
            aegl aeglVar = this.b;
            aegm aegmVar = new aegm();
            int iA = aeglVar.a(10);
            if (iA != 0) {
                int i = iA + aeglVar.a;
                aegmVar.e(i + aeglVar.b.getInt(i), aeglVar.b);
            } else {
                aegmVar = null;
            }
            this.a = aegmVar == null ? ypv.a : yqt.i(new ncg(aegmVar));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aegl aeglVar = this.b;
        aegl aeglVar2 = ((ncf) obj).b;
        if (aeglVar == aeglVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aeglVar.b;
        ByteBuffer byteBuffer2 = aeglVar2.b;
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

    @Override // defpackage.nlu
    public final float g() {
        aegl aeglVar = this.b;
        int iA = aeglVar.a(4);
        if (iA != 0) {
            return aeglVar.b.getFloat(iA + aeglVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.nlu
    public final float h() {
        aegl aeglVar = this.b;
        int iA = aeglVar.a(14);
        if (iA != 0) {
            return aeglVar.b.getFloat(iA + aeglVar.a);
        }
        return 0.0f;
    }

    public final int hashCode() {
        return this.b.b.hashCode();
    }

    @Override // defpackage.nlu
    public final int i() {
        aegl aeglVar = this.b;
        int iA = aeglVar.a(6);
        if (iA != 0) {
            return aeglVar.b.getInt(iA + aeglVar.a);
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nlx] */
    @Override // defpackage.nlu
    public final /* bridge */ /* synthetic */ nlx j() {
        n();
        if (this.a.g()) {
            return this.a.c();
        }
        return null;
    }

    @Override // defpackage.nlu
    public final boolean k() {
        aegl aeglVar = this.b;
        int iA = aeglVar.a(12);
        return (iA == 0 || aeglVar.b.get(iA + aeglVar.a) == 0) ? false : true;
    }

    @Override // defpackage.nlu
    public final boolean l() {
        n();
        return this.a.g();
    }

    @Override // defpackage.nlu
    public final int m() {
        aegl aeglVar = this.b;
        int iA = aeglVar.a(8);
        int iA2 = nlw.a(iA != 0 ? aeglVar.b.getInt(iA + aeglVar.a) : 0);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }
}
