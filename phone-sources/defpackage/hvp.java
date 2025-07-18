package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.videos.R;
import java.util.List;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public abstract class hvp extends hvf {
    protected final View b;
    public final hvo c;

    public hvp(View view) {
        hju.p(view);
        this.b = view;
        this.c = new hvo(view);
    }

    @Override // defpackage.hvf, defpackage.hvm
    public final hux c() {
        Object tag = this.b.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof hux) {
            return (hux) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // defpackage.hvf, defpackage.hvm
    public final void f(hux huxVar) {
        this.b.setTag(R.id.glide_custom_view_target_tag, huxVar);
    }

    @Override // defpackage.hvf, defpackage.hvm
    public final void g(hvd hvdVar) {
        hvo hvoVar = this.c;
        int iB = hvoVar.b();
        int iA = hvoVar.a();
        if (hvo.d(iB, iA)) {
            hvdVar.e(iB, iA);
            return;
        }
        List list = hvoVar.c;
        if (!list.contains(hvdVar)) {
            list.add(hvdVar);
        }
        if (hvoVar.d == null) {
            ViewTreeObserver viewTreeObserver = hvoVar.b.getViewTreeObserver();
            hvoVar.d = new hvn(hvoVar, 0);
            viewTreeObserver.addOnPreDrawListener(hvoVar.d);
        }
    }

    @Override // defpackage.hvf, defpackage.hvm
    public final void h(hvd hvdVar) {
        this.c.c.remove(hvdVar);
    }

    public final String toString() {
        return "Target for: ".concat(this.b.toString());
    }
}
