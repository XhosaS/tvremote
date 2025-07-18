package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hex implements hev {
    public final String a;
    public final hej b;
    public final hek c;
    public final hem d;
    public final hem e;
    public final hei f;
    public final float g;
    public final List h;
    public final hei i;
    public final boolean j;
    public final int k;
    public final int l;
    public final int m;

    public hex(String str, int i, hej hejVar, hek hekVar, hem hemVar, hem hemVar2, hei heiVar, int i2, int i3, float f, List list, hei heiVar2, boolean z) {
        this.a = str;
        this.k = i;
        this.b = hejVar;
        this.c = hekVar;
        this.d = hemVar;
        this.e = hemVar2;
        this.f = heiVar;
        this.l = i2;
        this.m = i3;
        this.g = f;
        this.h = list;
        this.i = heiVar2;
        this.j = z;
    }

    @Override // defpackage.hev
    public final hcj a(hbv hbvVar, hbk hbkVar, hfk hfkVar) {
        return new hcp(hbvVar, hfkVar, this);
    }
}
