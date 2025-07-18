package defpackage;

import android.view.View;
import com.google.android.videos.R;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kcq extends scf {
    public iyk a;
    public View.OnClickListener b;
    public boolean c;
    public View.OnClickListener d;

    @Override // defpackage.scf
    public final int a() {
        return R.layout.managed_services_page_view_layout;
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        kcq kcqVar = (kcq) scfVar;
        long j = true != yks.e(this.a, kcqVar.a) ? 1L : 0L;
        if (!yks.e(this.b, kcqVar.b)) {
            j |= 2;
        }
        if (!yks.e(Boolean.valueOf(this.c), Boolean.valueOf(kcqVar.c))) {
            j |= 4;
        }
        return !yks.e(this.d, kcqVar.d) ? j | 8 : j;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new kcp();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.pages.managedservices.ManagedServicesPageViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        kcp kcpVar = (kcp) scaVar;
        if (j == 0 || (1 & j) != 0) {
            try {
                kcpVar.u(R.id.stream_view, this.a);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "stream_view", "com.google.android.apps.googletv.app.presentation.pages.managedservices.ManagedServicesPageViewBindable"));
            }
        }
        if (j == 0 || (2 & j) != 0) {
            try {
                kcpVar.r(R.id.cancel, this.b);
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "cancel", "com.google.android.apps.googletv.app.presentation.pages.managedservices.ManagedServicesPageViewBindable"));
            }
        }
        View view = null;
        if (j == 0 || (4 & j) != 0) {
            boolean z = this.c;
            View view2 = kcpVar.a;
            if (view2 == null) {
                yks.c("nav");
                view2 = null;
            }
            view2.setVisibility(true != z ? 8 : 0);
        }
        if (j == 0 || (j & 8) != 0) {
            View.OnClickListener onClickListener = this.d;
            View view3 = kcpVar.b;
            if (view3 == null) {
                yks.c("doneButton");
            } else {
                view = view3;
            }
            view.setOnClickListener(new iuy(kcpVar, onClickListener, 7));
        }
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Boolean.valueOf(this.c), this.d);
    }

    @Override // defpackage.scf
    public final Object[] o() {
        return a.z();
    }

    public final String toString() {
        return String.format("ManagedServicesPageViewModel{stream=%s, cancelClickListener=%s, isNavVisible=%s, doneClickListener=%s}", this.a, this.b, Boolean.valueOf(this.c), this.d);
    }

    @Override // defpackage.scf
    public final void i(View view) {
    }

    @Override // defpackage.scf
    public final void j(View view) {
    }
}
