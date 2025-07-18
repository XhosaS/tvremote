package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pzs {
    public final vmo a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;

    public pzs(vmo vmoVar, String str, int i, int i2, int i3) {
        this.a = vmoVar;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pzs)) {
            return false;
        }
        pzs pzsVar = (pzs) obj;
        return yks.e(this.a, pzsVar.a) && yks.e(this.b, pzsVar.b) && this.c == pzsVar.c && this.d == pzsVar.d && this.e == pzsVar.e;
    }

    public final int hashCode() {
        int iJ;
        vmo vmoVar = this.a;
        if (vmoVar.A()) {
            iJ = vmoVar.j();
        } else {
            int iJ2 = vmoVar.M;
            if (iJ2 == 0) {
                iJ2 = vmoVar.j();
                vmoVar.M = iJ2;
            }
            iJ = iJ2;
        }
        int iHashCode = ((iJ * 31) + this.b.hashCode()) * 31;
        int i = this.c;
        a.bw(i);
        int i2 = (iHashCode + i) * 31;
        int i3 = this.d;
        a.bw(i3);
        int i4 = (i2 + i3) * 31;
        int i5 = this.e;
        a.bw(i5);
        return i4 + i5;
    }

    public final String toString() {
        return "SdkBatchUpdateKey(threadStateUpdate=" + this.a + ", actionId=" + this.b + ", eventSource=" + ((Object) Integer.toString(this.c - 1)) + ", updateThreadReason=" + ((Object) Integer.toString(this.d - 1)) + ", eventSourceTarget=" + ((Object) Integer.toString(this.e - 2)) + ")";
    }
}
