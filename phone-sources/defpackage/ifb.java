package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ifb extends RecyclerView.Adapter implements iej {
    public final int a;
    public final iez[] b;
    public final int[] c;
    public boolean d;
    private final int e;
    private final Map f;
    private final ids g;
    private int h;
    private int i;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.List] */
    public ifb(nuh nuhVar) {
        int size = nuhVar.c.size();
        a.aD(size > 0, "Must add at least one part");
        this.a = size;
        this.e = nuhVar.a;
        this.b = new iez[size];
        for (int i = 0; i < size; i++) {
            iez iezVar = (iez) nuhVar.c.get(i);
            this.b[i] = iezVar;
            iezVar.f(this, i);
        }
        this.f = new IdentityHashMap();
        ?? r3 = nuhVar.b;
        this.g = hjt.d((ids[]) r3.toArray(new ids[r3.size()]));
        this.c = new int[size];
        this.d = true;
        nuhVar.c.clear();
        nuhVar.b.clear();
        nuhVar.a = 0;
    }

    private final void f(RecyclerView.ViewHolder viewHolder) {
        iez iezVar = (iez) this.f.remove(viewHolder);
        if (iezVar != null) {
            iezVar.e(viewHolder);
        }
    }

    private final void g() {
        int iA = 0;
        for (int i = 0; i < this.a; i++) {
            iA += this.b[i].a();
            this.c[i] = iA;
        }
    }

    private final void h(int i) {
        int itemCount = getItemCount();
        if (i < 0 || i >= itemCount) {
            throw new IndexOutOfBoundsException(a.ce(itemCount, i, "Asked for position ", " while count is "));
        }
        int[] iArr = this.c;
        int iBinarySearch = Arrays.binarySearch(iArr, i);
        if (iBinarySearch >= 0) {
            do {
                iBinarySearch++;
            } while (iArr[iBinarySearch] == i);
        } else {
            iBinarySearch = ~iBinarySearch;
        }
        this.h = iBinarySearch;
        if (iBinarySearch != 0) {
            i -= iArr[iBinarySearch - 1];
        }
        this.i = i;
    }

    public final void a(int i, int i2) {
        while (i < this.a) {
            int[] iArr = this.c;
            iArr[i] = iArr[i] + i2;
            i++;
        }
    }

    public final void b() {
        this.g.ea(this);
        int i = 0;
        while (true) {
            iez[] iezVarArr = this.b;
            if (i >= iezVarArr.length) {
                return;
            }
            iezVarArr[i].g();
            i++;
        }
    }

    public final void c() {
        this.g.ee(this);
        int i = 0;
        while (true) {
            iez[] iezVarArr = this.b;
            if (i >= iezVarArr.length) {
                return;
            }
            iezVarArr[i].h();
            i++;
        }
    }

    @Override // defpackage.iej
    public final void dM() {
        e();
    }

    public final void e() {
        if (this.d) {
            return;
        }
        if (!hasObservers()) {
            g();
            return;
        }
        int[] iArr = this.c;
        int i = iArr[0];
        iey ieyVarB = iey.b(0);
        int i2 = 0;
        while (true) {
            int i3 = this.a;
            if (i2 >= i3) {
                ieyVarB.d(this);
                return;
            }
            ieyVarB.a = i;
            if (!this.b[i2].i(false, ieyVarB)) {
                this.d = true;
                notifyDataSetChanged();
                ieyVarB.c();
                return;
            } else {
                int iA = ieyVarB.a();
                int i4 = i2 + 1;
                if (i4 < i3) {
                    i = iArr[i4] - iArr[i2];
                }
                iArr[i2] = iA;
                i2 = i4;
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final int getItemCount() {
        if (this.d) {
            g();
            this.d = false;
        }
        return this.c[this.a - 1];
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        h(i);
        return this.b[this.h].c(this.i, this.e);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        h(i);
        return this.b[this.h].b(this.i);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        h(i);
        iez iezVar = this.b[this.h];
        this.f.put(viewHolder, iezVar);
        iezVar.d(this.i, viewHolder);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new rbx(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        f(viewHolder);
        return false;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        f(viewHolder);
    }
}
