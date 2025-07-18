package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class juw extends sbx {
    public final jaf a;
    private final hfw b;

    public juw(hfw hfwVar, jaf jafVar, lfn lfnVar) {
        jafVar.getClass();
        lfnVar.getClass();
        this.b = hfwVar;
        this.a = jafVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        jus jusVar = (jus) obj;
        jvb jvbVar = new jvb();
        jvbVar.a = new jsi(this, jusVar, 9);
        jvbVar.b = new jtt(this, jusVar, 5);
        return jvbVar;
    }

    @Override // defpackage.sbx
    public final /* synthetic */ void c(Object obj, Object obj2) {
        jus jusVar = (jus) obj;
        String str = ((ixi) jusVar).a;
        jvb jvbVar = (jvb) obj2;
        ulp ulpVarR = r();
        int i = 0;
        jvbVar.F(str, new String[0]);
        sco scoVar = new sco(jusVar.e.d);
        if (!yks.e(jvbVar.c, scoVar)) {
            jvbVar.c = scoVar;
            jvbVar.G(0);
        }
        jvbVar.d = new scc("R.id.sort_option", jvbVar, new juu(jusVar, ulpVarR, i));
        jvbVar.G(1);
    }
}
