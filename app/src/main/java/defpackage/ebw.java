package defpackage;

import android.graphics.PathEffect;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ebw {
    public float a;
    public float b;
    public float c;
    public float d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PathEffect i;
    public float[] j;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ebw ebwVar = (ebw) obj;
            if (ebwVar.a == this.a && ebwVar.b == this.b && ebwVar.c == this.c && ebwVar.d == this.d && this.e == ebwVar.e && this.f == ebwVar.f && this.g == ebwVar.g && this.h == ebwVar.h && drm.a(null, null) && Arrays.equals(this.j, ebwVar.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (int) this.a;
        int i2 = (int) this.b;
        return (((((((((((((((i * 31) + i2) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 961) + Arrays.hashCode(this.j);
    }
}
