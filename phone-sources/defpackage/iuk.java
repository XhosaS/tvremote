package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iuk implements itj {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public iuk(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.itj
    public final void a(ith ithVar) {
        iwu iwuVar;
        iwu iwuVar2;
        if (this.b != 0) {
            iui iuiVar = (iui) this.a;
            iuiVar.h();
            if (yks.e(ithVar, iuiVar.g) || (iwuVar2 = ((iua) ithVar).j) == null) {
                return;
            }
            iwuVar2.a(iuiVar.k);
            return;
        }
        iul iulVar = (iul) this.a;
        iulVar.c();
        if (yks.e(ithVar, iulVar.f) || (iwuVar = ((iua) ithVar).j) == null) {
            return;
        }
        iwuVar.a(iulVar.j);
    }
}
