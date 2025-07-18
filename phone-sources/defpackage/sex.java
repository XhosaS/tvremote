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
public final class sex {
    public final String a;
    public final sfb b;
    public final int c;
    public final int d;
    public final boolean e;
    private final Map f;

    public sex(String str, sfb sfbVar, Map map, int i, int i2) {
        this.a = str;
        this.b = sfbVar;
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
            list2.add((sfa) list.get(i));
            i++;
        }
    }

    private static int g(sfa sfaVar, srp srpVar, boolean z, boolean z2, List list, int i, ImmutableMap.Builder builder) {
        if (z) {
            i = list.size();
        }
        int i2 = true != z ? 0 : 2;
        if (z2) {
            i2 |= 4;
        }
        if (sfaVar.d() && sfaVar.f()) {
            i2 |= 1;
        }
        if (i2 == sfaVar.h) {
            list.add(sfaVar);
        } else {
            list.add(srpVar.b(i2));
        }
        if (!z2 || i == -1) {
            return i;
        }
        builder.put(srpVar.c(), Integer.valueOf((list.size() - i) - (((sev) srpVar.b).i ? 1 : 0)));
        return -1;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    private static boolean h(srp srpVar, String str, ko koVar) {
        if (srpVar.e().equals(str)) {
            return false;
        }
        if (koVar != null) {
            ?? r3 = srpVar.c;
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
    private static final void i(srp srpVar, boolean z, ko koVar, List list) {
        int i = 7;
        if (!z) {
            sev sevVar = (sev) srpVar.b;
            if (!sevVar.f.equals(sevVar.g)) {
                i = 5;
            }
        }
        ?? r4 = srpVar.d;
        boolean zIsEmpty = r4.isEmpty();
        list.add(srpVar.b(i));
        if (zIsEmpty) {
            return;
        }
        srp srpVar2 = null;
        for (srp srpVar3 : r4) {
            if (h(srpVar3, null, koVar)) {
                if (srpVar2 != null) {
                    list.add(srpVar2.b(0));
                }
                srpVar2 = srpVar3;
            }
        }
        if (srpVar2 != null) {
            list.add(srpVar2.b(4));
        }
    }

    public final sfb a(List list, Set set) {
        return d(this.b, list, set);
    }

    public final sfb b(sfb sfbVar, sfa sfaVar) {
        Set set = sfbVar.l;
        String str = sfaVar.f;
        if (set.contains(str)) {
            return sfbVar;
        }
        List list = sfbVar.m;
        int iIndexOf = list.indexOf(sfaVar);
        if (iIndexOf <= 0) {
            String str2 = sfaVar.a;
            return sfbVar;
        }
        int iIntValue = ((Integer) sfbVar.k.getOrDefault(str, 0)).intValue();
        if (iIntValue < this.c) {
            throw new IllegalStateException("Group is too small to be collapsed: " + str + "[" + iIntValue + "]");
        }
        int iB = sfbVar.b(sfaVar.a);
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        builder.addAll((Iterable) set);
        builder.add((ImmutableSet.Builder) str);
        ImmutableSet immutableSetBuild = builder.build();
        sfa sfaVarA = sfaVar.a(sfaVar.h | 1);
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(sfbVar.e);
        arrayList2.set(iB, sfaVarA);
        int i = iIndexOf - 1;
        sfa sfaVar2 = (sfa) list.get(i);
        int i2 = (iB - iIntValue) + this.d;
        sfa sfaVar3 = (sfa) arrayList2.get(i2 - 1);
        String str3 = sfaVar2.a;
        String str4 = sfaVar3.a;
        if (!TextUtils.equals(str3, str4)) {
            throw new IllegalStateException(String.format("Internal tagList error: expected %s, received %s", str3, str4));
        }
        f(list, 0, i, arrayList);
        arrayList.add(sfaVar3);
        while (i2 < arrayList2.size()) {
            sfa sfaVar4 = (sfa) arrayList2.get(i2);
            if (sfaVar4.d() || !TextUtils.equals(sfaVar4.f, str)) {
                break;
            }
            arrayList.add(sfaVar4);
            i2++;
        }
        arrayList.add(sfaVarA);
        f(list, iIndexOf + 1, list.size(), arrayList);
        return sfbVar.c(arrayList, immutableSetBuild);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.List] */
    public final sfb c(sfb sfbVar, int i) {
        ko koVar;
        int i2;
        sey seyVar;
        ArrayList arrayList;
        sfa sfaVar;
        srp srpVar;
        boolean z;
        boolean z2;
        int i3 = i;
        List list = sfbVar.e;
        String str = ((sfa) list.get(i3)).a;
        sey seyVar2 = sfbVar.f;
        seyVar2.getClass();
        str.getClass();
        int i4 = 1;
        sey seyVar3 = new sey(seyVar2, str, seyVar2.c + 1);
        String str2 = this.a;
        if (!str2.equals(sfbVar.d)) {
            return a(seyVar3, sfbVar.l);
        }
        Map map = this.f;
        srp srpVar2 = (srp) map.get(str);
        if (srpVar2 == null) {
            return sfbVar;
        }
        List list2 = sfbVar.g;
        if (!list2.contains(srpVar2.c())) {
            ArrayList arrayList2 = new ArrayList(list2.size() + 1);
            arrayList2.addAll(list2);
            arrayList2.add(srpVar2.c());
            list2 = arrayList2;
        }
        String str3 = (String) Iterables.getLast(list2);
        ko koVar2 = sfbVar.i;
        ?? r13 = srpVar2.c;
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
            i2 = sfbVar.j;
            if (i2 > i3) {
                for (int i8 = i3 - 1; i8 >= 0; i8--) {
                    sfa sfaVar2 = (sfa) list.get(i8);
                    if (sfaVar2.f() || sfaVar2 == sfb.a) {
                        i2 = i8 + 1;
                        break;
                    }
                }
                i2 = 0;
            }
        }
        ImmutableMap.Builder builder = ImmutableMap.builder();
        int size = list.size();
        int i9 = sfbVar.j;
        ArrayList arrayList3 = new ArrayList(size);
        arrayList3.add(sfb.a);
        int size2 = !seyVar2.isEmpty() ? 1 : 0;
        boolean zEquals = TextUtils.equals(str3, srpVar2.c());
        int i10 = size2;
        int iG = -1;
        sfa sfaVar3 = null;
        srp srpVar3 = null;
        boolean zC = false;
        while (i10 < size) {
            if (i10 != i9) {
                seyVar = seyVar3;
            } else {
                if (sfaVar3 != null || srpVar3 != null || zC) {
                    throw new IllegalStateException();
                }
                seyVar = seyVar3;
                if (i3 >= i9) {
                    i(srpVar2, i6, koVar, arrayList3);
                }
                size2 = arrayList3.size();
                sfaVar3 = null;
                srpVar3 = null;
                zC = false;
            }
            int size3 = size2;
            List list3 = list;
            sfa sfaVar4 = (sfa) list.get(i10);
            if (i10 < i2) {
                arrayList3.add(sfaVar4);
                arrayList = arrayList3;
                size2 = size3;
            } else if (!sfaVar4.f() || sfaVar4.d()) {
                if (i10 != i3 || i10 >= i9) {
                    arrayList = arrayList3;
                    srp srpVar4 = (srp) map.get(sfaVar4.a);
                    srpVar4.getClass();
                    if (sfaVar3 == null) {
                        if (!zC) {
                            zC = sfaVar4.c();
                        }
                        sfaVar = null;
                    } else {
                        sfaVar = sfaVar3;
                    }
                    if (h(srpVar4, srpVar2.e(), 1 != i7 ? koVar : null)) {
                        if (sfaVar != null) {
                            iG = g(sfaVar, srpVar3, zC, false, arrayList, iG, builder);
                            z2 = false;
                        } else {
                            z2 = zC;
                        }
                        srpVar = srpVar4;
                        z = z2;
                        sfaVar = sfaVar4;
                    } else {
                        srpVar = srpVar3;
                        z = zC;
                    }
                    if (sfaVar4.b()) {
                        if (sfaVar != null) {
                            iG = g(sfaVar, srpVar, z, true, arrayList, iG, builder);
                            if (TextUtils.equals(str3, srpVar.c())) {
                                size3 = arrayList.size();
                            }
                        }
                        size2 = size3;
                        zC = false;
                    } else {
                        zC = z;
                        srpVar3 = srpVar;
                        sfaVar3 = sfaVar;
                        size2 = size3;
                        i10++;
                        i3 = i;
                        arrayList3 = arrayList;
                        seyVar3 = seyVar;
                        list = list3;
                        i6 = 1;
                    }
                } else {
                    if (sfaVar3 != null || srpVar3 != null) {
                        throw new IllegalStateException();
                    }
                    i(srpVar2, false, koVar, arrayList3);
                    if (zEquals) {
                        size3 = arrayList3.size();
                    }
                    arrayList = arrayList3;
                    zC = false;
                    size2 = size3;
                }
                sfaVar3 = null;
                srpVar3 = null;
                i10++;
                i3 = i;
                arrayList3 = arrayList;
                seyVar3 = seyVar;
                list = list3;
                i6 = 1;
            } else {
                if (sfaVar3 != null || srpVar3 != null || zC) {
                    throw new IllegalStateException();
                }
                arrayList3.add(sfaVar4);
                if (sfaVar4.b() && TextUtils.equals(str3, sfaVar4.f)) {
                    arrayList = arrayList3;
                    size2 = arrayList3.size();
                } else {
                    arrayList = arrayList3;
                    size2 = size3;
                }
                sfaVar3 = null;
                srpVar3 = null;
                zC = false;
            }
            i10++;
            i3 = i;
            arrayList3 = arrayList;
            seyVar3 = seyVar;
            list = list3;
            i6 = 1;
        }
        ArrayList arrayList4 = arrayList3;
        return new sfb(str2, arrayList4, arrayList4, seyVar3, ImmutableSet.of(), list2, sfbVar, koVar, builder.buildOrThrow(), size2);
    }

    public final sfb d(sfb sfbVar, List list, Set set) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            int iB = sfbVar.b(str);
            if (iB < 0 || ((sfa) sfbVar.e.get(iB)).f()) {
                Log.w("TagBrowseDatabase", "Tag not found: ".concat(String.valueOf(str)));
            } else {
                sfbVar = c(sfbVar, iB);
            }
        }
        return this.e ? sfbVar.c(e(sfbVar.e, set, sfbVar.k, sfbVar.j), set) : sfbVar;
    }

    public final List e(List list, Set set, ImmutableMap immutableMap, int i) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(list);
        arrayList.addAll(arrayList2.subList(0, i));
        while (i < size) {
            sfa sfaVar = (sfa) arrayList2.get(i);
            String str = sfaVar.f;
            int iIntValue = ((Integer) immutableMap.getOrDefault(str, 0)).intValue();
            if (iIntValue != 0) {
                int i2 = i + iIntValue;
                int i3 = iIntValue >= this.c ? 1 : 0;
                boolean z = (i3 == 0 || set.contains(str)) ? false : true;
                if (i3 == 0 || !z) {
                    int i4 = (i2 - 1) + i3;
                    sfa sfaVar2 = (sfa) arrayList2.get(i4);
                    while (i < i4) {
                        sfa sfaVar3 = (sfa) arrayList2.get(i);
                        sfa sfaVarA = sfaVar3.a(sfaVar3.h & (-33));
                        arrayList2.set(i, sfaVarA);
                        arrayList.add(sfaVarA);
                        i++;
                    }
                    int i5 = sfaVar2.h;
                    int i6 = i5 | 4;
                    if (sfaVar2.d()) {
                        i6 = i5 | 5;
                    }
                    sfa sfaVarA2 = sfaVar2.a(i6);
                    arrayList2.set(i4, sfaVarA2);
                    arrayList.add(sfaVarA2);
                    i = i4 + 1;
                    while (i < size && TextUtils.equals(str, ((sfa) arrayList2.get(i)).f)) {
                        String str2 = ((sfa) arrayList2.get(i)).a;
                        i++;
                    }
                } else {
                    sfa sfaVar4 = (sfa) arrayList2.get(i2);
                    if (!((sfa) arrayList2.get(i2)).d() || !TextUtils.equals(((sfa) arrayList2.get(i2)).f, str)) {
                        throw new IllegalStateException("Expected knob: ".concat(String.valueOf(((sfa) arrayList2.get(i2)).a)));
                    }
                    int i7 = (this.d + i) - 1;
                    sfa sfaVar5 = (sfa) arrayList2.get(i7);
                    if (!TextUtils.equals(sfaVar5.f, str)) {
                        throw new IllegalStateException("Tag " + sfaVar5.a + " wasn't part of expected group " + str);
                    }
                    sfa sfaVarA3 = sfaVar5.a(sfaVar5.h | 32);
                    f(arrayList2, i, i7, arrayList);
                    arrayList.add(sfaVarA3);
                    arrayList.add(sfaVar4.a(20));
                    i = i2 + 1;
                }
            } else {
                if (!sfaVar.d()) {
                    throw new IllegalStateException("SiblingCount not found for ".concat(String.valueOf(str)));
                }
                String str3 = sfaVar.a;
                i++;
            }
        }
        return arrayList;
    }
}
