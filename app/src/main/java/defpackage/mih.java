package defpackage;

import android.os.Trace;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mih implements oca {
    static final Map a;
    private final SparseArray b = new SparseArray();
    private final SparseArray c = new SparseArray();
    private final yzq d;
    private final oco e;
    private final oap f;
    private final boolean g;

    static {
        HashMap map = new HashMap();
        map.put(192475008, "AnimatedVectorType");
        map.put(160982084, "CellType");
        map.put(158796298, "CollectionType");
        map.put(158796327, "ContainerType");
        map.put(191923252, "EditableTextType");
        map.put(158796345, "ImageType");
        map.put(158796380, "TextType");
        map.put(193805739, "ExpandableTextType");
        map.put(197633010, "ScrollableContainerType");
        a = yyr.j(map);
    }

    public mih(Map map, Map map2, Set set, oco ocoVar, yqt yqtVar) {
        Boolean bool = false;
        bool.getClass();
        bool.getClass();
        for (och ochVar : ((yyr) map).values()) {
            this.b.put(ochVar.a().a, ochVar);
        }
        yxo<ocg> yxoVarA = yxo.a(((yyr) map2).values(), set);
        HashSet hashSet = new HashSet();
        yzo yzoVar = new yzo();
        Iterator it = yxoVarA.iterator();
        while (it.hasNext()) {
            int i = ((abxc) ((ocg) it.next()).a()).d.b;
            Integer numValueOf = Integer.valueOf(i);
            if (!hashSet.add(numValueOf)) {
                yzoVar.c(numValueOf);
                acwg acwgVar = acwg.a;
                acvx acvxVar = new acvx();
                acsw acswVar = acsw.LOG_TYPE_CONFIGURATION_ERROR;
                if ((acvxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acvxVar.y();
                }
                acwg acwgVar2 = (acwg) acvxVar.b;
                acwgVar2.c = acswVar.E;
                acwgVar2.b |= 2;
                acvxVar.a(i);
                ocoVar.a((acwg) acvxVar.v(), "Multiple type converters found and removed for extension.", new Object[0]);
            }
        }
        this.d = yzoVar.f();
        for (ocg ocgVar : yxoVarA) {
            int i2 = ((abxc) ocgVar.a()).d.b;
            if (!this.d.contains(Integer.valueOf(i2))) {
                this.c.put(i2, ocgVar);
            }
        }
        bool.getClass();
        this.e = ocoVar;
        Object obj = ((yqz) yqtVar).a;
        this.f = (oap) obj;
        this.g = obj instanceof ogk;
        bool.getClass();
        aarx.a = new ohj(ocoVar);
        aeeg.a.set(false);
        Integer num = 0;
        num.getClass();
    }

    public static void b(final yyk yykVar, oal oalVar) {
        ocq ocqVarP = oalVar.P();
        if (ocqVarP == null || yykVar.isEmpty()) {
            return;
        }
        final tkk tkkVar = (tkk) ocqVarP;
        tkkVar.e.b(new Runnable() { // from class: tke
            @Override // java.lang.Runnable
            public final void run() {
                tkkVar.h.a(tks.b.b(yykVar));
            }
        }, "GilElementsInteractionLogger", "attachNodes");
    }

    private final int e(nnf nnfVar) {
        if (this.g) {
            return nnfVar.c();
        }
        int[] iArrF = nnfVar.f();
        if (iArrF.length == 0) {
            return 0;
        }
        return iArrF[0];
    }

    private final List f(dru druVar, oal oalVar, nid nidVar, final obk obkVar, List list, boolean z) {
        int i;
        drq drqVarD;
        oal oalVar2 = oalVar;
        int iG = nidVar.g();
        if (iG == 0) {
            int i2 = yyk.e;
            return zcg.b;
        }
        ArrayList arrayList = new ArrayList(Collections.nCopies(iG, null));
        ArrayList arrayList2 = new ArrayList(iG);
        for (int i3 = 0; i3 < iG; i3++) {
            arrayList2.add(Integer.valueOf(i3));
        }
        if (!z) {
            Collections.shuffle(arrayList2);
        }
        final mon monVar = new mon();
        int i4 = 0;
        while (i4 < iG) {
            final int iIntValue = ((Integer) arrayList2.get(i4)).intValue();
            final nid nidVarH = nidVar.h(iIntValue);
            if (z) {
                ogs ogsVarAA = ogu.aA(druVar);
                ogsVarAA.c(new ogh() { // from class: mig
                    @Override // defpackage.ogh
                    public final drq a(dru druVar2, oal oalVar3) {
                        ArrayList arrayList3 = new ArrayList();
                        drq drqVarD2 = this.a.d(druVar2, oalVar3, nidVarH, obkVar, arrayList3, iIntValue, monVar);
                        mih.b(yyk.j(arrayList3), oalVar3);
                        return drqVarD2;
                    }
                });
                ogsVarAA.d(oalVar2);
                if (((nyx) oalVar2).q != null) {
                    ogsVarAA.a.a = false;
                }
                drqVarD = ogsVarAA.a();
                i = i4;
            } else {
                i = i4;
                drqVarD = d(druVar, oalVar2, nidVarH, obkVar, list, iIntValue, monVar);
            }
            arrayList.set(((Integer) arrayList2.get(i)).intValue(), drqVarD);
            i4 = i + 1;
            oalVar2 = oalVar;
        }
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (Object obj : arrayList) {
            if (obj != null) {
                arrayList3.add(obj);
            }
        }
        return arrayList3;
    }

    @Override // defpackage.oca
    public final drq a(dru druVar, oal oalVar, nid nidVar, obk obkVar, aggh agghVar) {
        String strS = oalVar.S("null");
        StringBuilder sb = new StringBuilder("toComponent|eml=");
        sb.append(strS);
        sb.append("|rooteml=");
        nyx nyxVar = (nyx) oalVar;
        sb.append(nyxVar.j);
        btt.b(sb.toString());
        ofl oflVar = nyxVar.e;
        ofl oflVar2 = ofl.a;
        if (oflVar == null) {
            oflVar = oflVar2;
        }
        ArrayList arrayList = new ArrayList();
        drq drqVarD = d(druVar, oalVar, nidVar, obkVar, arrayList, 0, new mon());
        mhx mhxVar = new mhx(druVar, new mhy());
        mhy mhyVar = mhxVar.a;
        mhyVar.c = drqVarD.l();
        BitSet bitSet = mhxVar.d;
        bitSet.set(1);
        mhyVar.d = this;
        bitSet.set(2);
        mhyVar.e = oflVar;
        bitSet.set(3);
        mhyVar.a = agghVar;
        bitSet.set(0);
        if (obkVar != null) {
            mhyVar.b = obkVar;
        }
        if (nidVar.l() && !nidVar.k().equals("deprecated_option_force_clip_bounds")) {
            mhxVar.y(nidVar.k());
        }
        b(yyk.j(arrayList), oalVar);
        mhy mhyVarA = mhxVar.a();
        Trace.endSection();
        return mhyVarA;
    }

    @Override // defpackage.oca
    public final drq c(dru druVar, oal oalVar, byte[] bArr, aggh agghVar) {
        if (oalVar == null) {
            oalVar = oal.A;
        }
        nyw nywVar = new nyw(oalVar);
        nywVar.f = agghVar;
        oal oalVarG = nywVar.g();
        try {
            return a(druVar, oalVarG, this.f.b(bArr), null, agghVar);
        } catch (IOException e) {
            this.e.d(acsw.LOG_TYPE_INTERNAL_ERROR, oalVarG, e, "Failed to parse Element.", new Object[0]);
            return efx.aA(druVar).a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0488  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.drq d(defpackage.dru r17, defpackage.oal r18, defpackage.nid r19, defpackage.obk r20, java.util.List r21, int r22, defpackage.mon r23) {
        /*
            Method dump skipped, instructions count: 1214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mih.d(dru, oal, nid, obk, java.util.List, int, mon):drq");
    }
}
