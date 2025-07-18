package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gkd extends agtu implements agvb {
    final /* synthetic */ yfn a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gkd(yfn yfnVar, agsw agswVar) {
        super(2, agswVar);
        this.a = yfnVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gkd) c((xzy) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        xzy xzyVar = (xzy) this.b;
        yfs yfsVar = yfs.a;
        yfk yfkVar = new yfk();
        if ((yfkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yfkVar.y();
        }
        yfn yfnVar = this.a;
        yfs yfsVar2 = (yfs) yfkVar.b;
        yfsVar2.c = yfnVar;
        yfsVar2.b |= 2;
        yfs yfsVarA = ygv.a(yfkVar);
        yca ycaVar = xzyVar.a;
        if ((ycaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycaVar.y();
        }
        ycb ycbVar = (ycb) ycaVar.b;
        ycb ycbVar2 = ycb.a;
        ycbVar.d = yfsVarA;
        ycbVar.c = 17;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        gkd gkdVar = new gkd(this.a, agswVar);
        gkdVar.b = obj;
        return gkdVar;
    }
}
