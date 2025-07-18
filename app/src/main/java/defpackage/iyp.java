package defpackage;

import j$.time.Duration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iyp extends agtu implements agvb {
    Object a;
    Object b;
    int c;
    final /* synthetic */ Duration d;
    final /* synthetic */ iyq e;
    final /* synthetic */ iyu f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iyp(Duration duration, iyq iyqVar, iyu iyuVar, agsw agswVar) {
        super(2, agswVar);
        this.d = duration;
        this.e = iyqVar;
        this.f = iyuVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((iyp) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.agto
    public final Object b(Object obj) {
        Object obj2;
        iyf iyfVar;
        agtg agtgVar = agtg.a;
        int i = this.c;
        if (i == 0) {
            agpl.b(obj);
            Duration duration = this.d;
            this.c = 1;
            if (zty.a(duration, this) != agtgVar) {
            }
            return agtgVar;
        }
        if (i != 1) {
            obj2 = this.b;
            Object obj3 = this.a;
            agpl.b(obj);
            iyfVar = obj3;
            Optional optionalOf = Optional.of(obj);
            iyfVar.getClass();
            iyu iyuVar = (iyu) obj2;
            ahal.e(iyuVar.a, null, 0, new iyt(iyuVar, iyfVar, optionalOf, null), 3);
            return agpu.a;
        }
        agpl.b(obj);
        iyq iyqVar = this.e;
        iyf iyfVar2 = new iyf(iyqVar.b);
        iyu iyuVar2 = this.f;
        this.a = iyfVar2;
        this.b = iyuVar2;
        this.c = 2;
        obj = iyqVar.c.b(this);
        if (obj != agtgVar) {
            obj2 = iyuVar2;
            iyfVar = iyfVar2;
            Optional optionalOf2 = Optional.of(obj);
            iyfVar.getClass();
            iyu iyuVar3 = (iyu) obj2;
            ahal.e(iyuVar3.a, null, 0, new iyt(iyuVar3, iyfVar, optionalOf2, null), 3);
            return agpu.a;
        }
        return agtgVar;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new iyp(this.d, this.e, this.f, agswVar);
    }
}
