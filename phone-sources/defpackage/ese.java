package defpackage;

import android.os.HandlerThread;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ese implements eso {
    public final ttm a;
    public final ttm b;

    public ese(final int i) {
        final int i2 = 1;
        ttm ttmVar = new ttm() { // from class: esd
            @Override // defpackage.ttm
            public final Object get() {
                return i2 != 0 ? new HandlerThread(esf.d(i, "ExoPlayer:MediaCodecAsyncAdapter:")) : new HandlerThread(esf.d(i, "ExoPlayer:MediaCodecQueueingThread:"));
            }
        };
        final int i3 = 0;
        ttm ttmVar2 = new ttm() { // from class: esd
            @Override // defpackage.ttm
            public final Object get() {
                return i3 != 0 ? new HandlerThread(esf.d(i, "ExoPlayer:MediaCodecAsyncAdapter:")) : new HandlerThread(esf.d(i, "ExoPlayer:MediaCodecQueueingThread:"));
            }
        };
        this.a = ttmVar;
        this.b = ttmVar2;
    }
}
