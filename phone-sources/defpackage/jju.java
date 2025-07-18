package defpackage;

import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jju extends scf implements scl {
    public scg a;
    public sck b;
    public wls c;
    public View.OnClickListener d;
    public View.OnClickListener e;
    public CharSequence f;
    private final yfo g;
    private int h = 0;
    private final Set i = new HashSet();

    public jju(yfo yfoVar) {
        this.g = yfoVar;
    }

    @Override // defpackage.scf
    public final int a() {
        return R.layout.my_season_list_layout;
    }

    @Override // defpackage.scl
    public final int b() {
        return this.h;
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
        jju jjuVar = (jju) scfVar;
        long j = true != yks.e(this.c, jjuVar.c) ? 1L : 0L;
        if (!yks.e(this.d, jjuVar.d)) {
            j |= 2;
        }
        if (!yks.e(this.e, jjuVar.e)) {
            j |= 4;
        }
        return !yks.e(this.f, jjuVar.f) ? j | 8 : j;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new jjt();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.entity.myseasonlist.MySeasonListViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        CharSequence charSequence;
        jjt jjtVar = (jjt) scaVar;
        if (j == 0 || (1 & j) != 0) {
            jwq.j(jjtVar, this.c, R.id.season_stats, 8);
        }
        if (j == 0 || (2 & j) != 0) {
            try {
                jjtVar.r(R.id.selected_season, this.d);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "selected_season", "com.google.android.apps.googletv.app.presentation.components.entity.myseasonlist.MySeasonListViewBindable"));
            }
        }
        if (j == 0 || (4 & j) != 0) {
            try {
                jjtVar.r(R.id.selected_season_text, this.e);
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "selected_season_text", "com.google.android.apps.googletv.app.presentation.components.entity.myseasonlist.MySeasonListViewBindable"));
            }
        }
        if ((j == 0 || (j & 8) != 0) && (charSequence = this.f) != null) {
            MaterialButton materialButton = jjtVar.a;
            if (materialButton == null) {
                yks.c("selectedSeasonText");
                materialButton = null;
            }
            materialButton.setText(charSequence);
        }
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d, this.e, this.f);
    }

    @Override // defpackage.scf
    public final void i(View view) {
        scg scgVar = this.a;
        if (scgVar != null) {
            scgVar.a(this, view);
        }
    }

    @Override // defpackage.scf
    public final void j(View view) {
        sck sckVar = this.b;
        if (sckVar != null) {
            sckVar.a(this, view);
        }
    }

    @Override // defpackage.scl
    public final void k(int i) {
        this.h = i;
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
        this.i.add(sddVar);
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        this.i.remove(sddVar);
    }

    public final String toString() {
        return String.format("MySeasonListViewModel{seasonStats=%s, seasonSelectionClickListener=%s, seasonSelectionTextClickListener=%s, selectedSeasonText=%s}", this.c, this.d, this.e, this.f);
    }
}
