package defpackage;

import android.support.v7.util.DiffUtil;
import android.support.v7.util.ListUpdateCallback;
import android.support.v7.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ife extends ifc {
    public final idf a;
    private final idf b;
    private final idf c;
    private final icv d;
    private final idf e;
    private final idy f;
    private final boolean g;
    private final boolean h;
    private WeakReference i = new WeakReference(null);
    private List j = Collections.EMPTY_LIST;

    public ife(idf idfVar, icv icvVar, idf idfVar2, idy idyVar, idf idfVar3, boolean z, idf idfVar4) {
        this.b = idfVar4;
        this.c = idfVar;
        this.d = icvVar;
        this.e = idfVar2;
        this.f = idyVar;
        this.g = idfVar3 != iff.a;
        this.a = idfVar3;
        this.h = z;
    }

    private final List a(Object obj) {
        if (this.i.get() != obj) {
            this.j = (List) this.b.b(obj);
            this.i = new WeakReference(obj);
        }
        return this.j;
    }

    @Override // defpackage.ifc
    public final int b(Object obj) {
        return a(obj).size();
    }

    @Override // defpackage.ifc
    public final int c(Object obj, int i) {
        return ((Integer) this.c.b(a(obj).get(i))).intValue();
    }

    @Override // defpackage.ifc
    public final long d(Object obj, int i) {
        return ((Long) this.e.b(a(obj).get(i))).longValue();
    }

    @Override // defpackage.ifc
    public final void e(Object obj, int i, RecyclerView.ViewHolder viewHolder) {
        this.d.a(a(obj).get(i), viewHolder.itemView);
    }

    @Override // defpackage.ifc
    public final void f(RecyclerView.ViewHolder viewHolder) {
        this.f.c(viewHolder.itemView);
    }

    @Override // defpackage.ifc
    public final boolean g(Object obj, Object obj2, ListUpdateCallback listUpdateCallback) {
        if (!this.g) {
            return false;
        }
        if (obj != obj2) {
            DiffUtil.calculateDiff(new ifd(this, a(obj), a(obj2)), this.h).dispatchUpdatesTo(listUpdateCallback);
            return true;
        }
        int iB = b(obj);
        if (iB > 0) {
            listUpdateCallback.onChanged(0, iB, null);
        }
        return true;
    }
}
