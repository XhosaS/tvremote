package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gjs extends agtu implements agvb {
    final /* synthetic */ int a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjs(int i, agsw agswVar) {
        super(2, agswVar);
        this.a = i;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gjs) c((xzy) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        xzy xzyVar = (xzy) this.b;
        yfc yfcVar = yfc.a;
        yes yesVar = new yes();
        ygu.b(4, yesVar);
        if ((yesVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yesVar.y();
        }
        int i = this.a;
        yfc yfcVar2 = (yfc) yesVar.b;
        yfcVar2.d = i - 1;
        yfcVar2.b |= 2;
        yfc yfcVarA = ygu.a(yesVar);
        yca ycaVar = xzyVar.a;
        if ((ycaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycaVar.y();
        }
        ycb ycbVar = (ycb) ycaVar.b;
        ycb ycbVar2 = ycb.a;
        ycbVar.d = yfcVarA;
        ycbVar.c = 21;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        gjs gjsVar = new gjs(this.a, agswVar);
        gjsVar.b = obj;
        return gjsVar;
    }
}
