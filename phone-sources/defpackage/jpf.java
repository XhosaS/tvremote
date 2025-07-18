package defpackage;

import android.content.res.ColorStateList;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Checkable;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jpf extends scf implements scl {
    public scg a;
    public sck b;
    public scf c;
    public wlx d;
    public wls e;
    public wls f;
    public View.OnClickListener g;
    public wls h;
    public wls i;
    public View.OnClickListener j;
    public View.OnClickListener k;
    public boolean l;
    public int m;
    public wfo n;
    public wfo o;
    public View.OnClickListener p;
    private final int q;
    private final yfo r;
    private int s = 0;
    private final Set t = new HashSet();

    public jpf(yfo yfoVar, int i) {
        this.r = yfoVar;
        this.q = i;
    }

    @Override // defpackage.scf
    public final int a() {
        return this.q;
    }

    @Override // defpackage.scl
    public final int b() {
        return this.s;
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
        jpf jpfVar = (jpf) scfVar;
        long j = true != yks.e(this.c, jpfVar.c) ? 1L : 0L;
        if (!yks.e(this.d, jpfVar.d)) {
            j |= 2;
        }
        if (!yks.e(this.e, jpfVar.e)) {
            j |= 4;
        }
        if (!yks.e(this.f, jpfVar.f)) {
            j |= 8;
        }
        if (!yks.e(this.g, jpfVar.g)) {
            j |= 16;
        }
        if (!yks.e(this.h, jpfVar.h)) {
            j |= 32;
        }
        if (!yks.e(this.i, jpfVar.i)) {
            j |= 64;
        }
        if (!yks.e(this.j, jpfVar.j)) {
            j |= 128;
        }
        if (!yks.e(this.k, jpfVar.k)) {
            j |= 256;
        }
        if (!yks.e(Boolean.valueOf(this.l), Boolean.valueOf(jpfVar.l))) {
            j |= 512;
        }
        if (!a.r(this.m, jpfVar.m)) {
            j |= 1024;
        }
        if (!yks.e(this.n, jpfVar.n)) {
            j |= 2048;
        }
        if (!yks.e(this.o, jpfVar.o)) {
            j |= 4096;
        }
        return !yks.e(this.p, jpfVar.p) ? j | 8192 : j;
    }

    @Override // defpackage.scf
    protected final /* bridge */ /* synthetic */ sca f() {
        return (sca) this.r.b();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.highlights.articlecard.ArticleCardViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        long j2;
        int i;
        wfo wfoVar;
        wfo wfoVar2;
        jpe jpeVar = (jpe) scaVar;
        if (j == 0 || (j & 1) != 0) {
            try {
                jpeVar.u(R.id.related_component, this.c);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "related_component", "com.google.android.apps.googletv.app.presentation.components.highlights.articlecard.ArticleCardViewBindable"));
            }
        }
        if (j == 0 || (j & 2) != 0) {
            j2 = 0;
            i = 2;
            jpeVar.h.t(jpeVar, this.d, R.id.primary_image, -1, -1, false, false, false);
        } else {
            j2 = 0;
            i = 2;
        }
        if (j == 0 || (j & 4) != j2) {
            jwq.j(jpeVar, this.e, R.id.heading_annotation, 8);
        }
        if (j == 0 || (j & 8) != j2) {
            jwq.j(jpeVar, this.f, R.id.heading_annotation_text, 8);
        }
        if (j == 0 || (j & 16) != j2) {
            try {
                jpeVar.r(R.id.heading_annotation, this.g);
            } catch (scr unused2) {
                Object[] objArr = new Object[i];
                objArr[0] = "heading_annotation";
                objArr[1] = "com.google.android.apps.googletv.app.presentation.components.highlights.articlecard.ArticleCardViewBindable";
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", objArr));
            }
        }
        if (j == 0 || (j & 32) != j2) {
            jwq.j(jpeVar, this.h, R.id.title, 8);
        }
        if (j == 0 || (j & 64) != j2) {
            jwq.j(jpeVar, this.i, R.id.footer_annotation, 8);
        }
        if (j == 0 || (j & 128) != j2) {
            try {
                jpeVar.r(R.id.article_card_component, this.j);
            } catch (scr unused3) {
                Object[] objArr2 = new Object[i];
                objArr2[0] = "article_card_component";
                objArr2[1] = "com.google.android.apps.googletv.app.presentation.components.highlights.articlecard.ArticleCardViewBindable";
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", objArr2));
            }
        }
        if (j == 0 || (j & 256) != j2) {
            try {
                jpeVar.r(R.id.share_button, this.k);
            } catch (scr unused4) {
                Object[] objArr3 = new Object[i];
                objArr3[0] = "share_button";
                objArr3[1] = "com.google.android.apps.googletv.app.presentation.components.highlights.articlecard.ArticleCardViewBindable";
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", objArr3));
            }
        }
        if (j == 0 || (j & 512) != j2) {
            boolean z = this.l;
            KeyEvent.Callback callbackD = jpeVar.d();
            callbackD.getClass();
            ((Checkable) callbackD).setChecked(z);
        }
        if (j == 0 || (j & 1024) != j2) {
            jpeVar.d().setVisibility(this.m);
        }
        if ((j == 0 || (j & 2048) != j2) && (wfoVar = this.n) != null) {
            View view = jpeVar.a;
            if (view == null) {
                yks.c("newsArticleCardView");
                view = null;
            }
            MaterialCardView materialCardView = view instanceof MaterialCardView ? (MaterialCardView) view : null;
            if (materialCardView != null) {
                materialCardView.c(wfoVar.p());
                MaterialCardView materialCardView2 = (MaterialCardView) jpeVar.p(R.id.primary_image_container);
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(wfoVar.i());
                sqw sqwVar = materialCardView2.g;
                if (sqwVar.o != colorStateListValueOf) {
                    sqwVar.o = colorStateListValueOf;
                    sqwVar.j();
                }
                materialCardView2.invalidate();
            }
            View view2 = jpeVar.b;
            if (view2 == null) {
                yks.c("headingAnnotationTextView");
                view2 = null;
            }
            TextView textView = view2 instanceof TextView ? (TextView) view2 : null;
            if (textView != null) {
                textView.setTextColor(csq.g(wfoVar.g(), 128));
            }
            View viewB = jpeVar.b();
            TextView textView2 = viewB instanceof TextView ? (TextView) viewB : null;
            if (textView2 != null) {
                textView2.setTextColor(wfoVar.g());
            }
            View viewA = jpeVar.a();
            TextView textView3 = viewA instanceof TextView ? (TextView) viewA : null;
            if (textView3 != null) {
                textView3.setTextColor(csq.g(wfoVar.g(), 128));
            }
        }
        if ((j == 0 || (j & 4096) != j2) && (wfoVar2 = this.o) != null) {
            View viewB2 = jpeVar.b();
            TextView textView4 = viewB2 instanceof TextView ? (TextView) viewB2 : null;
            if (textView4 != null) {
                textView4.setTextColor(wfoVar2.g());
            }
            View viewA2 = jpeVar.a();
            TextView textView5 = viewA2 instanceof TextView ? (TextView) viewA2 : null;
            if (textView5 != null) {
                textView5.setTextColor(csq.g(wfoVar2.g(), 128));
            }
            KeyEvent.Callback callback = jpeVar.e;
            if (callback == null) {
                yks.c("shareButtonView");
                callback = null;
            }
            MaterialButton materialButton = callback instanceof MaterialButton ? (MaterialButton) callback : null;
            if (materialButton != null) {
                materialButton.n(ColorStateList.valueOf(wfoVar2.h()));
            }
        }
        if (j == 0 || (j & 8192) != j2) {
            try {
                jpeVar.r(R.id.expand_more_button, this.p);
            } catch (scr unused5) {
                Object[] objArr4 = new Object[i];
                objArr4[0] = "expand_more_button";
                objArr4[1] = "com.google.android.apps.googletv.app.presentation.components.highlights.articlecard.ArticleCardViewBindable";
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", objArr4));
            }
        }
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, Boolean.valueOf(this.l), Integer.valueOf(this.m), this.n, this.o, this.p);
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
        this.s = i;
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
        this.t.add(sddVar);
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        this.t.remove(sddVar);
    }

    public final String toString() {
        return String.format("ArticleCardViewModel{relatedComponent=%s, primaryImage=%s, headingAnnotation=%s, headingAnnotationText=%s, headingOnClickListener=%s, title=%s, footerAnnotation=%s, onClickListener=%s, shareButtonOnClickListener=%s, expandedState=%s, expandButtonVisibility=%s, applyDynamicSchemeToNewsArticleLayout=%s, applyDynamicSchemeToFullBleedArticleLayout=%s, expandButtonOnClickListener=%s}", this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, Boolean.valueOf(this.l), Integer.valueOf(this.m), this.n, this.o, this.p);
    }
}
