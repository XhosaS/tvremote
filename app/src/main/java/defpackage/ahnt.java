package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahnt extends ahmd {
    public final agzu a;

    public ahnt(long j, ahnt ahntVar, int i) {
        super(j, ahntVar, i);
        this.a = new agzu(ahns.f);
    }

    @Override // defpackage.ahmd
    public final int a() {
        return ahns.f;
    }

    @Override // defpackage.ahmd
    public final void i(int i) {
        agzy[] agzyVarArr = this.a.a;
        agzyVarArr[i].c(ahns.e);
        o();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.d + ", hashCode=" + hashCode() + "]";
    }
}
