package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kru implements iej {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ kru(iea ieaVar, idf idfVar, idy idyVar, int i) {
        this.d = i;
        this.a = ieaVar;
        this.b = idfVar;
        this.c = idyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [iea, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [idy, java.lang.Object] */
    @Override // defpackage.iej
    public final void dM() {
        if (this.d == 0) {
            ((ieg) this.a.a()).e(this.b).o(this.c);
            return;
        }
        kmy kmyVar = (kmy) this.b;
        idr idrVar = kmyVar.g;
        if (((ieg) idrVar.a()).m()) {
            idrVar.ee(this);
            nqj nqjVar = (nqj) ((ieg) idrVar.a()).g();
            Object obj = this.c;
            Object obj2 = this.a;
            msr msrVar = kmyVar.e;
            ksy ksyVar = (ksy) obj;
            msrVar.d.execute(new fnc(msrVar, ksyVar, nqjVar, (msw) obj2, new kir(), 3));
        }
    }

    public kru(kmy kmyVar, ksy ksyVar, msw mswVar, int i) {
        this.d = i;
        this.b = kmyVar;
        this.c = ksyVar;
        this.a = mswVar;
    }
}
