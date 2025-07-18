package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wrk extends wrq {
    private final wrr a;
    private final zyd b;

    public wrk(wrr wrrVar, zyd zydVar) {
        this.a = wrrVar;
        this.b = zydVar;
    }

    @Override // defpackage.wrq
    public final wrr a() {
        return this.a;
    }

    @Override // defpackage.wrq
    public final zyd b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wrq) {
            wrq wrqVar = (wrq) obj;
            if (this.a.equals(wrqVar.a()) && this.b.equals(wrqVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        zyd zydVar = this.b;
        return "MonitorReport{monitor=" + this.a.toString() + ", startReport=" + zydVar.toString() + "}";
    }
}
