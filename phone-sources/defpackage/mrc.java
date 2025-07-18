package defpackage;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mrc extends Handler implements View.OnSystemUiVisibilityChangeListener, mgb {
    private static int b;
    private static int c;
    private static final Rect d = new Rect(0, 0, 0, 0);
    public Rect a;
    private final ViewGroup e;
    private int f;
    private boolean g;
    private boolean h;

    public mrc(Window window, ActionBar actionBar, ViewGroup viewGroup) {
        if (b == 0) {
            b = 2055;
            c = 3847;
        }
        this.e = viewGroup;
        viewGroup.setOnSystemUiVisibilityChangeListener(this);
        this.f = viewGroup.getSystemUiVisibility();
        if (actionBar != null) {
            window.getContext().obtainStyledAttributes(new int[]{R.attr.actionBarSize}).recycle();
        }
        d();
        c();
    }

    private final void d() {
        e();
        this.e.setSystemUiVisibility(this.g ? c : 1792);
    }

    private final void e() {
        removeMessages(0);
        int i = this.f;
        boolean z = this.g;
        int i2 = b;
        boolean z2 = (i & i2) == i2;
        if (this.h || z == z2) {
            return;
        }
        sendEmptyMessageDelayed(0, 2500L);
    }

    public final void a() {
        removeMessages(0);
        this.h = true;
    }

    public final void b(boolean z) {
        this.g = z;
        removeMessages(0);
        d();
    }

    public final void c() {
        Rect rect = this.a;
        if (rect == null) {
            rect = d;
        }
        ViewGroup viewGroup = this.e;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (((mfz) childAt.getLayoutParams()).a) {
                childAt.setPadding(rect.left, rect.top, rect.right, rect.bottom);
            }
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 0) {
            return;
        }
        d();
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i) {
        this.f = i;
        e();
    }
}
