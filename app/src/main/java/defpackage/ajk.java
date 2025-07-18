package defpackage;

import android.os.Build;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajk {
    public final ajj a;

    public ajk(Window window) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new aji(window);
        } else if (Build.VERSION.SDK_INT >= 30) {
            this.a = new ajg(window);
        } else {
            this.a = new ajf(window);
        }
    }
}
