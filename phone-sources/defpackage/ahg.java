package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahg implements ahn {
    final /* synthetic */ ahh a;
    private final long b;

    public ahg(ahh ahhVar, long j) {
        this.a = ahhVar;
        this.b = j;
    }

    @Override // defpackage.ahn
    public final long a(bvc bvcVar) {
        bvc bvcVar2 = (bvc) this.a.b.a();
        if (bvcVar2 != null) {
            return bvcVar.i(bvcVar2, this.b);
        }
        wv.b("Tried to open context menu before the anchor was placed.");
        throw new yfs();
    }

    @Override // defpackage.ahn
    public final agk b() {
        return ht.t(this.a);
    }

    @Override // defpackage.ahn
    public final bmy c(bvc bvcVar) {
        return d.w(a(bvcVar), 0L);
    }
}
