package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.bind.widget.BindingFrameLayout;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oru extends osk {
    public boolean a;
    public boolean b;
    public final ViewGroup c;
    public boolean d;
    private final BindingFrameLayout f;

    public oru(BindingFrameLayout bindingFrameLayout) {
        super(null, null);
        this.f = bindingFrameLayout;
        a.ab(true);
        a.ab(true);
        this.c = bindingFrameLayout;
    }

    public static void b(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            }
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                if (childAt instanceof BindingFrameLayout) {
                    ((BindingFrameLayout) childAt).a.d = true;
                }
                b((ViewGroup) childAt);
            }
        }
    }

    public static void c(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            KeyEvent.Callback childAt = viewGroup.getChildAt(i);
            boolean z = childAt instanceof BindingFrameLayout;
            if (z) {
                BindingFrameLayout bindingFrameLayout = (BindingFrameLayout) childAt;
                if (bindingFrameLayout.a.d) {
                    bindingFrameLayout.b();
                }
            } else if (childAt instanceof orr) {
                ((orr) childAt).a();
            }
            if ((childAt instanceof ViewGroup) && !z) {
                c((ViewGroup) childAt);
            }
        }
    }

    public final void a() {
        this.b = false;
    }

    public final String toString() {
        return String.format(Locale.US, "View type: %s, hasData: %b, registered: %b, attached: %b,temporarilyDetached: %b, clearDataOnDetach: %b", this.f.getClass().getSimpleName(), false, false, Boolean.valueOf(this.a), Boolean.valueOf(this.b), true);
    }
}
