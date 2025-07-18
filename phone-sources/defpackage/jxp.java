package defpackage;

import android.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxp extends RecyclerView.OnScrollListener {
    private final AppBarLayout a;
    private final jxo b;
    private boolean c;
    private boolean d;

    public jxp(AppBarLayout appBarLayout, jxo jxoVar) {
        appBarLayout.getClass();
        this.a = appBarLayout;
        this.b = jxoVar;
        this.c = true;
    }

    @Override // android.support.v7.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        recyclerView.getClass();
        if (!(recyclerView.getLayoutManager() instanceof LinearLayoutManager)) {
            if (this.d) {
                return;
            }
            AppBarLayout appBarLayout = this.a;
            appBarLayout.setBackgroundColor(sip.d(appBarLayout.getContext(), R.attr.colorBackground, -7829368));
            this.d = true;
            return;
        }
        if (this.d) {
            AppBarLayout appBarLayout2 = this.a;
            appBarLayout2.setBackground(appBarLayout2.getContext().getDrawable(com.google.android.videos.R.drawable.app_bar_background));
            this.d = false;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        Integer numValueOf = linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.findFirstVisibleItemPosition()) : null;
        if (numValueOf != null) {
            if (numValueOf.intValue() <= 1 && !this.c) {
                this.c = true;
                jxo jxoVar = this.b;
                if (jxoVar != null) {
                    jxoVar.i(true);
                    return;
                }
                return;
            }
            if (numValueOf.intValue() <= 1 || !this.c) {
                return;
            }
            this.c = false;
            jxo jxoVar2 = this.b;
            if (jxoVar2 != null) {
                jxoVar2.i(false);
            }
        }
    }
}
