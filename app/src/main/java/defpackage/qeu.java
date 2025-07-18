package defpackage;

import android.net.Uri;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class qeu implements uht, qjo {
    private final HashMap a = new HashMap();

    public qeu(Executor executor) {
        new zyt(executor);
    }

    @Override // defpackage.uht
    public final uhs a(Uri uri) {
        return b(uri);
    }

    @Override // defpackage.uht
    public final uhs b(Uri uri) {
        synchronized (qeu.class) {
            HashMap map = this.a;
            if (map.get(uri) == null) {
                return null;
            }
            return (uhs) map.get(uri);
        }
    }

    @Override // defpackage.qjo
    public final void e() {
        synchronized (qeu.class) {
            Iterator it = this.a.values().iterator();
            if (it.hasNext()) {
                throw null;
            }
        }
    }

    @Override // defpackage.qjo
    public final void c() {
    }

    @Override // defpackage.qjo
    public final void d() {
    }

    @Override // defpackage.uht
    public final void f() {
    }
}
