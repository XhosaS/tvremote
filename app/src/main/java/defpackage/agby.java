package defpackage;

import io.grpc.Status;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
class agby implements Runnable, agdh {
    final /* synthetic */ agca b;
    final agdp c;
    private final agcd d = new agcd(Level.FINE, agca.class);
    boolean a = true;

    public agby(agca agcaVar, agdp agdpVar) {
        this.b = agcaVar;
        this.c = agdpVar;
    }

    @Override // defpackage.agdh
    public final void a(boolean z, int i, ahwz ahwzVar, int i2, int i3) {
        agbs agbsVar;
        ahxk ahxkVar = (ahxk) ahwzVar;
        this.d.b(1, i, ahxkVar.b, i2, z);
        agca agcaVar = this.b;
        synchronized (agcaVar.l) {
            agbsVar = (agbs) agcaVar.m.get(Integer.valueOf(i));
        }
        if (agbsVar == null) {
            agca agcaVar2 = this.b;
            if (!agcaVar2.q(i)) {
                this.b.m(agdg.PROTOCOL_ERROR, a.b(i, "Received data for unknown stream: "));
                return;
            }
            synchronized (agcaVar2.l) {
                agcaVar2.j.f(i, agdg.STREAM_CLOSED);
            }
            ahwzVar.o(i2);
        } else {
            long j = i2;
            ahwzVar.n(j);
            ahwx ahwxVar = new ahwx();
            ahwxVar.fF(ahxkVar.b, j);
            agbr agbrVar = agbsVar.f;
            agfe agfeVar = agbrVar.u;
            int i4 = agfd.a;
            synchronized (this.b.l) {
                agbrVar.t(ahwxVar, z, i3 - i2);
            }
        }
        agca agcaVar3 = this.b;
        int i5 = agcaVar3.o + i3;
        agcaVar3.o = i5;
        if (i5 >= agcaVar3.h * 0.5f) {
            synchronized (agcaVar3.l) {
                agcaVar3.j.h(0, agcaVar3.o);
            }
            this.b.o = 0;
        }
    }

    @Override // defpackage.agdh
    public final void b(int i, agdg agdgVar, ahxb ahxbVar) {
        Status statusWithDescription;
        this.d.c(1, i, agdgVar, ahxbVar);
        if (agdgVar == agdg.ENHANCE_YOUR_CALM) {
            String strD = ahxbVar.d();
            agca.a.logp(Level.WARNING, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "goAway", String.format("%s: Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: %s", this, strD));
            if ("too_many_pings".equals(strD)) {
                this.b.E.run();
            }
        }
        int i2 = agdgVar.s;
        afro[] afroVarArr = afro.o;
        long j = i2;
        afro afroVar = (j >= ((long) afroVarArr.length) || j < 0) ? null : afroVarArr[(int) j];
        if (afroVar == null) {
            statusWithDescription = Status.fromCodeValue(afro.INTERNAL_ERROR.p.getCode().value()).withDescription("Unrecognized HTTP/2 error code: " + j);
        } else {
            statusWithDescription = afroVar.p;
        }
        Status statusA = statusWithDescription.a("Received Goaway");
        if (ahxbVar.b() > 0) {
            statusA = statusA.a(ahxbVar.d());
        }
        this.b.o(i, null, statusA);
    }

