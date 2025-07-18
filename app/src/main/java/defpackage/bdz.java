package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bdz {
    public final bco a;
    private final Handler b = new Handler(Looper.getMainLooper());
    private bdy c;

    public bdz(bcl bclVar) {
        this.a = new bco(bclVar);
    }

    public final void a(bce bceVar) {
        bdy bdyVar = this.c;
        if (bdyVar != null) {
            bdyVar.run();
        }
        bdy bdyVar2 = new bdy(this.a, bceVar);
        this.c = bdyVar2;
        this.b.postAtFrontOfQueue(bdyVar2);
    }
}
