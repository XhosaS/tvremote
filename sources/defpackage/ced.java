package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ced {
    public final cfh a;
    public final String b;

    public ced(cfh cfhVar, String str) {
        cfhVar.getClass();
        this.a = cfhVar;
        str.getClass();
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ced) {
            ced cedVar = (ced) obj;
            if (this.a.equals(cedVar.a) && this.b.equals(cedVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        return str.hashCode() ^ this.a.hashCode();
    }
}
