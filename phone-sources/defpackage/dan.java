package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dan extends cyt {
    final /* synthetic */ dao a;

    public dan(dao daoVar) {
        this.a = daoVar;
    }

    @Override // defpackage.cyt
    public final cyq a(int i) {
        return new cyq(AccessibilityNodeInfo.obtain(this.a.b(i).b));
    }

    @Override // defpackage.cyt
    public final cyq b(int i) {
        int i2 = i == 2 ? this.a.c : this.a.d;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return a(i2);
    }

    @Override // defpackage.cyt
    public final boolean d(int i, int i2, Bundle bundle) {
        int i3;
        dao daoVar = this.a;
        if (i == -1) {
            return daoVar.b.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 1) {
            return daoVar.p(i);
        }
        if (i2 == 2) {
            return daoVar.l(i);
        }
        if (i2 != 64) {
            return i2 != 128 ? daoVar.o(i, i2, bundle) : daoVar.k(i);
        }
        AccessibilityManager accessibilityManager = daoVar.a;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = daoVar.c) == i) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            daoVar.k(i3);
        }
        daoVar.c = i;
        daoVar.b.invalidate();
        daoVar.q(i, 32768);
        return true;
    }
}
