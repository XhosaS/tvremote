package defpackage;

import android.graphics.Typeface;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gf {
    private final Typeface a;
    private final String b;
    private final int c;

    public gf(Typeface typeface, String str, int i) {
        this.a = typeface;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gf)) {
            return false;
        }
        gf gfVar = (gf) obj;
        return this.c == gfVar.c && Objects.equals(this.a, gfVar.a) && Objects.equals(this.b, gfVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c));
    }
}
