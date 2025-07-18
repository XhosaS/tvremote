package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gke extends agtu implements agvb {
    final /* synthetic */ yfr a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gke(yfr yfrVar, agsw agswVar) {
        super(2, agswVar);
        this.a = yfrVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gke) c((xzy) obj, (agsw) obj2)).b(agpu.a);
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
        yfr yfrVar = this.a;
        yfs yfsVar2 = (yfs) yfkVar.b;
        yfsVar2.d = yfrVar;
        yfsVar2.b |= 4;
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
        gke gkeVar = new gke(this.a, agswVar);
        gkeVar.b = obj;
        return gkeVar;
    }
}
