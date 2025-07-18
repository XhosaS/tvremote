package defpackage;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wff implements wcp {
    private final AtomicReference a;

    public wff(Map map, wdw wdwVar) {
        this.a = new AtomicReference(new wfe(map, wdwVar, false));
    }

    @Override // defpackage.wcp
    public final wag a(String str, agux aguxVar) {
        wfe wfeVar;
        wfe wfeVar2 = null;
        while (true) {
            AtomicReference atomicReference = this.a;
            wfeVar = (wfe) atomicReference.get();
            wfeVar.getClass();
            if (wfeVar.b) {
                break;
            }
            if (wfeVar2 == null) {
                wfeVar2 = new wfe(wfeVar.c, wfeVar.a, true);
            } else {
                yyr yyrVar = wfeVar.c;
                yyrVar.getClass();
                wfeVar2.c = yyrVar;
                wdw wdwVar = wfeVar.a;
                wdwVar.getClass();
                wfeVar2.a = wdwVar;
            }
            if (wfd.a(atomicReference, wfeVar, wfeVar2)) {
                aguxVar.a(wfeVar.a);
                wfeVar = wfeVar2;
                break;
            }
        }
        yyr yyrVar2 = wfeVar.c;
        yyrVar2.getClass();
        return (wag) agrj.a(yyrVar2, str);
    }

    @Override // defpackage.wcp
    public final wdw b() {
        return ((wfe) this.a.get()).a;
    }

    @Override // defpackage.wcp
    public final void c() {
        throw new UnsupportedOperationException("Can't change observed values");
    }

    @Override // defpackage.wcp
    public final boolean d() {
        return false;
    }

    @Override // defpackage.wcp
    public final boolean e(Map map, wdw wdwVar) {
        AtomicReference atomicReference;
        wfe wfeVar;
        wfe wfeVar2 = null;
        do {
            atomicReference = this.a;
            wfeVar = (wfe) atomicReference.get();
            if (wfeVar.b) {
                return false;
            }
            if (wfeVar2 == null) {
                wfeVar2 = new wfe(map, wdwVar, false);
            }
        } while (!wfd.a(atomicReference, wfeVar, wfeVar2));
        return true;
    }
}
