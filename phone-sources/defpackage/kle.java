package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kle extends scf implements scl {
    public scg a;
    public sck b;
    private final yfo c;
    private View.OnClickListener d;
    private String f;
    private int g;
    private Integer h;
    private Integer i;
    private String j;
    private boolean k;
    private boolean l;
    private sco e = sco.a;
    private int m = 0;
    private final Set n = new HashSet();

    public kle(yfo yfoVar) {
        this.c = yfoVar;
    }

    @Override // defpackage.scf
    public final int a() {
        return R.layout.user_feedback_item_view_layout;
    }

    @Override // defpackage.scl
    public final int b() {
        return this.m;
    }

    @Override // defpackage.scl
    public final int c() {
        return 1;
    }

    @Override // defpackage.scl
    public final int d() {
        return -1;
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        kle kleVar = (kle) scfVar;
        long j = true != yks.e(this.d, kleVar.d) ? 1L : 0L;
        if (!yks.e(this.e, kleVar.e)) {
            j |= 2;
        }
        if (!yks.e(this.f, kleVar.f)) {
            j |= 4;
        }
        if (!a.r(this.g, kleVar.g)) {
            j |= 8;
        }
        if (!yks.e(this.h, kleVar.h)) {
            j |= 16;
        }
        if (!yks.e(this.i, kleVar.i)) {
            j |= 32;
        }
        if (!yks.e(this.j, kleVar.j)) {
            j |= 64;
        }
        if (!yks.e(Boolean.valueOf(this.k), Boolean.valueOf(kleVar.k))) {
            j |= 128;
        }
        return !yks.e(Boolean.valueOf(this.l), Boolean.valueOf(kleVar.l)) ? j | 256 : j;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new kld();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.views.userfeedbackitem.UserFeedbackItemViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) throws Resources.NotFoundException {
        Integer num;
        Integer num2;
        String str;
        kld kldVar = (kld) scaVar;
        if (j == 0 || (1 & j) != 0) {
            try {
                kldVar.r(R.id.user_feedback_item, this.d);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "user_feedback_item", "com.google.android.apps.googletv.app.presentation.views.userfeedbackitem.UserFeedbackItemViewBindable"));
            }
        }
        if (j == 0 || (2 & j) != 0) {
            try {
                kldVar.w(R.id.display_text, this.e.a(kldVar.o()), 8);
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "display_text", "com.google.android.apps.googletv.app.presentation.views.userfeedbackitem.UserFeedbackItemViewBindable"));
            }
        }
        if (j == 0 || (4 & j) != 0) {
            jwq.h(kldVar, this.f, R.id.user_feedback_item);
        }
        if (j == 0 || (8 & j) != 0) {
            Drawable drawable = kldVar.q().getResources().getDrawable(this.g, null);
            View viewB = kldVar.b();
            MaterialButton materialButton = viewB instanceof MaterialButton ? (MaterialButton) viewB : null;
            if (materialButton != null) {
                materialButton.m(drawable);
            }
        }
        if ((j == 0 || (16 & j) != 0) && (num = this.h) != null) {
            View viewB2 = kldVar.b();
            MaterialButton materialButton2 = viewB2 instanceof MaterialButton ? (MaterialButton) viewB2 : null;
            if (materialButton2 != null) {
                materialButton2.n(ColorStateList.valueOf(num.intValue()));
            }
        }
        if ((j == 0 || (32 & j) != 0) && (num2 = this.i) != null) {
            View viewA = kldVar.a();
            TextView textView = viewA instanceof TextView ? (TextView) viewA : null;
            if (textView != null) {
                textView.setTextColor(num2.intValue());
            }
        }
        if ((j == 0 || (64 & j) != 0) && (str = this.j) != null) {
            kldVar.b().setContentDescription(str);
        }
        if (j == 0 || (128 & j) != 0) {
            float f = true != this.k ? 1.0f : 0.5f;
            View viewB3 = kldVar.b();
            MaterialButton materialButton3 = viewB3 instanceof MaterialButton ? (MaterialButton) viewB3 : null;
            if (materialButton3 != null) {
                materialButton3.setAlpha(f);
            }
            kldVar.a().setAlpha(f);
        }
        if (j == 0 || (j & 256) != 0) {
            boolean z = this.l;
            View viewB4 = kldVar.b();
            MaterialButton materialButton4 = viewB4 instanceof MaterialButton ? (MaterialButton) viewB4 : null;
            if (materialButton4 != null) {
                materialButton4.setSelected(z);
            }
        }
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.e, this.f, Integer.valueOf(this.g), this.h, this.i, this.j, Boolean.valueOf(this.k), Boolean.valueOf(this.l));
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
        this.m = i;
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
        this.n.add(sddVar);
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        this.n.remove(sddVar);
    }

    public final void r(sch schVar) {
        this.d = new scc("R.id.user_feedback_item", this, schVar);
        G(0);
    }

    public final void s(CharSequence charSequence) {
        sco scoVar = new sco(charSequence);
        if (yks.e(this.e, scoVar)) {
            return;
        }
        this.e = scoVar;
        G(1);
    }

    public final void t(int i) {
        if (a.r(this.g, i)) {
            return;
        }
        this.g = i;
        G(3);
    }

    public final String toString() {
        return String.format("UserFeedbackItemViewModel{clickListener=%s, displayText=%s, tag=%s, icon=%s, iconColor=%s, textColor=%s, iconContentDescription=%s, isDisabled=%s, selected=%s}", this.d, this.e, this.f, Integer.valueOf(this.g), this.h, this.i, this.j, Boolean.valueOf(this.k), Boolean.valueOf(this.l));
    }

    public final void u(Integer num) {
        if (yks.e(this.h, num)) {
            return;
        }
        this.h = num;
        G(4);
    }

    public final void v(String str) {
        if (yks.e(this.j, str)) {
            return;
        }
        this.j = str;
        G(6);
    }

    public final void w(boolean z) {
        if (yks.e(Boolean.valueOf(this.k), Boolean.valueOf(z))) {
            return;
        }
        this.k = z;
        G(7);
    }

    public final void x(boolean z) {
        if (yks.e(Boolean.valueOf(this.l), Boolean.valueOf(z))) {
            return;
        }
        this.l = z;
        G(8);
    }

    public final void y(String str) {
        if (yks.e(this.f, str)) {
            return;
        }
        this.f = str;
        G(2);
    }

    public final void z(Integer num) {
        if (yks.e(this.i, num)) {
            return;
        }
        this.i = num;
        G(5);
    }
}
