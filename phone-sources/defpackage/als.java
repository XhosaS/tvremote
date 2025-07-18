package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class als {
    public final cfy a;
    public cfy b;
    public boolean c = false;
    public all d = null;

    public als(cfy cfyVar, cfy cfyVar2) {
        this.a = cfyVar;
        this.b = cfyVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof als)) {
            return false;
        }
        als alsVar = (als) obj;
        return yks.e(this.a, alsVar.a) && yks.e(this.b, alsVar.b) && this.c == alsVar.c && yks.e(this.d, alsVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        int iQ = a.q(this.c);
        all allVar = this.d;
        return (((iHashCode * 31) + iQ) * 31) + (allVar == null ? 0 : allVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.a) + ", substitution=" + ((Object) this.b) + ", isShowingSubstitution=" + this.c + ", layoutCache=" + this.d + ')';
    }
}
