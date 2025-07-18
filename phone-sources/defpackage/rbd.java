package defpackage;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.support.v7.recyclerview.extensions.ListAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.videos.R;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rbd extends ListAdapter {
    public int a;
    public final vop b;
    private final rbb c;
    private final rbk d;
    private final cb e;

    public rbd(cb cbVar, rbb rbbVar, rbk rbkVar, ExecutorService executorService) {
        super(rdd.e(executorService));
        this.e = cbVar;
        this.c = rbbVar;
        this.d = rbkVar;
        this.a = 3;
        this.b = new vop(getCurrentList().size());
    }

    @Override // android.support.v7.recyclerview.extensions.ListAdapter, android.support.v7.widget.RecyclerView.Adapter
    public final int getItemCount() {
        int size = getCurrentList().size();
        int i = this.a;
        return size > i ? i : getCurrentList().size();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return (i != this.a + (-1) || getCurrentList().size() <= this.a) ? 0 : 1;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        viewHolder.getClass();
        if (getItemViewType(i) != 0) {
            this.d.c((ust) viewHolder, this.b);
            return;
        }
        Object item = getItem(i);
        item.getClass();
        this.c.c((ust) viewHolder, item);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        if (i == 0) {
            cb cbVar = this.e;
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.og_bento_header_account, viewGroup, false);
            viewInflate.getClass();
            Object obj = cbVar.a;
            View viewFindViewById = viewInflate.findViewById(R.id.og_bento_header_account_avatar);
            viewFindViewById.getClass();
            return new ust(viewInflate, rdd.o((ViewGroup) viewFindViewById));
        }
        if (i != 1) {
            throw new IllegalStateException("Unknown viewType in HeaderAvatarsAdapter.");
        }
        View viewInflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.og_bento_header_remaining_accounts_number, viewGroup, false);
        FrameLayout frameLayout = (FrameLayout) viewInflate2.findViewById(R.id.og_bento_remaining_accounts_number_avatar_container);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(sip.d(viewGroup.getContext(), R.attr.colorPrimaryContainer, 0));
        int[] iArr = cww.a;
        frameLayout.setBackground(shapeDrawable);
        viewInflate2.getClass();
        View viewFindViewById2 = viewInflate2.findViewById(R.id.og_bento_remaining_accounts_number_avatar_text);
        viewFindViewById2.getClass();
        return new ust(viewInflate2, (TextView) viewFindViewById2);
    }

    @Override // android.support.v7.recyclerview.extensions.ListAdapter
    public final void submitList(List<vpg> list) {
        super.submitList(list);
        this.b.b = list != null ? list.size() : 0;
    }
}
