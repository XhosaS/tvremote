package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmp extends LinearLayoutManager {
    final /* synthetic */ ViewPager2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmp(ViewPager2 viewPager2, Context context) {
        super(context);
        this.a = viewPager2;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    protected final void calculateExtraLayoutSpace(RecyclerView.State state, int[] iArr) {
        int height;
        int paddingBottom;
        ViewPager2 viewPager2 = this.a;
        int i = viewPager2.g;
        if (i == -1) {
            super.calculateExtraLayoutSpace(state, iArr);
            return;
        }
        RecyclerView recyclerView = viewPager2.d;
        if (viewPager2.a() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        int i2 = (height - paddingBottom) * i;
        iArr[0] = i2;
        iArr[1] = i2;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, cyq cyqVar) {
        ViewPager2 viewPager2 = ((gms) this.a.h).b;
        cyqVar.w(cxe.j(viewPager2.a() == 1 ? viewPager2.c.getPosition(view) : 0, 1, viewPager2.a() == 0 ? viewPager2.c.getPosition(view) : 0, 1, false));
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }
}
