package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jsj extends sbx {
    public final jaf a;
    private final kdh b;

    public jsj(kdh kdhVar, jaf jafVar) {
        jafVar.getClass();
        this.b = kdhVar;
        this.a = jafVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        jsh jshVar = (jsh) obj;
        kjh kjhVarH = this.b.h();
        kjhVarH.a = new jsi(this, jshVar, 0);
        kjhVarH.b = new jnq(this, jshVar, 18);
        return kjhVarH;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        jsh jshVar = (jsh) obj;
        kjh kjhVar = (kjh) obj2;
        kjhVar.F(((ixi) jshVar).a, new String[0]);
        kjhVar.c(Integer.valueOf(jshVar.d));
        Integer numValueOf = Integer.valueOf(jshVar.e);
        if (!yks.e(kjhVar.e, numValueOf)) {
            kjhVar.e = numValueOf;
            kjhVar.G(3);
        }
        kjhVar.b(new kcm(1));
    }
}
