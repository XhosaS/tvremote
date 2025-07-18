package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gii extends agtu implements agvb {
    final /* synthetic */ String a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gii(String str, agsw agswVar) {
        super(2, agswVar);
        this.a = str;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gii) c((xzy) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        xzy xzyVar = (xzy) this.b;
        yek yekVar = yek.a;
        yef yefVar = new yef();
        if ((yefVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yefVar.y();
        }
        String str = this.a;
        yek yekVar2 = (yek) yefVar.b;
        yekVar2.b |= 1;
        yekVar2.e = str;
        yek yekVarA = ygt.a(yefVar);
        yca ycaVar = xzyVar.a;
        if ((ycaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycaVar.y();
        }
        ycb ycbVar = (ycb) ycaVar.b;
        ycb ycbVar2 = ycb.a;
        ycbVar.d = yekVarA;
        ycbVar.c = 4;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        gii giiVar = new gii(this.a, agswVar);
        giiVar.b = obj;
        return giiVar;
    }
}
