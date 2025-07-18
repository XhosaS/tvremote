package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fog implements uha {
    final /* synthetic */ fnw a;
    final /* synthetic */ boolean b;
    final /* synthetic */ eak c;
    final /* synthetic */ foo d;

    public fog(foo fooVar, fnw fnwVar, boolean z, eak eakVar) {
        this.a = fnwVar;
        this.b = z;
        this.c = eakVar;
        this.d = fooVar;
    }

    @Override // defpackage.uha
    public final void a(Throwable th) {
        if (th instanceof UnsupportedOperationException) {
            edb.f("MediaSessionImpl", "UnsupportedOperationException: Make sure to implement MediaSession.Callback.onPlaybackResumption() if you add a media button receiver to your manifest or if you implement the recent media item contract with your MediaLibraryService.", th);
        } else {
            edb.d("MediaSessionImpl", "Failure calling MediaSession.Callback.onPlaybackResumption(): ".concat(String.valueOf(th.getMessage())), th);
        }
        foo fooVar = this.d;
        edt.aF(fooVar.q);
        if (this.b) {
            fooVar.x(this.a);
        }
    }

    @Override // defpackage.uha
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        new foe(new fob(this, (fnx) obj, this.b, this.a, 2), 1).run();
    }
}
