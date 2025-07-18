package defpackage;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.apps.googletv.app.presentation.views.horizontalchannelrecyclerview.HorizontalChannelRecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jfr extends scf implements scl {
    public scg a;
    public sck b;
    public boolean c;
    public Boolean d;
    public Boolean e;
    public jfd f;
    public iyk g;
    public int h;
    public int i;
    public String j;
    public wkv k;
    public wkv l;
    public wkv m;
    public wkv n;
    public wlx o;
    public wrg p;
    public boolean q;
    public gls r;
    public int s;
    public yjk t;
    private final int w;
    private final yfo x;
    private jfn y;
    public boolean u = true;
    private int z = 0;
    public final Set v = new HashSet();

    public jfr(yfo yfoVar, int i) {
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
        return 10;
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        jfr jfrVar = (jfr) scfVar;
        long j = true != yks.e(Boolean.valueOf(this.c), Boolean.valueOf(jfrVar.c)) ? 1L : 0L;
        if (!yks.e(this.d, jfrVar.d)) {
            j |= 2;
        }
        if (!yks.e(this.e, jfrVar.e)) {
            j |= 4;
        }
        if (!yks.e(this.f, jfrVar.f)) {
            j |= 8;
        }
        if (!yks.e(this.g, jfrVar.g)) {
            j |= 16;
        }
        if (!a.r(this.h, jfrVar.h)) {
            j |= 32;
        }
        if (!a.r(this.i, jfrVar.i)) {
            j |= 64;
        }
        if (!yks.e(this.j, jfrVar.j)) {
            j |= 128;
        }
        if (!yks.e(this.k, jfrVar.k)) {
            j |= 256;
        }
        if (!yks.e(this.l, jfrVar.l)) {
            j |= 512;
        }
        if (!yks.e(this.m, jfrVar.m)) {
            j |= 1024;
        }
        if (!yks.e(this.n, jfrVar.n)) {
            j |= 2048;
        }
        if (!yks.e(this.o, jfrVar.o)) {
            j |= 4096;
        }
        if (!yks.e(this.p, jfrVar.p)) {
            j |= 8192;
        }
        if (!yks.e(Boolean.valueOf(this.q), Boolean.valueOf(jfrVar.q))) {
            j |= 16384;
        }
        if (!yks.e(this.r, jfrVar.r)) {
            j |= 32768;
        }
        if (!a.r(this.s, jfrVar.s)) {
            j |= 65536;
        }
        if (!yks.e(this.t, jfrVar.t)) {
            j |= 131072;
        }
        return !yks.e(this.y, jfrVar.y) ? j | 262144 : j;
    }

    @Override // defpackage.scf
    protected final /* bridge */ /* synthetic */ sca f() {
        return (sca) this.x.b();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.channel.ChannelViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) throws scr, Resources.NotFoundException {
        Boolean bool;
        Boolean bool2;
        int i;
        int i2;
        gls glsVar;
        by byVarF;
        jfn jfnVar;
        Integer num;
        jfq jfqVar = (jfq) scaVar;
        if ((j == 0 || (j & 1) != 0) && this.c) {
            View view = jfqVar.j;
            if (view == null) {
                yks.c("channelComponentView");
                view = null;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.getClass();
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(0, jfqVar.o().getResources().getDimensionPixelSize(R.dimen.channel_component_margin_top), 0, jfqVar.o().getResources().getDimensionPixelSize(R.dimen.channel_component_margin_bottom));
            ViewGroup.LayoutParams layoutParams2 = jfqVar.d().getLayoutParams();
            layoutParams2.getClass();
            ((ViewGroup.MarginLayoutParams) layoutParams2).setMargins(jfqVar.o().getResources().getDimensionPixelSize(R.dimen.stream_view_margin_left), jfqVar.o().getResources().getDimensionPixelSize(R.dimen.stream_view_margin_top), jfqVar.o().getResources().getDimensionPixelSize(R.dimen.stream_view_margin_right), jfqVar.o().getResources().getDimensionPixelSize(R.dimen.stream_view_margin_bottom));
            float dimensionPixelSize = jfqVar.o().getResources().getDimensionPixelSize(R.dimen.tvm_channel_rounded_corner_radius);
            szp szpVar = new szp();
            szpVar.f(dimensionPixelSize);
            szpVar.g(0.0f);
            szpVar.i(szg.s(0));
            szpVar.a(dimensionPixelSize);
            szpVar.j(szg.s(0));
            szpVar.b(0.0f);
            szq szqVar = new szq(szpVar);
            ShapeableImageView shapeableImageView = jfqVar.h;
            if (shapeableImageView == null) {
                yks.c("featuredImageView");
                shapeableImageView = null;
            }
            shapeableImageView.p(szqVar);
            jfqVar.d().setBackground(new szk(szqVar));
            jfqVar.d().setClipToOutline(true);
            if (jfqVar.a() instanceof HorizontalChannelRecyclerView) {
                jfqVar.a().setPadding(jfqVar.o().getResources().getDimensionPixelSize(R.dimen.tvm_entity_recyler_view_padding_left), jfqVar.o().getResources().getDimensionPixelSize(R.dimen.tvm_entity_recyler_view_padding_top), jfqVar.o().getResources().getDimensionPixelSize(R.dimen.tvm_entity_recyler_view_padding_right), jfqVar.o().getResources().getDimensionPixelSize(R.dimen.tvm_entity_recyler_view_padding_bottom));
                View viewA = jfqVar.a();
                HorizontalChannelRecyclerView horizontalChannelRecyclerView = viewA instanceof HorizontalChannelRecyclerView ? (HorizontalChannelRecyclerView) viewA : null;
                if (horizontalChannelRecyclerView != null) {
                    horizontalChannelRecyclerView.setClipToPadding(false);
                }
            }
        }
        if ((j == 0 || (j & 2) != 0) && (bool = this.d) != null) {
            bool.booleanValue();
            jfqVar.f().setVisibility(true != bool.booleanValue() ? 8 : 0);
            jfqVar.e().setVisibility(8);
        }
        if ((j == 0 || (j & 4) != 0) && (bool2 = this.e) != null) {
            bool2.booleanValue();
            jfqVar.e().setVisibility(true != bool2.booleanValue() ? 8 : 0);
            jfqVar.f().setVisibility(8);
        }
        if (j == 0 || (j & 8) != 0) {
            try {
                jfqVar.u(R.id.channel_header_view, this.f);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "channel_header_view", "com.google.android.apps.googletv.app.presentation.components.channel.ChannelViewBindable"));
            }
        }
        if (j == 0 || (j & 16) != 0) {
            try {
                jfqVar.u(R.id.stream_view, this.g);
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "stream_view", "com.google.android.apps.googletv.app.presentation.components.channel.ChannelViewBindable"));
            }
        }
        if (j == 0 || (j & 32) != 0) {
            int i3 = this.h;
            TypedValue typedValue = new TypedValue();
            jfqVar.q().getResources().getValue(i3, typedValue, true);
            View viewA2 = jfqVar.a();
            HorizontalChannelRecyclerView horizontalChannelRecyclerView2 = viewA2 instanceof HorizontalChannelRecyclerView ? (HorizontalChannelRecyclerView) viewA2 : null;
            if (horizontalChannelRecyclerView2 != null) {
                horizontalChannelRecyclerView2.b(typedValue.getFloat());
            }
        }
        if ((j == 0 || (j & 64) != 0) && (i = this.i) > 0) {
            View viewA3 = jfqVar.a();
            HorizontalChannelRecyclerView horizontalChannelRecyclerView3 = viewA3 instanceof HorizontalChannelRecyclerView ? (HorizontalChannelRecyclerView) viewA3 : null;
            if (horizontalChannelRecyclerView3 != null) {
                horizontalChannelRecyclerView3.c(i);
            }
        }
        if (j == 0 || (j & 128) != 0) {
            jwq.h(jfqVar, this.j, R.id.channel_component);
        }
        if (j == 0 || (j & 256) != 0) {
            jfqVar.l.a(jfqVar, this.k, R.id.channel_component, false, false, false, false);
        }
        if (j == 0 || (j & 512) != 0) {
            jfqVar.m.a(jfqVar, this.l, R.id.channel_component, true, false, true, false);
        }
        if (j == 0 || (j & 1024) != 0) {
            jfqVar.n.a(jfqVar, this.m, R.id.tvm_background_view, false, false, false, false);
        }
        if (j == 0 || (j & 2048) != 0) {
            jfqVar.o.a(jfqVar, this.n, R.id.tvm_gradient_overlay_view, false, true, false, true);
        }
        if (j == 0 || (j & 4096) != 0) {
            i2 = 8;
            jfqVar.p.t(jfqVar, this.o, R.id.tvm_featured_image, -1, 8, false, false, false);
        } else {
            i2 = 8;
        }
        if (j == 0 || (j & 8192) != 0) {
            this.p.getClass();
        }
        if (j == 0 || (j & 16384) != 0) {
            boolean z = this.q;
            jfqVar.b().setVisibility(true != z ? i2 : 0);
            if (z) {
                jxr jxrVar = new jxr(jfqVar.b());
                View viewA4 = jfqVar.a();
                HorizontalChannelRecyclerView horizontalChannelRecyclerView4 = viewA4 instanceof HorizontalChannelRecyclerView ? (HorizontalChannelRecyclerView) viewA4 : null;
                if (horizontalChannelRecyclerView4 != null) {
                    horizontalChannelRecyclerView4.addOnScrollListener(jxrVar);
                }
            }
        }
        if ((j == 0 || (j & 32768) != 0) && (glsVar = this.r) != null) {
            View viewA5 = jfqVar.a();
            ViewPager viewPager = viewA5 instanceof ViewPager ? (ViewPager) viewA5 : null;
            if (viewPager != null) {
                viewPager.d(glsVar);
            }
        }
        if (j == 0 || (j & 65536) != 0) {
            int i4 = this.s;
            View viewA6 = jfqVar.a();
            ViewPager viewPager2 = viewA6 instanceof ViewPager ? (ViewPager) viewA6 : null;
            if (viewPager2 != null) {
                viewPager2.r(i4);
            }
        }
        if (j == 0 || (j & 131072) != 0) {
            yjk yjkVar = this.t;
            yqe yqeVar = jfqVar.k;
            if (yqeVar != null) {
                yqeVar.t(null);
            }
            long jLongValue = ((Long) xix.a.et(((xix) jfqVar.c).b)).longValue();
            if (jLongValue > 0) {
                jfqVar.k = (yjkVar == null || (byVarF = hju.F(jfqVar.o())) == null) ? null : ykr.q(dvb.d(byVarF), null, 0, new vo(jLongValue, yjkVar, (yih) null, 9), 3);
            }
        }
        if ((j == 0 || (j & 262144) != 0) && (jfnVar = this.y) != null && (num = jfnVar.c) != null) {
            kjc kjcVar = jfqVar.a;
            kjcVar.a(num.intValue());
            int iH = ((wfo) ((kiz) kjcVar).a.d()).h();
            ykr.q(jfqVar.b, null, 0, new jfp(jfqVar, jfnVar.a, jfnVar.b, iH, hju.J(iH, 0.4f), null), 3);
        }
        View childAt = jfqVar.f().getChildAt(0);
        LinearLayout linearLayout = childAt instanceof LinearLayout ? (LinearLayout) childAt : null;
        if (linearLayout != null) {
            int childCount = linearLayout.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                linearLayout.getChildAt(i5).setClickable(false);
            }
        }
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.c), this.d, this.e, this.f, this.g, Integer.valueOf(this.h), Integer.valueOf(this.i), this.j, this.k, this.l, this.m, this.n, this.o, this.p, Boolean.valueOf(this.q), this.r, Integer.valueOf(this.s), this.t, this.y);
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
        return this.u;
    }

    @Override // defpackage.scl
    public final boolean n() {
        return true;
    }

    @Override // defpackage.scf
    public final Object[] o() {
        return new Object[]{this.k, this.l, this.m, this.n, this.p};
    }

    @Override // defpackage.scl
    public final void p(sdd sddVar) {
        this.v.add(sddVar);
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        this.v.remove(sddVar);
    }

    public final void r(jfn jfnVar) {
        if (yks.e(this.y, jfnVar)) {
            return;
        }
        this.y = jfnVar;
        G(18);
    }

    public final void s(int i) {
        if (a.r(this.s, i)) {
            return;
        }
        this.s = i;
        G(16);
    }

    public final String toString() {
        return String.format("ChannelViewModel{enhancedClusterLayout=%s, tabLayoutVisibility=%s, carouselIndicatorVisibility=%s, channelViewHeader=%s, stream=%s, cardCountPerRow=%s, rowCount=%s, tag=%s, backgroundColor=%s, tvmChannelScrim=%s, tvmStreamSolidBackground=%s, tvmStreamGradientOverlay=%s, tvmFeaturedImage=%s, channelType=%s, tvmChannelOverlayVisibility=%s, onPageChangeListener=%s, currentPage=%s, delayedScrollJob=%s, applyDynamicColor=%s}", Boolean.valueOf(this.c), this.d, this.e, this.f, this.g, Integer.valueOf(this.h), Integer.valueOf(this.i), this.j, this.k, this.l, this.m, this.n, this.o, this.p, Boolean.valueOf(this.q), this.r, Integer.valueOf(this.s), this.t, this.y);
    }
}
