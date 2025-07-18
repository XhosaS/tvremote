package defpackage;

import android.database.ContentObserver;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ret extends ContentObserver {
    final /* synthetic */ reu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ret(reu reuVar) {
        super(null);
        this.a = reuVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        reu reuVar = this.a;
        synchronized (reuVar.e) {
            reuVar.f = null;
            reuVar.d.run();
        }
        synchronized (reuVar) {
            Iterator it = reuVar.g.iterator();
            while (it.hasNext()) {
                ((rev) it.next()).a();
            }
        }
    }
}
