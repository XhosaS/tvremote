package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hy implements View.OnTouchListener {
    final /* synthetic */ hz a;

    public hy(hz hzVar) {
        this.a = hzVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action != 0) {
            if (action != 1) {
                return false;
            }
            hz hzVar = this.a;
            hzVar.o.removeCallbacks(hzVar.r);
            return false;
        }
        hz hzVar2 = this.a;
        PopupWindow popupWindow = hzVar2.q;
        if (popupWindow == null || !popupWindow.isShowing() || x < 0 || x >= hzVar2.q.getWidth() || y < 0 || y >= hzVar2.q.getHeight()) {
            return false;
        }
        hzVar2.o.postDelayed(hzVar2.r, 250L);
        return false;
    }
}
