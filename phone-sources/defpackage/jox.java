package defpackage;

import android.view.View;
import com.google.android.material.chip.Chip;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jox extends scf implements scl {
    public scg a;
    public sck b;
    public wlx d;
    public wlx e;
    public wmb f;
    public wls g;
    public wls h;
    public boolean i;
    private final int j;
    private final yfo k;
    public sco c = sco.a;
    private int l = 0;
    private final Set m = new HashSet();

    public jox(yfo yfoVar, int i) {
        this.k = yfoVar;
        this.j = i;
    }

    @Override // defpackage.scf
    public final int a() {
        return this.j;
    }

    @Override // defpackage.scl
    public final int b() {
        return this.l;
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
        jox joxVar = (jox) scfVar;
        long j = true != yks.e(this.c, joxVar.c) ? 1L : 0L;
        if (!yks.e(this.d, joxVar.d)) {
            j |= 2;
        }
        if (!yks.e(this.e, joxVar.e)) {
            j |= 4;
        }
        if (!yks.e(this.f, joxVar.f)) {
            j |= 8;
        }
        if (!yks.e(this.g, joxVar.g)) {
            j |= 16;
        }
        if (!yks.e(this.h, joxVar.h)) {
            j |= 32;
        }
        return !yks.e(Boolean.valueOf(this.i), Boolean.valueOf(joxVar.i)) ? j | 64 : j;
    }

    @Override // defpackage.scf
    protected final /* bridge */ /* synthetic */ sca f() {
        return (sca) this.k.b();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.genericstreamtitle.GenericStreamTitleViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        wls wlsVar;
        jow jowVar = (jow) scaVar;
        if (j == 0 || (j & 1) != 0) {
            try {
                jowVar.w(R.id.title, this.c.a(jowVar.o()), -1);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "title", "com.google.android.apps.googletv.app.presentation.components.genericstreamtitle.GenericStreamTitleViewBindable"));
            }
        }
        if (j == 0 || (j & 2) != 0) {
            jowVar.c.t(jowVar, this.d, R.id.title_thumbnail, -1, -1, false, false, false);
        }
        if (j == 0 || (j & 4) != 0) {
            jowVar.d.t(jowVar, this.e, R.id.logo, -1, 8, false, false, false);
        }
        View view = null;
        if (j == 0 || (j & 8) != 0) {
            wmb wmbVar = this.f;
            kuw kuwVar = jowVar.b;
            Object obj = kuwVar.b;
            if (wmbVar != null) {
                wlsVar = wmbVar.c;
                if (wlsVar == null) {
                    wlsVar = wls.a;
                }
            } else {
                wlsVar = null;
            }
            jwq.j(jowVar, wlsVar, R.id.link_chip, 8);
            Chip chip = (Chip) jowVar.p(R.id.link_chip);
            chip.setOnClickListener(new kaj(wmbVar, kuwVar, chip, 1, (char[]) null));
        }
        if (j == 0 || (j & 16) != 0) {
            jwq.j(jowVar, this.g, R.id.subtitle, 8);
        }
        if (j == 0 || (j & 32) != 0) {
            jwq.j(jowVar, this.h, R.id.context_header, 8);
        }
        if (j == 0 || (j & 64) != 0) {
            boolean z = this.i;
            View view2 = jowVar.a;
            if (view2 == null) {
                yks.c("thumbnailView");
            } else {
                view = view2;
            }
            view.setVisibility(true != z ? 8 : 0);
        }
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d, this.e, this.f, this.g, this.h, Boolean.valueOf(this.i));
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
        this.l = i;
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
        this.m.add(sddVar);
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        this.m.remove(sddVar);
    }

    public final String toString() {
        return String.format("GenericStreamTitleViewModel{title=%s, thumbnailBackground=%s, logo=%s, linkChip=%s, subtitle=%s, contextHeader=%s, thumbnailViewVisibility=%s}", this.c, this.d, this.e, this.f, this.g, this.h, Boolean.valueOf(this.i));
    }
}
