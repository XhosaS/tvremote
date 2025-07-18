package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sfj {
    public final sfk a(int i) {
        sfk sfkVar;
        sfk[] sfkVarArrValues = sfk.values();
        int length = sfkVarArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                sfkVar = null;
                break;
            }
            sfkVar = sfkVarArrValues[i2];
            if (sfkVar.f == i) {
                break;
            }
            i2++;
        }
        return sfkVar == null ? sfk.b : sfkVar;
    }
}
