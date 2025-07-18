package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class etw implements Handler.Callback, ewa, evw {
    public final etx a;
    public eay c;
    public fef d;
    public evx[] e;
    public boolean f;
    private final ewb g;
    private final HandlerThread i;
    private final Handler j;
    private final ezp k = new ezp(65536);
    private final ArrayList h = new ArrayList();
    public final Handler b = edt.M(new etv(this, 0));

    public etw(ewb ewbVar, etx etxVar) {
        this.g = ewbVar;
        this.a = etxVar;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadHelper");
        this.i = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.j = handler;
        handler.sendEmptyMessage(1);
    }

    @Override // defpackage.ewa
    public final void a(ewb ewbVar, eay eayVar) {
        if (this.c != null) {
            return;
        }
        if (eayVar.p(0, new eax()).d()) {
            this.b.obtainMessage(2, new etu()).sendToTarget();
            return;
        }
        this.c = eayVar;
        this.e = new evx[eayVar.b()];
        int i = 0;
        while (true) {
            evx[] evxVarArr = this.e;
            if (i >= evxVarArr.length) {
                break;
            }
            evx evxVarP = this.g.p(new evz(eayVar.f(i)), this.k, 0L);
            this.e[i] = evxVarP;
            this.h.add(evxVarP);
            i++;
        }
        for (evx evxVar : evxVarArr) {
            evxVar.l(this, 0L);
        }
    }

    @Override // defpackage.ewy
    public final /* bridge */ /* synthetic */ void b(ewz ewzVar) {
        evx evxVar = (evx) ewzVar;
        if (this.h.contains(evxVar)) {
            this.j.obtainMessage(3, evxVar).sendToTarget();
        }
    }

    public final void c() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.j.sendEmptyMessage(4);
    }

    @Override // defpackage.evw
    public final void dp(evx evxVar) {
        ArrayList arrayList = this.h;
        arrayList.remove(evxVar);
        if (arrayList.isEmpty()) {
            this.j.removeMessages(2);
            this.b.sendEmptyMessage(1);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            ewb ewbVar = this.g;
            if (ewbVar instanceof ews) {
                ((ews) ewbVar).a = this;
            }
            ewbVar.x(this, null, elk.a);
            this.j.sendEmptyMessage(2);
            return true;
        }
        int i2 = 0;
        if (i == 2) {
            try {
                if (this.e != null) {
                    while (true) {
                        ArrayList arrayList = this.h;
                        if (i2 >= arrayList.size()) {
                            break;
                        }
                        ((evx) arrayList.get(i2)).dr();
                        i2++;
                    }
                } else {
                    this.g.c();
                }
                this.j.sendEmptyMessageDelayed(2, 100L);
            } catch (IOException e) {
                this.b.obtainMessage(2, e).sendToTarget();
            }
            return true;
        }
        if (i == 3) {
            evx evxVar = (evx) message.obj;
            if (this.h.contains(evxVar)) {
                ejh ejhVar = new ejh();
                ejhVar.a = 0L;
                evxVar.n(new eji(ejhVar));
            }
            return true;
        }
        if (i != 4) {
            return false;
        }
        evx[] evxVarArr = this.e;
        if (evxVarArr != null) {
            while (i2 < evxVarArr.length) {
                this.g.i(evxVarArr[i2]);
                i2++;
            }
        }
        ewb ewbVar2 = this.g;
        if (ewbVar2 instanceof ews) {
            ((ews) ewbVar2).a = null;
        }
        ewbVar2.z(this);
        this.j.removeCallbacksAndMessages(null);
        this.i.quit();
        return true;
    }
}
