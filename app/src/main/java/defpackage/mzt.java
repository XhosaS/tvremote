package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mzt extends mix implements nds {
    private yqt a;
    private final aefc b;

    public mzt(aefc aefcVar) {
        this.b = aefcVar;
    }

    private final void i() {
        if (this.a == null) {
            aefc aefcVar = this.b;
            aefs aefsVar = new aefs();
            int iA = aefcVar.a(4);
            if (iA != 0) {
                int i = iA + aefcVar.a;
                aefsVar.e(i + aefcVar.b.getInt(i), aefcVar.b);
            } else {
                aefsVar = null;
            }
            this.a = aefsVar == null ? ypv.a : yqt.i(new nad(aefsVar));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aefc aefcVar = this.b;
        aefc aefcVar2 = ((mzt) obj).b;
        if (aefcVar == aefcVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aefcVar.b;
        ByteBuffer byteBuffer2 = aefcVar2.b;
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

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, net] */
    @Override // defpackage.nds
    public final /* bridge */ /* synthetic */ net g() {
        i();
        if (this.a.g()) {
            return this.a.c();
        }
        return null;
    }

    @Override // defpackage.nds
    public final boolean h() {
        i();
        return this.a.g();
    }

    public final int hashCode() {
        return this.b.b.hashCode();
    }
}
