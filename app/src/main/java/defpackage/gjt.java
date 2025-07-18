package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gjt extends agtu implements agvb {
    final /* synthetic */ int a;
    final /* synthetic */ yea b;
    final /* synthetic */ int c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjt(int i, int i2, yea yeaVar, agsw agswVar) {
        super(2, agswVar);
        this.a = i;
        this.c = i2;
        this.b = yeaVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gjt) c((xzy) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        xzy xzyVar = (xzy) this.d;
        yec yecVar = yec.a;
        yeb yebVar = new yeb();
        if ((yebVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yebVar.y();
        }
        int i = this.a;
        yec yecVar2 = (yec) yebVar.b;
        yecVar2.b |= 1;
        yecVar2.c = i;
        if ((yebVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yebVar.y();
        }
        int i2 = this.c;
        yec yecVar3 = (yec) yebVar.b;
        yecVar3.d = i2 - 1;
        yecVar3.b |= 2;
        if ((yebVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yebVar.y();
        }
        yea yeaVar = this.b;
        yec yecVar4 = (yec) yebVar.b;
        yecVar4.e = yeaVar.f;
        yecVar4.b |= 4;
        abxd abxdVarV = yebVar.v();
        abxdVarV.getClass();
        yca ycaVar = xzyVar.a;
        yec yecVar5 = (yec) abxdVarV;
        if ((ycaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycaVar.y();
        }
        ycb ycbVar = (ycb) ycaVar.b;
        ycb ycbVar2 = ycb.a;
        ycbVar.d = yecVar5;
        ycbVar.c = 44;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        gjt gjtVar = new gjt(this.a, this.c, this.b, agswVar);
        gjtVar.d = obj;
        return gjtVar;
    }
}
