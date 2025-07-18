package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hay extends haw {
    @Override // defpackage.haw
    public final boolean a(haj hajVar) {
        hjs hjsVar = hajVar.b;
        if ((hjsVar instanceof hae) && ((hae) hjsVar).a <= 100) {
            return false;
        }
        hjs hjsVar2 = hajVar.c;
        return !(hjsVar2 instanceof hae) || ((hae) hjsVar2).a > 100;
    }

    @Override // defpackage.haw
    public final boolean b() {
        return hav.a.a();
    }
}
