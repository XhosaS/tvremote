package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gaa extends fus {
    public final fzw a;
    public final fzw b;

    public gaa(fzw fzwVar) {
        super((byte[]) null);
        this.a = fzwVar;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gaa)) {
            return false;
        }
        gaa gaaVar = (gaa) obj;
        if (!yks.e(this.a, gaaVar.a)) {
            return false;
        }
        fzw fzwVar = gaaVar.b;
        return yks.e(null, null);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return ylh.t(("PageEvent.LoadStateUpdate (\n                    |   sourceLoadStates: " + this.a + "\n                    ").concat("|)"));
    }
}
