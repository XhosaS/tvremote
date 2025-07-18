package defpackage;

import android.content.ContentResolver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyg implements gyi {
    private final ContentResolver a;
    private final gyx b = gyx.o;
    private final Set c = hag.a;
    private final Set d = agrf.a;

    public gyg(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    @Override // defpackage.gzc
    public final int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.gzc
    public final gyx b() {
        return this.b;
    }

    @Override // defpackage.gyi
    public final Object c(agsw agswVar) {
        String[] strArr;
        String[] strArr2 = {"aah:"};
        ContentResolver contentResolver = this.a;
        lxa lxaVar = lwy.a;
        synchronized (lxaVar) {
            ((lxe) lxaVar).d(contentResolver);
            if (((lxe) lxaVar).g.length == 0) {
                ((lxe) lxaVar).g = new String[1];
                System.arraycopy(strArr2, 0, ((lxe) lxaVar).g, 0, 1);
                strArr = ((lxe) lxaVar).g;
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Collections.addAll(linkedHashSet, ((lxe) lxaVar).g);
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                String str = strArr2[0];
                if (linkedHashSet.add(str)) {
                    linkedHashSet2.add(str);
                }
                if (linkedHashSet2.isEmpty()) {
                    strArr = new String[0];
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
                        strArr = new String[0];
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
                        ((lxe) lxaVar).g = (String[]) linkedHashSet.toArray(new String[0]);
                        strArr = (String[]) linkedHashSet2.toArray(new String[0]);
                    }
                }
            }
            if (!((lxe) lxaVar).f) {
                ((lxe) lxaVar).c(contentResolver, ((lxe) lxaVar).g);
            } else if (strArr.length != 0) {
                ((lxe) lxaVar).f = false;
                ((lxe) lxaVar).c(contentResolver, strArr);
            }
        }
        return agpu.a;
    }

    @Override // defpackage.gyi
    public final Set d() {
        return this.d;
    }

    @Override // defpackage.gyi
    public final Set e() {
        return this.c;
    }

    @Override // defpackage.gyi
    public final int f() {
        return 1;
    }
}
