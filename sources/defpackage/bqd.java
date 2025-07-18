package defpackage;

import android.media.AudioManager;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bqd extends btc {
    final /* synthetic */ bqe a;
    private final bug b;

    public bqd(bqe bqeVar, bug bugVar) {
        this.a = bqeVar;
        this.b = bugVar;
    }

    @Override // defpackage.btc
    public final int a() {
        return 64;
    }

    @Override // defpackage.btc
    public final void b(int i) {
        if (i(buy.VOLUME, i)) {
            this.a.d(this.b);
        }
    }

    @Override // defpackage.btc
    public final void c(int i, int i2) {
        buy buyVar = buy.VOLUME;
        if (h(buyVar, i, i2)) {
            if (i(buyVar, i2)) {
                this.a.e(this.b);
            } else {
                this.a.d(this.b);
            }
        }
    }

    @Override // defpackage.btc
    public final boolean d(bux buxVar) {
        switch (buv.a(buxVar.b).ordinal()) {
            case 11:
                bqe bqeVar = this.a;
                bwe bweVar = buxVar.b == 50 ? (bwe) buxVar.c : bwe.a;
                bgt bgtVar = bqeVar.a;
                bgl bglVarA = bgtVar.a();
                if (bglVarA != null) {
                    if (bglVarA.a == bweVar.c) {
                        if ((bweVar.b & 2) != 0) {
                            ((AudioManager) bgtVar.f.a).setStreamVolume(3, bweVar.d, 0);
                        }
                        if ((bweVar.b & 4) != 0) {
                            bgtVar.j(true != bweVar.e ? 100 : -100);
                        }
                    }
                }
                return true;
            case 12:
                bqe bqeVar2 = this.a;
                bwc bwcVar = buxVar.b == 51 ? (bwc) buxVar.c : bwc.a;
                bgt bgtVar2 = bqeVar2.a;
                bgl bglVarA2 = bgtVar2.a();
                if (bglVarA2 != null) {
                    if (bglVarA2.a == bwcVar.b) {
                        int iZ = ii.Z(bwcVar.c);
                        if (iZ == 0) {
                            iZ = 1;
                        }
                        int i = -1;
                        int i2 = iZ - 1;
                        if (i2 == 0) {
                            i = 1;
                        } else if (i2 != 1) {
                            i = 101;
                        }
                        bgtVar2.j(i);
                    }
                }
                return true;
            case 13:
                bqe bqeVar3 = this.a;
                bus busVar = buxVar.b == 60 ? (bus) buxVar.c : bus.a;
                bgt bgtVar3 = bqeVar3.a;
                Iterator it = bgtVar3.h().iterator();
                while (true) {
                    if (it.hasNext()) {
                        bgl bglVar = (bgl) it.next();
                        if (busVar.b == bglVar.a) {
                            bgtVar3.g(bglVar.b, bglVar.c);
                        }
                    }
                }
                return true;
            case 14:
                this.a.a.f();
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.btc
    public final boolean e(int i, bsw bswVar) {
        return true;
    }

    @Override // defpackage.btc
    public final void f(bxj bxjVar) {
    }
}
