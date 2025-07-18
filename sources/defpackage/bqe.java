package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqe extends bta {
    public final bgt a;
    public bvw c;
    private final AudioManager d;
    public final List b = new ArrayList();
    private final byj e = new byj(this);

    public bqe(Context context) {
        bgt bghVar;
        this.d = (AudioManager) context.getSystemService(AudioManager.class);
        int i = bgt.g;
        if (context.checkSelfPermission("android.permission.MODIFY_AUDIO_ROUTING") == -1 || context.checkSelfPermission("android.permission.HDMI_CEC") == -1) {
            bghVar = new bgh(context);
        } else {
            bdq.j(true);
            bghVar = Build.VERSION.SDK_INT >= 33 ? new bgs(context) : Build.VERSION.SDK_INT >= 31 ? new bgr(context) : Build.VERSION.SDK_INT >= 30 ? new bgq(context) : Build.VERSION.SDK_INT >= 29 ? new bgp(context) : new bgn(context);
        }
        this.a = bghVar;
    }

    public final bvw a() {
        bgt bgtVar = this.a;
        List listH = bgtVar.h();
        bgl bglVarA = bgtVar.a();
        bgm bgmVarB = bgm.NONE;
        if (!listH.isEmpty() && bglVarA != null && bglVarA.b != 0) {
            bgmVarB = bgtVar.b(bglVarA);
        }
        clo cloVarO = bwd.a.o();
        int i = 3;
        if (bgmVarB == bgm.VARIABLE) {
            AudioManager audioManager = this.d;
            int streamMinVolume = Build.VERSION.SDK_INT >= 28 ? audioManager.getStreamMinVolume(3) : 0;
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            bwd bwdVar = (bwd) cloVarO.b;
            bwdVar.b |= 16;
            bwdVar.g = streamMinVolume;
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            bwd bwdVar2 = (bwd) cloVarO.b;
            bwdVar2.b |= 32;
            bwdVar2.h = streamMaxVolume;
            int streamVolume = audioManager.getStreamVolume(3);
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            bwd bwdVar3 = (bwd) cloVarO.b;
            bwdVar3.b |= 64;
            bwdVar3.i = streamVolume;
            boolean zIsStreamMute = audioManager.isStreamMute(3);
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            bwd bwdVar4 = (bwd) cloVarO.b;
            bwdVar4.b |= 128;
            bwdVar4.j = zIsStreamMute;
        }
        int iOrdinal = bgmVarB.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                i = 2;
            } else {
                if (iOrdinal != 2) {
                    throw new RuntimeException(null, null);
                }
                i = 1;
            }
        }
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        clt cltVar = cloVarO.b;
        bwd bwdVar5 = (bwd) cltVar;
        bwdVar5.f = i - 1;
        bwdVar5.b |= 8;
        if (bglVarA != null) {
            if (!cltVar.A()) {
                cloVarO.l();
            }
            clt cltVar2 = cloVarO.b;
            bwd bwdVar6 = (bwd) cltVar2;
            bwdVar6.b = 1 | bwdVar6.b;
            bwdVar6.c = bglVarA.a;
            if (!cltVar2.A()) {
                cloVarO.l();
            }
            int i2 = bglVarA.b;
            clt cltVar3 = cloVarO.b;
            bwd bwdVar7 = (bwd) cltVar3;
            bwdVar7.b = 2 | bwdVar7.b;
            bwdVar7.d = i2;
            String str = bglVarA.d;
            if (!cltVar3.A()) {
                cloVarO.l();
            }
            bwd bwdVar8 = (bwd) cloVarO.b;
            bwdVar8.b |= 4;
            bwdVar8.e = str;
        }
        clo cloVarO2 = bvw.a.o();
        if (!cloVarO2.b.A()) {
            cloVarO2.l();
        }
        bvw bvwVar = (bvw) cloVarO2.b;
        bwd bwdVar9 = (bwd) cloVarO.i();
        bwdVar9.getClass();
        bvwVar.c = bwdVar9;
        bvwVar.b = 50;
        return (bvw) cloVarO2.i();
    }

    @Override // defpackage.bta
    public final /* synthetic */ btc b(bug bugVar) {
        return new bqd(this, bugVar);
    }

    @Override // defpackage.bta
    public final void c(bxj bxjVar) {
        bxjVar.c("Volume Feature: %d active clients%n", Integer.valueOf(this.b.size()));
        bgt bgtVar = this.a;
        List listH = bgtVar.h();
        bxjVar.c("\tAvailable Audio Output Devices: %s%n", Integer.valueOf(listH.size()));
        Iterator it = listH.iterator();
        while (it.hasNext()) {
            bxjVar.c("\t\t%s%n", (bgl) it.next());
        }
        bxjVar.c("\tActive Audio Device:%n", new Object[0]);
        bxjVar.c("\t\t%s%n", bgtVar.a());
        if (listH.isEmpty()) {
            return;
        }
        bxjVar.c("\tVolume Control Capabilities: %s%n", bgtVar.b(bgtVar.a()));
    }

    public final synchronized void d(bug bugVar) {
        List list = this.b;
        list.remove(bugVar);
        if (list.isEmpty()) {
            bgt bgtVar = this.a;
            byj byjVar = this.e;
            List list2 = bgtVar.d;
            list2.remove(byjVar);
            if (list2.isEmpty()) {
                bgtVar.e.execute(new bid(bgtVar, 1));
            }
        }
    }

    public final synchronized void e(bug bugVar) {
        List list = this.b;
        list.add(bugVar);
        if (list.size() == 1) {
            bgt bgtVar = this.a;
            byj byjVar = this.e;
            List list2 = bgtVar.d;
            list2.add(byjVar);
            if (list2.size() == 1) {
                bgtVar.e.execute(new ama(bgtVar, 20, null));
            }
        }
        bvw bvwVarA = a();
        this.c = bvwVarA;
        bugVar.d(bvwVarA);
    }
}
