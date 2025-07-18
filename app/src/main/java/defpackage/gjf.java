package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gjf extends agtu implements agvb {
    private /* synthetic */ Object a;

    public gjf(agsw agswVar) {
        super(2, agswVar);
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gjf) c((xzy) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        xzy xzyVar = (xzy) this.a;
        xzo xzoVar = xzo.a;
        xzn xznVar = new xzn();
        yhk yhkVar = yhk.a;
        yhi yhiVar = new yhi();
        if ((yhiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yhiVar.y();
        }
        yhk yhkVar2 = (yhk) yhiVar.b;
        yhkVar2.c = 1;
        yhkVar2.b |= 1;
        yhk yhkVarA = yhl.a(yhiVar);
        if ((xznVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xznVar.y();
        }
        xzo xzoVar2 = (xzo) xznVar.b;
        xzoVar2.c = yhkVarA;
        xzoVar2.b |= 1;
        abxd abxdVarV = xznVar.v();
        abxdVarV.getClass();
        yca ycaVar = xzyVar.a;
        xzo xzoVar3 = (xzo) abxdVarV;
        if ((ycaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycaVar.y();
        }
        ycb ycbVar = (ycb) ycaVar.b;
        ycb ycbVar2 = ycb.a;
        ycbVar.d = xzoVar3;
        ycbVar.c = 38;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        gjf gjfVar = new gjf(agswVar);
        gjfVar.a = obj;
        return gjfVar;
    }
}
