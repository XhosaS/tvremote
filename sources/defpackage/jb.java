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
public final class jb extends pe {
    final jc a;
    public final Map b = new WeakHashMap();

    public jb(jc jcVar) {
        this.a = jcVar;
    }

    @Override // defpackage.pe
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        pe peVar = (pe) this.b.get(view);
        if (peVar != null) {
            peVar.a(view, accessibilityEvent);
        } else {
            super.a(view, accessibilityEvent);
        }
    }

    @Override // defpackage.pe
    public final void b(View view, sm smVar) {
        in inVar;
        jc jcVar = this.a;
        if (jcVar.j() || (inVar = jcVar.a.m) == null) {
            super.b(view, smVar);
            return;
        }
        inVar.aP(view, smVar);
        pe peVar = (pe) this.b.get(view);
        if (peVar != null) {
            peVar.b(view, smVar);
        } else {
            super.b(view, smVar);
        }
    }

    @Override // defpackage.pe
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        pe peVar = (pe) this.b.get(view);
        if (peVar != null) {
            peVar.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // defpackage.pe
    public final void d(View view, int i) {
        pe peVar = (pe) this.b.get(view);
        if (peVar != null) {
            peVar.d(view, i);
        } else {
            super.d(view, i);
        }
    }

    @Override // defpackage.pe
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        pe peVar = (pe) this.b.get(view);
        if (peVar != null) {
            peVar.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // defpackage.pe
    public final boolean f(View view, AccessibilityEvent accessibilityEvent) {
        pe peVar = (pe) this.b.get(view);
        return peVar != null ? peVar.f(view, accessibilityEvent) : super.f(view, accessibilityEvent);
    }

    @Override // defpackage.pe
    public final boolean g(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        pe peVar = (pe) this.b.get(viewGroup);
        return peVar != null ? peVar.g(viewGroup, view, accessibilityEvent) : super.g(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.pe
    public final boolean h(View view, int i, Bundle bundle) {
        jc jcVar = this.a;
        if (!jcVar.j()) {
            RecyclerView recyclerView = jcVar.a;
            if (recyclerView.m != null) {
                pe peVar = (pe) this.b.get(view);
                if (peVar != null) {
                    if (peVar.h(view, i, bundle)) {
                        return true;
                    }
                } else if (super.h(view, i, bundle)) {
                    return true;
                }
                RecyclerView recyclerView2 = recyclerView.m.s;
                ir irVar = recyclerView2.f;
                ix ixVar = recyclerView2.K;
                return false;
            }
        }
        return super.h(view, i, bundle);
    }

    @Override // defpackage.pe
    public final asv i(View view) {
        pe peVar = (pe) this.b.get(view);
        return peVar != null ? peVar.i(view) : super.i(view);
    }
}
