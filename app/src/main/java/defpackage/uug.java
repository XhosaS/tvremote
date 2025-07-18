package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class uug {
    public abstract uuh a();

    public abstract void b();

    public abstract void c(int i);

    public abstract void d(int i);

    public abstract void e();

    public abstract void f();

    public abstract void g(float f);

    public abstract void h(float f);

    public abstract void i(float f);

    public final uuh j() {
        uuh uuhVarA = a();
        utz utzVar = (utz) uuhVarA;
        yqw.R(utzVar.a >= 0, "extraSpaceBeforeKeyLine must >= 0", uuhVarA);
        yqw.R(true, "extraSpace must >= 0", uuhVarA);
        yqw.R(utzVar.b >= 0, "extraSpaceAfterKeyLine must >= 0", uuhVarA);
        return uuhVarA;
    }
}
