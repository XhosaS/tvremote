package defpackage;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bgt {
    private static final bzs a = bzs.r("hdmi_control_volume_control_enabled", "hdmi_control_enabled");
    private static final zp b;
    private static final cbt c;
    public static final /* synthetic */ int g = 0;
    public final Executor e;
    public final bzt f;
    private final zv h;
    private final ContentResolver k;
    private final Context m;
    private final byj n = new byj(this, null);
    private final AudioDeviceCallback i = new bgi(this);
    private final BroadcastReceiver j = new bgj(this);
    private final ContentObserver l = new bgk(this, new Handler(Looper.myLooper()));
    public final List d = new CopyOnWriteArrayList();

    static {
        apl aplVar = new apl();
        aplVar.c("android.media.intent.category.LIVE_AUDIO");
        aplVar.c("android.media.intent.category.REMOTE_PLAYBACK");
        b = aplVar.a();
        c = cbt.k("com/google/android/libraries/tv/controlcapabilities/VolumeControl");
    }

    protected bgt(Context context) {
        this.m = context;
        this.f = new bzt(context, (byte[]) null);
        this.h = zv.b(context);
        this.e = nf.c(context);
        this.k = context.getContentResolver();
    }

    public abstract bgl a();

    public abstract bgm b(bgl bglVar);

    public void d() {
        zq zqVar;
        zp zpVar = b;
        if (zpVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        byj byjVar = this.n;
        if (byjVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        zv zvVar = this.h;
        zv.c();
        int iD = zvVar.d(byjVar);
        if (iD < 0) {
            zqVar = new zq(zvVar, byjVar);
            zvVar.c.add(zqVar);
        } else {
            zqVar = (zq) zvVar.c.get(iD);
        }
        int i = zqVar.c;
        zqVar.d = SystemClock.elapsedRealtime();
        zp zpVar2 = zqVar.b;
        zpVar2.b();
        zpVar.b();
        if (!zpVar2.c.containsAll(zpVar.c)) {
            apl aplVar = new apl(zqVar.b);
            aplVar.d(zpVar);
            zqVar.b = aplVar.a();
            zv.a().l();
        }
        ((AudioManager) this.f.a).registerAudioDeviceCallback(this.i, null);
        bzs bzsVar = a;
        int i2 = ((cax) bzsVar).c;
        for (int i3 = 0; i3 < i2; i3++) {
            this.k.registerContentObserver(Settings.Global.getUriFor((String) bzsVar.get(i3)), false, this.l);
        }
        this.m.registerReceiver(this.j, new IntentFilter("android.media.STREAM_MUTE_CHANGED_ACTION"));
    }

    public void e() {
        byj byjVar = this.n;
        if (byjVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        zv zvVar = this.h;
        zv.c();
        int iD = zvVar.d(byjVar);
        if (iD >= 0) {
            zvVar.c.remove(iD);
            zv.a().l();
        }
        bzt bztVar = this.f;
        ((AudioManager) bztVar.a).unregisterAudioDeviceCallback(this.i);
        this.k.unregisterContentObserver(this.l);
        this.m.unregisterReceiver(this.j);
    }

    public void f() {
        ((cbs) c.g().j("com/google/android/libraries/tv/controlcapabilities/VolumeControl", "resetPreferredAudioDevice", 224, "VolumeControl.java")).p("Setting preferred audio device not supported on this Android release.");
    }

    public void g(int i, String str) {
        ((cbs) c.g().j("com/google/android/libraries/tv/controlcapabilities/VolumeControl", "setPreferredAudioDevice", 220, "VolumeControl.java")).p("Setting preferred audio device not supported on this Android release.");
    }

    public final List h() {
        return this.f.e();
    }

    public final void i() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            Object obj = ((byj) it.next()).a;
            bvw bvwVarA = ((bqe) obj).a();
            synchronized (obj) {
                if (!bvwVarA.equals(((bqe) obj).c)) {
                    ((bqe) obj).c = bvwVarA;
                    Iterator it2 = ((bqe) obj).b.iterator();
                    while (it2.hasNext()) {
                        ((bug) it2.next()).d(bvwVarA);
                    }
                }
            }
        }
    }

    public final void j(int i) {
        if (i == 0) {
            throw null;
        }
        ((AudioManager) this.f.a).adjustStreamVolume(3, i, 0);
    }
}
