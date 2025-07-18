package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bec implements agpc {
    private final agxd a;
    private final agum b;
    private final agum c;
    private final agum d;
    private beb e;

    public bec(agxd agxdVar, agum agumVar, agum agumVar2, agum agumVar3) {
        this.a = agxdVar;
        this.b = agumVar;
        this.c = agumVar2;
        this.d = agumVar3;
    }

    @Override // defpackage.agpc
    public final /* bridge */ /* synthetic */ Object a() {
        beb bebVar = this.e;
        if (bebVar != null) {
            return bebVar;
        }
        agum agumVar = this.b;
        agum agumVar2 = this.c;
        wit witVar = ((vgo) this.d).a;
        wit witVar2 = ((vgn) agumVar2).a;
        bel belVarEl = ((vgm) agumVar).a.el();
        beg begVarDM = witVar2.dM();
        bet betVarEm = witVar.em();
        belVarEl.getClass();
        begVarDM.getClass();
        beb bebVarA = new bek(belVarEl, begVarDM, betVarEm).a(this.a);
        this.e = bebVarA;
        return bebVarA;
    }

    @Override // defpackage.agpc
    public final boolean b() {
        throw null;
    }
}
