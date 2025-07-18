package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jgg extends sbx {
    public final jaf a;
    private final cvw b;

    public jgg(cvw cvwVar, jaf jafVar) {
        jafVar.getClass();
        this.b = cvwVar;
        this.a = jafVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        ixi ixiVar = (ixi) obj;
        jgj jgjVar = new jgj();
        jgjVar.a = new jeu(this, ixiVar, 5);
        jgjVar.b = new jev(this, ixiVar, 4);
        return jgjVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        ((jgj) obj2).F(((ixi) obj).a, new String[0]);
    }
}
