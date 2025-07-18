package defpackage;

import android.os.Handler;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ewi implements ewg {
    private static final zdy c = zdy.h("com/google/android/apps/tvsearch/app/finishontalkingdone/FinishOnTalkingDoneImpl");
    private static final Duration d;
    public Runnable a;
    public int b;
    private final Handler e;
    private Duration f;
    private final Runnable g;

    static {
        Duration durationOfSeconds = Duration.ofSeconds(3L);
        durationOfSeconds.getClass();
        d = durationOfSeconds;
    }

    public ewi(Handler handler) {
        handler.getClass();
        this.e = handler;
        this.b = 1;
        this.f = d;
        this.g = new Runnable() { // from class: ewh
            @Override // java.lang.Runnable
            public final void run() {
                ewi ewiVar = this.a;
                Runnable runnable = ewiVar.a;
                if (runnable != null) {
                    runnable.run();
                    ewiVar.e();
                }
            }
        };
    }

    private final void f() {
        this.e.removeCallbacks(this.g);
    }

    private final void g() {
        feq.e(this.e, this.f, this.g);
    }

    @Override // defpackage.ewg
    public final void a(Runnable runnable, Duration duration) {
        runnable.getClass();
        duration.getClass();
        int i = this.b;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0 || i2 == 1) {
            this.a = runnable;
            this.f = duration;
            g();
            this.b = 4;
            return;
        }
        if (i2 == 2) {
            this.a = runnable;
            this.f = duration;
        } else {
            if (i2 != 3) {
                throw new agpg();
            }
            this.a = runnable;
            this.f = duration;
            f();
            g();
        }
    }

    @Override // defpackage.ewg
    public final void b() {
        int i = this.b;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0 || i2 == 1) {
            return;
        }
        if (i2 == 2) {
            this.b = 2;
        } else {
            if (i2 != 3) {
                throw new agpg();
            }
            f();
            g();
        }
    }

    @Override // defpackage.ewg
    public final void c() {
        int i = this.b;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            this.b = 3;
            return;
        }
        if (i2 == 1) {
            ((zdv) c.b().q("com/google/android/apps/tvsearch/app/finishontalkingdone/FinishOnTalkingDoneImpl", "onTalking", 110, "FinishOnTalkingDoneImpl.kt")).u("Unexpected action onTalking() for state TIMER_RESTARTED.");
            return;
        }
        if (i2 == 2) {
            ((zdv) c.b().q("com/google/android/apps/tvsearch/app/finishontalkingdone/FinishOnTalkingDoneImpl", "onTalking", 112, "FinishOnTalkingDoneImpl.kt")).u("Unexpected action onTalking() for state WAIT_FOR_TALKING_DONE.");
        } else {
            if (i2 != 3) {
                throw new agpg();
            }
            f();
            this.b = 3;
        }
    }

    @Override // defpackage.ewg
    public final void d() {
        int i = this.b;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            ((zdv) c.b().q("com/google/android/apps/tvsearch/app/finishontalkingdone/FinishOnTalkingDoneImpl", "onTalkingDone", 135, "FinishOnTalkingDoneImpl.kt")).u("Unexpected action onTalkingDone() for state START.");
            return;
        }
        if (i2 == 1) {
            if (this.a == null) {
                e();
                return;
            } else {
                g();
                this.b = 4;
                return;
            }
        }
        if (i2 != 2) {
            if (i2 != 3) {
                throw new agpg();
            }
            ((zdv) c.b().q("com/google/android/apps/tvsearch/app/finishontalkingdone/FinishOnTalkingDoneImpl", "onTalkingDone", 137, "FinishOnTalkingDoneImpl.kt")).u("Unexpected action onTalkingDone() for state WAIT_FOR_TIMER.");
        } else if (this.a == null) {
            e();
        } else {
            g();
            this.b = 4;
        }
    }

    @Override // defpackage.ewg
    public final void e() {
        this.f = d;
        this.a = null;
        this.e.removeCallbacks(this.g);
        this.b = 1;
    }
}
