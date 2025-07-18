package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jgq extends agtu implements agvb {
    int a;
    final /* synthetic */ jhh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgq(jhh jhhVar, agsw agswVar) {
        super(2, agswVar);
        this.b = jhhVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jgq) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            fjn fjnVar = (fjn) this.b.p.a();
            this.a = 1;
            Object objB = fjnVar.a.b(new agux() { // from class: fjj
                @Override // defpackage.agux
                public final Object a(Object obj2) {
                    fnp fnpVar = (fnp) obj2;
                    fnpVar.getClass();
                    fnz fnzVar = fnpVar.g;
                    if (fnzVar == null) {
                        fnzVar = fnz.a;
                    }
                    if (fnzVar.d) {
                        return fnpVar;
                    }
                    fno fnoVar = new fno();
                    fnoVar.B(fnpVar);
                    fnz fnzVarE = fnq.e(fnoVar);
                    fny fnyVar = new fny();
                    fnyVar.B(fnzVarE);
                    if ((fnyVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        fnyVar.y();
                    }
                    ((fnz) fnyVar.b).d = true;
                    fnz fnzVarA = foa.a(fnyVar);
                    if ((fnoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        fnoVar.y();
                    }
                    fnp fnpVar2 = (fnp) fnoVar.b;
                    fnpVar2.g = fnzVarA;
                    fnpVar2.b |= 16;
                    return fnq.c(fnoVar);
                }
            }, this);
            if (objB != agtgVar) {
                objB = agpu.a;
            }
            if (objB == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new jgq(this.b, agswVar);
    }
}
