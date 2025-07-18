package defpackage;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.util.SortedListAdapterCallback;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rdw extends SortedListAdapterCallback {
    public rdw(RecyclerView.Adapter adapter) {
        super(adapter);
    }

    @Override // android.support.v7.util.SortedList.Callback
    public final /* synthetic */ boolean areContentsTheSame(Object obj, Object obj2) {
        return ((Integer) obj).equals((Integer) obj2);
    }

    @Override // android.support.v7.util.SortedList.Callback
    public final /* synthetic */ boolean areItemsTheSame(Object obj, Object obj2) {
        return ((Integer) obj).equals((Integer) obj2);
    }

    @Override // android.support.v7.util.SortedList.Callback, java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((Integer) obj).compareTo((Integer) obj2);
    }
}
