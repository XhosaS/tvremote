package defpackage;

import android.view.DisplayCutout;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afy {
    public final DisplayCutout a;

    public afy(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((afy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
