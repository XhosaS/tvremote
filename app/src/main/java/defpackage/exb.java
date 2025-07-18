package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class exb extends FrameLayout {
    public boolean a;
    Window b;

    public exb(Context context) {
        super(context);
        this.a = true;
    }

    public final boolean a(MotionEvent motionEvent) {
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    public final boolean b(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean c(KeyEvent keyEvent) {
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public final boolean d(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Window window = this.b;
        if (window != null && !this.a) {
            Window.Callback callback = window.getCallback();
            View focusedChild = getFocusedChild();
            if (focusedChild != null && focusedChild.dispatchKeyEvent(keyEvent)) {
                return true;
            }
            if (callback != null && callback.dispatchKeyEvent(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public final boolean e(MotionEvent motionEvent) {
        return super.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        Window.Callback callback;
        super.onAttachedToWindow();
        Window window = this.b;
        if (window == null || (callback = window.getCallback()) == null) {
            return;
        }
        callback.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        Window.Callback callback;
        super.onDetachedFromWindow();
        Window window = this.b;
        if (window == null || (callback = window.getCallback()) == null) {
            return;
        }
        callback.onDetachedFromWindow();
    }
}
