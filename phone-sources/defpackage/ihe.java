package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ihe implements View.OnTouchListener {
    private static final Duration a;
    private GestureDetector b;
    private final ihd c = new ihd(this);
    private boolean d;

    static {
        Duration durationOfMillis = Duration.ofMillis(100L);
        durationOfMillis.getClass();
        a = durationOfMillis;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (view != null && motionEvent != null) {
            if (this.b == null) {
                this.b = new GestureDetector(view.getContext(), this.c);
            }
            if (motionEvent.getAction() == 0) {
                this.d = true;
            }
            if (motionEvent.getAction() == 1) {
                this.d = false;
                if (motionEvent.getEventTime() - motionEvent.getDownTime() <= a.toMillis()) {
                    view.performClick();
                }
            }
            if (this.d || motionEvent.getAction() == 1) {
                GestureDetector gestureDetector = this.b;
                if (gestureDetector == null) {
                    yks.c("gestureDetector");
                    gestureDetector = null;
                }
                return gestureDetector.onTouchEvent(motionEvent);
            }
        }
        return false;
    }

    public void a() {
    }

    public void d() {
    }

    public void b(float f) {
    }

    public void c(float f) {
    }
}
