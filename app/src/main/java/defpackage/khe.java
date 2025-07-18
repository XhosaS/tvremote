package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class khe {
    public Bundle b;
    private final Map c = DesugarCollections.synchronizedMap(new we());
    public int a = 0;

    final void a(int i, int i2, Intent intent) {
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            ((kha) it.next()).c(i, i2, intent);
        }
    }

    final void b(Bundle bundle) {
        this.a = 1;
        this.b = bundle;
        for (Map.Entry entry : this.c.entrySet()) {
            ((kha) entry.getValue()).d(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    final void c() {
        this.a = 5;
        for (kha khaVar : this.c.values()) {
        }
    }

    final void d() {
        this.a = 3;
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            ((kha) it.next()).h();
        }
    }

    final void e(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.c.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((kha) entry.getValue()).g(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    final void f() {
        this.a = 2;
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            ((kha) it.next()).i();
        }
    }

    final void g() {
        this.a = 4;
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            ((kha) it.next()).j();
        }
    }

    final void h(kha khaVar) {
        Map map = this.c;
        if (map.containsKey("ConnectionlessLifecycleHelper")) {
            throw new IllegalArgumentException("LifecycleCallback with tag ConnectionlessLifecycleHelper already added to this fragment.");
        }
        map.put("ConnectionlessLifecycleHelper", khaVar);
        if (this.a > 0) {
            new kos(Looper.getMainLooper()).post(new khd(this, khaVar));
        }
    }

    final void i() {
        for (kha khaVar : this.c.values()) {
        }
    }

    final kha j(Class cls) {
        return (kha) cls.cast(this.c.get("ConnectionlessLifecycleHelper"));
    }
}
