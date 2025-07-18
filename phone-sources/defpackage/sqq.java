package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActivityChooserView;
import android.support.v7.widget.PopupMenu;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.videos.R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class sqq extends LinearLayout {
    public static final Object a = new Object();
    public tac b;
    public tag c;
    public PopupMenu d;
    private int e;
    private final List f;
    private final List g;
    private final Comparator h;
    private Integer[] i;
    private tae j;
    private int k;
    private boolean l;
    private final int m;
    private boolean n;
    private MaterialButton o;
    private final Map p;
    private final Map q;
    private final List r;
    private final List s;
    private final zft t;

    public sqq(Context context) {
        this(context, null);
    }

    static final LinearLayout.LayoutParams h(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new sqp(layoutParams.width, layoutParams.height);
    }

    protected static final sqp i(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new sqp((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new sqp((ViewGroup.MarginLayoutParams) layoutParams) : new sqp(layoutParams);
    }

    private final int j() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (o(i)) {
                return i;
            }
        }
        return -1;
    }

    private final int k() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (o(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private final int l(boolean z, Button button, int i, int i2) {
        int i3;
        int i4;
        measureChild(button, i, i2);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        int measuredWidth = z ? button.getMeasuredWidth() : button.getMeasuredHeight();
        if (z) {
            i3 = layoutParams.leftMargin;
            i4 = layoutParams.rightMargin;
        } else {
            i3 = layoutParams.topMargin;
            i4 = layoutParams.bottomMargin;
        }
        int i5 = i3 + i4;
        if (measuredWidth == 0) {
            measuredWidth = z ? button.getMinimumWidth() : button.getMinimumHeight();
        }
        return measuredWidth + i5;
    }

    private final void m() {
        int iMin;
        int iJ = j();
        if (iJ == -1) {
            return;
        }
        for (int i = iJ + 1; i < getChildCount(); i++) {
            MaterialButton materialButtonA = a(i);
            MaterialButton materialButtonA2 = a(i - 1);
            if (this.k <= 0) {
                iMin = Math.min(materialButtonA.f(), materialButtonA2.f());
                materialButtonA.q(true);
                materialButtonA2.q(true);
            } else {
                materialButtonA.q(false);
                materialButtonA2.q(false);
                iMin = 0;
            }
            LinearLayout.LayoutParams layoutParamsH = h(materialButtonA);
            if (getOrientation() == 0) {
                layoutParamsH.setMarginEnd(0);
                layoutParamsH.setMarginStart(this.k - iMin);
                layoutParamsH.topMargin = 0;
            } else {
                layoutParamsH.bottomMargin = 0;
                layoutParamsH.topMargin = this.k - iMin;
                layoutParamsH.setMarginStart(0);
            }
            materialButtonA.setLayoutParams(layoutParamsH);
        }
        if (getChildCount() == 0 || iJ == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParamsH2 = h(a(iJ));
        if (getOrientation() == 1) {
            layoutParamsH2.topMargin = 0;
            layoutParamsH2.bottomMargin = 0;
        } else {
            layoutParamsH2.setMarginEnd(0);
            layoutParamsH2.setMarginStart(0);
            layoutParamsH2.leftMargin = 0;
            layoutParamsH2.rightMargin = 0;
        }
    }

    private final void n() {
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton materialButtonA = a(i);
            LinearLayout.LayoutParams layoutParams = materialButtonA.l;
            if (layoutParams != null) {
                materialButtonA.setLayoutParams(layoutParams);
                materialButtonA.l = null;
                materialButtonA.k = -1.0f;
            }
        }
    }

    private boolean o(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final MaterialButton a(int i) {
        return (MaterialButton) getChildAt(i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        n();
        this.l = true;
        int iIndexOfChild = indexOfChild(this.o);
        if (iIndexOfChild < 0 || i != -1) {
            super.addView(view, i, layoutParams);
        } else {
            super.addView(view, iIndexOfChild, layoutParams);
        }
        MaterialButton materialButton = (MaterialButton) view;
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
        materialButton.t = this.t;
        List list = this.f;
        if (!materialButton.u()) {
            throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        }
        sqr sqrVar = materialButton.e;
        list.add(sqrVar.b);
        List list2 = this.g;
        if (!materialButton.u()) {
            throw new IllegalStateException("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        }
        list2.add(sqrVar.c);
        materialButton.setEnabled(isEnabled());
    }

    public final MaterialButton b(int i) {
        int childCount = getChildCount();
        do {
            i++;
            if (i >= childCount) {
                return null;
            }
        } while (!o(i));
        return a(i);
    }

    public final MaterialButton c(int i) {
        do {
            i--;
            if (i < 0) {
                return null;
            }
        } while (!o(i));
        return a(i);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof sqp;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final sqp generateLayoutParams(AttributeSet attributeSet) {
        return new sqp(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.h);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(a(i), Integer.valueOf(i));
        }
        this.i = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    final void e() {
        int i;
        if (!(this.b == null && this.j == null) && this.l) {
            this.l = false;
            int childCount = getChildCount();
            int iJ = j();
            int iK = k();
            int i2 = 0;
            while (i2 < childCount) {
                MaterialButton materialButtonA = a(i2);
                if (materialButtonA.getVisibility() != 8) {
                    tae taeVar = this.j;
                    if (taeVar == null || (i2 != iJ && i2 != iK)) {
                        taeVar = (tae) this.g.get(i2);
                    }
                    tad tadVar = taeVar == null ? new tad((szq) this.f.get(i2)) : new tad(taeVar);
                    int orientation = getOrientation();
                    boolean zP = sil.p(this);
                    if (orientation == 0) {
                        i = i2 == iJ ? 5 : 0;
                        if (i2 == iK) {
                            i |= 10;
                        }
                        if (zP) {
                            int i3 = i & 5;
                            i = ((i & 10) >> 1) | (i3 + i3);
                        }
                    } else {
                        i = i2 == iJ ? 3 : 0;
                        if (i2 == iK) {
                            i |= 12;
                        }
                    }
                    tac tacVar = this.b;
                    int i4 = ~i;
                    if (tad.c(i4, 1)) {
                        tadVar.e = tacVar;
                    }
                    if (tad.c(i4, 2)) {
                        tadVar.f = tacVar;
                    }
                    if (tad.c(i4, 4)) {
                        tadVar.g = tacVar;
                    }
                    if (tad.c(i4, 8)) {
                        tadVar.h = tacVar;
                    }
                    tae taeVarA = tadVar.a();
                    if (!taeVarA.c()) {
                        materialButtonA.p(taeVarA.d());
                    } else {
                        if (!materialButtonA.u()) {
                            throw new IllegalStateException("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
                        }
                        sqr sqrVar = materialButtonA.e;
                        if (sqrVar.d == null && taeVarA.c()) {
                            sqrVar.c(materialButtonA.g());
                        }
                        sqrVar.e(taeVarA);
                    }
                }
                i2++;
            }
        }
    }

    public final void f() {
        for (Map.Entry entry : this.q.entrySet()) {
            Button button = (Button) entry.getKey();
            MenuItem menuItem = (MenuItem) entry.getValue();
            if (entry.getKey() instanceof MaterialButton) {
                MaterialButton materialButton = (MaterialButton) button;
                menuItem.setCheckable(materialButton.t());
                menuItem.setChecked(materialButton.j);
            }
            menuItem.setEnabled(button.isEnabled());
        }
    }

    public boolean g() {
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new sqp(-2, -2);
    }

    @Override // android.view.ViewGroup
    protected final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.i;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i2;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            n();
            int iJ = j();
            int iK = k();
            if (iJ == -1 || this.c == null || getChildCount() == 0) {
                return;
            }
            int iMin = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            for (int i5 = iJ; i5 <= iK; i5++) {
                if (o(i5)) {
                    if (o(i5) && this.c != null) {
                        MaterialButton materialButtonA = a(i5);
                        tag tagVar = this.c;
                        int width = materialButtonA.getWidth();
                        int iMax = -width;
                        for (int i6 = 0; i6 < tagVar.a; i6++) {
                            float f = iMax;
                            taf tafVar = (taf) tagVar.d[i6].a;
                            iMax = (int) (tafVar.b == 2 ? Math.max(f, tafVar.a) : Math.max(f, width * tafVar.a));
                        }
                        int iMax2 = Math.max(0, iMax);
                        MaterialButton materialButtonC = c(i5);
                        int i7 = materialButtonC == null ? 0 : materialButtonC.p;
                        MaterialButton materialButtonB = b(i5);
                        iMin = Math.min(iMax2, i7 + (materialButtonB != null ? materialButtonB.p : 0));
                    }
                    if (i5 != iJ && i5 != iK) {
                        iMin /= 2;
                    }
                    iMin = Math.min(iMin, iMin);
                }
            }
            int i8 = iJ;
            while (i8 <= iK) {
                if (o(i8)) {
                    MaterialButton materialButtonA2 = a(i8);
                    tag tagVar2 = this.c;
                    if (materialButtonA2.q != tagVar2) {
                        materialButtonA2.q = tagVar2;
                        materialButtonA2.i(true);
                    }
                    MaterialButton materialButtonA3 = a(i8);
                    int i9 = (i8 == iJ || i8 == iK) ? iMin : iMin + iMin;
                    if (materialButtonA3.r != i9) {
                        materialButtonA3.r = i9;
                        materialButtonA3.i(true);
                    }
                }
                i8++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f8  */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sqq.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).t = null;
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f.remove(iIndexOfChild);
            this.g.remove(iIndexOfChild);
        }
        this.l = true;
        e();
        n();
        m();
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            a(i).setEnabled(z);
        }
    }

    public sqq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonGroupStyle);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* synthetic */ LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new sqp(-2, -2);
    }

    public sqq(Context context, AttributeSet attributeSet, int i) {
        super(tde.a(context, attributeSet, i, R.style.Widget_Material3_MaterialButtonGroup), attributeSet, i);
        this.e = 0;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.t = new zft(this, null);
        this.h = new acs(this, 19, null);
        this.l = true;
        this.p = new HashMap();
        this.q = new HashMap();
        this.r = new ArrayList();
        this.s = new ArrayList();
        Context context2 = getContext();
        TypedArray typedArrayA = suy.a(context2, attributeSet, squ.b, i, R.style.Widget_Material3_MaterialButtonGroup, new int[0]);
        if (typedArrayA.hasValue(2)) {
            this.c = tag.b(context2, typedArrayA);
        }
        if (typedArrayA.hasValue(6)) {
            tae taeVarB = tae.b(context2, typedArrayA, 6);
            this.j = taeVarB;
            if (taeVarB == null) {
                this.j = new tad(new szq(szq.b(context2, typedArrayA.getResourceId(6, 0), typedArrayA.getResourceId(7, 0)))).a();
            }
        }
        if (typedArrayA.hasValue(3)) {
            this.b = tac.d(context2, typedArrayA, new szb(0.0f));
        }
        this.k = typedArrayA.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayA.getBoolean(0, true));
        int i2 = typedArrayA.getInt(5, 0);
        if (this.e != i2) {
            this.e = i2;
            requestLayout();
            invalidate();
        }
        this.m = getResources().getDimensionPixelOffset(R.dimen.m3_btn_group_overflow_item_icon_horizontal_padding);
        if (g()) {
            Drawable drawable = typedArrayA.getDrawable(4);
            MaterialButton materialButton = (MaterialButton) LayoutInflater.from(context2).inflate(R.layout.m3_button_group_overflow_button, (ViewGroup) this, false);
            this.o = materialButton;
            materialButton.setTag(a);
            this.o.m(drawable);
            if (this.o.getContentDescription() == null) {
                this.o.setContentDescription(getResources().getString(R.string.mtrl_button_overflow_icon_content_description));
            }
            this.o.setVisibility(8);
            PopupMenu popupMenu = new PopupMenu(getContext(), this.o, 17, 0, sim.e(this, R.attr.materialButtonGroupPopupMenuStyle).data);
            this.d = popupMenu;
            popupMenu.setForceShowIcon(true);
            this.o.setOnClickListener(new phn(this, 17));
            addView(this.o);
            this.n = true;
        }
        typedArrayA.recycle();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }
}
