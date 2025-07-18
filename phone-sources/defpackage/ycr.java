package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ycr implements xui {
    final /* synthetic */ yct a;

    public ycr(yct yctVar) {
        this.a = yctVar;
    }

    @Override // defpackage.xui
    public final void a(xtk xtkVar) {
        int i = yfl.a;
        ycs ycsVar = this.a.f;
        int i2 = ycs.z;
        synchronized (ycsVar.a) {
            ycsVar.q(xtkVar, true, null);
        }
    }

    @Override // defpackage.xui
    public final void b(yby ybyVar, boolean z, boolean z2, int i) {
        zgk zgkVar;
        int i2 = yfl.a;
        if (ybyVar == null) {
            zgkVar = yct.a;
        } else {
            zgkVar = ((ydf) ybyVar).a;
            int i3 = (int) zgkVar.b;
            if (i3 > 0) {
                this.a.s(i3);
            }
        }
        yct yctVar = this.a;
        ycs ycsVar = yctVar.f;
        int i4 = ycs.z;
        synchronized (ycsVar.a) {
            if (!ycsVar.f) {
                if (ycsVar.u) {
                    ycsVar.c.eW(zgkVar, (int) zgkVar.b);
                    ycsVar.d |= z;
                    ycsVar.e |= z2;
                } else {
                    sij.x(ycsVar.x != -1, "streamId should be set");
                    ycsVar.h.a(z, ycsVar.w, zgkVar, z2);
                }
            }
            ybx ybxVar = yctVar.r;
            if (i != 0) {
                ybxVar.f += i;
                ybxVar.a.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0152 A[Catch: all -> 0x016a, TryCatch #0 {, blocks: (B:4:0x0015, B:6:0x0043, B:8:0x004e, B:9:0x0081, B:11:0x0084, B:13:0x0090, B:15:0x0098, B:16:0x00a8, B:17:0x00ab, B:19:0x00b2, B:50:0x0168, B:20:0x00c0, B:22:0x00c6, B:24:0x00ce, B:26:0x00d6, B:41:0x013b, B:43:0x0141, B:45:0x0145, B:27:0x00dd, B:29:0x00ed, B:31:0x0100, B:33:0x0106, B:35:0x010a, B:36:0x011f, B:38:0x0125, B:40:0x0137, B:30:0x00f0, B:46:0x0152, B:48:0x015c, B:49:0x0165, B:7:0x0049), top: B:55:0x0015 }] */
    @Override // defpackage.xui
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.xsm r13) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ycr.c(xsm):void");
    }
}
