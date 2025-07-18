package defpackage;

import com.google.android.apps.tvsearch.results.suggestion.SuggestionChipItem;
import com.google.android.apps.tvsearch.results.suggestion.SuggestionChipList;
import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffa {
    public final abeq a(SuggestionChipList suggestionChipList) {
        abeq abeqVar = abeq.a;
        abep abepVar = new abep();
        for (SuggestionChipItem suggestionChipItem : suggestionChipList.d) {
            DesugarCollections.unmodifiableList(((abeq) abepVar.b).b).getClass();
            abeo abeoVar = abeo.a;
            aben abenVar = new aben();
            int i = ((zpk) suggestionChipItem.f.a.b).d;
            if ((abenVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                abenVar.y();
            }
            abeo abeoVar2 = (abeo) abenVar.b;
            abeoVar2.b |= 4;
            abeoVar2.e = i;
            xaq xaqVar = suggestionChipItem.c;
            if (xaqVar != null) {
                if ((abenVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    abenVar.y();
                }
                abeo abeoVar3 = (abeo) abenVar.b;
                abeoVar3.d = xaqVar;
                abeoVar3.b |= 2;
            }
            String str = suggestionChipItem.a;
            if ((abenVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                abenVar.y();
            }
            abeo abeoVar4 = (abeo) abenVar.b;
            abeoVar4.b |= 1;
            abeoVar4.c = str;
            abxd abxdVarV = abenVar.v();
            abxdVarV.getClass();
            abeo abeoVar5 = (abeo) abxdVarV;
            if ((abepVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                abepVar.y();
            }
            abeq abeqVar2 = (abeq) abepVar.b;
            abxs abxsVar = abeqVar2.b;
            if (!abxsVar.c()) {
                int size = abxsVar.size();
                abeqVar2.b = abxsVar.d(size + size);
            }
            abeqVar2.b.add(abeoVar5);
        }
        abxd abxdVarV2 = abepVar.v();
        abxdVarV2.getClass();
        return (abeq) abxdVarV2;
    }
}
