package defpackage;

import com.google.android.apps.tvsearch.results.activity.SearchResultActivity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hgk implements zxe {
    final /* synthetic */ SearchResultActivity a;
    final /* synthetic */ String b;

    public hgk(SearchResultActivity searchResultActivity, String str) {
        this.a = searchResultActivity;
        this.b = str;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        th.getClass();
        ((zdv) ((zdv) SearchResultActivity.m.c()).p(th).q("com/google/android/apps/tvsearch/results/activity/SearchResultActivity$maybeExecuteASDebuggerTasks$1$1", "onFailure", 1614, "SearchResultActivity.kt")).x("Cannot create a file %s for the screenshot.", this.b);
        SearchResultActivity searchResultActivity = this.a;
        searchResultActivity.setResult(1002);
        searchResultActivity.finish();
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((agpu) obj).getClass();
        SearchResultActivity searchResultActivity = this.a;
        searchResultActivity.setResult(1001);
        searchResultActivity.finish();
    }
}
