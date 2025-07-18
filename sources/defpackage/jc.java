package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jc extends pe {
    final RecyclerView a;
    public final jb b;

    public jc(RecyclerView recyclerView) {
        this.a = recyclerView;
        jb jbVar = this.b;
        if (jbVar != null) {
            this.b = jbVar;
        } else {
            this.b = new jb(this);
        }
    }

    @Override // defpackage.pe
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        in inVar;
        super.a(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || j() || (inVar = ((RecyclerView) view).m) == null) {
            return;
        }
        inVar.Q(accessibilityEvent);
    }

    @Override // defpackage.pe
    public final void b(View view, sm smVar) {
        in inVar;
        super.b(view, smVar);
        if (j() || (inVar = this.a.m) == null) {
            return;
        }
        RecyclerView recyclerView = inVar.s;
        inVar.m(recyclerView.f, recyclerView.K, smVar);
    }

    @Override // defpackage.pe
    public final boolean h(View view, int i, Bundle bundle) {
        in inVar;
        if (super.h(view, i, bundle)) {
            return true;
        }
        if (j() || (inVar = this.a.m) == null) {
            return false;
        }
        return inVar.t(i, bundle);
    }

    final boolean j() {
        return this.a.aa();
    }
}
