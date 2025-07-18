package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class edg extends dtu {
    private final WeakReference a;

    public edg(edf edfVar) {
        super(null, -1, null);
        this.a = new WeakReference(edfVar);
    }

    @Override // defpackage.dtu
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void cC(ecn ecnVar) {
        edf edfVar = (edf) this.a.get();
        if (edfVar == null) {
            return;
        }
        int i = ecnVar.b;
        ecb ecbVar = edfVar.m;
        if (ecbVar != null) {
            boolean z = ecnVar.a;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 1) {
                ((eel) ecbVar).a(eek.LOADED);
            } else if (i2 == 2) {
                eel eelVar = (eel) ecbVar;
                eelVar.a(eek.LOADED);
                eelVar.a.d();
            } else if (i2 == 3) {
                eel eelVar2 = (eel) ecbVar;
                eelVar2.a(eek.LOADED);
                eelVar2.a.d();
            }
        }
        if (dyd.b()) {
            edfVar.m(i);
            return;
        }
        ((emj) edfVar.b).post(new ecw(edfVar, i));
    }
}
