package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ttl implements twb {
    final /* synthetic */ ttm a;

    public ttl(ttm ttmVar) {
        this.a = ttmVar;
    }

    private final void m(final tsz tszVar) {
        this.a.a.execute(wyo.h(new Runnable() { // from class: tth
            @Override // java.lang.Runnable
            public final void run() {
                tsz tszVar2 = tszVar;
                tta ttaVar = tszVar2.a;
                ttl ttlVar = this.a;
                ttm ttmVar = ttlVar.a;
                if (ttlVar != ttmVar.e) {
                    if (ttmVar.h) {
                        if (!ttmVar.f.contains(ttaVar) || ttaVar == tta.PARTIAL_RESULTS) {
                            tszVar2.b.run();
                            return;
                        }
                        return;
                    }
                    ttmVar.g.add(tszVar2);
                    if (ttaVar == tta.ERROR) {
                        ttmVar.i = true;
                        return;
                    }
                    return;
                }
                zyd zydVar = ttmVar.j;
                if (zydVar != null) {
                    zydVar.cancel(false);
                }
                tta ttaVar2 = tta.ERROR;
                if (ttaVar == ttaVar2) {
                    ttmVar.d(tszVar2.c);
                }
                if (ttmVar.h) {
                    return;
                }
                ttmVar.f.add(ttaVar);
                tszVar2.b.run();
                if (ttaVar == tta.FINISHED) {
                    if (ttmVar.i) {
                        return;
                    }
                    ttmVar.c.a();
                } else if (ttaVar != ttaVar2) {
                    ttmVar.b();
                }
            }
        }));
    }

    @Override // defpackage.twb
    public final void a(final boolean z) {
        m(new tsz(tta.DATA_DONATION_RESPONSE, new Runnable() { // from class: tti
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.b.a(z);
            }
        }));
    }

    @Override // defpackage.twb
    public final void b() {
        tta ttaVar = tta.END_OF_SPEECH;
        final twb twbVar = this.a.b;
        twbVar.getClass();
        m(new tsz(ttaVar, new Runnable() { // from class: ttc
            @Override // java.lang.Runnable
            public final void run() {
                twbVar.b();
            }
        }));
    }

    @Override // defpackage.twb
    public final void c(final trr trrVar) {
        m(new tsz(tta.ERROR, new Runnable() { // from class: ttk
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.b.c(trrVar);
            }
        }, trrVar));
    }

    @Override // defpackage.twb
    public final void d(trr trrVar) {
        throw new IllegalStateException("Unexpected #onFallback from ".concat(this == this.a.e ? "network" : "SODA"));
    }

    @Override // defpackage.twb
    public final void e() {
        tta ttaVar = tta.HEARTBEAT;
        this.a.b.getClass();
        m(new tsz(ttaVar, new Runnable() { // from class: ttf
            @Override // java.lang.Runnable
            public final void run() {
            }
        }));
    }

    @Override // defpackage.twb
    public final void f(final txt txtVar, final txv txvVar) {
        m(new tsz(tta.INITIALIZE_RECOGNIZER, new Runnable() { // from class: ttj
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.b.f(txtVar, txvVar);
            }
        }));
    }

    @Override // defpackage.twb
    public final void h(final tuw tuwVar) {
        m(new tsz(tta.PARTIAL_RESULTS, new Runnable() { // from class: tte
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.b.h(tuwVar);
            }
        }));
    }

    @Override // defpackage.twb
    public final void i() {
        tta ttaVar = tta.FINISHED;
        final twb twbVar = this.a.b;
        twbVar.getClass();
        m(new tsz(ttaVar, new Runnable() { // from class: ttd
            @Override // java.lang.Runnable
            public final void run() {
                twbVar.i();
            }
        }));
    }

    @Override // defpackage.twb
    public final void j(final tso tsoVar) {
        m(new tsz(tta.RESULTS, new Runnable() { // from class: ttg
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.b.j(tsoVar);
            }
        }));
    }

    @Override // defpackage.twb
    public final void l() {
        tta ttaVar = tta.START_OF_SPEECH;
        final twb twbVar = this.a.b;
        twbVar.getClass();
        m(new tsz(ttaVar, new Runnable() { // from class: ttb
            @Override // java.lang.Runnable
            public final void run() {
                twbVar.l();
            }
        }));
    }

    @Override // defpackage.twb
    public final /* synthetic */ void g(adqj adqjVar) {
    }

    @Override // defpackage.twb
    public final /* synthetic */ void k(adrb adrbVar) {
    }
}
