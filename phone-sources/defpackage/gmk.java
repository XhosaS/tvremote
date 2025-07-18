package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmk extends gmo {
    final /* synthetic */ ViewPager2 a;

    public gmk(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
    public final void onChanged() {
        ViewPager2 viewPager2 = this.a;
        viewPager2.b = true;
        viewPager2.e.e = true;
    }
}
