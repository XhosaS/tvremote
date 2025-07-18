package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import androidx.leanback.widget.VerticalGridView;
import com.google.android.katniss.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class axp extends pq {
    final RecyclerView d;
    final List e;
    final ayc f;
    axq g;
    awp h;
    private final boolean i;
    private final axn j;
    private final axm k;
    private final axl l;
    private final axk m;
    private final axo n;
    private final View.OnClickListener o = new axi(this);

    public axp(List list, axo axoVar, ayc aycVar, boolean z) {
        VerticalGridView verticalGridView;
        this.e = list == null ? new ArrayList() : new ArrayList(list);
        this.n = axoVar;
        this.f = aycVar;
        this.j = new axn(this);
        this.k = new axm(this);
        this.l = new axl(this);
        this.m = new axk(this);
        this.i = z;
        if (z) {
            verticalGridView = aycVar.d;
        } else {
            this.h = axs.a;
            verticalGridView = aycVar.c;
        }
        this.d = verticalGridView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void r(EditText editText) {
        if (editText != 0) {
            editText.setPrivateImeOptions("escapeNorth");
            axl axlVar = this.l;
            editText.setOnEditorActionListener(axlVar);
            if (editText instanceof ayf) {
                ((ayf) editText).b(axlVar);
            }
            if (editText instanceof axr) {
                ((axr) editText).a(this.m);
            }
        }
    }

    @Override // defpackage.pq
    public final int a() {
        return this.e.size();
    }

    @Override // defpackage.pq
    public final int b(int i) {
        return ((axh) this.e.get(i)) instanceof ayd ? 1 : 0;
    }

    @Override // defpackage.pq
    public final qv d(ViewGroup viewGroup, int i) {
        int iA;
        ayb aybVar;
        ayc aycVar = this.f;
        if (i == 0) {
            aybVar = new ayb(LayoutInflater.from(viewGroup.getContext()).inflate(aycVar.a(), viewGroup, false), viewGroup == aycVar.d);
        } else {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            if (i == 0) {
                iA = aycVar.a();
            } else {
                if (i != 1) {
                    throw new RuntimeException(a.a(i, "ViewType ", " not supported in GuidedActionsStylist"));
                }
                iA = R.layout.lb_guidedactions_datepicker_item;
            }
            aybVar = new ayb(layoutInflaterFrom.inflate(iA, viewGroup, false), viewGroup == aycVar.d);
        }
        axn axnVar = this.j;
        View view = aybVar.a;
        view.setOnKeyListener(axnVar);
        view.setOnClickListener(this.o);
        view.setOnFocusChangeListener(this.k);
        r(aybVar.A());
        r(aybVar.z());
        return aybVar;
    }

    @Override // defpackage.pq
    public final void f(qv qvVar, int i) {
        List list = this.e;
        if (i >= list.size()) {
            return;
        }
        axh axhVar = (axh) list.get(i);
        this.f.e((ayb) qvVar, axhVar);
    }

    public final int m(axh axhVar) {
        return this.e.indexOf(axhVar);
    }

    public final axh n(int i) {
        return (axh) this.e.get(i);
    }

    public final ayb o(View view) {
        RecyclerView recyclerView = this.d;
        if (!recyclerView.s) {
            return null;
        }
        ViewParent parent = view.getParent();
        while (parent != recyclerView && parent != null && view != null) {
            view = parent;
            parent = parent.getParent();
        }
        if (parent == null || view == null) {
            return null;
        }
        return (ayb) recyclerView.l(view);
    }

    public final void p(ayb aybVar) {
        axo axoVar = this.n;
        if (axoVar != null) {
            axoVar.a(aybVar.s);
        }
    }

    public final void q(List list) {
        if (!this.i) {
            this.f.d(false);
        }
        axm axmVar = this.k;
        View view = axmVar.a;
        if (view != null) {
            RecyclerView recyclerView = axmVar.b.d;
            if (recyclerView.s) {
                qv qvVarL = recyclerView.l(view);
                if (qvVarL != null) {
                } else {
                    Log.w("GuidedActionAdapter", "RecyclerView returned null view holder", new Throwable());
                }
            }
        }
        if (this.h == null) {
            List list2 = this.e;
            list2.clear();
            list2.addAll(list);
            this.a.a();
            return;
        }
        ArrayList arrayList = new ArrayList();
        List list3 = this.e;
        arrayList.addAll(list3);
        list3.clear();
        list3.addAll(list);
        C0001if.a(new axj(this, arrayList), true).a(new hw(this));
    }
}
