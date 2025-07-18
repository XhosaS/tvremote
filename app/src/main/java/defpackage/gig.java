package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gig extends agtu implements agvb {
    final /* synthetic */ int a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gig(int i, agsw agswVar) {
        super(2, agswVar);
        this.a = i;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gig) c((xzy) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        xzy xzyVar = (xzy) this.b;
        ybf ybfVar = ybf.a;
        ybd ybdVar = new ybd();
        if ((ybdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ybdVar.y();
        }
        int i = this.a;
        ybf ybfVar2 = (ybf) ybdVar.b;
        ybfVar2.c = i - 1;
        ybfVar2.b |= 1;
        abxd abxdVarV = ybdVar.v();
        abxdVarV.getClass();
        yca ycaVar = xzyVar.a;
        ybf ybfVar3 = (ybf) abxdVarV;
        if ((ycaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycaVar.y();
        }
        ycb ycbVar = (ycb) ycaVar.b;
        ycb ycbVar2 = ycb.a;
        ycbVar.d = ybfVar3;
        ycbVar.c = 46;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        gig gigVar = new gig(this.a, agswVar);
        gigVar.b = obj;
        return gigVar;
    }
}
