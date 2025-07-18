package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
final class glx extends agtu implements agvb {
    int a;
    final /* synthetic */ gly b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public glx(gly glyVar, agsw agswVar) {
        super(2, agswVar);
        this.b = glyVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((glx) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            int i2 = gly.c;
            gly glyVar = this.b;
            ztw ztwVar = glyVar.b;
            ztwVar.a();
            Instant instantA = ztwVar.a();
            instantA.getClass();
            this.a = 1;
            final abzy abzyVarB = acbk.b(instantA);
            Object objB = glyVar.a.a.b(new agux() { // from class: fjz
                @Override // defpackage.agux
                public final Object a(Object obj2) {
                    fnp fnpVar = (fnp) obj2;
                    fnpVar.getClass();
                    foq foqVar = fnpVar.l;
                    if (foqVar == null) {
                        foqVar = foq.a;
                    }
                    abzy abzyVar = foqVar.c;
                    if (abzyVar == null) {
                        abzyVar = abzy.a;
                    }
                    abzy abzyVar2 = abzyVarB;
                    if (agvy.c(abzyVar, abzyVar2)) {
                        return fnpVar;
                    }
                    fno fnoVar = new fno();
                    fnoVar.B(fnpVar);
                    foq foqVarH = fnq.h(fnoVar);
                    fop fopVar = new fop();
                    fopVar.B(foqVarH);
                    if ((fopVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        fopVar.y();
                    }
                    foq foqVar2 = (foq) fopVar.b;
                    foqVar2.c = abzyVar2;
                    foqVar2.b |= 1;
                    foq foqVarA = Cfor.a(fopVar);
                    if ((fnoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        fnoVar.y();
                    }
                    fnp fnpVar2 = (fnp) fnoVar.b;
                    fnpVar2.l = foqVarA;
                    fnpVar2.b |= 512;
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
        return new glx(this.b, agswVar);
    }
}
