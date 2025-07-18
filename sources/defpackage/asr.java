package defpackage;

import java.util.Random;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asr implements cpi {
    private final cpm a;
    private final cpm b;
    private final cpm c;
    private final cpm d;
    private final /* synthetic */ int e;

    public asr(cpm cpmVar, cpm cpmVar2, cpm cpmVar3, cpm cpmVar4, int i) {
        this.e = i;
        this.a = cpmVar;
        this.b = cpmVar2;
        this.c = cpmVar3;
        this.d = cpmVar4;
    }

    @Override // defpackage.crv, defpackage.cru
    public final /* synthetic */ Object a() {
        int i = this.e;
        if (i == 0) {
            return new asq((asv) this.a.a(), (asz) this.b.a(), this.c, this.d);
        }
        if (i == 1) {
            Executor executor = (!((aqo) this.c.a()).c || ((byg) ((cpj) this.a).a).f()) ? (Executor) this.b.a() : (Executor) this.d.a();
            executor.getClass();
            return executor;
        }
        if (i == 2) {
            return new avz(((aug) this.c).a(), cph.b(this.d), (Executor) this.a.a());
        }
        byg bygVar = (byg) ((cpj) this.b).a;
        Random random = (Random) this.a.a();
        ayu ayuVar = (ayu) this.d.a();
        return new azi((Random) bygVar.d(random), ayuVar);
    }

    public asr(cpm cpmVar, cpm cpmVar2, cpm cpmVar3, cpm cpmVar4, int i, byte[] bArr) {
        this.e = i;
        this.d = cpmVar;
        this.b = cpmVar2;
        this.c = cpmVar3;
        this.a = cpmVar4;
    }

    public asr(cpm cpmVar, cpm cpmVar2, cpm cpmVar3, cpm cpmVar4, int i, char[] cArr) {
        this.e = i;
        this.c = cpmVar;
        this.d = cpmVar2;
        this.b = cpmVar3;
        this.a = cpmVar4;
    }

    public asr(cpm cpmVar, cpm cpmVar2, cpm cpmVar3, cpm cpmVar4, int i, short[] sArr) {
        this.e = i;
        this.b = cpmVar;
        this.a = cpmVar2;
        this.d = cpmVar3;
        this.c = cpmVar4;
    }
}
