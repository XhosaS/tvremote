package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axt implements ayx {
    private final int a;
    private final bkh b;
    private final bkh c;

    public axt(bkh bkhVar, bkh bkhVar2, int i) {
        this.b = bkhVar;
        this.c = bkhVar2;
        this.a = i;
    }

    @Override // defpackage.ayx
    public final int a(cmg cmgVar, long j, int i) {
        int iA = this.c.a(0, cmgVar.a());
        return cmgVar.c + iA + (-this.b.a(0, i)) + this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axt)) {
            return false;
        }
        axt axtVar = (axt) obj;
        return yks.e(this.b, axtVar.b) && yks.e(this.c, axtVar.c) && this.a == axtVar.a;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.a;
    }

    public final String toString() {
        return "Vertical(menuAlignment=" + this.b + ", anchorAlignment=" + this.c + ", offset=" + this.a + ')';
    }
}
