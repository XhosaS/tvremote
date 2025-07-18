package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.google.android.katniss.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class vcw extends ld {
    public final oz a;
    public int b;
    public final ColorStateList c;
    private final AccessibilityManager d;
    private final Rect e;
    private final int f;
    private final float g;
    private ColorStateList h;

    public vcw(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(vdc.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet, R.attr.autoCompleteTextViewStyle);
        this.e = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayC = vam.c(context2, attributeSet, vcx.a, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView);
        if (typedArrayC.hasValue(0) && typedArrayC.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f = typedArrayC.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.g = typedArrayC.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (typedArrayC.hasValue(2)) {
            this.h = ColorStateList.valueOf(typedArrayC.getColor(2, 0));
        }
        this.b = typedArrayC.getColor(4, 0);
        this.c = vba.a(context2, typedArrayC, 5);
        this.d = (AccessibilityManager) context2.getSystemService("accessibility");
        oz ozVar = new oz(context2, null, R.attr.listPopupWindowStyle);
        this.a = ozVar;
        ozVar.x();
        ozVar.k = this;
        ozVar.w();
        ozVar.e(getAdapter());
        ozVar.l = new vcu(this);
        if (typedArrayC.hasValue(6)) {
            setSimpleItems(typedArrayC.getResourceId(6, 0));
        }
        typedArrayC.recycle();
    }

    private final vcz b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof vcz) {
                return (vcz) parent;
            }
        }
        return null;
    }

    private final boolean c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.d;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null) {
            return false;
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (c()) {
            this.a.f();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.h;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        if (b() == null) {
            return super.getHint();
        }
        throw null;
    }

    public float getPopupElevation() {
        return this.g;
    }

    public int getSimpleItemSelectedColor() {
        return this.b;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.c;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (b() != null) {
            throw null;
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.f();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            vcz vczVarB = b();
            int i3 = 0;
            if (adapter == null || vczVarB == null) {
                setMeasuredDimension(Math.min(Math.max(measuredWidth, 0), View.MeasureSpec.getSize(i)), getMeasuredHeight());
                return;
            }
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
            oz ozVar = this.a;
            int iMin = Math.min(adapter.getCount(), Math.max(0, ozVar.o()) + 15);
            int iMax = Math.max(0, iMin - 15);
            View view = null;
            int iMax2 = 0;
            while (iMax < iMin) {
                int itemViewType = adapter.getItemViewType(iMax);
                int i4 = itemViewType != i3 ? itemViewType : i3;
                if (itemViewType != i3) {
                    view = null;
                }
                view = adapter.getView(iMax, view, vczVarB);
                if (view.getLayoutParams() == null) {
                    view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                }
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                iMax2 = Math.max(iMax2, view.getMeasuredWidth());
                iMax++;
                i3 = i4;
            }
            Drawable background = ozVar.q.getBackground();
            if (background == null) {
                throw null;
            }
            Rect rect = this.e;
            background.getPadding(rect);
            int i5 = rect.left;
            int i6 = rect.right;
            throw null;
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        if (c()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setAdapter(ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
        this.a.e(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        oz ozVar = this.a;
        if (ozVar != null) {
            ozVar.q.setBackgroundDrawable(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        this.h = ColorStateList.valueOf(i);
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof vbq) {
            ((vbq) dropDownBackground).l(this.h);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.a.m = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        if (b() != null) {
            throw null;
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.b = i;
        if (getAdapter() instanceof vcv) {
            ((vcv) getAdapter()).a();
        }
    }

    public void setSimpleItems(int i) throws Resources.NotFoundException {
        setAdapter(new vcv(this, getContext(), this.f, getResources().getStringArray(i)));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (c()) {
            this.a.s();
        } else {
            super.showDropDown();
        }
    }
}
