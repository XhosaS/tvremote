package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ilv extends ilw {
    public final ils a;
    public final irh b;
    public final List c;

    public ilv(inm inmVar, ils ilsVar, irh irhVar) {
        irhVar.getClass();
        this.a = ilsVar;
        this.b = irhVar;
        abxs abxsVar = inmVar.b;
        abxsVar.getClass();
        this.c = abxsVar;
    }

    public final axh a(String str, long j) {
        this.a.s();
        axf axfVar = new axf(null);
        axfVar.a = j;
        axfVar.c = str;
        axfVar.b(8, 8);
        axfVar.b(0, 16);
        axfVar.b(0, 32);
        return axfVar.a();
    }
}
