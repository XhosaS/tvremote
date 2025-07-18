package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcq {
    public final bbb a;
    public final boolean b;
    public final bds c;
    public final boolean d;
    public final Object e;
    public boolean f = true;

    public bcq(bbb bbbVar, Object obj, boolean z, bds bdsVar, boolean z2) {
        this.a = bbbVar;
        this.b = z;
        this.c = bdsVar;
        this.d = z2;
        this.e = obj;
    }

    public final Object a() {
        if (this.b) {
            return null;
        }
        Object obj = this.e;
        if (obj != null) {
            return obj;
        }
        bau.g("Unexpected form of a provided value");
        throw new yfs();
    }
}
