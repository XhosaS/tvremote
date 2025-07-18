package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wbv {
    public static final String a(Map map, wed wedVar) {
        String strA = wedVar.a();
        if (agyv.o(strA, "#")) {
            throw new IllegalStateException("Subpackages should be provided without their base package: ".concat(String.valueOf(strA)));
        }
        String str = (String) map.get(strA);
        return str != null ? a.i(str, strA, "#") : strA;
    }

    private static final String d(Map map, wee weeVar) {
        String strA = weeVar.a();
        if (agyv.o(strA, "#")) {
            throw new IllegalStateException("Subpackages should be provided without their base package: ".concat(strA));
        }
        String str = (String) map.get(strA);
        return str != null ? a.i(str, strA, "#") : strA;
    }

    public final Map b(Map map, Map map2, Map map3, Map map4, Map map5) {
        map4.getClass();
        map5.getClass();
        yyn yynVar = new yyn(4);
        for (Map.Entry entry : ((yyr) map).entrySet()) {
            wee weeVar = (wee) entry.getKey();
            final agow agowVar = (agow) entry.getValue();
            yynVar.c(d(map3, weeVar), new zvh() { // from class: wbr
                @Override // defpackage.zvh
                public final zyd a() {
                    return zxn.h(agowVar.a());
                }
            });
        }
        for (Map.Entry entry2 : ((yyr) map2).entrySet()) {
            wee weeVar2 = (wee) entry2.getKey();
            final agow agowVar2 = (agow) entry2.getValue();
            yynVar.c(d(map3, weeVar2), new zvh() { // from class: wbs
                @Override // defpackage.zvh
                public final zyd a() {
                    return ((zvh) agowVar2.a()).a();
                }
            });
        }
        yyr yyrVarA = yynVar.a(true);
        if (!map4.keySet().containsAll(yyrVarA.keySet())) {
            throw new IllegalStateException("Parameters provided for mendel package not in use. Known packages: " + map4.keySet() + ", params provided: " + yyrVarA.keySet());
        }
        yzq yzqVarKeySet = yyrVarA.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : yzqVarKeySet) {
            if (map5.keySet().contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return yyrVarA;
        }
        arrayList.toString();
        throw new IllegalStateException("Packages cannot use both @PhenotypeApplicationSpecificProperties and @PhenotypeRuntimeProperties. Conflicting packages: ".concat(arrayList.toString()));
    }

    public final Map c(Map map, Map map2, Map map3, Map map4) {
        map3.getClass();
        map4.getClass();
        yyn yynVar = new yyn(4);
        for (Map.Entry entry : ((yyr) map).entrySet()) {
            wee weeVar = (wee) entry.getKey();
            agow agowVar = (agow) entry.getValue();
            String strA = weeVar.a();
            if (agyv.o(strA, "#")) {
                throw new IllegalStateException("Subpackages should be provided without their base package: ".concat(strA));
            }
            String str = (String) map2.get(strA);
            if (str != null) {
                strA = a.i(str, strA, "#");
            }
            yynVar.c(strA, agowVar.a());
        }
        yyr yyrVarA = yynVar.a(true);
        if (!map3.keySet().containsAll(yyrVarA.keySet())) {
            throw new IllegalStateException("Parameters provided for mendel package not in use. Known packages: " + map3.keySet() + ", params provided: " + yyrVarA.keySet());
        }
        yzq yzqVarKeySet = yyrVarA.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : yzqVarKeySet) {
            if (map4.keySet().contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return yyrVarA;
        }
        arrayList.toString();
        throw new IllegalStateException("Packages cannot use both @PhenotypeApplicationSpecificProperties and @PhenotypeRuntimeProperties. Conflicting packages: ".concat(arrayList.toString()));
    }
}
