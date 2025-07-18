package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mrb implements lkr, mjg {
    public final idr a = new idz(0);
    public final idr b = new idz(0);
    public final idr c = new idz(Integer.MIN_VALUE);
    public final idr d = new idz(0);
    public final idr e = new idz(Collections.EMPTY_LIST);
    public final idr f = new idz(ieg.a);
    public final idr g = new idz(Collections.EMPTY_LIST);
    public final idr h = new idz(-1);
    public final idr i = new idz(false);

    @Override // defpackage.lkr
    public final void onPlayerAudioTracks(List<kzo> list, int i) {
        this.g.c(list);
        this.h.c(Integer.valueOf(i));
    }

    @Override // defpackage.lkr
    public final void onPlayerProgress(int i, int i2, int i3) {
        this.b.c(Integer.valueOf(i));
        this.d.c(Integer.valueOf(i2));
    }

    @Override // defpackage.lkr
    public final void onPlayerStateChanged(int i, llt lltVar, int i2) {
        this.a.c(Integer.valueOf(i));
    }

    @Override // defpackage.lkr
    public final void onPlayerSubtitleTracks(List<kwx> list, kwx kwxVar) {
        this.e.c(list);
        this.f.c(ieg.a(kwxVar));
    }

    @Override // defpackage.lkr
    public final /* synthetic */ void onVideoInfo(kwy kwyVar, int i, int i2, kuw kuwVar, ieg iegVar, int i3) {
        kfw.J(this, kwyVar, i, i2, kuwVar, iegVar, i3);
    }

    @Override // defpackage.lkr
    public final void onVideoInfo(String str, int i, int i2, kuw kuwVar, ieg<lvd> iegVar, int i3) {
        this.c.c(Integer.valueOf(i));
    }

    @Override // defpackage.lkr
    public final /* synthetic */ void onAdPlaybackCompleted() {
    }

    @Override // defpackage.lkr
    public final /* synthetic */ void onAdPlaybackStarted() {
    }

    @Override // defpackage.lkr
    public final void onPlaybackTerminated() {
    }

    @Override // defpackage.lkr
    public final void onStoryboards(List<lck> list) {
    }

    @Override // defpackage.lkr
    public final void onStreamingWarningRequired(boolean z) {
    }

    @Override // defpackage.lkr
    public final void maybeShowKnowledge(int i, int i2) {
    }
}
