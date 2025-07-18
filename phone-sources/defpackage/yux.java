package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yux implements yuu {
    private final /* synthetic */ int a;

    public yux(int i) {
        this.a = i;
    }

    @Override // defpackage.yuu
    public final ysx a(yva yvaVar) {
        return this.a != 0 ? new isv(yus.a, 6) : new ysq(new daz(yvaVar, (yih) null, 11));
    }

    public final String toString() {
        return this.a != 0 ? "SharingStarted.Eagerly" : "SharingStarted.Lazily";
    }
}
