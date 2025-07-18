package defpackage;

import android.view.View;
import androidx.leanback.widget.SearchBar;

/* compiled from: PG */
/* loaded from: classes.dex */
public class azy implements View.OnFocusChangeListener {
    final /* synthetic */ SearchBar a;

    public azy(SearchBar searchBar) {
        this.a = searchBar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            SearchBar searchBar = this.a;
            searchBar.d.post(new bag(searchBar));
        } else {
            this.a.a();
        }
        this.a.c(z);
    }
}
