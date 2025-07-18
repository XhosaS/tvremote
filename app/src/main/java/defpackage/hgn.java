package defpackage;

import com.google.android.apps.tvsearch.results.activity.SearchResultActivity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hgn extends agtu implements agvb {
    int a;
    final /* synthetic */ SearchResultActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgn(SearchResultActivity searchResultActivity, agsw agswVar) {
        super(2, agswVar);
        this.b = searchResultActivity;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hgn) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            jbd jbdVar = (jbd) this.b.au().a();
            this.a = 1;
            if (jbdVar.b(this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new hgn(this.b, agswVar);
    }
}
