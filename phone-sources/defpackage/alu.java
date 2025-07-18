package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alu {
    public String a;
    public boolean b = false;
    public alm c = null;
    private final String d;

    public alu(String str, String str2) {
        this.d = str;
        this.a = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alu)) {
            return false;
        }
        alu aluVar = (alu) obj;
        return yks.e(this.d, aluVar.d) && yks.e(this.a, aluVar.a) && this.b == aluVar.b && yks.e(this.c, aluVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() * 31) + this.a.hashCode();
        int iQ = a.q(this.b);
        alm almVar = this.c;
        return (((iHashCode * 31) + iQ) * 31) + (almVar == null ? 0 : almVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.c + ", isShowingSubstitution=" + this.b + ')';
    }
}
