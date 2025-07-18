package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class eho extends dxx {

    @eat(a = 3)
    int a;

    @Override // defpackage.dxx
    public final void b(dxw dxwVar) {
        Object[] objArr = dxwVar.b;
        if (dxwVar.a != 0) {
            return;
        }
        dxz dxzVar = new dxz();
        dxzVar.a = Integer.valueOf(this.a);
        Integer num = (Integer) objArr[0];
        num.intValue();
        int i = ejl.b;
        dxzVar.a = num;
        this.a = ((Integer) dxzVar.a).intValue();
    }
}
