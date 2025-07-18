package defpackage;

import android.media.MediaCodec;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class etf implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ fbj a;
    private final /* synthetic */ int b;

    public /* synthetic */ etf(fbj fbjVar, int i) {
        this.b = i;
        this.a = fbjVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        if (this.b != 0) {
            this.a.a(j);
        } else {
            this.a.a(j);
        }
    }
}
