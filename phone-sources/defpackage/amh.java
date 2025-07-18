package defpackage;

import android.content.Context;
import android.os.LocaleList;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amh extends yiz implements yjz {
    final /* synthetic */ CharSequence a;
    final /* synthetic */ long b;
    final /* synthetic */ goe c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amh(goe goeVar, CharSequence charSequence, long j, yih yihVar) {
        super(2, yihVar);
        this.c = goeVar;
        this.a = charSequence;
        this.b = j;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amh) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        return new amh(this.c, this.a, this.b, yihVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        LocaleList localeList;
        String str;
        ybn.f(obj);
        goe goeVar = this.c;
        Object obj2 = goeVar.e;
        TextClassifier textClassifier = obj2;
        if (obj2 == null) {
            Object obj3 = goeVar.b;
            Object obj4 = goeVar.a;
            Context context = (Context) obj3;
            TextClassificationManager textClassificationManagerM71m = bb$$ExternalSyntheticApiModelOutline1.m71m(context.getSystemService(bb$$ExternalSyntheticApiModelOutline1.m73m()));
            int iOrdinal = ((amm) obj4).ordinal();
            if (iOrdinal == 0) {
                str = "edittext";
            } else {
                if (iOrdinal != 1) {
                    throw new yfu();
                }
                str = "textview";
            }
            TextClassifier textClassifierCreateTextClassificationSession = textClassificationManagerM71m.createTextClassificationSession(new TextClassificationContext.Builder(context.getPackageName(), str).build());
            goeVar.e = textClassifierCreateTextClassificationSession;
            textClassifier = textClassifierCreateTextClassificationSession;
        }
        ?? r7 = goeVar.d;
        if (r7 != 0) {
            ArrayList arrayList = new ArrayList(yfm.z(r7, 10));
            Iterator it = r7.iterator();
            while (it.hasNext()) {
                arrayList.add(((ckp) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            localeList = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        } else {
            localeList = new LocaleList(cko.d().a);
        }
        CharSequence charSequence = this.a;
        long j = this.b;
        TextSelection textSelectionSuggestSelection = textClassifier.suggestSelection(new TextSelection.Request.Builder(charSequence.toString(), chb.d(j), chb.c(j)).setDefaultLocales(localeList).build());
        return new chb(ccf.N(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex()));
    }
}
