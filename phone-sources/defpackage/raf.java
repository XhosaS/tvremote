package defpackage;

import android.support.v7.recyclerview.extensions.ListAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.videos.R;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class raf extends ListAdapter {
    private final raj a;
    private final aafi b;

    public raf(aafi aafiVar, raj rajVar, ExecutorService executorService) {
        super(rdd.e(executorService));
        this.b = aafiVar;
        this.a = rajVar;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        rak rakVar = (rak) viewHolder;
        rakVar.getClass();
        Object item = getItem(i);
        item.getClass();
        this.a.c(rakVar, item);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.og_bento_available_account, viewGroup, false);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(R.id.og_bento_available_account_card_container);
        FrameLayout frameLayout2 = (FrameLayout) viewInflate.findViewById(R.id.og_bento_available_account_trailing_container);
        viewInflate.getClass();
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        aafi aafiVar = this.b;
        Object obj = aafiVar.c;
        View viewFindViewById = constraintLayout.findViewById(R.id.og_bento_available_account_avatar);
        viewFindViewById.getClass();
        unx unxVarO = rdd.o((ViewGroup) viewFindViewById);
        View viewFindViewById2 = constraintLayout.findViewById(R.id.og_primary_account_information);
        viewFindViewById2.getClass();
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = constraintLayout.findViewById(R.id.og_secondary_account_information);
        viewFindViewById3.getClass();
        TextView textView2 = (TextView) viewFindViewById3;
        ttm ttmVarL = sij.l(new evk(aafiVar, frameLayout2, 5));
        frameLayout.getClass();
        frameLayout2.getClass();
        return new rak(constraintLayout, unxVarO, textView, textView2, ttmVarL, frameLayout2, frameLayout, sij.l(new evk(aafiVar, frameLayout, 6)));
    }
}
