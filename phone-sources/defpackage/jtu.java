package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jtu extends sbx {
    public final jaf a;
    private final hfw b;

    public jtu(hfw hfwVar, jaf jafVar) {
        jafVar.getClass();
        this.b = hfwVar;
        this.a = jafVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yfo] */
    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        jts jtsVar = (jts) obj;
        jtx jtxVar = new jtx(this.b.a);
        jtxVar.a = new jsi(this, jtsVar, 5);
        jtxVar.b = new jtt(this, jtsVar, 0);
        return jtxVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        jts jtsVar = (jts) obj;
        jtx jtxVar = (jtx) obj2;
        jtxVar.F(((ixi) jtsVar).a, new String[0]);
        idr idrVar = (idr) p(jef.g);
        if (idrVar != null) {
            idrVar.c(jtsVar.d);
        }
        jgu jguVar = new jgu(jtsVar, jtxVar, idrVar, 5);
        wtx wtxVar = (wtx) jtsVar.b;
        wls wlsVar = wtxVar.b;
        if (wlsVar == null) {
            wlsVar = wls.a;
        }
        if (!yks.e(jtxVar.d, wlsVar)) {
            jtxVar.d = wlsVar;
            jtxVar.G(2);
        }
        wls wlsVar2 = wtxVar.c;
        if (wlsVar2 == null) {
            wlsVar2 = wls.a;
        }
        if (!yks.e(jtxVar.e, wlsVar2)) {
            jtxVar.e = wlsVar2;
            jtxVar.G(3);
        }
        jtxVar.r(kir.c(jtsVar.d));
        wkp wkpVar = wtxVar.d;
        if (wkpVar == null) {
            wkpVar = wkp.a;
        }
        wph wphVar = wkpVar.c;
        if (wphVar == null) {
            wphVar = wph.a;
        }
        boolean z = wphVar.b == 2;
        if (!yks.e(Boolean.valueOf(jtxVar.c), Boolean.valueOf(z))) {
            jtxVar.c = z;
            jtxVar.G(1);
        }
        jtxVar.f = new scc("R.id.checkbox", jtxVar, jguVar);
        jtxVar.G(4);
        jtxVar.g = new scc("R.id.selection_item_component", jtxVar, jguVar);
        jtxVar.G(5);
    }
}
