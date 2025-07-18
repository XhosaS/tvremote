package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mxz implements idb {
    public final /* synthetic */ iea a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ mxz(idw idwVar, iea ieaVar, kwn kwnVar, int i) {
        this.d = i;
        this.c = idwVar;
        this.a = ieaVar;
        this.b = kwnVar;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [idb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [iea, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [idw, java.lang.Object] */
    @Override // defpackage.idb
    public final boolean a() {
        if (this.d != 0) {
            return this.c.b((kwn) ((ieg) this.a.a()).h(this.b));
        }
        return ((ieg) this.a.a()).m() && ((ieg) this.b.a()).m() && this.c.a();
    }

    public /* synthetic */ mxz(iea ieaVar, iea ieaVar2, idb idbVar, int i) {
        this.d = i;
        this.a = ieaVar;
        this.b = ieaVar2;
        this.c = idbVar;
    }
}
