package defpackage;

import com.google.android.apps.tvsearch.results.suggestion.SuggestionChipList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxq implements zxe {
    final /* synthetic */ hxr a;

    public hxq(hxr hxrVar) {
        this.a = hxrVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        th.getClass();
        ((zdv) ((zdv) hxr.f.d()).p(th).q("com/google/android/apps/tvsearch/searchbar/activity/VoicePlateActivity$updateSuggestionChipsCallback$1", "onFailure", 542, "VoicePlateActivity.kt")).u("Failed to load suggestions.");
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        final SuggestionChipList suggestionChipList = (SuggestionChipList) obj;
        suggestionChipList.getClass();
        zdy zdyVar = hxr.f;
        final hxr hxrVar = this.a;
        hxrVar.E().post(new Runnable() { // from class: hwm
            @Override // java.lang.Runnable
            public final void run() {
                hxr hxrVar2 = hxrVar;
                int i = hxrVar2.as;
                if (i == 5 || i == 4) {
                    return;
                }
                hxrVar2.ag(suggestionChipList, true);
            }
        });
        int i = hxrVar.as;
        if (i == 4 || i == 5 || hxrVar.w != gph.b) {
            return;
        }
        hxrVar.L.x(suggestionChipList);
    }
}
