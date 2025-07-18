package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ob extends oa {
    public final int c;

    public ob(Object obj, nl nlVar) {
        super(obj, nlVar);
        this.c = 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ob)) {
            return false;
        }
        ob obVar = (ob) obj;
        if (yks.e(obVar.a, this.a) && yks.e(obVar.b, this.b)) {
            int i = obVar.c;
            if (a.r(0, 0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 961) + this.b.hashCode();
    }
}
