package defpackage;

import android.view.View;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kfp extends scf {
    public ImmutableList a;

    @Override // defpackage.scf
    public final int a() {
        return R.layout.season_selection_bottomsheet_view_layout;
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        return !yks.e(this.a, ((kfp) scfVar).a) ? 1L : 0L;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new kfo();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.pages.seasonselectionmenu.SeasonSelectionMenuViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        kfo kfoVar = (kfo) scaVar;
        if (j == 0 || (j & 1) != 0) {
            try {
                kfoVar.v(R.id.recycler_view, this.a, 0);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "recycler_view", "com.google.android.apps.googletv.app.presentation.pages.seasonselectionmenu.SeasonSelectionMenuViewBindable"));
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
        return String.format("SeasonSelectionMenuViewModel{seasonItems=%s}", this.a);
    }

    @Override // defpackage.scf
    public final void i(View view) {
    }

    @Override // defpackage.scf
    public final void j(View view) {
    }
}
