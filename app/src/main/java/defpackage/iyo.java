package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iyo extends agtu implements agvb {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    int f;
    final /* synthetic */ xtv g;
    final /* synthetic */ Optional h;
    final /* synthetic */ iyq i;
    final /* synthetic */ iyg j;
    final /* synthetic */ izq k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iyo(izq izqVar, xtv xtvVar, Optional optional, iyq iyqVar, iyg iygVar, agsw agswVar) {
        super(2, agswVar);
        this.k = izqVar;
        this.g = xtvVar;
        this.h = optional;
        this.i = iyqVar;
        this.j = iygVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((iyo) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        agtg agtgVar = agtg.a;
        int i = this.f;
        if (i == 0) {
            agpl.b(obj);
            izq izqVar = this.k;
            xtv xtvVar = this.g;
            Optional optional = this.h;
            iyq iyqVar = this.i;
            this.a = izqVar;
            this.b = xtvVar;
            this.c = optional;
            this.f = 1;
            Object objB = iyqVar.c.b(this);
            if (objB != agtgVar) {
                obj2 = izqVar;
                obj = objB;
                obj3 = optional;
                obj4 = xtvVar;
            }
            return agtgVar;
        }
        if (i != 1) {
            obj6 = this.e;
            obj5 = this.d;
            obj3 = this.c;
            obj4 = this.b;
            obj2 = this.a;
            agpl.b(obj);
            iyg iygVar = this.j;
            Optional optional2 = (Optional) obj;
            obj4.getClass();
            obj3.getClass();
            obj5.getClass();
            obj6.getClass();
            optional2.getClass();
            izq izqVar2 = (izq) obj2;
            ahal.e(izqVar2.b, null, 0, new izp(izqVar2, iygVar, (xtv) obj4, (Optional) obj5, (Optional) obj6, (Optional) obj3, optional2, null), 3);
            return agpu.a;
        }
        Object obj7 = this.c;
        Object obj8 = this.b;
        Object obj9 = this.a;
        agpl.b(obj);
        obj2 = obj9;
        obj4 = obj8;
        obj3 = obj7;
        iyq iyqVar2 = this.i;
        Optional optional3 = this.h;
        Optional optionalOf = Optional.of(obj);
        Optional optionalEmpty = Optional.empty();
        this.a = obj2;
        this.b = obj4;
        this.c = obj3;
        this.d = optionalOf;
        this.e = optionalEmpty;
        this.f = 2;
        Object objD = iyqVar2.d(optional3, this);
        if (objD != agtgVar) {
            obj5 = optionalOf;
            obj = objD;
            obj6 = optionalEmpty;
            iyg iygVar2 = this.j;
            Optional optional22 = (Optional) obj;
            obj4.getClass();
            obj3.getClass();
            obj5.getClass();
            obj6.getClass();
            optional22.getClass();
            izq izqVar22 = (izq) obj2;
            ahal.e(izqVar22.b, null, 0, new izp(izqVar22, iygVar2, (xtv) obj4, (Optional) obj5, (Optional) obj6, (Optional) obj3, optional22, null), 3);
            return agpu.a;
        }
        return agtgVar;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new iyo(this.k, this.g, this.h, this.i, this.j, agswVar);
    }
}
