package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rht {
    public final int a;
    public final Drawable b;
    public final int c;
    public final String d;
    public final int e;
    public final View.OnClickListener f;
    public final tst g;

    public rht() {
        throw null;
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof rht) {
            rht rhtVar = (rht) obj;
            if (this.a == rhtVar.a && ((drawable = this.b) != null ? drawable.equals(rhtVar.b) : rhtVar.b == null) && this.c == rhtVar.c && this.d.equals(rhtVar.d) && this.e == rhtVar.e && this.f.equals(rhtVar.f) && this.g.equals(rhtVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Drawable drawable = this.b;
        return (((((((((((drawable == null ? 0 : drawable.hashCode()) ^ ((this.a ^ 1000003) * 1000003)) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        tst tstVar = this.g;
        View.OnClickListener onClickListener = this.f;
        return "SimpleActionSpec{id=" + this.a + ", icon=" + String.valueOf(this.b) + ", iconResId=" + this.c + ", label=" + this.d + ", veId=" + this.e + ", onClickListener=" + String.valueOf(onClickListener) + ", availabilityChecker=" + String.valueOf(tstVar) + "}";
    }

    public rht(int i, Drawable drawable, int i2, String str, int i3, View.OnClickListener onClickListener, tst tstVar) {
        this.a = i;
        this.b = drawable;
        this.c = i2;
        this.d = str;
        this.e = i3;
        this.f = onClickListener;
        this.g = tstVar;
    }
}
