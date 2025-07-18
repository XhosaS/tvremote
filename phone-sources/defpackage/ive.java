package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ive {
    public final tlu a;
    public final tol b;
    private final gag c;

    public ive(tlu tluVar, tol tolVar, gag gagVar) {
        this.a = tluVar;
        this.b = tolVar;
        this.c = gagVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ive)) {
            return false;
        }
        ive iveVar = (ive) obj;
        return yks.e(this.a, iveVar.a) && yks.e(this.b, iveVar.b) && yks.e(this.c, iveVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "KeyboardData(imeService=" + this.a + ", imeListener=" + this.b + ", mediaDeviceUiController=" + this.c + ")";
    }
}
