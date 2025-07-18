package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bof implements ahgr {
    final /* synthetic */ ahgr a;
    final /* synthetic */ bmn b;
    final /* synthetic */ agux c;

    public bof(ahgr ahgrVar, bmn bmnVar, agux aguxVar) {
        this.a = ahgrVar;
        this.b = bmnVar;
        this.c = aguxVar;
    }

    @Override // defpackage.ahgr
    public final Object fD(ahgs ahgsVar, agsw agswVar) {
        Object objFD = this.a.fD(new boe(ahgsVar, this.b, this.c), agswVar);
        return objFD == agtg.a ? objFD : agpu.a;
    }
}
