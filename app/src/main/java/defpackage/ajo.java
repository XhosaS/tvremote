package defpackage;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ajo {
    public static final ajo a;
    public static final ajo b;
    public static final ajo c;
    public static final ajo d;
    public static final ajo e;
    public static final ajo f;
    public static final ajo g;
    public static final ajo h;
    public static final ajo i;
    public static final ajo j;
    public static final ajo k;
    final Object l;
    public final Class m;
    public final akd n;
    private final int o;

    static {
        new ajo(null, 1, null, null, null);
        new ajo(null, 2, null, null, null);
        new ajo(null, 4, null, null, null);
        new ajo(null, 8, null, null, null);
        a = new ajo(null, 16, null, null, null);
        b = new ajo(null, 32, null, null, null);
        new ajo(null, 64, null, null, null);
        new ajo(null, 128, null, null, null);
        new ajo(null, 256, null, null, ajw.class);
        new ajo(null, 512, null, null, ajw.class);
        new ajo(null, 1024, null, null, ajx.class);
        new ajo(null, 2048, null, null, ajx.class);
        c = new ajo(null, 4096, null, null, null);
        d = new ajo(null, 8192, null, null, null);
        new ajo(null, 16384, null, null, null);
        new ajo(null, 32768, null, null, null);
        new ajo(null, 65536, null, null, null);
        new ajo(null, 131072, null, null, akb.class);
        new ajo(null, 262144, null, null, null);
        new ajo(null, 524288, null, null, null);
        e = new ajo(null, 1048576, null, null, null);
        new ajo(null, 2097152, null, null, akc.class);
        new ajo(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        f = new ajo(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, ajz.class);
        g = new ajo(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        h = new ajo(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        i = new ajo(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        j = new ajo(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new ajo(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new ajo(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new ajo(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new ajo(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new ajo(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new ajo(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, aka.class);
        new ajo(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, ajy.class);
        new ajo(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, R.id.accessibilityActionShowTooltip, null, null, null);
        new ajo(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, R.id.accessibilityActionHideTooltip, null, null, null);
        new ajo(Build.VERSION.SDK_INT >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new ajo(Build.VERSION.SDK_INT >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new ajo(Build.VERSION.SDK_INT >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new ajo(Build.VERSION.SDK_INT >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new ajo(Build.VERSION.SDK_INT >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new ajo(Build.VERSION.SDK_INT >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        k = new ajo(Build.VERSION.SDK_INT >= 34 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public ajo(Object obj, int i2, CharSequence charSequence, akd akdVar, Class cls) {
        this.o = i2;
        this.n = akdVar;
        this.l = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence) : obj;
        this.m = cls;
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.l).getId();
    }

    public final CharSequence b() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.l).getLabel();
    }

    public final ajo c(akd akdVar) {
        return new ajo(null, this.o, null, akdVar, this.m);
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof ajo) && this.l.equals(((ajo) obj).l);
    }

    public final int hashCode() {
        return this.l.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strB = ajr.b(this.o);
        if (strB.equals("ACTION_UNKNOWN") && b() != null) {
            strB = b().toString();
        }
        sb.append(strB);
        return sb.toString();
    }
}
