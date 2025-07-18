package defpackage;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jge extends scf implements scl {
    public scg a;
    public sck b;
    public wls c;
    public wls d;
    public wls e;
    public View.OnClickListener f;
    public boolean g;
    public wfo h;
    public int i;
    private final yfo j;
    private int k = 0;
    private final Set l = new HashSet();

    public jge(yfo yfoVar) {
        this.j = yfoVar;
    }

    @Override // defpackage.scf
    public final int a() {
        return R.layout.dialog_list_item_layout;
    }

    @Override // defpackage.scl
    public final int b() {
        return this.k;
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
        jge jgeVar = (jge) scfVar;
        long j = true != yks.e(this.c, jgeVar.c) ? 1L : 0L;
        if (!yks.e(this.d, jgeVar.d)) {
            j |= 2;
        }
        if (!yks.e(this.e, jgeVar.e)) {
            j |= 4;
        }
        if (!yks.e(this.f, jgeVar.f)) {
            j |= 8;
        }
        if (!yks.e(Boolean.valueOf(this.g), Boolean.valueOf(jgeVar.g))) {
            j |= 16;
        }
        if (this.i != jgeVar.i) {
            j |= 32;
        }
        return !yks.e(this.h, jgeVar.h) ? j | 64 : j;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new jgd();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.dialoglistitem.DialogListItemViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        int i;
        wfo wfoVar;
        jgd jgdVar = (jgd) scaVar;
        if (j == 0 || (1 & j) != 0) {
            jwq.j(jgdVar, this.c, R.id.title, -1);
        }
        if (j == 0 || (2 & j) != 0) {
            jwq.j(jgdVar, this.d, R.id.subtitle, 8);
        }
        if (j == 0 || (4 & j) != 0) {
            jwq.j(jgdVar, this.e, R.id.annotation, 8);
        }
        if (j == 0 || (8 & j) != 0) {
            try {
                jgdVar.r(R.id.dialog_list_item_component, this.f);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "dialog_list_item_component", "com.google.android.apps.googletv.app.presentation.components.dialoglistitem.DialogListItemViewBindable"));
            }
        }
        if (j == 0 || (16 & j) != 0) {
            jgdVar.a().setVisibility(true != this.g ? 8 : 0);
        }
        if ((j == 0 || (32 & j) != 0) && (i = this.i) != 0) {
            jgdVar.e = i;
        }
        if ((j == 0 || (j & 64) != 0) && (wfoVar = this.h) != null) {
            jgdVar.a().setVisibility(8);
            float f = jgdVar.o().getResources().getDisplayMetrics().density * 16.0f;
            RelativeLayout relativeLayout = jgdVar.a;
            if (relativeLayout == null) {
                yks.c("dialogListItemLayout");
                relativeLayout = null;
            }
            int i2 = (int) (f + 0.5f);
            relativeLayout.setPadding(i2, 0, i2, 0);
            int i3 = jgdVar.e;
            int i4 = i3 - 2;
            if (i3 == 0) {
                throw null;
            }
            Drawable drawable = jgdVar.o().getDrawable(i4 != 1 ? i4 != 3 ? R.drawable.middle_item_bg : R.drawable.last_item_bg : R.drawable.first_item_bg);
            if (drawable != null) {
                drawable.setColorFilter(wfoVar.q(), PorterDuff.Mode.SRC_IN);
                relativeLayout.setBackground(drawable);
            }
            TextView textView = jgdVar.b;
            if (textView == null) {
                yks.c("title");
                textView = null;
            }
            textView.setTextColor(wfoVar.g());
            jgdVar.b().setTextColor(wfoVar.g());
            Drawable drawable2 = relativeLayout.getContext().getDrawable(R.drawable.gs_chevron_right_vd_theme_24);
            drawable2.getClass();
            drawable2.setColorFilter(wfoVar.h(), PorterDuff.Mode.SRC_IN);
            jgdVar.b().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable2, (Drawable) null);
        }
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d, this.e, this.f, Boolean.valueOf(this.g), Integer.valueOf(this.i), this.h);
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
        this.k = i;
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
        this.l.add(sddVar);
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        this.l.remove(sddVar);
    }

    public final String toString() {
        wls wlsVar = this.c;
        wls wlsVar2 = this.d;
        wls wlsVar3 = this.e;
        View.OnClickListener onClickListener = this.f;
        Boolean boolValueOf = Boolean.valueOf(this.g);
        int i = this.i;
        return String.format("DialogListItemViewModel{title=%s, subtitle=%s, annotation=%s, itemClickListener=%s, dividerVisibility=%s, itemPosition=%s, applyDynamicTheme=%s}", wlsVar, wlsVar2, wlsVar3, onClickListener, boolValueOf, i != 0 ? Integer.toString(i - 2) : "null", this.h);
    }
}
