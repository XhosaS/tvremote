package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjr {
    public static final bjr a = new bjr();

    private bjr() {
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 33) {
            return bjq.a.a();
        }
        return 0;
    }

    public final int b() {
        if (Build.VERSION.SDK_INT == 31 || Build.VERSION.SDK_INT == 32) {
            return bjp.a.a();
        }
        return 0;
    }
}
