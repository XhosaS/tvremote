package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class etr implements eze {
    @Override // defpackage.eze
    public final ezf[] a(epm[] epmVarArr, ezm ezmVar) {
        ezf[] ezfVarArr = new ezf[epmVarArr.length];
        for (int i = 0; i < epmVarArr.length; i++) {
            epm epmVar = epmVarArr[i];
            ezfVarArr[i] = epmVar == null ? null : new ets((eba) epmVar.a, (int[]) epmVar.b);
        }
        return ezfVarArr;
    }
}
