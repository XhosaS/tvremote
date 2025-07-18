package defpackage;

import androidx.preference.PreferenceScreen;
import com.google.android.apps.tvsearch.preferences.fragment.searchable.SearchableAppsPreferenceFragment;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hbh extends agtq {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public /* synthetic */ Object h;
    final /* synthetic */ SearchableAppsPreferenceFragment i;
    public int j;
    public PreferenceScreen k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hbh(SearchableAppsPreferenceFragment searchableAppsPreferenceFragment, agsw agswVar) {
        super(agswVar);
        this.i = searchableAppsPreferenceFragment;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.aP(this);
    }
}
