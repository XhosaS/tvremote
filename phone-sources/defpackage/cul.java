package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cul extends cuk {
    private final Object a;

    public cul(int i) {
        super(i);
        this.a = new Object();
    }

    @Override // defpackage.cuk, defpackage.cuj
    public final Object a() {
        Object objA;
        synchronized (this.a) {
            objA = super.a();
        }
        return objA;
    }

    @Override // defpackage.cuk, defpackage.cuj
    public final boolean b(Object obj) {
        boolean zB;
        obj.getClass();
        synchronized (this.a) {
            zB = super.b(obj);
        }
        return zB;
    }
}
