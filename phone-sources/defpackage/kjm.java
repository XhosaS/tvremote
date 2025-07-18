package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.google.android.apps.googletv.app.presentation.views.horizontalchannelrecyclerview.HorizontalChannelRecyclerView;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kjm extends sdc {
    private WeakReference d;

    public kjm() {
        super(null);
    }

    private final HorizontalChannelRecyclerView f() {
        WeakReference weakReference = this.d;
        if (weakReference == null) {
            yks.c("recyclerViewRef");
            weakReference = null;
        }
        Object obj = weakReference.get();
        obj.getClass();
        return (HorizontalChannelRecyclerView) obj;
    }

    @Override // defpackage.sdc
    /* renamed from: a */
    public final void onBindViewHolder(sdd sddVar, int i) {
        sddVar.getClass();
        ViewGroup.LayoutParams layoutParams = sddVar.itemView.getLayoutParams();
        layoutParams.getClass();
        scf scfVarC = c(i);
        if (scfVarC == kjl.a) {
            layoutParams.width = f().b;
            layoutParams.height = -1;
            return;
        }
        if (scfVarC == kjl.b) {
            layoutParams.width = f().c;
            layoutParams.height = -1;
            return;
        }
        if (sddVar.getItemViewType() != 1) {
            float f = f().a;
            if (f == -1.0f) {
                throw new IllegalArgumentException("cardCountPerRow must be set for HorizontalChannelRecyclerView");
            }
            layoutParams.width = (int) ((f().getMeasuredWidth() - (f().b + f().c)) / f);
        }
        super.onBindViewHolder(sddVar, i);
    }

    @Override // defpackage.sdc
    public final void b(List list) {
        List listAn = yfm.an(list);
        listAn.add(0, kjl.a);
        listAn.add(kjl.b);
        super.b(listAn);
    }

    @Override // defpackage.sdc, android.support.v7.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        recyclerView.getClass();
        super.onAttachedToRecyclerView(recyclerView);
        if (!(recyclerView instanceof HorizontalChannelRecyclerView)) {
            throw new IllegalArgumentException("HorizontalClusterAdapter must be used with HorizontalClusterRecyclerView");
        }
        this.d = new WeakReference(recyclerView);
    }

    @Override // defpackage.sdc, android.support.v7.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        onBindViewHolder((sdd) viewHolder, i);
    }
}
