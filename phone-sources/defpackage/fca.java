package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fca implements Choreographer.FrameCallback, Handler.Callback {
    public static final fca a = new fca();
    public volatile long b = -9223372036854775807L;
    public final Handler c;
    private final HandlerThread d;
    private Choreographer e;
    private int f;

    private fca() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.d = handlerThread;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        String str = edt.a;
        Handler handler = new Handler(looper, this);
        this.c = handler;
        handler.sendEmptyMessage(1);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.b = j;
        Choreographer choreographer = this.e;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            try {
                this.e = Choreographer.getInstance();
            } catch (RuntimeException e) {
                edb.f("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
            return true;
        }
        if (i == 2) {
            Choreographer choreographer = this.e;
            if (choreographer != null) {
                int i2 = this.f + 1;
                this.f = i2;
                if (i2 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i != 3) {
            return false;
        }
        Choreographer choreographer2 = this.e;
        if (choreographer2 != null) {
            int i3 = this.f - 1;
            this.f = i3;
            if (i3 == 0) {
                choreographer2.removeFrameCallback(this);
                this.b = -9223372036854775807L;
            }
        }
        return true;
    }
}
