package defpackage;

import android.content.Context;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sea {
    public final RecyclerView a;
    public final Set b;
    public final int c;
    public final int d;
    public Set e;
    public final RecyclerView.Adapter f;
    public Object g;
    public Object h;
    private final RecyclerView.ItemDecoration i;

    public sea(RecyclerView recyclerView, int i, int i2, int i3, int i4, int i5, int i6) {
        recyclerView.getClass();
        klc klcVar = klc.c;
        klcVar.getClass();
        this.h = klcVar;
        ImmutableSet immutableSetOf = ImmutableSet.of();
        immutableSetOf.getClass();
        this.e = immutableSetOf;
        Context context = recyclerView.getContext();
        this.a = recyclerView;
        this.c = i5;
        this.d = i6;
        this.b = new it((byte[]) null);
        RecyclerView.ItemDecoration itemDecoration = (kkp) recyclerView.getTag(R.id.gtv__fireball__item_decoration);
        if (itemDecoration != null) {
            recyclerView.removeItemDecoration(itemDecoration);
        }
        context.getClass();
        kkp kkpVar = new kkp(context, new eij(this, 11), i, i2, i3, i4);
        this.i = kkpVar;
        recyclerView.addItemDecoration(kkpVar);
        recyclerView.setTag(R.id.gtv__fireball__item_decoration, kkpVar);
        recyclerView.setItemAnimator(new kko(kkpVar));
        List list = klcVar.m;
        list.getClass();
        RecyclerView.Adapter kkuVar = new kku(this, list);
        this.f = kkuVar;
        recyclerView.setAdapter(kkuVar);
    }

    private static int e(int i, RecyclerView recyclerView) {
        if (i == -1) {
            return 0;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        layoutManager.getClass();
        View viewFindViewByPosition = layoutManager.findViewByPosition(i);
        if (viewFindViewByPosition == null) {
            return 0;
        }
        int[] iArr = cww.a;
        return recyclerView.getLayoutDirection() == 1 ? (recyclerView.getWidth() - layoutManager.getDecoratedRight(viewFindViewByPosition)) - recyclerView.getPaddingRight() : layoutManager.getDecoratedLeft(viewFindViewByPosition) - recyclerView.getPaddingLeft();
    }

    public final void a(sfb sfbVar) {
        if (((sfb) this.h).equals(sfbVar)) {
            return;
        }
        Object obj = this.h;
        this.h = sfbVar;
        this.e = sfbVar.l;
        sfb sfbVar2 = (sfb) obj;
        List list = sfbVar2.m;
        List list2 = sfbVar.m;
        if (list.equals(list2)) {
            return;
        }
        RecyclerView.Adapter adapter = this.f;
        sey seyVar = sfbVar.f;
        seq seqVar = (seq) adapter;
        List list3 = seqVar.a;
        seqVar.a = list2;
        DiffUtil.calculateDiff(new sem(list3, list2)).dispatchUpdatesTo(adapter);
        if (sfbVar2.f.equals(seyVar)) {
            return;
        }
        is isVar = new is((it) this.b);
        while (isVar.hasNext()) {
            ((sdw) isVar.next()).a(seyVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.sfa r20, android.support.v7.widget.RecyclerView r21) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sea.b(sfa, android.support.v7.widget.RecyclerView):void");
    }

    public final void c(klc klcVar) {
        if (((klc) this.h).equals(klcVar)) {
            return;
        }
        Object obj = this.h;
        this.h = klcVar;
        this.e = klcVar.l;
        klc klcVar2 = (klc) obj;
        List list = klcVar2.m;
        List list2 = klcVar.m;
        if (yks.e(list, list2)) {
            return;
        }
        RecyclerView.Adapter adapter = this.f;
        list2.getClass();
        kla klaVar = klcVar.f;
        kku kkuVar = (kku) adapter;
        List list3 = kkuVar.a;
        kkuVar.a = list2;
        DiffUtil.calculateDiff(new kkt(list3, list2)).dispatchUpdatesTo(adapter);
        if (yks.e(klcVar2.f, klaVar)) {
            return;
        }
        is isVar = new is((it) this.b);
        while (isVar.hasNext()) {
            ((kke) isVar.next()).d(klaVar);
        }
    }

    public final void d(klb klbVar, RecyclerView recyclerView) {
        int i;
        int iB;
        Object objC;
        int iMax;
        Object objB;
        klc klcVar;
        int iB2;
        Object obj;
        int i2;
        int iB3;
        int i3;
        Object objC2;
        int iA;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        if (linearLayoutManager == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (this.g == null) {
            Log.e("FireballViewModel", "No tag database available!");
            return;
        }
        if (((klc) this.h).m.isEmpty()) {
            Log.e("FireballViewModel", "No tag list available!");
            return;
        }
        Object obj2 = this.h;
        int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
        if (klbVar != klc.a) {
            if (klbVar != null && klbVar.d()) {
                if (iFindFirstCompletelyVisibleItemPosition != -1) {
                    iB3 = kir.b(iFindFirstCompletelyVisibleItemPosition, recyclerView);
                    i2 = iFindFirstCompletelyVisibleItemPosition;
                } else {
                    i2 = -1;
                    iB3 = 0;
                    iFindFirstCompletelyVisibleItemPosition = 0;
                }
                if (klbVar.e()) {
                    Object obj3 = this.g;
                    obj3.getClass();
                    klc klcVar2 = (klc) obj2;
                    List list = klcVar2.m;
                    int size = list.size();
                    Set set = klcVar2.l;
                    String str = klbVar.f;
                    if (set.contains(str)) {
                        it itVar = new it(set);
                        itVar.remove(str);
                        int iIndexOf = list.indexOf(klbVar);
                        if (iIndexOf <= 0) {
                            i3 = iB3;
                        } else {
                            i3 = iB3;
                            int iIntValue = ((Integer) klcVar2.k.getOrDefault(str, 0)).intValue();
                            kkz kkzVar = (kkz) obj3;
                            if (iIntValue < kkzVar.c) {
                                Log.w("TagBrowseDatabase", str + " too small: " + iIntValue);
                                objC2 = obj2;
                            } else {
                                int i4 = kkzVar.d;
                                klb klbVarA = klbVar.a(klbVar.h & (-2));
                                int i5 = (iIndexOf - (iIntValue - i4)) - 1;
                                klb klbVar2 = (klb) list.get(i5);
                                klb klbVarA2 = klbVar2.a(klbVar2.h | 32);
                                ArrayList arrayList = new ArrayList(size);
                                kkz.f(list, 0, i5, arrayList);
                                arrayList.add(klbVarA2);
                                arrayList.add(klbVarA);
                                if (list.size() > iIndexOf) {
                                    kkz.f(list, iIndexOf + 1, size, arrayList);
                                }
                                objC2 = klcVar2.c(arrayList, itVar);
                            }
                            objC2.getClass();
                            iA = ((klc) objC2).a(klbVar.a) - 1;
                            if (iA >= 0 || iA >= i2) {
                                iB = i3;
                                obj = objC2;
                                objB = obj;
                                iMax = iFindFirstCompletelyVisibleItemPosition;
                            } else {
                                iMax = iA;
                                objB = objC2;
                            }
                        }
                    } else {
                        i3 = iB3;
                    }
                    objC2 = obj2;
                    objC2.getClass();
                    iA = ((klc) objC2).a(klbVar.a) - 1;
                    if (iA >= 0) {
                    }
                    iB = i3;
                    obj = objC2;
                    objB = obj;
                    iMax = iFindFirstCompletelyVisibleItemPosition;
                } else {
                    int i6 = iB3;
                    Object obj4 = this.g;
                    obj4.getClass();
                    objB = ((kkz) obj4).b((klc) obj2, klbVar);
                    objB.getClass();
                    iB = i6;
                    iMax = iFindFirstCompletelyVisibleItemPosition;
                }
            } else if (klbVar == null || (klbVar.h & 32) == 0) {
                klc klcVar3 = (klc) obj2;
                List list2 = klcVar3.m;
                if (!list2.contains(klbVar)) {
                    Log.e("FireballViewModel", "prior tag list missing ".concat(String.valueOf(klbVar != null ? klbVar.b : null)));
                    return;
                }
                if (iFindFirstCompletelyVisibleItemPosition != -1) {
                    iB = kir.b(iFindFirstCompletelyVisibleItemPosition, recyclerView);
                    i = iFindFirstCompletelyVisibleItemPosition;
                } else {
                    i = -1;
                    iFindFirstCompletelyVisibleItemPosition = 0;
                    iB = 0;
                }
                if (klbVar == null || !klbVar.e()) {
                    Object obj5 = this.g;
                    obj5.getClass();
                    klbVar.getClass();
                    if (klbVar.e()) {
                        Log.w("TagBrowseDatabase", "Tag already selected: ".concat(String.valueOf(klbVar.a)));
                        objC = obj2;
                    } else {
                        String str2 = klbVar.a;
                        int iB4 = klcVar3.b(str2);
                        if (iB4 == -1) {
                            Log.w("TagBrowseDatabase", "Tag not present in prior list: ".concat(String.valueOf(str2)));
                            objC = obj2;
                        } else {
                            kkz kkzVar2 = (kkz) obj5;
                            klc klcVarC = kkzVar2.c(klcVar3, iB4);
                            objC = klcVarC;
                            if (kkzVar2.e) {
                                List list3 = klcVarC.e;
                                Set set2 = klcVar3.l;
                                objC = klcVarC.c(kkzVar2.e(list3, set2, klcVarC.k, klcVarC.j), set2);
                            }
                        }
                    }
                    objC.getClass();
                    klc klcVar4 = (klc) objC;
                    int iA2 = klcVar4.f.c == 1 ? 0 : klcVar4.a(klbVar.a);
                    obj = objC;
                    if (recyclerView.getChildCount() != 0) {
                        obj = objC;
                        if (i == -1 || i > iA2) {
                            iMax = Math.max(0, iA2);
                            iB = 0;
                            objB = objC;
                        }
                    }
                } else {
                    Object obj6 = this.g;
                    obj6.getClass();
                    Object objD = obj2;
                    if (klbVar.e()) {
                        objD = obj2;
                        if (list2.indexOf(klbVar) != -1) {
                            String str3 = klbVar.a;
                            kkz kkzVar3 = (kkz) obj6;
                            if (kkzVar3.a.equals(klcVar3.d)) {
                                ArrayList arrayList2 = new ArrayList(klcVar3.f.c - 1);
                                Object obj7 = obj2;
                                while (true) {
                                    klc klcVar5 = (klc) obj7;
                                    String str4 = klcVar5.f.b;
                                    klcVar = klcVar5.h;
                                    klcVar.getClass();
                                    if (str3.equals(str4)) {
                                        break;
                                    }
                                    arrayList2.add(0, str4);
                                    obj7 = klcVar;
                                }
                                objD = kkzVar3.d(klcVar, arrayList2, klcVar3.l);
                            } else {
                                ArrayList arrayList3 = new ArrayList(klcVar3.f);
                                arrayList3.remove(str3);
                                objD = kkzVar3.d(kkzVar3.b, arrayList3, klcVar3.l);
                            }
                        }
                    }
                    objD.getClass();
                    obj = objD;
                }
                objB = obj;
                iMax = iFindFirstCompletelyVisibleItemPosition;
            } else {
                if (iFindFirstCompletelyVisibleItemPosition != -1) {
                    iB2 = kir.b(iFindFirstCompletelyVisibleItemPosition, recyclerView);
                } else {
                    iFindFirstCompletelyVisibleItemPosition = 0;
                    iB2 = 0;
                }
                klc klcVar6 = (klc) obj2;
                List list4 = klcVar6.m;
                int iIndexOf2 = list4.indexOf(klbVar) + 1;
                if (list4.size() <= iIndexOf2) {
                    Log.e("FireballViewModel", "no knob tag after ".concat(String.valueOf(klbVar.b)));
                    return;
                }
                Object obj8 = list4.get(iIndexOf2);
                obj8.getClass();
                klb klbVar3 = (klb) obj8;
                if (!klbVar3.d()) {
                    Log.e("FireballViewModel", String.valueOf(klbVar3.b).concat(" is not a knob"));
                    return;
                }
                Object obj9 = this.g;
                obj9.getClass();
                objB = ((kkz) obj9).b(klcVar6, klbVar3);
                objB.getClass();
                iB = iB2;
                iMax = iFindFirstCompletelyVisibleItemPosition;
            }
            c((klc) objB);
            linearLayoutManager.scrollToPositionWithOffset(iMax, iB);
        }
        if (((klc) obj2).f.isEmpty()) {
            Log.e("FireballViewModel", "Received click on RESET_TAG, but current state has no selections!");
            return;
        }
        Object obj10 = this.g;
        obj10.getClass();
        objB = ((kkz) obj10).b;
        iMax = 0;
        iB = 0;
        c((klc) objB);
        linearLayoutManager.scrollToPositionWithOffset(iMax, iB);
    }

    public sea(RecyclerView recyclerView, int i, int i2, int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        sfb sfbVar = sfb.c;
        this.h = sfbVar;
        this.e = ImmutableSet.of();
        Context context = recyclerView.getContext();
        this.a = recyclerView;
        this.c = i10;
        this.d = i11;
        this.b = new it();
        RecyclerView.ItemDecoration itemDecoration = (sel) recyclerView.getTag(R.id.play__fireball__item_decoration);
        if (itemDecoration != null) {
            recyclerView.removeItemDecoration(itemDecoration);
        }
        sel selVar = new sel(context, new rtb(this, 13), iArr, i3, i4, i5, i6, i7, i8, i9);
        this.i = selVar;
        recyclerView.addItemDecoration(selVar);
        recyclerView.setTag(R.id.play__fireball__item_decoration, selVar);
        recyclerView.setItemAnimator(new sej(selVar));
        RecyclerView.Adapter seqVar = new seq(this, sfbVar.m, i, i2);
        this.f = seqVar;
        recyclerView.setAdapter(seqVar);
    }
}
