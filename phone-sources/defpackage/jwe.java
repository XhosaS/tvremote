package defpackage;

import android.support.v7.widget.ActivityChooserView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.googletv.app.presentation.views.image.EntityImageView;
import com.google.android.apps.googletv.app.presentation.views.rottentomatoesrating.RottenTomatoesRatingView;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jwe extends scf implements scl {
    private int A = 0;
    private final Set B = new HashSet();
    public scg a;
    public sck b;
    public wls c;
    public wls d;
    public boolean e;
    public Float f;
    public View.OnClickListener g;
    public View.OnLongClickListener h;
    public View.OnContextClickListener i;
    public View.OnClickListener j;
    public woc k;
    public boolean l;
    public boolean m;
    public kkb n;
    public View.OnClickListener o;
    public boolean p;
    public String q;
    public kuj r;
    public View.OnClickListener s;
    public String t;
    public String u;
    public CharSequence v;
    private final yfo w;
    private wls x;
    private wlx y;
    private Boolean z;

    public jwe(yfo yfoVar) {
        this.w = yfoVar;
    }

    @Override // defpackage.scf
    public final int a() {
        return R.layout.tvm_entity_card_layout;
    }

    @Override // defpackage.scl
    public final int b() {
        return this.A;
    }

    @Override // defpackage.scl
    public final int c() {
        return 1;
    }

    @Override // defpackage.scl
    public final int d() {
        return 20;
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        jwe jweVar = (jwe) scfVar;
        long j = true != yks.e(this.c, jweVar.c) ? 1L : 0L;
        if (!yks.e(this.d, jweVar.d)) {
            j |= 2;
        }
        if (!yks.e(this.x, jweVar.x)) {
            j |= 4;
        }
        if (!yks.e(this.y, jweVar.y)) {
            j |= 8;
        }
        if (!yks.e(Boolean.valueOf(this.e), Boolean.valueOf(jweVar.e))) {
            j |= 16;
        }
        if (!yks.e(this.f, jweVar.f)) {
            j |= 32;
        }
        if (!yks.e(this.g, jweVar.g)) {
            j |= 64;
        }
        if (!yks.e(this.h, jweVar.h)) {
            j |= 128;
        }
        if (!yks.e(this.i, jweVar.i)) {
            j |= 256;
        }
        if (!yks.e(this.j, jweVar.j)) {
            j |= 512;
        }
        if (!yks.e(this.z, jweVar.z)) {
            j |= 1024;
        }
        if (!yks.e(this.k, jweVar.k)) {
            j |= 2048;
        }
        if (!yks.e(Boolean.valueOf(this.l), Boolean.valueOf(jweVar.l))) {
            j |= 4096;
        }
        if (!yks.e(Boolean.valueOf(this.m), Boolean.valueOf(jweVar.m))) {
            j |= 8192;
        }
        if (!yks.e(this.n, jweVar.n)) {
            j |= 16384;
        }
        if (!yks.e(this.o, jweVar.o)) {
            j |= 32768;
        }
        if (!yks.e(Boolean.valueOf(this.p), Boolean.valueOf(jweVar.p))) {
            j |= 65536;
        }
        if (!yks.e(this.q, jweVar.q)) {
            j |= 131072;
        }
        if (!yks.e(this.r, jweVar.r)) {
            j |= 262144;
        }
        if (!yks.e(this.s, jweVar.s)) {
            j |= 524288;
        }
        if (!yks.e(this.t, jweVar.t)) {
            j |= 1048576;
        }
        if (!yks.e(this.u, jweVar.u)) {
            j |= 2097152;
        }
        return !yks.e(this.v, jweVar.v) ? j | 4194304 : j;
    }

    @Override // defpackage.scf
    protected final /* bridge */ /* synthetic */ sca f() {
        return (sca) this.w.b();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.tvmentitycard.TvmEntityCardViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) throws scr {
        long j2;
        String str;
        kuj kujVar;
        jwd jwdVar = (jwd) scaVar;
        if (j == 0 || (j & 1) != 0) {
            jwq.j(jwdVar, this.c, R.id.title, 8);
        }
        if (j == 0 || (j & 2) != 0) {
            jwq.j(jwdVar, this.d, R.id.subtitle, 8);
        }
        if (j == 0 || (j & 4) != 0) {
            jwq.j(jwdVar, this.x, R.id.titled_text, 8);
        }
        if (j == 0 || (j & 8) != 0) {
            jwdVar.j.t(jwdVar, this.y, R.id.thumbnail, R.drawable.gtv_tvm_card_default_background, -1, false, false, false);
        }
        RottenTomatoesRatingView rottenTomatoesRatingView = null;
        if (j == 0 || (j & 16) != 0) {
            boolean z = this.e;
            jwdVar.a().setMaxWidth(jwdVar.o().getResources().getDimensionPixelSize(z ? R.dimen.tvm_entity_card_portrait_subtitle_max_size : R.dimen.tvm_entity_card_subtitle_max_size));
            TextView textView = jwdVar.h;
            if (textView == null) {
                yks.c("titledCardTextView");
                textView = null;
            }
            textView.setMaxLines(true != z ? 2 : 5);
        }
        if (j == 0 || (j & 32) != 0) {
            Float f = this.f;
            ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
            EntityImageView entityImageView = (EntityImageView) jwdVar.p(R.id.thumbnail);
            entityImageView.b(f != null ? f.floatValue() : 1.78f);
            if (scaleType == null) {
                scaleType = ImageView.ScaleType.FIT_CENTER;
            }
            entityImageView.setScaleType(scaleType);
        }
        if (j == 0 || (j & 64) != 0) {
            try {
                jwdVar.r(R.id.tvm_entity_card_component, this.g);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "tvm_entity_card_component", "com.google.android.apps.googletv.app.presentation.components.tvmentitycard.TvmEntityCardViewBindable"));
            }
        }
        if (j == 0 || (j & 128) != 0) {
            try {
                jwdVar.t(R.id.tvm_entity_card_component, this.h);
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "tvm_entity_card_component", "com.google.android.apps.googletv.app.presentation.components.tvmentitycard.TvmEntityCardViewBindable"));
            }
        }
        if (j == 0 || (j & 256) != 0) {
            View.OnContextClickListener onContextClickListener = this.i;
            View view = jwdVar.g;
            if (view == null) {
                yks.c("component");
                view = null;
            }
            view.setOnContextClickListener(onContextClickListener);
        }
        if (j == 0 || (j & 512) != 0) {
            try {
                jwdVar.r(R.id.watch_list_icon, this.j);
            } catch (scr unused3) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "watch_list_icon", "com.google.android.apps.googletv.app.presentation.components.tvmentitycard.TvmEntityCardViewBindable"));
            }
        }
        if (j == 0 || (j & 1024) != 0) {
            jwdVar.i.q(jwdVar, this.z, R.id.watch_list_icon);
        }
        if (j == 0 || (j & 2048) != 0) {
            jwq.i(jwdVar, this.k, R.id.rotten_tomatoes_rating);
        }
        if (j == 0 || (j & 4096) != 0) {
            boolean z2 = this.l;
            ImageView imageView = jwdVar.a;
            if (imageView == null) {
                yks.c("lockIcon");
                imageView = null;
            }
            imageView.setVisibility(true != z2 ? 8 : 0);
        }
        if (j == 0 || (j & 8192) != 0) {
            jwdVar.b().setVisibility(true != this.m ? 8 : 0);
        }
        if (j == 0 || (j & 16384) != 0) {
            kkb kkbVar = this.n;
            kkbVar.getClass();
            jwdVar.b().a(kkbVar);
        }
        if (j == 0 || (j & 32768) != 0) {
            try {
                jwdVar.r(R.id.play_icon, this.o);
            } catch (scr unused4) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "play_icon", "com.google.android.apps.googletv.app.presentation.components.tvmentitycard.TvmEntityCardViewBindable"));
            }
        }
        if (j == 0 || (j & 65536) != 0) {
            int i = true != this.p ? 8 : 0;
            j2 = 0;
            FrameLayout frameLayout = jwdVar.c;
            if (frameLayout == null) {
                yks.c("downloadView");
                frameLayout = null;
            }
            frameLayout.setVisibility(i);
            jwdVar.d().setVisibility(i);
        } else {
            j2 = 0;
        }
        if ((j == 0 || (j & 131072) != j2) && (str = this.q) != null) {
            jwdVar.d().a = str;
        }
        if ((j == 0 || (j & 262144) != j2) && (kujVar = this.r) != null) {
            jwdVar.d().c(kujVar);
        }
        if (j == 0 || (j & 524288) != j2) {
            try {
                jwdVar.r(R.id.download_view, this.s);
            } catch (scr unused5) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "download_view", "com.google.android.apps.googletv.app.presentation.components.tvmentitycard.TvmEntityCardViewBindable"));
            }
        }
        if (j == 0 || (j & 1048576) != j2) {
            jwq.h(jwdVar, this.t, R.id.tvm_entity_card_component);
        }
        if (j == 0 || (j & 2097152) != j2) {
            jwq.h(jwdVar, this.u, R.id.download_icon);
        }
        if (j == 0 || (j & 4194304) != j2) {
            try {
                jwdVar.s(R.id.play_icon, this.v);
            } catch (scr unused6) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "play_icon", "com.google.android.apps.googletv.app.presentation.components.tvmentitycard.TvmEntityCardViewBindable"));
            }
        }
        RottenTomatoesRatingView rottenTomatoesRatingView2 = jwdVar.f;
        if (rottenTomatoesRatingView2 == null) {
            yks.c("rottenTomatoesRatingView");
        } else {
            rottenTomatoesRatingView = rottenTomatoesRatingView2;
        }
        if (rottenTomatoesRatingView.getVisibility() == 8) {
            jwdVar.a().setMaxWidth(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        }
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d, this.x, this.y, Boolean.valueOf(this.e), this.f, this.g, this.h, this.i, this.j, this.z, this.k, Boolean.valueOf(this.l), Boolean.valueOf(this.m), this.n, this.o, Boolean.valueOf(this.p), this.q, this.r, this.s, this.t, this.u, this.v);
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
        this.A = i;
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
        this.B.add(sddVar);
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        this.B.remove(sddVar);
    }

    public final void r(Boolean bool) {
        if (yks.e(this.z, bool)) {
            return;
        }
        this.z = bool;
        G(10);
    }

    public final void s(wlx wlxVar) {
        if (yks.e(this.y, wlxVar)) {
            return;
        }
        this.y = wlxVar;
        G(3);
    }

    public final void t(wls wlsVar) {
        if (yks.e(this.x, wlsVar)) {
            return;
        }
        this.x = wlsVar;
        G(2);
    }

    public final String toString() {
        return String.format("TvmEntityCardViewModel{title=%s, subtitle=%s, titledCardText=%s, thumbnailImage=%s, portraitCardLayoutEnabled=%s, thumbnailImageAspectRatio=%s, clickListener=%s, longClickListener=%s, onContextClickListener=%s, watchlistClickListener=%s, isWatchlisted=%s, rottenTomatoesRating=%s, showLockIcon=%s, showPlayIcon=%s, initPlayButton=%s, playIconClickListener=%s, showDownloadIcon=%s, downloadButtonContentDescriptionTitle=%s, downloadStatus=%s, downloadIconClickListener=%s, tag=%s, downloadTag=%s, playButtonContentDescription=%s}", this.c, this.d, this.x, this.y, Boolean.valueOf(this.e), this.f, this.g, this.h, this.i, this.j, this.z, this.k, Boolean.valueOf(this.l), Boolean.valueOf(this.m), this.n, this.o, Boolean.valueOf(this.p), this.q, this.r, this.s, this.t, this.u, this.v);
    }
}
