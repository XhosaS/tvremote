package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.libraries.play.movies.symbian.recyclerview.ModelAwareRecyclerView;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sda extends scb {
    public final dvk a;
    public scy b;
    private final RecyclerView c;
    private final Integer d;
    private sdc e;

    public sda(dvk dvkVar, RecyclerView recyclerView, Integer num) {
        this.a = dvkVar;
        this.c = recyclerView;
        this.d = num;
        if (recyclerView.getAdapter() == null) {
            byte[] bArr = null;
            ModelAwareRecyclerView modelAwareRecyclerView = recyclerView instanceof ModelAwareRecyclerView ? (ModelAwareRecyclerView) recyclerView : null;
            recyclerView.setAdapter(modelAwareRecyclerView != null ? modelAwareRecyclerView.a() : new sdc(bArr));
        }
        if (!(recyclerView.getAdapter() instanceof sdc)) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            Objects.toString(adapter);
            throw new IllegalArgumentException("RecyclerView accepts only RvBinderAdapter. Found ".concat(String.valueOf(adapter)));
        }
        RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
        adapter2.getClass();
        sdc sdcVar = (sdc) adapter2;
        this.e = sdcVar;
        sdcVar.a = this;
    }

    @Override // defpackage.scb
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        List list = (List) obj;
        scy scyVar = this.b;
        if (scyVar != null) {
            scyVar.c();
        }
        if (list instanceof gbb) {
            this.b = new scz(this.e, this.d);
        } else {
            this.b = new scx(this.e);
        }
        scy scyVar2 = this.b;
        if (scyVar2 != null) {
            scyVar2.a(list);
        }
    }

    @Override // defpackage.scb
    public final /* bridge */ /* synthetic */ void b() {
        scq scqVar;
        scy scyVar = this.b;
        if (scyVar != null) {
            scyVar.c();
        }
        sdc sdcVar = this.e;
        int itemCount = sdcVar.getItemCount();
        if (itemCount >= 0) {
            int i = 0;
            while (true) {
                RecyclerView recyclerView = sdcVar.b;
                if (recyclerView == null) {
                    yks.c("recyclerView");
                    recyclerView = null;
                }
                View childAt = recyclerView.getChildAt(i);
                if (childAt != null) {
                    RecyclerView recyclerView2 = sdcVar.b;
                    if (recyclerView2 == null) {
                        yks.c("recyclerView");
                        recyclerView2 = null;
                    }
                    RecyclerView.ViewHolder childViewHolder = recyclerView2.getChildViewHolder(childAt);
                    if ((childViewHolder instanceof sdd) && (scqVar = ((sdd) childViewHolder).b) != null) {
                        scqVar.b();
                    }
                }
                if (i == itemCount) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.c.setAdapter(null);
    }
}
