package defpackage;

import android.R;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyp {
    public static final cyp a;
    public static final cyp b;
    public static final cyp c;
    public static final cyp d;
    public static final cyp e;
    public static final cyp f;
    public static final cyp g;
    public static final cyp h;
    public static final cyp i;
    public static final cyp j;
    public static final cyp k;
    public static final cyp l;
    public static final cyp m;
    final Object n;
    public final int o;
    public final Class p;
    public final czc q;

    static {
        new cyp(1, (CharSequence) null);
        new cyp(2, (CharSequence) null);
        new cyp(4, (CharSequence) null);
        new cyp(8, (CharSequence) null);
        a = new cyp(16, (CharSequence) null);
        new cyp(32, (CharSequence) null);
        b = new cyp(64, (CharSequence) null);
        c = new cyp(128, (CharSequence) null);
        new cyp(256, cyv.class);
        new cyp(512, cyv.class);
        new cyp(1024, cyw.class);
        new cyp(RecyclerView.ItemAnimator.FLAG_MOVED, cyw.class);
        d = new cyp(RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT, (CharSequence) null);
        e = new cyp(8192, (CharSequence) null);
        new cyp(16384, (CharSequence) null);
        new cyp(32768, (CharSequence) null);
        new cyp(65536, (CharSequence) null);
        new cyp(131072, cza.class);
        new cyp(262144, (CharSequence) null);
        new cyp(524288, (CharSequence) null);
        f = new cyp(1048576, (CharSequence) null);
        new cyp(2097152, czb.class);
        new cyp(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        g = new cyp(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, cyy.class);
        h = new cyp(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        i = new cyp(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        j = new cyp(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        k = new cyp(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new cyp(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new cyp(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new cyp(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new cyp(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new cyp(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        l = new cyp(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, cyz.class);
        new cyp(Build.VERSION.SDK_INT >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, cyx.class);
        new cyp(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
        new cyp(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        new cyp(Build.VERSION.SDK_INT >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new cyp(Build.VERSION.SDK_INT >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new cyp(Build.VERSION.SDK_INT >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new cyp(Build.VERSION.SDK_INT >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new cyp(Build.VERSION.SDK_INT >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new cyp(Build.VERSION.SDK_INT >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        m = new cyp(Build.VERSION.SDK_INT >= 34 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public cyp(int i2, CharSequence charSequence) {
        this(null, i2, charSequence, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.n).getId();
    }

    public final CharSequence b() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.n).getLabel();
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof cyp) && this.n.equals(((cyp) obj).n);
    }

    public final int hashCode() {
        return this.n.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strG = cyq.g(this.o);
        if (strG.equals("ACTION_UNKNOWN") && b() != null) {
            strG = b().toString();
        }
        sb.append(strG);
        return sb.toString();
    }

    private cyp(int i2, Class cls) {
        this(null, i2, null, null, cls);
    }

    public cyp(Object obj, int i2, CharSequence charSequence, czc czcVar, Class cls) {
        this.o = i2;
        this.q = czcVar;
        this.n = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence) : obj;
        this.p = cls;
    }
}
