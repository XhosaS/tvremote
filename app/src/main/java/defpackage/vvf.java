package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.util.Log;
import com.google.apps.tiktok.contrib.work.TikTokListenableWorker;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vvf implements vtm {
    public final vtz a;
    public final Executor b;
    private final Context c;
    private final Map d;
    private final yqt e;
    private final vtv f;

    public vvf(Context context, vtz vtzVar, Map map, Executor executor, yqt yqtVar, vtv vtvVar) {
        this.c = context;
        this.a = vtzVar;
        this.d = map;
        this.b = executor;
        this.e = yqtVar;
        this.f = vtvVar;
    }

    private final cca g(vts vtsVar) {
        vtc vtcVar = (vtc) vtsVar;
        yqw.L(!vtcVar.g.g());
        cbz cbzVar = new cbz(TikTokListenableWorker.class);
        cbzVar.c.l = vtcVar.b;
        vte vteVar = (vte) vtcVar.d;
        cbzVar.c(vteVar.a, vteVar.b);
        cbzVar.c.g = vtcVar.f;
        j(vtsVar, cbzVar);
        return (cca) cbzVar.b();
    }

    private final ccl h(vts vtsVar, vtq vtqVar, yqt yqtVar) {
        vtc vtcVar = (vtc) vtsVar;
        yqw.L(vtcVar.g.g());
        if (yqtVar.g()) {
            vte vteVar = (vte) vtqVar;
            cck cckVar = new cck(TikTokListenableWorker.class, vteVar.a, vteVar.b, ((vte) yqtVar.c()).a, ((vte) yqtVar.c()).b);
            j(vtsVar, cckVar);
            cckVar.c.l = vtcVar.b;
            vte vteVar2 = (vte) vtcVar.d;
            cckVar.c(vteVar2.a, vteVar2.b);
            return (ccl) cckVar.b();
        }
        vte vteVar3 = (vte) vtqVar;
        cck cckVar2 = new cck(TikTokListenableWorker.class, vteVar3.a, vteVar3.b);
        j(vtsVar, cckVar2);
        cckVar2.c.l = vtcVar.b;
        vte vteVar4 = (vte) vtcVar.d;
        cckVar2.c(vteVar4.a, vteVar4.b);
        return (ccl) cckVar2.b();
    }

    private final String i(Class cls) {
        String str = (String) this.d.get(cls);
        cls.toString();
        str.getClass();
        return str;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Map] */
    private final void j(vts vtsVar, ccv ccvVar) {
        vtc vtcVar = (vtc) vtsVar;
        zdl it = vtcVar.i.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            str.getClass();
            ccvVar.d.add(str);
        }
        yqt yqtVar = vtcVar.j;
        if (yqtVar.g()) {
            yqt yqtVar2 = vtcVar.k;
            if (yqtVar2.g()) {
                vte vteVar = (vte) yqtVar2.c();
                long j = vteVar.a;
                TimeUnit timeUnit = vteVar.b;
                Object objC = yqtVar.c();
                ccvVar.a = true;
                cld cldVar = ccvVar.c;
                cldVar.n = (cah) objC;
                long millis = timeUnit.toMillis(j);
                if (millis > 18000000) {
                    cbx.c();
                    Log.w(cld.b, "Backoff delay duration exceeds maximum value");
                }
                if (millis < 10000) {
                    cbx.c();
                    Log.w(cld.b, "Backoff delay duration less than minimum value");
                }
                cldVar.o = agwz.a(millis, 10000L, 18000000L);
            }
        }
        yqt yqtVar3 = vtcVar.e;
        if (yqtVar3.g() && (ccvVar instanceof cck)) {
            cck cckVar = (cck) ccvVar;
            long jLongValue = ((Long) yqtVar3.c()).longValue();
            if (jLongValue == Long.MAX_VALUE) {
                throw new IllegalArgumentException("Cannot set Long.MAX_VALUE as the schedule override time");
            }
            cld cldVar2 = cckVar.c;
            cldVar2.v = jLongValue;
            cldVar2.w = 1;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        cav.b(vtcVar.f, linkedHashMap);
        yqt yqtVar4 = vtcVar.l;
        if (yqtVar4.g()) {
            ComponentName componentName = (ComponentName) ((yqz) this.e).a.get(yqtVar4.c());
            linkedHashMap.put("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", componentName.getPackageName());
            linkedHashMap.put("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", componentName.getClassName());
        }
        ccvVar.c.g = cav.a(linkedHashMap);
        String strI = i(vtcVar.a);
        int length = strI.length();
        int i = vwd.c;
        ccvVar.c.y = "TikTokWorker#".concat(String.valueOf(strI.substring(Math.max(0, length - 114))));
    }

    @Override // defpackage.vtm
    public final zyd a(String str) {
        return ((vwc) this.f).d(this.a.b(str), new zvi() { // from class: vvx
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                return ((vtn) obj).a();
            }
        });
    }

    @Override // defpackage.vtm
    public final zyd b(UUID uuid) {
        return this.f.b(this.a.c(uuid));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.vtm
    public final zyd c(vts vtsVar) {
        Boolean bool = false;
        bool.getClass();
        vwd.c(vtsVar);
        vtc vtcVar = (vtc) vtsVar;
        yqt yqtVar = vtcVar.l;
        if (yqtVar.g()) {
            yqw.M(!((String) yqtVar.c()).equals(this.c.getPackageName()), "Default process must be targeted using shorthand '' empty string, not the package name.");
            yqw.M(false, "You must depend upon //java/com/google/apps/tiktok/contrib/work/impl:multiprocess_module in order to use .setTargetProcess");
            yqw.R(((yqz) this.e).a.containsKey(yqtVar.c()), "You must generate remote worker services using java/com/google/apps/tiktok/contrib/work/codegen/generated_remote_worker_service.bzl before targeting them by process name and include the service target in every scheduling process's dagger deps. Could not find [%s]", yqtVar.c());
            yqw.B(Collections.disjoint(vtcVar.f.b().keySet(), yzq.r("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", "androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", "androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME")), "You may not specify RemoteListenableWorker arguments at the same time as TikTok's targetProcess feature.");
        }
        return this.f.a(f(e(vtsVar)));
    }

    @Override // defpackage.vtm
    public final zyd d(String str) {
        return zuz.g(this.a.e(ccu.a.b(str)), new yqi() { // from class: vvb
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                int i = yyk.e;
                yyf yyfVar = new yyf(4);
                for (ccr ccrVar : (List) obj) {
                    if (!ccrVar.c.contains("tiktok_account_work")) {
                        yyfVar.g(ccrVar);
                    }
                }
                return yyfVar.f();
            }
        }, this.b);
    }

    final vts e(vts vtsVar) {
        String strI = i(((vtc) vtsVar).a);
        int i = vwd.c;
        return vtsVar.o(new zdd("TikTokWorker#".concat(strI)));
    }

    final zyd f(vts vtsVar) {
        vtc vtcVar = (vtc) vtsVar;
        yqt yqtVar = vtcVar.g;
        int i = 1;
        if (yqtVar.g()) {
            yqw.L(yqtVar.g());
            yqt yqtVar2 = vtcVar.h;
            if (yqtVar2.g()) {
                yqw.L(yqtVar.g());
                yqw.L(yqtVar2.g());
                final ccl cclVarH = h(vtsVar, ((vtd) yqtVar.c()).a, ((vtd) yqtVar.c()).b);
                return zuz.g(this.a.g(((vtf) yqtVar2.c()).a, ((vtf) yqtVar2.c()).b, cclVarH), new yqi() { // from class: vvc
                    @Override // defpackage.yqi
                    public final Object apply(Object obj) {
                        return cclVarH.a;
                    }
                }, zwk.a);
            }
            yqw.L(yqtVar.g());
            yqw.L(!yqtVar2.g());
            final ccl cclVarH2 = h(vtsVar, ((vtd) yqtVar.c()).a, ((vtd) yqtVar.c()).b);
            return zuz.g(this.a.d(cclVarH2), new yqi() { // from class: vve
                @Override // defpackage.yqi
                public final Object apply(Object obj) {
                    return cclVarH2.a;
                }
            }, zwk.a);
        }
        yqw.L(!yqtVar.g());
        yqt yqtVar3 = vtcVar.h;
        if (!yqtVar3.g()) {
            yqw.L(!yqtVar.g());
            yqw.L(!yqtVar3.g());
            final cca ccaVarG = g(vtsVar);
            return zuz.g(this.a.d(ccaVarG), new yqi() { // from class: vuz
                @Override // defpackage.yqi
                public final Object apply(Object obj) {
                    return ccaVarG.a;
                }
            }, zwk.a);
        }
        yqw.L(!yqtVar.g());
        yqw.L(yqtVar3.g());
        final cca ccaVarG2 = g(vtsVar);
        vtz vtzVar = this.a;
        String str = ((vtf) yqtVar3.c()).a;
        int i2 = ((vtf) yqtVar3.c()).b - 1;
        if (i2 != 0) {
            if (i2 == 1) {
                i = 2;
            } else if (i2 != 3) {
                throw new IllegalArgumentException("One-time unique work does not support ExistingPeriodicWorkPolicy UPDATE. Use CANCEL_AND_REENQUEUE or KEEP instead");
            }
        }
        return zuz.g(vtzVar.h(str, i, ccaVarG2), new yqi() { // from class: vuy
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return ccaVarG2.a;
            }
        }, zwk.a);
    }
}
