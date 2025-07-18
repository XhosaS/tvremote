package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.google.android.apps.tvsearch.results.activity.SearchResultActivity;
import com.google.android.apps.tvsearch.results.suggestion.SuggestionChipList;
import com.google.android.apps.tvsearch.searchbar.suggestions.SuggestionsScrollView;
import com.google.android.katniss.R;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hgs implements hgp {
    final ffp a;
    final View b;
    final ViewTreeObserver.OnScrollChangedListener c;
    public final SuggestionsScrollView d;
    final iaj e;
    final hgc f;
    private final Supplier g;

    public hgs(Supplier supplier, ffp ffpVar, ViewGroup viewGroup, iaj iajVar, hgc hgcVar, hsu hsuVar) {
        this.g = supplier;
        this.a = ffpVar;
        this.e = iajVar;
        this.f = hgcVar;
        this.b = viewGroup.findViewById(R.id.suggestions_bar);
        SuggestionsScrollView suggestionsScrollView = (SuggestionsScrollView) viewGroup.findViewById(R.id.suggestions_scrollview);
        this.d = suggestionsScrollView;
        suggestionsScrollView.d = hsuVar;
        final View viewFindViewById = viewGroup.findViewById(R.id.suggestion_scroll_fade);
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: hgr
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                View view = viewFindViewById;
                if (view != null) {
                    view.setVisibility(this.a.d.getScrollX() == 0 ? 8 : 0);
                }
            }
        };
        this.c = onScrollChangedListener;
        suggestionsScrollView.getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
    }

    @Override // defpackage.hgp
    public final View a() {
        return this.b;
    }

    @Override // defpackage.hgp
    public final void b() {
        this.d.requestFocus(33);
    }

    @Override // defpackage.hgp
    public final void c() {
        this.a.t(23);
        this.e.a(this.b).start();
    }

    @Override // defpackage.hgp
    public final void d() {
        SuggestionsScrollView suggestionsScrollView = this.d;
        suggestionsScrollView.g = suggestionsScrollView.j();
    }

    @Override // defpackage.hgp
    public final void e() {
        SuggestionsScrollView suggestionsScrollView = this.d;
        suggestionsScrollView.e();
        if (suggestionsScrollView.getHasSuggestions()) {
            SearchResultActivity searchResultActivity = this.f.a;
            if (searchResultActivity.W != 1 || searchResultActivity.aM() == 3 || searchResultActivity.al().hasFocus()) {
                return;
            }
            searchResultActivity.ak().b();
        }
    }

    @Override // defpackage.hgp
    public final void f() {
        this.d.f();
    }

    @Override // defpackage.hgp
    public final void g() {
        iaj iajVar = this.e;
        View view = this.b;
        iajVar.b(view).start();
        if (view.hasFocus()) {
            return;
        }
        b();
    }

    @Override // defpackage.hgp
    public final void h(SuggestionChipList suggestionChipList) {
        if (((Boolean) this.g.get()).booleanValue()) {
            if (suggestionChipList.f) {
                this.d.c();
                this.a.t(31);
                return;
            }
            SuggestionsScrollView suggestionsScrollView = this.d;
            suggestionsScrollView.i();
            suggestionsScrollView.h(suggestionChipList);
            if (suggestionsScrollView.getHasSuggestions()) {
                suggestionsScrollView.d();
            }
            this.a.t(26);
        }
    }

    @Override // defpackage.hgp
    public final boolean i() {
        return this.b.getVisibility() != 8;
    }
}
