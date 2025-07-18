package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatAutoCompleteTextView;
import android.support.v7.widget.ListPopupWindow;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.videos.R;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tct extends AppCompatAutoCompleteTextView {
    public final ListPopupWindow a;
    public final float b;
    public ColorStateList c;
    public final int d;
    public final ColorStateList e;
    private final AccessibilityManager f;
    private final Rect g;
    private final int h;

    public tct(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(tde.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet, R.attr.autoCompleteTextViewStyle);
        this.g = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayA = suy.a(context2, attributeSet, tcv.a, R.attr.autoCompleteTextViewStyle, 2132085019, new int[0]);
        if (typedArrayA.hasValue(0) && typedArrayA.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        int resourceId = typedArrayA.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.h = resourceId;
        this.b = typedArrayA.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (typedArrayA.hasValue(2)) {
            this.c = ColorStateList.valueOf(typedArrayA.getColor(2, 0));
        }
        this.d = typedArrayA.getColor(4, 0);
        this.e = sin.h(context2, typedArrayA, 5);
        this.f = (AccessibilityManager) context2.getSystemService("accessibility");
        ListPopupWindow listPopupWindow = new ListPopupWindow(context2);
        this.a = listPopupWindow;
        listPopupWindow.setModal(true);
        listPopupWindow.setAnchorView(this);
        listPopupWindow.setInputMethodMode(2);
        listPopupWindow.setAdapter(getAdapter());
        listPopupWindow.setOnItemClickListener(new iuj(this, 3));
        if (typedArrayA.hasValue(6)) {
            setAdapter(new tcs(this, getContext(), resourceId, getResources().getStringArray(typedArrayA.getResourceId(6, 0))));
        }
        typedArrayA.recycle();
    }

    private final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private final boolean c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f;
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
            this.a.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    @Override // android.widget.TextView
    public final CharSequence getHint() {
        TextInputLayout textInputLayoutB = b();
        return (textInputLayoutB == null || !textInputLayoutB.l) ? super.getHint() : textInputLayoutB.d();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null && textInputLayoutB.l && super.getHint() == null && sil.q()) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutB = b();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutB != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                ListPopupWindow listPopupWindow = this.a;
                int iMin = Math.min(adapter.getCount(), Math.max(0, listPopupWindow.getSelectedItemPosition()) + 15);
                int iMax = Math.max(0, iMin - 15);
                View view = null;
                int iMax2 = 0;
                while (iMax < iMin) {
                    int itemViewType = adapter.getItemViewType(iMax);
                    int i3 = itemViewType != measuredWidth2 ? itemViewType : measuredWidth2;
                    if (itemViewType != measuredWidth2) {
                        view = null;
                    }
                    view = adapter.getView(iMax, view, textInputLayoutB);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax2 = Math.max(iMax2, view.getMeasuredWidth());
                    iMax++;
                    measuredWidth2 = i3;
                }
                Drawable background = listPopupWindow.getBackground();
                if (background != null) {
                    Rect rect = this.g;
                    background.getPadding(rect);
                    iMax2 += rect.left + rect.right;
                }
                measuredWidth2 = iMax2 + textInputLayoutB.b.d.getMeasuredWidth();
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i)), getMeasuredHeight());
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
        this.a.setAdapter(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        ListPopupWindow listPopupWindow = this.a;
        if (listPopupWindow != null) {
            listPopupWindow.setBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.a.setOnItemSelectedListener(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public final void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null) {
            textInputLayoutB.u();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (c()) {
            this.a.show();
        } else {
            super.showDropDown();
        }
    }
}
