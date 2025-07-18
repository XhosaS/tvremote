package defpackage;

import java.util.Calendar;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfb extends cfc {
    private final cfa c;

    public cfb(ccy ccyVar, int i, cfa cfaVar) {
        super(ccyVar, i);
        this.c = cfaVar;
        StringBuilder sb = new StringBuilder("%");
        ccyVar.f(sb);
        sb.append(true != ccyVar.d() ? 't' : 'T');
        sb.append(cfaVar.G);
    }

    @Override // defpackage.cfc
    public final void a(cfg cfgVar, Object obj) {
        cfa cfaVar = this.c;
        if (!(obj instanceof Date) && !(obj instanceof Calendar) && !(obj instanceof Long)) {
            cfg.c(cfgVar.d, obj, "%t" + cfaVar.G);
            return;
        }
        ccy ccyVar = this.b;
        StringBuilder sb = new StringBuilder("%");
        ccyVar.f(sb);
        sb.append(true != ccyVar.d() ? 't' : 'T');
        sb.append(cfaVar.G);
        cfgVar.d.append(String.format(cdf.a, sb.toString(), obj));
    }
}
