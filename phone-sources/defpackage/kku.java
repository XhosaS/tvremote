package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.videos.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kku extends RecyclerView.Adapter implements View.OnLayoutChangeListener {
    public List a;
    public final sea b;
    private final kkq c = new kkq();

    public kku(sea seaVar, List list) {
        this.b = seaVar;
        this.a = list;
    }

    public static final void a(kks kksVar) {
        kksVar.getClass();
        kksVar.a = null;
        KeyEvent.Callback callback = kksVar.itemView;
        if (callback instanceof kkr) {
            callback.getClass();
            ((kkr) callback).b();
        }
    }

    private final boolean b(int i) {
        return i == 0 && this.a.get(0) == klc.a;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        if (b(i)) {
            return -1L;
        }
        return ((klb) this.a.get(i)).a.hashCode();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return b(i) ? R.layout.gtv__fireball__reset_tag : ((klb) this.a.get(i)).d() ? R.layout.gtv__fireball__knob_tag : R.layout.gtv__fireball__tag;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        recyclerView.getClass();
        recyclerView.addOnScrollListener(this.c);
        recyclerView.addOnLayoutChangeListener(this);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        kks kksVar = (kks) viewHolder;
        kksVar.getClass();
        if (b(i)) {
            kksVar.a = klc.a;
            kksVar.itemView.setOnClickListener(new jyr(this, 19));
            return;
        }
        klb klbVar = (klb) this.a.get(i);
        kksVar.a = klbVar;
        KeyEvent.Callback callback = kksVar.itemView;
        callback.getClass();
        ((kkr) callback).a(klbVar);
        kksVar.itemView.setOnClickListener(new iuy(this, klbVar, 8, null));
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        return new kks(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        recyclerView.getClass();
        recyclerView.removeOnLayoutChangeListener(this);
        recyclerView.removeOnScrollListener(this.c);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        kks kksVar = (kks) viewHolder;
        kksVar.getClass();
        a(kksVar);
        return false;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.getClass();
        if (view instanceof RecyclerView) {
        } else {
            Log.wtf("TagListAdapter", "onLayoutChangeListener attached to unexpected view!");
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        a((kks) viewHolder);
    }
}
