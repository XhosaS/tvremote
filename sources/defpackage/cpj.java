package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpj implements cpi, cov {
    public final Object a;

    private cpj(Object obj) {
        this.a = obj;
    }

    public static cpi b(Object obj) {
        obj.getClass();
        return new cpj(obj);
    }

    @Override // defpackage.crv, defpackage.cru
    public final Object a() {
        return this.a;
    }
}
