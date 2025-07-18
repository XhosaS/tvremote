package defpackage;

import android.os.Looper;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tkj {
    final /* synthetic */ tkk a;
    private final Set b = new LinkedHashSet();
    private zyd c;

    public tkj(tkk tkkVar) {
        this.a = tkkVar;
    }

    final synchronized void a(List list) {
        if (!list.isEmpty()) {
            this.b.add(list);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                c();
            } else if (this.c == null) {
                tkk tkkVar = this.a;
                this.c = tkkVar.b.submit(wyo.h(new Runnable() { // from class: tki
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.c();
                    }
                }));
            }
        }
    }

    public final synchronized void b() {
        boolean z;
        tkk tkkVar = this.a;
        if (tkkVar.j) {
            ((zdv) ((zdv) ((zdv) tkk.a.c()).o(tmm.a, tkkVar.g.a(Level.SEVERE).a())).q("com/google/android/libraries/search/rendering/xuikit/elements/logging/GilElementsInteractionLogger$PendingCveBuffer", "createCves", 422, "GilElementsInteractionLogger.java")).u("GilElementsInteractionLogger was cleaned up, cannot create CVEs");
            return;
        }
        do {
            Iterator it = this.b.iterator();
            z = false;
            while (it.hasNext()) {
                List<tks> list = (List) it.next();
                tkh tkhVar = tkkVar.i;
                if (tkhVar.h(list.isEmpty() ? 0 : ((tks) list.get(0)).d.e)) {
                    for (tks tksVar : list) {
                        if (tksVar instanceof tkn) {
                            tkhVar.e((tkn) tksVar);
                        } else if ((tksVar instanceof tkr) || (tksVar instanceof tkq)) {
                            tkhVar.f(tksVar.d);
                        } else if (tksVar instanceof tkp) {
                            int i = ((tkp) tksVar).a.d;
                            zdv zdvVar = (zdv) tkk.a.c();
                            tmm tmmVar = tkkVar.g;
                            zer zerVar = tmm.a;
                            tml tmlVarA = tmmVar.a(Level.SEVERE);
                            acjk acjkVar = tmlVarA.a;
                            if ((acjkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                acjkVar.y();
                            }
                            acjl acjlVar = (acjl) acjkVar.b;
                            acjl acjlVar2 = acjl.a;
                            acjlVar.c |= 4;
                            acjlVar.f = i;
                            ((zdv) ((zdv) zdvVar.o(zerVar, tmlVarA.a())).q("com/google/android/libraries/search/rendering/xuikit/elements/logging/GilElementsInteractionLogger", "createCve", 368, "GilElementsInteractionLogger.java")).v("Conflicting logging properties for VE %d", i);
                        }
                    }
                    it.remove();
                    z = true;
                }
            }
        } while (z);
        zyd zydVar = this.c;
        if (zydVar != null) {
            zydVar.cancel(false);
            this.c = null;
        }
    }

    public final void c() {
        tkk tkkVar = this.a;
        if (!tkkVar.j) {
            b();
            tkkVar.c.b();
        } else {
            ((zdv) ((zdv) ((zdv) tkk.a.c()).o(tmm.a, tkkVar.g.a(Level.SEVERE).a())).q("com/google/android/libraries/search/rendering/xuikit/elements/logging/GilElementsInteractionLogger$PendingCveBuffer", "createCvesAndMaybeFlush", 472, "GilElementsInteractionLogger.java")).u("GilElementsInteractionLogger was cleaned up, cannot create CVEs and flush");
        }
    }
}
