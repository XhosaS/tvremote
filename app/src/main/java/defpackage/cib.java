package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cib implements ahgr {
    final /* synthetic */ ahgr[] a;

    public cib(ahgr[] ahgrVarArr) {
        this.a = ahgrVarArr;
    }

    @Override // defpackage.ahgr
    public final Object fD(ahgs ahgsVar, agsw agswVar) {
        ahgr[] ahgrVarArr = this.a;
        ahju ahjuVar = new ahju(ahgrVarArr, new chz(ahgrVarArr), new cia(null), ahgsVar, null);
        ahjw ahjwVar = new ahjw(agswVar.fr(), agswVar);
        Object objA = ahmv.a(ahjwVar, true, ahjwVar, ahjuVar);
        agtg agtgVar = agtg.a;
        if (objA != agtgVar) {
            objA = agpu.a;
        }
        return objA == agtgVar ? objA : agpu.a;
    }
}
