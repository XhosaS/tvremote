package defpackage;

import android.content.ContentResolver;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nds {
    public static final Pattern a = Pattern.compile(" +");
    private static final Pattern b = Pattern.compile("\\W");
    private static nds c = new nds(new ndq[0]);
    private static Object d;
    private final ndq[] e;
    private final Pattern f;

    public nds(ndq[] ndqVarArr) {
        Arrays.sort(ndqVarArr);
        StringBuilder sb = new StringBuilder("(");
        for (int i = 0; i < ndqVarArr.length; i++) {
            if (i > 0) {
                sb.append(")|(");
            }
            sb.append(b.matcher(ndqVarArr[i].b).replaceAll("\\\\$0"));
        }
        sb.append(")");
        this.f = Pattern.compile(sb.toString());
        this.e = ndqVarArr;
    }

    public static synchronized nds b(ContentResolver contentResolver) {
        Map treeMap;
        Object objC = opc.c(contentResolver);
        if (objC == d) {
            return c;
        }
        String[] strArr = {"url:"};
        try {
            osk oskVar = opc.a.i;
            treeMap = osk.o(contentResolver, strArr, new opf(0));
        } catch (opi unused) {
            treeMap = new TreeMap();
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : treeMap.entrySet()) {
            try {
                ((String) entry.getKey()).substring(4);
                String str = (String) entry.getValue();
                if (str != null && str.length() != 0) {
                    arrayList.add(new ndq(str));
                }
            } catch (ndr e) {
                Log.e("UrlRules", "Invalid rule from Gservices", e);
            }
        }
        nds ndsVar = new nds((ndq[]) arrayList.toArray(new ndq[arrayList.size()]));
        c = ndsVar;
        d = objC;
        return ndsVar;
    }

    public final ndq a(String str) {
        Matcher matcher = this.f.matcher(str);
        if (matcher.lookingAt()) {
            int i = 0;
            while (true) {
                ndq[] ndqVarArr = this.e;
                if (i >= ndqVarArr.length) {
                    break;
                }
                int i2 = i + 1;
                if (matcher.group(i2) != null) {
                    return ndqVarArr[i];
                }
                i = i2;
            }
        }
        return ndq.a;
    }
}
