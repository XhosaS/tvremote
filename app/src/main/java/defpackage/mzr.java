package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mzr extends mix implements ndo {
    private yqt a;
    private final aeen b;

    public mzr(aeen aeenVar) {
        this.b = aeenVar;
    }

    private final void G() {
        if (this.a == null) {
            aeen aeenVar = this.b;
            aefw aefwVar = new aefw();
            int iA = aeenVar.a(28);
            if (iA != 0) {
                int i = iA + aeenVar.a;
                aefwVar.e(i + aeenVar.b.getInt(i), aeenVar.b);
            } else {
                aefwVar = null;
            }
            this.a = aefwVar == null ? ypv.a : yqt.i(new mzy(aefwVar));
        }
    }

    @Override // defpackage.ndo
    public final boolean A() {
        return aart.q(this.b, 34);
    }

    @Override // defpackage.ndo
    public final boolean B() {
        return aart.q(this.b, 24);
    }

    @Override // defpackage.ndo
    public final int C() {
        aeen aeenVar = this.b;
        int iA = aeenVar.a(10);
        int iA2 = neg.a(iA != 0 ? aeenVar.b.getInt(iA + aeenVar.a) : 0);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }

    @Override // defpackage.ndo
    public final int D() {
        aeen aeenVar = this.b;
        int iA = aeenVar.a(34);
        int iA2 = nen.a(iA != 0 ? aeenVar.b.getInt(iA + aeenVar.a) : 0);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }

    @Override // defpackage.ndo
    public final int E() {
        aeen aeenVar = this.b;
        int iA = aeenVar.a(8);
        int iA2 = nes.a(iA != 0 ? aeenVar.b.getInt(iA + aeenVar.a) : 0);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }

    @Override // defpackage.ndo
    public final int F() {
        aeen aeenVar = this.b;
        int iA = aeenVar.a(24);
        int iA2 = nev.a(iA != 0 ? aeenVar.b.getInt(iA + aeenVar.a) : 0);
        if (iA2 == 0) {
            return 1;
        }
        return iA2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aeen aeenVar = this.b;
        aeen aeenVar2 = ((mzr) obj).b;
        if (aeenVar == aeenVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aeenVar.b;
        ByteBuffer byteBuffer2 = aeenVar2.b;
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

    @Override // defpackage.ndo
    public final float g() {
        aeen aeenVar = this.b;
        int iA = aeenVar.a(6);
        if (iA != 0) {
            return aeenVar.b.getFloat(iA + aeenVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.ndo
    public final int h() {
        aeen aeenVar = this.b;
        int iA = aeenVar.a(20);
        if (iA != 0) {
            return aeenVar.c(iA);
        }
        return 0;
    }

    public final int hashCode() {
        return this.b.b.hashCode();
    }

    @Override // defpackage.ndo
    public final int i() {
        aeen aeenVar = this.b;
        int iA = aeenVar.a(12);
        if (iA != 0) {
            return aeenVar.c(iA);
        }
        return 0;
    }

    @Override // defpackage.ndo
    public final int j() {
        aeen aeenVar = this.b;
        int iA = aeenVar.a(26);
        if (iA != 0) {
            return aeenVar.c(iA);
        }
        return 0;
    }

    @Override // defpackage.ndo
    public final int k() {
        aeen aeenVar = this.b;
        int iA = aeenVar.a(30);
        if (iA != 0) {
            return aeenVar.c(iA);
        }
        return 0;
    }

    @Override // defpackage.ndo
    public final int l() {
        aeen aeenVar = this.b;
        int iA = aeenVar.a(14);
        if (iA != 0) {
            return aeenVar.c(iA);
        }
        return 0;
    }

    @Override // defpackage.ndo
    public final /* bridge */ /* synthetic */ ndn m(int i) {
        aeem aeemVar = new aeem();
        aeen aeenVar = this.b;
        int iA = aeenVar.a(20);
        if (iA != 0) {
            int iB = aeenVar.b(iA) + (i * 4);
            aeemVar.e(iB + aeenVar.b.getInt(iB), aeenVar.b);
        } else {
            aeemVar = null;
        }
        if (aeemVar != null) {
            return new mzq(aeemVar);
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.ndo
    public final /* bridge */ /* synthetic */ ndr n(int i) {
        aefa aefaVar = new aefa();
        aeen aeenVar = this.b;
        int iA = aeenVar.a(12);
        if (iA != 0) {
            int iB = aeenVar.b(iA) + (i * 4);
            aefaVar.e(iB + aeenVar.b.getInt(iB), aeenVar.b);
        } else {
            aefaVar = null;
        }
        if (aefaVar != null) {
            return new mzs(aefaVar);
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.ndo
    public final /* bridge */ /* synthetic */ nds o(int i) {
        aefc aefcVar = new aefc();
        aeen aeenVar = this.b;
        int iA = aeenVar.a(26);
        if (iA != 0) {
            int iB = aeenVar.b(iA) + (i * 4);
            aefcVar.e(iB + aeenVar.b.getInt(iB), aeenVar.b);
        } else {
            aefcVar = null;
        }
        if (aefcVar != null) {
            return new mzt(aefcVar);
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ndx] */
    @Override // defpackage.ndo
    public final /* bridge */ /* synthetic */ ndx p() {
        G();
        if (this.a.g()) {
            return this.a.c();
        }
        return null;
    }

    @Override // defpackage.ndo
    public final /* bridge */ /* synthetic */ neo q(int i) {
        aego aegoVar = new aego();
        aeen aeenVar = this.b;
        int iA = aeenVar.a(30);
        if (iA != 0) {
            int iB = aeenVar.b(iA) + (i * 4);
            aegoVar.e(iB + aeenVar.b.getInt(iB), aeenVar.b);
        } else {
            aegoVar = null;
        }
        if (aegoVar != null) {
            return new naa(aegoVar);
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.ndo
    public final /* bridge */ /* synthetic */ nep r(int i) {
        aegy aegyVar = new aegy();
        aeen aeenVar = this.b;
        int iA = aeenVar.a(14);
        if (iA != 0) {
            int iB = aeenVar.b(iA) + (i * 4);
            aegyVar.e(iB + aeenVar.b.getInt(iB), aeenVar.b);
        } else {
            aegyVar = null;
        }
        if (aegyVar != null) {
            return new nab(aegyVar);
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.ndo
    public final String s() {
        return this.b.m();
    }

    @Override // defpackage.ndo
    public final boolean t() {
        aeen aeenVar = this.b;
        int iA = aeenVar.a(22);
        return iA == 0 || aeenVar.b.get(iA + aeenVar.a) != 0;
    }

    @Override // defpackage.ndo
    public final boolean u() {
        return aart.q(this.b, 8);
    }

    @Override // defpackage.ndo
    public final boolean v() {
        return aart.q(this.b, 22);
    }

    @Override // defpackage.ndo
    public final boolean w() {
        return this.b.m() != null;
    }

    @Override // defpackage.ndo
    public final boolean x() {
        return aart.q(this.b, 10);
    }

    @Override // defpackage.ndo
    public final boolean y() {
        G();
        return this.a.g();
    }

    @Override // defpackage.ndo
    public final boolean z() {
        return aart.q(this.b, 6);
    }
}
