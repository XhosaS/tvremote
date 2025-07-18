package defpackage;

import android.os.CancellationSignal;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vsc extends agtu implements agvb {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ agte e;
    final /* synthetic */ agux f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vsc(agte agteVar, agux aguxVar, agsw agswVar) {
        super(2, agswVar);
        this.e = agteVar;
        this.f = aguxVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vsc) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.agto
    public final Object b(Object obj) throws Throwable {
        ahdn ahdnVar;
        agte agteVar;
        Object obj2;
        agux aguxVar;
        agtg agtgVar = agtg.a;
        int i = this.d;
        if (i == 0) {
            agpl.b(obj);
            agtc agtcVar = ((ahbt) this.g).fs().get(ahdl.c);
            agtcVar.getClass();
            ahdnVar = new ahdn((ahdl) agtcVar);
            final CancellationSignal cancellationSignal = new CancellationSignal();
            ahdnVar.w(new agux() { // from class: vsa
                @Override // defpackage.agux
                public final Object a(Object obj3) {
                    cancellationSignal.cancel();
                    return agpu.a;
                }
            });
            agte agteVar2 = this.e;
            agux aguxVar2 = this.f;
            this.g = ahdnVar;
            this.a = cancellationSignal;
            this.b = agteVar2;
            this.c = aguxVar2;
            this.d = 1;
            if (wze.a(agteVar2, this) != agtgVar) {
                agteVar = agteVar2;
                aguxVar = aguxVar2;
                obj2 = cancellationSignal;
            }
        }
        if (i != 1) {
            agpl.b(obj);
            return obj;
        }
        Object obj3 = this.c;
        Object obj4 = this.b;
        Object obj5 = this.a;
        ahdnVar = (ahdn) this.g;
        agpl.b(obj);
        aguxVar = obj3;
        agteVar = obj4;
        obj2 = obj5;
        agte agteVarA = wtr.a(agteVar);
        vsb vsbVar = new vsb(null, aguxVar, (CancellationSignal) obj2, ahdnVar);
        this.g = null;
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = 2;
        Object objA = ahal.a(agteVarA, vsbVar, this);
        return objA == agtgVar ? agtgVar : objA;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        vsc vscVar = new vsc(this.e, this.f, agswVar);
        vscVar.g = obj;
        return vscVar;
    }
}
