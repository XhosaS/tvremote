package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfh implements hev {
    public final String a;
    public final hei b;
    public final List c;
    public final heh d;
    public final hek e;
    public final hei f;
    public final float g;
    public final boolean h;
    public final int i;
    public final int j;

    public hfh(String str, hei heiVar, List list, heh hehVar, hek hekVar, hei heiVar2, int i, int i2, float f, boolean z) {
        this.a = str;
        this.b = heiVar;
        this.c = list;
        this.d = hehVar;
        this.e = hekVar;
        this.f = heiVar2;
        this.i = i;
        this.j = i2;
        this.g = f;
        this.h = z;
    }

    @Override // defpackage.hev
    public final hcj a(hbv hbvVar, hbk hbkVar, hfk hfkVar) {
        return new hcz(hbvVar, hfkVar, this);
    }
}
