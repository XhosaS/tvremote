package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.videos.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvj implements hvm {
    protected final View a;
    private final hvi b;

    public hvj(View view) {
        hju.p(view);
        this.a = view;
        this.b = new hvi(view);
    }

    @Override // defpackage.hvm
    public final void a(Drawable drawable) {
        this.b.c();
    }

    @Override // defpackage.hvm
    public final hux c() {
        Object tag = this.a.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof hux) {
            return (hux) tag;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    @Override // defpackage.hvm
    public final void f(hux huxVar) {
        this.a.setTag(R.id.glide_custom_view_target_tag, huxVar);
    }

    @Override // defpackage.hvm
    public final void g(hvd hvdVar) {
        hvi hviVar = this.b;
        int iB = hviVar.b();
        int iA = hviVar.a();
        if (hvi.d(iB, iA)) {
            hvdVar.e(iB, iA);
            return;
        }
        List list = hviVar.c;
        if (!list.contains(hvdVar)) {
            list.add(hvdVar);
        }
        if (hviVar.d == null) {
            ViewTreeObserver viewTreeObserver = hviVar.b.getViewTreeObserver();
            hviVar.d = new hvn(hviVar, 1);
            viewTreeObserver.addOnPreDrawListener(hviVar.d);
        }
    }

    @Override // defpackage.hvm
    public final void h(hvd hvdVar) {
        this.b.c.remove(hvdVar);
    }

    public final String toString() {
        return "Target for: ".concat(this.a.toString());
    }

    @Override // defpackage.hud
    public final void k() {
    }

    @Override // defpackage.hud
    public final void l() {
    }

    @Override // defpackage.hud
    public final void m() {
    }

    @Override // defpackage.hvm
    public final void d(Drawable drawable) {
    }

    @Override // defpackage.hvm
    public final void e(Drawable drawable) {
    }

    @Override // defpackage.hvm
    public final void b(Object obj, hvv hvvVar) {
    }
}
