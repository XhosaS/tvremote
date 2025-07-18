package defpackage;

import android.view.View;
import android.view.ViewGroup;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class paq {
    private static final Map a = DesugarCollections.synchronizedMap(new WeakHashMap());

    public static pan a(View view) {
        boolean z;
        pan panVar = null;
        if (view == null) {
            return null;
        }
        Map map = a;
        if (!map.containsKey(view)) {
            Object tag = view.getTag();
            if (tag instanceof String) {
                String str = (String) tag;
                if (str.startsWith("ve=")) {
                    String strSubstring = str.substring(3);
                    if (strSubstring.indexOf(";visibility:hidden") >= 0) {
                        strSubstring = strSubstring.replace(";visibility:hidden", "");
                        z = true;
                    } else {
                        z = false;
                    }
                    int iIndexOf = strSubstring.indexOf(";track:");
                    if (iIndexOf == -1) {
                        iIndexOf = strSubstring.length();
                    }
                    try {
                        pan panVar2 = new pan(Integer.parseInt(strSubstring.substring(0, iIndexOf)));
                        if (z) {
                            panVar2.e(2);
                        }
                        int i = iIndexOf + 7;
                        if (i >= strSubstring.length()) {
                            panVar = panVar2;
                        } else {
                            for (String str2 : strSubstring.substring(i).split(",")) {
                                int iHashCode = str2.hashCode();
                                if (iHashCode == 3091764) {
                                    if (!str2.equals("drag")) {
                                        break;
                                    }
                                    panVar2.c.add(30);
                                } else if (iHashCode == 3092207) {
                                    if (!str2.equals("drop")) {
                                        break;
                                    }
                                    panVar2.c.add(37);
                                } else {
                                    if (iHashCode != 94750088 || !str2.equals("click")) {
                                        break;
                                    }
                                    panVar2.c.add(4);
                                }
                            }
                            panVar = panVar2;
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
                map.put(view, panVar);
            } else {
                map.put(view, null);
            }
        }
        return (pan) a.get(view);
    }

    public static pao b(View view) {
        List arrayList;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            arrayList = new ArrayList(viewGroup.getChildCount());
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                arrayList.add(b(viewGroup.getChildAt(i)));
            }
        } else {
            arrayList = Collections.EMPTY_LIST;
        }
        return pao.c(a(view), arrayList);
    }

    public static void c(View view, pan panVar) {
        a.put(view, panVar);
    }
}
