package androidx.slice;

import defpackage.bwy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SliceSpec implements bwy {
    public String a;
    public int b;

    public SliceSpec() {
        this.b = 1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SliceSpec)) {
            return false;
        }
        SliceSpec sliceSpec = (SliceSpec) obj;
        return this.a.equals(sliceSpec.a) && this.b == sliceSpec.b;
    }

    public final int hashCode() {
        return this.a.hashCode() + this.b;
    }

    public final String toString() {
        return String.format("SliceSpec{%s,%d}", this.a, Integer.valueOf(this.b));
    }

    public SliceSpec(String str, int i) {
        this.a = str;
        this.b = i;
    }
}
