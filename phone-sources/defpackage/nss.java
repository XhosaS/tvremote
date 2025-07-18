package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.os.Build;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nss {
    public final ConnectivityManager.NetworkCallback a;
    public final ConnectivityManager b;
    public final Map c;
    public final List d;
    public boolean e;
    public final Context f;
    public final Object g = new Object();
    public final boolean h;
    public final BroadcastReceiver i;
    public final Set j;
    private final uhs k;

    static {
        new nsf("ConnectivityMonitor");
    }

    public nss(Context context, uhs uhsVar) {
        this.h = Build.VERSION.SDK_INT >= 31;
        this.i = new nsq(this);
        this.j = DesugarCollections.synchronizedSet(new HashSet());
        this.k = uhsVar;
        this.f = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.c = DesugarCollections.synchronizedMap(new HashMap());
        this.d = DesugarCollections.synchronizedList(new ArrayList());
        this.a = new nsr(this);
    }

    public final void a(Network network, LinkProperties linkProperties) {
        List list;
        synchronized (this.g) {
            Map map = this.c;
            if (map == null || (list = this.d) == null) {
                return;
            }
            nsf.e();
            if (map.containsKey(network)) {
                list.remove(network);
            }
            map.put(network, linkProperties);
            list.add(network);
            b();
        }
    }

    public final void b() {
        uhs uhsVar = this.k;
        if (uhsVar == null) {
            return;
        }
        Set<nsp> set = this.j;
        synchronized (set) {
            for (nsp nspVar : set) {
                if (!uhsVar.isShutdown()) {
                    uhsVar.execute(new non(this, nspVar, 4));
                }
            }
        }
    }
}
