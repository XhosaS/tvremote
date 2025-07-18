package defpackage;

import android.content.SharedPreferences;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes.dex */
class lei implements Runnable {
    final /* synthetic */ kuk a;
    final /* synthetic */ leo b;

    public lei(leo leoVar, kuk kukVar) {
        this.a = kukVar;
        this.b = leoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        leo leoVar = this.b;
        lbk lbkVar = leoVar.y;
        lao laoVar = lbkVar.e;
        lbkVar.m(laoVar);
        lbk lbkVar2 = laoVar.y;
        laoVar.g();
        int i = laoVar.e().b;
        kuk kukVar = this.a;
        int i2 = kukVar.b;
        if (!lct.o(i2, i)) {
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.i.b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i2));
            return;
        }
        SharedPreferences.Editor editorEdit = laoVar.c().edit();
        editorEdit.putString("dma_consent_settings", kukVar.c);
        editorEdit.apply();
        lab labVar2 = lbkVar.f;
        lbkVar.o(labVar2);
        labVar2.k.b("Setting DMA consent(FE)", kukVar);
        lbk lbkVar3 = leoVar.y;
        if (!lbkVar3.k().y()) {
            lbkVar3.k().A();
            return;
        }
        final lgp lgpVarK = lbkVar3.k();
        lgpVarK.g();
        lgpVarK.a();
        lgpVarK.p(new Runnable() { // from class: lfi
            @Override // java.lang.Runnable
            public final void run() {
                lgp lgpVar = lgpVarK;
                kzj kzjVar = lgpVar.b;
                if (kzjVar == null) {
                    lbk lbkVar4 = lgpVar.y;
                    lab labVar3 = lbkVar4.f;
                    lbkVar4.o(labVar3);
                    labVar3.c.a("Failed to send Dma consent settings to service");
                    return;
                }
                try {
                    kzjVar.x(lgpVar.i(false));
                    lgpVar.o();
                } catch (RemoteException e) {
                    lbk lbkVar5 = lgpVar.y;
                    lab labVar4 = lbkVar5.f;
                    lbkVar5.o(labVar4);
                    labVar4.c.b("Failed to send Dma consent settings to the service", e);
                }
            }
        });
    }
}
