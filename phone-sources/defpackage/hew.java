package defpackage;

import android.graphics.Path;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hew implements hev {
    public final Path.FillType a;
    public final hej b;
    public final hek c;
    public final hem d;
    public final hem e;
    public final String f;
    public final boolean g;
    public final int h;

    public hew(String str, int i, Path.FillType fillType, hej hejVar, hek hekVar, hem hemVar, hem hemVar2, boolean z) {
        this.h = i;
        this.a = fillType;
        this.b = hejVar;
        this.c = hekVar;
        this.d = hemVar;
        this.e = hemVar2;
        this.f = str;
        this.g = z;
    }

    @Override // defpackage.hev
    public final hcj a(hbv hbvVar, hbk hbkVar, hfk hfkVar) {
        return new hco(hbvVar, hbkVar, hfkVar, this);
    }
}
