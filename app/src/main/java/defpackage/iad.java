package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.tvsearch.searchbar.suggestions.SuggestionsScrollView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iad extends afn {
    final String a;
    final ViewGroup b;

    public iad(ViewGroup viewGroup) {
        super(afn.c);
        this.b = viewGroup;
        this.a = viewGroup.getResources().getString(R.string.suggestion_chip_click_action_description);
    }

    @Override // defpackage.afn
    public final void c(View view, ajr ajrVar) {
        super.c(view, ajrVar);
        ajrVar.c(new ajo(null, 16, this.a, null, null));
        int iG = SuggestionsScrollView.g(view);
        if (iG >= 0) {
            ajrVar.e(ajq.b(0, 1, iG, 1, this.b.getFocusedChild() == view));
        }
    }
}
