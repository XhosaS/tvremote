package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tib {
    public RecyclerView.Recycler a;
    public RecyclerView.State b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public final /* synthetic */ SpannedGridLayoutManager i;

    public tib(SpannedGridLayoutManager spannedGridLayoutManager) {
        this.i = spannedGridLayoutManager;
    }

    public final boolean a() {
        int iC;
        if (this.f) {
            iC = this.i.b.c(this.c);
            this.c = iC;
        } else {
            tic ticVar = this.i.b;
            int i = this.c;
            int iA = ticVar.a(i);
            while (i > 0 && ticVar.a(i) == iA) {
                i--;
            }
            iC = ticVar.a(i) == iA ? -1 : i;
            this.c = iC;
        }
        return this.i.b.f(iC);
    }
}
