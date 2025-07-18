package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class yon {
    public final Throwable b;
    public final ynr c;

    public yon(Throwable th, boolean z) {
        this.b = th;
        this.c = new ynr(z, ynv.a);
    }

    public final boolean a() {
        return this.c.b();
    }

    public final String toString() {
        return yoz.a(this) + "[" + this.b + "]";
    }

    public /* synthetic */ yon(Throwable th) {
        this(th, false);
    }
}
