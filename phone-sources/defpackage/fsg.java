package defpackage;

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsg {
    public final String a;
    public final int b;
    public final int c;

    public fsg(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsg)) {
            return false;
        }
        fsg fsgVar = (fsg) obj;
        int i2 = this.b;
        return (i2 < 0 || (i = fsgVar.b) < 0) ? TextUtils.equals(this.a, fsgVar.a) && this.c == fsgVar.c : TextUtils.equals(this.a, fsgVar.a) && i2 == i && this.c == fsgVar.c;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.c));
    }
}
