package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nbe extends mix implements nik {
    private yqt b;
    private final aefo c;

    public nbe(aefo aefoVar) {
        this.c = aefoVar;
    }

    private final void i() {
        if (this.b == null) {
            aefo aefoVar = this.c;
            aefn aefnVar = new aefn();
            int iA = aefoVar.a(8);
            if (iA != 0) {
                int i = iA + aefoVar.a;
                aefnVar.e(i + aefoVar.b.getInt(i), aefoVar.b);
            } else {
                aefnVar = null;
            }
            this.b = aefnVar == null ? ypv.a : yqt.i(new nbf(aefnVar));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aefo aefoVar = this.c;
        aefo aefoVar2 = ((nbe) obj).c;
        if (aefoVar == aefoVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aefoVar.b;
        ByteBuffer byteBuffer2 = aefoVar2.b;
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

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nil] */
    @Override // defpackage.nik
    public final /* bridge */ /* synthetic */ nil g() {
        i();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    @Override // defpackage.nik
    public final boolean h() {
        i();
        return this.b.g();
    }

    public final int hashCode() {
        return this.c.b.hashCode();
    }
}
