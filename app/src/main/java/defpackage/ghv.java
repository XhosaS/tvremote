package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ghv extends agtu implements agvb {
    final /* synthetic */ int a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghv(int i, agsw agswVar) {
        super(2, agswVar);
        this.a = i;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ghv) c((xzy) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        xzy xzyVar = (xzy) this.b;
        yas yasVar = yas.a;
        yar yarVar = new yar();
        if ((yarVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yarVar.y();
        }
        int i = this.a;
        yas yasVar2 = (yas) yarVar.b;
        yasVar2.c = 1;
        yasVar2.b = 1 | yasVar2.b;
        if ((yarVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yarVar.y();
        }
        yas yasVar3 = (yas) yarVar.b;
        yasVar3.d = i - 1;
        yasVar3.b |= 2;
        abxd abxdVarV = yarVar.v();
        abxdVarV.getClass();
        yca ycaVar = xzyVar.a;
        yas yasVar4 = (yas) abxdVarV;
        if ((ycaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycaVar.y();
        }
        ycb ycbVar = (ycb) ycaVar.b;
        ycb ycbVar2 = ycb.a;
        ycbVar.d = yasVar4;
        ycbVar.c = 23;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        ghv ghvVar = new ghv(this.a, agswVar);
        ghvVar.b = obj;
        return ghvVar;
    }
}
