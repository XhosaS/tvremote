package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vri implements vrg {
    public final vql a;
    public final vro b = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vri)) {
            return false;
        }
        vri vriVar = (vri) obj;
        if (!yks.e(this.a, vriVar.a)) {
            return false;
        }
        vro vroVar = vriVar.b;
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "TrailingText(text=" + this.a + ", background=null)";
    }
}
