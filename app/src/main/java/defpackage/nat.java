package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nat extends mix implements ngr {
    private yqt a;
    private final aefy b;

    public nat(aefy aefyVar) {
        this.b = aefyVar;
    }

    private final void i() {
        if (this.a == null) {
            aefy aefyVar = this.b;
            aefx aefxVar = new aefx();
            int iA = aefyVar.a(4);
            if (iA != 0) {
                int i = iA + aefyVar.a;
                aefxVar.e(i + aefyVar.b.getInt(i), aefyVar.b);
            } else {
                aefxVar = null;
            }
            this.a = aefxVar == null ? ypv.a : yqt.i(new nas(aefxVar));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aefy aefyVar = this.b;
        aefy aefyVar2 = ((nat) obj).b;
        if (aefyVar == aefyVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aefyVar.b;
        ByteBuffer byteBuffer2 = aefyVar2.b;
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

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ngq] */
    @Override // defpackage.ngr
    public final /* bridge */ /* synthetic */ ngq g() {
        i();
        if (this.a.g()) {
            return this.a.c();
        }
        return null;
    }

    @Override // defpackage.ngr
    public final boolean h() {
        i();
        return this.a.g();
    }

    public final int hashCode() {
        return this.b.b.hashCode();
    }
}
