package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mmr implements idb {
    public final /* synthetic */ iea a;
    public final /* synthetic */ idw b;
    private final /* synthetic */ int c;

    public /* synthetic */ mmr(iea ieaVar, idw idwVar, int i) {
        this.c = i;
        this.a = ieaVar;
        this.b = idwVar;
    }

    @Override // defpackage.idb
    public final boolean a() {
        if (this.c != 0) {
            iea ieaVar = this.a;
            return ((ieg) ieaVar.a()).m() && this.b.b((kvf) ((ieg) ieaVar.a()).g());
        }
        iea ieaVar2 = this.a;
        return ((ieg) ieaVar2.a()).m() && this.b.b((kwn) ((ieg) ieaVar2.a()).g());
    }
}
