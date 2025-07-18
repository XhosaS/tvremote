package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qry {
    public static final qry a = new qry(new qsb[0]);
    public final qsb[] b;
    public final int[] c;

    public qry(qsb[] qsbVarArr) {
        this.b = qsbVarArr;
        this.c = new int[qsbVarArr.length];
        for (int i = 0; i < qsbVarArr.length; i++) {
            this.c[i] = qsbVarArr[i].c;
        }
    }
}
