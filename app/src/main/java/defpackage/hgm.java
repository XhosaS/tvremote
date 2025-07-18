package defpackage;

import com.google.android.apps.tvsearch.results.activity.SearchResultActivity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hgm extends ue {
    final /* synthetic */ SearchResultActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgm(SearchResultActivity searchResultActivity) {
        super(true);
        this.a = searchResultActivity;
    }

    @Override // defpackage.ue
    public final void b() {
        SearchResultActivity searchResultActivity = this.a;
        if (searchResultActivity.isFinishing()) {
            return;
        }
        searchResultActivity.ag().j(zpg.OPA_TV_CLICK_BACK_BUTTON, searchResultActivity.ab().b());
        if (((Boolean) searchResultActivity.at().a()).booleanValue()) {
            ((gfn) searchResultActivity.as().a()).a(rpm.B()).b().c();
        } else {
            searchResultActivity.af().a(rpm.B(), abqb.OK, null, null);
        }
        searchResultActivity.ax(true);
    }
}
