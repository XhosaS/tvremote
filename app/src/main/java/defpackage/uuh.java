package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class uuh {
    public static uug o() {
        uty utyVar = new uty();
        utyVar.d(0);
        utyVar.b = (short) (utyVar.b | 6);
        utyVar.c(0);
        utyVar.f();
        utyVar.e();
        utyVar.b();
        short s = utyVar.b;
        utyVar.a = true;
        utyVar.b = (short) (s | 7168);
        return utyVar;
    }

    public abstract float a();

    public abstract float b();

    public abstract float c();

    public abstract float d();

    public abstract int e();

    public abstract int f();

    public abstract boolean g();

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public final float n() {
        return Math.min(d(), a());
    }
}
