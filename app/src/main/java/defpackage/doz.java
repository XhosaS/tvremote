package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.katniss.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class doz implements dpf {
    protected final View a;
    private final doy b;

    public doz(View view) {
        dqk.d(view, "Argument must not be null");
        this.a = view;
        this.b = new doy(view);
    }

    @Override // defpackage.dpf
    public final void c(Drawable drawable) {
        this.b.c();
    }

    @Override // defpackage.dpf
    public final don d() {
        Object tag = this.a.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof don) {
            return (don) tag;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    @Override // defpackage.dpf
    public final void f(don donVar) {
        this.a.setTag(R.id.glide_custom_view_target_tag, donVar);
    }

    @Override // defpackage.dpf
    public final void g(dpe dpeVar) {
        doy doyVar = this.b;
        int iB = doyVar.b();
        int iA = doyVar.a();
        if (doyVar.d(iB, iA)) {
            dpeVar.e(iB, iA);
            return;
        }
        List list = doyVar.c;
        if (!list.contains(dpeVar)) {
            list.add(dpeVar);
        }
        if (doyVar.d == null) {
            ViewTreeObserver viewTreeObserver = doyVar.b.getViewTreeObserver();
            doyVar.d = new dox(doyVar);
            viewTreeObserver.addOnPreDrawListener(doyVar.d);
        }
    }

    @Override // defpackage.dpf
    public final void h(dpe dpeVar) {
        this.b.c.remove(dpeVar);
    }

    public final String toString() {
        return "Target for: ".concat(this.a.toString());
    }

    @Override // defpackage.dne
    public final void l() {
    }

    @Override // defpackage.dne
    public final void m() {
    }

    @Override // defpackage.dne
    public final void n() {
    }

    @Override // defpackage.dpf
    public final void e(Drawable drawable) {
    }
}
