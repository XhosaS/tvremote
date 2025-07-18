package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class afj extends afi {
    private final Object a;

    public afj(int i) {
        super(i);
        this.a = new Object();
    }

    @Override // defpackage.afi, defpackage.afh
    public final Object a() {
        Object objA;
        synchronized (this.a) {
            objA = super.a();
        }
        return objA;
    }

    @Override // defpackage.afi, defpackage.afh
    public final boolean b(Object obj) {
        boolean zB;
        obj.getClass();
        synchronized (this.a) {
            zB = super.b(obj);
        }
        return zB;
    }
}
