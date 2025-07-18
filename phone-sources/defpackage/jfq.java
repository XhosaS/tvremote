package defpackage;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.foundation.layout.SizeElement;
import androidx.compose.ui.platform.ComposeView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.apps.googletv.app.presentation.views.horizontalchannelrecyclerview.HorizontalChannelRecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jfq extends sca {
    public final kjc a;
    public final yow b;
    public final xiw c;
    public View d;
    public TabLayout e;
    public ComposeView f;
    public FrameLayout g;
    public ShapeableImageView h;
    public View i;
    public View j;
    public yqe k;
    public final jwj l;
    public final jwj m;
    public final jwj n;
    public final jwj o;
    public final kuw p;

    static {
        Color.parseColor("#ffc6c6c6");
        Color.parseColor("#66c6c6c6");
    }

    public jfq(kjc kjcVar, yow yowVar, xiw xiwVar, jwj jwjVar, jwj jwjVar2, jwj jwjVar3, jwj jwjVar4, kuw kuwVar) {
        kjcVar.getClass();
        this.a = kjcVar;
        this.b = yowVar;
        this.c = xiwVar;
        this.l = jwjVar;
        this.m = jwjVar2;
        this.n = jwjVar3;
        this.o = jwjVar4;
        this.p = kuwVar;
    }

    public final View a() {
        View view = this.d;
        if (view != null) {
            return view;
        }
        yks.c("recyclerView");
        return null;
    }

    public final View b() {
        View view = this.i;
        if (view != null) {
            return view;
        }
        yks.c("tvmChannelOverlay");
        return null;
    }

    public final FrameLayout d() {
        FrameLayout frameLayout = this.g;
        if (frameLayout != null) {
            return frameLayout;
        }
        yks.c("frameLayout");
        return null;
    }

    public final ComposeView e() {
        ComposeView composeView = this.f;
        if (composeView != null) {
            return composeView;
        }
        yks.c("carouselIndicator");
        return null;
    }

    public final TabLayout f() {
        TabLayout tabLayout = this.e;
        if (tabLayout != null) {
            return tabLayout;
        }
        yks.c("tabLayout");
        return null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.channel.ChannelViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.d = p(R.id.recycler_view);
            try {
                this.e = (TabLayout) p(R.id.tab_dots);
                try {
                    this.f = (ComposeView) p(R.id.carousel_indicator);
                    try {
                        this.g = (FrameLayout) p(R.id.stream_view);
                        try {
                            this.h = (ShapeableImageView) p(R.id.tvm_featured_image);
                            try {
                                this.i = p(R.id.tvm_channel_overlay);
                                try {
                                    this.j = p(R.id.channel_component);
                                } catch (scr unused) {
                                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "channel_component", "com.google.android.apps.googletv.app.presentation.components.channel.ChannelViewBindable"));
                                }
                            } catch (scr unused2) {
                                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "tvm_channel_overlay", "com.google.android.apps.googletv.app.presentation.components.channel.ChannelViewBindable"));
                            }
                        } catch (scr unused3) {
                            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "tvm_featured_image", "com.google.android.apps.googletv.app.presentation.components.channel.ChannelViewBindable"));
                        }
                    } catch (scr unused4) {
                        throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "stream_view", "com.google.android.apps.googletv.app.presentation.components.channel.ChannelViewBindable"));
                    }
                } catch (scr unused5) {
                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "carousel_indicator", "com.google.android.apps.googletv.app.presentation.components.channel.ChannelViewBindable"));
                }
            } catch (scr unused6) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "tab_dots", "com.google.android.apps.googletv.app.presentation.components.channel.ChannelViewBindable"));
            }
        } catch (scr unused7) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "recycler_view", "com.google.android.apps.googletv.app.presentation.components.channel.ChannelViewBindable"));
        }
    }

    public final void i(final int i, final int i2, int i3, int i4, bao baoVar, final int i5) {
        int i6;
        int i7;
        int i8;
        bao baoVar2;
        int i9 = i;
        int i10 = i2;
        int i11 = i5 & 6;
        bao baoVarD = baoVar.d(2070912775);
        if (i11 == 0) {
            i6 = (true != baoVarD.D(i9) ? 2 : 4) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= true != baoVarD.D(i10) ? 16 : 32;
        }
        if ((i5 & 384) == 0) {
            i7 = i3;
            i6 |= true != baoVarD.D(i7) ? 128 : 256;
        } else {
            i7 = i3;
        }
        if ((i5 & 3072) == 0) {
            i8 = i4;
            i6 |= true != baoVarD.D(i8) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        } else {
            i8 = i4;
        }
        if ((i6 & 1171) == 1170 && baoVarD.K()) {
            baoVarD.t();
            baoVar2 = baoVarD;
        } else {
            float f = 6.0f;
            xf xfVarE = xk.e(6.0f);
            bkm bkmVar = bkp.g;
            bvt bvtVarA = zf.a(xfVarE, bkb.m, baoVarD, 6);
            int iK = a.k(zy.p(baoVarD));
            bas basVar = (bas) baoVarD;
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkmVar);
            yjk yjkVar = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            yjz yjzVar = bxt.d;
            beb.a(baoVarD, bvtVarA, yjzVar);
            yjz yjzVar2 = bxt.c;
            beb.a(baoVarD, bhuVarAi, yjzVar2);
            yjz yjzVar3 = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar3);
            }
            yjz yjzVar4 = bxt.b;
            beb.a(baoVarD, bkpVarC, yjzVar4);
            baoVarD.x(-166915335);
            int i12 = 0;
            while (i12 < i10) {
                float f2 = i12 == i9 ? 12.0f : f;
                bao baoVar3 = baoVarD;
                bkp bkpVarF = hq.f(zi.b(new SizeElement(f2, 0.0f, f2, 0.0f, 10), f), bny.i(i12 == i9 ? i7 : i8), aep.a(3.0f));
                bvt bvtVarA2 = xo.a(bkb.a, false);
                int iK2 = a.k(zy.p(baoVar3));
                bhu bhuVarAi2 = basVar.ai();
                bkp bkpVarC2 = bdi.C(baoVar3, bkpVarF);
                baoVar3.z();
                if (basVar.w) {
                    baoVar3.k(yjkVar);
                } else {
                    baoVar3.B();
                }
                beb.a(baoVar3, bvtVarA2, yjzVar);
                beb.a(baoVar3, bhuVarAi2, yjzVar2);
                if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK2))) {
                    Integer numValueOf2 = Integer.valueOf(iK2);
                    basVar.ae(numValueOf2);
                    baoVar3.i(numValueOf2, yjzVar3);
                }
                beb.a(baoVar3, bkpVarC2, yjzVar4);
                baoVar3.o();
                i12++;
                i10 = i2;
                baoVarD = baoVar3;
                f = 6.0f;
                i9 = i;
            }
            baoVar2 = baoVarD;
            basVar.aa();
            baoVar2.o();
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            final int i13 = i7;
            final int i14 = i8;
            bcrVarM.d = new yjz() { // from class: jfm
                @Override // defpackage.yjz
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    jfq jfqVar = this.a;
                    int i15 = i;
                    int i16 = i2;
                    int i17 = i13;
                    jfqVar.i(i15, i16, i17, i14, (bao) obj, bdi.n(i5 | 1));
                    return ygi.a;
                }
            };
        }
    }

    @Override // defpackage.sca
    public final void z() {
        LayoutInflater.Factory factoryN = ihz.N(a());
        jeh jehVar = factoryN instanceof jeh ? (jeh) factoryN : null;
        if (jehVar != null) {
            View viewA = a();
            HorizontalChannelRecyclerView horizontalChannelRecyclerView = viewA instanceof HorizontalChannelRecyclerView ? (HorizontalChannelRecyclerView) viewA : null;
            if (horizontalChannelRecyclerView != null) {
                horizontalChannelRecyclerView.setRecycledViewPool(jehVar.g());
            }
        }
        View viewA2 = a();
        ViewPager viewPager = viewA2 instanceof ViewPager ? (ViewPager) viewA2 : null;
        if (viewPager != null) {
            f().o(viewPager);
        }
    }
}
