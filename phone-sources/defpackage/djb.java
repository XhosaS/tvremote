package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class djb implements diz {
    public djl b;
    public Float c;
    public dmu e;
    public djh a = djh.b;
    public int d = 1;

    @Override // defpackage.diz
    public final diz a() {
        djb djbVar = new djb();
        djbVar.a = this.a;
        djbVar.b = this.b;
        djbVar.e = this.e;
        djbVar.c = this.c;
        djbVar.d = this.d;
        return djbVar;
    }

    @Override // defpackage.diz
    public final djh b() {
        return this.a;
    }

    @Override // defpackage.diz
    public final void c(djh djhVar) {
        this.a = djhVar;
    }

    public final String toString() {
        return "EmittableImage(modifier=" + this.a + ", provider=" + this.b + ", colorFilterParams=" + this.e + ", alpha=" + this.c + ", contentScale=" + ((Object) drt.a(this.d)) + ')';
    }
}
