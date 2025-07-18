package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class hql extends uuq {
    final /* synthetic */ List a;
    final /* synthetic */ List b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hql(hqi hqiVar, hqg hqgVar, hqd hqdVar, int i, List list, List list2) {
        super(hqiVar, hqgVar, i);
        this.a = list;
        this.b = list2;
    }

    @Override // defpackage.uuq, defpackage.azm
    public final void s(azk azkVar, Object obj) {
        super.s(azkVar, obj);
        paq.c(azkVar.g, (pan) this.a.get(this.b.indexOf(obj)));
    }
}
