package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ulo {
    public final Object a;
    public final Object b;

    public ulo() {
        throw null;
    }

    public static synchronized ulo a() {
        return b(uiz.b());
    }

    public static synchronized ulo b(uiz uizVar) {
        return (ulo) uizVar.e(ulo.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.ulo e(android.content.Context r5) throws java.io.IOException {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L33 java.lang.Error -> L35 java.io.IOException -> L37
            java.io.File r5 = r5.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L33 java.lang.Error -> L35 java.io.IOException -> L37
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L33 java.lang.Error -> L35 java.io.IOException -> L37
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L33 java.lang.Error -> L35 java.io.IOException -> L37
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L33 java.lang.Error -> L35 java.io.IOException -> L37
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L33 java.lang.Error -> L35 java.io.IOException -> L37
            java.nio.channels.FileChannel r5 = j$.nio.channels.DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(r5)     // Catch: java.nio.channels.OverlappingFileLockException -> L33 java.lang.Error -> L35 java.io.IOException -> L37
            java.nio.channels.FileLock r0 = r5.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L2b java.lang.Error -> L2d java.io.IOException -> L2f
            ulo r2 = new ulo     // Catch: java.nio.channels.OverlappingFileLockException -> L25 java.lang.Error -> L27 java.io.IOException -> L29
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L25 java.lang.Error -> L27 java.io.IOException -> L29
            return r2
        L25:
            r2 = move-exception
            goto L3b
        L27:
            r2 = move-exception
            goto L3b
        L29:
            r2 = move-exception
            goto L3b
        L2b:
            r0 = move-exception
            goto L30
        L2d:
            r0 = move-exception
            goto L30
        L2f:
            r0 = move-exception
        L30:
            r2 = r0
            r0 = r1
            goto L3b
        L33:
            r5 = move-exception
            goto L38
        L35:
            r5 = move-exception
            goto L38
        L37:
            r5 = move-exception
        L38:
            r2 = r5
            r5 = r1
            r0 = r5
        L3b:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L47
            r0.release()     // Catch: java.io.IOException -> L47
        L47:
            if (r5 == 0) goto L4c
            r5.close()     // Catch: java.io.IOException -> L4c
        L4c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ulo.e(android.content.Context):ulo");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001c A[PHI: r2
  0x001c: PHI (r2v1 int) = (r2v0 int), (r2v2 int) binds: [B:6:0x000d, B:10:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.tiq h(defpackage.tjb r4) {
        /*
            int r0 = r4.c
            int r0 = defpackage.a.aL(r0)
            r1 = 1
            if (r0 != 0) goto La
            r0 = r1
        La:
            int r0 = r0 + (-1)
            r2 = 2
            if (r0 == r1) goto L1c
            r3 = 3
            if (r0 == r2) goto L1a
            r2 = 4
            if (r0 == r3) goto L1c
            if (r0 == r2) goto L18
            goto L1d
        L18:
            r1 = 5
            goto L1d
        L1a:
            r1 = r3
            goto L1d
        L1c:
            r1 = r2
        L1d:
            tiq r0 = new tiq
            int r4 = r4.d
            r0.<init>(r1, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ulo.h(tjb):tiq");
    }

    private static tjb t(tiq tiqVar) {
        vtw vtwVarM = tjb.a.m();
        int i = tiqVar.b - 1;
        if (i == 1) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            tjb tjbVar = (tjb) vtwVarM.b;
            tjbVar.c = 1;
            tjbVar.b = 1 | tjbVar.b;
        } else if (i == 2) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            tjb tjbVar2 = (tjb) vtwVarM.b;
            tjbVar2.c = 2;
            tjbVar2.b = 1 | tjbVar2.b;
        } else if (i == 3) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            tjb tjbVar3 = (tjb) vtwVarM.b;
            tjbVar3.c = 3;
            tjbVar3.b = 1 | tjbVar3.b;
        } else if (i != 4) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            tjb tjbVar4 = (tjb) vtwVarM.b;
            tjbVar4.c = 0;
            tjbVar4.b = 1 | tjbVar4.b;
        } else {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            tjb tjbVar5 = (tjb) vtwVarM.b;
            tjbVar5.c = 4;
            tjbVar5.b = 1 | tjbVar5.b;
        }
        int i2 = tiqVar.a;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        tjb tjbVar6 = (tjb) vtwVarM.b;
        tjbVar6.b = 2 | tjbVar6.b;
        tjbVar6.d = i2;
        return (tjb) vtwVarM.r();
    }

    private final void u(tjd tjdVar) {
        tjdVar.f((OutputStream) this.a);
    }

    private static vtw v(int i) {
        vtw vtwVarM = tjd.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        tjd tjdVar = (tjd) vucVar;
        tjdVar.b |= 1;
        tjdVar.e = 2;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        tjd tjdVar2 = (tjd) vtwVarM.b;
        tjdVar2.f = i;
        tjdVar2.b |= 2;
        return vtwVarM;
    }

    private static String w(zgk zgkVar) {
        long j = zgkVar.b;
        return j <= 64 ? zgkVar.u().g() : zgkVar.v((int) Math.min(j, 64L)).g().concat("...");
    }

    public final void c() throws IOException {
        try {
            ((FileLock) this.a).release();
            ((FileChannel) this.b).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final synchronized onz d(String str, String str2, una unaVar) {
        Pair pair = new Pair(str, str2);
        ?? r7 = this.b;
        onz onzVar = (onz) r7.get(pair);
        if (onzVar != null) {
            return onzVar;
        }
        final FirebaseInstanceId firebaseInstanceId = unaVar.a;
        String str3 = unaVar.b;
        String str4 = unaVar.c;
        String str5 = unaVar.d;
        final unf unfVar = unaVar.e;
        onz onzVarC = unc.b(firebaseInstanceId.e.a(str3, str4, str5, new Bundle())).c(firebaseInstanceId.b, new uon(firebaseInstanceId, str4, str5, 1));
        onzVarC.n(new fba(9), new onv() { // from class: unb
            @Override // defpackage.onv
            public final void e(Object obj) {
                Object obj2 = ((ulp) obj).a;
                unf unfVar2 = unfVar;
                if (unfVar2 != null) {
                    if (((String) obj2).equals(unfVar2.b)) {
                        return;
                    }
                }
                Iterator it = firebaseInstanceId.f.iterator();
                while (it.hasNext()) {
                    ((FirebaseMessaging) ((zft) it.next()).a).e((String) obj2);
                }
            }
        });
        onz onzVarB = onzVarC.b(this.a, new nuy(this, pair, 3));
        r7.put(pair, onzVarB);
        return onzVarB;
    }

    public final void f() {
        ((tjo) this.a).a();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.function.Consumer] */
    public final void g() {
        vtw vtwVar = (vtw) this.b;
        if (((tmv) vtwVar.b).e.size() > 0) {
            ?? r1 = this.a;
            vtw vtwVarM = tms.a.m();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            tms tmsVar = (tms) vtwVarM.b;
            tmv tmvVar = (tmv) vtwVar.r();
            tmvVar.getClass();
            tmsVar.c = tmvVar;
            tmsVar.b = 21;
            r1.accept((tms) vtwVarM.r());
            if (vtwVar.a.A()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            vtwVar.b = vtwVar.q();
        }
    }

    public final void i(Exception exc) {
        u((tjd) (exc instanceof tii ? v(401) : exc instanceof tih ? v(402) : v(400)).r());
    }

    public final void j(tiu tiuVar) {
        int i = tiuVar.d - 1;
        vtw vtwVarV = v(200);
        int i2 = 1;
        switch (i) {
            case 1:
                tit titVar = (tit) tiuVar;
                vtw vtwVarM = tje.a.m();
                String str = titVar.a;
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                vuc vucVar = vtwVarM.b;
                tje tjeVar = (tje) vucVar;
                str.getClass();
                tjeVar.b = 1 | tjeVar.b;
                tjeVar.c = str;
                String str2 = titVar.b;
                if (str2 != null) {
                    if (!vucVar.A()) {
                        vtwVarM.u();
                    }
                    tje tjeVar2 = (tje) vtwVarM.b;
                    tjeVar2.b = 2 | tjeVar2.b;
                    tjeVar2.d = str2;
                }
                tje tjeVar3 = (tje) vtwVarM.r();
                if (!vtwVarV.b.A()) {
                    vtwVarV.u();
                }
                tjd tjdVar = (tjd) vtwVarV.b;
                tjd tjdVar2 = tjd.a;
                tjeVar3.getClass();
                tjdVar.d = tjeVar3;
                tjdVar.c = 10;
                break;
            case 2:
                tis tisVar = (tis) tiuVar;
                vtw vtwVarM2 = tjf.a.m();
                if (tisVar.a()) {
                    String str3 = tisVar.a;
                    if (!vtwVarM2.b.A()) {
                        vtwVarM2.u();
                    }
                    tjf tjfVar = (tjf) vtwVarM2.b;
                    str3.getClass();
                    tjfVar.b = 1 | tjfVar.b;
                    tjfVar.c = str3;
                }
                tjf tjfVar2 = (tjf) vtwVarM2.r();
                if (!vtwVarV.b.A()) {
                    vtwVarV.u();
                }
                tjd tjdVar3 = (tjd) vtwVarV.b;
                tjd tjdVar4 = tjd.a;
                tjfVar2.getClass();
                tjdVar3.d = tjfVar2;
                tjdVar3.c = 11;
                break;
            case 3:
                tir tirVar = (tir) tiuVar;
                vtw vtwVarM3 = tjc.a.m();
                int i3 = tirVar.c;
                int i4 = i3 - 1;
                if (i3 == 0) {
                    throw null;
                }
                if (i4 == 1) {
                    if (!vtwVarM3.b.A()) {
                        vtwVarM3.u();
                    }
                    tjc tjcVar = (tjc) vtwVarM3.b;
                    tjcVar.e = 2;
                    tjcVar.b |= 1;
                } else if (i4 == 2) {
                    if (!vtwVarM3.b.A()) {
                        vtwVarM3.u();
                    }
                    tjc tjcVar2 = (tjc) vtwVarM3.b;
                    tjcVar2.e = 1;
                    tjcVar2.b = 1 | tjcVar2.b;
                }
                Iterator it = tirVar.b().iterator();
                while (it.hasNext()) {
                    tjb tjbVarT = t((tiq) it.next());
                    if (!vtwVarM3.b.A()) {
                        vtwVarM3.u();
                    }
                    tjc tjcVar3 = (tjc) vtwVarM3.b;
                    tjbVarT.getClass();
                    vun vunVar = tjcVar3.d;
                    if (!vunVar.c()) {
                        tjcVar3.d = vuc.s(vunVar);
                    }
                    tjcVar3.d.add(tjbVarT);
                }
                Iterator it2 = tirVar.a().iterator();
                while (it2.hasNext()) {
                    tjb tjbVarT2 = t((tiq) it2.next());
                    if (!vtwVarM3.b.A()) {
                        vtwVarM3.u();
                    }
                    tjc tjcVar4 = (tjc) vtwVarM3.b;
                    tjbVarT2.getClass();
                    vun vunVar2 = tjcVar4.c;
                    if (!vunVar2.c()) {
                        tjcVar4.c = vuc.s(vunVar2);
                    }
                    tjcVar4.c.add(tjbVarT2);
                }
                tjc tjcVar5 = (tjc) vtwVarM3.r();
                if (!vtwVarV.b.A()) {
                    vtwVarV.u();
                }
                tjd tjdVar5 = (tjd) vtwVarV.b;
                tjd tjdVar6 = tjd.a;
                tjcVar5.getClass();
                tjdVar5.d = tjcVar5;
                tjdVar5.c = 20;
                break;
            case 4:
                tip tipVar = (tip) tiuVar;
                vtw vtwVarM4 = tiz.a.m();
                tjb tjbVarT3 = t(tipVar.a);
                if (!vtwVarM4.b.A()) {
                    vtwVarM4.u();
                }
                vuc vucVar2 = vtwVarM4.b;
                tiz tizVar = (tiz) vucVar2;
                tjbVarT3.getClass();
                tizVar.c = tjbVarT3;
                tizVar.b |= 1;
                int i5 = tipVar.b - 1;
                if (i5 == 1) {
                    i2 = 2;
                } else if (i5 == 2) {
                    i2 = 3;
                }
                if (!vucVar2.A()) {
                    vtwVarM4.u();
                }
                tiz tizVar2 = (tiz) vtwVarM4.b;
                tizVar2.d = i2 - 1;
                tizVar2.b = 2 | tizVar2.b;
                tiz tizVar3 = (tiz) vtwVarM4.r();
                if (!vtwVarV.b.A()) {
                    vtwVarV.u();
                }
                tjd tjdVar7 = (tjd) vtwVarV.b;
                tjd tjdVar8 = tjd.a;
                tizVar3.getClass();
                tjdVar7.d = tizVar3;
                tjdVar7.c = 30;
                break;
            case 5:
                tja tjaVar = tja.a;
                if (!vtwVarV.b.A()) {
                    vtwVarV.u();
                }
                tjd tjdVar9 = (tjd) vtwVarV.b;
                tjd tjdVar10 = tjd.a;
                tjaVar.getClass();
                tjdVar9.d = tjaVar;
                tjdVar9.c = 31;
                break;
            case 6:
                vtw vtwVarM5 = tjg.a.m();
                vsz vszVarQ = vsz.q(((tiw) tiuVar).a);
                if (!vtwVarM5.b.A()) {
                    vtwVarM5.u();
                }
                tjg tjgVar = (tjg) vtwVarM5.b;
                tjgVar.b = 1 | tjgVar.b;
                tjgVar.c = vszVarQ;
                tjg tjgVar2 = (tjg) vtwVarM5.r();
                if (!vtwVarV.b.A()) {
                    vtwVarV.u();
                }
                tjd tjdVar11 = (tjd) vtwVarV.b;
                tjd tjdVar12 = tjd.a;
                tjgVar2.getClass();
                tjdVar11.d = tjgVar2;
                tjdVar11.c = 40;
                break;
            default:
                vtw vtwVarM6 = tjh.a.m();
                vsz vszVarQ2 = vsz.q(((tiv) tiuVar).a);
                if (!vtwVarM6.b.A()) {
                    vtwVarM6.u();
                }
                tjh tjhVar = (tjh) vtwVarM6.b;
                tjhVar.b = 1 | tjhVar.b;
                tjhVar.c = vszVarQ2;
                tjh tjhVar2 = (tjh) vtwVarM6.r();
                if (!vtwVarV.b.A()) {
                    vtwVarV.u();
                }
                tjd tjdVar13 = (tjd) vtwVarV.b;
                tjd tjdVar14 = tjd.a;
                tjhVar2.getClass();
                tjdVar13.d = tjhVar2;
                tjdVar13.c = 41;
                break;
        }
        u((tjd) vtwVarV.r());
    }

    public final boolean k() {
        return ((Logger) this.a).isLoggable((Level) this.b);
    }

    public final void l(int i, int i2, zgk zgkVar, int i3, boolean z) {
        if (k()) {
            Object obj = this.a;
            Logger logger = (Logger) obj;
            logger.logp((Level) this.b, "io.grpc.okhttp.OkHttpFrameLogger", "logData", yfm.d(i) + " DATA: streamId=" + i2 + " endStream=" + z + " length=" + i3 + " bytes=" + w(zgkVar));
        }
    }

    public final void m(int i, int i2, yea yeaVar, zgn zgnVar) {
        if (k()) {
            Object obj = this.a;
            Object obj2 = this.b;
            String strD = yfm.d(i);
            String strValueOf = String.valueOf(yeaVar);
            int iC = zgnVar.c();
            zgk zgkVar = new zgk();
            zgkVar.J(zgnVar);
            Logger logger = (Logger) obj;
            logger.logp((Level) obj2, "io.grpc.okhttp.OkHttpFrameLogger", "logGoAway", strD + " GO_AWAY: lastStreamId=" + i2 + " errorCode=" + strValueOf + " length=" + iC + " bytes=" + w(zgkVar));
        }
    }

    public final void n(int i, long j) {
        if (k()) {
            Object obj = this.a;
            Logger logger = (Logger) obj;
            logger.logp((Level) this.b, "io.grpc.okhttp.OkHttpFrameLogger", "logPing", yfm.d(i) + " PING: ack=false bytes=" + j);
        }
    }

    public final void o(int i, int i2, yea yeaVar) {
        if (k()) {
            Object obj = this.a;
            Logger logger = (Logger) obj;
            logger.logp((Level) this.b, "io.grpc.okhttp.OkHttpFrameLogger", "logRstStream", yfm.d(i) + " RST_STREAM: streamId=" + i2 + " errorCode=" + String.valueOf(yeaVar));
        }
    }

    public final void p(int i, int i2, long j) {
        if (k()) {
            Object obj = this.a;
            Logger logger = (Logger) obj;
            logger.logp((Level) this.b, "io.grpc.okhttp.OkHttpFrameLogger", "logWindowsUpdate", yfm.d(i) + " WINDOW_UPDATE: streamId=" + i2 + " windowSizeIncrement=" + j);
        }
    }

    public final void q(int i, nue nueVar) {
        if (k()) {
            Object obj = this.a;
            Object obj2 = this.b;
            String strD = yfm.d(i);
            EnumMap enumMap = new EnumMap(yda.class);
            for (yda ydaVar : yda.values()) {
                int i2 = ydaVar.g;
                if (nueVar.f(i2)) {
                    enumMap.put((EnumMap) ydaVar, (yda) Integer.valueOf(nueVar.d(i2)));
                }
            }
            ((Logger) obj).logp((Level) obj2, "io.grpc.okhttp.OkHttpFrameLogger", "logSettings", strD + " SETTINGS: ack=false settings=" + enumMap.toString());
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.concurrent.ScheduledFuture] */
    public final void r() {
        ((xtp) this.a).b = true;
        this.b.cancel(false);
    }

    public final boolean s() {
        xtp xtpVar = (xtp) this.a;
        return (xtpVar.c || xtpVar.b) ? false : true;
    }

    public ulo(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public ulo(tvw tvwVar, tvu tvuVar) {
        this.b = tvwVar;
        this.a = tvuVar;
    }

    public ulo(int i, int i2, Consumer consumer) {
        this.a = consumer;
        vtw vtwVarM = tmv.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        tmv tmvVar = (tmv) vucVar;
        tmvVar.b |= 1;
        tmvVar.c = i;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        tmv tmvVar2 = (tmv) vtwVarM.b;
        tmvVar2.b |= 2;
        tmvVar2.d = i2;
        this.b = vtwVarM;
    }

    public ulo(Level level, Class cls) {
        Logger logger = Logger.getLogger(cls.getName());
        level.getClass();
        this.b = level;
        logger.getClass();
        this.a = logger;
    }

    public ulo(nwq nwqVar, uiz uizVar, unj unjVar) {
        this.a = nwqVar;
        ocv.aF(uizVar);
        this.b = unjVar;
        if (unjVar.a() == null) {
            Log.w("FDL", "FDL logging failed. Add a dependency for Firebase Analytics to your app to enable logging of Dynamic Link events.");
        }
    }

    public ulo(Executor executor) {
        this.b = new ir();
        this.a = executor;
    }

    public ulo(byte[] bArr) {
        yrz yrzVarR = vyf.R(0, 0, 7);
        this.b = yrzVarR;
        this.a = new yst(yrzVarR, false);
    }

    public ulo(xtk xtkVar, Object obj) {
        xtkVar.getClass();
        this.b = xtkVar;
        this.a = obj;
    }

    public ulo(xtp xtpVar, ScheduledFuture scheduledFuture) {
        this.a = xtpVar;
        scheduledFuture.getClass();
        this.b = scheduledFuture;
    }

    public ulo(Context context, tmd tmdVar, pku pkuVar) {
        Object tjrVar;
        tlx tlxVar = new tlx(this, pkuVar);
        this.b = tlxVar;
        tkm tkmVar = tmdVar.a;
        zft zftVar = new zft(tlxVar, null);
        Handler handler = new Handler();
        String scheme = tkmVar.a().getScheme();
        if (TextUtils.equals("tcp", scheme)) {
            tjrVar = new tkb(context, tkmVar, zftVar, handler);
        } else if (TextUtils.equals("bt", scheme)) {
            tjrVar = new tjn(context, tkmVar, zftVar, handler);
        } else if (TextUtils.equals("nearby", scheme)) {
            tjrVar = new tjr(context, tkmVar, zftVar, handler);
        } else {
            throw new IllegalArgumentException("Unsupported connection info");
        }
        this.a = tjrVar;
    }

    public ulo(xrz xrzVar) {
        xrzVar.getClass();
        this.a = xrzVar;
        this.b = "pick_first";
    }

    public ulo(URI uri, xsy xsyVar) {
        uri.getClass();
        this.a = uri;
        this.b = xsyVar;
    }

    public ulo(tkp tkpVar) {
        this.b = tkpVar;
        this.a = new Handler();
    }
}
