package defpackage;

import android.widget.AbsListView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hx implements AbsListView.OnScrollListener {
    final /* synthetic */ hz a;

    public hx(hz hzVar) {
        this.a = hzVar;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            hz hzVar = this.a;
            if (hzVar.w() || hzVar.q.getContentView() == null) {
                return;
            }
            ac acVar = hzVar.r;
            hzVar.o.removeCallbacks(acVar);
            acVar.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
