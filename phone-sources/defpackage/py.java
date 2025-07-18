package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class py implements pn {
    private final /* synthetic */ ps a;

    public py(float f, float f2, ne neVar) {
        int[] iArr = pp.a;
        this.a = new ps(neVar != null ? new po(neVar, f, f2, 1) : new po(f, f2, 0));
    }

    @Override // defpackage.pn
    public final long a(ne neVar, ne neVar2, ne neVar3) {
        return this.a.a(neVar, neVar2, neVar3);
    }

    @Override // defpackage.pn
    public final ne b(ne neVar, ne neVar2, ne neVar3) {
        return this.a.b(neVar, neVar2, neVar3);
    }

    @Override // defpackage.pn
    public final ne c(long j, ne neVar, ne neVar2, ne neVar3) {
        return this.a.c(j, neVar, neVar2, neVar3);
    }

    @Override // defpackage.pn
    public final ne d(long j, ne neVar, ne neVar2, ne neVar3) {
        return this.a.d(j, neVar, neVar2, neVar3);
    }

    @Override // defpackage.pn
    public final boolean e() {
        return false;
    }
}
