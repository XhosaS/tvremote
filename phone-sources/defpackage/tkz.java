package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class tkz {
    public final ConnectivityManager a;
    public Set d;
    public tky f;
    public boolean g;
    private boolean h;
    public final Handler b = new Handler(Looper.getMainLooper());
    public int e = 0;
    public final List c = new ArrayList();

    protected tkz(Context context) {
        this.a = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public static final Set h() throws SocketException {
        HashSet hashSet = new HashSet();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces != null) {
                while (networkInterfaces.hasMoreElements()) {
                    NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                    if (networkInterfaceNextElement.isUp() && !networkInterfaceNextElement.isLoopback() && !networkInterfaceNextElement.isPointToPoint() && networkInterfaceNextElement.supportsMulticast()) {
                        Iterator<InterfaceAddress> it = networkInterfaceNextElement.getInterfaceAddresses().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (it.next().getAddress() instanceof Inet4Address) {
                                hashSet.add(networkInterfaceNextElement);
                                break;
                            }
                        }
                    }
                }
            }
        } catch (IOException unused) {
        }
        return hashSet;
    }

    public final List a() {
        ArrayList arrayList;
        List list = this.c;
        synchronized (list) {
            arrayList = new ArrayList(list);
        }
        return arrayList;
    }

    public abstract void b();

    public final void c(tli tliVar) {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((ulp) it.next()).al(tliVar);
        }
    }

    public final void d() {
        if (this.h) {
            return;
        }
        this.h = true;
        e(this.d);
    }

    protected abstract void e(Collection collection);

    public final void f() {
        this.h = false;
        g();
    }

    protected abstract void g();
}
