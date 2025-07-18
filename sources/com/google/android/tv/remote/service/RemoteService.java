package com.google.android.tv.remote.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;
import android.media.MediaRouter2$RouteCallback;
import android.media.RouteDiscoveryPreference;
import android.os.Build;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import defpackage.adx;
import defpackage.ame;
import defpackage.aoo;
import defpackage.att;
import defpackage.bdq;
import defpackage.bid;
import defpackage.blq;
import defpackage.bna;
import defpackage.bnd;
import defpackage.bnu;
import defpackage.bny;
import defpackage.bov;
import defpackage.bow;
import defpackage.box;
import defpackage.bpe;
import defpackage.bpf;
import defpackage.bpg;
import defpackage.bph;
import defpackage.bpm;
import defpackage.bpo;
import defpackage.bpt;
import defpackage.bpy;
import defpackage.bqh;
import defpackage.bqo;
import defpackage.bqv;
import defpackage.bqw;
import defpackage.brj;
import defpackage.bsi;
import defpackage.bsp;
import defpackage.bsv;
import defpackage.bsy;
import defpackage.bsz;
import defpackage.bta;
import defpackage.btc;
import defpackage.btf;
import defpackage.bth;
import defpackage.btj;
import defpackage.btt;
import defpackage.btv;
import defpackage.bty;
import defpackage.buc;
import defpackage.buf;
import defpackage.bug;
import defpackage.bul;
import defpackage.buy;
import defpackage.bxj;
import defpackage.byj;
import defpackage.bzs;
import defpackage.bzt;
import defpackage.cax;
import defpackage.cbf;
import defpackage.cbj;
import defpackage.cbs;
import defpackage.cbt;
import defpackage.cch;
import defpackage.cck;
import defpackage.cpj;
import defpackage.crv;
import defpackage.nf;
import defpackage.pd$$ExternalSyntheticApiModelOutline3;
import j$.util.DesugarArrays;
import j$.util.Objects;
import j$.util.Optional;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RemoteService extends buf {
    public static final cbt a = cbt.k("com/google/android/tv/remote/service/RemoteService");
    private bna A;
    private bpt B;
    private bpy C;
    private buc D;
    private MediaRouter2 E;
    private MediaRouter2$ControllerCallback F;
    private MediaRouter2$RouteCallback G;
    public AtvRemoteProviderService b;
    public Looper e;
    public boolean f;
    public crv g;
    public bqo h;
    public bqw i;
    public Set j;
    public Optional k;
    public bsz l;
    public bny m;
    public crv n;
    public crv o;
    public crv p;
    public crv q;
    public boolean r;
    public boolean s;
    public bsi u;
    public att v;
    public att w;
    public adx x;
    public adx y;
    private bnd z;
    public bpm c = null;
    public final Queue d = new ArrayDeque();
    public final ServiceConnection t = new bpg(this, 0);

    public static void e(Service service) {
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) service.getSystemService(NotificationManager.class)).createNotificationChannel(new NotificationChannel("atv_remote_service", "AtvRemoteService", 0));
            service.startForeground(8765, new Notification.Builder(service, "atv_remote_service").setOngoing(true).setContentTitle(service.getText(R.string.atv_remote_service_app_name)).setSmallIcon(android.R.drawable.stat_sys_warning).build());
        }
    }

    public static final boolean i(MediaRouter2.RoutingController routingController) {
        List selectedRoutes;
        if (routingController != null && (selectedRoutes = routingController.getSelectedRoutes()) != null && !selectedRoutes.isEmpty()) {
            Iterator it = selectedRoutes.iterator();
            while (it.hasNext()) {
                MediaRoute2Info mediaRoute2InfoM50m = pd$$ExternalSyntheticApiModelOutline3.m50m(it.next());
                if (mediaRoute2InfoM50m.getType() == 8 || mediaRoute2InfoM50m.getType() == 1002) {
                    return true;
                }
            }
        }
        return false;
    }

    public final bpm a(String str) {
        cbt cbtVar = a;
        ((cbs) ((cbs) cbtVar.b().g(btt.a)).j("com/google/android/tv/remote/service/RemoteService", "openRemoteInputBridge", 512, "RemoteService.java")).t("openRemoteInputBridge() deviceName %s", str);
        AtvRemoteProviderService atvRemoteProviderService = this.b;
        if (atvRemoteProviderService == null) {
            ((cbs) cbtVar.e().j("com/google/android/tv/remote/service/RemoteService", "openRemoteInputBridge", 517, "RemoteService.java")).t("inputProviderService is null, can't open remote input bridge for %s", str);
            return null;
        }
        atvRemoteProviderService.c++;
        try {
            bpm bpmVar = new bpm(atvRemoteProviderService.b, str);
            atvRemoteProviderService.d++;
            return bpmVar;
        } catch (RuntimeException e) {
            ((cbs) ((cbs) AtvRemoteProviderService.a.f().i(e)).j("com/google/android/tv/remote/service/AtvRemoteProviderService", "openRemoteInputBridge", 88, "AtvRemoteProviderService.java")).t("unable to openRemoteInputBridge() for %s", str);
            return null;
        }
    }

    public final void b() {
        cbt cbtVar = a;
        cch cchVarB = cbtVar.b();
        cck cckVar = btt.a;
        ((cbs) ((cbs) cchVarB.g(cckVar)).j("com/google/android/tv/remote/service/RemoteService", "openSearchAssistInputBridge", 561, "RemoteService.java")).t("openSearchAssistInputBridge() searchInputBridge: %s", this.c);
        if (this.c == null) {
            this.c = a("virtual-search");
            ((cbs) ((cbs) cbtVar.b().g(cckVar)).j("com/google/android/tv/remote/service/RemoteService", "openSearchAssistInputBridge", 569, "RemoteService.java")).t("openInputBridge() searchInputBridge %s", this.c);
        }
    }

    public final synchronized void c(int i) {
        cbt cbtVar = a;
        cch cchVarB = cbtVar.b();
        cck cckVar = btt.a;
        ((cbs) ((cbs) cchVarB.g(cckVar)).j("com/google/android/tv/remote/service/RemoteService", "searchAssistantKeyEvent", 575, "RemoteService.java")).r("searchAssistantKeyEvent() keyCode: %d", i);
        bpm bpmVar = this.c;
        if (bpmVar == null) {
            ((cbs) ((cbs) cbtVar.b().g(cckVar)).j("com/google/android/tv/remote/service/RemoteService", "searchAssistantKeyEvent", 583, "RemoteService.java")).p("searchInputBridge is null. Retry...");
            b();
        } else {
            bpmVar.b(i);
            this.c.c(i);
            this.c.d();
        }
    }

    public final void d(boolean z) {
        Intent intent = new Intent("com.google.android.tv.remote.service.A2DP_OR_REMOTE_SPEAKER_ROUTE");
        intent.setComponent(new ComponentName("com.google.android.tv.axel", "com.google.android.tv.axel.remote.AudioOutputRouteChangeReceiver"));
        intent.putExtra("bluetoothOrRemoteSpeakerRouteSelected", z);
        if (z) {
            ((cbs) a.e().j("com/google/android/tv/remote/service/RemoteService", "sendA2dpOrRemoteSpeakerRouteSelectedBroadcast", 149, "RemoteService.java")).p("A2dp or remote device selected");
        } else {
            ((cbs) a.e().j("com/google/android/tv/remote/service/RemoteService", "sendA2dpOrRemoteSpeakerRouteSelectedBroadcast", 151, "RemoteService.java")).p("A2dp or remote device not selected");
        }
        sendBroadcast(intent);
    }

    @Override // android.app.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) throws IOException {
        printWriter.printf("HTT is %s%n", true != ((bqv) this.n.a()).b() ? "not supported" : "supported");
        int i = 3;
        printWriter.printf("User setup is %s. Mic privacy is %s. Assistant package is '%s'%n", true != ((btj) this.o.a()).a ? "incomplete" : "complete", true != ((bth) this.p.a()).b ? "disabled" : "enabled", ((btf) this.q.a()).b);
        if (this.B != null) {
            printWriter.println("TCP Server is running");
        }
        if (this.s && this.C != null) {
            printWriter.println("TCP Wake Port is running");
        }
        if (this.D != null) {
            printWriter.println("Pairing Server is running");
        }
        if (this.z != null) {
            printWriter.println("Bluetooth Server is running");
        }
        if (this.A != null) {
            printWriter.println("Bluetooth LE Server is running");
        }
        this.k.isPresent();
        bsz bszVar = this.l;
        bxj bxjVar = new bxj(printWriter);
        ArrayList arrayList = bszVar.b;
        bxjVar.c("Emote features (%d):%n", Integer.valueOf(arrayList.size()));
        bxjVar.b();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((bta) arrayList.get(i2)).c(bxjVar);
        }
        bxjVar.a();
        bxjVar.c("Emote clients: %d connection attempts, %d failed, %d connected, %d disconnected, %d errors %n", Integer.valueOf(bszVar.d), Integer.valueOf(bszVar.e), Integer.valueOf(bszVar.f), Integer.valueOf(bszVar.h), Integer.valueOf(bszVar.g));
        bxjVar.b();
        Iterator it = bszVar.c.entrySet().iterator();
        while (it.hasNext()) {
            bsy bsyVar = (bsy) ((Map.Entry) it.next()).getValue();
            bug bugVar = bsyVar.b;
            StringBuilder sb = new StringBuilder();
            bdq.u(sb, DesugarArrays.stream(buy.values()).filter(new aoo(bsyVar, i)).map(new bsv(bsyVar, 0)).iterator(), "], ");
            sb.append("]");
            bxjVar.c("Client %s, Features (%s)%n", bugVar, sb.toString());
            bxjVar.b();
            bzs bzsVar = bsyVar.d;
            int i3 = ((cax) bzsVar).c;
            for (int i4 = 0; i4 < i3; i4++) {
                ((btc) bzsVar.get(i4)).f(bxjVar);
            }
            bxjVar.a();
        }
        bxjVar.a();
        cbj cbjVarListIterator = ((cbf) this.j).listIterator();
        while (cbjVarListIterator.hasNext()) {
            ((brj) cbjVarListIterator.next()).a(printWriter);
        }
        bqw bqwVar = this.i;
        printWriter.printf(Locale.ENGLISH, "Audio Provider Service: Streams %d/%d%n", Integer.valueOf(bqwVar.i), Integer.valueOf(bqwVar.h));
    }

    public final void f(bty btyVar) {
        if (this.D != null) {
            return;
        }
        if (btyVar == null) {
            ((cbs) a.g().j("com/google/android/tv/remote/service/RemoteService", "startTcpPairingServer", 380, "RemoteService.java")).p("Key store manager is not initialized. Pairing server is down.");
            return;
        }
        ((cbs) a.e().j("com/google/android/tv/remote/service/RemoteService", "startTcpPairingServer", 383, "RemoteService.java")).p("Starting up pairing server.");
        try {
            buc bucVar = new buc(this, this.u, btyVar);
            this.D = bucVar;
            bucVar.start();
        } catch (IOException | GeneralSecurityException e) {
            ((cbs) ((cbs) a.f().i(e)).j("com/google/android/tv/remote/service/RemoteService", "startTcpPairingServer", 394, "RemoteService.java")).p("Failed to start tcp paring server");
        }
    }

    public final boolean g() {
        AtvRemoteProviderService atvRemoteProviderService = this.b;
        return (atvRemoteProviderService == null || atvRemoteProviderService.b == null) ? false : true;
    }

    public final synchronized boolean h() {
        if (this.c != null) {
            return true;
        }
        ((cbs) ((cbs) a.b().g(btt.a)).j("com/google/android/tv/remote/service/RemoteService", "isSearchAssistantSetup", 595, "RemoteService.java")).p("searchInputBridge is not setup. Retry...");
        b();
        return false;
    }

    public final void j(byj byjVar) {
        try {
            ((bow) byjVar.a).a = a("virtual-remote");
        } catch (RuntimeException e) {
            ((cbs) ((cbs) a.f().i(e)).j("com/google/android/tv/remote/service/RemoteService", "openInputBridge", 536, "RemoteService.java")).t("Failed to open input bridge for %s", "virtual-remote");
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        String action = intent.getAction();
        if (IAtvAudioProviderService.class.getName().equals(action)) {
            return new bnu(this.i);
        }
        if ("com.google.android.tv.remote.service.VIRTUAL_REMOTE_IME".equals(action)) {
            return new bul(this, this.m);
        }
        if (ImeBridgeService.class.getName().equals(action)) {
            return new bph(this);
        }
        if (!Objects.equals(action, "com.google.android.tv.remote.service.OnscreenRemoteService")) {
            return null;
        }
        box boxVar = new box();
        ((cbs) box.a.e().j("com/google/android/tv/remote/service/OnscreenRemoteService", "createBinder", 28, "OnscreenRemoteService.java")).p("Received binding request");
        boxVar.c = this;
        HandlerThread handlerThread = new HandlerThread(box.class.getSimpleName());
        handlerThread.start();
        boxVar.b = new bow(boxVar, handlerThread.getLooper());
        bow bowVar = boxVar.b;
        bowVar.getClass();
        bowVar.post(new bid(bowVar, 12));
        return boxVar.d;
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [cpm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v24, types: [cpm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v39, types: [cpm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v52, types: [cpm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [cpm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [cpm, java.lang.Object] */
    @Override // defpackage.cpa, android.app.Service
    public final void onCreate() {
        cbt cbtVar = a;
        cch cchVarE = cbtVar.e();
        cck cckVar = btt.a;
        ((cbs) ((cbs) cchVarE.g(cckVar)).j("com/google/android/tv/remote/service/RemoteService", "onCreate", 258, "RemoteService.java")).p("Starting RemoteService");
        e(this);
        if (Build.VERSION.SDK_INT >= 34) {
            MediaRouter2 mediaRouter2 = MediaRouter2.getInstance(this);
            this.E = mediaRouter2;
            d(i(mediaRouter2.getSystemController()));
            this.F = new bpe(this);
            this.G = new bpf();
            this.E.registerControllerCallback(nf.c(this), this.F);
            this.E.registerRouteCallback(nf.c(this), this.G, new RouteDiscoveryPreference.Builder(Arrays.asList("android.media.route.feature.LIVE_AUDIO", "android.media.route.feature.LIVE_VIDEO", "android.media.route.feature.REMOTE_PLAYBACK"), true).build());
            ((cbs) cbtVar.e().j("com/google/android/tv/remote/service/RemoteService", "registerMediaRouter2Callbacks", 211, "RemoteService.java")).p("Registered controller and route callbacks");
        }
        super.onCreate();
        if (this.r) {
            ((cbs) cbtVar.g().j("com/google/android/tv/remote/service/RemoteService", "startBluetoothServer", 357, "RemoteService.java")).p("Bluetooth server is disabled");
        } else {
            ((cbs) cbtVar.e().j("com/google/android/tv/remote/service/RemoteService", "startBluetoothServer", 360, "RemoteService.java")).p("Starting bluetooth server");
            att attVar = this.v;
            byj byjVar = this.l.j;
            bzt bztVar = (bzt) attVar.a;
            this.z = new bnd((buf) ((cpj) bztVar.a).a, ((Boolean) bztVar.b.a()).booleanValue(), ((Boolean) bztVar.c.a()).booleanValue(), byjVar);
        }
        if (this.r) {
            ((cbs) cbtVar.g().j("com/google/android/tv/remote/service/RemoteService", "startBluetoothLeServer", 366, "RemoteService.java")).p("Bluetooth LE server is disabled");
        } else {
            ((cbs) cbtVar.e().j("com/google/android/tv/remote/service/RemoteService", "startBluetoothLeServer", 369, "RemoteService.java")).p("Starting BLE server");
            att attVar2 = this.w;
            byj byjVar2 = this.l.j;
            bzt bztVar2 = (bzt) attVar2.a;
            this.A = new bna((buf) ((cpj) bztVar2.a).a, ((Boolean) bztVar2.b.a()).booleanValue(), byjVar2, (bpo) bztVar2.c.a());
        }
        if (this.f) {
            adx adxVar = this.y;
            byj byjVar3 = new byj(this);
            byj byjVar4 = this.l.j;
            bzt bztVar3 = (bzt) adxVar.a;
            this.B = new bpt((Context) ((cpj) bztVar3.a).a, (buf) ((cpj) bztVar3.c).a, (bsi) bztVar3.b.a(), byjVar3, byjVar4);
            if (this.s && bov.a(this)) {
                adx adxVar2 = this.x;
                byj byjVar5 = new byj(this);
                byj byjVar6 = this.l.j;
                bzt bztVar4 = (bzt) adxVar2.a;
                this.C = new bpy((Context) ((cpj) bztVar4.a).a, (buf) ((cpj) bztVar4.c).a, (bsi) bztVar4.b.a(), byjVar5, byjVar6);
            }
            if (this.k.isEmpty()) {
                ((cbs) ((cbs) cbtVar.b().g(cckVar)).j("com/google/android/tv/remote/service/RemoteService", "startNearbyServer", 419, "RemoteService.java")).p("startNearbyServer: Nearby API not enabled");
            } else {
                btv btvVar = (btv) this.k.get();
                byj byjVar7 = this.l.j;
                btvVar.b();
            }
        }
        Intent intent = new Intent(this, (Class<?>) AtvRemoteProviderService.class);
        intent.setAction(AtvRemoteProviderService.class.getName());
        bindService(intent, this.t, 1);
        k(new bid(this, 13));
        Intent intent2 = new Intent(this, (Class<?>) AtvSearchAssistantService.class);
        intent2.setAction("AtvSearchAssistantService.localService");
        bpg bpgVar = new bpg(this, 2);
        bindService(intent2, bpgVar, 1);
        int i = 14;
        k(new ame(this, bpgVar, i, null));
        this.h.e((bqh) this.g.a());
        cbj cbjVarListIterator = ((cbf) this.j).listIterator();
        while (cbjVarListIterator.hasNext()) {
            brj brjVar = (brj) cbjVarListIterator.next();
            Context context = brjVar.b;
            BluetoothAdapter adapter = ((BluetoothManager) context.getSystemService(BluetoothManager.class)).getAdapter();
            if (adapter == null) {
                ((cbs) brj.a.g().j("com/google/android/tv/remote/service/bleremote/BleDeviceManager", "register", 127, "BleDeviceManager.java")).p("Bluetooth adapter is not found");
            } else if (context.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
                brjVar.c = true;
                context.registerReceiver(brjVar.i, new IntentFilter("android.bluetooth.adapter.action.BLE_STATE_CHANGED"));
                context.registerReceiver(brjVar.h, new IntentFilter("android.bluetooth.device.action.BOND_STATE_CHANGED"));
                context.registerReceiver(brjVar.g, new IntentFilter("android.bluetooth.device.action.ACL_CONNECTED"));
                Set<BluetoothDevice> bondedDevices = adapter.getBondedDevices();
                if (bondedDevices != null) {
                    for (BluetoothDevice bluetoothDevice : bondedDevices) {
                        if (bluetoothDevice.isConnected()) {
                            if (bluetoothDevice.getBondState() != 12) {
                                ((cbs) brj.a.g().j("com/google/android/tv/remote/service/bleremote/BleDeviceManager", "initializeConnectedDevices", 168, "BleDeviceManager.java")).t("%s is not bound, skipping connection", bluetoothDevice);
                            } else {
                                ((cbs) brj.a.b().j("com/google/android/tv/remote/service/bleremote/BleDeviceManager", "initializeConnectedDevices", 170, "BleDeviceManager.java")).t("Initializing bluetooth device %s", bluetoothDevice);
                                brjVar.b(bluetoothDevice);
                            }
                        }
                    }
                }
            } else {
                ((cbs) brj.a.g().j("com/google/android/tv/remote/service/bleremote/BleDeviceManager", "register", 131, "BleDeviceManager.java")).p("BLE is not supported");
            }
            brjVar.getClass();
            k(new bid(brjVar, i));
        }
    }

    @Override // defpackage.buf, android.app.Service
    public final void onDestroy() throws InterruptedException {
        MediaRouter2 mediaRouter2;
        cbt cbtVar = a;
        ((cbs) cbtVar.e().j("com/google/android/tv/remote/service/RemoteService", "onDestroy", 269, "RemoteService.java")).p("Virtual Remote Service exiting");
        this.e.quit();
        if (Build.VERSION.SDK_INT >= 34 && (mediaRouter2 = this.E) != null) {
            MediaRouter2$ControllerCallback mediaRouter2$ControllerCallback = this.F;
            if (mediaRouter2$ControllerCallback != null) {
                mediaRouter2.unregisterControllerCallback(mediaRouter2$ControllerCallback);
                ((cbs) cbtVar.e().j("com/google/android/tv/remote/service/RemoteService", "onDestroy", 276, "RemoteService.java")).p("Unregistered MediaRouter2.ControllerCallback");
            }
            MediaRouter2$RouteCallback mediaRouter2$RouteCallback = this.G;
            if (mediaRouter2$RouteCallback != null) {
                this.E.unregisterRouteCallback(mediaRouter2$RouteCallback);
                ((cbs) cbtVar.e().j("com/google/android/tv/remote/service/RemoteService", "onDestroy", 280, "RemoteService.java")).p("Unregistered MediaRouter2.RouteCallback");
            }
        }
        if (this.k.isEmpty()) {
            ((cbs) ((cbs) cbtVar.b().g(btt.a)).j("com/google/android/tv/remote/service/RemoteService", "stopNearbyServer", 428, "RemoteService.java")).p("stopNearbyServer: Nearby API not enabled");
        } else {
            ((btv) this.k.get()).a();
        }
        if (this.D != null) {
            ((cbs) ((cbs) cbtVar.c().g(btt.a)).j("com/google/android/tv/remote/service/RemoteService", "stopTcpPairingServer", 411, "RemoteService.java")).p("Stopping pairing server");
            buc bucVar = this.D;
            bucVar.h = true;
            Thread thread = new Thread(new bsp(bucVar, (blq) bucVar.d.getAndSet(null), 5), "PairingServerShutdown");
            thread.start();
            try {
                bucVar.join(1000L);
                thread.join(1000L);
            } catch (InterruptedException e) {
                ((cbs) ((cbs) ((cbs) buc.a.g().g(btt.a)).i(e)).j("com/google/android/tv/remote/service/pairing/TcpPairingServer", "shutdown", 170, "TcpPairingServer.java")).p("Interrupted exception");
            }
            ((cbs) ((cbs) a.c().g(btt.a)).j("com/google/android/tv/remote/service/RemoteService", "stopTcpPairingServer", 413, "RemoteService.java")).p("Pairing server stopped");
        }
        super.onDestroy();
    }
}
