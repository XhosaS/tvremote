package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nkc extends nrx {
    final /* synthetic */ String a;
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nkc(nwu nwuVar, String str, String str2) {
        super(nwuVar);
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.nrx, defpackage.nxr
    public final /* bridge */ /* synthetic */ void b(nwf nwfVar) {
        nrs nrsVar = (nrs) nwfVar;
        try {
            String str = this.a;
            String str2 = this.b;
            if (TextUtils.isEmpty(str2)) {
                throw new IllegalArgumentException("The message payload cannot be null or empty");
            }
            if (str2.length() > 524288) {
                nrs.a.d("Message send failed. Message exceeds maximum size", new Object[0]);
                throw new IllegalArgumentException("Message exceeds maximum size");
            }
            nrv.h(str);
            long jIncrementAndGet = nrsVar.n.incrementAndGet();
            try {
                nrsVar.q.put(Long.valueOf(jIncrementAndGet), this);
                nsa nsaVar = (nsa) nrsVar.L();
                if (!nrsVar.w()) {
                    nrsVar.s(jIncrementAndGet, 2016);
                } else {
                    Context context = nrsVar.u;
                    nsaVar.e(str, str2, jIncrementAndGet, ocv.q());
                }
            } catch (Throwable th) {
                nrsVar.q.remove(Long.valueOf(jIncrementAndGet));
                throw th;
            }
        } catch (IllegalArgumentException | IllegalStateException unused) {
            f();
        }
    }
}
