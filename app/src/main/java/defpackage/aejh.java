package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aejh implements aejg, aehf {
    public static final aejh a = new aejh(null);
    public final Object b;

    private aejh(Object obj) {
        this.b = obj;
    }

    public static aejg b(Object obj) {
        obj.getClass();
        return new aejh(obj);
    }

    @Override // defpackage.agow
    public final Object a() {
        return this.b;
    }
}
