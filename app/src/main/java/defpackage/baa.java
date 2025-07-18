package defpackage;

import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import androidx.leanback.widget.SearchBar;

/* compiled from: PG */
/* loaded from: classes.dex */
public class baa implements TextWatcher {
    final /* synthetic */ Runnable a;
    final /* synthetic */ SearchBar b;

    public baa(SearchBar searchBar, Runnable runnable) {
        this.b = searchBar;
        this.a = runnable;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Handler handler = this.b.d;
        Runnable runnable = this.a;
        handler.removeCallbacks(runnable);
        handler.post(runnable);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
