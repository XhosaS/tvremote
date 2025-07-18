package defpackage;

import android.graphics.Color;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gck {
    public final int a;
    public final int b;
    private final int c;
    private final int d;
    private final int e;
    private boolean f;
    private int g;
    private int h;
    private float[] i;

    public gck(int i, int i2) {
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
        int iE = csq.e(-1, i, 4.5f);
        int iE2 = csq.e(-1, i, 3.0f);
        if (iE != -1 && iE2 != -1) {
            this.h = csq.g(-1, iE);
            this.g = csq.g(-1, iE2);
            this.f = true;
            return;
        }
        int iE3 = csq.e(-16777216, i, 4.5f);
        int iE4 = csq.e(-16777216, i, 3.0f);
        if (iE3 == -1 || iE4 == -1) {
            this.h = iE != -1 ? csq.g(-1, iE) : csq.g(-16777216, iE3);
            this.g = iE2 != -1 ? csq.g(-1, iE2) : csq.g(-16777216, iE4);
            this.f = true;
        } else {
            this.h = csq.g(-16777216, iE3);
            this.g = csq.g(-16777216, iE4);
            this.f = true;
        }
    }

    public final float[] a() {
        if (this.i == null) {
            this.i = new float[3];
        }
        csq.h(this.c, this.d, this.e, this.i);
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            gck gckVar = (gck) obj;
            if (this.b == gckVar.b && this.a == gckVar.a) {
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
