package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amn {
    public final int a;
    public final long b = 1;
    private final int c;

    public amn(int i, int i2) {
        this.c = i;
        this.a = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amn)) {
            return false;
        }
        amn amnVar = (amn) obj;
        if (this.c != amnVar.c || this.a != amnVar.a) {
            return false;
        }
        long j = amnVar.b;
        return true;
    }

    public final int hashCode() {
        int i = this.c;
        a.bw(i);
        return (((i * 31) + this.a) * 31) + 1;
    }

    public final String toString() {
        return "AnchorInfo(direction=" + ((Object) cko.k(this.c)) + ", offset=" + this.a + ", selectableId=1)";
    }
}
