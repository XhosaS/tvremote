package defpackage;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kdr extends scf implements scl {
    public scg a;
    public sck b;
    public wls c;
    public wls d;
    public wlx e;
    public View.OnClickListener f;
    public String g;
    public String h;
    public boolean i;
    public Boolean j;
    public wfo k;
    public int l;
    private final yfo m;
    private int n = 0;
    private final Set o = new HashSet();

    public kdr(yfo yfoVar) {
        this.m = yfoVar;
    }

    @Override // defpackage.scf
    public final int a() {
        return R.layout.provider_selection_item_view_layout;
    }

    @Override // defpackage.scl
    public final int b() {
        return this.n;
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
        kdr kdrVar = (kdr) scfVar;
        long j = true != yks.e(this.c, kdrVar.c) ? 1L : 0L;
        if (!yks.e(this.d, kdrVar.d)) {
            j |= 2;
        }
        if (!yks.e(this.e, kdrVar.e)) {
            j |= 4;
        }
        if (!yks.e(this.f, kdrVar.f)) {
            j |= 8;
        }
        if (!yks.e(this.g, kdrVar.g)) {
            j |= 16;
        }
        if (!yks.e(this.h, kdrVar.h)) {
            j |= 32;
        }
        if (!yks.e(Boolean.valueOf(this.i), Boolean.valueOf(kdrVar.i))) {
            j |= 64;
        }
        if (this.l != kdrVar.l) {
            j |= 128;
        }
        if (!yks.e(this.j, kdrVar.j)) {
            j |= 256;
        }
        return !yks.e(this.k, kdrVar.k) ? j | 512 : j;
    }

    @Override // defpackage.scf
    protected final /* bridge */ /* synthetic */ sca f() {
        return (sca) this.m.b();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.pages.providerselectionmenu.providerselectionitem.ProviderSelectionItemViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        int i;
        Boolean bool;
        wfo wfoVar;
        kdq kdqVar = (kdq) scaVar;
        if (j == 0 || (1 & j) != 0) {
            jwq.j(kdqVar, this.c, R.id.provider_title, 8);
        }
        if (j == 0 || (2 & j) != 0) {
            jwq.j(kdqVar, this.d, R.id.provider_cta, 8);
        }
        if (j == 0 || (4 & j) != 0) {
            kdqVar.i.t(kdqVar, this.e, R.id.provider_icon, -1, 8, true, false, false);
        }
        if (j == 0 || (8 & j) != 0) {
            try {
                kdqVar.r(R.id.provider_item, this.f);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "provider_item", "com.google.android.apps.googletv.app.presentation.pages.providerselectionmenu.providerselectionitem.ProviderSelectionItemViewBindable"));
            }
        }
        if (j == 0 || (16 & j) != 0) {
            jwq.h(kdqVar, this.g, R.id.provider_item);
        }
        if (j == 0 || (32 & j) != 0) {
            jwq.h(kdqVar, this.h, R.id.provider_cta);
        }
        if (j == 0 || (64 & j) != 0) {
            kdqVar.b().setVisibility(true != this.i ? 8 : 0);
        }
        if ((j == 0 || (128 & j) != 0) && (i = this.l) != 0) {
            kdqVar.h = i;
        }
        if ((j == 0 || (256 & j) != 0) && (bool = this.j) != null) {
            kdqVar.a().setVisibility(true != bool.booleanValue() ? 8 : 0);
        }
        if ((j == 0 || (512 & j) != 0) && (wfoVar = this.k) != null) {
            float f = kdqVar.o().getResources().getDisplayMetrics().density;
            float f2 = 16.0f * f;
            float f3 = f + f;
            LinearLayout linearLayout = kdqVar.b;
            View view = null;
            if (linearLayout == null) {
                yks.c("providerItemLayout");
                linearLayout = null;
            }
            int i2 = (int) (f2 + 0.5f);
            linearLayout.setPadding(i2, i2, i2, i2);
            int i3 = kdqVar.h;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            Drawable drawable = kdqVar.o().getDrawable(i4 != 0 ? i4 != 2 ? R.drawable.middle_item_bg : R.drawable.last_item_bg : R.drawable.first_item_bg);
            if (drawable != null) {
                drawable.setColorFilter(wfoVar.q(), PorterDuff.Mode.SRC_IN);
                linearLayout.setBackground(drawable);
            }
            LinearLayout linearLayout2 = kdqVar.a;
            if (linearLayout2 == null) {
                yks.c("providerItem");
                linearLayout2 = null;
            }
            linearLayout2.setPadding(linearLayout2.getPaddingLeft(), (int) (f3 + 0.5f), linearLayout2.getPaddingRight(), linearLayout2.getPaddingBottom());
            TextView textView = kdqVar.e;
            if (textView == null) {
                yks.c("providerTitle");
                textView = null;
            }
            textView.setTextColor(wfoVar.g());
            TextView textView2 = kdqVar.f;
            if (textView2 == null) {
                yks.c("providerCta");
                textView2 = null;
            }
            textView2.setTextColor(wfoVar.g());
            kdqVar.b().setColorFilter(wfoVar.h(), PorterDuff.Mode.SRC_IN);
            kdqVar.a().setColorFilter(wfoVar.h(), PorterDuff.Mode.SRC_IN);
            View view2 = kdqVar.d;
            if (view2 == null) {
                yks.c("dividerLine");
            } else {
                view = view2;
            }
            view.setVisibility(8);
        }
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d, this.e, this.f, this.g, this.h, Boolean.valueOf(this.i), Integer.valueOf(this.l), this.j, this.k);
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
        this.o.add(sddVar);
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        this.o.remove(sddVar);
    }

    public final String toString() {
        return String.format("ProviderSelectionItemViewModel{providerTitle=%s, providerCta=%s, providerIcon=%s, providerItemClickListener=%s, providerTag=%s, ctaTag=%s, isWatchNowIconVisible=%s, itemPosition=%s, showChevronRightIcon=%s, applyDynamicScheme=%s}", this.c, this.d, this.e, this.f, this.g, this.h, Boolean.valueOf(this.i), kdw.a(this.l), this.j, this.k);
    }
}
