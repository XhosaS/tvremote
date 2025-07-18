package defpackage;

import android.graphics.Path;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfe implements hev {
    public final Path.FillType a;
    public final String b;
    public final heh c;
    public final hek d;
    public final boolean e;
    private final boolean f;

    public hfe(String str, boolean z, Path.FillType fillType, heh hehVar, hek hekVar, boolean z2) {
        this.b = str;
        this.f = z;
        this.a = fillType;
        this.c = hehVar;
        this.d = hekVar;
        this.e = z2;
    }

    @Override // defpackage.hev
    public final hcj a(hbv hbvVar, hbk hbkVar, hfk hfkVar) {
        return new hcn(hbvVar, hfkVar, this);
    }

    public final String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f + "}";
    }
}
