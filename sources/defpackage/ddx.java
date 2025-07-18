package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddx {
    final boolean a;
    final czx b;

    static {
        new czv("2.5.29.9");
        new czv("2.5.29.14");
        new czv("2.5.29.15");
        new czv("2.5.29.16");
        new czv("2.5.29.17");
        new czv("2.5.29.18");
        new czv("2.5.29.19");
        new czv("2.5.29.20");
        new czv("2.5.29.21");
        new czv("2.5.29.23");
        new czv("2.5.29.24");
        new czv("2.5.29.27");
        new czv("2.5.29.28");
        new czv("2.5.29.29");
        new czv("2.5.29.30");
        new czv("2.5.29.31");
        new czv("2.5.29.32");
        new czv("2.5.29.33");
        new czv("2.5.29.35");
        new czv("2.5.29.36");
        new czv("2.5.29.37");
        new czv("2.5.29.46");
        new czv("2.5.29.54");
        new czv("1.3.6.1.5.5.7.1.1");
        new czv("1.3.6.1.5.5.7.1.11");
        new czv("1.3.6.1.5.5.7.1.12");
        new czv("1.3.6.1.5.5.7.1.2");
        new czv("1.3.6.1.5.5.7.1.3");
        new czv("1.3.6.1.5.5.7.1.4");
        new czv("2.5.29.56");
        new czv("2.5.29.55");
    }

    public ddx(boolean z, czx czxVar) {
        this.a = z;
        this.b = czxVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ddx)) {
            return false;
        }
        ddx ddxVar = (ddx) obj;
        return ddxVar.b.w(this.b) && ddxVar.a == this.a;
    }

    public final int hashCode() {
        return this.a ? this.b.hashCode() : ~this.b.hashCode();
    }
}
