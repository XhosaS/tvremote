package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.apps.tvsearch.searchbar.SearchBar;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hvo implements TextWatcher {
    final /* synthetic */ SearchBar a;

    public hvo(SearchBar searchBar) {
        this.a = searchBar;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.e().fullScroll(66);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
