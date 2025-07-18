package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jkn extends scf implements scl {
    public scg a;
    public sck b;
    public int d;
    public wfo e;
    public sco c = sco.a;
    public boolean f = true;
    private int h = 0;
    public final Set g = new HashSet();

    @Override // defpackage.scf
    public final int a() {
        return R.layout.rental_expiry_view_layout;
    }

    @Override // defpackage.scl
    public final int b() {
        return this.h;
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
        jkn jknVar = (jkn) scfVar;
        long j = true != yks.e(this.c, jknVar.c) ? 1L : 0L;
        if (!a.r(this.d, jknVar.d)) {
            j |= 2;
        }
        return !yks.e(this.e, jknVar.e) ? j | 4 : j;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new jkm();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.entity.rentalexpiry.RentalExpiryViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        wfo wfoVar;
        jkm jkmVar = (jkm) scaVar;
        if (j == 0 || (1 & j) != 0) {
            try {
                jkmVar.w(R.id.rental_message, this.c.a(jkmVar.o()), -1);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "rental_message", "com.google.android.apps.googletv.app.presentation.components.entity.rentalexpiry.RentalExpiryViewBindable"));
            }
        }
        if (j == 0 || (2 & j) != 0) {
            jkmVar.a().setCompoundDrawablesWithIntrinsicBounds(this.d, 0, 0, 0);
        }
        if ((j == 0 || (j & 4) != 0) && (wfoVar = this.e) != null) {
            LinearLayout linearLayout = jkmVar.a;
            if (linearLayout == null) {
                yks.c("rentalExpiryComponent");
                linearLayout = null;
            }
            linearLayout.setGravity(17);
            jkmVar.a().setTextColor(wfoVar.h());
            for (Drawable drawable : jkmVar.a().getCompoundDrawables()) {
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(wfoVar.h(), PorterDuff.Mode.SRC_IN));
                }
            }
        }
    }

    public final int hashCode() {
        return Objects.hash(this.c, Integer.valueOf(this.d), this.e);
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
        this.h = i;
    }

    @Override // defpackage.scl
    public final boolean l() {
        return false;
    }

    @Override // defpackage.scl
    public final boolean m() {
        return this.f;
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
        this.g.add(sddVar);
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        this.g.remove(sddVar);
    }

    public final String toString() {
        return String.format("RentalExpiryViewModel{title=%s, icon=%s, applyDynamicScheme=%s}", this.c, Integer.valueOf(this.d), this.e);
    }
}
