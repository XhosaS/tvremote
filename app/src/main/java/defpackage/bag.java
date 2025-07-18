package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.leanback.widget.SearchBar;

/* compiled from: PG */
/* loaded from: classes.dex */
class bag implements Runnable {
    final /* synthetic */ SearchBar a;

    public bag(SearchBar searchBar) {
        this.a = searchBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchBar searchBar = this.a;
        searchBar.a.requestFocusFromTouch();
        searchBar.a.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, searchBar.a.getWidth(), searchBar.a.getHeight(), 0));
        searchBar.a.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, searchBar.a.getWidth(), searchBar.a.getHeight(), 0));
    }
}
