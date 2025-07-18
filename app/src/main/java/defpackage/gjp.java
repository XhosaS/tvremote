package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gjp extends agtu implements agvb {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjp(int i, int i2, agsw agswVar) {
        super(2, agswVar);
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gjp) c((xzy) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        xzy xzyVar = (xzy) this.c;
        ydw ydwVar = ydw.a;
        ydt ydtVar = new ydt();
        if ((ydtVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ydtVar.y();
        }
        int i = this.a;
        ydw ydwVar2 = (ydw) ydtVar.b;
        ydwVar2.c = i - 1;
        ydwVar2.b |= 1;
        if ((ydtVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ydtVar.y();
        }
        int i2 = this.b;
        ydw ydwVar3 = (ydw) ydtVar.b;
        ydwVar3.d = i2 - 1;
        ydwVar3.b |= 2;
        abxd abxdVarV = ydtVar.v();
        abxdVarV.getClass();
        yca ycaVar = xzyVar.a;
        ydw ydwVar4 = (ydw) abxdVarV;
        if ((ycaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycaVar.y();
        }
        ycb ycbVar = (ycb) ycaVar.b;
        ycb ycbVar2 = ycb.a;
        ycbVar.d = ydwVar4;
        ycbVar.c = 39;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        gjp gjpVar = new gjp(this.a, this.b, agswVar);
        gjpVar.c = obj;
        return gjpVar;
    }
}
