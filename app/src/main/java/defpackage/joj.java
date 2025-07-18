package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class joj extends agtu implements agvb {
    int a;
    final /* synthetic */ jot b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public joj(jot jotVar, agsw agswVar) {
        super(2, agswVar);
        this.b = jotVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((joj) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            jot jotVar = this.b;
            final String str = jotVar.r;
            this.a = 1;
            Object objB = jotVar.e.a.b(new agux() { // from class: frp
                @Override // defpackage.agux
                public final Object a(Object obj2) {
                    fxg fxgVar = (fxg) obj2;
                    fxgVar.getClass();
                    fxc fxcVar = new fxc();
                    fxcVar.B(fxgVar);
                    fxh.b(fxcVar);
                    acax acaxVarB = fxh.b(fxcVar);
                    String str2 = str;
                    Object objH = acaxVarB.get(str2);
                    if (objH == null) {
                        fxe fxeVar = fxe.a;
                        objH = fxi.h(new fxd());
                    }
                    fxd fxdVar = new fxd();
                    fxdVar.B((fxe) objH);
                    fwc fwcVar = fwc.a;
                    fwb fwbVar = new fwb();
                    int i2 = ((fwc) fwbVar.b).b + 1;
                    if ((fwbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        fwbVar.y();
                    }
                    ((fwc) fwbVar.b).b = i2;
                    abxd abxdVarV = fwbVar.v();
                    abxdVarV.getClass();
                    fwc fwcVar2 = (fwc) abxdVarV;
                    if ((fxdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        fxdVar.y();
                    }
                    fxe fxeVar2 = (fxe) fxdVar.b;
                    fxeVar2.f = fwcVar2;
                    fxeVar2.b |= 4;
                    fxh.f(str2, fxi.h(fxdVar), fxcVar);
                    return fxh.a(fxcVar);
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
        return new joj(this.b, agswVar);
    }
}
