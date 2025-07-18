package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ynz implements yod {
    private final yny[] a;

    public ynz(yny[] ynyVarArr) {
        this.a = ynyVarArr;
    }

    public final void a() {
        int i = 0;
        while (true) {
            yny[] ynyVarArr = this.a;
            if (i >= ynyVarArr.length) {
                return;
            }
            ypm ypmVar = ynyVarArr[i].a;
            if (ypmVar == null) {
                yks.c("handle");
                ypmVar = null;
            }
            ypmVar.eD();
            i++;
        }
    }

    @Override // defpackage.yod
    public final void b(Throwable th) {
        a();
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.a + "]";
    }
}
