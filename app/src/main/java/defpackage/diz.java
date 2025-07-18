package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class diz implements ddp {
    protected final Object a;

    public diz(Object obj) {
        dqk.d(obj, "Argument must not be null");
        this.a = obj;
    }

    @Override // defpackage.ddp
    public final int a() {
        return 1;
    }

    @Override // defpackage.ddp
    public final Class b() {
        return this.a.getClass();
    }

    @Override // defpackage.ddp
    public final Object c() {
        return this.a;
    }

    @Override // defpackage.ddp
    public final void e() {
    }
}
