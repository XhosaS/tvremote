package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class opc {
    public static final opj a;

    static {
        Uri uri = opd.a;
        a = ope.a();
    }

    public static int a(ContentResolver contentResolver, String str, int i) throws NumberFormatException {
        Object obj;
        Integer numValueOf;
        opj opjVar = a;
        opj.e(contentResolver);
        synchronized (opjVar) {
            opjVar.c(contentResolver);
            obj = opjVar.f;
            numValueOf = (Integer) opj.f(opjVar.c, str, Integer.valueOf(i));
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        String strA = opjVar.a(contentResolver, str, null);
        if (strA != null) {
            try {
                int i2 = Integer.parseInt(strA);
                numValueOf = Integer.valueOf(i2);
                i = i2;
            } catch (NumberFormatException unused) {
            }
        }
        synchronized (opjVar) {
            opjVar.d(obj, opjVar.c, str, numValueOf);
        }
        return i;
    }

    public static long b(ContentResolver contentResolver, String str, long j) {
        Object obj;
        Long lValueOf;
        opj opjVar = a;
        opj.e(contentResolver);
        synchronized (opjVar) {
            opjVar.c(contentResolver);
            obj = opjVar.f;
            lValueOf = (Long) opj.f(opjVar.d, str, Long.valueOf(j));
        }
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        String strA = opjVar.a(contentResolver, str, null);
        if (strA != null) {
            try {
                long j2 = Long.parseLong(strA);
                lValueOf = Long.valueOf(j2);
                j = j2;
            } catch (NumberFormatException unused) {
            }
        }
        synchronized (opjVar) {
            opjVar.d(obj, opjVar.d, str, lValueOf);
        }
        return j;
    }

    public static Object c(ContentResolver contentResolver) {
        Object obj;
        opj opjVar = a;
        synchronized (opjVar) {
            opjVar.c(contentResolver);
            obj = opjVar.f;
        }
        return obj;
    }

    public static String d(ContentResolver contentResolver, String str, String str2) {
        return a.a(contentResolver, str, str2);
    }

    public static void e(ContentResolver contentResolver, String... strArr) {
        String[] strArr2;
        opj opjVar = a;
        synchronized (opjVar) {
            opjVar.c(contentResolver);
            if (opjVar.h.length == 0) {
                opjVar.h = new String[1];
                System.arraycopy(strArr, 0, opjVar.h, 0, 1);
                strArr2 = opjVar.h;
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Collections.addAll(linkedHashSet, opjVar.h);
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                String str = strArr[0];
                if (linkedHashSet.add(str)) {
                    linkedHashSet2.add(str);
                }
                if (linkedHashSet2.isEmpty()) {
                    strArr2 = new String[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashSet);
                    Collections.sort(arrayList);
                    HashMap map = new HashMap();
                    int size = arrayList.size();
                    String str2 = null;
                    for (int i = 0; i < size; i++) {
                        String str3 = (String) arrayList.get(i);
                        if (str2 == null || !str3.startsWith(str2)) {
                            str2 = str3;
                        } else {
                            map.put(str3, str2);
                            linkedHashSet2.remove(str3);
                        }
                    }
                    if (linkedHashSet2.isEmpty()) {
                        strArr2 = new String[0];
                    } else {
                        if (!map.isEmpty()) {
                            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                            Iterator it = linkedHashSet.iterator();
                            while (it.hasNext()) {
                                String str4 = (String) it.next();
                                String str5 = (String) map.get(str4);
                                if (str5 != null) {
                                    linkedHashSet3.add(str5);
                                } else {
                                    linkedHashSet3.add(str4);
                                }
                            }
                            linkedHashSet = linkedHashSet3;
                        }
                        opjVar.h = (String[]) linkedHashSet.toArray(new String[0]);
                        strArr2 = (String[]) linkedHashSet2.toArray(new String[0]);
                    }
                }
            }
            if (!opjVar.g) {
                opjVar.b(contentResolver, opjVar.h);
            } else if (strArr2.length != 0) {
                opjVar.g = false;
                opjVar.b(contentResolver, strArr2);
            }
        }
    }

    public static boolean f(ContentResolver contentResolver, String str, boolean z) {
        Object obj;
        Boolean bool;
        opj opjVar = a;
        opj.e(contentResolver);
        synchronized (opjVar) {
            opjVar.c(contentResolver);
            obj = opjVar.f;
            bool = (Boolean) opj.f(opjVar.b, str, Boolean.valueOf(z));
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        String strA = opjVar.a(contentResolver, str, null);
        if (strA != null && !strA.isEmpty()) {
            if (opd.c.matcher(strA).matches()) {
                z = true;
                bool = true;
            } else if (opd.d.matcher(strA).matches()) {
                z = false;
                bool = false;
            } else {
                Log.w("Gservices", a.ci(strA, str, "attempt to read Gservices key ", " (value \"", "\") as boolean"));
            }
        }
        synchronized (opjVar) {
            opjVar.d(obj, opjVar.b, str, bool);
        }
        return z;
    }
}
