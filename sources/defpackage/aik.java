package defpackage;

import android.content.ComponentName;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aik {
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;
    private final ComponentName e;

    public aik(String str, boolean z) {
        qp.o(str);
        this.a = str;
        qp.o("com.google.android.gms");
        this.b = "com.google.android.gms";
        this.e = null;
        this.c = 4225;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aik)) {
            return false;
        }
        aik aikVar = (aik) obj;
        if (ii.X(this.a, aikVar.a) && ii.X(this.b, aikVar.b)) {
            ComponentName componentName = aikVar.e;
            if (ii.X(null, null)) {
                int i = aikVar.c;
                if (this.d == aikVar.d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, 4225, Boolean.valueOf(this.d)});
    }

    public final String toString() {
        return this.a;
    }
}
