package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axs implements ayw {
    private final bkc a;
    private final bkc b;
    private final int c;

    public axs(bkc bkcVar, bkc bkcVar2, int i) {
        this.a = bkcVar;
        this.b = bkcVar2;
        this.c = i;
    }

    @Override // defpackage.ayw
    public final int a(cmg cmgVar, long j, int i, cmi cmiVar) {
        int iA = this.b.a(0, cmgVar.b(), cmiVar);
        return cmgVar.b + iA + (-this.a.a(0, i, cmiVar)) + (cmiVar == cmi.a ? this.c : -this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axs)) {
            return false;
        }
        axs axsVar = (axs) obj;
        return yks.e(this.a, axsVar.a) && yks.e(this.b, axsVar.b) && this.c == axsVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c;
    }

    public final String toString() {
        return "Horizontal(menuAlignment=" + this.a + ", anchorAlignment=" + this.b + ", offset=" + this.c + ')';
    }
}
