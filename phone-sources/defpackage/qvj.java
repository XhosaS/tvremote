package defpackage;

import android.accounts.Account;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qvj implements uha {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public qvj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, rig] */
    @Override // defpackage.uha
    public final void a(Throwable th) {
        switch (this.b) {
            case 0:
                Log.e(qvk.a, "Failed to load owners", th);
                return;
            case 1:
                Object obj = this.a;
                synchronized (obj) {
                    ((peb) obj).d = null;
                }
                return;
            case 2:
                Log.w("AvatarRetriever", "Failed to load avatar.", th);
                this.a.a(null);
                return;
            case 3:
                Log.e("OneGoogle", String.format("Failed to load accounts. Exception: %s", rrx.aq(th)));
                ((rjw) this.a).b.c(new Account[0]);
                return;
            case 4:
            case 5:
            case 6:
                return;
            default:
                ((usj) this.a).a.h(new usi(2, null, th));
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0155  */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, rig] */
    @Override // defpackage.uha
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void b(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qvj.b(java.lang.Object):void");
    }
}
