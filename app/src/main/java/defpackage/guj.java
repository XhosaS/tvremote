package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class guj implements fxj, agvt {
    final /* synthetic */ gva a;

    public guj(gva gvaVar) {
        this.a = gvaVar;
    }

    @Override // defpackage.fxj
    public final Object a(agsw agswVar) {
        Object objY = gva.y(this.a, true, agswVar);
        agtg agtgVar = agtg.a;
        if (objY != agtgVar) {
            objY = agpu.a;
        }
        return objY == agtgVar ? objY : agpu.a;
    }

    @Override // defpackage.agvt
    public final agoz b() {
        return new agvj(agvx.class);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof fxj) && (obj instanceof agvt)) {
            return agvy.c(new agvj(agvx.class), ((agvt) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return new agvj(agvx.class).hashCode();
    }
}
