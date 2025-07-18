package defpackage;

import com.google.android.apps.tvsearch.preferences.fragment.searchable.SearchableAppsPreferenceFragment;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hbi extends agtu implements agvb {
    int a;
    final /* synthetic */ SearchableAppsPreferenceFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hbi(SearchableAppsPreferenceFragment searchableAppsPreferenceFragment, agsw agswVar) {
        super(2, agswVar);
        this.b = searchableAppsPreferenceFragment;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hbi) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            SearchableAppsPreferenceFragment searchableAppsPreferenceFragment = this.b;
            this.a = 1;
            if (searchableAppsPreferenceFragment.aP(this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new hbi(this.b, agswVar);
    }
}
