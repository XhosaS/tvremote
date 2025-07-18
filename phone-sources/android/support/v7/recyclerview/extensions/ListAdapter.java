package android.support.v7.recyclerview.extensions;

import android.support.v7.recyclerview.extensions.AsyncDifferConfig;
import android.support.v7.recyclerview.extensions.AsyncListDiffer;
import android.support.v7.util.AdapterListUpdateCallback;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ListAdapter<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
    final AsyncListDiffer<T> mDiffer;
    private final AsyncListDiffer.ListListener<T> mListener;

    protected ListAdapter(AsyncDifferConfig<T> asyncDifferConfig) {
        AsyncListDiffer.ListListener<T> listListener = new AsyncListDiffer.ListListener<T>() { // from class: android.support.v7.recyclerview.extensions.ListAdapter.1
            @Override // android.support.v7.recyclerview.extensions.AsyncListDiffer.ListListener
            public void onCurrentListChanged(List<T> list, List<T> list2) {
                ListAdapter.this.onCurrentListChanged(list, list2);
            }
        };
        this.mListener = listListener;
        AsyncListDiffer<T> asyncListDiffer = new AsyncListDiffer<>(new AdapterListUpdateCallback(this), asyncDifferConfig);
        this.mDiffer = asyncListDiffer;
        asyncListDiffer.addListListener(listListener);
    }

    public List<T> getCurrentList() {
        return this.mDiffer.getCurrentList();
    }

    protected T getItem(int i) {
        return this.mDiffer.getCurrentList().get(i);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mDiffer.getCurrentList().size();
    }

    public void submitList(List<T> list) {
        this.mDiffer.submitList(list);
    }

    public void submitList(List<T> list, Runnable runnable) {
        this.mDiffer.submitList(list, runnable);
    }

    protected ListAdapter(DiffUtil.ItemCallback<T> itemCallback) {
        AsyncListDiffer.ListListener<T> listListener = new AsyncListDiffer.ListListener<T>() { // from class: android.support.v7.recyclerview.extensions.ListAdapter.1
            @Override // android.support.v7.recyclerview.extensions.AsyncListDiffer.ListListener
            public void onCurrentListChanged(List<T> list, List<T> list2) {
                ListAdapter.this.onCurrentListChanged(list, list2);
            }
        };
        this.mListener = listListener;
        AsyncListDiffer<T> asyncListDiffer = new AsyncListDiffer<>(new AdapterListUpdateCallback(this), new AsyncDifferConfig.Builder(itemCallback).build());
        this.mDiffer = asyncListDiffer;
        asyncListDiffer.addListListener(listListener);
    }

    public void onCurrentListChanged(List<T> list, List<T> list2) {
    }
}
