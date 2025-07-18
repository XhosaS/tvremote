package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gjk extends agtu implements agvb {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjk(int i, int i2, agsw agswVar) {
        super(2, agswVar);
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gjk) c((xzy) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        xzy xzyVar = (xzy) this.c;
        ydk ydkVar = ydk.a;
        ydj ydjVar = new ydj();
        if ((ydjVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ydjVar.y();
        }
        int i = this.a;
        ydk ydkVar2 = (ydk) ydjVar.b;
        ydkVar2.b |= 1;
        ydkVar2.c = i;
        if ((ydjVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ydjVar.y();
        }
        int i2 = this.b;
        ydk ydkVar3 = (ydk) ydjVar.b;
        ydkVar3.d = i2 - 1;
        ydkVar3.b |= 2;
        if ((ydjVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ydjVar.y();
        }
        ydk ydkVar4 = (ydk) ydjVar.b;
        ydkVar4.b |= 4;
        ydkVar4.e = false;
        abxd abxdVarV = ydjVar.v();
        abxdVarV.getClass();
        yca ycaVar = xzyVar.a;
        ydk ydkVar5 = (ydk) abxdVarV;
        if ((ycaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycaVar.y();
        }
        ycb ycbVar = (ycb) ycaVar.b;
        ycb ycbVar2 = ycb.a;
        ycbVar.d = ydkVar5;
        ycbVar.c = 19;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        gjk gjkVar = new gjk(this.a, this.b, agswVar);
        gjkVar.c = obj;
        return gjkVar;
    }
}
