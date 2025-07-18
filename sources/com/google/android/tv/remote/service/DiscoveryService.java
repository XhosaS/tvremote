package com.google.android.tv.remote.service;

import android.content.Intent;
import android.database.ContentObserver;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import android.os.IBinder;
import defpackage.bno;
import defpackage.bnp;
import defpackage.bnq;
import defpackage.bov;
import defpackage.bpn;
import defpackage.bpo;
import defpackage.cbt;
import defpackage.cpa;
import defpackage.dka;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CoderResult;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DiscoveryService extends cpa {
    public static final cbt a = cbt.k("com/google/android/tv/remote/service/DiscoveryService");
    public String b;
    public bpo c;
    public boolean d;
    public String e;
    public long f;
    public long g;
    public long h;
    public dka i;
    private String k;
    private NsdManager l;
    private NsdManager.RegistrationListener m;
    private NsdServiceInfo n;
    private final ContentObserver j = new bnp(this);
    private final bpn o = new bno(this, 0);

    private final NsdServiceInfo b() {
        NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
        nsdServiceInfo.setPort(6466);
        nsdServiceInfo.setServiceType("_androidtvremote2._tcp.");
        String strSubstring = this.e;
        if (Build.VERSION.SDK_INT < 34 && strSubstring.length() > 15) {
            CharBuffer charBufferWrap = CharBuffer.wrap(strSubstring);
            if (StandardCharsets.UTF_8.newEncoder().encode(charBufferWrap, ByteBuffer.allocate(63), true) == CoderResult.OVERFLOW) {
                strSubstring = strSubstring.substring(0, charBufferWrap.position());
            }
        }
        nsdServiceInfo.setServiceName(strSubstring);
        if (this.d && bov.a(this)) {
            nsdServiceInfo.setAttribute("wp", "6465");
            nsdServiceInfo.setAttribute("isDeviceInStandbyMode", "false");
        }
        String str = this.k;
        if (str != null) {
            nsdServiceInfo.setAttribute("bt", str);
        }
        long j = this.f;
        if (j != this.g) {
            nsdServiceInfo.setAttribute("id0", Long.toHexString(j));
            nsdServiceInfo.setAttribute("id1", Long.toHexString(this.g));
            nsdServiceInfo.setAttribute("id2", Long.toHexString(this.h));
        }
        return nsdServiceInfo;
    }

    private final void c(NsdServiceInfo nsdServiceInfo) {
        bnq bnqVar = new bnq(this);
        this.m = bnqVar;
        this.n = nsdServiceInfo;
        this.l.registerService(nsdServiceInfo, 1, bnqVar);
    }

    private final synchronized void d() {
        this.n = null;
        this.l.unregisterService(this.m);
        this.m = null;
    }

    public final synchronized void a() {
        NsdManager.RegistrationListener registrationListener = this.m;
        if (registrationListener == null) {
            return;
        }
        this.l.unregisterService(registrationListener);
        c(b());
    }

    @Override // android.app.Service
    protected final synchronized void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.printf("Advertising NDS service: %s%n\t%s%n", this.b, this.n);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006d A[Catch: all -> 0x00fe, TryCatch #0 {, blocks: (B:7:0x003e, B:9:0x0061, B:36:0x00ec, B:37:0x00fc, B:12:0x006d, B:16:0x0087, B:18:0x008d, B:20:0x0099, B:22:0x009f, B:24:0x00a9, B:26:0x00b1, B:28:0x00b8, B:29:0x00be, B:30:0x00d5, B:32:0x00df, B:34:0x00e7, B:15:0x007a), top: B:42:0x003e }] */
    @Override // defpackage.cpa, android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate() {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.tv.remote.service.DiscoveryService.onCreate():void");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        getContentResolver().unregisterContentObserver(this.j);
        this.c.c(this.o);
        d();
    }
}
