package defpackage;

import android.content.Context;
import android.support.v7.recyclerview.extensions.AsyncDifferConfig;
import android.support.v7.recyclerview.extensions.ListAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.libraries.onegoogle.accountmenu.bento.viewbindings.cards.CardFrameLayout;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.videos.R;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rcb extends ListAdapter {
    private final rci a;
    private final rzy b;
    private final cb c;

    public rcb(rzy rzyVar, rci rciVar, cb cbVar, ExecutorService executorService) {
        AsyncDifferConfig.Builder builder = new AsyncDifferConfig.Builder(new rca());
        builder.setBackgroundThreadExecutor(executorService);
        super(builder.build());
        this.b = rzyVar;
        this.a = rciVar;
        this.c = cbVar;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        vqv vqvVar = (vqv) getItem(i);
        if (vqvVar instanceof vqw) {
            return 0;
        }
        if (vqvVar instanceof vqx) {
            return 1;
        }
        throw new yfu();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        viewHolder.getClass();
        vqv vqvVar = (vqv) getItem(i);
        if (vqvVar instanceof vqw) {
            this.a.c((rcj) viewHolder, ((vqw) vqvVar).a);
        } else {
            if (!(vqvVar instanceof vqx)) {
                throw new yfu();
            }
            throw null;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        if (i == 0) {
            return this.b.t(viewGroup);
        }
        if (i != 1) {
            throw new IllegalArgumentException("Unexpected card type");
        }
        cb cbVar = this.c;
        Context context = viewGroup.getContext();
        context.getClass();
        rcx rcxVar = new rcx(context);
        rzy rzyVar = (rzy) cbVar.a;
        rcj rcjVarT = rzyVar.t(rcxVar);
        rcj rcjVarT2 = rzyVar.t(rcxVar);
        CardFrameLayout cardFrameLayout = rcjVarT.a;
        CardFrameLayout cardFrameLayout2 = rcjVarT2.a;
        rcxVar.removeAllViews();
        rcxVar.b = cardFrameLayout;
        rcxVar.c = cardFrameLayout2;
        MaterialDivider materialDivider = new MaterialDivider(rcxVar.getContext());
        materialDivider.a(sip.d(materialDivider.getContext(), R.attr.colorSurfaceContainer, 0));
        rcxVar.a = materialDivider;
        rcxVar.setOrientation(0);
        rcxVar.setWeightSum(2.0f);
        CardFrameLayout cardFrameLayout3 = rcxVar.b;
        View view = null;
        if (cardFrameLayout3 == null) {
            yks.c("firstRowChild");
            cardFrameLayout3 = null;
        }
        rcxVar.a(cardFrameLayout3, new LinearLayout.LayoutParams(0, -2, 1.0f));
        View view2 = rcxVar.a;
        if (view2 == null) {
            yks.c("divider");
        } else {
            view = view2;
        }
        rcxVar.a(view, new LinearLayout.LayoutParams(rcxVar.getResources().getDimensionPixelSize(R.dimen.og_bento_card_stack_divider_width), -1));
        rcxVar.a(cardFrameLayout2, new LinearLayout.LayoutParams(0, -2, 1.0f));
        return new rbx(rcxVar);
    }
}
