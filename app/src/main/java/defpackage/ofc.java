package defpackage;

import android.graphics.drawable.Drawable;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ofc {
    public nmj d;
    public float a = 0.0f;
    public int b = 0;
    public drd c = null;
    public Drawable e = null;

    public final boolean equals(Object obj) {
        if (obj instanceof ofc) {
            ofc ofcVar = (ofc) obj;
            if (Objects.equals(this.e, ofcVar.e)) {
                float f = this.a;
                Float fValueOf = Float.valueOf(f);
                float f2 = ofcVar.a;
                Float fValueOf2 = Float.valueOf(f2);
                fValueOf.getClass();
                fValueOf2.getClass();
                if (((long) (f * 10000.0f)) == ((long) (f2 * 10000.0f)) && Objects.equals(this.c, ofcVar.c) && this.b == ofcVar.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.e, Float.valueOf(this.a), this.c, Integer.valueOf(this.b));
    }

    public final String toString() {
        return "StyleBuilderImpl(backgroundDrawable:" + String.valueOf(this.e) + ", cornerRadiusPx:" + this.a + ", border:" + String.valueOf(this.c) + ", borderColor:" + this.b + ")";
    }
}
