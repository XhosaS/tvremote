package defpackage;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aaga {
    private final HashMap a = new HashMap(7);
    private final HashMap b = new HashMap(7);

    public final synchronized String[] a(Locale locale, String str, String str2) {
        Object[] objArr;
        String[] strArr = null;
        if (locale == null) {
            return null;
        }
        HashMap map = this.a;
        Map map2 = (Map) map.get(locale);
        if (map2 == null) {
            map2 = new HashMap(7);
            map.put(locale, map2);
        }
        Map map3 = (Map) map2.get(str);
        if (map3 == null) {
            map3 = new HashMap(7);
            map2.put(str, map3);
            String[][] zoneStrings = aabp.b(Locale.ENGLISH).getZoneStrings();
            int length = zoneStrings.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    objArr = null;
                    break;
                }
                objArr = zoneStrings[i];
                if (objArr != null && objArr.length >= 5 && str.equals(objArr[0])) {
                    break;
                }
                i++;
            }
            String[][] zoneStrings2 = aabp.b(locale).getZoneStrings();
            int length2 = zoneStrings2.length;
            int i2 = 0;
            while (true) {
                if (i2 < length2) {
                    String[] strArr2 = zoneStrings2[i2];
                    if (strArr2 != null && strArr2.length >= 5 && str.equals(strArr2[0])) {
                        strArr = strArr2;
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
            if (objArr != null && strArr != null) {
                map3.put(objArr[2], new String[]{strArr[2], strArr[1]});
                if (objArr[2].equals(objArr[4])) {
                    map3.put(String.valueOf(objArr[4]).concat("-Summer"), new String[]{strArr[4], strArr[3]});
                } else {
                    map3.put(objArr[4], new String[]{strArr[4], strArr[3]});
                }
            }
        }
        return (String[]) map3.get(str2);
    }

    public final synchronized String[] b(Locale locale, String str, boolean z) {
        String[] strArr;
        String[] strArr2 = null;
        if (locale == null) {
            return null;
        }
        if (str.startsWith("Etc/")) {
            str = str.substring(4);
        }
        HashMap map = this.b;
        Map map2 = (Map) map.get(locale);
        if (map2 == null) {
            map2 = new HashMap(7);
            map.put(locale, map2);
        }
        Map map3 = (Map) map2.get(str);
        if (map3 == null) {
            map3 = new HashMap(7);
            map2.put(str, map3);
            String[][] zoneStrings = aabp.b(Locale.ENGLISH).getZoneStrings();
            int length = zoneStrings.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    strArr = null;
                    break;
                }
                strArr = zoneStrings[i];
                if (strArr != null && strArr.length >= 5 && str.equals(strArr[0])) {
                    break;
                }
                i++;
            }
            String[][] zoneStrings2 = aabp.b(locale).getZoneStrings();
            int length2 = zoneStrings2.length;
            int i2 = 0;
            while (true) {
                if (i2 < length2) {
                    String[] strArr3 = zoneStrings2[i2];
                    if (strArr3 != null && strArr3.length >= 5 && str.equals(strArr3[0])) {
                        strArr2 = strArr3;
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
            if (strArr != null && strArr2 != null) {
                map3.put(Boolean.TRUE, new String[]{strArr2[2], strArr2[1]});
                map3.put(Boolean.FALSE, new String[]{strArr2[4], strArr2[3]});
            }
        }
        return (String[]) map3.get(Boolean.valueOf(z));
    }
}
