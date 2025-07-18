package defpackage;

import android.view.View;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ivl extends scf implements scl {
    public tos a;
    public View.OnClickListener b;
    public View.OnClickListener c;
    public View.OnClickListener d;
    public View.OnClickListener e;
    public View.OnClickListener f;
    public View.OnClickListener g;
    public tos h;
    public tos i;
    public tos j;
    public boolean k;
    public boolean l;
    public irc m;
    public tad n;
    private final yfo o;
    private wlx p;
    private sco q;
    private sco r;
    private boolean s;
    private boolean t;
    private ivu u;
    private int v;
    private final Set w;

    public ivl(yfo yfoVar) {
        sco scoVar = sco.a;
        this.q = scoVar;
        this.r = scoVar;
        this.v = 0;
        this.w = new HashSet();
        this.o = yfoVar;
    }

    @Override // defpackage.scf
    public final int a() {
        return R.layout.expanded_media_companion_bar_layout;
    }

    @Override // defpackage.scl
    public final int b() {
        return this.v;
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
        ivl ivlVar = (ivl) scfVar;
        long j = true != yks.e(this.p, ivlVar.p) ? 1L : 0L;
        if (!yks.e(this.q, ivlVar.q)) {
            j |= 2;
        }
        if (!yks.e(this.r, ivlVar.r)) {
            j |= 4;
        }
        if (!yks.e(this.a, ivlVar.a)) {
            j |= 8;
        }
        if (!yks.e(this.b, ivlVar.b)) {
            j |= 16;
        }
        if (!yks.e(this.c, ivlVar.c)) {
            j |= 32;
        }
        if (!yks.e(this.d, ivlVar.d)) {
            j |= 64;
        }
        if (!yks.e(this.e, ivlVar.e)) {
            j |= 128;
        }
        if (!yks.e(this.f, ivlVar.f)) {
            j |= 256;
        }
        if (!yks.e(this.g, ivlVar.g)) {
            j |= 512;
        }
        if (!yks.e(this.h, ivlVar.h)) {
            j |= 1024;
        }
        if (!yks.e(this.i, ivlVar.i)) {
            j |= 2048;
        }
        if (!yks.e(this.j, ivlVar.j)) {
            j |= 4096;
        }
        if (!yks.e(Boolean.valueOf(this.s), Boolean.valueOf(ivlVar.s))) {
            j |= 8192;
        }
        if (!yks.e(Boolean.valueOf(this.t), Boolean.valueOf(ivlVar.t))) {
            j |= 16384;
        }
        if (!yks.e(Boolean.valueOf(this.k), Boolean.valueOf(ivlVar.k))) {
            j |= 32768;
        }
        if (!yks.e(Boolean.valueOf(this.l), Boolean.valueOf(ivlVar.l))) {
            j |= 65536;
        }
        if (!yks.e(this.n, ivlVar.n)) {
            j |= 131072;
        }
        if (!yks.e(this.m, ivlVar.m)) {
            j |= 262144;
        }
        return !yks.e(this.u, ivlVar.u) ? j | 524288 : j;
    }

    @Override // defpackage.scf
    protected final /* bridge */ /* synthetic */ sca f() {
        return (sca) this.o.b();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.device.presentation.companionbar.ExpandedMediaCompanionBarViewBindable";
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x01ac  */
    @Override // defpackage.scf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(defpackage.sca r13, long r14) {
        /*
            Method dump skipped, instructions count: 867
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ivl.h(sca, long):void");
    }

    public final int hashCode() {
        return Objects.hash(this.p, this.q, this.r, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, Boolean.valueOf(this.s), Boolean.valueOf(this.t), Boolean.valueOf(this.k), Boolean.valueOf(this.l), this.n, this.m, this.u);
    }

    @Override // defpackage.scl
    public final void k(int i) {
        this.v = i;
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
        this.w.add(sddVar);
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        this.w.remove(sddVar);
    }

    public final void r(boolean z) {
        if (yks.e(Boolean.valueOf(this.s), Boolean.valueOf(z))) {
            return;
        }
        this.s = z;
        G(13);
    }

    public final void s(boolean z) {
        if (yks.e(Boolean.valueOf(this.t), Boolean.valueOf(z))) {
            return;
        }
        this.t = z;
        G(14);
    }

    public final void t(wlx wlxVar) {
        if (yks.e(this.p, wlxVar)) {
            return;
        }
        this.p = wlxVar;
        G(0);
    }

    public final String toString() {
        return String.format("ExpandedMediaCompanionBarViewModel{posterImage=%s, title=%s, subtitle=%s, playButtonClickListener=%s, rewindButtonClickListener=%s, forwardButtonClickListener=%s, muteListener=%s, lowerVolumeListener=%s, increaseVolumeListener=%s, playListener=%s, muteButtonClickListener=%s, decreaseVolumeButtonClickListener=%s, increaseVolumeButtonClickListener=%s, isVisible=%s, mediaPlaybackButtonsContainerVisibility=%s, volumeButtonsContainerVisibility=%s, muteButtonSelected=%s, playback=%s, remoteSliderTouchListener=%s, remoteSliderProgress=%s}", this.p, this.q, this.r, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, Boolean.valueOf(this.s), Boolean.valueOf(this.t), Boolean.valueOf(this.k), Boolean.valueOf(this.l), this.n, this.m, this.u);
    }

    public final void u(ivu ivuVar) {
        if (yks.e(this.u, ivuVar)) {
            return;
        }
        this.u = ivuVar;
        G(19);
    }

    public final void v(CharSequence charSequence) {
        sco scoVar = new sco(charSequence);
        if (yks.e(this.r, scoVar)) {
            return;
        }
        this.r = scoVar;
        G(2);
    }

    public final void w(CharSequence charSequence) {
        sco scoVar = new sco(charSequence);
        if (yks.e(this.q, scoVar)) {
            return;
        }
        this.q = scoVar;
        G(1);
    }

    @Override // defpackage.scf
    public final void i(View view) {
    }

    @Override // defpackage.scf
    public final void j(View view) {
    }
}
