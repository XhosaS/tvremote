package defpackage;

import androidx.leanback.widget.SearchBar;

/* compiled from: PG */
/* loaded from: classes.dex */
class bac implements Runnable {
    final /* synthetic */ bad a;

    public bac(bad badVar) {
        this.a = badVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchBar searchBar = this.a.a;
        searchBar.e = true;
        searchBar.b.requestFocus();
    }
}
