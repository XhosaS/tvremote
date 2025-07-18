package defpackage;

import android.content.res.Resources;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class csk {
    public final Resources a;
    public final Resources.Theme b;

    public csk(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            csk cskVar = (csk) obj;
            if (this.a.equals(cskVar.a) && Objects.equals(this.b, cskVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
