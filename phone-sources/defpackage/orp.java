package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.bind.card.BindRecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class orp extends RecyclerView.OnScrollListener {
    private int a;
    private int b;
    private int c;
    private int d;

    @Override // android.support.v7.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        int iComputeVerticalScrollRange = recyclerView.computeVerticalScrollRange();
        if (iComputeVerticalScrollRange == 0 || recyclerView.getHeight() == 0) {
            return;
        }
        if (iComputeVerticalScrollOffset == 0) {
            this.c = 0;
            this.a = iComputeVerticalScrollRange;
            this.b = 0;
        } else if (this.a != iComputeVerticalScrollRange) {
            BindRecyclerView bindRecyclerView = (BindRecyclerView) recyclerView;
            int i3 = this.c;
            int i4 = this.b;
            int iComputeVerticalScrollOffset2 = bindRecyclerView.computeVerticalScrollOffset();
            this.a = bindRecyclerView.computeVerticalScrollRange();
            float f = (i3 * iComputeVerticalScrollOffset2) / i4;
            if (!Float.isNaN(f) && !Float.isInfinite(f)) {
                this.c = (int) f;
            }
        } else {
            this.c = Math.max(0, this.c + i2);
            this.b = iComputeVerticalScrollOffset;
        }
        if (iComputeVerticalScrollOffset > this.d) {
            this.d = iComputeVerticalScrollOffset;
        }
    }
}
