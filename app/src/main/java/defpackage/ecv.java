package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ecv extends dyc {
    final /* synthetic */ String a;
    final /* synthetic */ edf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ecv(edf edfVar, String str) {
        super(false);
        this.a = str;
        this.c = edfVar;
        boolean z = ebc.a;
    }

    @Override // defpackage.dyc
    public final void a(dyc dycVar) {
        edf edfVar = this.c;
        ecq ecqVar = edfVar.k;
        if (ecqVar == null) {
            throw new IllegalStateException("You cannot call requestFocus methods before dataBound() is called!");
        }
        String str = this.a;
        edc edcVarC = edfVar.c(ecqVar, str, 0);
        if (edcVarC == null) {
            throw new ecs("Did not find section with key '" + str + "'! Currently bound section's global key is '" + edfVar.k.k + "'");
        }
        int i = edcVarC.a.i;
        if (i <= 0) {
            dsr.b(2, a.b(i, "You are trying to request focus with offset on an index that is out of bounds: requested 0 , total "));
            return;
        }
        ecl eclVar = edfVar.e;
        int i2 = edcVarC.b;
        if (eclVar.c()) {
            eclVar.a.c(i2);
        } else {
            eclVar.b = new eck(i2);
        }
    }
}
