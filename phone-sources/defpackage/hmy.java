package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmy {
    public boolean a;
    public boolean b;
    public boolean c;

    private final boolean g() {
        return (this.c || this.b) && this.a;
    }

    final synchronized void a() {
        this.b = false;
        this.a = false;
        this.c = false;
    }

    final synchronized boolean b() {
        this.b = true;
        return g();
    }

    final synchronized boolean c() {
        this.c = true;
        return g();
    }

    final synchronized boolean d() {
        this.a = true;
        return g();
    }

    public final elr e() {
        if (this.b || !(this.c || this.a)) {
            return new elr(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }

    public final void f() {
        this.b = true;
    }
}
