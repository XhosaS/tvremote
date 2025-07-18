package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class muh {
    public final RecyclerView a;
    public boolean b;
    public final int c;
    public boolean d;
    public boolean e;
    public float f;
    public float g;
    public float h;
    public float i;
    public View j;
    public MotionEvent k;

    public muh(RecyclerView recyclerView, Context context) {
        this.a = recyclerView;
        this.c = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public final void a(MotionEvent motionEvent) {
        if (this.j == null) {
            return;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        View view = this.j;
        float scrollX = 0.0f;
        float scrollY = 0.0f;
        while (view != this.a) {
            float left = scrollX - view.getLeft();
            float top = scrollY - view.getTop();
            view = (View) view.getParent();
            if (view == null) {
                return;
            }
            scrollX = left + view.getScrollX();
            scrollY = top + view.getScrollY();
        }
        motionEventObtain.offsetLocation(scrollX, scrollY);
        this.b = true;
        this.j.dispatchTouchEvent(motionEventObtain);
        this.b = false;
        motionEventObtain.recycle();
    }

    public final void b(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        View view = this.j;
        RecyclerView recyclerView = this.a;
        if (view == recyclerView) {
            return;
        }
        if (view != null && (motionEvent2 = this.k) != null) {
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent2);
            motionEventObtain.setAction(3);
            a(motionEventObtain);
            motionEventObtain.recycle();
        }
        this.j = recyclerView;
        this.e = true;
        if (this.k != null) {
            MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            motionEventObtainNoHistory.setLocation(this.k.getX(), motionEvent.getY());
            a(this.k);
            this.k.recycle();
            this.k = null;
            a(motionEventObtainNoHistory);
            motionEventObtainNoHistory.recycle();
        }
    }
}
