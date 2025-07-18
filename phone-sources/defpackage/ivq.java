package defpackage;

import android.animation.LayoutTransition;
import android.view.View;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ivq extends scf implements scl {
    private ivu A;
    private boolean B;
    private int C;
    private final Set D;
    public View.OnClickListener a;
    public View.OnClickListener b;
    public View.OnClickListener c;
    public View.OnClickListener d;
    public View.OnClickListener e;
    public View.OnClickListener f;
    public View.OnClickListener g;
    public View.OnClickListener h;
    public View.OnClickListener i;
    public View.OnClickListener j;
    public View.OnClickListener k;
    public View.OnClickListener l;
    public ivo m;
    public boolean n;
    public boolean o;
    public toq p;
    public toq q;
    public iwf r;
    public LayoutTransition s;
    public irc t;
    public tad u;
    public pku v;
    private sco w;
    private sco x;
    private boolean y;
    private boolean z;

    public ivq() {
        sco scoVar = sco.a;
        this.w = scoVar;
        this.x = scoVar;
        this.C = 0;
        this.D = new HashSet();
    }

    @Override // defpackage.scf
    public final int a() {
        return R.layout.expanded_remote_companion_bar_layout;
    }

    @Override // defpackage.scl
    public final int b() {
        return this.C;
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
        ivq ivqVar = (ivq) scfVar;
        long j = true != yks.e(this.a, ivqVar.a) ? 1L : 0L;
        if (!yks.e(this.b, ivqVar.b)) {
            j |= 2;
        }
        if (!yks.e(this.c, ivqVar.c)) {
            j |= 4;
        }
        if (!yks.e(this.d, ivqVar.d)) {
            j |= 8;
        }
        if (!yks.e(this.e, ivqVar.e)) {
            j |= 16;
        }
        if (!yks.e(this.f, ivqVar.f)) {
            j |= 32;
        }
        if (!yks.e(this.g, ivqVar.g)) {
            j |= 64;
        }
        if (!yks.e(this.h, ivqVar.h)) {
            j |= 128;
        }
        if (!yks.e(this.i, ivqVar.i)) {
            j |= 256;
        }
        if (!yks.e(this.j, ivqVar.j)) {
            j |= 512;
        }
        if (!yks.e(this.k, ivqVar.k)) {
            j |= 1024;
        }
        if (!yks.e(this.l, ivqVar.l)) {
            j |= 2048;
        }
        if (!yks.e(this.w, ivqVar.w)) {
            j |= 4096;
        }
        if (!yks.e(this.x, ivqVar.x)) {
            j |= 8192;
        }
        if (!yks.e(this.m, ivqVar.m)) {
            j |= 16384;
        }
        if (!yks.e(Boolean.valueOf(this.n), Boolean.valueOf(ivqVar.n))) {
            j |= 32768;
        }
        if (!yks.e(Boolean.valueOf(this.o), Boolean.valueOf(ivqVar.o))) {
            j |= 65536;
        }
        if (!yks.e(this.p, ivqVar.p)) {
            j |= 131072;
        }
        if (!yks.e(Boolean.valueOf(this.y), Boolean.valueOf(ivqVar.y))) {
            j |= 262144;
        }
        if (!yks.e(this.q, ivqVar.q)) {
            j |= 524288;
        }
        if (!yks.e(this.v, ivqVar.v)) {
            j |= 1048576;
        }
        if (!yks.e(this.r, ivqVar.r)) {
            j |= 2097152;
        }
        if (!yks.e(Boolean.valueOf(this.z), Boolean.valueOf(ivqVar.z))) {
            j |= 4194304;
        }
        if (!yks.e(this.t, ivqVar.t)) {
            j |= 8388608;
        }
        if (!yks.e(this.A, ivqVar.A)) {
            j |= 16777216;
        }
        if (!yks.e(Boolean.valueOf(this.B), Boolean.valueOf(ivqVar.B))) {
            j |= 33554432;
        }
        if (!yks.e(this.s, ivqVar.s)) {
            j |= 67108864;
        }
        return !yks.e(this.u, ivqVar.u) ? j | 134217728 : j;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new ivp();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.device.presentation.companionbar.ExpandedRemoteCompanionBarViewBindable";
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0372  */
    @Override // defpackage.scf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(defpackage.sca r19, long r20) {
        /*
            Method dump skipped, instructions count: 1246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ivq.h(sca, long):void");
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.w, this.x, this.m, Boolean.valueOf(this.n), Boolean.valueOf(this.o), this.p, Boolean.valueOf(this.y), this.q, this.v, this.r, Boolean.valueOf(this.z), this.t, this.A, Boolean.valueOf(this.B), this.s, this.u);
    }

    @Override // defpackage.scl
    public final void k(int i) {
        this.C = i;
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
        this.D.add(sddVar);
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        this.D.remove(sddVar);
    }

    public final void r(boolean z) {
        if (yks.e(Boolean.valueOf(this.B), Boolean.valueOf(z))) {
            return;
        }
        this.B = z;
        G(25);
    }

    public final void s(boolean z) {
        if (yks.e(Boolean.valueOf(this.z), Boolean.valueOf(z))) {
            return;
        }
        this.z = z;
        G(22);
    }

    public final void t(CharSequence charSequence) {
        sco scoVar = new sco(charSequence);
        if (yks.e(this.x, scoVar)) {
            return;
        }
        this.x = scoVar;
        G(13);
    }

    public final String toString() {
        return String.format("ExpandedRemoteCompanionBarViewModel{replayButtonClickListener=%s, forwardButtonClickListener=%s, remotePlayButtonClickListener=%s, trackpadClickListener=%s, dpadClickListener=%s, backClickListener=%s, homeClickListener=%s, assistantClickListener=%s, muteClickListener=%s, lowerVolumeClickListener=%s, increaseVolumeClickListener=%s, assistantButtonClickListener=%s, remoteContentTitle=%s, remoteContentSubtitle=%s, remoteButtonActionListeners=%s, volumeButtonsContainerVisibility=%s, muteButtonSelected=%s, trackpadListener=%s, useTrackPad=%s, dpadListener=%s, assistantButtonListener=%s, assistantButtonSpeechListener=%s, playbackControlsVisibility=%s, remoteSliderTouchListener=%s, remoteSliderProgress=%s, isVisible=%s, layoutTransition=%s, playback=%s}", this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.w, this.x, this.m, Boolean.valueOf(this.n), Boolean.valueOf(this.o), this.p, Boolean.valueOf(this.y), this.q, this.v, this.r, Boolean.valueOf(this.z), this.t, this.A, Boolean.valueOf(this.B), this.s, this.u);
    }

    public final void u(CharSequence charSequence) {
        sco scoVar = new sco(charSequence);
        if (yks.e(this.w, scoVar)) {
            return;
        }
        this.w = scoVar;
        G(12);
    }

    public final void v(ivu ivuVar) {
        if (yks.e(this.A, ivuVar)) {
            return;
        }
        this.A = ivuVar;
        G(24);
    }

    public final void w(boolean z) {
        if (yks.e(Boolean.valueOf(this.y), Boolean.valueOf(z))) {
            return;
        }
        this.y = z;
        G(18);
    }

    @Override // defpackage.scf
    public final void i(View view) {
    }

    @Override // defpackage.scf
    public final void j(View view) {
    }
}
