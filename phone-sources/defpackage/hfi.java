package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfi implements hev {
    public final hei a;
    public final hei b;
    public final hei c;
    public final boolean d;
    public final int e;

    public hfi(int i, hei heiVar, hei heiVar2, hei heiVar3, boolean z) {
        this.e = i;
        this.a = heiVar;
        this.b = heiVar2;
        this.c = heiVar3;
        this.d = z;
    }

    @Override // defpackage.hev
    public final hcj a(hbv hbvVar, hbk hbkVar, hfk hfkVar) {
        return new hda(hfkVar, this);
    }

    public final String toString() {
        hei heiVar = this.c;
        hei heiVar2 = this.b;
        return "Trim Path: {start: " + String.valueOf(this.a) + ", end: " + String.valueOf(heiVar2) + ", offset: " + String.valueOf(heiVar) + "}";
    }
}
