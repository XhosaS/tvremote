package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hff implements hev {
    public final String a;
    public final List b;
    public final boolean c;

    public hff(String str, List list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    @Override // defpackage.hev
    public final hcj a(hbv hbvVar, hbk hbkVar, hfk hfkVar) {
        return new hck(hbvVar, hfkVar, this, hbkVar);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.a + "' Shapes: " + Arrays.toString(this.b.toArray()) + "}";
    }
}
