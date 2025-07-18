package defpackage;

import android.view.View;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dn extends C0038do {
    private final nxo j;

    /* JADX WARN: Illegal instructions before constructor call */
    public dn(int i, int i2, nxo nxoVar) {
        Object obj = nxoVar.d;
        obj.getClass();
        super(i, i2, (bv) obj);
        this.j = nxoVar;
    }

    @Override // defpackage.C0038do
    public final void a() {
        super.a();
        this.a.mTransitioning = false;
        this.j.i();
    }

    @Override // defpackage.C0038do
    public final void b() {
        if (this.e) {
            return;
        }
        super.b();
        int i = this.i;
        if (i != 2) {
            if (i == 3) {
                Object obj = this.j.d;
                obj.getClass();
                View viewRequireView = ((bv) obj).requireView();
                if (cr.Y(2)) {
                    Objects.toString(viewRequireView.findFocus());
                    Objects.toString(viewRequireView);
                    Objects.toString(obj);
                }
                viewRequireView.clearFocus();
                return;
            }
            return;
        }
        nxo nxoVar = this.j;
        Object obj2 = nxoVar.d;
        obj2.getClass();
        bv bvVar = (bv) obj2;
        View viewFindFocus = bvVar.mView.findFocus();
        if (viewFindFocus != null) {
            bvVar.setFocusedView(viewFindFocus);
            if (cr.Y(2)) {
                Objects.toString(viewFindFocus);
                Objects.toString(obj2);
            }
        }
        View viewRequireView2 = this.a.requireView();
        if (viewRequireView2.getParent() == null) {
            if (cr.Y(2)) {
                Objects.toString(obj2);
                Objects.toString(viewRequireView2);
            }
            nxoVar.f();
            viewRequireView2.setAlpha(0.0f);
        }
        if (viewRequireView2.getAlpha() == 0.0f && viewRequireView2.getVisibility() == 0) {
            if (cr.Y(2)) {
                Objects.toString(viewRequireView2);
            }
            viewRequireView2.setVisibility(4);
        }
        viewRequireView2.setAlpha(bvVar.getPostOnViewCreatedAlpha());
        if (cr.Y(2)) {
            bvVar.getPostOnViewCreatedAlpha();
        }
    }
}
