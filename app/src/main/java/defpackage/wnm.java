package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wnm extends wnw {
    private final boolean b;
    private final wnp c;
    private final agow d;

    public wnm(boolean z, wnp wnpVar, agow agowVar) {
        this.b = z;
        this.c = wnpVar;
        this.d = agowVar;
    }

    @Override // defpackage.wnw
    public final wnp a() {
        return this.c;
    }

    @Override // defpackage.wnw
    public final agow b() {
        return this.d;
    }

    @Override // defpackage.wnw
    public final boolean c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        wnp wnpVar;
        agow agowVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof wnw) {
            wnw wnwVar = (wnw) obj;
            if (this.b == wnwVar.c() && ((wnpVar = this.c) != null ? wnpVar.equals(wnwVar.a()) : wnwVar.a() == null) && ((agowVar = this.d) != null ? agowVar.equals(wnwVar.b()) : wnwVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        wnp wnpVar = this.c;
        int iHashCode = (wnpVar == null ? 0 : wnpVar.hashCode()) ^ (((true != this.b ? 1237 : 1231) ^ 1000003) * 1000003);
        agow agowVar = this.d;
        return (iHashCode * 1000003) ^ (agowVar != null ? agowVar.hashCode() : 0);
    }

    public final String toString() {
        agow agowVar = this.d;
        return "SyncletBinding{enabled=" + this.b + ", syncConfig=" + String.valueOf(this.c) + ", syncletProvider=" + String.valueOf(agowVar) + "}";
    }
}
