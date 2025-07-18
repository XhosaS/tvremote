package defpackage;

import android.support.v7.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tbw {
    public final TabLayout a;
    public final ViewPager2 b;
    public RecyclerView.Adapter c;
    public boolean d;
    public tbu e;
    public tbm f;
    public RecyclerView.AdapterDataObserver g;
    private final pku h;

    public tbw(TabLayout tabLayout, ViewPager2 viewPager2, pku pkuVar) {
        this.a = tabLayout;
        this.b = viewPager2;
        this.h = pkuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        TabLayout tabLayout = this.a;
        tabLayout.i();
        RecyclerView.Adapter adapter = this.c;
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                tbq tbqVarD = tabLayout.d();
                wlf wlfVarA = ((kap) this.h.a).a();
                wop wopVar = (wop) (wlfVarA.c == 4 ? (woq) wlfVarA.d : woq.a).b.get(i);
                wopVar.getClass();
                tbqVarD.c(wopVar.d);
                tbqVarD.h.setTag(wopVar.c);
                tabLayout.f(tbqVarD, false);
            }
            if (itemCount > 0) {
                int iMin = Math.min(this.b.a, tabLayout.b() - 1);
                if (iMin != tabLayout.a()) {
                    tabLayout.k(tabLayout.c(iMin));
                }
            }
        }
    }
}
