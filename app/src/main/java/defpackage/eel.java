package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eel extends ecb {
    public final ejf a;
    private eek b = eek.LOADING;
    private final dru c;

    public eel(dru druVar, ejf ejfVar) {
        this.c = druVar;
        this.a = ejfVar;
    }

    public final synchronized void a(eek eekVar) {
        if (this.b != eekVar) {
            this.b = eekVar;
            dru druVar = this.c;
            int i = eei.K;
            if (druVar.c != null) {
                druVar.k(new dxw(0, eekVar), "updateState:RecyclerCollectionComponent.updateLoadingState");
            }
        }
    }
}
