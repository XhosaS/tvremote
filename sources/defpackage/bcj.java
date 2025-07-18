package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcj {
    public final akt a;
    public final String b;

    public bcj(akt aktVar, String str) {
        str.getClass();
        this.a = aktVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bcj)) {
            return false;
        }
        bcj bcjVar = (bcj) obj;
        return dnx.aB(this.a, bcjVar.a) && dnx.aB(this.b, bcjVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ExperimentTokenData(experimentToken=" + this.a + ", configPackageName=" + this.b + ")";
    }
}
