package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jkc extends sbx {
    public final jaf a;
    private final cxe b;

    public jkc(cxe cxeVar, jaf jafVar) {
        jafVar.getClass();
        this.b = cxeVar;
        this.a = jafVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        ixi ixiVar = (ixi) obj;
        jjz jjzVar = new jjz(2, (char[]) null);
        jjzVar.c = new jeu(this, ixiVar, 15);
        jjzVar.a = new jev(this, ixiVar, 12);
        return jjzVar;
    }

    @Override // defpackage.sbx
    public final /* synthetic */ void c(Object obj, Object obj2) {
        ixi ixiVar = (ixi) obj;
        jjz jjzVar = (jjz) obj2;
        jjzVar.F(ixiVar.a, new String[0]);
        sco scoVar = new sco(((wuz) ixiVar.b).b);
        if (yks.e(jjzVar.b, scoVar)) {
            return;
        }
        jjzVar.b = scoVar;
        jjzVar.G(0);
    }
}
