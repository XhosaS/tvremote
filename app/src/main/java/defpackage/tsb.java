package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class tsb {
    public abstract int a();

    public abstract tsc b();

    public final tsc c() {
        boolean z = true;
        if (a() != 1 && a() != 2) {
            z = false;
        }
        yqw.M(z, "Invalid channelCount");
        return b();
    }

    public abstract void d(int i);

    public abstract void e(int i);

    public abstract void f(boolean z);

    public abstract void g(int i);
}
