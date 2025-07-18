package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gkc extends agtu implements agvb {
    final /* synthetic */ String a;
    final /* synthetic */ int b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gkc(int i, String str, agsw agswVar) {
        super(2, agswVar);
        this.b = i;
        this.a = str;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gkc) c((xzy) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        xzy xzyVar = (xzy) this.c;
        yhn yhnVar = yhn.a;
        yhm yhmVar = new yhm();
        yhk yhkVar = yhk.a;
        yhi yhiVar = new yhi();
        if ((yhiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yhiVar.y();
        }
        int i = this.b;
        yhk yhkVar2 = (yhk) yhiVar.b;
        yhkVar2.c = i - 1;
        yhkVar2.b |= 1;
        if ((yhiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yhiVar.y();
        }
        String str = this.a;
        yhk yhkVar3 = (yhk) yhiVar.b;
        yhkVar3.b |= 4;
        yhkVar3.e = str;
        yhk yhkVarA = yhl.a(yhiVar);
        if ((yhmVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yhmVar.y();
        }
        yhn yhnVar2 = (yhn) yhmVar.b;
        yhnVar2.c = yhkVarA;
        yhnVar2.b |= 1;
        abxd abxdVarV = yhmVar.v();
        abxdVarV.getClass();
        yca ycaVar = xzyVar.a;
        yhn yhnVar3 = (yhn) abxdVarV;
        if ((ycaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycaVar.y();
        }
        ycb ycbVar = (ycb) ycaVar.b;
        ycb ycbVar2 = ycb.a;
        ycbVar.d = yhnVar3;
        ycbVar.c = 30;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        gkc gkcVar = new gkc(this.b, this.a, agswVar);
        gkcVar.c = obj;
        return gkcVar;
    }
}
