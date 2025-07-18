package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rqk extends rqi {
    private final String a;
    private final rou b;

    public rqk(String str, rou rouVar) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.a = str;
        this.b = rouVar;
    }

    @Override // defpackage.rqi
    public final rou a() {
        return this.b;
    }

    @Override // defpackage.rqi
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rqi) {
            rqi rqiVar = (rqi) obj;
            if (this.a.equals(rqiVar.b()) && this.b.equals(rqiVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "NamedTracker{name=" + this.a + ", tracker=" + this.b.toString() + "}";
    }
}
