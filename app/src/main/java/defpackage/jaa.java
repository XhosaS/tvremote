package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jaa extends agtu implements agvb {
    int a;
    final /* synthetic */ List b;
    final /* synthetic */ jad c;
    final /* synthetic */ jae d;
    final /* synthetic */ jab e;
    final /* synthetic */ String f;
    final /* synthetic */ Set g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jaa(List list, jad jadVar, jae jaeVar, jab jabVar, String str, Set set, agsw agswVar) {
        super(2, agswVar);
        this.b = list;
        this.c = jadVar;
        this.d = jaeVar;
        this.e = jabVar;
        this.f = str;
        this.g = set;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jaa) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            ahbt ahbtVar = (ahbt) this.h;
            ArrayList arrayList = new ArrayList();
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                arrayList.add(ahal.e(ahbtVar, null, 0, new izz(this.e, (jba) it.next(), this.f, this.g, this.d, null), 3));
            }
            this.a = 1;
            if (ahah.b(arrayList, this) == agtgVar) {
                return agtgVar;
            }
        }
        this.c.ai(this.d);
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        jaa jaaVar = new jaa(this.b, this.c, this.d, this.e, this.f, this.g, agswVar);
        jaaVar.h = obj;
        return jaaVar;
    }
}
