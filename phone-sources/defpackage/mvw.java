package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.apps.play.movies.mobileux.component.playheaderlist.PlayHeaderListLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mvw extends RecyclerView.OnScrollListener {
    public final PlayHeaderListLayout a;
    protected int b;
    private int c = -1;
    private final RecyclerView.AdapterDataObserver d = new mvv(this);
    private RecyclerView.Adapter e;

    public mvw(PlayHeaderListLayout playHeaderListLayout) {
        this.a = playHeaderListLayout;
    }

    private final void b(RecyclerView.Adapter adapter) {
        RecyclerView.Adapter adapter2 = this.e;
        if (adapter2 == adapter) {
            return;
        }
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(this.d);
        }
        this.e = adapter;
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.d);
        }
        a(false);
    }

    public final void a(boolean z) {
        this.c = -1;
        if (z) {
            b(null);
        }
        this.b = 0;
    }

    @Override // android.support.v7.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        b(recyclerView.getAdapter());
        this.b = i;
        this.a.q(i);
    }

    @Override // android.support.v7.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        b(recyclerView.getAdapter());
        PlayHeaderListLayout playHeaderListLayout = this.a;
        int iK = playHeaderListLayout.k(recyclerView);
        if (iK != -1) {
            this.c = iK;
        } else if (i2 == 0) {
            this.c = -1;
        } else {
            int i3 = this.c;
            if (i3 != -1) {
                iK = i3 + i2;
                this.c = iK;
            }
        }
        playHeaderListLayout.p(this.b, i2, recyclerView.getChildCount() == 0 ? 0 : this.c);
    }
}
