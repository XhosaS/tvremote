package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cvn extends cvi {
    protected final String a() {
        cvn cvnVarB;
        int i = cvl.a;
        cvn cvnVar = cvv.a;
        if (this == cvnVar) {
            return "Dispatchers.Main";
        }
        try {
            cvnVarB = cvnVar.b();
        } catch (UnsupportedOperationException unused) {
            cvnVarB = null;
        }
        if (this == cvnVarB) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    public abstract cvn b();

    @Override // defpackage.cvi
    public String toString() {
        String strA = a();
        if (strA != null) {
            return strA;
        }
        return dnx.aw(this) + "@" + dnx.ax(this);
    }
}
