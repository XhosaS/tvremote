package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yym {
    private final Object a;
    private final Object b;
    private final Object c;

    public yym(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    final IllegalArgumentException a() {
        Object obj = this.c;
        Object obj2 = this.b;
        Object obj3 = this.a;
        return new IllegalArgumentException("Multiple entries with same key: " + obj3.toString() + "=" + obj2.toString() + " and " + obj3.toString() + "=" + obj.toString());
    }
}
