package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahae implements ahao {
    private final ahad[] a;

    public ahae(ahad[] ahadVarArr) {
        this.a = ahadVarArr;
    }

    public final void a() {
        int i = 0;
        while (true) {
            ahad[] ahadVarArr = this.a;
            if (i >= ahadVarArr.length) {
                return;
            }
            ahcn ahcnVar = ahadVarArr[i].a;
            if (ahcnVar == null) {
                agvy.b("handle");
                ahcnVar = null;
            }
            ahcnVar.fn();
            i++;
        }
    }

    @Override // defpackage.ahao
    public final void b(Throwable th) {
        a();
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.a + "]";
    }
}
