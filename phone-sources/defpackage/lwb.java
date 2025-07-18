package defpackage;

import android.content.Context;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lwb implements idf {
    public final /* synthetic */ lfn a;
    public final /* synthetic */ ldv b;
    public final /* synthetic */ idf c;
    public final /* synthetic */ idf d;
    public final /* synthetic */ idf e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ lfx g;
    private final /* synthetic */ int h;

    public /* synthetic */ lwb(lfn lfnVar, Context context, ldv ldvVar, idf idfVar, idf idfVar2, lfx lfxVar, idf idfVar3, int i) {
        this.h = i;
        this.a = lfnVar;
        this.f = context;
        this.b = ldvVar;
        this.c = idfVar;
        this.d = idfVar2;
        this.g = lfxVar;
        this.e = idfVar3;
    }

    @Override // defpackage.idf
    public final Object b(Object obj) {
        if (this.h == 0) {
            lwk lwkVar = (lwk) obj;
            qza qzaVarC = qza.c(-1, lwkVar.b, lwkVar.c, lwkVar.d, lwkVar.f, lwkVar.e, lwkVar.a, this.a.aV());
            idf idfVar = this.c;
            ldv ldvVar = this.b;
            return krh.q(lwkVar, qzaVarC, new lff(ldvVar, idfVar, 2, null), new lbj(krh.t(this.d, this.g, ldvVar), 4), this.e, krh.r(this.f));
        }
        lwk lwkVar2 = (lwk) obj;
        int i = lwkVar2.g;
        String str = lwkVar2.b;
        String str2 = lwkVar2.c;
        Locale locale = lwkVar2.d;
        String str3 = lwkVar2.f;
        int i2 = lwkVar2.e;
        ieg iegVar = lwkVar2.a;
        lfn lfnVar = this.a;
        qza qzaVarC2 = qza.c(i, str, str2, locale, str3, i2, iegVar, lfnVar.aV());
        lwf lwfVar = new lwf();
        Context context = this.f;
        lzh lzhVar = new lzh(lwfVar, new lbj(context, 5));
        idf idfVar2 = this.c;
        ldv ldvVar2 = this.b;
        lwa lwaVar = new lwa(lzhVar, lfnVar.aL(), krh.s(ldvVar2, idfVar2));
        lzh lzhVar2 = new lzh(new lfc((vvq) xag.a.a(7, null), xag.class), new lbj(context, 5));
        lfx lfxVar = this.g;
        return krh.q(lwkVar2, qzaVarC2, lwaVar, new lvy(lzhVar2, lfnVar.aL(), krh.t(this.d, lfxVar, ldvVar2)), this.e, krh.r(context));
    }

    public /* synthetic */ lwb(lfn lfnVar, ldv ldvVar, idf idfVar, idf idfVar2, lfx lfxVar, idf idfVar3, Context context, int i) {
        this.h = i;
        this.a = lfnVar;
        this.b = ldvVar;
        this.c = idfVar;
        this.d = idfVar2;
        this.g = lfxVar;
        this.e = idfVar3;
        this.f = context;
    }
}
