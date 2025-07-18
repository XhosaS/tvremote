package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgb implements chs {
    public List a;
    public final /* synthetic */ bgc b;

    public bgb(bgc bgcVar) {
        this.b = bgcVar;
    }

    @Override // defpackage.chs
    public final cja a() {
        bgc bgcVar = this.b;
        bxb bxbVarL = awn.l("Initialize ".concat(String.valueOf(bgcVar.a)));
        try {
            synchronized (bgcVar.c) {
                if (this.a == null) {
                    this.a = bgcVar.d;
                    bgcVar.d = Collections.EMPTY_LIST;
                }
            }
            ArrayList arrayList = new ArrayList(this.a.size());
            byj byjVar = new byj(this.b, null);
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(((cht) it.next()).a(byjVar));
                } catch (Exception e) {
                    arrayList.add(new civ(e));
                }
            }
            cja cjaVarA = qm.I(arrayList).a(new aqb(this, 4), chz.a);
            bxbVarL.a(cjaVarA);
            bxbVarL.close();
            return cjaVarA;
        } catch (Throwable th) {
            try {
                bxbVarL.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
