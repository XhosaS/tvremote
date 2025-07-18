package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ahdn extends ahdv implements ahdl {
    private final boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahdn(ahdl ahdlVar) {
        ahdv ahdvVarF;
        super(true);
        boolean z = true;
        I(ahdlVar);
        ahaw ahawVarE = E();
        ahax ahaxVar = ahawVarE instanceof ahax ? (ahax) ahawVarE : null;
        if (ahaxVar == null || (ahdvVarF = ahaxVar.f()) == null) {
            z = false;
            break;
        }
        while (!ahdvVarF.fl()) {
            ahaw ahawVarE2 = ahdvVarF.E();
            ahax ahaxVar2 = ahawVarE2 instanceof ahax ? (ahax) ahawVarE2 : null;
            if (ahaxVar2 == null || (ahdvVarF = ahaxVar2.f()) == null) {
                z = false;
                break;
            }
        }
        this.a = z;
    }

    @Override // defpackage.ahdv
    public final boolean fl() {
        return this.a;
    }

    @Override // defpackage.ahdv
    public final boolean fm() {
        return true;
    }
}
