package defpackage;

import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.videos.R;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mwo implements icv, idy {
    public final idr a;
    private final idf f;
    private final idf g;
    private final idf h;
    private final RecyclerView.RecycledViewPool i;
    private final jn c = new jn();
    private final WeakHashMap e = new WeakHashMap();
    private final Set b = new HashSet();
    private final jn d = new jn();

    private mwo(idf idfVar, idf idfVar2, idf idfVar3, idr idrVar, RecyclerView.RecycledViewPool recycledViewPool) {
        this.f = idfVar;
        this.g = idfVar2;
        this.h = idfVar3;
        this.a = idrVar;
        this.i = recycledViewPool;
    }

    public static mwo b(idf idfVar, idf idfVar2, idf idfVar3) {
        return new mwo(idfVar2, idfVar3, idfVar, new idz(ieg.a), new RecyclerView.RecycledViewPool());
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [idr, java.lang.Object] */
    private final ifb f(long j, Object obj, RecyclerView recyclerView) {
        ifb ifbVar;
        jn jnVar = this.d;
        WeakReference weakReference = (WeakReference) jnVar.e(j);
        ieg iegVarA = ieg.a(weakReference != null ? (ifb) weakReference.get() : null);
        if (iegVarA.m()) {
            g((ifb) iegVarA.g()).b.c(obj);
        }
        if (iegVarA.m()) {
            ifbVar = (ifb) iegVarA.g();
        } else {
            idz idzVar = new idz(obj);
            nuh nuhVar = new nuh();
            nuhVar.f(idzVar, (ifc) ((icy) this.g).a);
            idr idrVar = this.a;
            iff iffVar = new iff();
            iffVar.f(R.layout.horizontal_spinner);
            iffVar.c = new mnn(this, 2);
            nuhVar.f(idrVar, iffVar.c());
            ifb ifbVar2 = new ifb(nuhVar);
            this.e.put(ifbVar2, new mwn(j, idzVar));
            ifbVar2.setHasStableIds(true);
            jnVar.j(j, new WeakReference(ifbVar2));
            ifbVar = ifbVar2;
        }
        recyclerView.setAdapter(ifbVar);
        recyclerView.setLayoutManager((RecyclerView.LayoutManager) ((icy) this.h).a);
        recyclerView.getLayoutManager().onRestoreInstanceState((Parcelable) this.c.e(j));
        return ifbVar;
    }

    private final mwn g(ifb ifbVar) {
        return (mwn) this.e.get(ifbVar);
    }

    private final void h(long j, Parcelable parcelable, ifb ifbVar) {
        this.c.j(j, parcelable);
        if (this.b.remove(ifbVar)) {
            ifbVar.c();
        }
    }

    @Override // defpackage.idy
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void c(View view) {
        RecyclerView recyclerView = (RecyclerView) view;
        ifb ifbVar = (ifb) recyclerView.getAdapter();
        h(g(ifbVar).a, recyclerView.getLayoutManager().onSaveInstanceState(), ifbVar);
        recyclerView.setAdapter(null);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [idr, java.lang.Object] */
    @Override // defpackage.icv
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void a(Object obj, View view) {
        RecyclerView recyclerView = (RecyclerView) view;
        long jLongValue = ((Long) ((icy) this.f).a).longValue();
        ifb ifbVarF = (ifb) recyclerView.getAdapter();
        mwn mwnVarG = ifbVarF != null ? g(ifbVarF) : null;
        if (mwnVarG == null) {
            if (ifbVarF != null) {
                krd.c("Found adapter attached to RecyclerView that RowHandler doesn't know about.");
            }
            recyclerView.setRecycledViewPool(this.i);
            ifbVarF = f(jLongValue, obj, recyclerView);
        } else {
            long j = mwnVarG.a;
            if (j != jLongValue) {
                h(j, recyclerView.getLayoutManager().onSaveInstanceState(), ifbVarF);
                ifbVarF = f(jLongValue, obj, recyclerView);
            } else {
                mwnVarG.b.c(obj);
                ifbVarF.e();
            }
        }
        Set set = this.b;
        if (set.contains(ifbVarF)) {
            return;
        }
        ifbVarF.b();
        set.add(ifbVarF);
    }
}
