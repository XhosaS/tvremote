package defpackage;

import java.util.Vector;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zlw extends zix implements zig {
    public static final /* synthetic */ int b = 0;
    private static final zly c = zma.N;
    public zkq a;
    private boolean d;
    private int e;
    private zly f;
    private zlv[] g;

    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, zly] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, zly] */
    public zlw(String str) {
        zly zlyVar = c;
        zmc zmcVar = new zmc(str, ',');
        zlx zlxVar = new zlx(zlyVar);
        while (true) {
            String strA = zmcVar.a();
            int i = 0;
            if (strA == null) {
                int size = ((Vector) zlxVar.b).size();
                zlv[] zlvVarArr = new zlv[size];
                while (i != size) {
                    zlvVarArr[i] = (zlv) ((Vector) zlxVar.b).elementAt(i);
                    i++;
                }
                this(zlyVar, new zlw((zly) zlxVar.a, zlvVarArr).c());
                this.f = zlyVar;
                return;
            }
            if (strA.indexOf(43) >= 0) {
                zmc zmcVar2 = new zmc(strA, '+');
                String strA2 = zmcVar2.a();
                if (strA2 == null) {
                    throw new IllegalArgumentException("badly formatted directory string");
                }
                if (zmcVar2.b()) {
                    Vector vector = new Vector();
                    Vector vector2 = new Vector();
                    do {
                        zmc zmcVar3 = new zmc(strA2, '=');
                        String strAd = wef.ad(zmcVar3, true);
                        String strAd2 = wef.ad(zmcVar3, false);
                        zjb zjbVarD = zlyVar.d(strAd.trim());
                        String strAe = wef.ae(strAd2);
                        vector.addElement(zjbVarD);
                        vector2.addElement(strAe);
                        strA2 = zmcVar2.a();
                    } while (strA2 != null);
                    int size2 = vector.size();
                    zjb[] zjbVarArr = new zjb[size2];
                    for (int i2 = 0; i2 != size2; i2++) {
                        zjbVarArr[i2] = (zjb) vector.elementAt(i2);
                    }
                    int size3 = vector2.size();
                    String[] strArr = new String[size3];
                    for (int i3 = 0; i3 != size3; i3++) {
                        strArr[i3] = (String) vector2.elementAt(i3);
                    }
                    zih[] zihVarArr = new zih[size3];
                    for (int i4 = 0; i4 != size3; i4++) {
                        zihVarArr[i4] = zlxVar.a.c(zjbVarArr[i4], strArr[i4]);
                    }
                    zlu[] zluVarArr = new zlu[size2];
                    while (i != size2) {
                        zluVarArr[i] = new zlu(zjbVarArr[i], zihVarArr[i]);
                        i++;
                    }
                    ((Vector) zlxVar.b).addElement(new zlv(zluVarArr));
                } else {
                    wef.ag(zlyVar, zlxVar, strA2);
                }
            } else {
                wef.ag(zlyVar, zlxVar, strA);
            }
        }
    }

    public static zlw b(Object obj) {
        if (obj instanceof zlw) {
            return (zlw) obj;
        }
        if (obj == null) {
            return null;
        }
        return new zlw(c, zjm.j(obj));
    }

    public final int a() {
        return this.g.length;
    }

    public final zlv[] c() {
        return (zlv[]) this.g.clone();
    }

    @Override // defpackage.zix
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zlw) && !(obj instanceof zjm)) {
            return false;
        }
        if (this.a.w(((zih) obj).p())) {
            return true;
        }
        try {
            return this.f.e(this, b(obj));
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // defpackage.zix
    public final int hashCode() {
        if (this.d) {
            return this.e;
        }
        this.d = true;
        int iA = this.f.a(this);
        this.e = iA;
        return iA;
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        return this.a;
    }

    public final String toString() {
        return this.f.b(this);
    }

    public zlw(zly zlyVar, zjm zjmVar) {
        zlv zlvVar;
        int iB = zjmVar.b();
        this.f = zlyVar;
        this.g = new zlv[iB];
        boolean z = true;
        for (int i = 0; i < iB; i++) {
            zih zihVarH = zjmVar.h(i);
            if (zihVarH instanceof zlv) {
                zlvVar = (zlv) zihVarH;
            } else {
                zlvVar = zihVarH != null ? new zlv(zjo.g(zihVarH)) : null;
            }
            z &= zlvVar == zihVarH;
            this.g[i] = zlvVar;
        }
        if (z) {
            this.a = (zkq) zjmVar.k();
        } else {
            this.a = new zkq(this.g);
        }
    }

    public zlw(zly zlyVar, zlw zlwVar) {
        this.f = zlyVar;
        this.g = zlwVar.g;
        this.a = zlwVar.a;
    }

    public zlw(zly zlyVar, zlv[] zlvVarArr) {
        this.f = zlyVar;
        this.g = (zlv[]) zlvVarArr.clone();
        this.a = new zkq(this.g);
    }
}
