package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jij extends scf implements scl {
    public scg a;
    public sck b;
    public wlx c;
    public sco d;
    public sco e;
    public sco f;
    public wls g;
    public wls h;
    public View.OnClickListener i;
    public View.OnClickListener j;
    public View.OnClickListener k;
    public boolean l;
    public boolean m;
    public boolean n;
    public String o;
    public kuj p;
    public kkb q;
    public boolean r;
    public boolean s;
    public CharSequence t;
    public CharSequence u;
    private final yfo v;
    private View.OnClickListener w;
    private View.OnClickListener x;
    private int y;
    private final Set z;

    public jij(yfo yfoVar) {
        sco scoVar = sco.a;
        this.d = scoVar;
        this.e = scoVar;
        this.f = scoVar;
        this.y = 0;
        this.z = new HashSet();
        this.v = yfoVar;
    }

    @Override // defpackage.scf
    public final int a() {
        return R.layout.entity_episode_item_view_layout;
    }

    @Override // defpackage.scl
    public final int b() {
        return this.y;
    }

    @Override // defpackage.scl
    public final int c() {
        return -1;
    }

    @Override // defpackage.scl
    public final int d() {
        return 10;
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        jij jijVar = (jij) scfVar;
        long j = true != yks.e(this.c, jijVar.c) ? 1L : 0L;
        if (!yks.e(this.d, jijVar.d)) {
            j |= 2;
        }
        if (!yks.e(this.e, jijVar.e)) {
            j |= 4;
        }
        if (!yks.e(this.f, jijVar.f)) {
            j |= 8;
        }
        if (!yks.e(this.g, jijVar.g)) {
            j |= 16;
        }
        if (!yks.e(this.h, jijVar.h)) {
            j |= 32;
        }
        if (!yks.e(this.i, jijVar.i)) {
            j |= 64;
        }
        if (!yks.e(this.w, jijVar.w)) {
            j |= 128;
        }
        if (!yks.e(this.j, jijVar.j)) {
            j |= 256;
        }
        if (!yks.e(this.x, jijVar.x)) {
            j |= 512;
        }
        if (!yks.e(this.k, jijVar.k)) {
            j |= 1024;
        }
        if (!yks.e(Boolean.valueOf(this.l), Boolean.valueOf(jijVar.l))) {
            j |= 2048;
        }
        if (!yks.e(Boolean.valueOf(this.m), Boolean.valueOf(jijVar.m))) {
            j |= 4096;
        }
        if (!yks.e(Boolean.valueOf(this.n), Boolean.valueOf(jijVar.n))) {
            j |= 8192;
        }
        if (!yks.e(this.o, jijVar.o)) {
            j |= 16384;
        }
        if (!yks.e(this.p, jijVar.p)) {
            j |= 32768;
        }
        if (!yks.e(this.q, jijVar.q)) {
            j |= 65536;
        }
        if (!yks.e(Boolean.valueOf(this.r), Boolean.valueOf(jijVar.r))) {
            j |= 131072;
        }
        if (!yks.e(Boolean.valueOf(this.s), Boolean.valueOf(jijVar.s))) {
            j |= 262144;
        }
        if (!yks.e(this.t, jijVar.t)) {
            j |= 524288;
        }
        return !yks.e(this.u, jijVar.u) ? j | 1048576 : j;
    }

    @Override // defpackage.scf
    protected final /* bridge */ /* synthetic */ sca f() {
        return (sca) this.v.b();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.entity.episodeitem.EpisodeItemViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        String str;
        kuj kujVar;
        jii jiiVar = (jii) scaVar;
        if (j == 0 || (1 & j) != 0) {
            jiiVar.h.t(jiiVar, this.c, R.id.thumbnail_image, R.drawable.gtv_tvm_card_default_background, -1, false, false, false);
        }
        if (j == 0 || (2 & j) != 0) {
            try {
                jiiVar.w(R.id.thumbnail_placeholder_text, this.d.a(jiiVar.o()), 8);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "thumbnail_placeholder_text", "com.google.android.apps.googletv.app.presentation.components.entity.episodeitem.EpisodeItemViewBindable"));
            }
        }
        if (j == 0 || (4 & j) != 0) {
            try {
                jiiVar.w(R.id.title, this.e.a(jiiVar.o()), -1);
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "title", "com.google.android.apps.googletv.app.presentation.components.entity.episodeitem.EpisodeItemViewBindable"));
            }
        }
        if (j == 0 || (8 & j) != 0) {
            try {
                jiiVar.w(R.id.rental_expiry, this.f.a(jiiVar.o()), -1);
            } catch (scr unused3) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "rental_expiry", "com.google.android.apps.googletv.app.presentation.components.entity.episodeitem.EpisodeItemViewBindable"));
            }
        }
        if (j == 0 || (16 & j) != 0) {
            jwq.j(jiiVar, this.g, R.id.subtitle, 8);
        }
        if (j == 0 || (32 & j) != 0) {
            jwq.j(jiiVar, this.h, R.id.purchase_button, 8);
        }
        if (j == 0 || (64 & j) != 0) {
            try {
                jiiVar.r(R.id.episode_item_component, this.i);
            } catch (scr unused4) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "episode_item_component", "com.google.android.apps.googletv.app.presentation.components.entity.episodeitem.EpisodeItemViewBindable"));
            }
        }
        if (j == 0 || (128 & j) != 0) {
            try {
                jiiVar.r(R.id.thumbnail_frame, this.w);
            } catch (scr unused5) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "thumbnail_frame", "com.google.android.apps.googletv.app.presentation.components.entity.episodeitem.EpisodeItemViewBindable"));
            }
        }
        if (j == 0 || (256 & j) != 0) {
            try {
                jiiVar.r(R.id.download_view, this.j);
            } catch (scr unused6) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "download_view", "com.google.android.apps.googletv.app.presentation.components.entity.episodeitem.EpisodeItemViewBindable"));
            }
        }
        if (j == 0 || (512 & j) != 0) {
            try {
                jiiVar.r(R.id.episode_item_text, this.x);
            } catch (scr unused7) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "episode_item_text", "com.google.android.apps.googletv.app.presentation.components.entity.episodeitem.EpisodeItemViewBindable"));
            }
        }
        if (j == 0 || (1024 & j) != 0) {
            try {
                jiiVar.r(R.id.purchase_button_container, this.k);
            } catch (scr unused8) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "purchase_button_container", "com.google.android.apps.googletv.app.presentation.components.entity.episodeitem.EpisodeItemViewBindable"));
            }
        }
        View view = null;
        if (j == 0 || (2048 & j) != 0) {
            boolean z = this.l;
            if (z) {
                TextView textView = jiiVar.d;
                if (textView == null) {
                    yks.c("purchaseButton");
                    textView = null;
                }
                textView.setVisibility(8);
            }
            FrameLayout frameLayout = jiiVar.b;
            if (frameLayout == null) {
                yks.c("downloadView");
                frameLayout = null;
            }
            frameLayout.setVisibility(true != z ? 8 : 0);
        }
        if (j == 0 || (4096 & j) != 0) {
            boolean z2 = this.m;
            ViewGroup viewGroup = jiiVar.a;
            if (viewGroup == null) {
                yks.c("tvodAction");
                viewGroup = null;
            }
            viewGroup.setVisibility(true != z2 ? 8 : 0);
        }
        if (j == 0 || (8192 & j) != 0) {
            boolean z3 = this.n;
            TextView textView2 = jiiVar.e;
            if (textView2 == null) {
                yks.c("lastWatchedText");
                textView2 = null;
            }
            textView2.setVisibility(true != z3 ? 8 : 0);
        }
        if ((j == 0 || (16384 & j) != 0) && (str = this.o) != null) {
            jiiVar.b().a = str;
        }
        if ((j == 0 || (32768 & j) != 0) && (kujVar = this.p) != null) {
            jiiVar.b().c(kujVar);
        }
        if (j == 0 || (65536 & j) != 0) {
            kkb kkbVar = this.q;
            kkbVar.getClass();
            jiiVar.a().a(kkbVar);
        }
        if (j == 0 || (131072 & j) != 0) {
            jiiVar.a().setVisibility(true != this.r ? 8 : 0);
        }
        if (j == 0 || (262144 & j) != 0) {
            boolean z4 = this.s;
            View view2 = jiiVar.g;
            if (view2 == null) {
                yks.c("iconContainer");
            } else {
                view = view2;
            }
            view.setVisibility(true == z4 ? 0 : 8);
        }
        if (j == 0 || (524288 & j) != 0) {
            try {
                jiiVar.s(R.id.thumbnail_image, this.t);
            } catch (scr unused9) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "thumbnail_image", "com.google.android.apps.googletv.app.presentation.components.entity.episodeitem.EpisodeItemViewBindable"));
            }
        }
        if (j == 0 || (j & 1048576) != 0) {
            try {
                jiiVar.s(R.id.icon_container, this.u);
            } catch (scr unused10) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "icon_container", "com.google.android.apps.googletv.app.presentation.components.entity.episodeitem.EpisodeItemViewBindable"));
            }
        }
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.w, this.j, this.x, this.k, Boolean.valueOf(this.l), Boolean.valueOf(this.m), Boolean.valueOf(this.n), this.o, this.p, this.q, Boolean.valueOf(this.r), Boolean.valueOf(this.s), this.t, this.u);
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
        this.y = i;
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
        return true;
    }

    @Override // defpackage.scf
    public final Object[] o() {
        return a.z();
    }

    @Override // defpackage.scl
    public final void p(sdd sddVar) {
        this.z.add(sddVar);
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        this.z.remove(sddVar);
    }

    public final void r(sch schVar) {
        this.w = new scc("R.id.thumbnail_frame", this, schVar);
        G(7);
    }

    public final void s(sch schVar) {
        this.x = new scc("R.id.episode_item_text", this, schVar);
        G(9);
    }

    public final String toString() {
        return String.format("EpisodeItemViewModel{image=%s, thumbnailPlaceHolderText=%s, title=%s, rentalExpiry=%s, subtitle=%s, price=%s, viewClickListener=%s, playClickListener=%s, downloadClickListener=%s, textAreaClickListener=%s, purchaseButtonClickListener=%s, tvodAction=%s, tvodActionVisibility=%s, lastWatchedVisibility=%s, downloadContentDescriptionTitle=%s, downloadStatus=%s, initPlayButton=%s, playButtonVisibility=%s, centeredIconVisibility=%s, thumbnailImageContentDescription=%s, iconContainerContentDescription=%s}", this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.w, this.j, this.x, this.k, Boolean.valueOf(this.l), Boolean.valueOf(this.m), Boolean.valueOf(this.n), this.o, this.p, this.q, Boolean.valueOf(this.r), Boolean.valueOf(this.s), this.t, this.u);
    }
}
