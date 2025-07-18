package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fed {
    public final feg a;
    public final feg b;

    public fed(feg fegVar, feg fegVar2) {
        this.a = fegVar;
        this.b = fegVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fed fedVar = (fed) obj;
            if (this.a.equals(fedVar.a) && this.b.equals(fedVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        feg fegVar = this.a;
        feg fegVar2 = this.b;
        return "[" + fegVar.toString() + (fegVar.equals(fegVar2) ? "" : ", ".concat(fegVar2.toString())) + "]";
    }
}
