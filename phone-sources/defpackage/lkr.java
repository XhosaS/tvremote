package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface lkr extends llk {
    void maybeShowKnowledge(int i, int i2);

    void onAdPlaybackCompleted();

    void onAdPlaybackStarted();

    void onPlaybackTerminated();

    void onPlayerAudioTracks(List<kzo> list, int i);

    void onPlayerProgress(int i, int i2, int i3);

    void onPlayerStateChanged(int i, llt lltVar, int i2);

    void onPlayerSubtitleTracks(List<kwx> list, kwx kwxVar);

    void onStoryboards(List<lck> list);

    void onStreamingWarningRequired(boolean z);

    @Deprecated
    void onVideoInfo(String str, int i, int i2, kuw kuwVar, ieg<lvd> iegVar, int i3);

    void onVideoInfo(kwy kwyVar, int i, int i2, kuw kuwVar, ieg<lvd> iegVar, int i3);
}
