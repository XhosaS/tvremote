package defpackage;

import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mzu implements ieh {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ mzu(ieh iehVar, idw idwVar, int i) {
        this.c = i;
        this.b = iehVar;
        this.a = idwVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [iea, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [ieh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [iea, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [idw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, lio] */
    @Override // defpackage.ieh
    public final Object a() {
        int i = this.c;
        if (i == 0) {
            return (ieg) this.a.b((ieg) this.b.a());
        }
        if (i != 1) {
            ?? r0 = this.b;
            return (((ieg) r0.a()).m() && this.a.b((kxc) ((ieg) r0.a()).g())) ? ((kxc) ((ieg) r0.a()).g()).G() : Collections.EMPTY_LIST;
        }
        ?? r02 = this.a;
        boolean zM = ((ieg) r02.a()).m();
        ?? r2 = this.b;
        return zM ? new lif(liq.i(402, (kwl) ((ieg) r02.a()).g()), (lio) r2) : r2;
    }

    public /* synthetic */ mzu(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
