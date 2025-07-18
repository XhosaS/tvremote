package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddk extends czr {
    private final ddj[] a;

    public ddk(ddj ddjVar) {
        this.a = new ddj[]{ddjVar};
    }

    public static ddk a(Object obj) {
        if (obj != null) {
            return new ddk(dag.j(obj));
        }
        return null;
    }

    public static ddk c(dal dalVar) {
        return new ddk(dag.m(dalVar, false));
    }

    public final ddj[] b() {
        ddj[] ddjVarArr = this.a;
        int length = ddjVarArr.length;
        ddj[] ddjVarArr2 = new ddj[length];
        System.arraycopy(ddjVarArr, 0, ddjVarArr2, 0, length);
        return ddjVarArr2;
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        return new dbk(this.a);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("GeneralNames:");
        String str = doj.a;
        stringBuffer.append(str);
        int i = 0;
        while (true) {
            ddj[] ddjVarArr = this.a;
            if (i == ddjVarArr.length) {
                return stringBuffer.toString();
            }
            stringBuffer.append("    ");
            stringBuffer.append(ddjVarArr[i]);
            stringBuffer.append(str);
            i++;
        }
    }

    private ddk(dag dagVar) {
        this.a = new ddj[dagVar.b()];
        for (int i = 0; i != dagVar.b(); i++) {
            this.a[i] = ddj.a(dagVar.h(i));
        }
    }
}
