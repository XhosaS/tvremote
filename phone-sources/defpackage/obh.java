package defpackage;

import android.content.ComponentName;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class obh {
    public final String a;
    public final String b;
    public final ComponentName c;
    public final int d;
    public final boolean e;

    public obh(ComponentName componentName) {
        this.a = null;
        this.b = null;
        ocv.aF(componentName);
        this.c = componentName;
        this.d = 4225;
        this.e = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof obh)) {
            return false;
        }
        obh obhVar = (obh) obj;
        if (a.Q(this.a, obhVar.a) && a.Q(this.b, obhVar.b) && a.Q(this.c, obhVar.c)) {
            int i = obhVar.d;
            if (this.e == obhVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, 4225, Boolean.valueOf(this.e)});
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        ComponentName componentName = this.c;
        ocv.aF(componentName);
        return componentName.flattenToString();
    }

    public obh(String str, boolean z) {
        ocv.aD(str);
        this.a = str;
        ocv.aD("com.google.android.gms");
        this.b = "com.google.android.gms";
        this.c = null;
        this.d = 4225;
        this.e = z;
    }
}
