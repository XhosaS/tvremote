package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aawz extends aaxl {
    private final zei a;
    private final String b;

    public aawz(zei zeiVar, String str) {
        this.a = zeiVar;
        this.b = str;
    }

    @Override // defpackage.aaxl
    public final zei a() {
        return this.a;
    }

    @Override // defpackage.aaxl
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aaxl) {
            aaxl aaxlVar = (aaxl) obj;
            if (this.a.equals(aaxlVar.a()) && ((str = this.b) != null ? str.equals(aaxlVar.b()) : aaxlVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        return (iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "MessageAndLogSite{logSite=" + this.a.toString() + ", message=" + this.b + "}";
    }
}
