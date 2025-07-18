package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gji extends agtu implements agvb {
    final /* synthetic */ int a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gji(int i, agsw agswVar) {
        super(2, agswVar);
        this.a = i;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gji) c((xzy) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        xzy xzyVar = (xzy) this.b;
        xzu xzuVar = xzu.a;
        xzt xztVar = new xzt();
        if ((xztVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xztVar.y();
        }
        xzu xzuVar2 = (xzu) xztVar.b;
        xzuVar2.b |= 1;
        xzuVar2.c = "media_session";
        yhk yhkVar = yhk.a;
        yhi yhiVar = new yhi();
        if ((yhiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yhiVar.y();
        }
        int i = this.a;
        yhk yhkVar2 = (yhk) yhiVar.b;
        yhkVar2.c = i - 1;
        yhkVar2.b |= 1;
        yhk yhkVarA = yhl.a(yhiVar);
        if ((xztVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xztVar.y();
        }
        xzu xzuVar3 = (xzu) xztVar.b;
        xzuVar3.d = yhkVarA;
        xzuVar3.b |= 2;
        abxd abxdVarV = xztVar.v();
        abxdVarV.getClass();
        yca ycaVar = xzyVar.a;
        xzu xzuVar4 = (xzu) abxdVarV;
        if ((ycaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycaVar.y();
        }
        ycb ycbVar = (ycb) ycaVar.b;
        ycb ycbVar2 = ycb.a;
        ycbVar.d = xzuVar4;
        ycbVar.c = 27;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        gji gjiVar = new gji(this.a, agswVar);
        gjiVar.b = obj;
        return gjiVar;
    }
}
