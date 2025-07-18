package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.play.widget.fireball.FireballTextTagView;
import com.google.android.videos.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class seq extends RecyclerView.Adapter implements View.OnLayoutChangeListener {
    public List a;
    public final sea b;
    private final sen c = new sen();
    private final int d;
    private final int e;

    public seq(sea seaVar, List list, int i, int i2) {
        this.b = seaVar;
        this.a = list;
        this.e = i2;
        this.d = i;
    }

    private final boolean a(int i) {
        return i == 0 && this.a.get(0) == sfb.a;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        if (a(i)) {
            return -1L;
        }
        return ((sfa) this.a.get(i)).a.hashCode();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return a(i) ? R.layout.play__fireball__reset_tag : ((sfa) this.a.get(i)).d() ? R.layout.play__fireball__knob_tag : R.layout.play__fireball__tag;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        recyclerView.addOnScrollListener(this.c);
        recyclerView.addOnLayoutChangeListener(this);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        sep sepVar = (sep) viewHolder;
        sepVar.a = null;
        if (a(i)) {
            sepVar.a = null;
            sepVar.b = sfb.a;
            sepVar.itemView.setOnClickListener(new phn(this, 12));
        } else {
            sfa sfaVar = (sfa) this.a.get(i);
            sepVar.a = null;
            sepVar.b = sfaVar;
            ((seo) sepVar.itemView).a(sfaVar);
            sepVar.itemView.setOnClickListener(new kaj(this, sepVar, sfaVar, 7));
        }
        if (getItemViewType(i) == R.layout.play__fireball__tag) {
            FireballTextTagView fireballTextTagView = (FireballTextTagView) sepVar.itemView;
            int i2 = this.d;
            int[] iArr = fireballTextTagView.a;
            iArr[0] = i2;
            iArr[1] = this.e;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new sep(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this);
        recyclerView.removeOnScrollListener(this.c);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        ((sep) viewHolder).a();
        return false;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (view instanceof RecyclerView) {
        } else {
            Log.wtf("TagListAdapter", "onLayoutChangeListener attached to unexpected view!");
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final /* synthetic */ void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        ((sep) viewHolder).a();
    }
}
