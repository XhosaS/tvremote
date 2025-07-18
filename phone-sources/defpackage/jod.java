package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jod extends scf implements scl {
    public scg a;
    public sck b;
    public wlx c;
    public wlx d;
    public float e;
    public Integer f;
    public Integer g;
    public Integer h;
    public Integer i;
    public Integer j;
    public wls k;
    public wls l;
    public wls m;
    public wls n;
    public Boolean o;
    public View.OnClickListener p;
    public CharSequence q;
    public View.OnClickListener r;
    public View.OnClickListener s;
    public String t;
    public wls u;
    public View.OnClickListener v;
    private final int w;
    private final yfo x;
    private Integer y;
    private int z = 0;
    private final Set A = new HashSet();

    public jod(yfo yfoVar, int i) {
        this.x = yfoVar;
        this.w = i;
    }

    @Override // defpackage.scf
    public final int a() {
        return this.w;
    }

    @Override // defpackage.scl
    public final int b() {
        return this.z;
    }

    @Override // defpackage.scl
    public final int c() {
        return -1;
    }

    @Override // defpackage.scl
    public final int d() {
        return 5;
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        jod jodVar = (jod) scfVar;
        long j = true != yks.e(this.c, jodVar.c) ? 1L : 0L;
        if (!yks.e(this.d, jodVar.d)) {
            j |= 2;
        }
        if (!sfy.i(this.e, jodVar.e)) {
            j |= 4;
        }
        if (!yks.e(this.f, jodVar.f)) {
            j |= 8;
        }
        if (!yks.e(this.y, jodVar.y)) {
            j |= 16;
        }
        if (!yks.e(this.g, jodVar.g)) {
            j |= 32;
        }
        if (!yks.e(this.h, jodVar.h)) {
            j |= 64;
        }
        if (!yks.e(this.i, jodVar.i)) {
            j |= 128;
        }
        if (!yks.e(this.j, jodVar.j)) {
            j |= 256;
        }
        if (!yks.e(this.k, jodVar.k)) {
            j |= 512;
        }
        if (!yks.e(this.l, jodVar.l)) {
            j |= 1024;
        }
        if (!yks.e(this.m, jodVar.m)) {
            j |= 2048;
        }
        if (!yks.e(this.n, jodVar.n)) {
            j |= 4096;
        }
        if (!yks.e(this.o, jodVar.o)) {
            j |= 8192;
        }
        if (!yks.e(this.p, jodVar.p)) {
            j |= 16384;
        }
        if (!yks.e(this.q, jodVar.q)) {
            j |= 32768;
        }
        if (!yks.e(this.r, jodVar.r)) {
            j |= 65536;
        }
        if (!yks.e(this.s, jodVar.s)) {
            j |= 131072;
        }
        if (!yks.e(this.t, jodVar.t)) {
            j |= 262144;
        }
        if (!yks.e(this.u, jodVar.u)) {
            j |= 524288;
        }
        return !yks.e(this.v, jodVar.v) ? j | 1048576 : j;
    }

    @Override // defpackage.scf
    protected final /* bridge */ /* synthetic */ sca f() {
        return (sca) this.x.b();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.featuredcarousel.FeaturedCarouselCardViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) throws scr, Resources.NotFoundException {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        int dimensionPixelSize;
        joc jocVar = (joc) scaVar;
        if (j == 0 || (j & 1) != 0) {
            jocVar.m.t(jocVar, this.c, R.id.thumbnail, -1, -1, false, true, true);
        }
        if (j == 0 || (j & 2) != 0) {
            jocVar.n.t(jocVar, this.d, R.id.provider_logo, -1, 8, false, false, false);
        }
        if (j == 0 || (j & 4) != 0) {
            jocVar.f = this.e;
        }
        if ((j == 0 || (j & 8) != 0) && (num = this.f) != null) {
            num.intValue();
            jocVar.a().setBackground(jocVar.q().getResources().getDrawable(num.intValue(), jocVar.q().getContext().getTheme()));
            jocVar.b().setBackground(new ColorDrawable(0));
            jocVar.d().setBackground(new ColorDrawable(0));
            jocVar.e().setBackground(new ColorDrawable(0));
            jocVar.f().setBackground(new ColorDrawable(0));
        }
        if ((j == 0 || (j & 16) != 0) && (num2 = this.y) != null) {
            num2.intValue();
            jocVar.a().setVisibility(8);
            long jI = bny.i(num2.intValue());
            int iH = bny.h(bny.k(bnq.d(jI), bnq.c(jI), bnq.b(jI), 0.0f, bnq.f(jI)));
            int iH2 = bny.h(bny.k(bnq.d(jI), bnq.c(jI), bnq.b(jI), 0.8f, bnq.f(jI)));
            int iH3 = bny.h(jI);
            View viewB = jocVar.b();
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColors(new int[]{iH2, iH});
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            gradientDrawable.setGradientType(0);
            gradientDrawable.setShape(0);
            viewB.setBackground(gradientDrawable);
            View viewD = jocVar.d();
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColors(new int[]{iH, iH2});
            gradientDrawable2.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            gradientDrawable2.setGradientType(0);
            gradientDrawable2.setShape(0);
            viewD.setBackground(gradientDrawable2);
            View viewE = jocVar.e();
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setColors(new int[]{iH2, iH3});
            gradientDrawable3.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            gradientDrawable3.setGradientType(0);
            gradientDrawable3.setShape(0);
            viewE.setBackground(gradientDrawable3);
            View viewF = jocVar.f();
            GradientDrawable gradientDrawable4 = new GradientDrawable();
            gradientDrawable4.setColors(new int[]{iH3, joc.a});
            gradientDrawable4.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            gradientDrawable4.setGradientType(0);
            gradientDrawable4.setShape(0);
            viewF.setBackground(gradientDrawable4);
        }
        ImageView imageView = null;
        if ((j == 0 || (j & 32) != 0) && (num3 = this.g) != null) {
            num3.intValue();
            TextView textView = jocVar.d;
            if (textView == null) {
                yks.c("titleView");
                textView = null;
            }
            textView.setTextColor(num3.intValue());
        }
        if ((j == 0 || (j & 64) != 0) && (num4 = this.h) != null) {
            num4.intValue();
            TextView textView2 = jocVar.e;
            if (textView2 == null) {
                yks.c("subtitleView");
                textView2 = null;
            }
            textView2.setTextColor(num4.intValue());
        }
        if ((j == 0 || (j & 128) != 0) && (num5 = this.i) != null) {
            num5.intValue();
            jocVar.i().setTextColor(num5.intValue());
        }
        if ((j == 0 || (j & 256) != 0) && (num6 = this.j) != null) {
            num6.intValue();
            jocVar.i().setBackgroundColor(num6.intValue());
        }
        if (j == 0 || (j & 512) != 0) {
            jwq.j(jocVar, this.k, R.id.title, 8);
        }
        if (j == 0 || (j & 1024) != 0) {
            jwq.j(jocVar, this.l, R.id.subtitle, 8);
        }
        if (j == 0 || (j & 2048) != 0) {
            jwq.j(jocVar, this.m, R.id.action_button, 8);
        }
        if (j == 0 || (j & 4096) != 0) {
            jwq.j(jocVar, this.n, R.id.action_button_bc25, 8);
        }
        if (j == 0 || (j & 8192) != 0) {
            jocVar.l.q(jocVar, this.o, R.id.fc_watch_list_icon);
        }
        if (j == 0 || (j & 16384) != 0) {
            try {
                jocVar.r(R.id.fc_watch_list_icon, this.p);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "fc_watch_list_icon", "com.google.android.apps.googletv.app.presentation.components.featuredcarousel.FeaturedCarouselCardViewBindable"));
            }
        }
        if (j == 0 || (j & 32768) != 0) {
            try {
                jocVar.s(R.id.featured_carousel_card_component, this.q);
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "featured_carousel_card_component", "com.google.android.apps.googletv.app.presentation.components.featuredcarousel.FeaturedCarouselCardViewBindable"));
            }
        }
        if (j == 0 || (j & 65536) != 0) {
            try {
                jocVar.r(R.id.featured_carousel_card_component, this.r);
            } catch (scr unused3) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "featured_carousel_card_component", "com.google.android.apps.googletv.app.presentation.components.featuredcarousel.FeaturedCarouselCardViewBindable"));
            }
        }
        if (j == 0 || (j & 131072) != 0) {
            try {
                jocVar.r(R.id.action_button, this.s);
            } catch (scr unused4) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "action_button", "com.google.android.apps.googletv.app.presentation.components.featuredcarousel.FeaturedCarouselCardViewBindable"));
            }
        }
        if (j == 0 || (j & 262144) != 0) {
            jwq.h(jocVar, this.t, R.id.featured_carousel_card_component);
        }
        if (j == 0 || (j & 524288) != 0) {
            jwq.j(jocVar, this.u, R.id.badge, 8);
        }
        if (j == 0 || (j & 1048576) != 0) {
            try {
                jocVar.r(R.id.badge, this.v);
            } catch (scr unused5) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "badge", "com.google.android.apps.googletv.app.presentation.components.featuredcarousel.FeaturedCarouselCardViewBindable"));
            }
        }
        float f = jocVar.f;
        if (f <= 1.0f) {
            dimensionPixelSize = jocVar.o().getResources().getDimensionPixelSize(R.dimen.fc_card_logo_height_w1);
        } else {
            dimensionPixelSize = (f < 3.0f ? jocVar.o().getResources().getDimensionPixelSize(R.dimen.fc_card_logo_height_w2) : jocVar.o().getResources().getDimensionPixelSize(R.dimen.fc_card_logo_height_w3)) + 5;
        }
        float fCeil = (float) Math.ceil(dimensionPixelSize * jocVar.f);
        ImageView imageView2 = jocVar.b;
        if (imageView2 == null) {
            yks.c("providerLogoImage");
        } else {
            imageView = imageView2;
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.height = dimensionPixelSize;
        layoutParams.width = (int) fCeil;
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d, Float.valueOf(this.e), this.f, this.y, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v);
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
        this.z = i;
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
        return new Object[]{this.d};
    }

    @Override // defpackage.scl
    public final void p(sdd sddVar) {
        this.A.add(sddVar);
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        this.A.remove(sddVar);
    }

    public final void r(Integer num) {
        if (yks.e(this.y, num)) {
            return;
        }
        this.y = num;
        G(4);
    }

    public final void s(Boolean bool) {
        if (yks.e(this.o, bool)) {
            return;
        }
        this.o = bool;
        G(13);
    }

    public final String toString() {
        return String.format("FeaturedCarouselCardViewModel{posterImage=%s, providerLogo=%s, providerLogoAspectRatio=%s, gradient=%s, expressiveGradient=%s, titleColor=%s, subtitleColor=%s, actionButtonBc25TextColor=%s, actionButtonBc25BackgroundColor=%s, title=%s, subtitle=%s, actionButtonText=%s, actionButtonBc25Text=%s, isWatchlisted=%s, watchlistClickListener=%s, contextDescription=%s, onClickListener=%s, actionButtonOnClickListener=%s, tag=%s, badge=%s, badgeOnClickListener=%s}", this.c, this.d, Float.valueOf(this.e), this.f, this.y, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v);
    }
}
