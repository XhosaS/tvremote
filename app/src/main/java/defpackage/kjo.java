package defpackage;

import android.content.ComponentName;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kjo {
    public final String a;
    public final String b;
    public final ComponentName c;
    public final int d;
    public final boolean e;

    public kjo(ComponentName componentName) {
        this.a = null;
        this.b = null;
        kkk.k(componentName);
        this.c = componentName;
        this.d = 4225;
        this.e = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjo)) {
            return false;
        }
        kjo kjoVar = (kjo) obj;
        if (kki.a(this.a, kjoVar.a) && kki.a(this.b, kjoVar.b) && kki.a(this.c, kjoVar.c)) {
            int i = kjoVar.d;
            if (this.e == kjoVar.e) {
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
        kkk.k(componentName);
        return componentName.flattenToString();
    }

    public kjo(String str, boolean z) {
        kkk.h(str);
        this.a = str;
        kkk.h("com.google.android.gms");
        this.b = "com.google.android.gms";
        this.c = null;
        this.d = 4225;
        this.e = z;
    }
}
