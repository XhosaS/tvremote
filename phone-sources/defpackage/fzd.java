package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fzd {
    public final fzv a;
    public final fzv b;
    public final fzv c;
    public final fzw d;
    public final boolean e;
    public final boolean f;

    public fzd(fzv fzvVar, fzv fzvVar2, fzv fzvVar3, fzw fzwVar) {
        this.a = fzvVar;
        this.b = fzvVar2;
        this.c = fzvVar3;
        this.d = fzwVar;
        this.e = fzwVar.f;
        this.f = fzwVar.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        fzd fzdVar = (fzd) obj;
        return yks.e(this.a, fzdVar.a) && yks.e(this.b, fzdVar.b) && yks.e(this.c, fzdVar.c) && yks.e(this.d, fzdVar.d) && yks.e(null, null);
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
    }

    public final String toString() {
        return "CombinedLoadStates(refresh=" + this.a + ", prepend=" + this.b + ", append=" + this.c + ", source=" + this.d + ", mediator=null)";
    }
}
