package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dmp {
    final Class a;
    final Class b;
    final dmo c;

    public dmp(Class cls, Class cls2, dmo dmoVar) {
        this.a = cls;
        this.b = cls2;
        this.c = dmoVar;
    }

    public final boolean a(Class cls, Class cls2) {
        return this.a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.b);
    }
}
