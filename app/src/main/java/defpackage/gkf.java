package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gkf extends agtu implements agvb {
    final /* synthetic */ Duration a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gkf(Duration duration, agsw agswVar) {
        super(2, agswVar);
        this.a = duration;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gkf) c((xzy) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        xzy xzyVar = (xzy) this.b;
        ygd ygdVar = ygd.a;
        ygc ygcVar = new ygc();
        abwf abwfVarA = acbk.a(this.a);
        if ((ygcVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ygcVar.y();
        }
        ygd ygdVar2 = (ygd) ygcVar.b;
        ygdVar2.c = abwfVarA;
        ygdVar2.b |= 1;
        abxd abxdVarV = ygcVar.v();
        abxdVarV.getClass();
        yca ycaVar = xzyVar.a;
        ygd ygdVar3 = (ygd) abxdVarV;
        if ((ycaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycaVar.y();
        }
        ycb ycbVar = (ycb) ycaVar.b;
        ycb ycbVar2 = ycb.a;
        ycbVar.d = ygdVar3;
        ycbVar.c = 15;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        gkf gkfVar = new gkf(this.a, agswVar);
        gkfVar.b = obj;
        return gkfVar;
    }
}
