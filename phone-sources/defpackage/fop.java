package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fop implements fpg {
    public final /* synthetic */ fph a;
    private final /* synthetic */ int b;

    public /* synthetic */ fop(fph fphVar, int i) {
        this.b = i;
        this.a = fphVar;
    }

    @Override // defpackage.fpg
    public final void a(fnw fnwVar) {
        switch (this.b) {
            case 0:
                edt.aE(this.a.b.q);
                break;
            case 1:
                this.a.b.q.h();
                break;
            case 2:
                foo fooVar = this.a.b;
                edt.aA(fooVar.q, fooVar.n);
                break;
            case 3:
                this.a.b.q.m();
                break;
            case 4:
                this.a.b.q.n();
                break;
            case 5:
                this.a.b.q.g();
                break;
            case 6:
                this.a.b.q.W();
                break;
            case 7:
                this.a.b.q.ak();
                break;
            case 8:
                this.a.b.q.k();
                break;
            case 9:
                this.a.b.q.l();
                break;
            default:
                this.a.b.m(fnwVar, true);
                break;
        }
    }
}
