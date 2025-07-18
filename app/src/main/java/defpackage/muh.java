package defpackage;

import android.util.SparseArray;
import com.google.android.libraries.elements.converters.properties.ClassPropertiesConverter;
import com.google.protobuf.ExtensionRegistryLite;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class muh implements oea {
    private static final yzq a = yzq.u(224886694, 287553821, Integer.valueOf(adal.b.d.b), Integer.valueOf(acxt.c.d.b), 316055719, 268941992, 258411896, 338763089, 351165658);
    private final SparseArray b = new SparseArray();
    private final SparseArray c = new SparseArray();
    private final Map d;
    private final ClassPropertiesConverter e;
    private final yzq f;
    private final oco g;

    public muh(List list, List list2, List list3, oco ocoVar) {
        this.g = ocoVar;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            oec oecVar = (oec) it.next();
            this.b.put(oecVar.a().a, oecVar);
        }
        zdm zdmVarListIterator = ((yyk) list2).listIterator(0);
        while (zdmVarListIterator.hasNext()) {
            oec oecVar2 = (oec) zdmVarListIterator.next();
            this.c.put(oecVar2.a().a, oecVar2);
        }
        HashSet hashSet = new HashSet();
        yzo yzoVar = new yzo();
        int i = ((zcg) list3).d;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = ((abxc) ((oeb) list3.get(i2)).a()).d.b;
            Integer numValueOf = Integer.valueOf(i3);
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
                acvxVar.a(i3);
                ocoVar.a((acwg) acvxVar.v(), "Multiple property converters found and will be removed for extension.", new Object[0]);
            }
        }
        yzq yzqVarF = yzoVar.f();
        this.f = yzqVarF;
        yyn yynVar = new yyn(4);
        zdm zdmVarListIterator2 = ((yyk) list3).listIterator(0);
        while (zdmVarListIterator2.hasNext()) {
            oeb oebVar = (oeb) zdmVarListIterator2.next();
            Integer numValueOf2 = Integer.valueOf(((abxc) oebVar.a()).d.b);
            if (!yzqVarF.contains(numValueOf2)) {
                yynVar.c(numValueOf2, oebVar);
            }
        }
        this.d = yynVar.a(true);
        Boolean bool = false;
        bool.getClass();
        this.e = new ClassPropertiesConverter(ocoVar);
    }

    private final void b(dru druVar, oal oalVar, String str, nlr nlrVar, obz obzVar, SparseArray sparseArray, nzw nzwVar) {
        mii miiVar = niv.O;
        niv nivVar = nlrVar.b(miiVar) ? (niv) nlrVar.a(miiVar) : null;
        for (int i : nlrVar.f()) {
            if (mij.a(i)) {
                oec oecVar = (oec) sparseArray.get(i);
                if (oecVar != null) {
                    try {
                        oecVar.c(druVar, oalVar, str, nivVar, nlrVar.a(oecVar.a()), obzVar, nzwVar);
                    } catch (Exception e) {
                        c(e, oalVar);
                    }
                }
            }
        }
    }

    private final void c(Exception exc, oal oalVar) {
        this.g.d(acsw.LOG_TYPE_PROPERTY_RESOLUTION_ERROR, oalVar, exc, "Property error", new Object[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oea
    public final void a(dru druVar, oal oalVar, String str, nlr nlrVar, obz obzVar, nzw nzwVar) {
        if (nlrVar == null) {
            return;
        }
        nfr nfrVar = (nfr) nlrVar.a(nfr.E);
        if (nfrVar != null && nfrVar.g()) {
            this.e.a.b(acsw.LOG_TYPE_INVALID_FIELD, oalVar, "Failed to get getStylesheetId from conversionContext.", new Object[0]);
        }
        b(druVar, oalVar, str, nlrVar, obzVar, this.b, nzwVar);
        b(druVar, oalVar, str, nlrVar, obzVar, this.c, nzwVar);
        oal oalVar2 = oalVar;
        int[] iArrF = nlrVar.f();
        int length = iArrF.length;
        int i = 0;
        while (i < length) {
            int i2 = iArrF[i];
            if (i2 != 503223997 && !mij.a(i2)) {
                Map map = this.d;
                Integer numValueOf = Integer.valueOf(i2);
                oeb oebVar = (oeb) map.get(numValueOf);
                if (oebVar != null) {
                    try {
                        zdm zdmVarListIterator = nlrVar.d(i2).listIterator(0);
                        while (zdmVarListIterator.hasNext()) {
                            oebVar.b(druVar, oalVar2, str, ogw.b(abvt.Q((ByteBuffer) zdmVarListIterator.next()), ((abxc) oebVar.a()).c.i(), ExtensionRegistryLite.getGeneratedRegistry()), obzVar, nzwVar);
                        }
                    } catch (abxv e) {
                        acwg acwgVar = acwg.a;
                        acvx acvxVar = new acvx();
                        acsw acswVar = acsw.LOG_TYPE_WIRE_FORMAT_ERROR;
                        if ((acvxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            acvxVar.y();
                        }
                        acwg acwgVar2 = (acwg) acvxVar.b;
                        acwgVar2.c = acswVar.E;
                        acwgVar2.b |= 2;
                        acvxVar.a(i2);
                        this.g.e((acwg) acvxVar.v(), oalVar2, e, "Failed to set PB Property Extension in PropertiesConverterFlat.", new Object[0]);
                    } catch (Exception e2) {
                        c(e2, oalVar2);
                    }
                } else if (!a.contains(numValueOf)) {
                    if (this.f.contains(numValueOf)) {
                        acwg acwgVar3 = acwg.a;
                        acvx acvxVar2 = new acvx();
                        acsw acswVar2 = acsw.LOG_TYPE_CONFIGURATION_ERROR;
                        if ((acvxVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            acvxVar2.y();
                        }
                        acwg acwgVar4 = (acwg) acvxVar2.b;
                        acwgVar4.c = acswVar2.E;
                        acwgVar4.b |= 2;
                        acvxVar2.a(i2);
                        this.g.c((acwg) acvxVar2.v(), oalVar2, "No proto converter found for extension due to having duplicate converter bindings.", new Object[0]);
                    } else {
                        acwg acwgVar5 = acwg.a;
                        acvx acvxVar3 = new acvx();
                        acsw acswVar3 = acsw.LOG_TYPE_CONFIGURATION_ERROR;
                        if ((acvxVar3.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            acvxVar3.y();
                        }
                        acwg acwgVar6 = (acwg) acvxVar3.b;
                        acwgVar6.c = acswVar3.E;
                        acwgVar6.b |= 2;
                        acvxVar3.a(i2);
                        this.g.c((acwg) acvxVar3.v(), oalVar2, "No proto converter found for extension.", new Object[0]);
                    }
                }
            }
            i++;
            oalVar2 = oalVar;
        }
    }
}
