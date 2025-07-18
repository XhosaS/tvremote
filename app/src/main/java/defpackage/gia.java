package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gia extends agtu implements agvb {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gia(int i, int i2, agsw agswVar) {
        super(2, agswVar);
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gia) c((xzy) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        xzy xzyVar = (xzy) this.c;
        yae yaeVar = yae.a;
        yab yabVar = new yab();
        if ((yabVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yabVar.y();
        }
        int i = this.a;
        yae yaeVar2 = (yae) yabVar.b;
        yaeVar2.c = i - 1;
        yaeVar2.b |= 1;
        if ((yabVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yabVar.y();
        }
        int i2 = this.b;
        yae yaeVar3 = (yae) yabVar.b;
        yaeVar3.d = i2 - 1;
        yaeVar3.b |= 2;
        abxd abxdVarV = yabVar.v();
        abxdVarV.getClass();
        yca ycaVar = xzyVar.a;
        yae yaeVar4 = (yae) abxdVarV;
        if ((ycaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycaVar.y();
        }
        ycb ycbVar = (ycb) ycaVar.b;
        ycb ycbVar2 = ycb.a;
        ycbVar.d = yaeVar4;
        ycbVar.c = 37;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        gia giaVar = new gia(this.a, this.b, agswVar);
        giaVar.c = obj;
        return giaVar;
    }
}
