package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class unh implements zvh {
    public List a;
    final /* synthetic */ unk b;

    public unh(unk unkVar) {
        this.b = unkVar;
    }

    @Override // defpackage.zvh
    public final zyd a() {
        unk unkVar = this.b;
        wvx wvxVarB = unkVar.e.b("Initialize ".concat(String.valueOf(unkVar.a)));
        try {
            synchronized (unkVar.d) {
                if (this.a == null) {
                    this.a = unkVar.f;
                    unkVar.f = Collections.EMPTY_LIST;
                }
            }
            ArrayList arrayList = new ArrayList(this.a.size());
            unj unjVar = new unj(this.b);
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(((zvi) it.next()).a(unjVar));
                } catch (Exception e) {
                    arrayList.add(zxn.g(e));
                }
            }
            zyd zydVarA = zxn.c(arrayList).a(new Callable() { // from class: ung
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    unh unhVar = this.a;
                    synchronized (unhVar.b.d) {
                        unhVar.a = null;
                    }
                    return null;
                }
            }, zwk.a);
            wvxVarB.a(zydVarA);
            wvxVarB.close();
            return zydVarA;
        } catch (Throwable th) {
            try {
                wvxVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
