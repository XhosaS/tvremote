package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tlf extends tkz {
    public final Map h;
    public Thread i;
    public boolean j;
    public final Handler k;
    private final List l;
    private final String m;

    public tlf(Context context) {
        super(context);
        this.k = new tld(this, Looper.getMainLooper());
        this.l = new ArrayList();
        this.h = new HashMap();
        this.m = "_androidtvremote2._tcp.local.";
    }

    public static int i(Inet4Address inet4Address) {
        byte[] address = inet4Address.getAddress();
        return (address[3] & 255) | (address[0] << 24) | ((address[1] & 255) << 16) | ((address[2] & 255) << 8);
    }

    @Override // defpackage.tkz
    public final void b() {
        Map map = this.h;
        synchronized (map) {
            if (!map.isEmpty()) {
                List listA = a();
                ArrayList<tli> arrayList = new ArrayList();
                synchronized (map) {
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        arrayList.add(((tle) it.next()).a);
                    }
                    for (tli tliVar : arrayList) {
                        Iterator it2 = listA.iterator();
                        while (it2.hasNext()) {
                            ((ulp) it2.next()).al(tliVar);
                        }
                    }
                    map.clear();
                }
            }
        }
    }

    @Override // defpackage.tkz
    protected final void e(Collection collection) {
        if (collection.isEmpty()) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            NetworkInterface networkInterface = (NetworkInterface) it.next();
            tlb tlbVar = new tlb(this, this.m, networkInterface, networkInterface);
            try {
                tlbVar.b();
                this.l.add(tlbVar);
            } catch (IOException unused) {
                Log.w("AtvRemote.MdnsDvcScnner", "Couldn't start MDNS client for ".concat(String.valueOf(String.valueOf(networkInterface))));
            }
        }
        this.j = false;
        Thread thread = new Thread(new tci(this, 20));
        this.i = thread;
        thread.start();
    }

    @Override // defpackage.tkz
    protected final void g() {
        List list = this.l;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((tlb) it.next()).c();
            }
            list.clear();
        }
        this.j = true;
        if (this.i != null) {
            while (true) {
                try {
                    this.i.interrupt();
                    this.i.join();
                    break;
                } catch (InterruptedException unused) {
                }
            }
            this.i = null;
        }
        this.k.removeMessages(1);
    }
}
