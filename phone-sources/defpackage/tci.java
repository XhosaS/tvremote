package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.play.search.PlaySearch;
import com.google.android.play.search.PlaySearchToolbar;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.net.DatagramPacket;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class tci implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ tci(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException, IOException {
        vuc vucVarO;
        tnq tnqVar;
        vuc vucVarO2;
        int i;
        long j = 1000;
        int i2 = 4;
        int i3 = 0;
        switch (this.b) {
            case 0:
                tck tckVar = (tck) this.a;
                boolean zIsPopupShowing = tckVar.a.isPopupShowing();
                tckVar.k(zIsPopupShowing);
                tckVar.c = zIsPopupShowing;
                return;
            case 1:
                ((tca) this.a).f(true);
                return;
            case 2:
                ((TextInputLayout) this.a).c.requestLayout();
                return;
            case 3:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.a).b.d;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 4:
                Object obj = this.a;
                File file = ((tdo) obj).a;
                if (!file.exists()) {
                    tho.a("Metalog directories were deleted unexpectedly, recreating...", new Object[0]);
                    file.mkdirs();
                }
                try {
                    tdo.d(((tdo) obj).b, ((wha) ((tdo) obj).e.r()).h());
                } catch (IOException unused) {
                    tho.a("Failed to save PlayMetalog", new Object[0]);
                }
                try {
                    tdo.d(((tdo) obj).d, ((wgz) ((tdo) obj).g.r()).h());
                    return;
                } catch (IOException unused2) {
                    tho.a("Failed to save LogsUploadAttempt", new Object[0]);
                    return;
                }
            case 5:
                PlaySearch playSearch = (PlaySearch) this.a;
                if (playSearch.b == null || playSearch.hasFocus()) {
                    return;
                }
                playSearch.b.h();
                return;
            case 6:
                PlaySearchToolbar playSearchToolbar = ((thf) this.a).a;
                playSearchToolbar.collapseActionView();
                playSearchToolbar.b();
                return;
            case 7:
                Object obj2 = this.a;
                try {
                    Object obj3 = ((tin) obj2).k.a;
                    if (!((tjt) obj3).a) {
                        Object obj4 = ((tjt) obj3).b.g;
                        ((tjk) ((zft) obj4).a).c(new tci(obj4, 14));
                    }
                    String strA = ((tjt) obj3).a();
                    if (((tjt) obj3).a || strA == null) {
                        ((tin) obj2).d();
                        return;
                    }
                    try {
                        if (strA.length() == 0 || strA.length() % 2 != 0) {
                            throw new IllegalArgumentException("Bad input string.");
                        }
                        String strReplaceAll = strA.replaceAll("[Oo]", "0");
                        int length = strReplaceAll.length() / 2;
                        byte[] bArr = new byte[length];
                        while (i3 < length) {
                            int i4 = i3 + 1;
                            bArr[i3] = (byte) Integer.parseInt(strReplaceAll.substring(i3 + i3, i4 + i4), 16);
                            i3 = i4;
                        }
                        if (!((tin) obj2).e()) {
                            throw new IllegalStateException("Secret can only be set for input role session.");
                        }
                        if (((tin) obj2).f != 4) {
                            throw new IllegalStateException("Secret can only be set while in pairing state.");
                        }
                        ((tin) obj2).d.offer(new tim(null, bArr, null));
                        return;
                    } catch (IllegalArgumentException unused3) {
                        ((tin) obj2).d();
                        return;
                    } catch (IllegalStateException unused4) {
                        ((tin) obj2).d();
                        return;
                    }
                } catch (tij e) {
                    e.toString();
                    ((tin) obj2).d.offer(new tim(e));
                    return;
                }
            case 8:
                ((tlx) ((tjj) this.a).b.a).h.g(tmc.CONNECTING);
                return;
            case 9:
                tlx tlxVar = (tlx) ((tjj) this.a).b.a;
                int i5 = tlxVar.f;
                tlxVar.f = 5;
                if (i5 != 4) {
                    tlxVar.h.g(tmc.CONNECTION_FAILED);
                }
                ImmutableList immutableList = tlxVar.b;
                if (immutableList != null) {
                    UnmodifiableIterator it = immutableList.iterator();
                    while (it.hasNext()) {
                        ((tma) it.next()).b();
                    }
                }
                tlxVar.h.g(tmc.DISCONNECTED);
                return;
            case 10:
                ((tlx) ((tjj) this.a).b.a).f = 2;
                return;
            case 11:
                nwu nwuVar = ((tjr) this.a).e;
                if (nwuVar.g() || nwuVar.h()) {
                    return;
                }
                nyw nywVar = (nyw) nwuVar;
                nywVar.e();
                nywVar.d();
                return;
            case 12:
                Object obj5 = this.a;
                tjx tjxVar = (tjx) obj5;
                Context context = tjxVar.b;
                WifiManager.WifiLock wifiLockCreateWifiLock = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).createWifiLock(1, "AndroidTVRemote");
                wifiLockCreateWifiLock.setReferenceCounted(false);
                tjw tjwVar = new tjw(wifiLockCreateWifiLock);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                context.registerReceiver(tjwVar, intentFilter);
                wifiLockCreateWifiLock.acquire();
                while (true) {
                    try {
                        InputStream inputStream = ((tjx) obj5).h;
                        vtp vtpVar = vtp.a;
                        vvs vvsVar = vvs.a;
                        vtp vtpVar2 = vtp.a;
                        tnq tnqVar2 = tnq.a;
                        try {
                            try {
                                int i6 = inputStream.read();
                                if (i6 == -1) {
                                    vucVarO = null;
                                } else {
                                    vte vteVarL = vte.L(new vse(inputStream, vte.J(i6, inputStream)));
                                    vucVarO = tnqVar2.o();
                                    try {
                                        try {
                                            try {
                                                vvy vvyVarB = vvs.a.b(vucVarO);
                                                vvyVarB.l(vucVarO, vtf.p(vteVarL), vtpVar2);
                                                vvyVarB.g(vucVarO);
                                                try {
                                                    vteVarL.z(0);
                                                } catch (vuq e2) {
                                                    throw e2;
                                                }
                                            } catch (vuq e3) {
                                                if (!e3.a) {
                                                    throw e3;
                                                }
                                                throw new vuq(e3);
                                            } catch (IOException e4) {
                                                if (!(e4.getCause() instanceof vuq)) {
                                                    throw new vuq(e4);
                                                }
                                                throw ((vuq) e4.getCause());
                                            }
                                        } catch (RuntimeException e5) {
                                            if (!(e5.getCause() instanceof vuq)) {
                                                throw e5;
                                            }
                                            throw ((vuq) e5.getCause());
                                        }
                                    } catch (vwf e6) {
                                        throw e6.a();
                                    }
                                }
                                vuc.B(vucVarO);
                                tnqVar = (tnq) vucVarO;
                            } catch (IOException e7) {
                                throw new vuq(e7);
                            }
                        } catch (vuq e8) {
                            if (!e8.a) {
                                throw e8;
                            }
                            throw new vuq(e8);
                        }
                    } catch (IOException unused5) {
                    }
                    if (tnqVar == null) {
                        tjxVar.b.unregisterReceiver(tjwVar);
                        wifiLockCreateWifiLock.release();
                        tjxVar.c.removeCallbacksAndMessages(null);
                        tjxVar.c();
                        tjxVar.j = null;
                        return;
                    }
                    if (((tjx) obj5).a().booleanValue() && tnqVar.b == 40) {
                        if (((tnm) tnqVar.c).b) {
                            ((tjx) obj5).e = "false";
                        } else {
                            ((tjx) obj5).e = "true";
                        }
                        tkm tkmVar = ((tjx) obj5).k;
                        if (tkmVar instanceof tkx) {
                            ((tkx) tkmVar).a.put("isDeviceInStandbyMode", ((tjx) obj5).e);
                        }
                    }
                    ((tjx) obj5).m.f(tnqVar);
                }
                break;
            case 13:
                ((tjx) this.a).b();
                return;
            case 14:
                ((tug) iwu.a.e().h(tvo.a, "VIRTUAL_REMOTE").j("com/google/android/apps/googletv/app/device/virtualremote/impl/VirtualRemoteImpl$virtualRemoteConnectionListener$1", "onPairingRequested", 264, "VirtualRemoteImpl.kt")).s("Pairing requested from TV.");
                iwu iwuVar = (iwu) ((tlx) ((tkb) ((zft) this.a).a).b.a).h.a;
                iwuVar.e.p(new iwg(i2));
                iwuVar.d.ap(5);
                return;
            case 15:
                ((tkg) this.a).a();
                return;
            case 16:
                Object obj6 = this.a;
                tkg tkgVar = (tkg) obj6;
                Context context2 = tkgVar.b;
                WifiManager.WifiLock wifiLockCreateWifiLock2 = ((WifiManager) context2.getApplicationContext().getSystemService("wifi")).createWifiLock(1, "AndroidTVRemote");
                wifiLockCreateWifiLock2.setReferenceCounted(false);
                tkf tkfVar = new tkf(wifiLockCreateWifiLock2);
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.SCREEN_ON");
                intentFilter2.addAction("android.intent.action.SCREEN_OFF");
                context2.registerReceiver(tkfVar, intentFilter2);
                wifiLockCreateWifiLock2.acquire();
                do {
                    try {
                        InputStream inputStream2 = ((tkg) obj6).d;
                        vtp vtpVar3 = vtp.a;
                        vvs vvsVar2 = vvs.a;
                        vtp vtpVar4 = vtp.a;
                        tnq tnqVar3 = tnq.a;
                        try {
                            int i7 = inputStream2.read();
                            if (i7 == -1) {
                                vucVarO2 = null;
                            } else {
                                vte vteVarL2 = vte.L(new vse(inputStream2, vte.J(i7, inputStream2)));
                                vucVarO2 = tnqVar3.o();
                                try {
                                    try {
                                        try {
                                            vvy vvyVarB2 = vvs.a.b(vucVarO2);
                                            vvyVarB2.l(vucVarO2, vtf.p(vteVarL2), vtpVar4);
                                            vvyVarB2.g(vucVarO2);
                                            try {
                                                vteVarL2.z(0);
                                            } catch (vuq e9) {
                                                throw e9;
                                            }
                                        } catch (RuntimeException e10) {
                                            if (!(e10.getCause() instanceof vuq)) {
                                                throw e10;
                                            }
                                            throw ((vuq) e10.getCause());
                                        } catch (vuq e11) {
                                            if (!e11.a) {
                                                throw e11;
                                            }
                                            throw new vuq(e11);
                                        }
                                    } catch (IOException e12) {
                                        if (!(e12.getCause() instanceof vuq)) {
                                            throw new vuq(e12);
                                        }
                                        throw ((vuq) e12.getCause());
                                    }
                                } catch (vwf e13) {
                                    throw e13.a();
                                }
                            }
                            vuc.B(vucVarO2);
                        } catch (vuq e14) {
                            if (!e14.a) {
                                throw e14;
                            }
                            throw new vuq(e14);
                        } catch (IOException e15) {
                            throw new vuq(e15);
                        }
                    } catch (IOException unused6) {
                    }
                } while (((tnq) vucVarO2) != null);
                tkgVar.b.unregisterReceiver(tkfVar);
                wifiLockCreateWifiLock2.release();
                Handler handler = tkgVar.c;
                handler.removeCallbacksAndMessages(null);
                ((tug) ((tug) tkg.a.b()).j("com/google/android/tv/remote/support/core/TcpWakePortClient", "disconnect", 187, "TcpWakePortClient.java")).s("disconnect");
                handler.sendEmptyMessage(2);
                tkgVar.f = null;
                return;
            case 17:
                tkz tkzVar = ((tky) this.a).a;
                if (tkzVar.g) {
                    Set setH = tkz.h();
                    if (tkzVar.d.equals(setH)) {
                        return;
                    }
                    if (!setH.containsAll(tkzVar.d)) {
                        tkzVar.b();
                    }
                    tkzVar.d = setH;
                    tkzVar.f();
                    tkzVar.d();
                    return;
                }
                return;
            case 18:
                Object obj7 = this.a;
                tlb tlbVar = (tlb) obj7;
                DatagramPacket datagramPacket = new DatagramPacket(tlbVar.c, 65536);
                while (!tlbVar.d) {
                    try {
                        ((tlb) obj7).b.receive(datagramPacket);
                        ((tlb) obj7).a(datagramPacket);
                    } catch (IOException unused7) {
                        boolean z = tlbVar.d;
                    }
                }
                return;
            case 19:
                Object obj8 = this.a;
                int i8 = 500;
                boolean z2 = true;
                while (!((tlb) obj8).d) {
                    try {
                        String str = ((tlb) obj8).a;
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
                        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                        Set set = ((tlb) obj8).e;
                        synchronized (set) {
                            Iterator it2 = set.iterator();
                            int i9 = 32;
                            int i10 = 32;
                            while (it2.hasNext()) {
                                if (i10 > i9) {
                                    it2.remove();
                                    i = i10;
                                } else {
                                    if (((tla) ((SoftReference) it2.next()).get()) != null) {
                                        i = i10;
                                        if ((SystemClock.elapsedRealtime() - r15.a) / j > r15.b / 2.0d) {
                                        }
                                    } else {
                                        i = i10;
                                    }
                                    it2.remove();
                                }
                                i10 = i - 1;
                                j = 1000;
                                i9 = 32;
                            }
                        }
                        synchronized (((tlb) obj8).e) {
                            sir.d(0, dataOutputStream);
                            sir.d(0, dataOutputStream);
                            sir.d(1, dataOutputStream);
                            sir.d(0, dataOutputStream);
                            sir.d(0, dataOutputStream);
                            sir.d(0, dataOutputStream);
                            Iterator it3 = uof.g('.').b(str).iterator();
                            while (it3.hasNext()) {
                                byte[] bytes = ((String) it3.next()).getBytes(tlc.a);
                                try {
                                    dataOutputStream.writeByte(bytes.length & 255);
                                } catch (IOException unused8) {
                                }
                                try {
                                    dataOutputStream.write(bytes, 0, bytes.length);
                                } catch (IOException unused9) {
                                }
                            }
                            sir.d(12, dataOutputStream);
                            sir.d((true != z2 ? 0 : 32768) | 1, dataOutputStream);
                        }
                        try {
                            dataOutputStream.flush();
                        } catch (IOException unused10) {
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        ((tlb) obj8).b.send(new DatagramPacket(byteArray, byteArray.length, tlc.b, 5353));
                        z2 = false;
                    } catch (IOException unused11) {
                    }
                    if (i8 > 3000) {
                        i8 = 3000;
                    }
                    try {
                        Thread.sleep(i8);
                        if (i8 < 3000) {
                            i8 += i8;
                        }
                    } catch (InterruptedException unused12) {
                    }
                    j = 1000;
                }
                return;
        }
        while (true) {
            Object obj9 = this.a;
            tlf tlfVar = (tlf) obj9;
            if (tlfVar.j) {
                return;
            }
            try {
                Thread.sleep(5000L);
            } catch (InterruptedException unused13) {
                if (tlfVar.j) {
                    return;
                }
            }
            Map map = tlfVar.h;
            synchronized (map) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                Iterator it4 = map.entrySet().iterator();
                while (it4.hasNext()) {
                    tle tleVar = (tle) ((Map.Entry) it4.next()).getValue();
                    if (jElapsedRealtime - tleVar.b >= tleVar.c) {
                        ((tkz) obj9).c(tleVar.a);
                        it4.remove();
                        Handler handler2 = ((tlf) obj9).k;
                        handler2.removeMessages(1);
                        handler2.sendEmptyMessageDelayed(1, 1000L);
                    }
                }
            }
        }
    }

    public tci(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
