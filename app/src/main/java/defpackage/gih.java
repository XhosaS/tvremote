package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gih extends agtu implements agvb {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gih(int i, int i2, int i3, agsw agswVar) {
        super(2, agswVar);
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gih) c((xzy) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        xzy xzyVar = (xzy) this.d;
        yfc yfcVar = yfc.a;
        yes yesVar = new yes();
        yer yerVar = yer.a;
        yeq yeqVar = new yeq();
        if ((yeqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yeqVar.y();
        }
        int i = this.a;
        yer yerVar2 = (yer) yeqVar.b;
        yerVar2.e = i - 1;
        yerVar2.b |= 4;
        if ((yeqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yeqVar.y();
        }
        int i2 = this.b;
        yer yerVar3 = (yer) yeqVar.b;
        yerVar3.c = i2 - 1;
        yerVar3.b |= 1;
        if ((yeqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yeqVar.y();
        }
        int i3 = this.c;
        yer yerVar4 = (yer) yeqVar.b;
        yerVar4.d = i3 - 1;
        yerVar4.b |= 2;
        abxd abxdVarV = yeqVar.v();
        abxdVarV.getClass();
        yer yerVar5 = (yer) abxdVarV;
        if ((yesVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yesVar.y();
        }
        yfc yfcVar2 = (yfc) yesVar.b;
        yfcVar2.f = yerVar5;
        yfcVar2.b |= 8;
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
        gih gihVar = new gih(this.a, this.b, this.c, agswVar);
        gihVar.d = obj;
        return gihVar;
    }
}
