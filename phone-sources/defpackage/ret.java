package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.content.res.AppCompatResources;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ret {
    public final Drawable a;
    public final int b;
    public final boolean c;
    public final tst d;

    public ret() {
        throw null;
    }

    public static res b(Drawable drawable) {
        res resVar = new res((byte[]) null);
        resVar.d = drawable;
        resVar.b(-1);
        resVar.c(false);
        return resVar;
    }

    public static ret c(Drawable drawable) {
        res resVarB = b(drawable);
        resVarB.c(true);
        return resVarB.a();
    }

    public final Drawable a(Context context, int i) {
        Drawable drawable = this.a;
        if (drawable == null) {
            drawable = AppCompatResources.getDrawable(context, this.b);
        }
        if (this.c) {
            rrx.am(drawable, i);
        }
        return drawable;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ret) {
            ret retVar = (ret) obj;
            Drawable drawable = this.a;
            if (drawable != null ? drawable.equals(retVar.a) : retVar.a == null) {
                if (this.b == retVar.b && this.c == retVar.c && this.d.equals(retVar.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Drawable drawable = this.a;
        int iHashCode = drawable == null ? 0 : drawable.hashCode();
        return ((((((iHashCode ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        tst tstVar = this.d;
        return "TintAwareIcon{icon=" + String.valueOf(this.a) + ", iconResId=" + this.b + ", useTint=" + this.c + ", iconContentDescription=" + String.valueOf(tstVar) + "}";
    }

    public ret(Drawable drawable, int i, boolean z, tst tstVar) {
        this.a = drawable;
        this.b = i;
        this.c = z;
        this.d = tstVar;
    }
}
