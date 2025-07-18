package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class tsc {
    public static tsb d() {
        tsf tsfVar = new tsf();
        tsfVar.a = Optional.empty();
        tsfVar.b = Optional.empty();
        tsfVar.g(16000);
        tsfVar.d(1);
        tsfVar.e(2);
        tsfVar.f(true);
        tsfVar.c = (byte) (tsfVar.c | 16);
        return tsfVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract Optional e();

    public abstract Optional f();

    public abstract boolean g();

    public abstract void h();
}
