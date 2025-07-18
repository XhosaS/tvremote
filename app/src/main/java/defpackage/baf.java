package defpackage;

import android.view.View;
import androidx.leanback.widget.SearchBar;

/* compiled from: PG */
/* loaded from: classes.dex */
public class baf implements View.OnFocusChangeListener {
    final /* synthetic */ SearchBar a;

    public baf(SearchBar searchBar) {
        this.a = searchBar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            SearchBar searchBar = this.a;
            searchBar.a();
            if (searchBar.e) {
                searchBar.b();
                searchBar.e = false;
            }
        }
        this.a.c(z);
    }
}
