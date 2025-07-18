package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.google.android.tv.remote.service.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jy implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static jy a;
    public static jy b;
    public final View c;
    private final CharSequence d;
    private final int e;
    private final Runnable f = new ac(this, 18);
    private final Runnable g = new ac(this, 19);
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private auv l;

    public jy(View view, CharSequence charSequence) {
        this.c = view;
        this.d = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        int i = qx.a;
        this.e = Build.VERSION.SDK_INT >= 28 ? viewConfiguration.getScaledHoverSlop() : viewConfiguration.getScaledTouchSlop() / 2;
        d();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(jy jyVar) {
        jy jyVar2 = a;
        if (jyVar2 != null) {
            jyVar2.c.removeCallbacks(jyVar2.f);
        }
        a = jyVar;
        if (jyVar != null) {
            jyVar.c.postDelayed(jyVar.f, ViewConfiguration.getLongPressTimeout());
        }
    }

    private final void d() {
        this.k = true;
    }

    public final void a() {
        if (b == this) {
            b = null;
            auv auvVar = this.l;
            if (auvVar != null) {
                auvVar.a();
                this.l = null;
                d();
                this.c.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (a == this) {
            b(null);
        }
        this.c.removeCallbacks(this.g);
    }

    public final void c(boolean z) {
        int height;
        int i;
        int i2;
        int i3;
        int i4;
        long longPressTimeout;
        long j;
        long j2;
        View view = this.c;
        if (view.isAttachedToWindow()) {
            b(null);
            jy jyVar = b;
            if (jyVar != null) {
                jyVar.a();
            }
            b = this;
            this.j = z;
            auv auvVar = new auv(view.getContext());
            this.l = auvVar;
            int width = this.h;
            int i5 = this.i;
            boolean z2 = this.j;
            CharSequence charSequence = this.d;
            if (auvVar.b()) {
                auvVar.a();
            }
            ((TextView) auvVar.d).setText(charSequence);
            Object obj = auvVar.b;
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) obj;
            layoutParams.token = view.getApplicationWindowToken();
            Context context = (Context) auvVar.e;
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i5 + dimensionPixelOffset2;
                i = i5 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z2 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context2 = view.getContext();
                while (true) {
                    if (!(context2 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                i4 = 1;
            } else {
                Rect rect = (Rect) auvVar.a;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i2 = width;
                    i3 = 0;
                    i4 = 1;
                } else {
                    Resources resources = context.getResources();
                    i4 = 1;
                    i2 = width;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i3 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = (int[]) auvVar.f;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = (int[]) auvVar.g;
                view.getLocationOnScreen(iArr2);
                int i6 = iArr2[i3] - iArr[i3];
                iArr2[i3] = i6;
                iArr2[i4] = iArr2[i4] - iArr[i4];
                layoutParams.x = (i6 + i2) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, i3);
                View view2 = (View) auvVar.c;
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i7 = iArr2[i4];
                int i8 = ((i + i7) - dimensionPixelOffset3) - measuredHeight;
                int i9 = i7 + height + dimensionPixelOffset3;
                if (z2) {
                    if (i8 >= 0) {
                        layoutParams.y = i8;
                    } else {
                        layoutParams.y = i9;
                    }
                } else if (measuredHeight + i9 <= rect.height()) {
                    layoutParams.y = i9;
                } else {
                    layoutParams.y = i8;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView((View) auvVar.c, (ViewGroup.LayoutParams) obj);
            view.addOnAttachStateChangeListener(this);
            if (this.j) {
                j2 = 2500;
            } else {
                int[] iArr3 = qv.a;
                if ((view.getWindowSystemUiVisibility() & 1) == i4) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            Runnable runnable = this.g;
            view.removeCallbacks(runnable);
            view.postDelayed(runnable, j2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            auv r4 = r3.l
            r0 = 0
            if (r4 == 0) goto L9
            boolean r4 = r3.j
            if (r4 != 0) goto L6d
        L9:
            android.view.View r4 = r3.c
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L23
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L6d
        L23:
            int r1 = r5.getAction()
            r2 = 7
            if (r1 == r2) goto L36
            r4 = 10
            if (r1 == r4) goto L2f
            goto L6d
        L2f:
            r3.d()
            r3.a()
            goto L6d
        L36:
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto L6d
            auv r4 = r3.l
            if (r4 != 0) goto L6d
            float r4 = r5.getX()
            int r4 = (int) r4
            float r5 = r5.getY()
            int r5 = (int) r5
            boolean r1 = r3.k
            if (r1 != 0) goto L64
            int r1 = r3.h
            int r1 = r4 - r1
            int r2 = r3.e
            int r1 = java.lang.Math.abs(r1)
            if (r1 > r2) goto L64
            int r1 = r3.i
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L6d
        L64:
            r3.h = r4
            r3.i = r5
            r3.k = r0
            b(r3)
        L6d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jy.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.h = view.getWidth() / 2;
        this.i = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
