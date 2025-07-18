package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gjg extends agtu implements agvb {
    final /* synthetic */ Duration a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjg(Duration duration, String str, String str2, agsw agswVar) {
        super(2, agswVar);
        this.a = duration;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gjg) c((xzy) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        xzy xzyVar = (xzy) this.d;
        xzq xzqVar = xzq.a;
        xzp xzpVar = new xzp();
        yhd yhdVar = yhd.a;
        yhc yhcVar = new yhc();
        if ((yhcVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yhcVar.y();
        }
        String str = this.b;
        yhd yhdVar2 = (yhd) yhcVar.b;
        yhdVar2.b |= 1;
        yhdVar2.c = str;
        if ((yhcVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yhcVar.y();
        }
        String str2 = this.c;
        yhd yhdVar3 = (yhd) yhcVar.b;
        yhdVar3.b |= 2;
        yhdVar3.d = str2;
        yhd yhdVarA = yhe.a(yhcVar);
        if ((xzpVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xzpVar.y();
        }
        Duration duration = this.a;
        xzq xzqVar2 = (xzq) xzpVar.b;
        xzqVar2.c = yhdVarA;
        xzqVar2.b |= 1;
        long millis = duration.toMillis();
        if ((xzpVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xzpVar.y();
        }
        xzq xzqVar3 = (xzq) xzpVar.b;
        xzqVar3.b |= 2;
        xzqVar3.d = millis;
        abxd abxdVarV = xzpVar.v();
        abxdVarV.getClass();
        yca ycaVar = xzyVar.a;
        xzq xzqVar4 = (xzq) abxdVarV;
        if ((ycaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycaVar.y();
        }
        ycb ycbVar = (ycb) ycaVar.b;
        ycb ycbVar2 = ycb.a;
        ycbVar.d = xzqVar4;
        ycbVar.c = 26;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        gjg gjgVar = new gjg(this.a, this.b, this.c, agswVar);
        gjgVar.d = obj;
        return gjgVar;
    }
}
