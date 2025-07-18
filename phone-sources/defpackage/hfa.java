package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfa implements hev {
    public final String a;
    public final hes b;
    public final hes c;
    public final hei d;
    public final boolean e;

    public hfa(String str, hes hesVar, hes hesVar2, hei heiVar, boolean z) {
        this.a = str;
        this.b = hesVar;
        this.c = hesVar2;
        this.d = heiVar;
        this.e = z;
    }

    @Override // defpackage.hev
    public final hcj a(hbv hbvVar, hbk hbkVar, hfk hfkVar) {
        return new hcv(hbvVar, hfkVar, this);
    }

    public final String toString() {
        hes hesVar = this.c;
        return "RectangleShape{position=" + String.valueOf(this.b) + ", size=" + String.valueOf(hesVar) + "}";
    }
}
