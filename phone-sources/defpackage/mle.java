package defpackage;

import android.view.View;
import com.google.android.apps.googletv.app.presentation.views.tagfilter.FireballView;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mle extends scf {
    public kkv a;
    public kke b;
    private List c;

    @Override // defpackage.scf
    public final int a() {
        return R.layout.fireball_view_layout;
    }

    public final void b(List list) {
        if (yks.e(this.c, list)) {
            return;
        }
        this.c = list;
        G(1);
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        mle mleVar = (mle) scfVar;
        long j = true != yks.e(this.a, mleVar.a) ? 1L : 0L;
        if (!yks.e(this.c, mleVar.c)) {
            j |= 2;
        }
        return !yks.e(this.b, mleVar.b) ? j | 4 : j;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new mld();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.play.movies.mobile.usecase.components.fireball.FireballBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        mld mldVar = (mld) scaVar;
        if (j == 0 || (1 & j) != 0) {
            kkv kkvVar = this.a;
            kkvVar.getClass();
            mldVar.a = kkvVar;
        }
        if (j == 0 || (2 & j) != 0) {
            List list = this.c;
            list.getClass();
            mldVar.b = list;
        }
        if (j == 0 || (j & 4) != 0) {
            mldVar.c = this.b;
        }
        View viewQ = mldVar.q();
        kkv kkvVar2 = null;
        FireballView fireballView = viewQ instanceof FireballView ? (FireballView) viewQ : null;
        if (fireballView != null) {
            kkv kkvVar3 = mldVar.a;
            if (kkvVar3 == null) {
                yks.c("gtvDataTree");
            } else {
                kkvVar2 = kkvVar3;
            }
            fireballView.b(kkvVar2, mldVar.b);
        }
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.c, this.b);
    }

    @Override // defpackage.scf
    public final Object[] o() {
        return a.z();
    }

    public final String toString() {
        return String.format("FireballModel{gtvDataTree=%s, selectedTags=%s, onGtvTagsChanged=%s}", this.a, this.c, this.b);
    }

    @Override // defpackage.scf
    public final void i(View view) {
    }

    @Override // defpackage.scf
    public final void j(View view) {
    }
}
