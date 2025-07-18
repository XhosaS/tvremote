package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.util.SortedList;
import android.support.v7.widget.RecyclerView;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rdz extends RecyclerView.Adapter {
    public ImmutableList b;
    private final Context c;
    private final qvh d;
    private final dvs e;
    private final rhu f;
    private final rjg g;
    private final reu h;
    private final dvw i;
    private final int j;
    private dvk k;
    private ImmutableList l;
    public final SortedList a = new SortedList(Integer.class, new rdw(this));
    private final rdd m = new rdx(this);

    public rdz(Context context, qvh qvhVar, dvs dvsVar, rhu rhuVar, rjg rjgVar, int i) throws Resources.NotFoundException {
        this.c = context;
        Drawable drawableY = rrx.Y(context);
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.account_menu_account_list_action_item_padding_start);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.account_menu_account_list_action_item_icon_margin);
        this.h = new reu(drawableY, dimensionPixelSize + dimensionPixelSize2 + dimensionPixelSize2 + resources.getDimensionPixelSize(R.dimen.account_menu_account_list_action_item_icon_size) + resources.getDimensionPixelSize(R.dimen.account_menu_account_list_action_item_title_margin_start) + i);
        this.d = qvhVar;
        this.e = dvsVar;
        this.b = ImmutableList.of();
        this.f = rhuVar;
        this.g = rjgVar;
        this.l = ImmutableList.of();
        this.j = i;
        this.i = new rdg(this, qvhVar, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void c(ImmutableList immutableList) {
        UnmodifiableIterator it = immutableList.iterator();
        while (it.hasNext()) {
            ((rdu) it.next()).f(this.k);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final tst a(int i) {
        rdu rduVar = (rdu) this.l.get(i);
        return rduVar instanceof rem ? ((rem) rduVar).x : trk.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(Object obj) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        UnmodifiableIterator it = this.b.iterator();
        while (it.hasNext()) {
            rdu rduVarA = ((rdn) it.next()).a.a(obj);
            if (rduVarA != null) {
                rduVarA.h = this.f;
                rduVarA.j();
                builder.add((ImmutableList.Builder) rduVarA);
            }
        }
        ImmutableList immutableListBuild = builder.build();
        c(this.l);
        this.a.clear();
        this.l = immutableListBuild;
        for (int i = 0; i < immutableListBuild.size(); i++) {
            ((rdu) immutableListBuild.get(i)).d(this.k, new rdy(this, i));
        }
        notifyDataSetChanged();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.a.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        int i2;
        rdu rduVar = (rdu) this.l.get(((Integer) this.a.get(i)).intValue());
        if (rduVar instanceof rdr) {
            i2 = 4;
        } else if ((rduVar instanceof reh) || (rduVar instanceof ree)) {
            i2 = 2;
        } else if (rduVar instanceof rdh) {
            i2 = 3;
        } else {
            if (!(rduVar instanceof rem)) {
                throw new IllegalArgumentException("Unsupported card type");
            }
            i2 = 1;
        }
        return i2 - 1;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        recyclerView.addItemDecoration(this.h);
        this.k = cr.d(recyclerView);
        qvh qvhVar = this.d;
        rdd rddVar = this.m;
        qvhVar.c(rddVar);
        rddVar.b(qvhVar.a());
        this.e.d(this.k, this.i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        rdv rdvVar = (rdv) viewHolder;
        rdvVar.f(this.k, (rdu) this.l.get(((Integer) this.a.get(i)).intValue()));
        Integer num = (Integer) rdvVar.itemView.getTag(R.id.og_card_highlight_id_tag);
        if (num != null) {
            num.intValue();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // android.support.v7.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r7, int r8) {
        /*
            r6 = this;
            r0 = 4
            r1 = 1
            r2 = 2
            r3 = 3
            int[] r0 = new int[]{r1, r2, r3, r0}
            r8 = r0[r8]
            int r0 = r8 + (-1)
            r4 = 0
            if (r8 == 0) goto L4e
            rjg r8 = r6.g
            android.content.Context r5 = r6.c
            if (r0 == 0) goto L2d
            if (r0 == r1) goto L27
            if (r0 == r2) goto L2d
            if (r0 != r3) goto L21
            rds r0 = new rds
            r0.<init>(r7, r5, r8)
            goto L32
        L21:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            r7.<init>(r4, r4)
            throw r7
        L27:
            ref r0 = new ref
            r0.<init>(r7, r5, r8)
            goto L32
        L2d:
            rer r0 = new rer
            r0.<init>(r7, r5, r8)
        L32:
            int r7 = r6.j
            int[] r8 = defpackage.cww.a
            com.google.android.libraries.onegoogle.accountmenu.cards.DynamicCardRootView r8 = r0.c
            int r1 = r8.getPaddingStart()
            int r1 = r1 + r7
            int r2 = r8.getPaddingTop()
            int r3 = r8.getPaddingEnd()
            int r3 = r3 + r7
            int r7 = r8.getPaddingBottom()
            r8.setPaddingRelative(r1, r2, r3, r7)
            return r0
        L4e:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rdz.onCreateViewHolder(android.view.ViewGroup, int):android.support.v7.widget.RecyclerView$ViewHolder");
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.d.d(this.m);
        recyclerView.removeItemDecoration(this.h);
        this.e.i(this.i);
        c(this.l);
        this.a.clear();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        ((rdv) viewHolder).c(this.k);
    }
}
