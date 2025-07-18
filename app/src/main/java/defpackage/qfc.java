package defpackage;

import android.net.Uri;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class qfc implements uht, qjo {
    private final qeu b;
    public final HashMap a = new HashMap();
    private final HashMap c = new HashMap();

    public qfc(Executor executor) {
        new zyt(executor);
        this.b = new qeu(executor);
    }

    @Override // defpackage.uht
    public final uhs a(Uri uri) {
        return b(uri);
    }

    @Override // defpackage.uht
    public final uhs b(Uri uri) {
        synchronized (qfc.class) {
            String str = (String) this.a.get(uri);
            if (str == null) {
                return this.b.b(uri);
            }
            HashMap map = this.c;
            if (map.get(str) == null) {
                int i = qce.a;
                return null;
            }
            return (uhs) map.get(str);
        }
    }

    @Override // defpackage.qjo
    public final void e() {
        synchronized (qfc.class) {
            Iterator it = this.c.values().iterator();
            if (it.hasNext()) {
                throw null;
            }
            this.b.e();
        }
    }

    public final void g(String str, long j) {
        synchronized (qfc.class) {
            HashMap map = this.c;
            if (map.containsKey(str)) {
                ((uha) map.get(str)).a.a(j);
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
