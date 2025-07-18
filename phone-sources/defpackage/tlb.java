package defpackage;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.NetworkInterface;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tlb {
    public final String a;
    public MulticastSocket b;
    public volatile boolean d;
    final /* synthetic */ NetworkInterface f;
    final /* synthetic */ tlf g;
    private InetSocketAddress h;
    private Thread i;
    private Thread j;
    private final NetworkInterface k;
    private final String[] l;
    public final byte[] c = new byte[65536];
    public final Set e = new LinkedHashSet();

    public tlb(tlf tlfVar, String str, NetworkInterface networkInterface, NetworkInterface networkInterface2) {
        this.f = networkInterface2;
        this.g = tlfVar;
        this.a = str;
        this.k = networkInterface;
        String[] strArrSplit = str.split("\\.");
        this.l = strArrSplit;
        for (String str2 : strArrSplit) {
        }
    }

    private static void d(Thread thread) {
        thread.interrupt();
        sfy.r(thread);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0173, code lost:
    
        if (r8 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0175, code lost:
    
        r10.put(r11, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.net.DatagramPacket r27) {
        /*
            Method dump skipped, instructions count: 1064
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tlb.a(java.net.DatagramPacket):void");
    }

    public final synchronized void b() {
        if (this.b != null) {
            return;
        }
        this.d = false;
        MulticastSocket multicastSocket = new MulticastSocket(5353);
        this.b = multicastSocket;
        multicastSocket.setTimeToLive(1);
        NetworkInterface networkInterface = this.k;
        if (networkInterface != null) {
            this.b.setNetworkInterface(networkInterface);
        }
        InetSocketAddress inetSocketAddress = new InetSocketAddress(tlc.b, 5353);
        this.h = inetSocketAddress;
        this.b.joinGroup(inetSocketAddress, networkInterface);
        Thread thread = new Thread(new tci(this, 18));
        this.i = thread;
        thread.start();
        Thread thread2 = new Thread(new tci(this, 19));
        this.j = thread2;
        thread2.start();
    }

    public final synchronized void c() {
        if (this.b == null) {
            return;
        }
        this.d = true;
        try {
            this.b.leaveGroup(this.h, this.k);
        } catch (IOException unused) {
        }
        this.b.close();
        Thread thread = this.i;
        if (thread != null) {
            d(thread);
            this.i = null;
        }
        Thread thread2 = this.j;
        if (thread2 != null) {
            d(thread2);
            this.j = null;
        }
        this.b = null;
    }
}
