package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import com.google.android.apps.play.movies.mobileux.component.playheaderlist.PlayHeaderListLayout;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mtz extends ifc implements iea {
    private final idf a;
    private final idt c = new idt(null);
    private final Object b = new Object();

    public mtz(idf idfVar) {
        this.a = idfVar;
    }

    public static int i(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.play_collection_card_half_spacing) * (-6);
    }

    public static int j(Context context) {
        return PlayHeaderListLayout.y(context, i(context), mjo.q(context));
    }

    @Override // defpackage.ieh
    public final Object a() {
        return this.b;
    }

    @Override // defpackage.ifc
    public final int b(Object obj) {
        return 1;
    }

    @Override // defpackage.ifc
    public final int c(Object obj, int i) {
        return R.layout.play_list_vspacer;
    }

    @Override // defpackage.ifc
    public final long d(Object obj, int i) {
        return ((Long) this.a.b(this.b)).longValue();
    }

    @Override // defpackage.ifc
    public final void e(Object obj, int i, RecyclerView.ViewHolder viewHolder) {
        tgh tghVar = (tgh) viewHolder.itemView.getLayoutParams();
        int iJ = j(viewHolder.itemView.getContext());
        if (thl.c(iJ)) {
            tghVar.c = iJ;
            return;
        }
        throw new IllegalArgumentException("Int length " + iJ + " out of range");
    }

    @Override // defpackage.ids
    public final void ea(iej iejVar) {
        this.c.ea(iejVar);
    }

    @Override // defpackage.ids
    public final void ee(iej iejVar) {
        this.c.ee(iejVar);
    }
}
