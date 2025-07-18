package defpackage;

import android.view.View;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kjv extends scf implements scl {
    public scg a;
    public sck b;
    private final yfo c;
    private boolean d;
    private int e = 0;
    private final Set f = new HashSet();

    public kjv(yfo yfoVar) {
        this.c = yfoVar;
    }

    @Override // defpackage.scf
    public final int a() {
        return R.layout.loading_indicator_view_layout;
    }

    @Override // defpackage.scl
    public final int b() {
        return this.e;
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
        return !yks.e(Boolean.valueOf(this.d), Boolean.valueOf(((kjv) scfVar).d)) ? 1L : 0L;
    }

    @Override // defpackage.scf
    protected final /* bridge */ /* synthetic */ sca f() {
        return (sca) this.c.b();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.views.loadingindicator.LoadingIndicatorViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        kju kjuVar = (kju) scaVar;
        if (j == 0 || (j & 1) != 0) {
            if (!this.d) {
                kjuVar.b().setVisibility(8);
                kjuVar.a().setVisibility(8);
            } else if (kjuVar.a.e()) {
                kjuVar.b().setVisibility(8);
                kjuVar.a().setVisibility(0);
            } else {
                kjuVar.b().setVisibility(0);
                kjuVar.a().setVisibility(8);
            }
        }
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.d));
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
        this.e = i;
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
        this.f.add(sddVar);
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        this.f.remove(sddVar);
    }

    public final void r(boolean z) {
        if (yks.e(Boolean.valueOf(this.d), Boolean.valueOf(z))) {
            return;
        }
        this.d = z;
        G(0);
    }

    public final String toString() {
        return String.format("LoadingIndicatorViewModel{isVisible=%s}", Boolean.valueOf(this.d));
    }

    public kjv(yfo yfoVar, byte[] bArr) {
        this.c = yfoVar;
    }
}
