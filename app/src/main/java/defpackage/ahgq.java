package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahgq implements ahgr {
    public final agux a;
    public final agvb b;
    private final ahgr c;

    public ahgq(ahgr ahgrVar, agux aguxVar, agvb agvbVar) {
        this.c = ahgrVar;
        this.a = aguxVar;
        this.b = agvbVar;
    }

    @Override // defpackage.ahgr
    public final Object fD(ahgs ahgsVar, agsw agswVar) {
        agwh agwhVar = new agwh();
        agwhVar.a = ahkc.a;
        Object objFD = this.c.fD(new ahgp(agwhVar, ahgsVar), agswVar);
        return objFD == agtg.a ? objFD : agpu.a;
    }
}
