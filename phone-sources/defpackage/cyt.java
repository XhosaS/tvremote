package defpackage;

import android.os.Build;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cyt {
    public final Object b;

    public cyt(Object obj) {
        this.b = obj;
    }

    public cyq a(int i) {
        return null;
    }

    public cyq b(int i) {
        return null;
    }

    public boolean d(int i, int i2, Bundle bundle) {
        return false;
    }

    public cyt() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.b = new cys(this);
        } else {
            this.b = new cyr(this);
        }
    }

    public void c(int i, cyq cyqVar, String str, Bundle bundle) {
    }
}
