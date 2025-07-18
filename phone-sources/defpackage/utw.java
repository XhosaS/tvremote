package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class utw extends wbb {
    public final wbb a;
    private final trd b;

    public utw(wbb wbbVar) {
        super(null);
        this.a = wbbVar;
        this.b = new trd(tqg.b());
    }

    private final void f(Runnable runnable) {
        tqt tqtVarA = tqg.a();
        if (tqtVarA != null && tqtVarA != tqk.a) {
            runnable.run();
            return;
        }
        trd trdVar = this.b;
        int i = trc.a;
        new tqz(trdVar.a, runnable).run();
    }

    @Override // defpackage.wbb
    public final void a(xtk xtkVar, xsm xsmVar) {
        f(new rvp(this, xtkVar, xsmVar, 16, (byte[]) null));
    }

    @Override // defpackage.wbb
    public final void c(xsm xsmVar) {
        f(new utm(this, xsmVar, 4));
    }

    @Override // defpackage.wbb
    public final void d(Object obj) {
        f(new utm(this, obj, 5));
    }

    @Override // defpackage.wbb
    public final void e() {
        f(new ufx(this.a, 15));
    }
}
