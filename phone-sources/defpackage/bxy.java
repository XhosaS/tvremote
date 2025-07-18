package defpackage;

import android.util.Pair;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.io.File;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxy implements Comparator {
    private final /* synthetic */ int j;
    public static final bxy i = new bxy(20);
    public static final bxy h = new bxy(15);
    public static final bxy g = new bxy(14);
    public static final bxy f = new bxy(11);
    public static final bxy e = new bxy(5);
    public static final bxy d = new bxy(4);
    public static final bxy c = new bxy(3);
    public static final bxy b = new bxy(2);
    public static final bxy a = new bxy(1);

    public bxy(int i2) {
        this.j = i2;
    }

    private static final bfz a(bys bysVar) {
        bfz bfzVar = new bfz(new bys[16], 0);
        while (bysVar != null) {
            bfzVar.g(0, bysVar);
            bysVar = bysVar.j();
        }
        return bfzVar;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int i2 = 0;
        switch (this.j) {
            case 0:
                bys bysVar = (bys) obj;
                bys bysVar2 = (bys) obj2;
                int iA = yks.a(bysVar.k, bysVar2.k);
                return iA != 0 ? iA : yks.a(bysVar.hashCode(), bysVar2.hashCode());
            case 1:
                bmr bmrVar = (bmr) obj;
                bmr bmrVar2 = (bmr) obj2;
                if (!d.J(bmrVar) || !d.J(bmrVar2)) {
                    if (d.J(bmrVar)) {
                        return -1;
                    }
                    return d.J(bmrVar2) ? 1 : 0;
                }
                bys bysVarI = fh.I(bmrVar);
                bys bysVarI2 = fh.I(bmrVar2);
                if (yks.e(bysVarI, bysVarI2)) {
                    return 0;
                }
                bfz bfzVarA = a(bysVarI);
                bfz bfzVarA2 = a(bysVarI2);
                int iMin = Math.min(bfzVarA.b - 1, bfzVarA2.b - 1);
                if (iMin >= 0) {
                    while (yks.e(bfzVarA.a[i2], bfzVarA2.a[i2])) {
                        if (i2 != iMin) {
                            i2++;
                        }
                    }
                    return yks.a(((bys) bfzVarA.a[i2]).f(), ((bys) bfzVarA2.a[i2]).f());
                }
                throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
            case 2:
                bys bysVar3 = (bys) obj;
                bys bysVar4 = (bys) obj2;
                int iA2 = yks.a(bysVar4.k, bysVar3.k);
                return iA2 != 0 ? iA2 : yks.a(bysVar3.hashCode(), bysVar4.hashCode());
            case 3:
                bmy bmyVarD = ((cff) obj).d();
                bmy bmyVarD2 = ((cff) obj2).d();
                int iCompare = Float.compare(bmyVarD.b, bmyVarD2.b);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(bmyVarD.c, bmyVarD2.c);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(bmyVarD.e, bmyVarD2.e);
                return iCompare3 != 0 ? iCompare3 : Float.compare(bmyVarD.d, bmyVarD2.d);
            case 4:
                bmy bmyVarD3 = ((cff) obj).d();
                bmy bmyVarD4 = ((cff) obj2).d();
                int iCompare4 = Float.compare(bmyVarD4.d, bmyVarD3.d);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(bmyVarD3.c, bmyVarD4.c);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(bmyVarD3.e, bmyVarD4.e);
                return iCompare6 != 0 ? iCompare6 : Float.compare(bmyVarD4.b, bmyVarD3.b);
            case 5:
                bmy bmyVar = (bmy) ((yfw) obj).a;
                float f2 = bmyVar.c;
                bmy bmyVar2 = (bmy) ((yfw) obj2).a;
                int iCompare7 = Float.compare(f2, bmyVar2.c);
                return iCompare7 != 0 ? iCompare7 : Float.compare(bmyVar.e, bmyVar2.e);
            case 6:
                return ((coy) obj).c - ((coy) obj2).c;
            case 7:
                int[] iArr = cww.a;
                float fB = cwm.b((View) obj);
                float fB2 = cwm.b((View) obj2);
                if (fB > fB2) {
                    return -1;
                }
                return fB < fB2 ? 1 : 0;
            case 8:
                return ((gci) obj2).a() - ((gci) obj).a();
            case 9:
                return ((glp) obj).b - ((glp) obj2).b;
            case 10:
                return ((int[]) obj)[0] - ((int[]) obj2)[0];
            case 11:
                return ((kwz) obj).E().compareTo(((kwz) obj2).E());
            case 12:
                kuo kuoVar = (kuo) obj;
                kuo kuoVar2 = (kuo) obj2;
                int iCompareTo = kuoVar.s.compareTo(kuoVar2.s);
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = kuoVar.k.compareTo(kuoVar2.k);
                if (iCompareTo2 != 0) {
                    return iCompareTo2;
                }
                int iA3 = lxw.a(kuoVar.p, kuoVar2.p);
                return iA3 != 0 ? iA3 : lxw.a(kuoVar.n, kuoVar2.n);
            case 13:
                return lxw.a(((kwl) obj).k, ((kwl) obj2).k);
            case 14:
                return ((gb) obj).a - ((gb) obj2).a;
            case 15:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                if (pair == pair2) {
                    return 0;
                }
                if (pair == null) {
                    return -1;
                }
                if (pair2 == null) {
                    return 1;
                }
                int iIntValue = ((Integer) pair2.second).intValue() - ((Integer) pair.second).intValue();
                return iIntValue != 0 ? iIntValue : ((lws) pair.first).a - ((lws) pair2.first).a;
            case 16:
                return ((Scope) obj).b.compareTo(((Scope) obj2).b);
            case 17:
                return ((srk) obj).c - ((srk) obj2).c;
            case 18:
                return Double.compare(((wfz) obj2).a, ((wfz) obj).a);
            case 19:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            default:
                File file = (File) obj;
                File file2 = (File) obj2;
                if (file.lastModified() == file2.lastModified()) {
                    return 0;
                }
                return file.lastModified() < file2.lastModified() ? -1 : 1;
        }
    }
}
