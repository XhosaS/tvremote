package defpackage;

import android.animation.LayoutTransition;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageButton;
import com.google.android.apps.googletv.app.device.presentation.companionbar.CompanionBarFragment;
import com.google.android.material.button.MaterialButton;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ivh extends scf implements scl {
    public ivf A;
    public int B;
    public ity D;
    private final yfo F;
    private boolean G;
    private boolean H;
    private ive I;
    public scg a;
    public sck b;
    public iun c;
    public ivq d;
    public ivl e;
    public View.OnClickListener f;
    public View.OnClickListener g;
    public View.OnClickListener h;
    public View.OnClickListener i;
    public View.OnClickListener j;
    public View.OnClickListener k;
    public View.OnClickListener l;
    public View.OnClickListener m;
    public View.OnClickListener n;
    public ihe o;
    public ihe p;
    public ihe q;
    public idr s;
    public LayoutTransition t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public boolean z;
    public sco r = sco.a;
    public int C = 0;
    private final Set J = new HashSet();

    public ivh(yfo yfoVar) {
        this.F = yfoVar;
    }

    @Override // defpackage.scf
    public final int a() {
        return R.layout.companion_bar_layout;
    }

    @Override // defpackage.scl
    public final int b() {
        return this.C;
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
        ivh ivhVar = (ivh) scfVar;
        long j = true != yks.e(this.c, ivhVar.c) ? 1L : 0L;
        if (!yks.e(this.d, ivhVar.d)) {
            j |= 2;
        }
        if (!yks.e(this.e, ivhVar.e)) {
            j |= 4;
        }
        if (!yks.e(this.f, ivhVar.f)) {
            j |= 8;
        }
        if (!yks.e(this.g, ivhVar.g)) {
            j |= 16;
        }
        if (!yks.e(this.h, ivhVar.h)) {
            j |= 32;
        }
        if (!yks.e(this.i, ivhVar.i)) {
            j |= 64;
        }
        if (!yks.e(this.j, ivhVar.j)) {
            j |= 128;
        }
        if (!yks.e(this.k, ivhVar.k)) {
            j |= 256;
        }
        if (!yks.e(this.l, ivhVar.l)) {
            j |= 512;
        }
        if (!yks.e(this.m, ivhVar.m)) {
            j |= 1024;
        }
        if (!yks.e(this.n, ivhVar.n)) {
            j |= 2048;
        }
        if (!yks.e(this.o, ivhVar.o)) {
            j |= 4096;
        }
        if (!yks.e(this.p, ivhVar.p)) {
            j |= 8192;
        }
        if (!yks.e(this.q, ivhVar.q)) {
            j |= 16384;
        }
        if (!yks.e(this.r, ivhVar.r)) {
            j |= 32768;
        }
        if (!yks.e(this.s, ivhVar.s)) {
            j |= 65536;
        }
        if (!yks.e(this.t, ivhVar.t)) {
            j |= 131072;
        }
        if (!yks.e(Boolean.valueOf(this.G), Boolean.valueOf(ivhVar.G))) {
            j |= 262144;
        }
        if (!yks.e(Boolean.valueOf(this.H), Boolean.valueOf(ivhVar.H))) {
            j |= 524288;
        }
        if (!yks.e(Boolean.valueOf(this.u), Boolean.valueOf(ivhVar.u))) {
            j |= 1048576;
        }
        if (!yks.e(Boolean.valueOf(this.v), Boolean.valueOf(ivhVar.v))) {
            j |= 2097152;
        }
        if (!yks.e(this.I, ivhVar.I)) {
            j |= 4194304;
        }
        if (!yks.e(Boolean.valueOf(this.w), Boolean.valueOf(ivhVar.w))) {
            j |= 8388608;
        }
        if (!yks.e(Boolean.valueOf(this.x), Boolean.valueOf(ivhVar.x))) {
            j |= 16777216;
        }
        if (!a.r(this.y, ivhVar.y)) {
            j |= 33554432;
        }
        if (!yks.e(Boolean.valueOf(this.z), Boolean.valueOf(ivhVar.z))) {
            j |= 67108864;
        }
        if (!yks.e(this.D, ivhVar.D)) {
            j |= 134217728;
        }
        if (!yks.e(this.A, ivhVar.A)) {
            j |= 268435456;
        }
        return !a.r(this.B, ivhVar.B) ? j | 536870912 : j;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new ivg();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.device.presentation.companionbar.CompanionBarViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        long j2;
        bv bvVar;
        cr childFragmentManager;
        cr supportFragmentManager;
        List listJ;
        Object next;
        bv bvVar2;
        cr childFragmentManager2;
        cr supportFragmentManager2;
        cr supportFragmentManager3;
        List listJ2;
        Object next2;
        ivf ivfVar;
        taw tawVar;
        idr idrVar;
        long j3 = 0;
        ivg ivgVar = (ivg) scaVar;
        if (j == 0 || (j & 1) != 0) {
            try {
                ivgVar.u(R.id.collapsed_companion_bar_view, this.c);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "collapsed_companion_bar_view", "com.google.android.apps.googletv.app.device.presentation.companionbar.CompanionBarViewBindable"));
            }
        }
        if (j == 0 || (j & 2) != 0) {
            try {
                ivgVar.u(R.id.expanded_remote_companion_bar_view, this.d);
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "expanded_remote_companion_bar_view", "com.google.android.apps.googletv.app.device.presentation.companionbar.CompanionBarViewBindable"));
            }
        }
        if (j == 0 || (j & 4) != 0) {
            try {
                ivgVar.u(R.id.expanded_media_companion_bar_view, this.e);
            } catch (scr unused3) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "expanded_media_companion_bar_view", "com.google.android.apps.googletv.app.device.presentation.companionbar.CompanionBarViewBindable"));
            }
        }
        if (j == 0 || (j & 8) != 0) {
            try {
                ivgVar.r(R.id.companion_bar_scrim, this.f);
            } catch (scr unused4) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "companion_bar_scrim", "com.google.android.apps.googletv.app.device.presentation.companionbar.CompanionBarViewBindable"));
            }
        }
        if (j == 0 || (j & 16) != 0) {
            try {
                ivgVar.r(R.id.collapsed_companion_bar_view, this.g);
            } catch (scr unused5) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "collapsed_companion_bar_view", "com.google.android.apps.googletv.app.device.presentation.companionbar.CompanionBarViewBindable"));
            }
        }
        if (j == 0 || (j & 32) != 0) {
            try {
                ivgVar.r(R.id.close_button, this.h);
            } catch (scr unused6) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "close_button", "com.google.android.apps.googletv.app.device.presentation.companionbar.CompanionBarViewBindable"));
            }
        }
        if (j == 0 || (j & 64) != 0) {
            try {
                ivgVar.r(R.id.power_button, this.i);
            } catch (scr unused7) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "power_button", "com.google.android.apps.googletv.app.device.presentation.companionbar.CompanionBarViewBindable"));
            }
        }
        if (j == 0 || (j & 128) != 0) {
            try {
                ivgVar.r(R.id.overflow_menu, this.j);
            } catch (scr unused8) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "overflow_menu", "com.google.android.apps.googletv.app.device.presentation.companionbar.CompanionBarViewBindable"));
            }
        }
        if (j == 0 || (j & 256) != 0) {
            try {
                ivgVar.r(R.id.keyboard_button, this.k);
            } catch (scr unused9) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "keyboard_button", "com.google.android.apps.googletv.app.device.presentation.companionbar.CompanionBarViewBindable"));
            }
        }
        if (j == 0 || (j & 512) != 0) {
            try {
                ivgVar.r(R.id.toolbar, this.l);
            } catch (scr unused10) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "toolbar", "com.google.android.apps.googletv.app.device.presentation.companionbar.CompanionBarViewBindable"));
            }
        }
        if (j == 0 || (j & 1024) != 0) {
            try {
                ivgVar.r(R.id.track_menu, this.m);
            } catch (scr unused11) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "track_menu", "com.google.android.apps.googletv.app.device.presentation.companionbar.CompanionBarViewBindable"));
            }
        }
        if (j == 0 || (j & 2048) != 0) {
            try {
                ivgVar.r(R.id.disconnect_button, this.n);
            } catch (scr unused12) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "disconnect_button", "com.google.android.apps.googletv.app.device.presentation.companionbar.CompanionBarViewBindable"));
            }
        }
        if (j == 0 || (j & 4096) != 0) {
            ipc.i(ivgVar, this.o, R.id.collapsed_companion_bar_view);
        }
        if (j == 0 || (j & 8192) != 0) {
            ipc.i(ivgVar, this.p, R.id.toolbar);
        }
        if (j == 0 || (j & 16384) != 0) {
            ipc.i(ivgVar, this.q, R.id.companion_bar_view);
        }
        if (j == 0 || (j & 32768) != 0) {
            try {
                ivgVar.w(R.id.device_subtitle, this.r.a(ivgVar.o()), -1);
            } catch (scr unused13) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "device_subtitle", "com.google.android.apps.googletv.app.device.presentation.companionbar.CompanionBarViewBindable"));
            }
        }
        if (j == 0 || (j & 65536) != 0) {
            idr idrVar2 = this.s;
            idrVar2.getClass();
            ivgVar.a = idrVar2;
        }
        if (j == 0 || (j & 131072) != 0) {
            LayoutTransition layoutTransition = this.t;
            layoutTransition.getClass();
            View viewQ = ivgVar.q();
            viewQ.getClass();
            ((ViewGroup) viewQ).setLayoutTransition(layoutTransition);
        }
        int i = 8;
        if (j == 0 || (j & 262144) != 0) {
            ivgVar.i().setVisibility(true != this.G ? 8 : 0);
        }
        if (j == 0 || (j & 524288) != 0) {
            ivgVar.a().setVisibility(true != this.H ? 8 : 0);
        }
        if (j == 0 || (j & 1048576) != 0) {
            boolean z = this.u;
            View view = ivgVar.k;
            if (view == null) {
                yks.c("overflowMenu");
                view = null;
            }
            view.setVisibility(true != z ? 8 : 0);
        }
        if (j == 0 || (j & 2097152) != 0) {
            boolean z2 = this.v;
            View view2 = ivgVar.i;
            if (view2 == null) {
                yks.c("powerButton");
                view2 = null;
            }
            view2.setVisibility(true != z2 ? 8 : 0);
        }
        if (j == 0 || (j & 4194304) != 0) {
            ive iveVar = this.I;
            boolean z3 = iveVar != null;
            if (z3) {
                by byVarN = ihz.N(ivgVar.q());
                by byVarN2 = ihz.N(ivgVar.q());
                if (byVarN2 == null || (supportFragmentManager3 = byVarN2.getSupportFragmentManager()) == null || (listJ2 = supportFragmentManager3.j()) == null) {
                    j2 = 0;
                    bvVar2 = null;
                } else {
                    Iterator it = listJ2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            j2 = j3;
                            next2 = null;
                            break;
                        } else {
                            next2 = it.next();
                            j2 = j3;
                            if (((bv) next2) instanceof CompanionBarFragment) {
                                break;
                            } else {
                                j3 = j2;
                            }
                        }
                    }
                    bvVar2 = (bv) next2;
                }
                ivgVar.i().m(ivgVar.o().getDrawable(R.drawable.ic_remote));
                bv bvVarF = (byVarN == null || (supportFragmentManager2 = byVarN.getSupportFragmentManager()) == null) ? null : supportFragmentManager2.f("KEYBOARD_TAG");
                tok tokVar = bvVarF instanceof tok ? (tok) bvVarF : null;
                if (tokVar == null) {
                    tok tokVar2 = new tok();
                    tokVar2.b(iveVar.a, iveVar.b);
                    if (bvVar2 != null) {
                        cr childFragmentManager3 = bvVar2.getChildFragmentManager();
                        if (childFragmentManager3 != null) {
                            at atVar = new at(childFragmentManager3);
                            atVar.q(R.id.keyboard_fragment, tokVar2, "KEYBOARD_TAG");
                            atVar.s("KEYBOARD_TAG");
                            atVar.a();
                        }
                    } else {
                        bvVar2 = null;
                    }
                    if (bvVar2 != null && (childFragmentManager2 = bvVar2.getChildFragmentManager()) != null) {
                        childFragmentManager2.af();
                    }
                } else {
                    tokVar.b(iveVar.a, iveVar.b);
                }
                ivgVar.d().setVisibility(0);
            } else {
                j2 = 0;
                by byVarN3 = ihz.N(ivgVar.q());
                by byVarN4 = ihz.N(ivgVar.q());
                if (byVarN4 == null || (supportFragmentManager = byVarN4.getSupportFragmentManager()) == null || (listJ = supportFragmentManager.j()) == null) {
                    bvVar = null;
                } else {
                    Iterator it2 = listJ.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it2.next();
                            if (((bv) next) instanceof CompanionBarFragment) {
                                break;
                            }
                        }
                    }
                    bvVar = (bv) next;
                }
                if (ivgVar.d().getVisibility() == 0 && byVarN3 != null && !byVarN3.isFinishing() && !byVarN3.isDestroyed() && bvVar != null && (childFragmentManager = bvVar.getChildFragmentManager()) != null) {
                    childFragmentManager.ad("KEYBOARD_TAG", -1, 1);
                }
                ivgVar.d().setVisibility(8);
                ivgVar.i().m(ivgVar.o().getDrawable(R.drawable.gm_filled_keyboard_vd_theme_24));
            }
            InputMethodManager inputMethodManager = (InputMethodManager) ivgVar.o().getSystemService("input_method");
            if (z3) {
                if (inputMethodManager != null) {
                    inputMethodManager.toggleSoftInput(2, 0);
                }
            } else if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(ivgVar.q().getWindowToken(), 0);
            }
        } else {
            j2 = 0;
        }
        if (j == 0 || (j & 8388608) != j2) {
            boolean z4 = this.w;
            LayoutInflater.Factory factoryN = ihz.N(ivgVar.q());
            ivt ivtVar = factoryN instanceof ivt ? (ivt) factoryN : null;
            if (ivtVar != null) {
                ivtVar.f(z4);
            }
            View viewB = ivgVar.b();
            int i2 = true != z4 ? 8 : 0;
            viewB.setVisibility(i2);
            ivgVar.e().setVisibility(i2);
            ivgVar.e().setAlpha(true != z4 ? 0.0f : 1.0f);
            ViewGroup.LayoutParams layoutParams = ivgVar.c().getLayoutParams();
            layoutParams.getClass();
            ((cqe) layoutParams).height = -2;
        }
        if (j == 0 || (j & 16777216) != j2) {
            boolean z5 = this.x;
            ViewGroup.LayoutParams layoutParams2 = ivgVar.c().getLayoutParams();
            layoutParams2.getClass();
            ((cqe) layoutParams2).height = true == z5 ? 0 : -2;
        }
        if (j == 0 || (j & 33554432) != j2) {
            ivgVar.c().setPadding(0, 0, 0, this.y);
        }
        if (j == 0 || (j & 67108864) != j2) {
            boolean z6 = this.z;
            ImageButton imageButton = ivgVar.h;
            if (imageButton == null) {
                yks.c("closeButton");
                imageButton = null;
            }
            imageButton.setImageIcon(z6 ? Icon.createWithResource(ivgVar.o(), R.drawable.ic_close_24dp) : Icon.createWithResource(ivgVar.o(), R.drawable.ic_expand_more_24dp));
            if (z6) {
                ivgVar.b().setBackgroundColor(0);
            }
        }
        if (j == 0 || (j & 134217728) != j2) {
            ity ityVar = this.D;
            MaterialButton materialButtonJ = ivgVar.j();
            if (ityVar != null && ityVar.a) {
                i = 0;
            }
            materialButtonJ.setVisibility(i);
            ivgVar.j().m((ityVar != null ? ityVar.c : null) != null ? ivgVar.o().getDrawable(R.drawable.gm_filled_closed_caption_off_vd_theme_24) : ivgVar.o().getDrawable(R.drawable.quantum_gm_ic_closed_caption_off_vd_theme_24));
        }
        if ((j == 0 || (j & 268435456) != j2) && (ivfVar = this.A) != null) {
            tbb tbbVarN = tbb.n(ivgVar.q(), ivfVar.a, 0);
            if (!ivfVar.b) {
                View viewC = ivgVar.c();
                taw tawVar2 = tbbVarN.l;
                if (tawVar2 != null) {
                    tawVar2.a();
                }
                if (viewC == null) {
                    tawVar = null;
                } else {
                    tawVar = new taw(tbbVarN, viewC);
                    if (viewC.isAttachedToWindow()) {
                        sil.m(viewC, tawVar);
                    }
                    viewC.addOnAttachStateChangeListener(tawVar);
                }
                tbbVarN.l = tawVar;
            }
            tbbVarN.h();
        }
        if (j == 0 || (j & 536870912) != j2) {
            Drawable drawable = ivgVar.o().getDrawable(this.B);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            ivgVar.f().measure(iMakeMeasureSpec, iMakeMeasureSpec);
            int measuredHeight = ivgVar.f().getMeasuredHeight();
            if (drawable != null) {
                drawable.setBounds(0, 0, measuredHeight, measuredHeight);
            }
            ivgVar.f().setCompoundDrawables(drawable, null, null, null);
        }
        if (ivgVar.a().getVisibility() != 0 || (idrVar = ivgVar.a) == null) {
            return;
        }
        idrVar.c(Integer.valueOf(ivgVar.o().getResources().getDimensionPixelOffset(R.dimen.expected_collapsed_companion_bar_height) + ivgVar.c().getPaddingBottom()));
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, Boolean.valueOf(this.G), Boolean.valueOf(this.H), Boolean.valueOf(this.u), Boolean.valueOf(this.v), this.I, Boolean.valueOf(this.w), Boolean.valueOf(this.x), Integer.valueOf(this.y), Boolean.valueOf(this.z), this.D, this.A, Integer.valueOf(this.B));
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
        this.C = i;
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
        this.J.add(sddVar);
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        this.J.remove(sddVar);
    }

    public final void r(boolean z) {
        if (yks.e(Boolean.valueOf(this.H), Boolean.valueOf(z))) {
            return;
        }
        this.H = z;
        G(19);
    }

    public final void s(boolean z) {
        if (yks.e(Boolean.valueOf(this.G), Boolean.valueOf(z))) {
            return;
        }
        this.G = z;
        G(18);
    }

    public final void t(ive iveVar) {
        if (yks.e(this.I, iveVar)) {
            return;
        }
        this.I = iveVar;
        G(22);
    }

    public final String toString() {
        return String.format("CompanionBarViewModel{collapsedCompanionBar=%s, expandedRemoteCompanionBar=%s, expandedMediaCompanionBar=%s, companionBarScrimClickListener=%s, companionBarViewClickListener=%s, closeButtonClickListener=%s, powerButtonClickListener=%s, overflowMenuClickListener=%s, keyboardButtonClickListener=%s, toolbarClickListener=%s, trackMenuClickListener=%s, disconnectButtonClickListener=%s, collapsedCompanionBarViewSwipeListener=%s, toolbarSwipeListener=%s, companionBarViewSwipeListener=%s, deviceSubtitle=%s, companionBarClearanceHeightRepository=%s, layoutTransition=%s, keyboardButtonVisibility=%s, companionBarVisibility=%s, overflowMenuVisibility=%s, powerButtonVisibility=%s, keyboardData=%s, isExpanded=%s, updateCompanionBarHeight=%s, companionBarPaddingBottom=%s, isFullscreen=%s, trackInfo=%s, poweredOnMessage=%s, deviceIconResource=%s}", this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, Boolean.valueOf(this.G), Boolean.valueOf(this.H), Boolean.valueOf(this.u), Boolean.valueOf(this.v), this.I, Boolean.valueOf(this.w), Boolean.valueOf(this.x), Integer.valueOf(this.y), Boolean.valueOf(this.z), this.D, this.A, Integer.valueOf(this.B));
    }
}
