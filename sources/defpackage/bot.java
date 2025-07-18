package defpackage;

import android.hardware.input.InputManager;
import android.os.Handler;
import com.google.android.tv.remote.service.RemoteService;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bot extends btc {
    public boolean a;
    public bpm b;
    final /* synthetic */ bou c;
    private bpm d;
    private int e;
    private int f;

    public bot(bou bouVar) {
        this.c = bouVar;
    }

    private final void g(bpm bpmVar, int i) {
        this.e++;
        this.c.e++;
        bpmVar.b(i);
    }

    private final void j(bpm bpmVar, int i) {
        this.f++;
        this.c.f++;
        bpmVar.c(i);
    }

    @Override // defpackage.btc
    public final int a() {
        return 2;
    }

    @Override // defpackage.btc
    protected final void b(int i) {
        bpm bpmVar = this.d;
        if (bpmVar != null) {
            bpmVar.a();
        }
        synchronized (this) {
            this.a = true;
            bpm bpmVar2 = this.b;
            if (bpmVar2 != null) {
                bpmVar2.a();
            }
        }
    }

    @Override // defpackage.btc
    public final boolean d(bux buxVar) throws btb {
        if (buxVar.b != 10) {
            return false;
        }
        bpm bpmVar = this.d;
        if (bpmVar == null) {
            throw new btb(5);
        }
        bvp bvpVar = (bvp) buxVar.c;
        int i = bvpVar.b;
        if (i == 26) {
            bpm bpmVar2 = this.b;
            if (bpmVar2 != null) {
                g(bpmVar2, 26);
                j(this.b, 26);
                this.b.d();
                return true;
            }
            i = 26;
        }
        int iC = awc.c(bvpVar.c);
        if (iC == 0) {
            iC = 1;
        }
        int i2 = iC - 1;
        if (i2 == 1) {
            g(bpmVar, i);
        } else if (i2 == 2) {
            j(bpmVar, i);
        } else {
            if (i2 != 3) {
                throw new btb(8);
            }
            g(bpmVar, i);
            j(this.d, i);
        }
        this.d.d();
        return true;
    }

    @Override // defpackage.btc
    public final boolean e(int i, final bsw bswVar) throws btb {
        boolean z;
        if (!i(buy.KEYBOARD, i)) {
            return true;
        }
        bou bouVar = this.c;
        Consumer consumer = new Consumer() { // from class: bos
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    bot botVar = this.a;
                    synchronized (botVar) {
                        if (!botVar.a) {
                            ((cbs) ((cbs) bou.a.e().g(btt.a)).j("com/google/android/tv/remote/service/KeyboardFeature$ClientMessageHandler", "prepareFeatures", 153, "KeyboardFeature.java")).p("Opening alternative input bridge");
                            botVar.b = botVar.c.b.a("virtual-remote-2");
                        }
                    }
                }
                bswVar.a(null);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                return Consumer$CC.$default$andThen(this, consumer2);
            }
        };
        if (bouVar.d == null) {
            crv crvVar = bouVar.c;
            RemoteService remoteService = bouVar.b;
            Handler handlerA = ((bpi) crvVar).a();
            InputManager inputManager = (InputManager) remoteService.getSystemService(InputManager.class);
            inputManager.registerInputDeviceListener(new bor(bouVar, inputManager, handlerA, consumer), handlerA);
            z = true;
        } else {
            z = false;
        }
        cbt cbtVar = bou.a;
        cch cchVarE = cbtVar.e();
        cck cckVar = btt.a;
        ((cbs) ((cbs) cchVarE.g(cckVar)).j("com/google/android/tv/remote/service/KeyboardFeature$ClientMessageHandler", "prepareFeatures", 162, "KeyboardFeature.java")).p("Opening input bridge");
        RemoteService remoteService2 = bouVar.b;
        bpm bpmVarA = remoteService2.a("virtual-remote");
        this.d = bpmVarA;
        if (bpmVarA == null) {
            throw new btb(7);
        }
        if (z) {
            return false;
        }
        if (bouVar.d.booleanValue()) {
            ((cbs) ((cbs) cbtVar.e().g(cckVar)).j("com/google/android/tv/remote/service/KeyboardFeature$ClientMessageHandler", "prepareFeatures", 168, "KeyboardFeature.java")).p("Opening alternative input bridge");
            bpm bpmVarA2 = remoteService2.a("virtual-remote-2");
            this.b = bpmVarA2;
            if (bpmVarA2 == null) {
                throw new btb(7);
            }
        }
        return true;
    }

    @Override // defpackage.btc
    public final void f(bxj bxjVar) {
        bxjVar.c("Keys injected %d/%d%n", Integer.valueOf(this.e), Integer.valueOf(this.f));
    }

    @Override // defpackage.btc
    public final void c(int i, int i2) {
    }
}
