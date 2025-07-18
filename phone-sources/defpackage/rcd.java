package defpackage;

import android.support.v7.recyclerview.extensions.AsyncDifferConfig;
import android.support.v7.recyclerview.extensions.ListAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.onegoogle.accountmenu.bento.viewbindings.cards.CardStackRecyclerView;
import com.google.android.videos.R;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rcd extends ListAdapter {
    private final rcf a;
    private final cb b;

    public rcd(cb cbVar, rcf rcfVar, ExecutorService executorService) {
        AsyncDifferConfig.Builder builder = new AsyncDifferConfig.Builder(new rcc());
        builder.setBackgroundThreadExecutor(executorService);
        super(builder.build());
        this.b = cbVar;
        this.a = rcfVar;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        viewHolder.getClass();
        Object item = getItem(i);
        item.getClass();
        this.a.c((rcg) viewHolder, item);
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, yfo] */
    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.og_bento_card_stack, viewGroup, false);
        Object objB = this.b.a.b();
        ((CardStackRecyclerView) viewInflate.findViewById(R.id.og_bento_card_stack_content)).setAdapter((RecyclerView.Adapter) objB);
        viewInflate.getClass();
        return new rcg(viewInflate, (rcb) objB);
    }
}
