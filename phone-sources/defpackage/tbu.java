package defpackage;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tbu extends gli {
    private final WeakReference a;
    private int b;
    private int c;

    public tbu(TabLayout tabLayout) {
        super(null);
        this.a = new WeakReference(tabLayout);
        this.c = 0;
        this.b = 0;
    }

    @Override // defpackage.gli
    public final void U(int i) {
        this.b = this.c;
        this.c = i;
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout != null) {
            tabLayout.D = this.c;
        }
    }

    @Override // defpackage.gli
    public final void V(int i, float f, int i2) {
        boolean z;
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout != null) {
            int i3 = this.c;
            boolean z2 = true;
            if (i3 != 2 || this.b == 1) {
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            if (i3 == 2 && this.b == 0) {
                z = false;
            }
            tabLayout.n(i, f, z2, z, false);
        }
    }

    @Override // defpackage.gli
    public final void W(int i) {
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout == null || tabLayout.a() == i || i >= tabLayout.b()) {
            return;
        }
        int i2 = this.c;
        boolean z = true;
        if (i2 != 0 && (i2 != 2 || this.b != 0)) {
            z = false;
        }
        tabLayout.l(tabLayout.c(i), z);
    }
}
