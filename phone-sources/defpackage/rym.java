package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rym {
    public final oly a;
    public final String b;

    public rym(oly olyVar, String str) {
        str.getClass();
        this.a = olyVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rym)) {
            return false;
        }
        rym rymVar = (rym) obj;
        return yks.e(this.a, rymVar.a) && yks.e(this.b, rymVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ExperimentTokenData(experimentToken=" + this.a + ", configPackageName=" + this.b + ")";
    }
}
