package defpackage;

import android.view.View;
import androidx.leanback.widget.SearchBar;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wh implements View.OnFocusChangeListener {
    final /* synthetic */ SearchBar a;
    private final /* synthetic */ int b;

    public wh(SearchBar searchBar, int i) {
        this.b = i;
        this.a = searchBar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (this.b != 0) {
            if (z) {
                SearchBar searchBar = this.a;
                searchBar.d.post(new ki(searchBar, 10, null));
            } else {
                this.a.a();
            }
            this.a.c(z);
            return;
        }
        if (z) {
            SearchBar searchBar2 = this.a;
            searchBar2.a();
            if (searchBar2.e) {
                searchBar2.b();
                searchBar2.e = false;
            }
        }
        this.a.c(z);
    }
}
