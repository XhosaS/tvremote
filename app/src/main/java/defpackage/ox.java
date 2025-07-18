package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes.dex */
class ox implements View.OnTouchListener {
    final /* synthetic */ oz a;

    public ox(oz ozVar) {
        this.a = ozVar;
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
            oz ozVar = this.a;
            ozVar.o.removeCallbacks(ozVar.n);
            return false;
        }
        oz ozVar2 = this.a;
        PopupWindow popupWindow = ozVar2.q;
        if (popupWindow == null || !popupWindow.isShowing() || x < 0 || x >= popupWindow.getWidth() || y < 0 || y >= popupWindow.getHeight()) {
            return false;
        }
        ozVar2.o.postDelayed(ozVar2.n, 250L);
        return false;
    }
}
