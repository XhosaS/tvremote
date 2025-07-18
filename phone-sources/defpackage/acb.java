package defpackage;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acb implements View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback, adu {
    public static long a;
    private final View c;
    private boolean d;
    private boolean g;
    private long h;
    public final PriorityQueue b = new PriorityQueue(11, new ade(1));
    private final Choreographer e = Choreographer.getInstance();
    private final aca f = new aca();

    public acb(View view) {
        this.c = view;
        if (a == 0) {
            Display display = view.getDisplay();
            float f = 60.0f;
            if (!view.isInEditMode() && display != null) {
                float refreshRate = display.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f = refreshRate;
                }
            }
            a = (long) (1.0E9f / f);
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            onViewAttachedToWindow(view);
        }
    }

    private final boolean d() {
        aca acaVar = this.f;
        long jA = acaVar.a();
        cmq.h("compose:lazy:prefetch:available_time_nanos", jA);
        boolean z = true;
        if (jA > 0) {
            PriorityQueue priorityQueue = this.b;
            Object objPeek = priorityQueue.peek();
            objPeek.getClass();
            if (!((adt) ((zuw) objPeek).b).c(acaVar)) {
                priorityQueue.poll();
                z = false;
            }
            acaVar.a = false;
        }
        return z;
    }

    public final void a() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.c.post(this);
    }

    @Override // defpackage.adu
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void c(adt adtVar) {
        this.b.add(new zuw(1, adtVar, null));
        a();
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.g) {
            this.h = j;
            this.c.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.g = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.g = false;
        this.c.removeCallbacks(this);
        this.e.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.b;
        if (!priorityQueue.isEmpty() && this.d && this.g) {
            View view = this.c;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                aca acaVar = this.f;
                long jNanoTime = System.nanoTime();
                long j = a;
                acaVar.a = jNanoTime > (j + j) + nanos;
                acaVar.b = Math.max(this.h, nanos) + a;
                boolean zD = false;
                while (true) {
                    if (!priorityQueue.isEmpty()) {
                        if (zD) {
                            break;
                        }
                        if (acaVar.a) {
                            Trace.beginSection("compose:lazy:prefetch:idle_frame");
                            try {
                                zD = d();
                            } finally {
                                Trace.endSection();
                            }
                        } else {
                            zD = d();
                        }
                    } else if (!zD) {
                        this.d = false;
                    }
                }
                this.e.postFrameCallback(this);
                cmq.h("compose:lazy:prefetch:available_time_nanos", 0L);
                return;
            }
        }
        this.d = false;
    }
}
