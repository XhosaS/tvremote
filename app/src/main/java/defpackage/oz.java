package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public class oz implements ka {
    private static Method a;
    private static Method b;
    private final Context c;
    private ListAdapter d;
    public nu e;
    public int g;
    public boolean h;
    public boolean i;
    public View k;
    public AdapterView.OnItemClickListener l;
    public AdapterView.OnItemSelectedListener m;
    final Handler o;
    public boolean p;
    public final PopupWindow q;
    private int r;
    private boolean s;
    private DataSetObserver t;
    private Rect y;
    public int f = -2;
    public int j = 0;
    final oy n = new oy(this);
    private final ox u = new ox(this);
    private final ow v = new ow(this);
    private final ou w = new ou(this);
    private final Rect x = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                b = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public oz(Context context, AttributeSet attributeSet, int i) {
        this.c = context;
        this.o = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hs.o, i, 0);
        this.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.r = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.s = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        lw lwVar = new lw(context, attributeSet, i);
        this.q = lwVar;
        lwVar.setInputMethodMode(1);
    }

    public final Drawable c() {
        return this.q.getBackground();
    }

    @Override // defpackage.ka
    public final ListView cl() {
        return this.e;
    }

    public final int cm() {
        return this.g;
    }

    public final int cn() {
        if (this.s) {
            return this.r;
        }
        return 0;
    }

    public void e(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.t;
        if (dataSetObserver == null) {
            this.t = new ov(this);
        } else {
            ListAdapter listAdapter2 = this.d;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.d = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.t);
        }
        nu nuVar = this.e;
        if (nuVar != null) {
            nuVar.setAdapter(this.d);
        }
    }

    @Override // defpackage.ka
    public final void f() {
        PopupWindow popupWindow = this.q;
        popupWindow.dismiss();
        popupWindow.setContentView(null);
        this.e = null;
        this.o.removeCallbacks(this.n);
    }

    public final void g(Drawable drawable) {
        this.q.setBackgroundDrawable(drawable);
    }

    public final void h(int i) {
        this.g = i;
    }

    public final void k(int i) {
        this.r = i;
        this.s = true;
    }

    public final int o() {
        if (this.q.isShowing()) {
            return this.e.getSelectedItemPosition();
        }
        return -1;
    }

    public nu p(Context context, boolean z) {
        return new nu(context, z);
    }

    public final void q() {
        nu nuVar = this.e;
        if (nuVar != null) {
            nuVar.a = true;
            nuVar.requestLayout();
        }
    }

    public final void r(int i) {
        Drawable background = this.q.getBackground();
        if (background == null) {
            this.f = i;
            return;
        }
        Rect rect = this.x;
        background.getPadding(rect);
        this.f = rect.left + rect.right + i;
    }

    @Override // defpackage.ka
    public final void s() {
        int i;
        int iMakeMeasureSpec;
        if (this.e == null) {
            nu nuVarP = p(this.c, !this.p);
            this.e = nuVarP;
            nuVarP.setAdapter(this.d);
            this.e.setOnItemClickListener(this.l);
            this.e.setFocusable(true);
            this.e.setFocusableInTouchMode(true);
            this.e.setOnItemSelectedListener(new ot(this));
            this.e.setOnScrollListener(this.v);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.m;
            if (onItemSelectedListener != null) {
                this.e.setOnItemSelectedListener(onItemSelectedListener);
            }
            this.q.setContentView(this.e);
        }
        PopupWindow popupWindow = this.q;
        Drawable background = popupWindow.getBackground();
        if (background != null) {
            Rect rect = this.x;
            background.getPadding(rect);
            i = rect.top + rect.bottom;
            if (!this.s) {
                this.r = -rect.top;
            }
        } else {
            this.x.setEmpty();
            i = 0;
        }
        int maxAvailableHeight = popupWindow.getMaxAvailableHeight(this.k, this.r, popupWindow.getInputMethodMode() == 2);
        int i2 = this.f;
        if (i2 == -2) {
            int i3 = this.c.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.x;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i2 != -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        } else {
            int i4 = this.c.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.x;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4 - (rect3.left + rect3.right), 1073741824);
        }
        int iB = this.e.b(iMakeMeasureSpec, maxAvailableHeight);
        int paddingTop = iB > 0 ? i + this.e.getPaddingTop() + this.e.getPaddingBottom() : 0;
        v();
        popupWindow.setWindowLayoutType(1002);
        int i5 = iB + paddingTop;
        if (popupWindow.isShowing()) {
            if (this.k.isAttachedToWindow()) {
                int width = this.f;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.k.getWidth();
                }
                popupWindow.setOutsideTouchable(true);
                popupWindow.update(this.k, this.g, this.r, width < 0 ? -1 : width, i5 >= 0 ? i5 : -1);
                return;
            }
            return;
        }
        int width2 = this.f;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.k.getWidth();
        }
        popupWindow.setWidth(width2);
        popupWindow.setHeight(i5);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = a;
            if (method != null) {
                try {
                    method.invoke(popupWindow, true);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.q.setIsClippedToScreen(true);
        }
        PopupWindow popupWindow2 = this.q;
        popupWindow2.setOutsideTouchable(true);
        popupWindow2.setTouchInterceptor(this.u);
        if (this.i) {
            popupWindow2.setOverlapAnchor(this.h);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = b;
            if (method2 != null) {
                try {
                    method2.invoke(popupWindow2, this.y);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            this.q.setEpicenterBounds(this.y);
        }
        this.q.showAsDropDown(this.k, this.g, this.r, this.j);
        this.e.setSelection(-1);
        if (!this.p || this.e.isInTouchMode()) {
            q();
        }
        if (this.p) {
            return;
        }
        this.o.post(this.w);
    }

    public final void t(Rect rect) {
        this.y = rect != null ? new Rect(rect) : null;
    }

    @Override // defpackage.ka
    public final boolean u() {
        return this.q.isShowing();
    }

    public final boolean v() {
        return this.q.getInputMethodMode() == 2;
    }

    public final void w() {
        this.q.setInputMethodMode(2);
    }

    public final void x() {
        this.p = true;
        this.q.setFocusable(true);
    }
}
