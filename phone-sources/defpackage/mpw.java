package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mpw implements idw {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ mpw(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [idw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [iea, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [idw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [idw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [idw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [idw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v17, types: [iea, java.lang.Object] */
    @Override // defpackage.idw
    public final boolean b(Object obj) {
        int i = this.c;
        if (i == 0) {
            kwn kwnVar = (kwn) obj;
            return ((lhm) this.b).f(kwnVar.d) || this.a.b(kwnVar);
        }
        if (i == 1) {
            kvf kvfVar = (kvf) obj;
            return ((lhm) this.b).f(kvfVar.o()) || this.a.b(kvfVar);
        }
        if (i == 2) {
            kvf kvfVar2 = (kvf) obj;
            return (((lhm) this.b).f(kvfVar2.o()) || this.a.b(kvfVar2)) ? false : true;
        }
        if (i == 3) {
            kwn kwnVar2 = (kwn) obj;
            return (((lhm) this.b).f(kwnVar2.d) || this.a.b(kwnVar2)) ? false : true;
        }
        if (i != 4) {
            return ((Boolean) ((AtomicReference) this.b).get()).booleanValue() || !((List) this.a.a()).isEmpty();
        }
        kwn kwnVar3 = (kwn) obj;
        return ((kva) this.b.a()).c(kwnVar3.d).c && !this.a.b(kwnVar3);
    }
}
