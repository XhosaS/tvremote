package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sqd implements View.OnTouchListener {
    private final /* synthetic */ int a;

    public sqd(int i) {
        this.a = i;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.a;
        if (i == 0 || i == 1 || i == 2) {
            return true;
        }
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        view.getParent().requestDisallowInterceptTouchEvent(true);
        return false;
    }
}
