package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
class muv implements View.OnAttachStateChangeListener, qh {
    public final RecyclerView a;
    public mus b;
    public mur c;
    private final eeo d;
    private boolean e = false;
    private final Float f;

    public muv(RecyclerView recyclerView, eeo eeoVar, Float f) {
        this.a = recyclerView;
        this.d = eeoVar;
        this.f = f;
    }

    private final qr d(float f) {
        return new muu(this.a.getContext(), f);
    }

    public final int b() {
        pq adapter = this.a.getAdapter();
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public final void c(int i, boolean z) {
        RecyclerView recyclerView = this.a;
        if (recyclerView.s) {
            boolean z2 = true;
            if (!this.e) {
                recyclerView.r.add(this);
                recyclerView.addOnAttachStateChangeListener(this);
                this.e = true;
            }
            eeo eeoVar = this.d;
            if (eeoVar != null) {
                if (z) {
                    Float f = this.f;
                    if (f != null && f.floatValue() > 0.0f) {
                        eeoVar.a(true, i, i, d(f.floatValue()));
                        return;
                    }
                } else {
                    z2 = false;
                }
                eeoVar.a(z2, i, i, null);
                return;
            }
            if (!z) {
                recyclerView.ae(i);
                return;
            }
            qd layoutManager = recyclerView.getLayoutManager();
            Float f2 = this.f;
            if (f2 == null || f2.floatValue() <= 0.0f || layoutManager == null) {
                recyclerView.al(i);
                return;
            }
            qr qrVarD = d(f2.floatValue());
            qrVarD.g = i;
            layoutManager.bk(qrVarD);
        }
    }

    @Override // defpackage.qh
    public final boolean f(RecyclerView recyclerView, MotionEvent motionEvent) {
        mur murVar = this.c;
        if (murVar == null || !murVar.d.get()) {
            return false;
        }
        murVar.a();
        return false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        mus musVar = this.b;
        if (musVar != null) {
            Map map = muw.a;
            musVar.a.a();
            muw.b.remove(musVar.b);
        }
        RecyclerView recyclerView = this.a;
        recyclerView.ab(this);
        recyclerView.removeOnAttachStateChangeListener(this);
        this.e = false;
    }

    @Override // defpackage.qh
    public final void a(boolean z) {
    }

    @Override // defpackage.qh
    public final void h(MotionEvent motionEvent) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
