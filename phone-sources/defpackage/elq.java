package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class elq {
    public final Context a;
    public final Handler b;
    public final eln c;
    public final BroadcastReceiver d;
    public final elo e;
    public elm f;
    public dyo g;
    public boolean h;
    public dxc i;
    private final pku j;

    public elq(Context context, pku pkuVar, dyo dyoVar, dxc dxcVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.j = pkuVar;
        this.g = dyoVar;
        this.i = dxcVar;
        Handler handlerL = edt.L();
        this.b = handlerL;
        this.c = new eln(this);
        this.d = new elp(this);
        Uri uriFor = elm.d() ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.e = uriFor != null ? new elo(this, handlerL, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final void a(elm elmVar) {
        if (!this.h || elmVar.equals(this.f)) {
            return;
        }
        this.f = elmVar;
        Object obj = this.j.a;
        Looper looperMyLooper = Looper.myLooper();
        emm emmVar = (emm) obj;
        Looper looper = emmVar.n;
        if (looper != looperMyLooper) {
            throw new IllegalStateException(a.ci(looper == null ? "null" : looper.getThread().getName(), looperMyLooper != null ? looperMyLooper.getThread().getName() : "null", "Current looper (", ") is not the playback looper (", ")"));
        }
        elm elmVar2 = emmVar.h;
        if (elmVar2 == null || elmVar.equals(elmVar2)) {
            return;
        }
        emmVar.h = elmVar;
        elw elwVar = emmVar.e;
        if (elwVar != null) {
            elwVar.a();
        }
    }

    public final void b(AudioDeviceInfo audioDeviceInfo) {
        dxc dxcVar = this.i;
        if (Objects.equals(audioDeviceInfo, dxcVar == null ? null : dxcVar.a)) {
            return;
        }
        dxc dxcVar2 = audioDeviceInfo != null ? new dxc(audioDeviceInfo, (byte[]) null) : null;
        this.i = dxcVar2;
        a(elm.f(this.a, this.g, dxcVar2));
    }
}
