package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agcr {
    public String[] a;
    public String[] b;
    public boolean c;

    public agcr() {
    }

    public final void a(agcq... agcqVarArr) {
        String[] strArr = new String[agcqVarArr.length];
        for (int i = 0; i < agcqVarArr.length; i++) {
            strArr[i] = agcqVarArr[i].bb;
        }
        this.a = strArr;
    }

    public final void b(agde... agdeVarArr) {
        String[] strArr = new String[agdeVarArr.length];
        for (int i = 0; i < agdeVarArr.length; i++) {
            strArr[i] = agdeVarArr[i].f;
        }
        this.b = strArr;
    }

    public agcr(agcs agcsVar) {
        boolean z = agcsVar.b;
        this.a = agcsVar.c;
        this.b = agcsVar.d;
        this.c = agcsVar.e;
    }
}
