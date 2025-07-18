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
public final class miq implements icv, idy {
    private final idf e;
    private final idf f;
    private final idf g;
    private final RecyclerView.RecycledViewPool h;
    private final jn b = new jn();
    private final WeakHashMap d = new WeakHashMap();
    private final Set a = new HashSet();
    private final jn c = new jn();

    public miq(idf idfVar, idf idfVar2, idf idfVar3, RecyclerView.RecycledViewPool recycledViewPool) {
        this.e = idfVar;
        this.f = idfVar2;
        this.g = idfVar3;
        this.h = recycledViewPool;
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [idr, java.lang.Object] */
    private final ifb b(long j, Object obj, RecyclerView recyclerView) {
        ifb ifbVar;
        jn jnVar = this.c;
        WeakReference weakReference = (WeakReference) jnVar.e(j);
        ieg iegVarA = ieg.a(weakReference != null ? (ifb) weakReference.get() : null);
        if (iegVarA.m()) {
            e((ifb) iegVarA.g()).b.c(obj);
        }
        if (iegVarA.m()) {
            ifbVar = (ifb) iegVarA.g();
        } else {
            idz idzVar = new idz(obj);
            nuh nuhVar = new nuh();
            nuhVar.f(idzVar, (ifc) ((icy) this.f).a);
            nuhVar.z(new zuw(R.layout.row_card_spacer, icz.a, null));
            ifb ifbVar2 = new ifb(nuhVar);
            this.d.put(ifbVar2, new mwn(j, idzVar));
            ifbVar2.setHasStableIds(true);
            jnVar.j(j, new WeakReference(ifbVar2));
            ifbVar = ifbVar2;
        }
        recyclerView.setAdapter(ifbVar);
        recyclerView.setLayoutManager((RecyclerView.LayoutManager) this.g.b(obj));
        recyclerView.getLayoutManager().onRestoreInstanceState((Parcelable) this.b.e(j));
        return ifbVar;
    }

    private final void d(long j, Parcelable parcelable, ifb ifbVar) {
        this.b.j(j, parcelable);
        if (this.a.remove(ifbVar)) {
            ifbVar.c();
        }
    }

    private final mwn e(ifb ifbVar) {
        return (mwn) this.d.get(ifbVar);
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [idr, java.lang.Object] */
    @Override // defpackage.icv
    public final /* synthetic */ void a(Object obj, Object obj2) {
        RecyclerView recyclerView = (RecyclerView) ((View) obj2);
        long jLongValue = ((Long) ((icy) this.e).a).longValue();
        ifb ifbVarB = (ifb) recyclerView.getAdapter();
        mwn mwnVarE = ifbVarB != null ? e(ifbVarB) : null;
        if (mwnVarE == null) {
            if (ifbVarB != null) {
                krd.c("Found adapter attached to RecyclerView that RowHandler doesn't know about.");
            }
            recyclerView.setRecycledViewPool(this.h);
            ifbVarB = b(jLongValue, obj, recyclerView);
        } else {
            long j = mwnVarE.a;
            if (j != jLongValue) {
                d(j, recyclerView.getLayoutManager().onSaveInstanceState(), ifbVarB);
                ifbVarB = b(jLongValue, obj, recyclerView);
            } else {
                mwnVarE.b.c(obj);
                ifbVarB.e();
            }
        }
        Set set = this.a;
        if (set.contains(ifbVarB)) {
            return;
        }
        ifbVarB.b();
        set.add(ifbVarB);
    }

    @Override // defpackage.idy
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        RecyclerView recyclerView = (RecyclerView) ((View) obj);
        ifb ifbVar = (ifb) recyclerView.getAdapter();
        d(e(ifbVar).a, recyclerView.getLayoutManager().onSaveInstanceState(), ifbVar);
        recyclerView.setAdapter(null);
    }
}
