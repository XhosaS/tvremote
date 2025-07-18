package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class azm implements ayx {
    private final int a;
    private final bkh b;

    public azm(bkh bkhVar, int i) {
        this.b = bkhVar;
        this.a = i;
    }

    @Override // defpackage.ayx
    public final int a(cmg cmgVar, long j, int i) {
        int i2 = (int) (j & 4294967295L);
        int i3 = this.a;
        return i >= i2 - (i3 + i3) ? bkb.n.a(i, i2) : ykn.l(this.b.a(i, i2), i3, (i2 - i3) - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azm)) {
            return false;
        }
        azm azmVar = (azm) obj;
        return yks.e(this.b, azmVar.b) && this.a == azmVar.a;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a;
    }

    public final String toString() {
        return "Vertical(alignment=" + this.b + ", margin=" + this.a + ')';
    }
}
