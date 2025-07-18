package android.support.v7.widget;

import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import defpackage.cww;
import defpackage.cwy;

/* compiled from: PG */
/* loaded from: classes.dex */
class TooltipCompatHandler implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    private static final long HOVER_HIDE_TIMEOUT_MS = 15000;
    private static final long HOVER_HIDE_TIMEOUT_SHORT_MS = 3000;
    private static final long LONG_CLICK_HIDE_TIMEOUT_MS = 2500;
    private static final String TAG = "TooltipCompatHandler";
    private static TooltipCompatHandler sActiveHandler;
    private static TooltipCompatHandler sPendingHandler;
    private final View mAnchor;
    private int mAnchorX;
    private int mAnchorY;
    private boolean mForceNextChangeSignificant;
    private boolean mFromTouch;
    private final int mHoverSlop;
    private TooltipPopup mPopup;
    private final CharSequence mTooltipText;
    private final Runnable mShowRunnable = new Runnable() { // from class: android.support.v7.widget.TooltipCompatHandler$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() throws Resources.NotFoundException {
            this.f$0.m67lambda$new$0$androidsupportv7widgetTooltipCompatHandler();
        }
    };
    private final Runnable mHideRunnable = new Runnable() { // from class: android.support.v7.widget.TooltipCompatHandler$$ExternalSyntheticLambda1
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.hide();
        }
    };

    private TooltipCompatHandler(View view, CharSequence charSequence) {
        this.mAnchor = view;
        this.mTooltipText = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        int i = cwy.a;
        this.mHoverSlop = Build.VERSION.SDK_INT >= 28 ? viewConfiguration.getScaledHoverSlop() : viewConfiguration.getScaledTouchSlop() / 2;
        forceNextChangeSignificant();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void cancelPendingShow() {
        this.mAnchor.removeCallbacks(this.mShowRunnable);
    }

    private void forceNextChangeSignificant() {
        this.mForceNextChangeSignificant = true;
    }

    private void scheduleShow() {
        this.mAnchor.postDelayed(this.mShowRunnable, ViewConfiguration.getLongPressTimeout());
    }

    private static void setPendingHandler(TooltipCompatHandler tooltipCompatHandler) {
        TooltipCompatHandler tooltipCompatHandler2 = sPendingHandler;
        if (tooltipCompatHandler2 != null) {
            tooltipCompatHandler2.cancelPendingShow();
        }
        sPendingHandler = tooltipCompatHandler;
        if (tooltipCompatHandler != null) {
            tooltipCompatHandler.scheduleShow();
        }
    }

    public static void setTooltipText(View view, CharSequence charSequence) {
        TooltipCompatHandler tooltipCompatHandler = sPendingHandler;
        if (tooltipCompatHandler != null && tooltipCompatHandler.mAnchor == view) {
            setPendingHandler(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new TooltipCompatHandler(view, charSequence);
            return;
        }
        TooltipCompatHandler tooltipCompatHandler2 = sActiveHandler;
        if (tooltipCompatHandler2 != null && tooltipCompatHandler2.mAnchor == view) {
            tooltipCompatHandler2.hide();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    private boolean updateAnchorPos(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (!this.mForceNextChangeSignificant) {
            int i = x - this.mAnchorX;
            if (Math.abs(i) <= this.mHoverSlop) {
                int i2 = y - this.mAnchorY;
                if (Math.abs(i2) <= this.mHoverSlop) {
                    return false;
                }
            }
        }
        this.mAnchorX = x;
        this.mAnchorY = y;
        this.mForceNextChangeSignificant = false;
        return true;
    }

    public void hide() {
        if (sActiveHandler == this) {
            sActiveHandler = null;
            TooltipPopup tooltipPopup = this.mPopup;
            if (tooltipPopup != null) {
                tooltipPopup.hide();
                this.mPopup = null;
                forceNextChangeSignificant();
                this.mAnchor.removeOnAttachStateChangeListener(this);
            } else {
                Log.e(TAG, "sActiveHandler.mPopup == null");
            }
        }
        if (sPendingHandler == this) {
            setPendingHandler(null);
        }
        this.mAnchor.removeCallbacks(this.mHideRunnable);
    }

    /* renamed from: lambda$new$0$android-support-v7-widget-TooltipCompatHandler, reason: not valid java name */
    public /* synthetic */ void m67lambda$new$0$androidsupportv7widgetTooltipCompatHandler() throws Resources.NotFoundException {
        show(false);
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.mPopup != null && this.mFromTouch) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.mAnchor.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action != 10) {
                return false;
            }
            forceNextChangeSignificant();
            hide();
            return false;
        }
        if (!this.mAnchor.isEnabled() || this.mPopup != null || !updateAnchorPos(motionEvent)) {
            return false;
        }
        setPendingHandler(this);
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) throws Resources.NotFoundException {
        this.mAnchorX = view.getWidth() / 2;
        this.mAnchorY = view.getHeight() / 2;
        show(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        hide();
    }

    public void show(boolean z) throws Resources.NotFoundException {
        long longPressTimeout;
        long j;
        long j2;
        if (this.mAnchor.isAttachedToWindow()) {
            setPendingHandler(null);
            TooltipCompatHandler tooltipCompatHandler = sActiveHandler;
            if (tooltipCompatHandler != null) {
                tooltipCompatHandler.hide();
            }
            sActiveHandler = this;
            this.mFromTouch = z;
            TooltipPopup tooltipPopup = new TooltipPopup(this.mAnchor.getContext());
            this.mPopup = tooltipPopup;
            tooltipPopup.show(this.mAnchor, this.mAnchorX, this.mAnchorY, this.mFromTouch, this.mTooltipText);
            this.mAnchor.addOnAttachStateChangeListener(this);
            if (this.mFromTouch) {
                j2 = LONG_CLICK_HIDE_TIMEOUT_MS;
            } else {
                View view = this.mAnchor;
                int[] iArr = cww.a;
                if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = HOVER_HIDE_TIMEOUT_SHORT_MS;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = HOVER_HIDE_TIMEOUT_MS;
                }
                j2 = j - longPressTimeout;
            }
            this.mAnchor.removeCallbacks(this.mHideRunnable);
            this.mAnchor.postDelayed(this.mHideRunnable, j2);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
