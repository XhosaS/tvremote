package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ewt {
    public long a;
    public long b;
    public ewt c;
    public zuw d;

    public ewt(long j, int i) {
        c(j, i);
    }

    public final int a(long j) {
        return ((int) (j - this.a)) + this.d.a;
    }

    public final ewt b() {
        this.d = null;
        ewt ewtVar = this.c;
        this.c = null;
        return ewtVar;
    }

    public final void c(long j, int i) {
        a.ab(this.d == null);
        this.a = j;
        this.b = j + i;
    }
}
