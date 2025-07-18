package defpackage;

import android.graphics.Color;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhn {
    public final int a;
    public final int b;
    private final int c;
    private final int d;
    private final int e;
    private boolean f;
    private int g;
    private int h;
    private float[] i;

    public bhn(int i, int i2) {
        this.c = Color.red(i);
        this.d = Color.green(i);
        this.e = Color.blue(i);
        this.a = i;
        this.b = i2;
    }

    private final void b() {
        if (this.f) {
            return;
        }
        int i = this.a;
        int iD = acr.d(-1, i, 4.5f);
        int iD2 = acr.d(-1, i, 3.0f);
        if (iD != -1 && iD2 != -1) {
            this.h = acr.f(-1, iD);
            this.g = acr.f(-1, iD2);
            this.f = true;
            return;
        }
        int iD3 = acr.d(-16777216, i, 4.5f);
        int iD4 = acr.d(-16777216, i, 3.0f);
        if (iD3 == -1 || iD4 == -1) {
            this.h = iD != -1 ? acr.f(-1, iD) : acr.f(-16777216, iD3);
            this.g = iD2 != -1 ? acr.f(-1, iD2) : acr.f(-16777216, iD4);
            this.f = true;
        } else {
            this.h = acr.f(-16777216, iD3);
            this.g = acr.f(-16777216, iD4);
            this.f = true;
        }
    }

    public final float[] a() {
        if (this.i == null) {
            this.i = new float[3];
        }
        acr.g(this.c, this.d, this.e, this.i);
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bhn bhnVar = (bhn) obj;
            if (this.b == bhnVar.b && this.a == bhnVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [RGB: #");
        sb.append(Integer.toHexString(this.a));
        sb.append("] [HSL: ");
        sb.append(Arrays.toString(a()));
        sb.append("] [Population: ");
        sb.append(this.b);
        sb.append("] [Title Text: #");
        b();
        sb.append(Integer.toHexString(this.g));
        sb.append("] [Body Text: #");
        b();
        sb.append(Integer.toHexString(this.h));
        sb.append(']');
        return sb.toString();
    }
}
