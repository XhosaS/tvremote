package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sge {
    public static final zdy a = zdy.h("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothDeviceManager");
    public final Context b;
    public final AudioManager c;
    public final aehf d;
    public final sjp e;
    public List f;
    public BluetoothAdapter g;
    public final agzv h;
    public final szv i;
    public final szv j;
    public final AudioDeviceCallback k;
    public final BluetoothProfile.ServiceListener l;
    public final sgg m;
    public sgf n;
    private final ahbt o;
    private final szv p;

    public sge(Context context, Executor executor, ahbt ahbtVar, sgg sggVar, AudioManager audioManager, aehf aehfVar, wxc wxcVar, szw szwVar) {
        context.getClass();
        executor.getClass();
        ahbtVar.getClass();
        aehfVar.getClass();
        wxcVar.getClass();
        this.b = context;
        this.o = ahbtVar;
        this.m = sggVar;
        this.c = audioManager;
        this.d = aehfVar;
        sjp sjpVar = new sjp(ahbtVar);
        this.e = sjpVar;
        this.f = agrd.a;
        this.h = new agzv(false, agzz.a);
        this.i = szwVar.a();
        this.p = szwVar.a();
        this.j = szwVar.a();
        szwVar.a();
        this.k = new wwz(wxcVar, new sfv(this));
        this.l = new wxa(wxcVar, new sgd(this));
        new sfy(this);
        if (Build.VERSION.SDK_INT >= 31) {
            int i = sfr.a;
        }
        sjpVar.a(new sfs(this, null));
    }

    public final void a() {
        List listT;
        sgf sgfVar;
        List list = this.f;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((sfg) obj).c) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            listT = this.f;
        } else if (this.f.isEmpty() || (sgfVar = this.n) == null) {
            listT = agrd.a;
        } else {
            List<BluetoothDevice> connectedDevices = sgfVar.a.getConnectedDevices();
            connectedDevices.getClass();
            ArrayList arrayList2 = new ArrayList(agqq.i(connectedDevices, 10));
            Iterator<T> it = connectedDevices.iterator();
            while (it.hasNext()) {
                arrayList2.add(new sfg(null, (BluetoothDevice) it.next()));
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (!((sfg) obj2).c) {
                    arrayList3.add(obj2);
                }
            }
            ((zdv) a.b().o(zfi.a, "ALT.BtDevicesMgr").q("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothDeviceManager", "makeBluetoothAudioInputDevicesList", 535, "BluetoothDeviceManager.kt")).x("#audio# falling back to the profile's connected devices, # of available devices(%s)", new aawt(aaws.NO_USER_DATA, Integer.valueOf(arrayList3.size())));
            listT = agqq.t(this.f, arrayList3);
        }
        ((zdv) a.b().o(zfi.a, "ALT.BtDevicesMgr").q("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothDeviceManager", "handleBluetoothAudioInputDevicesAvailabilityChanged", 510, "BluetoothDeviceManager.kt")).x("#audio# observed BT-devices connection changes, # of available devices(%s)", new aawt(aaws.NO_USER_DATA, Integer.valueOf(listT.size())));
        this.p.a(new agux() { // from class: sfq
            @Override // defpackage.agux
            public final Object a(Object obj3) {
                ((sfi) obj3).a();
                return agpu.a;
            }
        });
    }
}
