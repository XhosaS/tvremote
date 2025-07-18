package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.material.button.MaterialButton;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jlf extends scf implements scl {
    public scg a;
    public sck b;
    public wls c;
    public View.OnClickListener d;
    public View.OnClickListener e;
    public wls f;
    public CharSequence g;
    public View.OnClickListener h;
    public CharSequence i;
    public yjv j;
    public wfo k;
    private final int l;
    private final yfo m;
    private int n = 0;
    private final Set o = new HashSet();

    public jlf(yfo yfoVar, int i) {
        this.m = yfoVar;
        this.l = i;
    }

    @Override // defpackage.scf
    public final int a() {
        return this.l;
    }

    @Override // defpackage.scl
    public final int b() {
        return this.n;
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
        jlf jlfVar = (jlf) scfVar;
        long j = true != yks.e(this.c, jlfVar.c) ? 1L : 0L;
        if (!yks.e(this.d, jlfVar.d)) {
            j |= 2;
        }
        if (!yks.e(this.e, jlfVar.e)) {
            j |= 4;
        }
        if (!yks.e(this.f, jlfVar.f)) {
            j |= 8;
        }
        if (!yks.e(this.g, jlfVar.g)) {
            j |= 16;
        }
        if (!yks.e(this.h, jlfVar.h)) {
            j |= 32;
        }
        if (!yks.e(this.i, jlfVar.i)) {
            j |= 64;
        }
        if (!yks.e(this.j, jlfVar.j)) {
            j |= 128;
        }
        return !yks.e(this.k, jlfVar.k) ? j | 256 : j;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new jle();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.entity.seasonlist.SeasonListViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        CharSequence charSequence;
        yjv yjvVar;
        wfo wfoVar;
        jle jleVar = (jle) scaVar;
        if (j == 0 || (1 & j) != 0) {
            jwq.j(jleVar, this.c, R.id.season_stats, 8);
        }
        if (j == 0 || (2 & j) != 0) {
            try {
                jleVar.r(R.id.selected_season, this.d);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "selected_season", "com.google.android.apps.googletv.app.presentation.components.entity.seasonlist.SeasonListViewBindable"));
            }
        }
        if (j == 0 || (4 & j) != 0) {
            try {
                jleVar.r(R.id.selected_season_text, this.e);
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "selected_season_text", "com.google.android.apps.googletv.app.presentation.components.entity.seasonlist.SeasonListViewBindable"));
            }
        }
        if (j == 0 || (8 & j) != 0) {
            jwq.j(jleVar, this.f, R.id.ai_quick_recap_button_title, 8);
        }
        if (j == 0 || (16 & j) != 0) {
            try {
                jleVar.s(R.id.ai_quick_recap_button, this.g);
            } catch (scr unused3) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "ai_quick_recap_button", "com.google.android.apps.googletv.app.presentation.components.entity.seasonlist.SeasonListViewBindable"));
            }
        }
        if (j == 0 || (32 & j) != 0) {
            try {
                jleVar.r(R.id.ai_quick_recap_button, this.h);
            } catch (scr unused4) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "ai_quick_recap_button", "com.google.android.apps.googletv.app.presentation.components.entity.seasonlist.SeasonListViewBindable"));
            }
        }
        if ((j == 0 || (64 & j) != 0) && (charSequence = this.i) != null) {
            View viewA = jleVar.a();
            if (viewA instanceof TextView) {
                View viewA2 = jleVar.a();
                viewA2.getClass();
                ((TextView) viewA2).setText(charSequence);
            } else if (viewA instanceof MaterialButton) {
                View viewA3 = jleVar.a();
                viewA3.getClass();
                ((MaterialButton) viewA3).setText(charSequence);
            }
        }
        TextView textView = null;
        if ((j == 0 || (128 & j) != 0) && (yjvVar = this.j) != null) {
            View view = jleVar.b;
            if (view == null) {
                yks.c("selectedSeasonComposeView");
                view = null;
            }
            ComposeView composeView = view instanceof ComposeView ? (ComposeView) view : null;
            if (composeView != null) {
                composeView.setVisibility(0);
                jleVar.a().setVisibility(8);
                composeView.i();
                composeView.b(new bhq(-30362658, true, new awh(yjvVar, composeView, 11, null)));
            }
        }
        if ((j == 0 || (256 & j) != 0) && (wfoVar = this.k) != null) {
            TextView textView2 = jleVar.c;
            if (textView2 == null) {
                yks.c("seasonStats");
            } else {
                textView = textView2;
            }
            textView.setTextColor(wfoVar.h());
        }
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
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
        this.n = i;
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
        this.o.add(sddVar);
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        this.o.remove(sddVar);
    }

    public final String toString() {
        return String.format("SeasonListViewModel{seasonStats=%s, seasonSelectionClickListener=%s, seasonSelectionTextClickListener=%s, aiQuickRecapButtonTitle=%s, aiQuickRecapContentDescription=%s, aiQuickRecapClickListener=%s, selectedSeasonText=%s, selectedSeasonComposeView=%s, applyDynamicSchemeToSeasonStats=%s}", this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }
}
