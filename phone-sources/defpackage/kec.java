package defpackage;

import android.view.View;
import com.google.android.videos.R;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kec extends scf {
    public sco a = sco.a;
    public View.OnClickListener b;
    public View.OnClickListener c;

    @Override // defpackage.scf
    public final int a() {
        return R.layout.purchase_failure_layout;
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        kec kecVar = (kec) scfVar;
        long j = true != yks.e(this.a, kecVar.a) ? 1L : 0L;
        if (!yks.e(this.b, kecVar.b)) {
            j |= 2;
        }
        return !yks.e(this.c, kecVar.c) ? j | 4 : j;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new keb();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.pages.purchase.PurchaseFailureViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        keb kebVar = (keb) scaVar;
        if (j == 0 || (1 & j) != 0) {
            try {
                kebVar.w(R.id.error_bottomsheet_body, this.a.a(kebVar.o()), -1);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "error_bottomsheet_body", "com.google.android.apps.googletv.app.presentation.pages.purchase.PurchaseFailureViewBindable"));
            }
        }
        if (j == 0 || (2 & j) != 0) {
            try {
                kebVar.r(R.id.bottom_sheet_retry_button, this.b);
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "bottom_sheet_retry_button", "com.google.android.apps.googletv.app.presentation.pages.purchase.PurchaseFailureViewBindable"));
            }
        }
        if (j == 0 || (j & 4) != 0) {
            try {
                kebVar.r(R.id.bottom_sheet_close_button, this.c);
            } catch (scr unused3) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "bottom_sheet_close_button", "com.google.android.apps.googletv.app.presentation.pages.purchase.PurchaseFailureViewBindable"));
            }
        }
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }

    @Override // defpackage.scf
    public final Object[] o() {
        return a.z();
    }

    public final String toString() {
        return String.format("PurchaseFailureViewModel{errorMessage=%s, retryClickListener=%s, closeClickListener=%s}", this.a, this.b, this.c);
    }

    @Override // defpackage.scf
    public final void i(View view) {
    }

    @Override // defpackage.scf
    public final void j(View view) {
    }
}
