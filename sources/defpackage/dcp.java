package defpackage;

import java.util.Vector;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcp extends czr implements cza {
    public static final /* synthetic */ int b = 0;
    private static final dcr c = dct.N;
    public dbk a;
    private boolean d;
    private int e;
    private dcr f;
    private dco[] g;

    /* JADX WARN: Type inference failed for: r13v2, types: [dcr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [dcr, java.lang.Object] */
    public dcp(String str) {
        dcr dcrVar = c;
        dcv dcvVar = new dcv(str, ',');
        dcq dcqVar = new dcq(dcrVar);
        while (true) {
            String strA = dcvVar.a();
            int i = 0;
            if (strA == null) {
                int size = ((Vector) dcqVar.b).size();
                dco[] dcoVarArr = new dco[size];
                while (i != size) {
                    dcoVarArr[i] = (dco) ((Vector) dcqVar.b).elementAt(i);
                    i++;
                }
                this(dcrVar, new dcp((dcr) dcqVar.a, dcoVarArr).c());
                this.f = dcrVar;
                return;
            }
            if (strA.indexOf(43) >= 0) {
                dcv dcvVar2 = new dcv(strA, '+');
                String strA2 = dcvVar2.a();
                if (strA2 == null) {
                    throw new IllegalArgumentException("badly formatted directory string");
                }
                if (dcvVar2.b()) {
                    Vector vector = new Vector();
                    Vector vector2 = new Vector();
                    do {
                        dcv dcvVar3 = new dcv(strA2, '=');
                        String strAb = dnx.ab(dcvVar3, true);
                        String strAb2 = dnx.ab(dcvVar3, false);
                        czv czvVarD = dcrVar.d(strAb.trim());
                        String strAc = dnx.ac(strAb2);
                        vector.addElement(czvVarD);
                        vector2.addElement(strAc);
                        strA2 = dcvVar2.a();
                    } while (strA2 != null);
                    int size2 = vector.size();
                    czv[] czvVarArr = new czv[size2];
                    for (int i2 = 0; i2 != size2; i2++) {
                        czvVarArr[i2] = (czv) vector.elementAt(i2);
                    }
                    int size3 = vector2.size();
                    String[] strArr = new String[size3];
                    for (int i3 = 0; i3 != size3; i3++) {
                        strArr[i3] = (String) vector2.elementAt(i3);
                    }
                    czb[] czbVarArr = new czb[size3];
                    for (int i4 = 0; i4 != size3; i4++) {
                        czbVarArr[i4] = dcqVar.a.c(czvVarArr[i4], strArr[i4]);
                    }
                    dcn[] dcnVarArr = new dcn[size2];
                    while (i != size2) {
                        dcnVarArr[i] = new dcn(czvVarArr[i], czbVarArr[i]);
                        i++;
                    }
                    ((Vector) dcqVar.b).addElement(new dco(dcnVarArr));
                } else {
                    dnx.ae(dcrVar, dcqVar, strA2);
                }
            } else {
                dnx.ae(dcrVar, dcqVar, strA);
            }
        }
    }

    public static dcp b(Object obj) {
        if (obj instanceof dcp) {
            return (dcp) obj;
        }
        if (obj == null) {
            return null;
        }
        return new dcp(c, dag.j(obj));
    }

    public final int a() {
        return this.g.length;
    }

    public final dco[] c() {
        return (dco[]) this.g.clone();
    }

    @Override // defpackage.czr
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dcp) && !(obj instanceof dag)) {
            return false;
        }
        if (this.a.w(((czb) obj).p())) {
            return true;
        }
        try {
            return this.f.e(this, b(obj));
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // defpackage.czr
    public final int hashCode() {
        if (this.d) {
            return this.e;
        }
        this.d = true;
        int iA = this.f.a(this);
        this.e = iA;
        return iA;
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        return this.a;
    }

    public final String toString() {
        return this.f.b(this);
    }

    public dcp(dcr dcrVar, dag dagVar) {
        dco dcoVar;
        int iB = dagVar.b();
        this.f = dcrVar;
        this.g = new dco[iB];
        boolean z = true;
        for (int i = 0; i < iB; i++) {
            czb czbVarH = dagVar.h(i);
            if (czbVarH instanceof dco) {
                dcoVar = (dco) czbVarH;
            } else {
                dcoVar = czbVarH != null ? new dco(dai.g(czbVarH)) : null;
            }
            z &= dcoVar == czbVarH;
            this.g[i] = dcoVar;
        }
        if (z) {
            this.a = (dbk) dagVar.k();
        } else {
            this.a = new dbk(this.g);
        }
    }

    public dcp(dcr dcrVar, dcp dcpVar) {
        this.f = dcrVar;
        this.g = dcpVar.g;
        this.a = dcpVar.a;
    }

    public dcp(dcr dcrVar, dco[] dcoVarArr) {
        this.f = dcrVar;
        this.g = (dco[]) dcoVarArr.clone();
        this.a = new dbk(this.g);
    }
}
