package defpackage;

import android.support.v7.widget.AppCompatButton;
import android.view.View;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jgp extends scf implements scl {
    public scg a;
    public sck b;
    public wls c;
    public wls d;
    public boolean f;
    public View.OnClickListener g;
    public int h;
    private final yfo i;
    public sco e = sco.a;
    private int j = 0;
    private final Set k = new HashSet();

    public jgp(yfo yfoVar) {
        this.i = yfoVar;
    }

    @Override // defpackage.scf
    public final int a() {
        return R.layout.empty_stream_page_result_layout;
    }

    @Override // defpackage.scl
    public final int b() {
        return this.j;
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
        jgp jgpVar = (jgp) scfVar;
        long j = true != yks.e(this.c, jgpVar.c) ? 1L : 0L;
        if (!yks.e(this.d, jgpVar.d)) {
            j |= 2;
        }
        if (!yks.e(this.e, jgpVar.e)) {
            j |= 4;
        }
        if (!yks.e(Boolean.valueOf(this.f), Boolean.valueOf(jgpVar.f))) {
            j |= 8;
        }
        if (this.h != jgpVar.h) {
            j |= 16;
        }
        return !yks.e(this.g, jgpVar.g) ? j | 32 : j;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new jgo();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.emptystreampageresult.EmptyStreamPageResultViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        int i;
        jgo jgoVar = (jgo) scaVar;
        if (j == 0 || (j & 1) != 0) {
            jwq.j(jgoVar, this.c, R.id.title, 8);
        }
        if (j == 0 || (j & 2) != 0) {
            jwq.j(jgoVar, this.d, R.id.description, 8);
        }
        if (j == 0 || (j & 4) != 0) {
            try {
                jgoVar.w(R.id.action_button, this.e.a(jgoVar.o()), -1);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "action_button", "com.google.android.apps.googletv.app.presentation.components.emptystreampageresult.EmptyStreamPageResultViewBindable"));
            }
        }
        if (j == 0 || (j & 8) != 0) {
            boolean z = this.f;
            AppCompatButton appCompatButton = jgoVar.a;
            if (appCompatButton == null) {
                yks.c("actionButton");
                appCompatButton = null;
            }
            appCompatButton.setVisibility(true != z ? 8 : 0);
        }
        if (j == 0 || (j & 16) != 0) {
            int i2 = this.h;
            if (i2 == 0 || i2 - 1 == 0 || i == 1) {
                jgoVar.a().setVisibility(8);
            } else if (i == 2) {
                jgoVar.a().setImageResource(R.drawable.watchlist_icon_with_background);
            } else if (i != 3) {
                jgoVar.a().setImageResource(R.drawable.ic_video_library_24);
            } else {
                jgoVar.a().setImageResource(2131232459);
            }
        }
        if (j == 0 || (j & 32) != 0) {
            try {
                jgoVar.r(R.id.action_button, this.g);
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "action_button", "com.google.android.apps.googletv.app.presentation.components.emptystreampageresult.EmptyStreamPageResultViewBindable"));
            }
        }
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d, this.e, Boolean.valueOf(this.f), Integer.valueOf(this.h), this.g);
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
        this.j = i;
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
        this.k.add(sddVar);
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        this.k.remove(sddVar);
    }

    public final String toString() {
        wls wlsVar = this.c;
        wls wlsVar2 = this.d;
        sco scoVar = this.e;
        Boolean boolValueOf = Boolean.valueOf(this.f);
        int i = this.h;
        return String.format("EmptyStreamPageResultViewModel{title=%s, description=%s, actionButtonText=%s, showActionButton=%s, iconImageType=%s, onActionButtonClickListener=%s}", wlsVar, wlsVar2, scoVar, boolValueOf, i != 0 ? Integer.toString(i - 1) : "null", this.g);
    }
}
