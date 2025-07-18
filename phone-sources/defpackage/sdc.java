package defpackage;

import android.support.v7.recyclerview.extensions.AsyncListDiffer;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.videos.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class sdc extends RecyclerView.Adapter {
    public sda a;
    public RecyclerView b;
    public sdh c;
    private final AsyncListDiffer d;
    private final Map e;
    private final Map f;
    private final sdb g;

    public sdc() {
        this(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(sdd sddVar, int i) {
        sdg sdgVar;
        sddVar.getClass();
        scf scfVarC = c(i);
        if (scfVarC instanceof scl) {
            scl sclVar = (scl) scfVarC;
            sclVar.p(sddVar);
            if (!sclVar.m()) {
                return;
            }
            if (sclVar.l()) {
                sddVar.setIsRecyclable(false);
            }
            if (sclVar.c() == -1) {
                ViewGroup.LayoutParams layoutParams = sddVar.itemView.getLayoutParams();
                StaggeredGridLayoutManager.LayoutParams layoutParams2 = layoutParams instanceof StaggeredGridLayoutManager.LayoutParams ? (StaggeredGridLayoutManager.LayoutParams) layoutParams : null;
                if (layoutParams2 != null) {
                    layoutParams2.setFullSpan(true);
                }
            }
        }
        if (this.c.get(sddVar.getItemId()) != null) {
            sdg sdgVar2 = (sdg) this.c.get(sddVar.getItemId());
            if (sdgVar2 != null) {
                View view = sddVar.itemView;
                view.getClass();
                sdgVar2.a(view);
            }
        } else if (sddVar.b == null && (sdgVar = sddVar.a) != null) {
            View view2 = sddVar.itemView;
            view2.getClass();
            sdgVar.a(view2);
        }
        scq scqVar = sddVar.b;
        scq scqVar2 = scqVar;
        if (scqVar == null) {
            sda sdaVar = this.a;
            sdaVar.getClass();
            View view3 = sddVar.itemView;
            view3.getClass();
            sca scaVar = (sca) view3.getTag(-2147483647);
            if ((scaVar != null ? scaVar.w : null) != null) {
                scq scqVar3 = scaVar.w;
                scqVar3.getClass();
                scqVar2 = scqVar3;
            } else {
                scqVar2 = new scq(sdaVar.a, view3);
            }
        }
        sddVar.b = scqVar2;
        scqVar2.a(scfVarC);
        sda sdaVar2 = this.a;
        if (sdaVar2 != null) {
            scfVarC.getClass();
            scy scyVar = sdaVar2.b;
            if (scyVar != null) {
                scyVar.b(scfVarC);
            }
        }
    }

    public void b(List list) {
        this.d.submitList(list);
    }

    public final scf c(int i) {
        return (scf) d().get(i);
    }

    public final List d() {
        List currentList = this.d.getCurrentList();
        currentList.getClass();
        return currentList;
    }

    public final void e(sdh sdhVar) {
        sdhVar.getClass();
        this.c = sdhVar;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return d().size();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return c(i).E;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        scf scfVarC = c(i);
        boolean z = scfVarC instanceof scl;
        if (z && !((scl) scfVarC).m()) {
            return 1;
        }
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(scfVarC.g());
        arrayList.add(Integer.valueOf(scfVarC.a()));
        yks.g(scfVarC.o(), arrayList);
        int iHashCode = Arrays.hashCode(arrayList.toArray(new Object[arrayList.size()]));
        Map map = this.e;
        Integer numValueOf = Integer.valueOf(iHashCode);
        if (map.containsKey(numValueOf)) {
            Integer num = (Integer) map.get(numValueOf);
            int iA = scfVarC.a();
            if (num == null || num.intValue() != iA) {
                throw new IllegalArgumentException(a.cj(scfVarC, "Multiple bindings found for ", " with different view types"));
            }
        } else {
            map.put(numValueOf, Integer.valueOf(scfVarC.a()));
            RecyclerView recyclerView = null;
            if ((z ? (scl) scfVarC : null) != null) {
                scl sclVar = (scl) scfVarC;
                if (sclVar.d() != -1) {
                    RecyclerView recyclerView2 = this.b;
                    if (recyclerView2 == null) {
                        yks.c("recyclerView");
                    } else {
                        recyclerView = recyclerView2;
                    }
                    recyclerView.getRecycledViewPool().setMaxRecycledViews(iHashCode, sclVar.d());
                    return iHashCode;
                }
            }
        }
        return iHashCode;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        recyclerView.getClass();
        this.b = recyclerView;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager != null) {
            gridLayoutManager.setSpanSizeLookup(this.g);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int iIntValue;
        viewGroup.getClass();
        if (i == 1) {
            iIntValue = R.layout.hidden_view;
        } else {
            Integer num = (Integer) this.e.get(Integer.valueOf(i));
            if (num == null) {
                throw new IllegalArgumentException(a.cf(i, "Unable to find layoutId for ViewType "));
            }
            iIntValue = num.intValue();
        }
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(iIntValue, viewGroup, false);
        viewInflate.getClass();
        Map map = this.f;
        Integer numValueOf = Integer.valueOf(iIntValue);
        if (!map.containsKey(numValueOf)) {
            sdg sdgVar = new sdg();
            sdgVar.b(viewInflate);
            map.put(numValueOf, sdgVar);
        }
        return new sdd(viewInflate, (sdg) map.get(numValueOf));
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        sdd sddVar = (sdd) viewHolder;
        sddVar.getClass();
        if (sddVar.b()) {
            this.c.a(sddVar);
        }
        scq scqVar = sddVar.b;
        Object objE = scqVar != null ? scqVar.e() : null;
        if (objE instanceof scl) {
            ((scl) objE).q(sddVar);
        }
        scq scqVar2 = sddVar.b;
        if (scqVar2 != null) {
            scqVar2.b();
        }
        sddVar.b = null;
    }

    public /* synthetic */ sdc(byte[] bArr) {
        this.d = new AsyncListDiffer(this, new scs());
        this.e = new LinkedHashMap();
        this.f = new LinkedHashMap();
        this.c = new sdh();
        setHasStableIds(true);
        this.g = new sdb(this);
    }
}
