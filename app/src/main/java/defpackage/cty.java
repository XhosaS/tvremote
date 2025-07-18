package defpackage;

import android.graphics.Path;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cty implements ctn {
    public final Path.FillType a;
    public final String b;
    public final csx c;
    public final cta d;
    public final boolean e;
    private final boolean f;

    public cty(String str, boolean z, Path.FillType fillType, csx csxVar, cta ctaVar, boolean z2) {
        this.b = str;
        this.f = z;
        this.a = fillType;
        this.c = csxVar;
        this.d = ctaVar;
        this.e = z2;
    }

    @Override // defpackage.ctn
    public final cqw a(cqd cqdVar, cph cphVar, cug cugVar) {
        return new cra(cqdVar, cugVar, this);
    }

    public final String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f + "}";
    }
}
