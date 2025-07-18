package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
class agbq implements afmt {
    final /* synthetic */ agbs a;

    public agbq(agbs agbsVar) {
        this.a = agbsVar;
    }

    @Override // defpackage.afmt
    public final void a(Status status) {
        int i = agfd.a;
        agbr agbrVar = this.a.f;
        int i2 = agbr.y;
        synchronized (agbrVar.a) {
            agbrVar.s(status, true, null);
        }
    }

    @Override // defpackage.afmt
    public final void b(agaf agafVar, boolean z, boolean z2, int i) {
        ahwx ahwxVar;
        int i2 = agfd.a;
        if (agafVar == null) {
            ahwxVar = agbs.a;
        } else {
            ahwxVar = ((agci) agafVar).a;
            int i3 = (int) ahwxVar.b;
            if (i3 > 0) {
                this.a.j().l(i3);
            }
        }
        agbs agbsVar = this.a;
        agbr agbrVar = agbsVar.f;
        int i4 = agbr.y;
        synchronized (agbrVar.a) {
            if (!agbrVar.f) {
                if (agbrVar.t) {
                    agbrVar.c.fF(ahwxVar, (int) ahwxVar.b);
                    agbrVar.d |= z;
                    agbrVar.e |= z2;
                } else {
                    yqw.M(agbrVar.w != -1, "streamId should be set");
                    agbrVar.h.a(z, agbrVar.v, ahwxVar, z2);
                }
            }
            agae agaeVar = agbsVar.r;
            if (i != 0) {
                agaeVar.g += i;
                agaeVar.b.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0159 A[Catch: all -> 0x0171, TryCatch #0 {, blocks: (B:4:0x0015, B:6:0x0043, B:8:0x004e, B:9:0x008b, B:11:0x008e, B:13:0x0099, B:15:0x009f, B:16:0x00af, B:17:0x00b2, B:19:0x00b9, B:50:0x016f, B:20:0x00c7, B:22:0x00cd, B:24:0x00d5, B:26:0x00dd, B:41:0x0142, B:43:0x0148, B:45:0x014c, B:27:0x00e4, B:29:0x00f4, B:31:0x0107, B:33:0x010d, B:35:0x0111, B:36:0x0126, B:38:0x012c, B:40:0x013e, B:30:0x00f7, B:46:0x0159, B:48:0x0163, B:49:0x016c, B:7:0x0049), top: B:55:0x0015 }] */
    @Override // defpackage.afmt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.afih r14) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agbq.c(afih):void");
    }
}
