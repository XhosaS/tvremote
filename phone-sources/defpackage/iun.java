package defpackage;

import android.animation.LayoutTransition;
import android.view.View;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iun extends scf implements scl {
    public sco a;
    public View.OnClickListener b;
    public View.OnClickListener c;
    public View.OnClickListener d;
    public View.OnClickListener e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public Double j;
    public LayoutTransition k;
    public tad l;
    private sco m;
    private boolean n;
    private int o;
    private final Set p;

    public iun() {
        sco scoVar = sco.a;
        this.m = scoVar;
        this.a = scoVar;
        this.o = 0;
        this.p = new HashSet();
    }

    @Override // defpackage.scf
    public final int a() {
        return R.layout.collapsed_companion_bar_layout;
    }

    @Override // defpackage.scl
    public final int b() {
        return this.o;
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
        iun iunVar = (iun) scfVar;
        long j = true != yks.e(this.m, iunVar.m) ? 1L : 0L;
        if (!yks.e(this.a, iunVar.a)) {
            j |= 2;
        }
        if (!yks.e(this.b, iunVar.b)) {
            j |= 4;
        }
        if (!yks.e(this.c, iunVar.c)) {
            j |= 8;
        }
        if (!yks.e(this.d, iunVar.d)) {
            j |= 16;
        }
        if (!yks.e(this.e, iunVar.e)) {
            j |= 32;
        }
        if (!yks.e(Boolean.valueOf(this.f), Boolean.valueOf(iunVar.f))) {
            j |= 64;
        }
        if (!yks.e(Boolean.valueOf(this.g), Boolean.valueOf(iunVar.g))) {
            j |= 128;
        }
        if (!yks.e(Boolean.valueOf(this.h), Boolean.valueOf(iunVar.h))) {
            j |= 256;
        }
        if (!yks.e(this.l, iunVar.l)) {
            j |= 512;
        }
        if (!a.r(this.i, iunVar.i)) {
            j |= 1024;
        }
        if (!yks.e(this.j, iunVar.j)) {
            j |= 2048;
        }
        if (!yks.e(Boolean.valueOf(this.n), Boolean.valueOf(iunVar.n))) {
            j |= 4096;
        }
        return !yks.e(this.k, iunVar.k) ? j | 8192 : j;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new ium();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.device.presentation.companionbar.CollapsedCompanionBarViewBindable";
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x00f2  */
    @Override // defpackage.scf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(defpackage.sca r12, long r13) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iun.h(sca, long):void");
    }

    public final int hashCode() {
        return Objects.hash(this.m, this.a, this.b, this.c, this.d, this.e, Boolean.valueOf(this.f), Boolean.valueOf(this.g), Boolean.valueOf(this.h), this.l, Integer.valueOf(this.i), this.j, Boolean.valueOf(this.n), this.k);
    }

    @Override // defpackage.scl
    public final void k(int i) {
        this.o = i;
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
        this.p.add(sddVar);
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        this.p.remove(sddVar);
    }

    public final void r(CharSequence charSequence) {
        sco scoVar = new sco(charSequence);
        if (yks.e(this.m, scoVar)) {
            return;
        }
        this.m = scoVar;
        G(0);
    }

    public final void s(boolean z) {
        if (yks.e(Boolean.valueOf(this.n), Boolean.valueOf(z))) {
            return;
        }
        this.n = z;
        G(12);
    }

    public final String toString() {
        return String.format("CollapsedCompanionBarViewModel{companionBarTitle=%s, companionBarSubtitle=%s, remoteClickListener=%s, disconnectButtonClickListener=%s, companionBarViewClickListener=%s, playButtonClickListener=%s, companionBarPlayButtonVisibility=%s, remoteButtonVisibility=%s, borderVisibility=%s, playback=%s, deviceIconResource=%s, companionBarScrubberElapsedPercent=%s, isVisible=%s, layoutTransition=%s}", this.m, this.a, this.b, this.c, this.d, this.e, Boolean.valueOf(this.f), Boolean.valueOf(this.g), Boolean.valueOf(this.h), this.l, Integer.valueOf(this.i), this.j, Boolean.valueOf(this.n), this.k);
    }

    @Override // defpackage.scf
    public final void i(View view) {
    }

    @Override // defpackage.scf
    public final void j(View view) {
    }
}
