package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pb extends pa {
    private final Object a;

    public pb() {
        super(12);
        this.a = new Object();
    }

    @Override // defpackage.pa
    public final Object a() {
        Object objA;
        synchronized (this.a) {
            objA = super.a();
        }
        return objA;
    }

    @Override // defpackage.pa
    public final boolean b(Object obj) {
        boolean zB;
        synchronized (this.a) {
            zB = super.b(obj);
        }
        return zB;
    }
}
