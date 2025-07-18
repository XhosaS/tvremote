package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class abdb implements abbe {
    final /* synthetic */ Class a;
    final /* synthetic */ abbd b;

    public abdb(Class cls, abbd abbdVar) {
        this.a = cls;
        this.b = abbdVar;
    }

    public final String toString() {
        abbd abbdVar = this.b;
        return "Factory[type=" + this.a.getName() + ",adapter=" + abbdVar.toString() + "]";
    }
}
