package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gjm extends agtu implements agvb {
    final /* synthetic */ ycm a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjm(ycm ycmVar, agsw agswVar) {
        super(2, agswVar);
        this.a = ycmVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gjm) c((xzy) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        xzy xzyVar = (xzy) this.b;
        abxk abxkVar = ycq.a;
        ygr ygrVar = new ygr(new yce());
        yce yceVar = ygrVar.a;
        if ((yceVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yceVar.y();
        }
        ycm ycmVar = this.a;
        ycq ycqVar = (ycq) yceVar.b;
        ycqVar.e = 15;
        ycqVar.d |= 1;
        ygrVar.b();
        yceVar.a(ycmVar);
        ycq ycqVarA = ygrVar.a();
        yca ycaVar = xzyVar.a;
        if ((ycaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycaVar.y();
        }
        ycb ycbVar = (ycb) ycaVar.b;
        ycb ycbVar2 = ycb.a;
        ycbVar.d = ycqVarA;
        ycbVar.c = 5;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        gjm gjmVar = new gjm(this.a, agswVar);
        gjmVar.b = obj;
        return gjmVar;
    }
}
