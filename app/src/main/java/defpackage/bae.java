package defpackage;

import android.view.View;
import androidx.leanback.widget.SearchBar;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bae implements View.OnClickListener {
    final /* synthetic */ SearchBar a;

    public bae(SearchBar searchBar) {
        this.a = searchBar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.b();
    }
}
