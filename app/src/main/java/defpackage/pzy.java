package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pzy implements aejg {
    private final aejl a;
    private final aejl b;

    public pzy(aejl aejlVar, aejl aejlVar2) {
        this.a = aejlVar;
        this.b = aejlVar2;
    }

    @Override // defpackage.agow
    public final /* bridge */ /* synthetic */ Object a() {
        Context context = ((pym) this.a).a.a;
        context.getClass();
        yqt yqtVar = (yqt) this.b.a();
        int i = uem.b;
        uel uelVar = new uel(context);
        uem.b("mdd_pds_config");
        uelVar.c = "mdd_pds_config";
        uelVar.b(qdx.d("DestSharedFiles", yqtVar));
        Uri uriA = uelVar.a();
        uriA.getClass();
        return uriA;
    }
}
