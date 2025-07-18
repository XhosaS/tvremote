package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ceh {
    private final Resources.Theme a;
    private final int b;

    public ceh(Resources.Theme theme, int i) {
        this.a = theme;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ceh)) {
            return false;
        }
        ceh cehVar = (ceh) obj;
        return yks.e(this.a, cehVar.a) && this.b == cehVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "Key(theme=" + this.a + ", id=" + this.b + ')';
    }
}
