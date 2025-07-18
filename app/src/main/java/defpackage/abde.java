package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class abde implements abbe {
    final /* synthetic */ Class a;
    final /* synthetic */ Class b;
    final /* synthetic */ abbd c;

    public abde(Class cls, Class cls2, abbd abbdVar) {
        this.a = cls;
        this.b = cls2;
        this.c = abbdVar;
    }

    public final String toString() {
        abbd abbdVar = this.c;
        Class cls = this.b;
        return "Factory[type=" + this.a.getName() + "+" + cls.getName() + ",adapter=" + abbdVar.toString() + "]";
    }
}
