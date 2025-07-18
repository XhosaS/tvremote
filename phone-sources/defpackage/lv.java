package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lv {
    public final bkd a;
    public final yjv b;
    public final np c;
    private final boolean d = true;

    public lv(bkd bkdVar, yjv yjvVar, np npVar) {
        this.a = bkdVar;
        this.b = yjvVar;
        this.c = npVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lv)) {
            return false;
        }
        lv lvVar = (lv) obj;
        if (!yks.e(this.a, lvVar.a) || !yks.e(this.b, lvVar.b) || !yks.e(this.c, lvVar.c)) {
            return false;
        }
        boolean z = lvVar.d;
        return true;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + 1231;
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.a + ", size=" + this.b + ", animationSpec=" + this.c + ", clip=true)";
    }
}
