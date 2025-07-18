package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class yqg extends yql implements yqe {
    private final boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yqg(yqe yqeVar) {
        yql yqlVarE;
        super(true);
        boolean z = true;
        I(yqeVar);
        yoj yojVarF = F();
        yok yokVar = yojVarF instanceof yok ? (yok) yojVarF : null;
        if (yokVar == null || (yqlVarE = yokVar.e()) == null) {
            z = false;
            break;
        }
        while (!yqlVarE.eH()) {
            yoj yojVarF2 = yqlVarE.F();
            yok yokVar2 = yojVarF2 instanceof yok ? (yok) yojVarF2 : null;
            if (yokVar2 == null || (yqlVarE = yokVar2.e()) == null) {
                z = false;
                break;
            }
        }
        this.a = z;
    }

    @Override // defpackage.yql
    public final boolean eB() {
        return true;
    }

    @Override // defpackage.yql
    public final boolean eH() {
        return this.a;
    }
}
