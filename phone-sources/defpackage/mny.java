package defpackage;

import android.view.View;
import com.google.android.videos.R;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mny extends scf {
    public View.OnClickListener a;

    @Override // defpackage.scf
    public final int a() {
        return R.layout.value_proposition;
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        return !yks.e(this.a, ((mny) scfVar).a) ? 1L : 0L;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new mnw();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.play.movies.mobile.usecase.gtvsetup.ValuePropositionBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        mnw mnwVar = (mnw) scaVar;
        if (j == 0 || (j & 1) != 0) {
            try {
                mnwVar.r(R.id.navigation_button, this.a);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "navigation_button", "com.google.android.apps.play.movies.mobile.usecase.gtvsetup.ValuePropositionBindable"));
            }
        }
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    @Override // defpackage.scf
    public final Object[] o() {
        return a.z();
    }

    public final String toString() {
        return String.format("ValuePropositionModel{navigationAction=%s}", this.a);
    }

    @Override // defpackage.scf
    public final void i(View view) {
    }

    @Override // defpackage.scf
    public final void j(View view) {
    }
}