    @Override // defpackage.agdh
    public final void c(boolean z, int i, int i2) {
        afrw afrwVar;
        long j = (i << 32) | (i2 & 4294967295L);
        this.d.d(1, j);
        if (!z) {
            agca agcaVar = this.b;
            synchronized (agcaVar.l) {
                agcaVar.j.e(true, i, i2);
            }
            return;
        }
        agca agcaVar2 = this.b;
        synchronized (agcaVar2.l) {
            afrwVar = agcaVar2.s;
            if (afrwVar == null) {
                agca.a.logp(Level.WARNING, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "ping", "Received unexpected ping ack. No ping outstanding");
            } else if (afrwVar.a == j) {
                agcaVar2.s = null;
            } else {
                agca.a.logp(Level.WARNING, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "ping", String.format(Locale.US, "Received unexpected ping ack. Expecting %d, got %d", Long.valueOf(agcaVar2.s.a), Long.valueOf(j)));
            }
            afrwVar = null;
        }
        if (afrwVar != null) {
            synchronized (afrwVar) {
                if (afrwVar.d) {
                    return;
                }
                afrwVar.d = true;
                afrwVar.b.a(TimeUnit.NANOSECONDS);
                Map map = afrwVar.c;
                afrwVar.c = null;
                for (Map.Entry entry : map.entrySet()) {
                    Executor executor = (Executor) entry.getValue();
                    afrw.a(executor, new afru());
                }
            }
        }
    }

    @Override // defpackage.agdh
    public final void d(int i, int i2, List list) {
        agcd agcdVar = this.d;
        if (agcdVar.a()) {
            agcdVar.a.logp(agcdVar.b, "io.grpc.okhttp.OkHttpFrameLogger", "logPushPromise", "INBOUND PUSH_PROMISE: streamId=" + i + " promisedStreamId=" + i2 + " headers=" + list.toString());
        }
        agca agcaVar = this.b;
        synchronized (agcaVar.l) {
            agcaVar.j.f(i, agdg.PROTOCOL_ERROR);
        }
    }

