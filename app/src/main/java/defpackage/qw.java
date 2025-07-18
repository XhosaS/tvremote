package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class qw extends afn {
    final qx a;
    public final Map b;

    public qw(qx qxVar) {
        super(afn.c);
        this.b = new WeakHashMap();
        this.a = qxVar;
    }

    @Override // defpackage.afn
    public final aju a(View view) {
        afn afnVar = (afn) this.b.get(view);
        return afnVar != null ? afnVar.a(view) : super.a(view);
    }

    @Override // defpackage.afn
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        afn afnVar = (afn) this.b.get(view);
        if (afnVar != null) {
            afnVar.b(view, accessibilityEvent);
        } else {
            this.d.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // defpackage.afn
    public final void c(View view, ajr ajrVar) {
        RecyclerView recyclerView = this.a.a;
        if (recyclerView.as() || recyclerView.getLayoutManager() == null) {
            super.c(view, ajrVar);
            return;
        }
        recyclerView.getLayoutManager().aW(view, ajrVar);
        afn afnVar = (afn) this.b.get(view);
        if (afnVar != null) {
            afnVar.c(view, ajrVar);
        } else {
            super.c(view, ajrVar);
        }
    }

    @Override // defpackage.afn
    public final void d(View view, AccessibilityEvent accessibilityEvent) {
        afn afnVar = (afn) this.b.get(view);
        if (afnVar != null) {
            afnVar.d(view, accessibilityEvent);
        } else {
            this.d.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // defpackage.afn
    public final void e(View view, int i) {
        afn afnVar = (afn) this.b.get(view);
        if (afnVar != null) {
            afnVar.e(view, i);
        } else {
            this.d.sendAccessibilityEvent(view, i);
        }
    }

    @Override // defpackage.afn
    public final void f(View view, AccessibilityEvent accessibilityEvent) {
        afn afnVar = (afn) this.b.get(view);
        if (afnVar != null) {
            afnVar.f(view, accessibilityEvent);
        } else {
            this.d.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    @Override // defpackage.afn
    public final boolean g(View view, AccessibilityEvent accessibilityEvent) {
        afn afnVar = (afn) this.b.get(view);
        return afnVar != null ? afnVar.g(view, accessibilityEvent) : this.d.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // defpackage.afn
    public final boolean h(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        afn afnVar = (afn) this.b.get(viewGroup);
        return afnVar != null ? afnVar.h(viewGroup, view, accessibilityEvent) : this.d.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.afn
    public final boolean i(View view, int i, Bundle bundle) {
        RecyclerView recyclerView = this.a.a;
        if (recyclerView.as() || recyclerView.getLayoutManager() == null) {
            return super.i(view, i, bundle);
        }
        afn afnVar = (afn) this.b.get(view);
        if (afnVar != null) {
            if (afnVar.i(view, i, bundle)) {
                return true;
            }
        } else if (super.i(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView2 = recyclerView.getLayoutManager().u;
        ql qlVar = recyclerView2.e;
        qs qsVar = recyclerView2.N;
        return false;
    }
}
