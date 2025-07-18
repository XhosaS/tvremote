package defpackage;

import com.google.android.apps.tvsearch.preferences.fragment.searchable.SearchableAppsPreferenceFragment;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hbg implements Comparator {
    final /* synthetic */ SearchableAppsPreferenceFragment a;

    public hbg(SearchableAppsPreferenceFragment searchableAppsPreferenceFragment) {
        this.a = searchableAppsPreferenceFragment;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        SearchableAppsPreferenceFragment searchableAppsPreferenceFragment = this.a;
        return agsm.a(SearchableAppsPreferenceFragment.aQ((jba) obj, searchableAppsPreferenceFragment), SearchableAppsPreferenceFragment.aQ((jba) obj2, searchableAppsPreferenceFragment));
    }
}
