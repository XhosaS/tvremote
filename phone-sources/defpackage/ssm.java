package defpackage;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ssm implements View.OnTouchListener {
    private final Dialog a;
    private final int b;
    private final int c;
    private final int d;

    public ssm(Dialog dialog, Rect rect) {
        this.a = dialog;
        this.b = rect.left;
        this.c = rect.top;
        this.d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = this.b + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, this.c + viewFindViewById.getTop(), width, viewFindViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            float f = (-this.d) - 1;
            motionEventObtain.setLocation(f, f);
        }
        view.performClick();
        return this.a.onTouchEvent(motionEventObtain);
    }
}
