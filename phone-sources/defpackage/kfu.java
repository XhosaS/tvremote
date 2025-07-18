package defpackage;

import android.view.View;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kfu extends scf implements scl {
    public View.OnClickListener b;
    public sco a = sco.a;
    private int c = 0;
    private final Set d = new HashSet();

    @Override // defpackage.scf
    public final int a() {
        return R.layout.season_selection_item_view_layout;
    }

    @Override // defpackage.scl
    public final int b() {
        return this.c;
    }

    @Override // defpackage.scl
    public final int c() {
        return -1;
    }

    @Override // defpackage.scl
    public final int d() {
        return -1;
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        kfu kfuVar = (kfu) scfVar;
        long j = true != yks.e(this.a, kfuVar.a) ? 1L : 0L;
        return !yks.e(this.b, kfuVar.b) ? j | 2 : j;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new kft();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.pages.seasonselectionmenu.seasonselectionitem.SeasonSelectionItemViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        kft kftVar = (kft) scaVar;
        if (j == 0 || (1 & j) != 0) {
            try {
                kftVar.w(R.id.season_title, this.a.a(kftVar.o()), -1);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "season_title", "com.google.android.apps.googletv.app.presentation.pages.seasonselectionmenu.seasonselectionitem.SeasonSelectionItemViewBindable"));
            }
        }
        if (j == 0 || (j & 2) != 0) {
            try {
                kftVar.r(R.id.season, this.b);
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "season", "com.google.android.apps.googletv.app.presentation.pages.seasonselectionmenu.seasonselectionitem.SeasonSelectionItemViewBindable"));
            }
        }
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    @Override // defpackage.scl
    public final void k(int i) {
        this.c = i;
    }

    @Override // defpackage.scl
    public final boolean l() {
        return false;
    }

    @Override // defpackage.scl
    public final boolean m() {
        return true;
    }

    @Override // defpackage.scl
    public final boolean n() {
        return false;
    }

    @Override // defpackage.scf
    public final Object[] o() {
        return a.z();
    }

    @Override // defpackage.scl
    public final void p(sdd sddVar) {
        this.d.add(sddVar);
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        this.d.remove(sddVar);
    }

    public final String toString() {
        return String.format("SeasonSelectionItemViewModel{title=%s, seasonItemClickListener=%s}", this.a, this.b);
    }

    @Override // defpackage.scf
    public final void i(View view) {
    }

    @Override // defpackage.scf
    public final void j(View view) {
    }
}
