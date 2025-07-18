package defpackage;

import android.view.View;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jfy extends scf implements scl {
    public scg a;
    public sck b;
    public Integer c;
    public Integer d;
    public kkb e;
    public wls f;
    public wls g;
    public View.OnLongClickListener h;
    public View.OnClickListener i;
    public View.OnClickListener j;
    public View.OnLongClickListener k;
    public View.OnLongClickListener l;
    public CharSequence m;
    public CharSequence n;
    private final yfo o;
    private wls p;
    private wlx q;
    private int r = 0;
    private final Set s = new HashSet();

    public jfy(yfo yfoVar) {
        this.o = yfoVar;
    }

    @Override // defpackage.scf
    public final int a() {
        return R.layout.continue_watching_card_view_layout;
    }

    @Override // defpackage.scl
    public final int b() {
        return this.r;
    }

    @Override // defpackage.scl
    public final int c() {
        return 1;
    }

    @Override // defpackage.scl
    public final int d() {
        return 5;
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        jfy jfyVar = (jfy) scfVar;
        long j = true != yks.e(this.c, jfyVar.c) ? 1L : 0L;
        if (!yks.e(this.d, jfyVar.d)) {
            j |= 2;
        }
        if (!yks.e(this.e, jfyVar.e)) {
            j |= 4;
        }
        if (!yks.e(this.p, jfyVar.p)) {
            j |= 8;
        }
        if (!yks.e(this.f, jfyVar.f)) {
            j |= 16;
        }
        if (!yks.e(this.g, jfyVar.g)) {
            j |= 32;
        }
        if (!yks.e(this.q, jfyVar.q)) {
            j |= 64;
        }
        if (!yks.e(this.h, jfyVar.h)) {
            j |= 128;
        }
        if (!yks.e(this.i, jfyVar.i)) {
            j |= 256;
        }
        if (!yks.e(this.j, jfyVar.j)) {
            j |= 512;
        }
        if (!yks.e(this.k, jfyVar.k)) {
            j |= 1024;
        }
        if (!yks.e(this.l, jfyVar.l)) {
            j |= 2048;
        }
        if (!yks.e(this.m, jfyVar.m)) {
            j |= 4096;
        }
        if (!yks.e(this.n, jfyVar.n)) {
            j |= 8192;
        }
        return !yks.e(null, null) ? j | 16384 : j;
    }

    @Override // defpackage.scf
    protected final /* bridge */ /* synthetic */ sca f() {
        return (sca) this.o.b();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.continuewatching.ContinueWatchingViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        long j2;
        jfx jfxVar = (jfx) scaVar;
        if (j == 0 || (j & 1) != 0) {
            Integer num = this.c;
            jfxVar.e().setVisibility(8);
            if (num != null) {
                jfxVar.a().setVisibility(0);
                jfxVar.a().setProgress(num.intValue());
            } else {
                jfxVar.a().setVisibility(8);
            }
        }
        if (j == 0 || (j & 2) != 0) {
            Integer num2 = this.d;
            if (num2 != null) {
                jfxVar.e().setVisibility(0);
                jfxVar.a().setVisibility(8);
                jfxVar.e().setProgress(num2.intValue());
            } else {
                jfxVar.e().setVisibility(8);
            }
        }
        if (j == 0 || (j & 4) != 0) {
            kkb kkbVar = this.e;
            kkbVar.getClass();
            if (kkbVar.c) {
                jfxVar.d().a(kkbVar);
                jfxVar.b().setVisibility(8);
            } else {
                jfxVar.b().a(kkbVar);
                jfxVar.d().setVisibility(8);
            }
        }
        if (j == 0 || (j & 8) != 0) {
            jwq.j(jfxVar, this.p, R.id.titled_text, 8);
        }
        if (j == 0 || (j & 16) != 0) {
            jwq.j(jfxVar, this.f, R.id.title, -1);
        }
        if (j == 0 || (j & 32) != 0) {
            jwq.j(jfxVar, this.g, R.id.subtitle, -1);
        }
        if (j == 0 || (j & 64) != 0) {
            jfxVar.e.t(jfxVar, this.q, R.id.image, R.drawable.continue_watching_titled_background, -1, false, false, false);
        }
        if (j == 0 || (j & 128) != 0) {
            try {
                jfxVar.t(R.id.continue_watching_card_component, this.h);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "continue_watching_card_component", "com.google.android.apps.googletv.app.presentation.components.continuewatching.ContinueWatchingViewBindable"));
            }
        }
        if (j == 0 || (j & 256) != 0) {
            try {
                jfxVar.r(R.id.image, this.i);
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "image", "com.google.android.apps.googletv.app.presentation.components.continuewatching.ContinueWatchingViewBindable"));
            }
        }
        if (j == 0 || (j & 512) != 0) {
            j2 = 0;
            try {
                jfxVar.r(R.id.info_section, this.j);
            } catch (scr unused3) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "info_section", "com.google.android.apps.googletv.app.presentation.components.continuewatching.ContinueWatchingViewBindable"));
            }
        } else {
            j2 = 0;
        }
        if (j == 0 || (j & 1024) != j2) {
            try {
                jfxVar.t(R.id.image, this.k);
            } catch (scr unused4) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "image", "com.google.android.apps.googletv.app.presentation.components.continuewatching.ContinueWatchingViewBindable"));
            }
        }
        if (j == 0 || (j & 2048) != j2) {
            try {
                jfxVar.t(R.id.info_section, this.l);
            } catch (scr unused5) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "info_section", "com.google.android.apps.googletv.app.presentation.components.continuewatching.ContinueWatchingViewBindable"));
            }
        }
        if (j == 0 || (j & 4096) != j2) {
            try {
                jfxVar.s(R.id.continue_watching_card_component, this.m);
            } catch (scr unused6) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "continue_watching_card_component", "com.google.android.apps.googletv.app.presentation.components.continuewatching.ContinueWatchingViewBindable"));
            }
        }
        if (j == 0 || (j & 8192) != j2) {
            try {
                jfxVar.s(R.id.image_card, this.n);
            } catch (scr unused7) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "image_card", "com.google.android.apps.googletv.app.presentation.components.continuewatching.ContinueWatchingViewBindable"));
            }
        }
        if (j == 0 || (j & 16384) != j2) {
            jwq.h(jfxVar, null, R.id.continue_watching_card_component);
        }
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d, this.e, this.p, this.f, this.g, this.q, this.h, this.i, this.j, this.k, this.l, this.m, this.n, null);
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
        this.r = i;
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
        this.s.add(sddVar);
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        this.s.remove(sddVar);
    }

    public final void r(wlx wlxVar) {
        if (yks.e(this.q, wlxVar)) {
            return;
        }
        this.q = wlxVar;
        G(6);
    }

    public final void s(wls wlsVar) {
        if (yks.e(this.p, wlsVar)) {
            return;
        }
        this.p = wlsVar;
        G(3);
    }

    public final String toString() {
        return String.format("ContinueWatchingViewModel{progressBarProgress=%s, progressBarProgressBc25=%s, initPlayButton=%s, titledCardText=%s, title=%s, subtitle=%s, poster=%s, onLongClickListener=%s, onPosterClickListener=%s, onCardClickListener=%s, onLongClickListenerImage=%s, onLongClickListenerInfoSection=%s, contentDescription=%s, imageCardContentDescription=%s, tag=%s}", this.c, this.d, this.e, this.p, this.f, this.g, this.q, this.h, this.i, this.j, this.k, this.l, this.m, this.n, null);
    }
}
