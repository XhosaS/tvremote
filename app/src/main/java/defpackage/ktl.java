package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ktl extends BroadcastReceiver {
    public final lbk a;

    public ktl(lbk lbkVar) {
        this.a = lbkVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            lbk lbkVar = this.a;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.f.a("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            lbk lbkVar2 = this.a;
            lab labVar2 = lbkVar2.f;
            lbkVar2.o(labVar2);
            labVar2.f.a("App receiver called with null action");
            return;
        }
        int iHashCode = action.hashCode();
        if (iHashCode != -1928239649) {
            if (iHashCode == 1279883384 && action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                lbk lbkVar3 = this.a;
                lab labVar3 = lbkVar3.f;
                lbkVar3.o(labVar3);
                labVar3.k.a("[sgtm] App Receiver notified batches are available");
                lbh lbhVar = lbkVar3.g;
                lbkVar3.o(lbhVar);
                lbhVar.h(new Runnable() { // from class: ktk
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.a.j().k(((Long) kzg.D.a(null)).longValue());
                    }
                });
                return;
            }
        } else if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            final lbk lbkVar4 = this.a;
            aeuw.a.eV();
            if (lbkVar4.d.t(null, kzg.aQ)) {
                lab labVar4 = lbkVar4.f;
                lbkVar4.o(labVar4);
                labVar4.k.a("App receiver notified triggers are available");
                lbh lbhVar2 = lbkVar4.g;
                lbkVar4.o(lbhVar2);
                lbhVar2.h(new Runnable() { // from class: ktj
                    @Override // java.lang.Runnable
                    public final void run() {
                        lbk lbkVar5 = lbkVar4;
                        lio lioVar = lbkVar5.i;
                        lbkVar5.m(lioVar);
                        if (!lioVar.al()) {
                            lab labVar5 = lbkVar5.f;
                            lbkVar5.o(labVar5);
                            labVar5.f.a("registerTrigger called but app not eligible");
                            return;
                        }
                        final leo leoVar = lbkVar5.l;
                        lbkVar5.n(leoVar);
                        leoVar.g();
                        kuj kujVar = leoVar.g;
                        if (kujVar != null) {
                            kujVar.a();
                        }
                        lbkVar5.n(leoVar);
                        leoVar.getClass();
                        new Thread(new Runnable() { // from class: kti
                            @Override // java.lang.Runnable
                            public final void run() {
                                leoVar.p();
                            }
                        }).start();
                    }
                });
                return;
            }
            return;
        }
        lbk lbkVar5 = this.a;
        lab labVar5 = lbkVar5.f;
        lbkVar5.o(labVar5);
        labVar5.f.a("App receiver called with unknown action");
    }
}
