package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gml extends agtu implements agvb {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ hag e;
    final /* synthetic */ fmg f;
    final /* synthetic */ ztw g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gml(hag hagVar, fmg fmgVar, ztw ztwVar, agsw agswVar) {
        super(2, agswVar);
        this.e = hagVar;
        this.f = fmgVar;
        this.g = ztwVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gml) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.agto
    public final Object b(Object obj) {
        Object objG;
        ztw ztwVar;
        Object obj2;
        Object obj3;
        agtg agtgVar = agtg.a;
        if (this.d == 0) {
            agpl.b(obj);
            hag hagVar = this.e;
            fmg fmgVar = this.f;
            ztw ztwVar2 = this.g;
            objG = rbk.g();
            ((rbg) objG).d = 3;
            if (hagVar == hag.d) {
                this.a = objG;
                this.b = ztwVar2;
                this.c = objG;
                this.d = 1;
                obj = fmgVar.c(this);
                if (obj == agtgVar) {
                    return agtgVar;
                }
                ztwVar = ztwVar2;
                obj2 = objG;
                obj3 = obj2;
            }
            return ((rbj) objG).c();
        }
        obj2 = this.c;
        Object obj4 = this.b;
        Object obj5 = this.a;
        agpl.b(obj);
        ztwVar = obj4;
        obj3 = obj5;
        if (((Instant) obj).compareTo(ztwVar.a()) >= 0) {
            ((rbj) obj2).b(500);
        }
        objG = obj3;
        return ((rbj) objG).c();
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gml(this.e, this.f, this.g, agswVar);
    }
}
