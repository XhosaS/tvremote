package defpackage;

import android.text.TextUtils;
import androidx.leanback.widget.SearchBar;

/* compiled from: PG */
/* loaded from: classes.dex */
public class azz implements Runnable {
    final /* synthetic */ SearchBar a;

    public azz(SearchBar searchBar) {
        this.a = searchBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchBar searchBar = this.a;
        String string = searchBar.a.getText().toString();
        if (TextUtils.equals(searchBar.c, string)) {
            return;
        }
        searchBar.c = string;
    }
}
