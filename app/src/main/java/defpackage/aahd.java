package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aahd implements kfs {
    public static final AtomicReference a = new AtomicReference();

    @Override // defpackage.kfs
    public final void a(boolean z) {
        synchronized (aahf.a) {
            Iterator it = new ArrayList(aahf.b.values()).iterator();
            while (it.hasNext()) {
                aahf aahfVar = (aahf) it.next();
                if (aahfVar.g.get()) {
                    Log.d("FirebaseApp", "Notifying background state change listeners.");
                    Iterator it2 = aahfVar.i.iterator();
                    while (it2.hasNext()) {
                        aahf aahfVar2 = ((aahc) it2.next()).a;
                        if (!z) {
                            ((aalt) aahfVar2.h.a()).c();
                        }
                    }
                }
            }
        }
    }
}
