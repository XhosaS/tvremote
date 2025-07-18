package defpackage;

import android.view.View;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jgy extends scf implements scl {
    public scg a;
    public sck b;
    public jhi c;
    public wls d;
    public boolean e;
    public String f;
    private final yfo i;
    private jhf j;
    private jhv k;
    private jhv l;
    private jhv m;
    private jhv n;
    private jhm o;
    private jhs p;
    private jhs q;
    private jhp r;
    private jhp s;
    private jhc t;
    private boolean u;
    public boolean g = true;
    private int v = 0;
    public final Set h = new HashSet();

    public jgy(yfo yfoVar) {
        this.i = yfoVar;
    }

    public final void A(jhs jhsVar) {
        if (yks.e(this.p, jhsVar)) {
            return;
        }
        this.p = jhsVar;
        G(7);
    }

    public final void B(jhv jhvVar) {
        if (yks.e(this.l, jhvVar)) {
            return;
        }
        this.l = jhvVar;
        G(3);
    }

    public final void C(jhv jhvVar) {
        if (yks.e(this.n, jhvVar)) {
            return;
        }
        this.n = jhvVar;
        G(5);
    }

    @Override // defpackage.scf
    public final int a() {
        return R.layout.action_panel_v2_layout;
    }

    @Override // defpackage.scl
    public final int b() {
        return this.v;
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
        jgy jgyVar = (jgy) scfVar;
        long j = true != yks.e(this.j, jgyVar.j) ? 1L : 0L;
        if (!yks.e(this.c, jgyVar.c)) {
            j |= 2;
        }
        if (!yks.e(this.k, jgyVar.k)) {
            j |= 4;
        }
        if (!yks.e(this.l, jgyVar.l)) {
            j |= 8;
        }
        if (!yks.e(this.m, jgyVar.m)) {
            j |= 16;
        }
        if (!yks.e(this.n, jgyVar.n)) {
            j |= 32;
        }
        if (!yks.e(this.o, jgyVar.o)) {
            j |= 64;
        }
        if (!yks.e(this.p, jgyVar.p)) {
            j |= 128;
        }
        if (!yks.e(this.q, jgyVar.q)) {
            j |= 256;
        }
        if (!yks.e(this.r, jgyVar.r)) {
            j |= 512;
        }
        if (!yks.e(this.s, jgyVar.s)) {
            j |= 1024;
        }
        if (!yks.e(this.t, jgyVar.t)) {
            j |= 2048;
        }
        if (!yks.e(this.d, jgyVar.d)) {
            j |= 4096;
        }
        if (!yks.e(false, false)) {
            j |= 8192;
        }
        if (!yks.e(Boolean.valueOf(this.e), Boolean.valueOf(jgyVar.e))) {
            j |= 16384;
        }
        if (!yks.e(Boolean.valueOf(this.u), Boolean.valueOf(jgyVar.u))) {
            j |= 32768;
        }
        return !yks.e(this.f, jgyVar.f) ? j | 65536 : j;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new jgx();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.ActionPanelV2ViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        jgx jgxVar = (jgx) scaVar;
        if (j == 0 || (1 & j) != 0) {
            try {
                jgxVar.u(R.id.companion_cta_layout, this.j);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "companion_cta_layout", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.ActionPanelV2ViewBindable"));
            }
        }
        if (j == 0 || (2 & j) != 0) {
            try {
                jgxVar.u(R.id.companion_watch_local_cta_layout, this.c);
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "companion_watch_local_cta_layout", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.ActionPanelV2ViewBindable"));
            }
        }
        if (j == 0 || (4 & j) != 0) {
            try {
                jgxVar.u(R.id.cancel_preorder_cta_layout, this.k);
            } catch (scr unused3) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "cancel_preorder_cta_layout", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.ActionPanelV2ViewBindable"));
            }
        }
        if (j == 0 || (8 & j) != 0) {
            try {
                jgxVar.u(R.id.rent_provider_cta_layout, this.l);
            } catch (scr unused4) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "rent_provider_cta_layout", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.ActionPanelV2ViewBindable"));
            }
        }
        if (j == 0 || (16 & j) != 0) {
            try {
                jgxVar.u(R.id.purchase_provider_cta_layout, this.m);
            } catch (scr unused5) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "purchase_provider_cta_layout", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.ActionPanelV2ViewBindable"));
            }
        }
        if (j == 0 || (32 & j) != 0) {
            try {
                jgxVar.u(R.id.show_episodes_cta_layout, this.n);
            } catch (scr unused6) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "show_episodes_cta_layout", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.ActionPanelV2ViewBindable"));
            }
        }
        if (j == 0 || (64 & j) != 0) {
            try {
                jgxVar.u(R.id.download_cta_layout, this.o);
            } catch (scr unused7) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "download_cta_layout", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.ActionPanelV2ViewBindable"));
            }
        }
        if (j == 0 || (128 & j) != 0) {
            try {
                jgxVar.u(R.id.rent_cta_layout, this.p);
            } catch (scr unused8) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "rent_cta_layout", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.ActionPanelV2ViewBindable"));
            }
        }
        if (j == 0 || (256 & j) != 0) {
            try {
                jgxVar.u(R.id.purchase_cta_layout, this.q);
            } catch (scr unused9) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "purchase_cta_layout", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.ActionPanelV2ViewBindable"));
            }
        }
        if (j == 0 || (512 & j) != 0) {
            try {
                jgxVar.u(R.id.my_episodes_cta_layout, this.r);
            } catch (scr unused10) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "my_episodes_cta_layout", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.ActionPanelV2ViewBindable"));
            }
        }
        if (j == 0 || (1024 & j) != 0) {
            try {
                jgxVar.u(R.id.more_providers_cta_layout, this.s);
            } catch (scr unused11) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "more_providers_cta_layout", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.ActionPanelV2ViewBindable"));
            }
        }
        if (j == 0 || (2048 & j) != 0) {
            try {
                jgxVar.u(R.id.ai_overview_cta_layout, this.t);
            } catch (scr unused12) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "ai_overview_cta_layout", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.ActionPanelV2ViewBindable"));
            }
        }
        if (j == 0 || (4096 & j) != 0) {
            jwq.j(jgxVar, this.d, R.id.companion_disclaimer_text, -1);
        }
        View view = null;
        if (j == 0 || (8192 & j) != 0) {
            View view2 = jgxVar.b;
            if (view2 == null) {
                yks.c("watchActionSpacers");
                view2 = null;
            }
            view2.setVisibility(8);
        }
        if (j == 0 || (16384 & j) != 0) {
            boolean z = this.e;
            View view3 = jgxVar.a;
            if (view3 == null) {
                yks.c("purchaseActionsSpacer");
                view3 = null;
            }
            view3.setVisibility(true != z ? 8 : 0);
        }
        if (j == 0 || (32768 & j) != 0) {
            boolean z2 = this.u;
            View view4 = jgxVar.c;
            if (view4 == null) {
                yks.c("castDisclaimer");
            } else {
                view = view4;
            }
            view.setVisibility(true != z2 ? 8 : 0);
        }
        if (j == 0 || (j & 65536) != 0) {
            jwq.h(jgxVar, this.f, R.id.tvm_entity_action_panel_component);
        }
    }

    public final int hashCode() {
        return Objects.hash(this.j, this.c, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.d, false, Boolean.valueOf(this.e), Boolean.valueOf(this.u), this.f);
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
        this.v = i;
    }

    @Override // defpackage.scl
    public final boolean l() {
        return false;
    }

    @Override // defpackage.scl
    public final boolean m() {
        return this.g;
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
        this.h.add(sddVar);
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        this.h.remove(sddVar);
    }

    public final void r(jhc jhcVar) {
        if (yks.e(this.t, jhcVar)) {
            return;
        }
        this.t = jhcVar;
        G(11);
    }

    public final void s(jhv jhvVar) {
        if (yks.e(this.k, jhvVar)) {
            return;
        }
        this.k = jhvVar;
        G(2);
    }

    public final void t(boolean z) {
        if (yks.e(Boolean.valueOf(this.u), Boolean.valueOf(z))) {
            return;
        }
        this.u = z;
        G(15);
    }

    public final String toString() {
        return String.format("ActionPanelV2ViewModel{companionCta=%s, companionWatchLocalCta=%s, cancelPreorderCta=%s, rentProviderCta=%s, purchaseProviderCta=%s, showEpisodesCta=%s, downloadCta=%s, rentCta=%s, purchaseCta=%s, myEpisodesCta=%s, moreProviderCta=%s, aiOverviewCta=%s, companionDisclaimerText=%s, watchActionsSpacerVisibility=%s, purchaseActionsSpacerVisibility=%s, castDisclaimerIsVisible=%s, tag=%s}", this.j, this.c, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.d, false, Boolean.valueOf(this.e), Boolean.valueOf(this.u), this.f);
    }

    public final void u(jhf jhfVar) {
        if (yks.e(this.j, jhfVar)) {
            return;
        }
        this.j = jhfVar;
        G(0);
    }

    public final void v(jhm jhmVar) {
        if (yks.e(this.o, jhmVar)) {
            return;
        }
        this.o = jhmVar;
        G(6);
    }

    public final void w(jhp jhpVar) {
        if (yks.e(this.s, jhpVar)) {
            return;
        }
        this.s = jhpVar;
        G(10);
    }

    public final void x(jhp jhpVar) {
        if (yks.e(this.r, jhpVar)) {
            return;
        }
        this.r = jhpVar;
        G(9);
    }

    public final void y(jhs jhsVar) {
        if (yks.e(this.q, jhsVar)) {
            return;
        }
        this.q = jhsVar;
        G(8);
    }

    public final void z(jhv jhvVar) {
        if (yks.e(this.m, jhvVar)) {
            return;
        }
        this.m = jhvVar;
        G(4);
    }
}
