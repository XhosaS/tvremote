package defpackage;

import android.view.View;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jug extends scf implements scl {
    public scg a;
    public sck b;
    public wls c;
    public wls d;
    public wlx e;
    public wlx f;
    public wlx g;
    public wlx h;
    public wlx i;
    public View.OnClickListener k;
    public boolean l;
    private final yfo o;
    public sco j = sco.a;
    public boolean m = true;
    private int p = 0;
    public final Set n = new HashSet();

    public jug(yfo yfoVar) {
        this.o = yfoVar;
    }

    @Override // defpackage.scf
    public final int a() {
        return R.layout.setup_confirmation_card_view_layout;
    }

    @Override // defpackage.scl
    public final int b() {
        return this.p;
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
        jug jugVar = (jug) scfVar;
        long j = true != yks.e(this.c, jugVar.c) ? 1L : 0L;
        if (!yks.e(this.d, jugVar.d)) {
            j |= 2;
        }
        if (!yks.e(this.e, jugVar.e)) {
            j |= 4;
        }
        if (!yks.e(this.f, jugVar.f)) {
            j |= 8;
        }
        if (!yks.e(this.g, jugVar.g)) {
            j |= 16;
        }
        if (!yks.e(this.h, jugVar.h)) {
            j |= 32;
        }
        if (!yks.e(this.i, jugVar.i)) {
            j |= 64;
        }
        if (!yks.e(this.j, jugVar.j)) {
            j |= 128;
        }
        if (!yks.e(this.k, jugVar.k)) {
            j |= 256;
        }
        return !yks.e(Boolean.valueOf(this.l), Boolean.valueOf(jugVar.l)) ? j | 512 : j;
    }

    @Override // defpackage.scf
    protected final /* bridge */ /* synthetic */ sca f() {
        return (sca) this.o.b();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.setupconfirmationcard.SetupConfirmationCardViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        juf jufVar = (juf) scaVar;
        if (j == 0 || (1 & j) != 0) {
            jwq.j(jufVar, this.c, R.id.title, 8);
        }
        if (j == 0 || (2 & j) != 0) {
            jwq.j(jufVar, this.d, R.id.description, 8);
        }
        if (j == 0 || (4 & j) != 0) {
            jufVar.b.t(jufVar, this.e, R.id.image1, -1, 8, true, false, false);
        }
        if (j == 0 || (8 & j) != 0) {
            jufVar.c.t(jufVar, this.f, R.id.image2, -1, 8, true, false, false);
        }
        if (j == 0 || (16 & j) != 0) {
            jufVar.d.t(jufVar, this.g, R.id.image3, -1, 8, true, false, false);
        }
        if (j == 0 || (32 & j) != 0) {
            jufVar.e.t(jufVar, this.h, R.id.image4, -1, 8, true, false, false);
        }
        if (j == 0 || (64 & j) != 0) {
            jufVar.f.t(jufVar, this.i, R.id.image5, -1, 8, true, false, false);
        }
        if (j == 0 || (128 & j) != 0) {
            try {
                jufVar.w(R.id.additional_providers, this.j.a(jufVar.o()), 8);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "additional_providers", "com.google.android.apps.googletv.app.presentation.components.setupconfirmationcard.SetupConfirmationCardViewBindable"));
            }
        }
        if (j == 0 || (256 & j) != 0) {
            try {
                jufVar.r(R.id.setup_dismiss, this.k);
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "setup_dismiss", "com.google.android.apps.googletv.app.presentation.components.setupconfirmationcard.SetupConfirmationCardViewBindable"));
            }
        }
        if (j == 0 || (j & 512) != 0) {
            boolean z = this.l;
            View view = jufVar.a;
            if (view == null) {
                yks.c("dismissButton");
                view = null;
            }
            view.setVisibility(true == z ? 0 : 8);
        }
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, Boolean.valueOf(this.l));
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
        this.p = i;
    }

    @Override // defpackage.scl
    public final boolean l() {
        return false;
    }

    @Override // defpackage.scl
    public final boolean m() {
        return this.m;
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
        this.n.add(sddVar);
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        this.n.remove(sddVar);
    }

    public final String toString() {
        return String.format("SetupConfirmationCardViewModel{title=%s, description=%s, firstImage=%s, secondImage=%s, thirdImage=%s, fourthImage=%s, fifthImage=%s, additionalProvidersText=%s, onDismissListener=%s, showDismissButton=%s}", this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, Boolean.valueOf(this.l));
    }
}
