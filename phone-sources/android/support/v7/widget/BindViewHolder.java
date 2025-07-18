package android.support.v7.widget;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BindViewHolder extends RecyclerView.ViewHolder {
    private List<Runnable> runOnRecycleRunnables;
    private SparseArray<View> viewCache;

    public BindViewHolder(View view) {
        super(view);
    }

    private void setItemViewType(int i) {
        this.mItemViewType = i;
    }

    public Context context() {
        return this.itemView.getContext();
    }

    public <T extends View> T getView(int i) {
        if (this.viewCache == null) {
            this.viewCache = new SparseArray<>();
        }
        T t = (T) this.viewCache.get(i);
        if (t != null) {
            return t;
        }
        T t2 = (T) this.itemView.findViewById(i);
        this.viewCache.put(i, t2);
        return t2;
    }

    public void onRecycled() {
        List<Runnable> list = this.runOnRecycleRunnables;
        if (list != null) {
            Iterator<Runnable> it = list.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            this.runOnRecycleRunnables.clear();
        }
    }

    public void runOnRecycle(Runnable runnable) {
        if (this.runOnRecycleRunnables == null) {
            this.runOnRecycleRunnables = new ArrayList();
        }
        this.runOnRecycleRunnables.add(runnable);
    }

    @Override // android.support.v7.widget.RecyclerView.ViewHolder
    public String toString() {
        return super.toString() + " ViewResId: " + Integer.toString(this.mItemViewType);
    }

    public BindViewHolder(View view, int i) {
        super(view);
        setItemViewType(i);
    }
}
