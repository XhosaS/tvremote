package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.apps.play.movies.mobileux.view.widget.LeadingEdgeSnapRecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nbq extends RecyclerView.OnScrollListener {
    final /* synthetic */ LeadingEdgeSnapRecyclerView a;

    public nbq(LeadingEdgeSnapRecyclerView leadingEdgeSnapRecyclerView) {
        this.a = leadingEdgeSnapRecyclerView;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005e  */
    @Override // android.support.v7.widget.RecyclerView.OnScrollListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onScrollStateChanged(android.support.v7.widget.RecyclerView r12, int r13) {
        /*
            r11 = this;
            com.google.android.apps.play.movies.mobileux.view.widget.LeadingEdgeSnapRecyclerView r12 = r11.a
            boolean r0 = r12.e
            if (r0 == 0) goto L8
            goto L83
        L8:
            r0 = 2
            r1 = 1
            if (r13 == r0) goto Lf
            r12.a(r1)
        Lf:
            r2 = 0
            if (r13 != 0) goto L14
            r13 = r1
            goto L15
        L14:
            r13 = r2
        L15:
            if (r13 == 0) goto L20
            boolean r3 = r12.b
            if (r3 != 0) goto L20
            int r3 = r12.c
            r12.smoothScrollBy(r3, r2)
        L20:
            r12.b = r13
            if (r13 == 0) goto L83
            android.support.v7.widget.RecyclerView$LayoutManager r13 = r12.getLayoutManager()
            android.support.v7.widget.LinearLayoutManager r13 = (android.support.v7.widget.LinearLayoutManager) r13
            int r3 = r13.findFirstVisibleItemPosition()
            r4 = -1
            if (r3 == r4) goto L78
            int r5 = r13.findLastVisibleItemPosition()
            r7 = r2
            r6 = r4
        L37:
            if (r3 > r5) goto L74
            if (r3 < 0) goto L71
            android.view.View r8 = r13.findViewByPosition(r3)
            int r9 = r12.d
            int r10 = r8.getWidth()
            int r10 = r10 / r0
            int r9 = r9 + r10
            int r10 = r8.getLeft()
            int r10 = r9 - r10
            int r8 = r8.getRight()
            int r8 = r8 - r9
            if (r10 < 0) goto L5a
            if (r8 <= 0) goto L57
            goto L7d
        L57:
            if (r6 < 0) goto L5e
            goto L5c
        L5a:
            if (r6 < 0) goto L5e
        L5c:
            r9 = r2
            goto L5f
        L5e:
            r9 = r1
        L5f:
            int r10 = java.lang.Math.abs(r10)
            int r8 = java.lang.Math.abs(r8)
            int r8 = java.lang.Math.min(r10, r8)
            if (r1 == r9) goto L6f
            if (r8 >= r7) goto L71
        L6f:
            r6 = r3
            r7 = r8
        L71:
            int r3 = r3 + 1
            goto L37
        L74:
            if (r6 < 0) goto L78
            r3 = r6
            goto L7d
        L78:
            int r3 = r12.a
            if (r3 >= 0) goto L7d
            r3 = r4
        L7d:
            if (r3 >= 0) goto L80
            goto L81
        L80:
            r4 = r3
        L81:
            r12.a = r4
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nbq.onScrollStateChanged(android.support.v7.widget.RecyclerView, int):void");
    }
}
