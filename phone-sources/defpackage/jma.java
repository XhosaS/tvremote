package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ActivityChooserView;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.googletv.app.presentation.views.contentrating.ContentRatingView;
import com.google.android.apps.googletv.app.presentation.views.expandabletextview.ExpandableTextView;
import com.google.android.apps.googletv.app.presentation.views.rottentomatoesrating.RottenTomatoesRatingView;
import com.google.android.material.button.MaterialButton;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jma extends scf implements scl {
    public scg a;
    public sck b;
    public wlx d;
    public woc e;
    public wla f;
    public wls g;
    public CharSequence h;
    public View.OnClickListener i;
    public View.OnClickListener j;
    public CharSequence k;
    public CharSequence l;
    public wfo m;
    public boolean n;
    public wfo o;
    public int p;
    public String q;
    public boolean r;
    public yjz s;
    public boolean t;
    public wfo u;
    private final yfo v;
    private boolean w;
    private wfo x;
    public sco c = sco.a;
    private int y = 0;
    private final Set z = new HashSet();

    public jma(yfo yfoVar) {
        this.v = yfoVar;
    }

    @Override // defpackage.scf
    public final int a() {
        return R.layout.entity_title_layout;
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
        return -1;
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        jma jmaVar = (jma) scfVar;
        long j = true != yks.e(this.c, jmaVar.c) ? 1L : 0L;
        if (!yks.e(this.d, jmaVar.d)) {
            j |= 2;
        }
        if (!yks.e(this.e, jmaVar.e)) {
            j |= 4;
        }
        if (!yks.e(this.f, jmaVar.f)) {
            j |= 8;
        }
        if (!yks.e(this.g, jmaVar.g)) {
            j |= 16;
        }
        if (!yks.e(this.h, jmaVar.h)) {
            j |= 32;
        }
        if (!yks.e(this.i, jmaVar.i)) {
            j |= 64;
        }
        if (!yks.e(this.j, jmaVar.j)) {
            j |= 128;
        }
        if (!yks.e(this.k, jmaVar.k)) {
            j |= 256;
        }
        if (!yks.e(this.l, jmaVar.l)) {
            j |= 512;
        }
        if (!yks.e(this.m, jmaVar.m)) {
            j |= 1024;
        }
        if (!yks.e(Boolean.valueOf(this.w), Boolean.valueOf(jmaVar.w))) {
            j |= 2048;
        }
        if (!yks.e(Boolean.valueOf(this.n), Boolean.valueOf(jmaVar.n))) {
            j |= 4096;
        }
        if (!yks.e(this.o, jmaVar.o)) {
            j |= 8192;
        }
        if (!a.r(this.p, jmaVar.p)) {
            j |= 16384;
        }
        if (!yks.e(this.q, jmaVar.q)) {
            j |= 32768;
        }
        if (!yks.e(Boolean.valueOf(this.r), Boolean.valueOf(jmaVar.r))) {
            j |= 65536;
        }
        if (!a.r(0, 0)) {
            j |= 131072;
        }
        if (!yks.e(this.s, jmaVar.s)) {
            j |= 262144;
        }
        if (!yks.e(Boolean.valueOf(this.t), Boolean.valueOf(jmaVar.t))) {
            j |= 524288;
        }
        if (!yks.e(this.u, jmaVar.u)) {
            j |= 1048576;
        }
        return !yks.e(this.x, jmaVar.x) ? j | 2097152 : j;
    }

    @Override // defpackage.scf
    protected final /* bridge */ /* synthetic */ sca f() {
        return (sca) this.v.b();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.entity.title.TitleViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        long j2;
        int i;
        int i2;
        CharSequence charSequence;
        CharSequence charSequence2;
        wfo wfoVar;
        wfo wfoVar2;
        ActionBar supportActionBar;
        wfo wfoVar3;
        wfo wfoVar4;
        jlz jlzVar = (jlz) scaVar;
        if (j == 0 || (j & 1) != 0) {
            try {
                jlzVar.w(R.id.subtitle, this.c.a(jlzVar.o()), 8);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "subtitle", "com.google.android.apps.googletv.app.presentation.components.entity.title.TitleViewBindable"));
            }
        }
        if (j == 0 || (j & 2) != 0) {
            j2 = 0;
            i = 0;
            i2 = 8;
            jlzVar.t.t(jlzVar, this.d, R.id.trailer_thumbnail, -1, -1, false, false, false);
        } else {
            j2 = 0;
            i2 = 8;
            i = 0;
        }
        if (j == 0 || (j & 4) != j2) {
            jwq.i(jlzVar, this.e, R.id.tomato_rating);
        }
        if (j == 0 || (j & 8) != j2) {
            jwq.af(jlzVar, this.f);
        }
        if (j == 0 || (j & 16) != j2) {
            jwq.j(jlzVar, this.g, R.id.stats, i2);
        }
        if (j == 0 || (j & 32) != j2) {
            try {
                jlzVar.s(R.id.title_component, this.h);
            } catch (scr unused2) {
                Object[] objArr = new Object[2];
                objArr[i] = "title_component";
                objArr[1] = "com.google.android.apps.googletv.app.presentation.components.entity.title.TitleViewBindable";
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", objArr));
            }
        }
        if (j == 0 || (j & 64) != j2) {
            try {
                jlzVar.r(R.id.trailer_button, this.i);
            } catch (scr unused3) {
                Object[] objArr2 = new Object[2];
                objArr2[i] = "trailer_button";
                objArr2[1] = "com.google.android.apps.googletv.app.presentation.components.entity.title.TitleViewBindable";
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", objArr2));
            }
        }
        if (j == 0 || (j & 128) != j2) {
            try {
                jlzVar.r(R.id.subtitle, this.j);
            } catch (scr unused4) {
                Object[] objArr3 = new Object[2];
                objArr3[i] = "subtitle";
                objArr3[1] = "com.google.android.apps.googletv.app.presentation.components.entity.title.TitleViewBindable";
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", objArr3));
            }
        }
        if ((j == 0 || (j & 256) != j2) && (charSequence = this.k) != null) {
            jlzVar.j().setText(charSequence);
            jlzVar.j().setVisibility(i);
            jlzVar.k().setVisibility(i2);
        }
        if ((j == 0 || (j & 512) != j2) && (charSequence2 = this.l) != null) {
            jlzVar.k().setText(charSequence2);
            jlzVar.k().setVisibility(i);
            jlzVar.j().setVisibility(i2);
        }
        if ((j == 0 || (j & 1024) != j2) && (wfoVar = this.m) != null) {
            jlzVar.k().setTextColor(wfoVar.g());
            TextView textView = jlzVar.h;
            if (textView == null) {
                yks.c("statsView");
                textView = null;
            }
            textView.setTextColor(wfoVar.g());
            ContentRatingView contentRatingView = jlzVar.i;
            if (contentRatingView == null) {
                yks.c("contentRatingView");
                contentRatingView = null;
            }
            contentRatingView.b.setTextColor(wfoVar.g());
            RottenTomatoesRatingView rottenTomatoesRatingView = jlzVar.j;
            if (rottenTomatoesRatingView == null) {
                yks.c("rottenTomatoesRatingView");
                rottenTomatoesRatingView = null;
            }
            rottenTomatoesRatingView.a().setTextColor(wfoVar.g());
        }
        if (j == 0 || (j & 2048) != j2) {
            boolean z = this.w;
            ImageView imageViewF = jlzVar.f();
            int i3 = true != z ? i2 : i;
            imageViewF.setVisibility(i3);
            jlzVar.d().setVisibility(i3);
        }
        if (j == 0 || (j & 4096) != j2) {
            jlzVar.d().setVisibility(true != this.n ? i2 : i);
        }
        if ((j == 0 || (j & 8192) != j2) && (wfoVar2 = this.o) != null) {
            View viewD = jlzVar.d();
            MaterialButton materialButton = viewD instanceof MaterialButton ? (MaterialButton) viewD : null;
            if (materialButton != null) {
                materialButton.setBackgroundColor(wfoVar2.m());
                materialButton.n(ColorStateList.valueOf(wfoVar2.f()));
                materialButton.setTextColor(wfoVar2.f());
            }
        }
        if (j == 0 || (j & 16384) != j2) {
            int i4 = this.p;
            if (i4 == 0) {
                jlzVar.e().getLayoutParams().height -= jlzVar.s;
                jlzVar.s = i;
            } else {
                jlzVar.s = (i4 - jlzVar.i().getTop()) + jlzVar.i().getPaddingTop();
                jlzVar.e().getLayoutParams().height += jlzVar.s;
            }
        }
        if (j == 0 || (j & 32768) != j2) {
            String str = this.q;
            str.getClass();
            FrameLayout frameLayout = jlzVar.b;
            if (frameLayout == null) {
                yks.c("trailerView");
                frameLayout = null;
            }
            by byVarN = ihz.N(frameLayout);
            AppCompatActivity appCompatActivity = byVarN instanceof AppCompatActivity ? (AppCompatActivity) byVarN : null;
            if (appCompatActivity != null && (supportActionBar = appCompatActivity.getSupportActionBar()) != null) {
                Context contextO = jlzVar.o();
                Object[] objArr4 = new Object[1];
                objArr4[i] = str;
                supportActionBar.setHomeActionContentDescription(contextO.getString(R.string.accessibility_navigate_up_title, objArr4));
            }
        }
        if (j == 0 || (j & 65536) != j2) {
            boolean z2 = this.r;
            jlzVar.m().a = z2;
            jlzVar.m().setMaxLines(true != z2 ? 3 : ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        }
        if (j == 0 || (j & 262144) != j2) {
            yjz yjzVar = this.s;
            yjzVar.getClass();
            TextureView textureView = jlzVar.d;
            if (textureView == null) {
                yks.c("playerView");
                textureView = null;
            }
            yjzVar.a(textureView, jlzVar.f());
        }
        if ((j == 0 || (j & 524288) != j2) && this.t) {
            jlzVar.d().bringToFront();
            jlzVar.b().bringToFront();
            jlzVar.a().bringToFront();
            jlzVar.d().setElevation(1000.0f);
            jlzVar.b().setElevation(1000.0f);
            jlzVar.a().setElevation(1000.0f);
        }
        if ((j == 0 || (j & 1048576) != j2) && (wfoVar3 = this.u) != null) {
            jlzVar.m().setTextColor(wfoVar3.g());
            ExpandableTextView expandableTextViewM = jlzVar.m();
            int iS = wfoVar3.s();
            Paint paint = expandableTextViewM.b;
            if (paint != null) {
                paint.setColor(iS);
            }
            expandableTextViewM.c = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{16777215 & iS, iS});
        }
        if ((j == 0 || (j & 2097152) != j2) && (wfoVar4 = this.x) != null) {
            jlzVar.b().setVisibility(i2);
            int iG = csq.g(wfoVar4.n(), i);
            int iG2 = csq.g(wfoVar4.n(), 80);
            int iG3 = csq.g(wfoVar4.n(), 100);
            View view = jlzVar.m;
            if (view == null) {
                yks.c("gradientLayer1");
                view = null;
            }
            view.setBackground(jlz.n(iG2, iG));
            View view2 = jlzVar.n;
            if (view2 == null) {
                yks.c("gradientLayer2");
                view2 = null;
            }
            view2.setBackground(jlz.n(iG, iG2));
            View view3 = jlzVar.o;
            if (view3 == null) {
                yks.c("gradientLayer3");
                view3 = null;
            }
            view3.setBackground(jlz.n(iG2, iG3));
            View view4 = jlzVar.p;
            if (view4 == null) {
                yks.c("gradientLayer4");
                view4 = null;
            }
            view4.setBackground(jlz.n(iG3, wfoVar4.s()));
        }
        jlzVar.m().getViewTreeObserver().addOnGlobalLayoutListener(new iyo(jlzVar, 4, null));
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, Boolean.valueOf(this.w), Boolean.valueOf(this.n), this.o, Integer.valueOf(this.p), this.q, Boolean.valueOf(this.r), 0, this.s, Boolean.valueOf(this.t), this.u, this.x);
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

    public final void r(wfo wfoVar) {
        if (yks.e(this.x, wfoVar)) {
            return;
        }
        this.x = wfoVar;
        G(21);
    }

    public final void s(boolean z) {
        if (yks.e(Boolean.valueOf(this.w), Boolean.valueOf(z))) {
            return;
        }
        this.w = z;
        G(11);
    }

    public final String toString() {
        return String.format("TitleViewModel{subtitle=%s, trailerBackground=%s, tomatoRating=%s, contentRating=%s, statsText=%s, titleContentDescription=%s, trailerButtonOnClickListener=%s, subtitleOnClickListener=%s, titleOld=%s, title=%s, applyDynamicSchemeToContent=%s, backgroundVisibility=%s, showTrailerButton=%s, applyDynamicSchemeToTrailerButton=%s, adjustViewForPlayingTrailer=%s, backButtonContentDescription=%s, subtitleExpanded=%s, subtitleWidth=%s, playerView=%s, trailerPreviewLayout=%s, applyDynamicSchemeToSubtitle=%s, applyDynamicSchemeToScrim=%s}", this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, Boolean.valueOf(this.w), Boolean.valueOf(this.n), this.o, Integer.valueOf(this.p), this.q, Boolean.valueOf(this.r), 0, this.s, Boolean.valueOf(this.t), this.u, this.x);
    }
}
