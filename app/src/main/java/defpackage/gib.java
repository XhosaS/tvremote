package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gib extends agtu implements agvb {
    final /* synthetic */ long a;
    final /* synthetic */ long b;
    final /* synthetic */ String c;
    final /* synthetic */ int d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gib(long j, long j2, int i, String str, agsw agswVar) {
        super(2, agswVar);
        this.a = j;
        this.b = j2;
        this.d = i;
        this.c = str;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gib) c((xzy) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        xzy xzyVar = (xzy) this.e;
        xzm xzmVar = xzm.a;
        xzl xzlVar = new xzl();
        yhk yhkVar = yhk.a;
        yhi yhiVar = new yhi();
        if ((yhiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yhiVar.y();
        }
        int i = this.d;
        yhk yhkVar2 = (yhk) yhiVar.b;
        yhkVar2.c = i - 1;
        yhkVar2.b |= 1;
        if ((yhiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yhiVar.y();
        }
        String str = this.c;
        yhk yhkVar3 = (yhk) yhiVar.b;
        yhkVar3.b |= 4;
        yhkVar3.e = str;
        yhk yhkVarA = yhl.a(yhiVar);
        if ((xzlVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xzlVar.y();
        }
        xzm xzmVar2 = (xzm) xzlVar.b;
        xzmVar2.c = yhkVarA;
        xzmVar2.b |= 1;
        if ((xzlVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xzlVar.y();
        }
        long j = this.a;
        xzm xzmVar3 = (xzm) xzlVar.b;
        xzmVar3.b |= 2;
        xzmVar3.d = j;
        if ((xzlVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xzlVar.y();
        }
        long j2 = this.b;
        xzm xzmVar4 = (xzm) xzlVar.b;
        xzmVar4.b |= 4;
        xzmVar4.e = j2;
        abxd abxdVarV = xzlVar.v();
        abxdVarV.getClass();
        yca ycaVar = xzyVar.a;
        xzm xzmVar5 = (xzm) abxdVarV;
        if ((ycaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycaVar.y();
        }
        ycb ycbVar = (ycb) ycaVar.b;
        ycb ycbVar2 = ycb.a;
        ycbVar.d = xzmVar5;
        ycbVar.c = 28;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        gib gibVar = new gib(this.a, this.b, this.d, this.c, agswVar);
        gibVar.e = obj;
        return gibVar;
    }
}
