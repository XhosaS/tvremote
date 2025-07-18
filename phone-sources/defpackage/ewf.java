package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.UnmodifiableIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ewf implements ecq {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ewf(fnl fnlVar, fnw fnwVar, int i) {
        this.c = i;
        this.b = fnlVar;
        this.a = fnwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ecq
    public final void a(Object obj) {
        int i = this.c;
        if (i == 0) {
            ((ewg) obj).di(0, (evz) this.a, (evv) this.b);
            return;
        }
        if (i == 1) {
            ((ewg) obj).cX(0, (evz) ((eph) this.a).c, (evv) this.b);
            return;
        }
        if (i == 2) {
            foo fooVar = (foo) ((fnl) this.b).a.get();
            if (fooVar == null || fooVar.s()) {
                return;
            }
            fooVar.m((fnw) this.a, false);
            return;
        }
        fqt fqtVar = (fqt) obj;
        Object ebfVar = this.b;
        ebf ebfVar2 = (ebf) ebfVar;
        ImmutableMap immutableMap = ebfVar2.am;
        if (!immutableMap.isEmpty()) {
            ebe ebeVar = new ebe(ebfVar2);
            ebeVar.e();
            UnmodifiableIterator it = immutableMap.values().iterator();
            while (it.hasNext()) {
                Object obj2 = this.a;
                ebb ebbVar = (ebb) it.next();
                eba ebaVar = ebbVar.c;
                eba ebaVar2 = (eba) ((fnl) obj2).c.inverse().get(ebaVar.d);
                if (ebaVar2 == null || ebaVar.c != ebaVar2.c) {
                    ebeVar.c(ebbVar);
                } else {
                    ebeVar.c(new ebb(ebaVar2, ebbVar.d));
                }
            }
            ebfVar = new ebf(ebeVar);
        }
        fqtVar.aC();
        fqtVar.a.af((ebf) ebfVar);
    }

    public /* synthetic */ ewf(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
