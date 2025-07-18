package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class utn extends wbb {
    public boolean a;
    public final /* synthetic */ utr b;
    public final wbb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public utn(utr utrVar, wbb wbbVar) {
        super(null);
        this.b = utrVar;
        this.a = false;
        this.c = wbbVar;
    }

    @Override // defpackage.wbb
    public final void a(xtk xtkVar, xsm xsmVar) {
        this.b.a.execute(new rvp(this, xtkVar, xsmVar, 15, (byte[]) null));
    }

    @Override // defpackage.wbb
    public final void c(xsm xsmVar) {
        this.b.a.execute(new utm(this, xsmVar, 2));
    }

    @Override // defpackage.wbb
    public final void d(Object obj) {
        this.b.a.execute(new utm(this, obj, 3));
    }

    @Override // defpackage.wbb
    public final void e() {
        this.b.a.execute(new ufx(this, 14));
    }
}
