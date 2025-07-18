package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pzx implements aejg {
    private final pzq a;
    private final aejl b;
    private final aejl c;

    public pzx(pzq pzqVar, aejl aejlVar, aejl aejlVar2) {
        this.a = pzqVar;
        this.b = aejlVar;
        this.c = aejlVar2;
    }

    @Override // defpackage.agow
    public final /* bridge */ /* synthetic */ Object a() {
        Context context = ((pym) this.b).a.a;
        context.getClass();
        yqt yqtVar = (yqt) this.c.a();
        int i = uem.b;
        uel uelVar = new uel(context);
        uem.b("mdd_pds_config");
        uelVar.c = "mdd_pds_config";
        uelVar.b(qdx.d("LoggingState", yqtVar));
        Uri uriA = uelVar.a();
        ujl ujlVarH = ujm.h();
        ujlVarH.e(uriA);
        ujlVarH.d(pjd.a);
        ujlVarH.f(false);
        pzq pzqVar = this.a;
        ulj uljVarD = ulm.d(context, pzqVar.a);
        uljVarD.c = qer.d("gms_icing_mdd_network_usage_monitor", yqtVar);
        uljVarD.b();
        uljVarD.e(new qdi());
        ujlVarH.b().g(uljVarD.a());
        ujk ujkVarA = pzqVar.b.a(ujlVarH.a());
        ujkVarA.getClass();
        return ujkVarA;
    }
}
