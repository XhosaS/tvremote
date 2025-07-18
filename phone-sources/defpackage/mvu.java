package defpackage;

import android.database.DataSetObserver;
import android.util.SparseIntArray;
import android.widget.AbsListView;
import android.widget.Adapter;
import com.google.android.apps.play.movies.mobileux.component.playheaderlist.PlayHeaderListLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mvu implements AbsListView.OnScrollListener {
    public final PlayHeaderListLayout a;
    protected int b;
    private Adapter d;
    private int g;
    private final SparseIntArray[] e = {new SparseIntArray(), new SparseIntArray()};
    private int f = -1;
    private final DataSetObserver c = new mvt(this);

    public mvu(PlayHeaderListLayout playHeaderListLayout) {
        this.a = playHeaderListLayout;
    }

    private final SparseIntArray b() {
        return this.e[this.g];
    }

    private final void c(Adapter adapter) {
        Adapter adapter2 = this.d;
        if (adapter2 == adapter) {
            return;
        }
        if (adapter2 != null) {
            adapter2.unregisterDataSetObserver(this.c);
        }
        this.d = adapter;
        if (adapter != null) {
            adapter.registerDataSetObserver(this.c);
        }
        a(false);
    }

    public final void a(boolean z) {
        b().clear();
        this.f = -1;
        if (z) {
            c(null);
        }
        this.b = 0;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int i4;
        int i5;
        int iMin = Math.min(i2, i3);
        c(absListView.getAdapter());
        SparseIntArray sparseIntArrayB = b();
        SparseIntArray sparseIntArray = this.e[(this.g + 1) & 1];
        sparseIntArray.clear();
        int i6 = i;
        while (true) {
            i4 = i + iMin;
            if (i6 >= i4) {
                break;
            }
            sparseIntArray.put(i6, absListView.getChildAt(i6 - i).getTop());
            i6++;
        }
        int i7 = -1;
        while (true) {
            if (i >= i4) {
                i5 = 0;
                break;
            }
            i7 = sparseIntArrayB.get(i, -1);
            if (i7 != -1) {
                i5 = i7 - sparseIntArray.get(i);
                break;
            }
            i++;
        }
        this.g = (this.g + 1) & 1;
        int i8 = this.f;
        if (i8 == -1 || i7 == -1) {
            this.f = this.a.k(absListView);
        } else {
            this.f = i8 + i5;
        }
        this.a.p(this.b, i5, absListView.getChildCount() != 0 ? this.f : 0);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        c(absListView.getAdapter());
        this.b = i;
        this.a.q(i);
    }
}
