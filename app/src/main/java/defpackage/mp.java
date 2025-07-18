package defpackage;

import android.graphics.Typeface;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
class mp {
    private final Typeface a;
    private final String b;
    private final int c;

    public mp(Typeface typeface, String str, int i) {
        this.a = typeface;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mp)) {
            return false;
        }
        mp mpVar = (mp) obj;
        return this.c == mpVar.c && Objects.equals(this.a, mpVar.a) && Objects.equals(this.b, mpVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c));
    }
}
