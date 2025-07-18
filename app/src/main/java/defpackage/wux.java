package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wux implements wxn, rod {
    private final wso a;

    public wux(wso wsoVar) {
        this.a = wsoVar;
    }

    private static void c(wyr wyrVar, int i) {
        String strConcat;
        if ((wyrVar.b & 32) != 0) {
            wtn wtnVar = wyrVar.h;
            if (wtnVar == null) {
                wtnVar = wtn.a;
            }
            if ((wtnVar.b & 2) != 0) {
                Locale locale = Locale.US;
                String str = ((wvv) wyrVar.e.get(0)).c;
                wtk wtkVar = wtnVar.d;
                if (wtkVar == null) {
                    wtkVar = wtk.a;
                }
                Log.println(i, "trace_manager", String.format(locale, "Trace %s timed out before completion. %s spans remaining", str, Integer.valueOf(wtkVar.d)));
            }
            if ((wtnVar.b & 1) != 0) {
                Locale locale2 = Locale.US;
                String str2 = ((wvv) wyrVar.e.get(0)).c;
                wtm wtmVar = wtnVar.c;
                if (wtmVar == null) {
                    wtmVar = wtm.a;
                }
                Log.println(i, "trace_manager", String.format(locale2, "Trace %s tried to log too many spans. %s spans dropped", str2, Integer.valueOf(wtmVar.c)));
            }
        }
        wr wrVar = new wr(10);
        Iterator it = wyrVar.e.iterator();
        while (it.hasNext()) {
            wrVar.i(r5.d, (wvv) it.next());
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < wrVar.c(); i2++) {
            wvv wvvVar = (wvv) wrVar.g(i2);
            long j = wvvVar.d;
            String str3 = (wvvVar.b & 32) != 0 ? wvvVar.g + " ms" : "unfinished";
            while (true) {
                wvv wvvVar2 = (wvv) wrVar.e(j);
                if (wvvVar2 == null) {
                    strConcat = "Orphaned Root > ".concat(str3);
                    break;
                }
                long j2 = wvvVar2.e;
                str3 = wvvVar2.c + " > " + str3;
                if (j2 == -1) {
                    strConcat = str3;
                    break;
                }
                j = j2;
            }
            arrayList.add(String.format(Locale.US, "%06d\t%s", Long.valueOf(wvvVar.f), strConcat));
        }
        Collections.sort(arrayList);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            Log.println(i, "trace_manager", (String) arrayList.get(i3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rod
    public final zyd a() {
        wso wsoVar = this.a;
        if (wsoVar.a().isEmpty()) {
            return zxy.a;
        }
        if (Log.isLoggable("trace_manager", 4)) {
            Log.i("trace_manager", "The following traces were active when the app crashed:");
            int i = 0;
            zdm zdmVarListIterator = ((yyk) wsoVar.a()).listIterator(0);
            while (zdmVarListIterator.hasNext()) {
                wyv wyvVar = (wyv) zdmVarListIterator.next();
                Log.println(4, "trace_manager", a.b(i, "Trace: "));
                c(wyvVar.c(), 4);
                i++;
            }
        }
        return zxy.a;
    }

    @Override // defpackage.wxn
    public final void b(wyr wyrVar) {
        if (Log.isLoggable("trace_manager", 2)) {
            c(wyrVar, 2);
        }
    }
}
