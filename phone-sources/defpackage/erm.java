package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class erm extends ern {
    public static final erm a = new erm("", Collections.EMPTY_LIST, Collections.EMPTY_LIST, Collections.EMPTY_LIST, Collections.EMPTY_LIST, Collections.EMPTY_LIST, Collections.EMPTY_LIST, null, Collections.EMPTY_LIST, false, Collections.EMPTY_MAP, Collections.EMPTY_LIST);
    public final List b;
    public final List c;
    public final List d;
    public final List e;
    public final dze f;
    public final List g;
    public final Map h;
    public final List i;

    public erm(String str, List list, List list2, List list3, List list4, List list5, List list6, dze dzeVar, List list7, boolean z, Map map, List list8) {
        super(str, list, z);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list2.size(); i++) {
            Object obj = ((esn) list2.get(i)).e;
            if (!arrayList.contains(obj)) {
                arrayList.add(obj);
            }
        }
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        b(list6, arrayList);
        this.b = DesugarCollections.unmodifiableList(arrayList);
        this.c = DesugarCollections.unmodifiableList(list2);
        DesugarCollections.unmodifiableList(list3);
        this.d = DesugarCollections.unmodifiableList(list4);
        this.e = DesugarCollections.unmodifiableList(list5);
        DesugarCollections.unmodifiableList(list6);
        this.f = dzeVar;
        this.g = list7 != null ? DesugarCollections.unmodifiableList(list7) : null;
        this.h = DesugarCollections.unmodifiableMap(map);
        this.i = DesugarCollections.unmodifiableList(list8);
    }

    private static List a(List list, int i, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            int i3 = 0;
            while (true) {
                if (i3 < list2.size()) {
                    eas easVar = (eas) list2.get(i3);
                    if (easVar.e == i && easVar.f == i2) {
                        arrayList.add(obj);
                        break;
                    }
                    i3++;
                }
            }
        }
        return arrayList;
    }

    private static void b(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            Object obj = ((cvi) list.get(i)).c;
            if (!list2.contains(obj)) {
                list2.add(obj);
            }
        }
    }

    @Override // defpackage.eum
    public final /* bridge */ /* synthetic */ Object e(List list) {
        return new erm(this.u, this.v, a(this.c, 0, list), Collections.EMPTY_LIST, a(this.d, 1, list), a(this.e, 2, list), Collections.EMPTY_LIST, this.f, this.g, this.w, this.h, this.i);
    }
}
