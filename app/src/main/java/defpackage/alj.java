package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
class alj extends aju {
    final /* synthetic */ alk b;

    public alj(alk alkVar) {
        this.b = alkVar;
    }

    @Override // defpackage.aju
    public final ajr a(int i) {
        return new ajr(AccessibilityNodeInfo.obtain(this.b.l(i).a));
    }

    @Override // defpackage.aju
    public final ajr b(int i) {
        int i2 = i == 2 ? this.b.f : this.b.g;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return a(i2);
    }

    @Override // defpackage.aju
    public final boolean c(int i, int i2, Bundle bundle) {
        int i3;
        int i4;
        alk alkVar = this.b;
        if (i == -1) {
            return alkVar.b.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 1) {
            View view = alkVar.b;
            if ((!view.isFocused() && !view.requestFocus()) || (i3 = alkVar.g) == i) {
                return false;
            }
            if (i3 != Integer.MIN_VALUE) {
                alkVar.r(i3);
            }
            if (i == Integer.MIN_VALUE) {
                return false;
            }
            alkVar.g = i;
            alkVar.t(i, 8);
            return true;
        }
        if (i2 == 2) {
            return alkVar.r(i);
        }
        if (i2 != 64) {
            return i2 != 128 ? alkVar.s(i, i2) : alkVar.q(i);
        }
        AccessibilityManager accessibilityManager = alkVar.a;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i4 = alkVar.f) == i) {
            return false;
        }
        if (i4 != Integer.MIN_VALUE) {
            alkVar.q(i4);
        }
        alkVar.f = i;
        alkVar.b.invalidate();
        alkVar.t(i, 32768);
        return true;
    }
}
