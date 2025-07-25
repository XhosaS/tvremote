package android.support.v7.recyclerview.extensions;

import android.os.Handler;
import android.os.Looper;
import android.support.v7.recyclerview.extensions.AsyncDifferConfig;
import android.support.v7.util.AdapterListUpdateCallback;
import android.support.v7.util.DiffUtil;
import android.support.v7.util.ListUpdateCallback;
import android.support.v7.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AsyncListDiffer<T> {
    private static final Executor sMainThreadExecutor = new MainThreadExecutor();
    final AsyncDifferConfig<T> mConfig;
    private List<T> mList;
    private final List<ListListener<T>> mListeners;
    Executor mMainThreadExecutor;
    int mMaxScheduledGeneration;
    private List<T> mReadOnlyList;
    private final ListUpdateCallback mUpdateCallback;

    /* compiled from: PG */
    public interface ListListener<T> {
        void onCurrentListChanged(List<T> list, List<T> list2);
    }

    /* compiled from: PG */
    class MainThreadExecutor implements Executor {
        final Handler mHandler = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.mHandler.post(runnable);
        }
    }

    public AsyncListDiffer(ListUpdateCallback listUpdateCallback, AsyncDifferConfig<T> asyncDifferConfig) {
        this.mListeners = new CopyOnWriteArrayList();
        this.mReadOnlyList = Collections.EMPTY_LIST;
        this.mUpdateCallback = listUpdateCallback;
        this.mConfig = asyncDifferConfig;
        this.mMainThreadExecutor = asyncDifferConfig.getMainThreadExecutor() != null ? asyncDifferConfig.getMainThreadExecutor() : sMainThreadExecutor;
    }

    private void onCurrentListChanged(List<T> list, Runnable runnable) {
        Iterator<ListListener<T>> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().onCurrentListChanged(list, this.mReadOnlyList);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void addListListener(ListListener<T> listListener) {
        this.mListeners.add(listListener);
    }

    public List<T> getCurrentList() {
        return this.mReadOnlyList;
    }

    public void latchList(List<T> list, DiffUtil.DiffResult diffResult, Runnable runnable) {
        List<T> list2 = this.mReadOnlyList;
        this.mList = list;
        this.mReadOnlyList = DesugarCollections.unmodifiableList(list);
        diffResult.dispatchUpdatesTo(this.mUpdateCallback);
        onCurrentListChanged(list2, runnable);
    }

    public void removeListListener(ListListener<T> listListener) {
        this.mListeners.remove(listListener);
    }

    public void submitList(List<T> list) {
        submitList(list, null);
    }

    public void submitList(final List<T> list, final Runnable runnable) {
        final int i = this.mMaxScheduledGeneration + 1;
        this.mMaxScheduledGeneration = i;
        final List<T> list2 = this.mList;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List<T> list3 = this.mReadOnlyList;
        if (list == null) {
            int size = list2.size();
            this.mList = null;
            this.mReadOnlyList = Collections.EMPTY_LIST;
            this.mUpdateCallback.onRemoved(0, size);
            onCurrentListChanged(list3, runnable);
            return;
        }
        if (list2 != null) {
            this.mConfig.getBackgroundThreadExecutor().execute(new Runnable() { // from class: android.support.v7.recyclerview.extensions.AsyncListDiffer.1
                @Override // java.lang.Runnable
                public void run() {
                    final DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new DiffUtil.Callback() { // from class: android.support.v7.recyclerview.extensions.AsyncListDiffer.1.1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // android.support.v7.util.DiffUtil.Callback
                        public boolean areContentsTheSame(int i2, int i3) {
                            Object obj = list2.get(i2);
                            Object obj2 = list.get(i3);
                            if (obj != null && obj2 != null) {
                                return AsyncListDiffer.this.mConfig.getDiffCallback().areContentsTheSame(obj, obj2);
                            }
                            if (obj == null && obj2 == null) {
                                return true;
                            }
                            throw new AssertionError();
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // android.support.v7.util.DiffUtil.Callback
                        public boolean areItemsTheSame(int i2, int i3) {
                            Object obj = list2.get(i2);
                            Object obj2 = list.get(i3);
                            return (obj == null || obj2 == null) ? obj == null && obj2 == null : AsyncListDiffer.this.mConfig.getDiffCallback().areItemsTheSame(obj, obj2);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // android.support.v7.util.DiffUtil.Callback
                        public Object getChangePayload(int i2, int i3) {
                            Object obj = list2.get(i2);
                            Object obj2 = list.get(i3);
                            if (obj == null || obj2 == null) {
                                throw new AssertionError();
                            }
                            return AsyncListDiffer.this.mConfig.getDiffCallback().getChangePayload(obj, obj2);
                        }

                        @Override // android.support.v7.util.DiffUtil.Callback
                        public int getNewListSize() {
                            return list.size();
                        }

                        @Override // android.support.v7.util.DiffUtil.Callback
                        public int getOldListSize() {
                            return list2.size();
                        }
                    });
                    AsyncListDiffer.this.mMainThreadExecutor.execute(new Runnable() { // from class: android.support.v7.recyclerview.extensions.AsyncListDiffer.1.2
                        @Override // java.lang.Runnable
                        public void run() {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            AsyncListDiffer asyncListDiffer = AsyncListDiffer.this;
                            if (asyncListDiffer.mMaxScheduledGeneration == i) {
                                asyncListDiffer.latchList(list, diffResultCalculateDiff, runnable);
                            }
                        }
                    });
                }
            });
            return;
        }
        this.mList = list;
        this.mReadOnlyList = DesugarCollections.unmodifiableList(list);
        this.mUpdateCallback.onInserted(0, list.size());
        onCurrentListChanged(list3, runnable);
    }

    public AsyncListDiffer(RecyclerView.Adapter adapter, DiffUtil.ItemCallback<T> itemCallback) {
        this(new AdapterListUpdateCallback(adapter), new AsyncDifferConfig.Builder(itemCallback).build());
    }
}
