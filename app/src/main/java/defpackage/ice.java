package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ice {
    public final icg a(String str) {
        str.getClass();
        icg icgVar = (icg) icg.b.get(str);
        if (icgVar != null) {
            return icgVar;
        }
        throw new IllegalArgumentException(a.e(str, "No KatnissSetting for key \"", "\""));
    }

    public final void b(icg icgVar, int i) {
        int i2 = icgVar.x;
        if (i2 == i) {
            return;
        }
        throw new IllegalArgumentException(icgVar + " type is expected to be " + ((Object) icf.a(i)) + " but is " + ((Object) icf.a(i2)));
    }
}
