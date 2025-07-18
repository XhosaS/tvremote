package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class ldk extends kuj {
    final /* synthetic */ leo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ldk(leo leoVar, lco lcoVar) {
        super(lcoVar);
        this.b = leoVar;
    }

    @Override // defpackage.kuj
    public final void b() {
        lbk lbkVar = this.b.y;
        final leo leoVar = lbkVar.l;
        lbkVar.n(leoVar);
        leoVar.getClass();
        new Thread(new Runnable() { // from class: ldj
            @Override // java.lang.Runnable
            public final void run() {
                leoVar.p();
            }
        }).start();
    }
}
