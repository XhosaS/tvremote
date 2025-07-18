package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbo {
    public static final bbo a = new bbo(cbe.c);
    public final cae b;

    public bbo(cae caeVar) {
        this.b = caeVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bbo) {
            return this.b.equals(((bbo) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return bjz.e(this.b);
    }
}
