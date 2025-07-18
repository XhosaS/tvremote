package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ksa implements kri {
    private final /* synthetic */ int a;
    private final Object b;

    public ksa(ifb ifbVar, int i) {
        this.a = i;
        this.b = ifbVar;
    }

    public static kri c(kri... kriVarArr) {
        return kriVarArr.length == 1 ? kriVarArr[0] : new ksa(kriVarArr, 1);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.kri
    public final void a() {
        if (this.a == 0) {
            ((ifb) this.b).b();
            return;
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((kri) it.next()).a();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.kri
    public final void b() {
        if (this.a == 0) {
            ((ifb) this.b).c();
            return;
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((kri) it.next()).b();
        }
    }

    private ksa(kri[] kriVarArr, int i) {
        this.a = i;
        this.b = Arrays.asList(kriVarArr);
    }
}
