package defpackage;

import android.view.View;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jes extends scf implements scl {
    public scg a;
    public sck b;
    public wlx c;
    public wls d;
    public View.OnClickListener e;
    private final yfo f;
    private int g = 0;
    private final Set h = new HashSet();

    public jes(yfo yfoVar) {
        this.f = yfoVar;
    }

    @Override // defpackage.scf
    public final int a() {
        return R.layout.app_row_card_layout;
    }

    @Override // defpackage.scl
    public final int b() {
        return this.g;
    }

    @Override // defpackage.scl
    public final int c() {
        return 1;
    }

    @Override // defpackage.scl
    public final int d() {
        return 10;
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        jes jesVar = (jes) scfVar;
        long j = true != yks.e(this.c, jesVar.c) ? 1L : 0L;
        if (!yks.e(this.d, jesVar.d)) {
            j |= 2;
        }
        return !yks.e(this.e, jesVar.e) ? j | 4 : j;
    }

    @Override // defpackage.scf
    protected final /* bridge */ /* synthetic */ sca f() {
        return (sca) this.f.b();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.approwcard.AppRowCardViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        jer jerVar = (jer) scaVar;
        if (j == 0 || (1 & j) != 0) {
            jerVar.a.t(jerVar, this.c, R.id.app_icon, -1, -1, true, false, false);
        }
        if (j == 0 || (2 & j) != 0) {
            jwq.j(jerVar, this.d, R.id.app_title, 8);
        }
        if (j == 0 || (j & 4) != 0) {
            try {
                jerVar.r(R.id.app_card_component, this.e);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "app_card_component", "com.google.android.apps.googletv.app.presentation.components.approwcard.AppRowCardViewBindable"));
            }
        }
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d, this.e);
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
        this.g = i;
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
        this.h.add(sddVar);
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        this.h.remove(sddVar);
    }

    public final String toString() {
        return String.format("AppRowCardViewModel{appIcon=%s, appTitle=%s, cardOnClickListener=%s}", this.c, this.d, this.e);
    }
}
