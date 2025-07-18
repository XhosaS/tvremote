package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kkz {
    public final String a;
    public final klc b;
    public final int c;
    public final int d;
    public final boolean e;
    private final Map f;

    public kkz(String str, klc klcVar, Map map, int i, int i2) {
        this.a = str;
        this.b = klcVar;
        this.f = map;
        this.c = i;
        this.d = i2;
        boolean z = false;
        if (i2 > 0 && i2 < i) {
            z = true;
        }
        this.e = z;
    }

    public static void f(List list, int i, int i2, List list2) {
        while (i < i2) {
            list2.add((klb) list.get(i));
            i++;
        }
    }

    private static int g(klb klbVar, rld rldVar, boolean z, boolean z2, List list, int i, ImmutableMap.Builder builder) {
        if (z) {
            i = list.size();
        }
        int i2 = true != z ? 0 : 2;
        if (z2) {
            i2 |= 4;
        }
        if (klbVar.d() && klbVar.e()) {
            i2 |= 1;
        }
        if (i2 == klbVar.h) {
            list.add(klbVar);
        } else {
            list.add(rldVar.c(i2));
        }
        if (!z2 || i == -1) {
            return i;
        }
        builder.put(rldVar.d(), Integer.valueOf((list.size() - i) - (((kky) rldVar.c).i ? 1 : 0)));
        return -1;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    private static boolean h(rld rldVar, String str, ko koVar) {
        if (rldVar.f().equals(str)) {
            return false;
        }
        if (koVar != null) {
            ?? r3 = rldVar.d;
            if (!r3.isEmpty()) {
                for (sew sewVar : r3) {
                    int iC = koVar.c(sewVar);
                    if (iC >= 0 && ((Integer) koVar.g(iC)).intValue() + 1 >= sewVar.a) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    private static final void i(rld rldVar, boolean z, ko koVar, List list) {
        int i = 7;
        if (!z) {
            kky kkyVar = (kky) rldVar.c;
            if (!kkyVar.f.equals(kkyVar.g)) {
                i = 5;
            }
        }
        ?? r4 = rldVar.b;
        boolean zIsEmpty = r4.isEmpty();
        list.add(rldVar.c(i));
        if (zIsEmpty) {
            return;
        }
        rld rldVar2 = null;
        for (rld rldVar3 : r4) {
            if (h(rldVar3, null, koVar)) {
                if (rldVar2 != null) {
                    list.add(rldVar2.c(0));
                }
                rldVar2 = rldVar3;
            }
        }
        if (rldVar2 != null) {
            list.add(rldVar2.c(4));
        }
    }

    public final klc a(List list, Set set) {
        return d(this.b, list, set);
    }

    public final klc b(klc klcVar, klb klbVar) {
        List list;
        int iIndexOf;
        Set set = klcVar.l;
        String str = klbVar.f;
        if (set.contains(str) || (iIndexOf = (list = klcVar.m).indexOf(klbVar)) <= 0) {
            return klcVar;
        }
        int iIntValue = ((Integer) klcVar.k.getOrDefault(str, 0)).intValue();
        if (iIntValue < this.c) {
            throw new IllegalStateException("Group is too small to be collapsed: " + str + "[" + iIntValue + "]");
        }
        int iB = klcVar.b(klbVar.a);
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        builder.addAll((Iterable) set);
        builder.add((ImmutableSet.Builder) str);
        ImmutableSet immutableSetBuild = builder.build();
        klb klbVarA = klbVar.a(klbVar.h | 1);
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(klcVar.e);
        arrayList2.set(iB, klbVarA);
        int i = iIndexOf - 1;
        klb klbVar2 = (klb) list.get(i);
        int i2 = (iB - iIntValue) + this.d;
        klb klbVar3 = (klb) arrayList2.get(i2 - 1);
        String str2 = klbVar2.a;
        String str3 = klbVar3.a;
        if (!TextUtils.equals(str2, str3)) {
            throw new IllegalStateException(String.format("Internal tagList error: expected %s, received %s", str2, str3));
        }
        f(list, 0, i, arrayList);
        arrayList.add(klbVar3);
        while (i2 < arrayList2.size()) {
            klb klbVar4 = (klb) arrayList2.get(i2);
            if (klbVar4.d() || !TextUtils.equals(klbVar4.f, str)) {
                break;
            }
            arrayList.add(klbVar4);
            i2++;
        }
        arrayList.add(klbVarA);
        f(list, iIndexOf + 1, list.size(), arrayList);
        return klcVar.c(arrayList, immutableSetBuild);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.List] */
    public final klc c(klc klcVar, int i) {
        ko koVar;
        int i2;
        kla klaVar;
        ArrayList arrayList;
        klb klbVar;
        rld rldVar;
        boolean z;
        boolean z2;
        int i3 = i;
        List list = klcVar.e;
        String str = ((klb) list.get(i3)).a;
        kla klaVar2 = klcVar.f;
        klaVar2.getClass();
        str.getClass();
        int i4 = 1;
        kla klaVar3 = new kla(klaVar2, str, klaVar2.c + 1);
        String str2 = this.a;
        if (!str2.equals(klcVar.d)) {
            return a(klaVar3, klcVar.l);
        }
        Map map = this.f;
        rld rldVar2 = (rld) map.get(str);
        if (rldVar2 == null) {
            return klcVar;
        }
        List list2 = klcVar.g;
        if (!list2.contains(rldVar2.d())) {
            ArrayList arrayList2 = new ArrayList(list2.size() + 1);
            arrayList2.addAll(list2);
            arrayList2.add(rldVar2.d());
            list2 = arrayList2;
        }
        String str3 = (String) Iterables.getLast(list2);
        ko koVar2 = klcVar.i;
        ?? r13 = rldVar2.d;
        if (r13.isEmpty()) {
            koVar = koVar2;
        } else {
            koVar = new ko(koVar2);
            for (sew sewVar : r13) {
                int i5 = i4;
                int iC = koVar.c(sewVar);
                if (iC >= 0) {
                    int iIntValue = ((Integer) koVar.g(iC)).intValue() + 1;
                    if (sewVar.a <= iIntValue) {
                        throw new IllegalArgumentException();
                    }
                    koVar.f(iC, Integer.valueOf(iIntValue));
                } else {
                    koVar.put(sewVar, Integer.valueOf(i5));
                }
                i4 = i5;
            }
        }
        int i6 = i4;
        int i7 = koVar == koVar2 ? i6 : 0;
        if (i7 == 0) {
            i2 = 0;
        } else {
            i2 = klcVar.j;
            if (i2 > i3) {
                for (int i8 = i3 - 1; i8 >= 0; i8--) {
                    klb klbVar2 = (klb) list.get(i8);
                    if (klbVar2.e() || klbVar2 == klc.a) {
                        i2 = i8 + 1;
                        break;
                    }
                }
                i2 = 0;
            }
        }
        ImmutableMap.Builder builder = ImmutableMap.builder();
        int size = list.size();
        int i9 = klcVar.j;
        ArrayList arrayList3 = new ArrayList(size);
        arrayList3.add(klc.a);
        int size2 = !klaVar2.isEmpty() ? 1 : 0;
        boolean zEquals = TextUtils.equals(str3, rldVar2.d());
        int i10 = size2;
        int iG = -1;
        klb klbVar3 = null;
        rld rldVar3 = null;
        boolean zC = false;
        while (i10 < size) {
            if (i10 != i9) {
                klaVar = klaVar3;
            } else {
                if (klbVar3 != null || rldVar3 != null || zC) {
                    throw new IllegalStateException();
                }
                klaVar = klaVar3;
                if (i3 >= i9) {
                    i(rldVar2, i6, koVar, arrayList3);
                }
                size2 = arrayList3.size();
                klbVar3 = null;
                rldVar3 = null;
                zC = false;
            }
            int size3 = size2;
            List list3 = list;
            klb klbVar4 = (klb) list.get(i10);
            if (i10 < i2) {
                arrayList3.add(klbVar4);
                arrayList = arrayList3;
                size2 = size3;
            } else if (!klbVar4.e() || klbVar4.d()) {
                if (i10 != i3 || i10 >= i9) {
                    arrayList = arrayList3;
                    rld rldVar4 = (rld) map.get(klbVar4.a);
                    if (klbVar3 == null) {
                        if (!zC) {
                            zC = klbVar4.c();
                        }
                        klbVar = null;
                    } else {
                        klbVar = klbVar3;
                    }
                    if (h(rldVar4, rldVar2.f(), 1 != i7 ? koVar : null)) {
                        if (klbVar != null) {
                            iG = g(klbVar, rldVar3, zC, false, arrayList, iG, builder);
                            z2 = false;
                        } else {
                            z2 = zC;
                        }
                        rldVar = rldVar4;
                        z = z2;
                        klbVar = klbVar4;
                    } else {
                        rldVar = rldVar3;
                        z = zC;
                    }
                    if (klbVar4.b()) {
                        if (klbVar != null) {
                            iG = g(klbVar, rldVar, z, true, arrayList, iG, builder);
                            if (TextUtils.equals(str3, rldVar.d())) {
                                size3 = arrayList.size();
                            }
                        }
                        size2 = size3;
                        zC = false;
                    } else {
                        zC = z;
                        rldVar3 = rldVar;
                        klbVar3 = klbVar;
                        size2 = size3;
                        i10++;
                        i3 = i;
                        arrayList3 = arrayList;
                        klaVar3 = klaVar;
                        list = list3;
                        i6 = 1;
                    }
                } else {
                    if (klbVar3 != null || rldVar3 != null) {
                        throw new IllegalStateException();
                    }
                    i(rldVar2, false, koVar, arrayList3);
                    if (zEquals) {
                        size3 = arrayList3.size();
                    }
                    arrayList = arrayList3;
                    zC = false;
                    size2 = size3;
                }
                klbVar3 = null;
                rldVar3 = null;
                i10++;
                i3 = i;
                arrayList3 = arrayList;
                klaVar3 = klaVar;
                list = list3;
                i6 = 1;
            } else {
                if (klbVar3 != null || rldVar3 != null || zC) {
                    throw new IllegalStateException();
                }
                arrayList3.add(klbVar4);
                if (klbVar4.b() && TextUtils.equals(str3, klbVar4.f)) {
                    arrayList = arrayList3;
                    size2 = arrayList3.size();
                } else {
                    arrayList = arrayList3;
                    size2 = size3;
                }
                klbVar3 = null;
                rldVar3 = null;
                zC = false;
            }
            i10++;
            i3 = i;
            arrayList3 = arrayList;
            klaVar3 = klaVar;
            list = list3;
            i6 = 1;
        }
        ArrayList arrayList4 = arrayList3;
        return new klc(str2, arrayList4, arrayList4, klaVar3, ImmutableSet.of(), list2, klcVar, koVar, builder.buildOrThrow(), size2);
    }

    public final klc d(klc klcVar, List list, Set set) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            int iB = klcVar.b(str);
            if (iB < 0 || ((klb) klcVar.e.get(iB)).e()) {
                Log.w("TagBrowseDatabase", "Tag not found: ".concat(String.valueOf(str)));
            } else {
                klcVar = c(klcVar, iB);
            }
        }
        return this.e ? klcVar.c(e(klcVar.e, set, klcVar.k, klcVar.j), set) : klcVar;
    }

    public final List e(List list, Set set, ImmutableMap immutableMap, int i) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(list);
        arrayList.addAll(arrayList2.subList(0, i));
        while (i < size) {
            klb klbVar = (klb) arrayList2.get(i);
            String str = klbVar.f;
            int iIntValue = ((Integer) immutableMap.getOrDefault(str, 0)).intValue();
            if (iIntValue != 0) {
                int i2 = i + iIntValue;
                int i3 = iIntValue >= this.c ? 1 : 0;
                boolean z = (i3 == 0 || set.contains(str)) ? false : true;
                if (i3 == 0 || !z) {
                    int i4 = (i2 - 1) + i3;
                    klb klbVar2 = (klb) arrayList2.get(i4);
                    while (i < i4) {
                        klb klbVar3 = (klb) arrayList2.get(i);
                        klb klbVarA = klbVar3.a(klbVar3.h & (-33));
                        arrayList2.set(i, klbVarA);
                        arrayList.add(klbVarA);
                        i++;
                    }
                    int i5 = klbVar2.h;
                    int i6 = i5 | 4;
                    if (klbVar2.d()) {
                        i6 = i5 | 5;
                    }
                    klb klbVarA2 = klbVar2.a(i6);
                    arrayList2.set(i4, klbVarA2);
                    arrayList.add(klbVarA2);
                    i = i4 + 1;
                    while (i < size && TextUtils.equals(str, ((klb) arrayList2.get(i)).f)) {
                        String str2 = ((klb) arrayList2.get(i)).a;
                        i++;
                    }
                } else {
                    klb klbVar4 = (klb) arrayList2.get(i2);
                    if (!((klb) arrayList2.get(i2)).d() || !TextUtils.equals(((klb) arrayList2.get(i2)).f, str)) {
                        throw new IllegalStateException("Expected knob: ".concat(String.valueOf(((klb) arrayList2.get(i2)).a)));
                    }
                    int i7 = (this.d + i) - 1;
                    klb klbVar5 = (klb) arrayList2.get(i7);
                    if (!TextUtils.equals(klbVar5.f, str)) {
                        throw new IllegalStateException("Tag " + klbVar5.a + " wasn't part of expected group " + str);
                    }
                    klb klbVarA3 = klbVar5.a(klbVar5.h | 32);
                    f(arrayList2, i, i7, arrayList);
                    arrayList.add(klbVarA3);
                    arrayList.add(klbVar4.a(20));
                    i = i2 + 1;
                }
            } else {
                if (!klbVar.d()) {
                    throw new IllegalStateException("SiblingCount not found for ".concat(String.valueOf(str)));
                }
                String str3 = klbVar.a;
                i++;
            }
        }
        return arrayList;
    }
}
