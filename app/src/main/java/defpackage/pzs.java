package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pzs implements aejg {
    private final pzq a;
    private final aejl b;
    private final aejl c;
    private final aejl d;
    private final aejl e;
    private final aejl f;
    private final aejl g;

    public pzs(pzq pzqVar, aejl aejlVar, aejl aejlVar2, aejl aejlVar3, aejl aejlVar4, aejl aejlVar5, aejl aejlVar6) {
        this.a = pzqVar;
        this.b = aejlVar;
        this.c = aejlVar2;
        this.d = aejlVar3;
        this.e = aejlVar4;
        this.f = aejlVar5;
        this.g = aejlVar6;
    }

    @Override // defpackage.agow
    public final /* bridge */ /* synthetic */ Object a() {
        Context context = ((pym) this.b).a.a;
        context.getClass();
        Uri uri = (Uri) this.c.a();
        qbv qbvVar = (qbv) this.e.a();
        pvx pvxVarA = ((pvy) this.f).a();
        yqt yqtVar = (yqt) this.g.a();
        ujl ujlVarH = ujm.h();
        ujlVarH.e(uri);
        ujlVarH.d(pjm.a);
        ujlVarH.f(false);
        pzq pzqVar = this.a;
        ujlVarH.b().g(qen.b(context, pzqVar.a, qbvVar, pvxVarA, yqtVar));
        ujk ujkVarA = pzqVar.b.a(ujlVarH.a());
        ujkVarA.getClass();
        return ujkVarA;
    }
}
