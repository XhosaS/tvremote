package defpackage;

import android.view.View;
import com.google.android.videos.R;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jtl extends scf {
    public iyk a;

    @Override // defpackage.scf
    public final int a() {
        return R.layout.search_suggestions_view;
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        return !yks.e(this.a, ((jtl) scfVar).a) ? 1L : 0L;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new jtk();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.searchsuggestions.SearchSuggestionsViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        jtk jtkVar = (jtk) scaVar;
        if (j == 0 || (j & 1) != 0) {
            try {
                jtkVar.u(R.id.stream_view, this.a);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "stream_view", "com.google.android.apps.googletv.app.presentation.components.searchsuggestions.SearchSuggestionsViewBindable"));
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
        return String.format("SearchSuggestionsViewModel{stream=%s}", this.a);
    }

    @Override // defpackage.scf
    public final void i(View view) {
    }

    @Override // defpackage.scf
    public final void j(View view) {
    }
}
