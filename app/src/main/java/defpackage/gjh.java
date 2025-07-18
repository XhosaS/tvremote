package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gjh extends agtu implements agvb {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ String d = "";
    final /* synthetic */ int e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjh(String str, String str2, int i, String str3, agsw agswVar) {
        super(2, agswVar);
        this.a = str;
        this.b = str2;
        this.e = i;
        this.c = str3;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gjh) c((xzy) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        xzy xzyVar = (xzy) this.f;
        xzs xzsVar = xzs.a;
        xzr xzrVar = new xzr();
        yhd yhdVar = yhd.a;
        yhc yhcVar = new yhc();
        if ((yhcVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yhcVar.y();
        }
        String str = this.a;
        yhd yhdVar2 = (yhd) yhcVar.b;
        yhdVar2.b |= 1;
        yhdVar2.c = str;
        if ((yhcVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yhcVar.y();
        }
        String str2 = this.b;
        yhd yhdVar3 = (yhd) yhcVar.b;
        yhdVar3.b |= 2;
        yhdVar3.d = str2;
        yhd yhdVarA = yhe.a(yhcVar);
        if ((xzrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xzrVar.y();
        }
        xzs xzsVar2 = (xzs) xzrVar.b;
        xzsVar2.c = yhdVarA;
        xzsVar2.b |= 1;
        yhk yhkVar = yhk.a;
        yhi yhiVar = new yhi();
        if ((yhiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yhiVar.y();
        }
        int i = this.e;
        yhk yhkVar2 = (yhk) yhiVar.b;
        yhkVar2.c = i - 1;
        yhkVar2.b |= 1;
        if ((yhiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yhiVar.y();
        }
        String str3 = this.c;
        yhk yhkVar3 = (yhk) yhiVar.b;
        yhkVar3.b |= 2;
        yhkVar3.d = str3;
        if ((yhiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yhiVar.y();
        }
        String str4 = this.d;
        yhk yhkVar4 = (yhk) yhiVar.b;
        yhkVar4.b |= 4;
        yhkVar4.e = str4;
        yhk yhkVarA = yhl.a(yhiVar);
        if ((xzrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xzrVar.y();
        }
        xzs xzsVar3 = (xzs) xzrVar.b;
        xzsVar3.d = yhkVarA;
        xzsVar3.b |= 2;
        abxd abxdVarV = xzrVar.v();
        abxdVarV.getClass();
        yca ycaVar = xzyVar.a;
        xzs xzsVar4 = (xzs) abxdVarV;
        if ((ycaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycaVar.y();
        }
        ycb ycbVar = (ycb) ycaVar.b;
        ycb ycbVar2 = ycb.a;
        ycbVar.d = xzsVar4;
        ycbVar.c = 25;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        gjh gjhVar = new gjh(this.a, this.b, this.e, this.c, agswVar);
        gjhVar.f = obj;
        return gjhVar;
    }
}
