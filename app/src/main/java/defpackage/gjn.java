package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gjn extends agtu implements agvb {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjn(int i, int i2, agsw agswVar) {
        super(2, agswVar);
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gjn) c((xzy) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        xzy xzyVar = (xzy) this.c;
        ydo ydoVar = ydo.a;
        ydl ydlVar = new ydl();
        if ((ydlVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ydlVar.y();
        }
        int i = this.a;
        ydo ydoVar2 = (ydo) ydlVar.b;
        ydoVar2.c = i - 1;
        ydoVar2.b |= 1;
        if ((ydlVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ydlVar.y();
        }
        int i2 = this.b;
        ydo ydoVar3 = (ydo) ydlVar.b;
        ydoVar3.d = i2 - 1;
        ydoVar3.b |= 2;
        abxd abxdVarV = ydlVar.v();
        abxdVarV.getClass();
        yca ycaVar = xzyVar.a;
        ydo ydoVar4 = (ydo) abxdVarV;
        if ((ycaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycaVar.y();
        }
        ycb ycbVar = (ycb) ycaVar.b;
        ycb ycbVar2 = ycb.a;
        ycbVar.d = ydoVar4;
        ycbVar.c = 35;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        gjn gjnVar = new gjn(this.a, this.b, agswVar);
        gjnVar.c = obj;
        return gjnVar;
    }
}
