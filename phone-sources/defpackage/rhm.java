package defpackage;

import android.content.res.Resources;
import android.support.v7.util.SortedList;
import android.support.v7.widget.RecyclerView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rhm extends RecyclerView.AdapterDataObserver {
    final /* synthetic */ rdz a;
    final /* synthetic */ RecyclerView b;
    final /* synthetic */ rhp c;

    public rhm(rhp rhpVar, rdz rdzVar, RecyclerView recyclerView) {
        this.a = rdzVar;
        this.b = recyclerView;
        this.c = rhpVar;
    }

    public final void a() throws Resources.NotFoundException {
        int dimensionPixelSize = this.c.getResources().getDimensionPixelSize(R.dimen.og_account_menu_top_cards_top_spacing);
        rdz rdzVar = this.a;
        SortedList sortedList = rdzVar.a;
        if (sortedList.size() != 0) {
            tst tstVarA = rdzVar.a(((Integer) sortedList.get(0)).intValue());
            if (tstVarA.g()) {
                if (((rej) tstVarA.c()).equals(rej.ALWAYS_HIDE_DIVIDER_CARD)) {
                    dimensionPixelSize = 0;
                }
            }
        }
        this.b.setPadding(0, dimensionPixelSize, 0, 0);
    }

    @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
    public final void onChanged() throws Resources.NotFoundException {
        a();
    }

    @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeInserted(int i, int i2) throws Resources.NotFoundException {
        a();
    }

    @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeRemoved(int i, int i2) throws Resources.NotFoundException {
        a();
    }
}
