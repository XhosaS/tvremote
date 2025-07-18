package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nlv implements nsl {
    public nwu a;
    final /* synthetic */ nma b;
    private long c = 0;

    public nlv(nma nmaVar) {
        this.b = nmaVar;
    }

    @Override // defpackage.nsl
    public final long a() {
        long j = this.c + 1;
        this.c = j;
        return j;
    }

    @Override // defpackage.nsl
    public final void b(String str, String str2, long j) {
        if (this.a == null) {
            throw new IllegalStateException("No GoogleApiClient available");
        }
        jzs jzsVar = nkm.a;
        jys.Q(this.a, str, str2).i(new nlu(this, j));
    }
}
