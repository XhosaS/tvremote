package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class zwr implements zvh {
    final /* synthetic */ zwt a;
    final /* synthetic */ zvh b;

    public zwr(zwt zwtVar, zvh zvhVar) {
        this.a = zwtVar;
        this.b = zvhVar;
    }

    @Override // defpackage.zvh
    public final zyd a() {
        return !this.a.compareAndSet(zws.NOT_RUN, zws.STARTED) ? zxn.f() : this.b.a();
    }

    public final String toString() {
        return this.b.toString();
    }
}
