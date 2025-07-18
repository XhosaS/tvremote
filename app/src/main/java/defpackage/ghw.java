package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ghw extends agtu implements agvb {
    private /* synthetic */ Object a;

    public ghw(agsw agswVar) {
        super(2, agswVar);
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ghw) c((xzy) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        xzy xzyVar = (xzy) this.a;
        yau yauVar = yau.a;
        abxd abxdVarV = new yat().v();
        abxdVarV.getClass();
        yca ycaVar = xzyVar.a;
        yau yauVar2 = (yau) abxdVarV;
        if ((ycaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycaVar.y();
        }
        ycb ycbVar = (ycb) ycaVar.b;
        ycb ycbVar2 = ycb.a;
        ycbVar.d = yauVar2;
        ycbVar.c = 48;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        ghw ghwVar = new ghw(agswVar);
        ghwVar.a = obj;
        return ghwVar;
    }
}
