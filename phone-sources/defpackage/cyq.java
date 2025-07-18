package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.videos.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyq {
    public static int a;
    public final AccessibilityNodeInfo b;
    public int c = -1;
    private int d = -1;

    public cyq(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.b = accessibilityNodeInfo;
    }

    public static ClickableSpan[] ag(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public static final SparseArray ah(View view) {
        return (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
    }

    public static cyq b() {
        return new cyq(AccessibilityNodeInfo.obtain());
    }

    static String g(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case RecyclerView.ItemAnimator.FLAG_MOVED /* 2048 */:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT /* 4096 */:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case android.R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case android.R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i) {
                    case android.R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case android.R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case android.R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case android.R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case android.R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case android.R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case android.R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case android.R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case android.R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case android.R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case android.R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case android.R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case android.R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case android.R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case android.R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i) {
                                    case android.R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case android.R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case android.R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case android.R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public final void A(CharSequence charSequence) {
        this.b.setError(charSequence);
    }

    public final void B(boolean z) {
        this.b.setFocusable(z);
    }

    public final void C(boolean z) {
        this.b.setFocused(z);
    }

    public final void D(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.b.setHeading(z);
        } else {
            o(2, z);
        }
    }

    public final void E(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.b.setHintText(charSequence);
        } else {
            this.b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public final void F(View view) {
        this.b.setLabelFor(view);
    }

    public final void G(boolean z) {
        this.b.setLongClickable(z);
    }

    public final void H(int i) {
        this.b.setMaxTextLength(i);
    }

    public final void I(int i) {
        this.b.setMovementGranularities(i);
    }

    public final void J(CharSequence charSequence) {
        this.b.setPackageName(charSequence);
    }

    public final void K(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.b.setPaneTitle(charSequence);
        } else {
            this.b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public final void L(View view) {
        this.c = -1;
        this.b.setParent(view);
    }

    public final void M(View view, int i) {
        this.c = i;
        this.b.setParent(view, i);
    }

    public final void N(CharSequence charSequence) {
        this.b.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public final void O(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.b.setScreenReaderFocusable(z);
        } else {
            o(1, z);
        }
    }

    public final void P(boolean z) {
        this.b.setScrollable(z);
    }

    public final void Q(boolean z) {
        this.b.setSelected(z);
    }

    public final void R(View view, int i) {
        this.d = i;
        this.b.setSource(view, i);
    }

    public final void S(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.b.setStateDescription(charSequence);
        } else {
            this.b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public final void T(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public final void U(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.b.setTooltipText(charSequence);
        } else {
            this.b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY", charSequence);
        }
    }

    public final void V(View view) {
        this.b.setTraversalAfter(view);
    }

    public final void W(View view) {
        this.b.setTraversalBefore(view);
    }

    public final void X(View view, int i) {
        this.b.setTraversalBefore(view, i);
    }

    public final void Y(boolean z) {
        this.b.setVisibleToUser(z);
    }

    public final boolean Z(int i) {
        Bundle bundleA = a();
        return bundleA != null && (bundleA.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    public final Bundle a() {
        return this.b.getExtras();
    }

    public final boolean aa() {
        return this.b.isClickable();
    }

    public final boolean ab() {
        return this.b.isEnabled();
    }

    public final boolean ac() {
        return this.b.isFocusable();
    }

    public final boolean ad() {
        return this.b.isFocused();
    }

    public final boolean ae() {
        return this.b.isPassword();
    }

    public final boolean af() {
        return this.b.isScrollable();
    }

    public final void ai(cyp cypVar) {
        this.b.removeAction((AccessibilityNodeInfo.AccessibilityAction) cypVar.n);
    }

    public final void aj() {
        o(67108864, true);
    }

    public final void ak(cvw cvwVar) {
        this.b.setRangeInfo((AccessibilityNodeInfo.RangeInfo) cvwVar.a);
    }

    public final CharSequence c() {
        return this.b.getClassName();
    }

    public final CharSequence d() {
        return this.b.getContentDescription();
    }

    public final CharSequence e() {
        if (h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty()) {
            return this.b.getText();
        }
        List listH = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List listH2 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List listH3 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List listH4 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        AccessibilityNodeInfo accessibilityNodeInfo = this.b;
        SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i = 0; i < listH.size(); i++) {
            spannableString.setSpan(new cyo(((Integer) listH4.get(i)).intValue(), this, a().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) listH.get(i)).intValue(), ((Integer) listH2.get(i)).intValue(), ((Integer) listH3.get(i)).intValue());
        }
        return spannableString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof cyq)) {
            return false;
        }
        cyq cyqVar = (cyq) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.b;
        if (accessibilityNodeInfo == null) {
            if (cyqVar.b != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(cyqVar.b)) {
            return false;
        }
        return this.d == cyqVar.d && this.c == cyqVar.c;
    }

    public final CharSequence f() {
        return Build.VERSION.SDK_INT >= 28 ? this.b.getTooltipText() : this.b.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }

    public final List h(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.b;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.b;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final void i(int i) {
        this.b.addAction(i);
    }

    public final void j(cyp cypVar) {
        this.b.addAction((AccessibilityNodeInfo.AccessibilityAction) cypVar.n);
    }

    public final void k(View view, int i) {
        this.b.addChild(view, i);
    }

    @Deprecated
    public final void l(Rect rect) {
        this.b.getBoundsInParent(rect);
    }

    public final void m(Rect rect) {
        this.b.getBoundsInScreen(rect);
    }

    public final void n(boolean z) {
        this.b.setAccessibilityFocused(z);
    }

    public final void o(int i, boolean z) {
        Bundle bundleA = a();
        if (bundleA != null) {
            int i2 = bundleA.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (true != z) {
                i = 0;
            }
            bundleA.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    @Deprecated
    public final void p(Rect rect) {
        this.b.setBoundsInParent(rect);
    }

    public final void q(Rect rect) {
        this.b.setBoundsInScreen(rect);
    }

    public final void r(boolean z) {
        this.b.setCheckable(z);
    }

    @Deprecated
    public final void s(boolean z) {
        this.b.setChecked(z);
    }

    public final void t(CharSequence charSequence) {
        this.b.setClassName(charSequence);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        l(rect);
        rect.toString();
        sb.append("; boundsInParent: ".concat(rect.toString()));
        m(rect);
        rect.toString();
        sb.append("; boundsInScreen: ".concat(rect.toString()));
        if (Build.VERSION.SDK_INT >= 34) {
            this.b.getBoundsInWindow(rect);
        } else {
            Rect rect2 = (Rect) this.b.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
        rect.toString();
        sb.append("; boundsInWindow: ".concat(rect.toString()));
        sb.append("; packageName: ");
        AccessibilityNodeInfo accessibilityNodeInfo = this.b;
        sb.append(accessibilityNodeInfo.getPackageName());
        sb.append("; className: ");
        sb.append(c());
        sb.append("; text: ");
        sb.append(e());
        sb.append("; error: ");
        sb.append(accessibilityNodeInfo.getError());
        sb.append("; maxTextLength: ");
        sb.append(accessibilityNodeInfo.getMaxTextLength());
        sb.append("; stateDescription: ");
        sb.append(Build.VERSION.SDK_INT >= 30 ? accessibilityNodeInfo.getStateDescription() : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"));
        sb.append("; contentDescription: ");
        sb.append(d());
        sb.append("; supplementalDescription: ");
        sb.append(Build.VERSION.SDK_INT >= 36 ? accessibilityNodeInfo.getSupplementalDescription() : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY"));
        sb.append("; tooltipText: ");
        sb.append(f());
        sb.append("; viewIdResName: ");
        sb.append(accessibilityNodeInfo.getViewIdResourceName());
        sb.append("; uniqueId: ");
        sb.append(Build.VERSION.SDK_INT >= 33 ? accessibilityNodeInfo.getUniqueId() : accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"));
        sb.append("; checkable: ");
        sb.append(accessibilityNodeInfo.isCheckable());
        sb.append("; checked: ");
        int checked = Build.VERSION.SDK_INT >= 36 ? accessibilityNodeInfo.getChecked() : accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", accessibilityNodeInfo.isChecked() ? 1 : 0);
        String str = "PARTIAL";
        sb.append(checked == 1 ? "TRUE" : checked == 2 ? "PARTIAL" : "FALSE");
        sb.append("; fieldRequired: ");
        sb.append(Build.VERSION.SDK_INT >= 36 ? accessibilityNodeInfo.isFieldRequired() : accessibilityNodeInfo.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY"));
        sb.append("; focusable: ");
        sb.append(ac());
        sb.append("; focused: ");
        sb.append(ad());
        sb.append("; selected: ");
        sb.append(accessibilityNodeInfo.isSelected());
        sb.append("; clickable: ");
        sb.append(aa());
        sb.append("; longClickable: ");
        sb.append(accessibilityNodeInfo.isLongClickable());
        sb.append("; contextClickable: ");
        sb.append(accessibilityNodeInfo.isContextClickable());
        sb.append("; expandedState: ");
        int expandedState = Build.VERSION.SDK_INT >= 36 ? accessibilityNodeInfo.getExpandedState() : accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", 0);
        if (expandedState == 0) {
            str = "UNDEFINED";
        } else if (expandedState == 1) {
            str = "COLLAPSED";
        } else if (expandedState != 2) {
            str = expandedState != 3 ? "UNKNOWN" : "FULL";
        }
        sb.append(str);
        sb.append("; enabled: ");
        sb.append(ab());
        sb.append("; password: ");
        sb.append(ae());
        sb.append("; scrollable: " + af());
        sb.append("; containerTitle: ");
        sb.append(Build.VERSION.SDK_INT >= 34 ? accessibilityNodeInfo.getContainerTitle() : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY"));
        sb.append("; granularScrollingSupported: ");
        sb.append(Z(67108864));
        sb.append("; importantForAccessibility: ");
        sb.append(accessibilityNodeInfo.isImportantForAccessibility());
        sb.append("; visible: ");
        sb.append(accessibilityNodeInfo.isVisibleToUser());
        sb.append("; isTextSelectable: ");
        sb.append(Build.VERSION.SDK_INT >= 33 ? accessibilityNodeInfo.isTextSelectable() : Z(8388608));
        sb.append("; accessibilityDataSensitive: ");
        sb.append(Build.VERSION.SDK_INT >= 34 ? accessibilityNodeInfo.isAccessibilityDataSensitive() : Z(64));
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new cyp(actionList.get(i), 0, null, null, null));
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            cyp cypVar = (cyp) arrayList.get(i2);
            String strG = g(cypVar.a());
            if (strG.equals("ACTION_UNKNOWN") && cypVar.b() != null) {
                strG = cypVar.b().toString();
            }
            sb.append(strG);
            if (i2 != arrayList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final void u(boolean z) {
        this.b.setClickable(z);
    }

    public final void v(Object obj) {
        this.b.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) ((cxe) obj).a);
    }

    public final void w(Object obj) {
        this.b.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) ((cxe) obj).a);
    }

    public final void x(CharSequence charSequence) {
        this.b.setContentDescription(charSequence);
    }

    public final void y(boolean z) {
        this.b.setDismissable(z);
    }

    public final void z(boolean z) {
        this.b.setEnabled(z);
    }
}
