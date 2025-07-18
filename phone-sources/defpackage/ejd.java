package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejd {
    public boolean a;
    public ejx b;
    public int c;
    public boolean d;
    public int e;

    public ejd(ejx ejxVar) {
        this.b = ejxVar;
    }

    public final void a(int i) {
        this.a = 1 == ((this.a ? 1 : 0) | i);
        this.c += i;
    }
}
