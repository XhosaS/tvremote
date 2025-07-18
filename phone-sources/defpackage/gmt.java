package defpackage;

import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmt extends PagerSnapHelper {
    final /* synthetic */ ViewPager2 a;

    public gmt(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    @Override // android.support.v7.widget.PagerSnapHelper, android.support.v7.widget.SnapHelper
    public final View findSnapView(RecyclerView.LayoutManager layoutManager) {
        this.a.k();
        return super.findSnapView(layoutManager);
    }
}
