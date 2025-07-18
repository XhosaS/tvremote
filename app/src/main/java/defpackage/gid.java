package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gid extends agtu implements agvb {
    final /* synthetic */ int a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gid(int i, agsw agswVar) {
        super(2, agswVar);
        this.a = i;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gid) c((xzy) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        xzy xzyVar = (xzy) this.b;
        yaj yajVar = yaj.a;
        yai yaiVar = new yai();
        if ((yaiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yaiVar.y();
        }
        int i = this.a;
        yaj yajVar2 = (yaj) yaiVar.b;
        yajVar2.c = i - 1;
        yajVar2.b |= 1;
        abxd abxdVarV = yaiVar.v();
        abxdVarV.getClass();
        yca ycaVar = xzyVar.a;
        yaj yajVar3 = (yaj) abxdVarV;
        if ((ycaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycaVar.y();
        }
        ycb ycbVar = (ycb) ycaVar.b;
        ycb ycbVar2 = ycb.a;
        ycbVar.d = yajVar3;
        ycbVar.c = 40;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        gid gidVar = new gid(this.a, agswVar);
        gidVar.b = obj;
        return gidVar;
    }
}
