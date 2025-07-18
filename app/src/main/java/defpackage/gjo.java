package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gjo extends agtu implements agvb {
    final /* synthetic */ int a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjo(int i, agsw agswVar) {
        super(2, agswVar);
        this.a = i;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gjo) c((xzy) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        xzy xzyVar = (xzy) this.b;
        yds ydsVar = yds.a;
        ydp ydpVar = new ydp();
        if ((ydpVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ydpVar.y();
        }
        yds ydsVar2 = (yds) ydpVar.b;
        ydsVar2.c = 2;
        ydsVar2.b |= 1;
        if ((ydpVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ydpVar.y();
        }
        int i = this.a;
        yds ydsVar3 = (yds) ydpVar.b;
        ydsVar3.d = i - 1;
        ydsVar3.b |= 2;
        abxd abxdVarV = ydpVar.v();
        abxdVarV.getClass();
        yca ycaVar = xzyVar.a;
        yds ydsVar4 = (yds) abxdVarV;
        if ((ycaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycaVar.y();
        }
        ycb ycbVar = (ycb) ycaVar.b;
        ycb ycbVar2 = ycb.a;
        ycbVar.d = ydsVar4;
        ycbVar.c = 22;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        gjo gjoVar = new gjo(this.a, agswVar);
        gjoVar.b = obj;
        return gjoVar;
    }
}
