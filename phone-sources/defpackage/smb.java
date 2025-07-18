package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class smb implements ufv {
    public List a;
    public final /* synthetic */ smc b;

    public smb(smc smcVar) {
        this.b = smcVar;
    }

    @Override // defpackage.ufv
    public final uhp a() {
        smc smcVar = this.b;
        tql tqlVarJ = sss.j("Initialize ".concat(String.valueOf(smcVar.a)));
        try {
            synchronized (smcVar.d) {
                if (this.a == null) {
                    this.a = smcVar.e;
                    smcVar.e = Collections.EMPTY_LIST;
                }
            }
            ArrayList arrayList = new ArrayList(this.a.size());
            zft zftVar = new zft(this.b, null);
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(((ufw) it.next()).a(zftVar));
                } catch (Exception e) {
                    arrayList.add(sfy.B(e));
                }
            }
            uhp uhpVarA = sfy.O(arrayList).a(new rjs(this, 9), ugk.a);
            tqlVarJ.a(uhpVarA);
            tqlVarJ.close();
            return uhpVarA;
        } catch (Throwable th) {
            try {
                tqlVarJ.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
