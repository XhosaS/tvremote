package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import androidx.leanback.widget.VerticalGridView;
import com.google.android.tv.remote.service.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class wq extends FrameLayout {
    private float a;
    private float b;
    private float c;
    private int d;
    private Interpolator e;
    private float f;
    public ViewGroup h;
    public final List i;
    public ArrayList j;
    public int k;
    public List l;
    public int m;
    public int n;
    public final wa o;

    public wq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.pickerStyle);
    }

    private final void b(View view, boolean z, float f, Interpolator interpolator) {
        view.animate().cancel();
        if (z) {
            view.animate().alpha(f).setDuration(this.d).setInterpolator(interpolator).start();
        } else {
            view.setAlpha(f);
        }
    }

    public void a(int i, int i2) {
        wr wrVar = (wr) this.j.get(i);
        if (wrVar.a != i2) {
            wrVar.a = i2;
        }
    }

    public final int d() {
        ArrayList arrayList = this.j;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isActivated()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 23 && keyCode != 66) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 1) {
            performClick();
        }
        return true;
    }

    public final wr e(int i) {
        ArrayList arrayList = this.j;
        if (arrayList == null) {
            return null;
        }
        return (wr) arrayList.get(i);
    }

    public final void f(int i, wr wrVar) {
        this.j.set(i, wrVar);
        VerticalGridView verticalGridView = (VerticalGridView) this.i.get(i);
        ig igVar = verticalGridView.l;
        if (igVar != null) {
            igVar.a.a();
        }
        verticalGridView.ao(wrVar.a - wrVar.b);
    }

    public final void g(View view, boolean z, int i, boolean z2) {
        boolean z3 = true;
        if (i != this.k && hasFocus()) {
            z3 = false;
        }
        if (z) {
            if (z3) {
                b(view, z2, this.b, this.e);
                return;
            } else {
                b(view, z2, this.a, this.e);
                return;
            }
        }
        if (z3) {
            b(view, z2, this.c, this.e);
        } else {
            b(view, z2, 0.0f, this.e);
        }
    }

    public final void h(VerticalGridView verticalGridView) {
        ViewGroup.LayoutParams layoutParams = verticalGridView.getLayoutParams();
        float f = isActivated() ? this.f : 1.0f;
        layoutParams.height = (int) ((getContext().getResources().getDimensionPixelSize(R.dimen.picker_item_height) * f) + (verticalGridView.ab.I * (f - 1.0f)));
        verticalGridView.setLayoutParams(layoutParams);
    }

    final void i(int i) {
        VerticalGridView verticalGridView = (VerticalGridView) this.i.get(i);
        int iA = verticalGridView.a();
        int i2 = 0;
        while (i2 < verticalGridView.l.a()) {
            View viewM = verticalGridView.m.M(i2);
            if (viewM != null) {
                g(viewM, iA == i2, i, true);
            }
            i2++;
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2 = this.k;
        if (i2 < 0) {
            return false;
        }
        List list = this.i;
        if (i2 < list.size()) {
            return ((VerticalGridView) list.get(i2)).requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        int i = 0;
        while (true) {
            List list = this.i;
            if (i >= list.size()) {
                return;
            }
            if (((VerticalGridView) list.get(i)).hasFocus()) {
                if (this.k != i) {
                    this.k = i;
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        i(i2);
                    }
                }
                VerticalGridView verticalGridView = (VerticalGridView) list.get(i);
                if (hasFocus() && !verticalGridView.hasFocus()) {
                    verticalGridView.requestFocus();
                }
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void setActivated(boolean z) {
        if (z == isActivated()) {
            super.setActivated(z);
            return;
        }
        super.setActivated(z);
        boolean zHasFocus = hasFocus();
        int i = this.k;
        setDescendantFocusability(131072);
        if (!z && zHasFocus && isFocusable()) {
            requestFocus();
        }
        for (int i2 = 0; i2 < d(); i2++) {
            ((VerticalGridView) this.i.get(i2)).setFocusable(z);
        }
        for (int i3 = 0; i3 < d(); i3++) {
            h((VerticalGridView) this.i.get(i3));
        }
        boolean zIsActivated = isActivated();
        for (int i4 = 0; i4 < d(); i4++) {
            VerticalGridView verticalGridView = (VerticalGridView) this.i.get(i4);
            for (int i5 = 0; i5 < verticalGridView.getChildCount(); i5++) {
                verticalGridView.getChildAt(i5).setFocusable(zIsActivated);
            }
        }
        if (z && zHasFocus && i >= 0) {
            ((VerticalGridView) this.i.get(i)).requestFocus();
        }
        setDescendantFocusability(262144);
    }

    public wq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = new ArrayList();
        this.f = 3.0f;
        this.k = 0;
        this.l = new ArrayList();
        this.o = new wp(this);
        int[] iArr = ux.d;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        qv.k(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        this.m = typedArrayObtainStyledAttributes.getResourceId(0, R.layout.lb_picker_item);
        this.n = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        setEnabled(true);
        setDescendantFocusability(262144);
        this.b = 1.0f;
        this.a = 1.0f;
        this.c = 0.5f;
        this.d = 200;
        this.e = new DecelerateInterpolator(2.5f);
        this.h = (ViewGroup) ((ViewGroup) LayoutInflater.from(getContext()).inflate(R.layout.lb_picker, (ViewGroup) this, true)).findViewById(R.id.picker);
    }
}
