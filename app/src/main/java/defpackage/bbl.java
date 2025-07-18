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
import com.google.android.katniss.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bbl extends FrameLayout {
    private float a;
    private float b;
    private float c;
    private int d;
    private Interpolator e;
    private float f;
    private float g;
    private int h;
    public ViewGroup i;
    public final List j;
    public ArrayList k;
    public int l;
    public List m;
    public final aze n;
    private int o;

    public bbl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.pickerStyle);
    }

    private final void b() {
        for (int i = 0; i < getColumnsCount(); i++) {
            j((VerticalGridView) this.j.get(i));
        }
    }

    private final void c(View view, boolean z, float f, Interpolator interpolator) {
        view.animate().cancel();
        if (z) {
            view.animate().alpha(f).setDuration(this.d).setInterpolator(interpolator).start();
        } else {
            view.setAlpha(f);
        }
    }

    public void a(int i, int i2) {
        bbm bbmVar = (bbm) this.k.get(i);
        if (bbmVar.a != i2) {
            bbmVar.a = i2;
        }
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

    public final bbm g(int i) {
        ArrayList arrayList = this.k;
        if (arrayList == null) {
            return null;
        }
        return (bbm) arrayList.get(i);
    }

    public float getActivatedVisibleItemCount() {
        return this.f;
    }

    public int getColumnsCount() {
        ArrayList arrayList = this.k;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final int getPickerItemLayoutId() {
        return this.h;
    }

    public final int getPickerItemTextViewId() {
        return this.o;
    }

    public int getSelectedColumn() {
        return this.l;
    }

    @Deprecated
    public final CharSequence getSeparator() {
        return (CharSequence) this.m.get(0);
    }

    public final List getSeparators() {
        return this.m;
    }

    public float getVisibleItemCount() {
        return 1.0f;
    }

    public final void h(int i, bbm bbmVar) {
        this.k.set(i, bbmVar);
        VerticalGridView verticalGridView = (VerticalGridView) this.j.get(i);
        bbj bbjVar = (bbj) verticalGridView.getAdapter();
        if (bbjVar != null) {
            bbjVar.a.a();
        }
        verticalGridView.setSelectedPosition(bbmVar.a - bbmVar.b);
    }

    final void i(View view, boolean z, int i, boolean z2) {
        boolean z3 = true;
        if (i != this.l && hasFocus()) {
            z3 = false;
        }
        if (z) {
            if (z3) {
                c(view, z2, this.b, this.e);
                return;
            } else {
                c(view, z2, this.a, this.e);
                return;
            }
        }
        if (z3) {
            c(view, z2, this.c, this.e);
        } else {
            c(view, z2, 0.0f, this.e);
        }
    }

    public final void j(VerticalGridView verticalGridView) {
        ViewGroup.LayoutParams layoutParams = verticalGridView.getLayoutParams();
        float activatedVisibleItemCount = isActivated() ? getActivatedVisibleItemCount() : getVisibleItemCount();
        layoutParams.height = (int) ((getContext().getResources().getDimensionPixelSize(R.dimen.picker_item_height) * activatedVisibleItemCount) + (verticalGridView.getVerticalSpacing() * (activatedVisibleItemCount - 1.0f)));
        verticalGridView.setLayoutParams(layoutParams);
    }

    final void k(int i) {
        VerticalGridView verticalGridView = (VerticalGridView) this.j.get(i);
        int selectedPosition = verticalGridView.getSelectedPosition();
        int i2 = 0;
        while (i2 < verticalGridView.getAdapter().a()) {
            View viewT = verticalGridView.getLayoutManager().T(i2);
            if (viewT != null) {
                i(viewT, selectedPosition == i2, i, true);
            }
            i2++;
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int selectedColumn = getSelectedColumn();
        if (selectedColumn < 0) {
            return false;
        }
        List list = this.j;
        if (selectedColumn < list.size()) {
            return ((VerticalGridView) list.get(selectedColumn)).requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        int i = 0;
        while (true) {
            List list = this.j;
            if (i >= list.size()) {
                return;
            }
            if (((VerticalGridView) list.get(i)).hasFocus()) {
                setSelectedColumn(i);
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
        int selectedColumn = getSelectedColumn();
        setDescendantFocusability(131072);
        if (!z && zHasFocus && isFocusable()) {
            requestFocus();
        }
        for (int i = 0; i < getColumnsCount(); i++) {
            ((VerticalGridView) this.j.get(i)).setFocusable(z);
        }
        b();
        boolean zIsActivated = isActivated();
        for (int i2 = 0; i2 < getColumnsCount(); i2++) {
            VerticalGridView verticalGridView = (VerticalGridView) this.j.get(i2);
            for (int i3 = 0; i3 < verticalGridView.getChildCount(); i3++) {
                verticalGridView.getChildAt(i3).setFocusable(zIsActivated);
            }
        }
        if (z && zHasFocus && selectedColumn >= 0) {
            ((VerticalGridView) this.j.get(selectedColumn)).requestFocus();
        }
        setDescendantFocusability(262144);
    }

    public void setActivatedVisibleItemCount(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException();
        }
        if (this.f != f) {
            this.f = f;
            if (isActivated()) {
                b();
            }
        }
    }

    public final void setPickerItemLayoutId(int i) {
        this.h = i;
    }

    public final void setPickerItemTextViewId(int i) {
        this.o = i;
    }

    public void setSelectedColumn(int i) {
        if (this.l != i) {
            this.l = i;
            for (int i2 = 0; i2 < this.j.size(); i2++) {
                k(i2);
            }
        }
        VerticalGridView verticalGridView = (VerticalGridView) this.j.get(i);
        if (!hasFocus() || verticalGridView.hasFocus()) {
            return;
        }
        verticalGridView.requestFocus();
    }

    public void setVisibleItemCount(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException();
        }
        if (this.g != f) {
            this.g = f;
            if (isActivated()) {
                return;
            }
            b();
        }
    }

    public bbl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = new ArrayList();
        this.f = 3.0f;
        this.g = 1.0f;
        this.l = 0;
        this.m = new ArrayList();
        this.n = new bbi(this);
        int[] iArr = atk.g;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        ahj.m(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        this.h = typedArrayObtainStyledAttributes.getResourceId(0, R.layout.lb_picker_item);
        this.o = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        setEnabled(true);
        setDescendantFocusability(262144);
        this.b = 1.0f;
        this.a = 1.0f;
        this.c = 0.5f;
        this.d = 200;
        this.e = new DecelerateInterpolator(2.5f);
        this.i = (ViewGroup) ((ViewGroup) LayoutInflater.from(getContext()).inflate(R.layout.lb_picker, (ViewGroup) this, true)).findViewById(R.id.picker);
    }
}
