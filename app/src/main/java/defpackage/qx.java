package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public class qx extends afn {
    final RecyclerView a;
    public final qw b;

    public qx(RecyclerView recyclerView) {
        super(afn.c);
        this.a = recyclerView;
        afn afnVarJ = j();
        if (afnVarJ == null || !(afnVarJ instanceof qw)) {
            this.b = new qw(this);
        } else {
            this.b = (qw) afnVarJ;
        }
    }

    @Override // defpackage.afn
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        this.d.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.a.as()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().X(accessibilityEvent);
        }
    }

    @Override // defpackage.afn
    public void c(View view, ajr ajrVar) {
        super.c(view, ajrVar);
        RecyclerView recyclerView = this.a;
        if (recyclerView.as() || recyclerView.getLayoutManager() == null) {
            return;
        }
        qd layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.u;
        layoutManager.eJ(recyclerView2.e, recyclerView2.N, ajrVar);
    }

    @Override // defpackage.afn
    public final boolean i(View view, int i, Bundle bundle) {
        if (super.i(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.a;
        if (recyclerView.as() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().u(i, bundle);
    }

    public afn j() {
        return this.b;
    }
}
