package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fzn {
    public final int a;
    public final gcf b;

    public fzn(int i, gcf gcfVar) {
        gcfVar.getClass();
        this.a = i;
        this.b = gcfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzn)) {
            return false;
        }
        fzn fznVar = (fzn) obj;
        return this.a == fznVar.a && yks.e(this.b, fznVar.b);
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "GenerationalViewportHint(generationId=" + this.a + ", hint=" + this.b + ')';
    }
}
