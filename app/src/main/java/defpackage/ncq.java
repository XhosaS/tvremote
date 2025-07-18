package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ncq extends mix implements nnc {
    private yqt a;
    private yqt b;
    private yqt c;
    private final aehe d;

    public ncq(aehe aeheVar) {
        this.d = aeheVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aehe aeheVar = this.d;
        aehe aeheVar2 = ((ncq) obj).d;
        if (aeheVar == aeheVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aeheVar.b;
        ByteBuffer byteBuffer2 = aeheVar2.b;
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

    @Override // defpackage.nnc
    public final float g() {
        aehe aeheVar = this.d;
        int iA = aeheVar.a(18);
        if (iA != 0) {
            return aeheVar.b.getFloat(iA + aeheVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.nnc
    public final float h() {
        aehe aeheVar = this.d;
        int iA = aeheVar.a(12);
        if (iA != 0) {
            return aeheVar.b.getFloat(iA + aeheVar.a);
        }
        return 0.0f;
    }

    public final int hashCode() {
        return this.d.b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nmu] */
    @Override // defpackage.nnc
    public final /* bridge */ /* synthetic */ nmu i() {
        if (this.a == null) {
            aehe aeheVar = this.d;
            aehb aehbVar = new aehb();
            int iA = aeheVar.a(6);
            if (iA != 0) {
                int i = iA + aeheVar.a;
                aehbVar.e(i + aeheVar.b.getInt(i), aeheVar.b);
            } else {
                aehbVar = null;
            }
            this.a = aehbVar == null ? ypv.a : yqt.i(new ncn(aehbVar));
        }
        if (this.a.g()) {
            return this.a.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nmx] */
    @Override // defpackage.nnc
    public final /* bridge */ /* synthetic */ nmx j() {
        if (this.c == null) {
            aehe aeheVar = this.d;
            aehc aehcVar = new aehc();
            int iA = aeheVar.a(16);
            if (iA != 0) {
                int i = iA + aeheVar.a;
                aehcVar.e(i + aeheVar.b.getInt(i), aeheVar.b);
            } else {
                aehcVar = null;
            }
            this.c = aehcVar == null ? ypv.a : yqt.i(new nco(aehcVar));
        }
        if (this.c.g()) {
            return this.c.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nmx] */
    @Override // defpackage.nnc
    public final /* bridge */ /* synthetic */ nmx k() {
        if (this.b == null) {
            aehe aeheVar = this.d;
            aehc aehcVar = new aehc();
            int iA = aeheVar.a(10);
            if (iA != 0) {
                int i = iA + aeheVar.a;
                aehcVar.e(i + aeheVar.b.getInt(i), aeheVar.b);
            } else {
                aehcVar = null;
            }
            this.b = aehcVar == null ? ypv.a : yqt.i(new nco(aehcVar));
        }
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    @Override // defpackage.nnc
    public final nne l() {
        aehe aeheVar = this.d;
        int iA = aeheVar.a(4);
        nne nneVarA = nne.a(iA != 0 ? aeheVar.b.getInt(iA + aeheVar.a) : 0);
        return nneVarA == null ? nne.TRANSITION_VALUE_TYPE_NONE : nneVarA;
    }

    @Override // defpackage.nnc
    public final boolean m() {
        aehe aeheVar = this.d;
        int iA = aeheVar.a(14);
        return (iA == 0 || aeheVar.b.get(iA + aeheVar.a) == 0) ? false : true;
    }

    @Override // defpackage.nnc
    public final boolean n() {
        aehe aeheVar = this.d;
        int iA = aeheVar.a(8);
        return (iA == 0 || aeheVar.b.get(iA + aeheVar.a) == 0) ? false : true;
    }
}
