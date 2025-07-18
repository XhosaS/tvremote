package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.leanback.widget.SearchBar;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bad implements TextView.OnEditorActionListener {
    final /* synthetic */ SearchBar a;

    public bad(SearchBar searchBar) {
        this.a = searchBar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3 && i == 0) {
            i = 0;
        }
        if (i != 2) {
            return false;
        }
        SearchBar searchBar = this.a;
        searchBar.a();
        searchBar.d.postDelayed(new bac(this), 500L);
        return true;
    }
}
