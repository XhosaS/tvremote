package defpackage;

import android.widget.RemoteViews;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmj {
    public static final dmj a = new dmj(new long[0], new RemoteViews[0], false, 1);
    public final boolean b;
    public final int c;
    private final long[] d;
    private final RemoteViews[] e;

    public dmj(long[] jArr, RemoteViews[] remoteViewsArr, boolean z, int i) {
        this.d = jArr;
        this.e = remoteViewsArr;
        this.b = z;
        this.c = i;
        int length = jArr.length;
        int length2 = remoteViewsArr.length;
        if (length != length2) {
            throw new IllegalArgumentException("RemoteCollectionItems has different number of ids and views");
        }
        if (i <= 0) {
            throw new IllegalArgumentException("View type count must be >= 1");
        }
        ArrayList arrayList = new ArrayList(length2);
        for (RemoteViews remoteViews : remoteViewsArr) {
            arrayList.add(Integer.valueOf(remoteViews.getLayoutId()));
        }
        int size = yfm.ab(arrayList).size();
        if (size <= this.c) {
            return;
        }
        throw new IllegalArgumentException("View type count is set to " + this.c + ", but the collection contains " + size + " different layout ids");
    }

    public final int a() {
        return this.d.length;
    }

    public final long b(int i) {
        return this.d[i];
    }

    public final RemoteViews c(int i) {
        return this.e[i];
    }
}
