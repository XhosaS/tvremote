package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eyv extends ebf {
    public final boolean aA;
    public final boolean aB;
    public final boolean aC;
    public final boolean aD;
    public final SparseArray aE;
    public final SparseBooleanArray aF;
    public final boolean ap;
    public final boolean aq;
    public final boolean ar;
    public final boolean as;
    public final boolean at;
    public final boolean au;
    public final boolean av;
    public final boolean aw;
    public final boolean ax;
    public final boolean ay;
    public final boolean az;
    public static final eyv ao = new eyv(new eyu());
    private static final String aG = edt.Z(1000);
    private static final String aH = edt.Z(1001);
    private static final String aI = edt.Z(1002);
    private static final String aJ = edt.Z(1003);
    private static final String aK = edt.Z(1004);
    private static final String aL = edt.Z(1005);
    private static final String aM = edt.Z(1006);
    private static final String aN = edt.Z(1007);
    private static final String aO = edt.Z(1008);
    private static final String aP = edt.Z(1009);
    private static final String aQ = edt.Z(1010);
    private static final String aR = edt.Z(1011);
    private static final String aS = edt.Z(1012);
    private static final String aT = edt.Z(1013);
    private static final String aU = edt.Z(1014);
    private static final String aV = edt.Z(1015);
    private static final String aW = edt.Z(1016);
    private static final String aX = edt.Z(1017);
    private static final String aY = edt.Z(1018);

    public eyv(eyu eyuVar) {
        super(eyuVar);
        this.ap = eyuVar.F;
        this.aq = false;
        this.ar = eyuVar.G;
        this.as = false;
        this.at = eyuVar.H;
        this.au = false;
        this.av = eyuVar.I;
        this.aw = false;
        this.ax = false;
        this.ay = eyuVar.J;
        this.az = eyuVar.K;
        this.aA = eyuVar.L;
        this.aB = eyuVar.M;
        this.aC = eyuVar.N;
        this.aD = false;
        this.aE = eyuVar.O;
        this.aF = eyuVar.P;
    }

    @Override // defpackage.ebf
    public final Bundle a() {
        Bundle bundleA = super.a();
        bundleA.putBoolean(aG, this.ap);
        int i = 0;
        bundleA.putBoolean(aH, false);
        bundleA.putBoolean(aI, this.ar);
        bundleA.putBoolean(aU, false);
        bundleA.putBoolean(aJ, this.at);
        bundleA.putBoolean(aK, false);
        bundleA.putBoolean(aL, this.av);
        bundleA.putBoolean(aM, false);
        bundleA.putBoolean(aV, false);
        bundleA.putBoolean(aY, this.ay);
        bundleA.putBoolean(aW, this.az);
        bundleA.putBoolean(aN, this.aA);
        bundleA.putBoolean(aO, this.aB);
        bundleA.putBoolean(aP, this.aC);
        bundleA.putBoolean(aX, false);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        SparseArray sparseArray = new SparseArray();
        int i2 = 0;
        while (true) {
            SparseArray sparseArray2 = this.aE;
            if (i2 >= sparseArray2.size()) {
                break;
            }
            int iKeyAt = sparseArray2.keyAt(i2);
            for (Map.Entry entry : ((Map) sparseArray2.valueAt(i2)).entrySet()) {
                eyw eywVar = (eyw) entry.getValue();
                if (eywVar != null) {
                    sparseArray.put(arrayList2.size(), eywVar);
                }
                arrayList2.add((exi) entry.getKey());
                arrayList.add(Integer.valueOf(iKeyAt));
            }
            bundleA.putIntArray(aQ, sfy.ae(arrayList));
            bundleA.putParcelableArrayList(aR, ecm.b(arrayList2, new eyt(1)));
            String str = aS;
            eyt eytVar = new eyt(i);
            SparseArray<? extends Parcelable> sparseArray3 = new SparseArray<>(sparseArray.size());
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                sparseArray3.put(sparseArray.keyAt(i3), (Bundle) eytVar.apply(sparseArray.valueAt(i3)));
            }
            bundleA.putSparseParcelableArray(str, sparseArray3);
            i2++;
        }
        SparseBooleanArray sparseBooleanArray = this.aF;
        String str2 = aT;
        int[] iArr = new int[sparseBooleanArray.size()];
        while (i < sparseBooleanArray.size()) {
            iArr[i] = sparseBooleanArray.keyAt(i);
            i++;
        }
        bundleA.putIntArray(str2, iArr);
        return bundleA;
    }

    @Override // defpackage.ebf
    public final /* synthetic */ ebe b() {
        return new eyu(this);
    }

    public final boolean c(int i) {
        return this.aF.get(i);
    }

    @Override // defpackage.ebf
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            eyv eyvVar = (eyv) obj;
            if (super.equals(eyvVar) && this.ap == eyvVar.ap && this.ar == eyvVar.ar && this.at == eyvVar.at && this.av == eyvVar.av && this.ay == eyvVar.ay && this.az == eyvVar.az && this.aA == eyvVar.aA && this.aB == eyvVar.aB && this.aC == eyvVar.aC) {
                SparseBooleanArray sparseBooleanArray = this.aF;
                SparseBooleanArray sparseBooleanArray2 = eyvVar.aF;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = this.aE;
                            SparseArray sparseArray2 = eyvVar.aE;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i2 = 0; i2 < size2; i2++) {
                                    int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                    if (iIndexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i2);
                                        Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                exi exiVar = (exi) entry.getKey();
                                                if (!map2.containsKey(exiVar) || !Objects.equals(entry.getValue(), map2.get(exiVar))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.ebf
    public final int hashCode() {
        return (((((((((((((((((((super.hashCode() + 31) * 31) + (this.ap ? 1 : 0)) * 961) + (this.ar ? 1 : 0)) * 961) + (this.at ? 1 : 0)) * 961) + (this.av ? 1 : 0)) * 29791) + (this.ay ? 1 : 0)) * 31) + (this.az ? 1 : 0)) * 31) + (this.aA ? 1 : 0)) * 31) + (this.aB ? 1 : 0)) * 31) + (this.aC ? 1 : 0)) * 31;
    }
}
