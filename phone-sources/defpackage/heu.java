package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class heu implements hev {
    public final String a;
    public final hes b;
    public final hem c;
    public final boolean d;
    public final boolean e;

    public heu(String str, hes hesVar, hem hemVar, boolean z, boolean z2) {
        this.a = str;
        this.b = hesVar;
        this.c = hemVar;
        this.d = z;
        this.e = z2;
    }

    @Override // defpackage.hev
    public final hcj a(hbv hbvVar, hbk hbkVar, hfk hfkVar) {
        return new hcm(hbvVar, hfkVar, this);
    }
}