    @Override // defpackage.agdh
    public final void e(int i, agdg agdgVar) {
        boolean z = true;
        this.d.e(1, i, agdgVar);
        Status statusA = agca.h(agdgVar).a("Rst Stream");
        if (statusA.getCode() != Status.Code.CANCELLED && statusA.getCode() != Status.Code.DEADLINE_EXCEEDED) {
            z = false;
        }
        boolean z2 = z;
        agca agcaVar = this.b;
        synchronized (agcaVar.l) {
            agbs agbsVar = (agbs) agcaVar.m.get(Integer.valueOf(i));
            if (agbsVar != null) {
                agfe agfeVar = agbsVar.f.u;
                int i2 = agfd.a;
                agcaVar.k(i, statusA, agdgVar == agdg.REFUSED_STREAM ? afof.REFUSED : afof.PROCESSED, z2, null, null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.agdh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(int r6, long r7) {
        /*
            r5 = this;
            agcd r0 = r5.d
            r1 = 1
            r0.g(r1, r6, r7)
            agca r0 = r5.b
            java.lang.Object r2 = r0.l
            monitor-enter(r2)
            if (r6 != 0) goto L16
            agco r6 = r0.k     // Catch: java.lang.Throwable -> L4b
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L4b
            r8 = 0
            r6.d(r8, r7)     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            return
        L16:
            java.util.Map r3 = r0.m     // Catch: java.lang.Throwable -> L4b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L4b
            agbs r3 = (defpackage.agbs) r3     // Catch: java.lang.Throwable -> L4b
            r4 = 0
            if (r3 == 0) goto L32
            agco r0 = r0.k     // Catch: java.lang.Throwable -> L4b
            agbr r1 = r3.f     // Catch: java.lang.Throwable -> L4b
            agcl r1 = r1.f()     // Catch: java.lang.Throwable -> L4b
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L4b
            r0.d(r1, r7)     // Catch: java.lang.Throwable -> L4b
            goto L39
        L32:
            boolean r7 = r0.q(r6)     // Catch: java.lang.Throwable -> L4b
            if (r7 != 0) goto L39
            goto L3a
        L39:
            r1 = r4
        L3a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            if (r1 == 0) goto L4a
            agca r7 = r5.b
            java.lang.String r8 = "Received window_update for unknown stream: "
            agdg r0 = defpackage.agdg.PROTOCOL_ERROR
            java.lang.String r6 = defpackage.a.b(r6, r8)
            r7.m(r0, r6)
        L4a:
            return
        L4b:
            r6 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agby.f(int, long):void");
    }

    @Override // defpackage.agdh
    public final void g(boolean z, int i, List list) {
        agcd agcdVar = this.d;
        if (agcdVar.a()) {
            agcdVar.a.logp(agcdVar.b, "io.grpc.okhttp.OkHttpFrameLogger", "logHeaders", "INBOUND HEADERS: streamId=" + i + " headers=" + list.toString() + " endStream=" + z);
        }
        agca agcaVar = this.b;
        int i2 = agcaVar.F;
        Status statusWithDescription = null;
        boolean z2 = true;
        if (i2 != Integer.MAX_VALUE) {
            long jB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                agdj agdjVar = (agdj) list.get(i3);
                jB += agdjVar.f.b() + 32 + agdjVar.g.b();
            }
            int iMin = (int) Math.min(jB, 2147483647L);
            if (iMin > i2) {
                statusWithDescription = Status.h.withDescription(String.format(Locale.US, "Response %s metadata larger than %d: %d", true != z ? "header" : "trailer", Integer.valueOf(i2), Integer.valueOf(iMin)));
            }
        }
        synchronized (agcaVar.l) {
            agbs agbsVar = (agbs) agcaVar.m.get(Integer.valueOf(i));
            if (agbsVar == null) {
                if (agcaVar.q(i)) {
                    agcaVar.j.f(i, agdg.STREAM_CLOSED);
                }
            } else if (statusWithDescription == null) {
                agbr agbrVar = agbsVar.f;
                agfe agfeVar = agbrVar.u;
                int i4 = agfd.a;
                if (z) {
                    byte[][] bArrA = agcp.a(list);
                    Charset charset = afgt.a;
                    agbrVar.r(new afih(bArrA));
                } else {
                    byte[][] bArrA2 = agcp.a(list);
                    Charset charset2 = afgt.a;
                    agbrVar.q(new afih(bArrA2));
                }
            } else {
                if (!z) {
                    agcaVar.j.f(i, agdg.CANCEL);
                }
                agbsVar.f.j(statusWithDescription, afof.PROCESSED, false, new afih());
            }
            z2 = false;
        }
        if (z2) {
            this.b.m(agdg.PROTOCOL_ERROR, a.b(i, "Received header for unknown stream: "));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    @Override // defpackage.agdh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(defpackage.agdu r11) {
        /*
            r10 = this;
            agcd r0 = r10.d
            r1 = 1
            r0.f(r1, r11)
            agca r0 = r10.b
            java.lang.Object r2 = r0.l
            monitor-enter(r2)
            r3 = 4
            boolean r4 = r11.b(r3)     // Catch: java.lang.Throwable -> Lab
            if (r4 == 0) goto L18
            int[] r4 = r11.b     // Catch: java.lang.Throwable -> Lab
            r3 = r4[r3]     // Catch: java.lang.Throwable -> Lab
            r0.x = r3     // Catch: java.lang.Throwable -> Lab
        L18:
            r3 = 7
            boolean r4 = r11.b(r3)     // Catch: java.lang.Throwable -> Lab
            r5 = 0
            if (r4 == 0) goto L50
            int[] r4 = r11.b     // Catch: java.lang.Throwable -> Lab
            r3 = r4[r3]     // Catch: java.lang.Throwable -> Lab
            agco r4 = r0.k     // Catch: java.lang.Throwable -> Lab
            if (r3 < 0) goto L44
            int r6 = r4.c     // Catch: java.lang.Throwable -> Lab
            int r6 = r3 - r6
            r4.c = r3     // Catch: java.lang.Throwable -> Lab
            agcm r3 = r4.a     // Catch: java.lang.Throwable -> Lab
            agcl[] r3 = r3.s()     // Catch: java.lang.Throwable -> Lab
            int r4 = r3.length     // Catch: java.lang.Throwable -> Lab
            r7 = r5
        L36:
            if (r7 >= r4) goto L40
            r8 = r3[r7]     // Catch: java.lang.Throwable -> Lab
            r8.f(r6)     // Catch: java.lang.Throwable -> Lab
            int r7 = r7 + 1
            goto L36
        L40:
            if (r6 <= 0) goto L50
            r3 = r1
            goto L51
        L44:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lab
            java.lang.String r0 = "Invalid initial window size: "
            java.lang.String r0 = defpackage.a.b(r3, r0)     // Catch: java.lang.Throwable -> Lab
            r11.<init>(r0)     // Catch: java.lang.Throwable -> Lab
            throw r11     // Catch: java.lang.Throwable -> Lab
        L50:
            r3 = r5
        L51:
            boolean r4 = r10.a     // Catch: java.lang.Throwable -> Lab
            if (r4 == 0) goto L65
            afvb r4 = r0.i     // Catch: java.lang.Throwable -> Lab
            afeh r6 = r0.q     // Catch: java.lang.Throwable -> Lab
            r4.e()     // Catch: java.lang.Throwable -> Lab
            r0.q = r6     // Catch: java.lang.Throwable -> Lab
            afvb r4 = r0.i     // Catch: java.lang.Throwable -> Lab
            r4.b()     // Catch: java.lang.Throwable -> Lab
            r10.a = r5     // Catch: java.lang.Throwable -> Lab
        L65:
            agbg r4 = r0.j     // Catch: java.lang.Throwable -> Lab
            agcd r5 = r4.c     // Catch: java.lang.Throwable -> Lab
            boolean r6 = r5.a()     // Catch: java.lang.Throwable -> Lab
            if (r6 == 0) goto L85
            java.util.logging.Logger r6 = r5.a     // Catch: java.lang.Throwable -> Lab
            java.util.logging.Level r5 = r5.b     // Catch: java.lang.Throwable -> Lab
            r7 = 2
            java.lang.String r7 = defpackage.agcb.a(r7)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r8 = " SETTINGS: ack=true"
            java.lang.String r7 = r7.concat(r8)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r8 = "logSettingsAck"
            java.lang.String r9 = "io.grpc.okhttp.OkHttpFrameLogger"
            r6.logp(r5, r9, r8, r7)     // Catch: java.lang.Throwable -> Lab
        L85:
            agdi r5 = r4.b     // Catch: java.io.IOException -> L99 java.lang.Throwable -> Lab
            r6 = r5
            agbc r6 = (defpackage.agbc) r6     // Catch: java.io.IOException -> L99 java.lang.Throwable -> Lab
            agbe r6 = r6.a     // Catch: java.io.IOException -> L99 java.lang.Throwable -> Lab
            int r7 = r6.h     // Catch: java.io.IOException -> L99 java.lang.Throwable -> Lab
            int r7 = r7 + r1
            r6.h = r7     // Catch: java.io.IOException -> L99 java.lang.Throwable -> Lab
            agbh r5 = (defpackage.agbh) r5     // Catch: java.io.IOException -> L99 java.lang.Throwable -> Lab
            agdi r1 = r5.b     // Catch: java.io.IOException -> L99 java.lang.Throwable -> Lab
            r1.a(r11)     // Catch: java.io.IOException -> L99 java.lang.Throwable -> Lab
            goto L9f
        L99:
            r11 = move-exception
            agbf r1 = r4.a     // Catch: java.lang.Throwable -> Lab
            r1.e(r11)     // Catch: java.lang.Throwable -> Lab
        L9f:
            if (r3 == 0) goto La6
            agco r11 = r0.k     // Catch: java.lang.Throwable -> Lab
            r11.c()     // Catch: java.lang.Throwable -> Lab
        La6:
            r0.r()     // Catch: java.lang.Throwable -> Lab
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lab
            return
        Lab:
            r11 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lab
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agby.h(agdu):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01c6, code lost:
    
        r3 = new java.lang.Object[1];
        r3[r18] = java.lang.Integer.valueOf(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01d5, code lost:
    
        throw defpackage.agdr.c("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", r3);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1002
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agby.run():void");
    }
}
