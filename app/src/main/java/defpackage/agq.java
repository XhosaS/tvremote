package defpackage;

import android.os.Build;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class agq {
    private final agp a;

    public agq(View view) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new agn(view);
        } else {
            this.a = new ago();
        }
    }

    public final void a(int i, int i2, int i3, boolean z) {
        this.a.a(i, i2, i3, z);
    }

    public final void b(int i, int i2, int i3, int i4) {
        this.a.b(i, i2, i3, i4);
    }
}
