package defpackage;

import android.view.View;
import android.widget.ProgressBar;
import com.google.android.apps.googletv.app.presentation.views.playbutton.MediaDeviceAwarePlayButton;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jro extends scf implements scl {
    public scg a;
    public sck b;
    public Integer c;
    public kkb d;
    public wls e;
    public wls f;
    public View.OnClickListener g;
    public CharSequence h;
    private final yfo k;
    private wls l;
    private wlx m;
    public boolean i = true;
    private int n = 0;
    public final Set j = new HashSet();

    public jro(yfo yfoVar) {
        this.k = yfoVar;
    }

    @Override // defpackage.scf
    public final int a() {
        return R.layout.live_tv_card_view_layout;
    }

    @Override // defpackage.scl
    public final int b() {
        return this.n;
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
        jro jroVar = (jro) scfVar;
        long j = true != yks.e(this.c, jroVar.c) ? 1L : 0L;
        if (!yks.e(this.d, jroVar.d)) {
            j |= 2;
        }
        if (!yks.e(this.l, jroVar.l)) {
            j |= 4;
        }
        if (!yks.e(this.e, jroVar.e)) {
            j |= 8;
        }
        if (!yks.e(this.f, jroVar.f)) {
            j |= 16;
        }
        if (!yks.e(this.m, jroVar.m)) {
            j |= 32;
        }
        if (!yks.e(this.g, jroVar.g)) {
            j |= 64;
        }
        return !yks.e(this.h, jroVar.h) ? j | 128 : j;
    }

    @Override // defpackage.scf
    protected final /* bridge */ /* synthetic */ sca f() {
        return (sca) this.k.b();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.livetvcard.LiveTvCardViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        jrn jrnVar = (jrn) scaVar;
        MediaDeviceAwarePlayButton mediaDeviceAwarePlayButton = null;
        if (j == 0 || (1 & j) != 0) {
            Integer num = this.c;
            ProgressBar progressBar = jrnVar.a;
            if (progressBar == null) {
                yks.c("progressBar");
                progressBar = null;
            }
            progressBar.setProgress(num != null ? num.intValue() : 0);
        }
        if (j == 0 || (2 & j) != 0) {
            kkb kkbVar = this.d;
            kkbVar.getClass();
            MediaDeviceAwarePlayButton mediaDeviceAwarePlayButton2 = jrnVar.b;
            if (mediaDeviceAwarePlayButton2 == null) {
                yks.c("playOverlay");
            } else {
                mediaDeviceAwarePlayButton = mediaDeviceAwarePlayButton2;
            }
            mediaDeviceAwarePlayButton.a(kkbVar);
        }
        if (j == 0 || (4 & j) != 0) {
            jwq.j(jrnVar, this.l, R.id.titled_text, 8);
        }
        if (j == 0 || (8 & j) != 0) {
            jwq.j(jrnVar, this.e, R.id.title, -1);
        }
        if (j == 0 || (16 & j) != 0) {
            jwq.j(jrnVar, this.f, R.id.subtitle, -1);
        }
        if (j == 0 || (32 & j) != 0) {
            jrnVar.c.t(jrnVar, this.m, R.id.image, -1, -1, false, false, false);
        }
        if (j == 0 || (64 & j) != 0) {
            try {
                jrnVar.r(R.id.live_tv_card_component, this.g);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "live_tv_card_component", "com.google.android.apps.googletv.app.presentation.components.livetvcard.LiveTvCardViewBindable"));
            }
        }
        if (j == 0 || (128 & j) != 0) {
            try {
                jrnVar.s(R.id.live_tv_card_component, this.h);
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "live_tv_card_component", "com.google.android.apps.googletv.app.presentation.components.livetvcard.LiveTvCardViewBindable"));
            }
        }
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d, this.l, this.e, this.f, this.m, this.g, this.h);
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
        return this.i;
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
        this.j.add(sddVar);
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        this.j.remove(sddVar);
    }

    public final void r(wlx wlxVar) {
        if (yks.e(this.m, wlxVar)) {
            return;
        }
        this.m = wlxVar;
        G(5);
    }

    public final void s(wls wlsVar) {
        if (yks.e(this.l, wlsVar)) {
            return;
        }
        this.l = wlsVar;
        G(2);
    }

    public final String toString() {
        return String.format("LiveTvCardViewModel{progressBarProgress=%s, initPlayButton=%s, titledCardText=%s, title=%s, subtitle=%s, poster=%s, onClickListener=%s, contentDescription=%s}", this.c, this.d, this.l, this.e, this.f, this.m, this.g, this.h);
    }
}
