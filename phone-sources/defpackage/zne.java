package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zne {
    final boolean a;
    final zjd b;

    static {
        new zjb("2.5.29.9");
        new zjb("2.5.29.14");
        new zjb("2.5.29.15");
        new zjb("2.5.29.16");
        new zjb("2.5.29.17");
        new zjb("2.5.29.18");
        new zjb("2.5.29.19");
        new zjb("2.5.29.20");
        new zjb("2.5.29.21");
        new zjb("2.5.29.23");
        new zjb("2.5.29.24");
        new zjb("2.5.29.27");
        new zjb("2.5.29.28");
        new zjb("2.5.29.29");
        new zjb("2.5.29.30");
        new zjb("2.5.29.31");
        new zjb("2.5.29.32");
        new zjb("2.5.29.33");
        new zjb("2.5.29.35");
        new zjb("2.5.29.36");
        new zjb("2.5.29.37");
        new zjb("2.5.29.46");
        new zjb("2.5.29.54");
        new zjb("1.3.6.1.5.5.7.1.1");
        new zjb("1.3.6.1.5.5.7.1.11");
        new zjb("1.3.6.1.5.5.7.1.12");
        new zjb("1.3.6.1.5.5.7.1.2");
        new zjb("1.3.6.1.5.5.7.1.3");
        new zjb("1.3.6.1.5.5.7.1.4");
        new zjb("2.5.29.56");
        new zjb("2.5.29.55");
    }

    public zne(boolean z, zjd zjdVar) {
        this.a = z;
        this.b = zjdVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zne)) {
            return false;
        }
        zne zneVar = (zne) obj;
        return zneVar.b.w(this.b) && zneVar.a == this.a;
    }

    public final int hashCode() {
        return this.a ? this.b.hashCode() : ~this.b.hashCode();
    }
}
