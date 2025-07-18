package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.katniss.R;
import java.util.List;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public abstract class dpi extends dov {
    protected final View a;
    public final dph b;

    public dpi(View view) {
        dqk.d(view, "Argument must not be null");
        this.a = view;
        this.b = new dph(view);
    }

    @Override // defpackage.dov, defpackage.dpf
    public final don d() {
        Object tag = this.a.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof don) {
            return (don) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // defpackage.dov, defpackage.dpf
    public final void f(don donVar) {
        this.a.setTag(R.id.glide_custom_view_target_tag, donVar);
    }

    @Override // defpackage.dpf
    public void g(dpe dpeVar) {
        dph dphVar = this.b;
        int iB = dphVar.b();
        int iA = dphVar.a();
        if (dphVar.d(iB, iA)) {
            dpeVar.e(iB, iA);
            return;
        }
        List list = dphVar.c;
        if (!list.contains(dpeVar)) {
            list.add(dpeVar);
        }
        if (dphVar.d == null) {
            ViewTreeObserver viewTreeObserver = dphVar.b.getViewTreeObserver();
            dphVar.d = new dpg(dphVar);
            viewTreeObserver.addOnPreDrawListener(dphVar.d);
        }
    }

    @Override // defpackage.dpf
    public final void h(dpe dpeVar) {
        this.b.c.remove(dpeVar);
    }

    public final View k() {
        return this.a;
    }

    public final String toString() {
        return "Target for: ".concat(this.a.toString());
    }
}
