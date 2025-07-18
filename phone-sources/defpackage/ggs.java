package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggs {
    public static final /* synthetic */ int a = 0;
    private static final String[] b = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};

    /* JADX WARN: Removed duplicated region for block: B:48:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.Set a(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ggs.a(java.lang.String):java.util.Set");
    }

    public static final ggw b(gic gicVar, String str) throws Exception {
        long j;
        Map mapE;
        Set set;
        int i;
        String str2;
        Throwable th;
        ggv ggvVar;
        gic gicVar2 = gicVar;
        ghi ghiVarA = gicVar2.a(a.cg(str, "PRAGMA table_info(`", "`)"));
        try {
            long j2 = 0;
            String str3 = "name";
            if (ghiVarA.l()) {
                int iH = gez.H(ghiVarA, "name");
                int iH2 = gez.H(ghiVarA, "type");
                int iH3 = gez.H(ghiVarA, "notnull");
                int iH4 = gez.H(ghiVarA, "pk");
                int iH5 = gez.H(ghiVarA, "dflt_value");
                yhu yhuVar = new yhu();
                while (true) {
                    String strD = ghiVarA.d(iH);
                    j = j2;
                    yhuVar.put(strD, new ggt(strD, ghiVarA.d(iH2), ghiVarA.b(iH3) != j2, (int) ghiVarA.b(iH4), ghiVarA.k(iH5) ? null : ghiVarA.d(iH5), 2));
                    if (!ghiVarA.l()) {
                        break;
                    }
                    gicVar2 = gicVar;
                    j2 = j;
                }
                mapE = yhuVar.e();
                wef.r(ghiVarA, null);
            } else {
                mapE = yhc.a;
                wef.r(ghiVarA, null);
                j = 0;
            }
            ghiVarA = gicVar2.a(a.cg(str, "PRAGMA foreign_key_list(`", "`)"));
            try {
                int iH6 = gez.H(ghiVarA, "id");
                int iH7 = gez.H(ghiVarA, "seq");
                int iH8 = gez.H(ghiVarA, "table");
                int iH9 = gez.H(ghiVarA, "on_delete");
                int iH10 = gez.H(ghiVarA, "on_update");
                int iH11 = gez.H(ghiVarA, "id");
                int iH12 = gez.H(ghiVarA, "seq");
                int iH13 = gez.H(ghiVarA, "from");
                int iH14 = gez.H(ghiVarA, "to");
                Map map = mapE;
                yhp yhpVar = new yhp((byte[]) null);
                while (ghiVarA.l()) {
                    yhpVar.add(new ggq((int) ghiVarA.b(iH11), (int) ghiVarA.b(iH12), ghiVarA.d(iH13), ghiVarA.d(iH14)));
                    iH9 = iH9;
                    str3 = str3;
                }
                int i2 = iH9;
                String str4 = str3;
                List listAi = yfm.ai(yfm.o(yhpVar));
                ghiVarA.j();
                yia yiaVar = new yia();
                while (ghiVarA.l()) {
                    if (ghiVarA.b(iH7) == j) {
                        int iB = (int) ghiVarA.b(iH6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList<ggq> arrayList3 = new ArrayList();
                        for (Object obj : listAi) {
                            if (((ggq) obj).a == iB) {
                                arrayList3.add(obj);
                            }
                        }
                        for (ggq ggqVar : arrayList3) {
                            arrayList.add(ggqVar.b);
                            arrayList2.add(ggqVar.c);
                        }
                        int i3 = i2;
                        yiaVar.add(new ggu(ghiVarA.d(iH8), ghiVarA.d(i3), ghiVarA.d(iH10), arrayList, arrayList2));
                        i2 = i3;
                    }
                }
                Set setAi = wcq.ai(yiaVar);
                wef.r(ghiVarA, null);
                gic gicVar3 = gicVar;
                ghiVarA = gicVar3.a(a.cg(str, "PRAGMA index_list(`", "`)"));
                String str5 = str4;
                try {
                    int iH15 = gez.H(ghiVarA, str5);
                    int iH16 = gez.H(ghiVarA, "origin");
                    int iH17 = gez.H(ghiVarA, "unique");
                    if (iH15 == -1 || iH16 == -1 || iH17 == -1) {
                        wef.r(ghiVarA, null);
                        set = null;
                    } else {
                        yia yiaVar2 = new yia();
                        while (true) {
                            if (!ghiVarA.l()) {
                                Set setAi2 = wcq.ai(yiaVar2);
                                wef.r(ghiVarA, null);
                                set = setAi2;
                                break;
                            }
                            if (yks.e("c", ghiVarA.d(iH16))) {
                                String strD2 = ghiVarA.d(iH15);
                                boolean z = ghiVarA.b(iH17) == 1;
                                ghiVarA = gicVar3.a(a.cg(strD2, "PRAGMA index_xinfo(`", "`)"));
                                try {
                                    int iH18 = gez.H(ghiVarA, "seqno");
                                    int iH19 = gez.H(ghiVarA, "cid");
                                    int iH20 = gez.H(ghiVarA, str5);
                                    int i4 = iH15;
                                    int iH21 = gez.H(ghiVarA, "desc");
                                    int i5 = iH16;
                                    if (iH18 == -1 || iH19 == -1 || iH20 == -1 || iH21 == -1) {
                                        i = iH17;
                                        str2 = str5;
                                        th = null;
                                        wef.r(ghiVarA, null);
                                        ggvVar = null;
                                    } else {
                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        i = iH17;
                                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                        while (ghiVarA.l()) {
                                            String str6 = str5;
                                            if (((int) ghiVarA.b(iH19)) >= 0) {
                                                int iB2 = (int) ghiVarA.b(iH18);
                                                String strD3 = ghiVarA.d(iH20);
                                                String str7 = ghiVarA.b(iH21) > j ? "DESC" : "ASC";
                                                Integer numValueOf = Integer.valueOf(iB2);
                                                linkedHashMap.put(numValueOf, strD3);
                                                linkedHashMap2.put(numValueOf, str7);
                                                str5 = str6;
                                                iH21 = iH21;
                                            } else {
                                                str5 = str6;
                                            }
                                        }
                                        str2 = str5;
                                        List listAj = yfm.aj(linkedHashMap.entrySet(), new fab(5));
                                        ArrayList arrayList4 = new ArrayList(yfm.z(listAj, 10));
                                        Iterator it = listAj.iterator();
                                        while (it.hasNext()) {
                                            arrayList4.add((String) ((Map.Entry) it.next()).getValue());
                                        }
                                        List listAl = yfm.al(arrayList4);
                                        List listAj2 = yfm.aj(linkedHashMap2.entrySet(), new fab(6));
                                        ArrayList arrayList5 = new ArrayList(yfm.z(listAj2, 10));
                                        Iterator it2 = listAj2.iterator();
                                        while (it2.hasNext()) {
                                            arrayList5.add((String) ((Map.Entry) it2.next()).getValue());
                                        }
                                        ggvVar = new ggv(strD2, z, listAl, yfm.al(arrayList5));
                                        wef.r(ghiVarA, null);
                                        th = null;
                                    }
                                    if (ggvVar == null) {
                                        wef.r(ghiVarA, th);
                                        set = null;
                                        break;
                                    }
                                    yiaVar2.add(ggvVar);
                                    gicVar3 = gicVar;
                                    iH15 = i4;
                                    iH16 = i5;
                                    iH17 = i;
                                    str5 = str2;
                                } finally {
                                }
                            } else {
                                gicVar3 = gicVar;
                            }
                        }
                    }
                    return new ggw(str, map, setAi, set);
                } finally {
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }
}
