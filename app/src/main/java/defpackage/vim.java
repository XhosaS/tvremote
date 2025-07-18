package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vim extends vhs {
    private final String a;
    private final vhr b;

    public vim(String str, vhr vhrVar) {
        this.a = str;
        this.b = vhrVar;
    }

    @Override // defpackage.vhs
    public final vhr a() {
        return this.b;
    }

    @Override // defpackage.vhs
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vhs) {
            vhs vhsVar = (vhs) obj;
            if (this.a.equals(vhsVar.b()) && this.b.equals(vhsVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "AccountProviderConfig{type=" + this.a + ", provider=" + this.b.toString() + "}";
    }
}
