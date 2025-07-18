package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rli extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ ExpandableDialogView a;

    public rli(ExpandableDialogView expandableDialogView) {
        this.a = expandableDialogView;
    }

    private final boolean a(MotionEvent motionEvent) {
        return !this.a.a.contains(Math.round(motionEvent.getX()), Math.round(motionEvent.getY()));
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return a(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        Runnable runnable;
        boolean zA = a(motionEvent);
        if (!zA || (runnable = this.a.j) == null) {
            return zA;
        }
        runnable.run();
        return true;
    }
}
