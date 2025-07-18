package defpackage;

import java.text.ParseException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class w extends eh {
    public Map b;
    public Map c;
    private final Map e;
    private static final ResourceBundle d = new f();
    public static final w a = new w();

    private w() {
        super((byte[]) null);
        this.e = new HashMap();
    }

    public final v a(String str) {
        boolean zContainsKey;
        t tVarA;
        v vVar;
        Object[][] objArr;
        Map map = this.e;
        synchronized (map) {
            zContainsKey = map.containsKey(str);
            tVarA = null;
            vVar = zContainsKey ? (v) map.get(str) : null;
        }
        if (zContainsKey) {
            return vVar;
        }
        try {
            Object[][] objArr2 = (Object[][]) d.getObject("rules");
            int length = objArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    objArr = null;
                    break;
                }
                Object[] objArr3 = objArr2[i];
                if (str.equals(objArr3[0])) {
                    objArr = (Object[][]) objArr3[1];
                    break;
                }
                i++;
            }
            StringBuilder sb = new StringBuilder();
            for (Object[] objArr4 : objArr) {
                if (sb.length() > 0) {
                    sb.append("; ");
                }
                sb.append((String) objArr4[0]);
                sb.append(": ");
                sb.append((String) objArr4[1]);
            }
            String string = sb.toString();
            v vVar2 = v.a;
            String strTrim = string.trim();
            if (strTrim.length() == 0) {
                vVar = v.a;
            } else {
                u uVar = new u();
                if (strTrim.endsWith(";")) {
                    strTrim = strTrim.substring(0, strTrim.length() - 1);
                }
                for (String str2 : v.g.split(strTrim)) {
                    t tVarA2 = v.a(str2.trim());
                    uVar.a |= (tVarA2.c == null && tVarA2.d == null) ? false : true;
                    uVar.a(tVarA2);
                }
                List list = uVar.b;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    t tVar = (t) it.next();
                    if ("other".equals(tVar.a)) {
                        it.remove();
                        tVarA = tVar;
                    }
                }
                if (tVarA == null) {
                    tVarA = v.a("other:");
                }
                list.add(tVarA);
                vVar = new v(uVar);
            }
        } catch (ParseException | MissingResourceException unused) {
        }
        Map map2 = this.e;
        synchronized (map2) {
            if (map2.containsKey(str)) {
                vVar = (v) map2.get(str);
            } else {
                map2.put(str, vVar);
            }
        }
        return vVar;
    }

    public final void b() {
        Map map;
        Map treeMap;
        Map treeMap2;
        synchronized (this) {
            map = this.b;
        }
        if (map == null) {
            try {
                ResourceBundle resourceBundle = d;
                Object[][] objArr = (Object[][]) resourceBundle.getObject("locales");
                treeMap = new TreeMap();
                for (Object[] objArr2 : objArr) {
                    treeMap.put((String) objArr2[0], (String) objArr2[1]);
                }
                Object[][] objArr3 = (Object[][]) resourceBundle.getObject("locales_ordinals");
                treeMap2 = new TreeMap();
                for (Object[] objArr4 : objArr3) {
                    treeMap2.put((String) objArr4[0], (String) objArr4[1]);
                }
            } catch (MissingResourceException unused) {
                treeMap = Collections.EMPTY_MAP;
                treeMap2 = Collections.EMPTY_MAP;
            }
            synchronized (this) {
                if (this.b == null) {
                    this.b = treeMap;
                    this.c = treeMap2;
                }
            }
        }
    }
}
