package defpackage;

import android.view.inputmethod.CompletionInfo;
import com.google.android.apps.tvsearch.results.suggestion.SuggestionChipItem;
import com.google.android.apps.tvsearch.results.suggestion.SuggestionChipList;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyh implements zxe {
    final /* synthetic */ hyi a;

    public hyh(hyi hyiVar) {
        this.a = hyiVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        th.getClass();
        Status.b(th);
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        cxy cxyVar = (cxy) obj;
        cxyVar.getClass();
        hyi hyiVar = this.a;
        hxt hxtVar = hyiVar.h;
        if (hyiVar.f && hxtVar != null) {
            hsx hsxVar = SuggestionChipList.a;
            abxs abxsVar = cxyVar.b;
            abxsVar.getClass();
            ArrayList arrayList = new ArrayList(agqq.i(abxsVar, 10));
            Iterator<E> it = abxsVar.iterator();
            while (it.hasNext()) {
                String str = ((cyd) it.next()).b;
                str.getClass();
                arrayList.add(new SuggestionChipItem(str, null, null, 157862));
            }
            hxtVar.af(new SuggestionChipList("", arrayList, 157862));
            return;
        }
        int size = cxyVar.b.size();
        if (size == 0) {
            return;
        }
        abxs abxsVar2 = cxyVar.b;
        abxsVar2.getClass();
        CompletionInfo[] completionInfoArr = new CompletionInfo[size];
        for (int i = 0; i < size; i++) {
            completionInfoArr[i] = new CompletionInfo(i, i, ((cyd) abxsVar2.get(i)).b);
        }
        hyiVar.d.displayCompletions(hyiVar.e, completionInfoArr);
    }
}
