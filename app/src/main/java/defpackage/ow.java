package defpackage;

import android.widget.AbsListView;

/* compiled from: PG */
/* loaded from: classes.dex */
class ow implements AbsListView.OnScrollListener {
    final /* synthetic */ oz a;

    public ow(oz ozVar) {
        this.a = ozVar;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            oz ozVar = this.a;
            if (ozVar.v() || ozVar.q.getContentView() == null) {
                return;
            }
            oy oyVar = ozVar.n;
            ozVar.o.removeCallbacks(oyVar);
            oyVar.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
