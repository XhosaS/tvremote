package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbw implements bcj {
    private final bbv a;
    private final bcj b;

    public bbw(bbv bbvVar, bcj bcjVar) {
        this.a = bbvVar;
        this.b = bcjVar;
    }

    @Override // defpackage.bcj
    public final void a(bcl bclVar, bce bceVar) {
        switch (bceVar.ordinal()) {
            case 0:
                this.a.eY(bclVar);
                break;
            case 1:
                this.a.c(bclVar);
                break;
            case 2:
                this.a.f();
                break;
            case 3:
                this.a.e();
                break;
            case 4:
                this.a.d(bclVar);
                break;
            case 5:
                this.a.b(bclVar);
                break;
            case 6:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                throw new agpg();
        }
        bcj bcjVar = this.b;
        if (bcjVar != null) {
            bcjVar.a(bclVar, bceVar);
        }
    }
}
