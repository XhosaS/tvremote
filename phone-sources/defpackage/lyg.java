package defpackage;

import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lyg implements idf {
    private final lfn a;
    private final idf b;
    private final idf c;
    private final long d;
    private final lys e;

    public lyg(lys lysVar, lfn lfnVar, idf idfVar, idf idfVar2, long j) {
        this.e = lysVar;
        this.a = lfnVar;
        this.b = idfVar;
        this.c = idfVar2;
        this.d = j;
    }

    @Override // defpackage.idf
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        ieg iegVar = (ieg) this.b.b(obj);
        String strC = this.e.c(iegVar);
        Locale locale = Locale.getDefault();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        return ieg.f(lyf.a(iegVar, strC, locale, jCurrentTimeMillis - this.d, this.a.ap(), jCurrentTimeMillis, (List) this.c.b(obj)));
    }
}
