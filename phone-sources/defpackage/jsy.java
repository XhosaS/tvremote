package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jsy extends scf implements scl {
    public scg a;
    public sck b;
    public wlx c;
    public wls d;
    public wls e;
    public View.OnClickListener f;
    public wfo g;
    private final yfo h;
    private int i = 0;
    private final Set j = new HashSet();
    private final /* synthetic */ int k;

    public jsy(yfo yfoVar, int i, byte[] bArr) {
        this.k = i;
        this.h = yfoVar;
    }

    @Override // defpackage.scf
    public final int a() {
        return this.k != 0 ? R.layout.people_row_card_view : R.layout.rating_card_view_layout;
    }

    @Override // defpackage.scl
    public final int b() {
        return this.k != 0 ? this.i : this.i;
    }

    @Override // defpackage.scl
    public final int c() {
        return this.k != 0 ? 1 : -1;
    }

    @Override // defpackage.scl
    public final int d() {
        return this.k != 0 ? 10 : -1;
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        long j;
        if (this.k != 0) {
            jsy jsyVar = (jsy) scfVar;
            j = true == yks.e(this.c, jsyVar.c) ? 0L : 1L;
            if (!yks.e(this.d, jsyVar.d)) {
                j |= 2;
            }
            if (!yks.e(this.e, jsyVar.e)) {
                j |= 4;
            }
            if (!yks.e(this.f, jsyVar.f)) {
                j |= 8;
            }
            return !yks.e(this.g, jsyVar.g) ? j | 16 : j;
        }
        jsy jsyVar2 = (jsy) scfVar;
        j = true == yks.e(this.c, jsyVar2.c) ? 0L : 1L;
        if (!yks.e(this.d, jsyVar2.d)) {
            j |= 2;
        }
        if (!yks.e(this.e, jsyVar2.e)) {
            j |= 4;
        }
        if (!yks.e(this.f, jsyVar2.f)) {
            j |= 8;
        }
        return !yks.e(this.g, jsyVar2.g) ? j | 16 : j;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return this.k != 0 ? (sca) this.h.b() : (sca) this.h.b();
    }

    @Override // defpackage.scf
    public final String g() {
        return this.k != 0 ? "com.google.android.apps.googletv.app.presentation.components.peoplerowcard.PeopleRowCardViewBindable" : "com.google.android.apps.googletv.app.presentation.components.ratingcard.RatingCardViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        char c;
        wfo wfoVar;
        char c2;
        wfo wfoVar2;
        if (this.k != 0) {
            jsn jsnVar = (jsn) scaVar;
            if (j == 0 || (j & 1) != 0) {
                c2 = 1;
                jsnVar.c.t(jsnVar, this.c, R.id.image, R.drawable.ic_person, -1, true, false, false);
            } else {
                c2 = 1;
            }
            if (j == 0 || (j & 2) != 0) {
                jwq.j(jsnVar, this.d, R.id.title, 8);
            }
            if (j == 0 || (j & 4) != 0) {
                jwq.j(jsnVar, this.e, R.id.subtitle, 8);
            }
            if (j == 0 || (j & 8) != 0) {
                try {
                    jsnVar.r(R.id.people_row_card_component, this.f);
                } catch (scr unused) {
                    Object[] objArr = new Object[2];
                    objArr[0] = "people_row_card_component";
                    objArr[c2] = "com.google.android.apps.googletv.app.presentation.components.peoplerowcard.PeopleRowCardViewBindable";
                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", objArr));
                }
            }
            if ((j == 0 || (j & 16) != 0) && (wfoVar2 = this.g) != null) {
                View view = jsnVar.a;
                if (view == null) {
                    yks.c("titleView");
                    view = null;
                }
                TextView textView = view instanceof TextView ? (TextView) view : null;
                if (textView != null) {
                    textView.setTextColor(wfoVar2.g());
                }
                View view2 = jsnVar.b;
                if (view2 == null) {
                    yks.c("subtitleView");
                    view2 = null;
                }
                TextView textView2 = view2 instanceof TextView ? (TextView) view2 : null;
                if (textView2 != null) {
                    textView2.setTextColor(csq.g(wfoVar2.g(), 153));
                    return;
                }
                return;
            }
            return;
        }
        jsx jsxVar = (jsx) scaVar;
        if (j == 0 || (j & 1) != 0) {
            c = 0;
            jsxVar.f.t(jsxVar, this.c, R.id.logo, -1, -1, false, false, false);
        } else {
            c = 0;
        }
        if (j == 0 || (j & 2) != 0) {
            jwq.j(jsxVar, this.d, R.id.title, 8);
        }
        if (j == 0 || (j & 4) != 0) {
            jwq.j(jsxVar, this.e, R.id.subtitle, 8);
        }
        if (j == 0 || (j & 8) != 0) {
            try {
                jsxVar.r(R.id.rating_card_component, this.f);
            } catch (scr unused2) {
                Object[] objArr2 = new Object[2];
                objArr2[c] = "rating_card_component";
                objArr2[1] = "com.google.android.apps.googletv.app.presentation.components.ratingcard.RatingCardViewBindable";
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", objArr2));
            }
        }
        if ((j == 0 || (j & 16) != 0) && (wfoVar = this.g) != null) {
            View view3 = jsxVar.a;
            if (view3 == null) {
                yks.c("ratingCardView");
                view3 = null;
            }
            MaterialCardView materialCardView = view3 instanceof MaterialCardView ? (MaterialCardView) view3 : null;
            if (materialCardView != null) {
                materialCardView.c(wfoVar.p());
            }
            View view4 = jsxVar.b;
            if (view4 == null) {
                yks.c("title");
                view4 = null;
            }
            TextView textView3 = view4 instanceof TextView ? (TextView) view4 : null;
            if (textView3 != null) {
                textView3.setTextColor(wfoVar.g());
            }
            View view5 = jsxVar.c;
            if (view5 == null) {
                yks.c("subtitle");
                view5 = null;
            }
            TextView textView4 = view5 instanceof TextView ? (TextView) view5 : null;
            if (textView4 != null) {
                textView4.setTextColor(wfoVar.h());
            }
            View view6 = jsxVar.e;
            if (view6 == null) {
                yks.c("externalLinkIconBg");
                view6 = null;
            }
            MaterialCardView materialCardView2 = view6 instanceof MaterialCardView ? (MaterialCardView) view6 : null;
            if (materialCardView2 != null) {
                materialCardView2.c(wfoVar.o());
            }
            View view7 = jsxVar.d;
            if (view7 == null) {
                yks.c("openIcon");
                view7 = null;
            }
            ImageView imageView = view7 instanceof ImageView ? (ImageView) view7 : null;
            if (imageView != null) {
                imageView.setColorFilter(wfoVar.h());
            }
        }
    }

    public final int hashCode() {
        return this.k != 0 ? Objects.hash(this.c, this.d, this.e, this.f, this.g) : Objects.hash(this.c, this.d, this.e, this.f, this.g);
    }

    @Override // defpackage.scf
    public final void i(View view) {
        if (this.k != 0) {
            scg scgVar = this.a;
            if (scgVar != null) {
                scgVar.a(this, view);
                return;
            }
            return;
        }
        scg scgVar2 = this.a;
        if (scgVar2 != null) {
            scgVar2.a(this, view);
        }
    }

    @Override // defpackage.scf
    public final void j(View view) {
        if (this.k != 0) {
            sck sckVar = this.b;
            if (sckVar != null) {
                sckVar.a(this, view);
                return;
            }
            return;
        }
        sck sckVar2 = this.b;
        if (sckVar2 != null) {
            sckVar2.a(this, view);
        }
    }

    @Override // defpackage.scl
    public final void k(int i) {
        int i2 = this.k;
        this.i = i;
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
        return this.k != 0 ? a.z() : a.z();
    }

    @Override // defpackage.scl
    public final void p(sdd sddVar) {
        if (this.k != 0) {
            this.j.add(sddVar);
        } else {
            this.j.add(sddVar);
        }
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        if (this.k != 0) {
            this.j.remove(sddVar);
        } else {
            this.j.remove(sddVar);
        }
    }

    public final String toString() {
        return this.k != 0 ? String.format("PeopleRowCardViewModel{image=%s, title=%s, subtitle=%s, cardOnClickListener=%s, applyDynamicScheme=%s}", this.c, this.d, this.e, this.f, this.g) : String.format("RatingCardViewModel{logo=%s, title=%s, subtitle=%s, cardClickListener=%s, applyDynamicScheme=%s}", this.c, this.d, this.e, this.f, this.g);
    }

    public jsy(yfo yfoVar, int i) {
        this.k = i;
        this.h = yfoVar;
    }
}
