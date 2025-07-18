package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ghx extends agtu implements agvb {
    final /* synthetic */ String a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghx(String str, agsw agswVar) {
        super(2, agswVar);
        this.a = str;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ghx) c((xzy) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        xzy xzyVar = (xzy) this.b;
        ybc ybcVar = ybc.a;
        yaz yazVar = new yaz();
        ybb ybbVar = ybb.a;
        yba ybaVar = new yba();
        if ((ybaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ybaVar.y();
        }
        String str = this.a;
        ybb ybbVar2 = (ybb) ybaVar.b;
        ybbVar2.c = 12;
        ybbVar2.d = str;
        ybb ybbVarA = xzv.a(ybaVar);
        if ((yazVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yazVar.y();
        }
        ybc ybcVar2 = (ybc) yazVar.b;
        ybcVar2.c = ybbVarA;
        ybcVar2.b |= 1;
        ybc ybcVarA = xzw.a(yazVar);
        yca ycaVar = xzyVar.a;
        if ((ycaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycaVar.y();
        }
        ycb ycbVar = (ycb) ycaVar.b;
        ycb ycbVar2 = ycb.a;
        ycbVar.d = ybcVarA;
        ycbVar.c = 3;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        ghx ghxVar = new ghx(this.a, agswVar);
        ghxVar.b = obj;
        return ghxVar;
    }
}
