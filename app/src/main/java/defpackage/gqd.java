package defpackage;

import android.app.usage.UsageStats;
import android.app.usage.UsageStatsManager;
import j$.time.Instant;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gqd extends agtu implements agvb {
    int a;
    final /* synthetic */ gqe b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqd(gqe gqeVar, agsw agswVar) {
        super(2, agswVar);
        this.b = gqeVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gqd) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            gqe gqeVar = this.b;
            if (gqeVar.d.checkSelfPermission("android.permission.PACKAGE_USAGE_STATS") != 0) {
                ((zdv) gqe.a.b().q("com/google/android/apps/tvsearch/ondevice/sources/UsageStatsTask$run$2", "invokeSuspend", 62, "UsageStatsTask.kt")).u("Not granted android.permission.PACKAGE_USAGE_STATS");
                return agpu.a;
            }
            Instant instantA = ((ztw) gqeVar.e.a()).a();
            instantA.getClass();
            Map<String, UsageStats> mapQueryAndAggregateUsageStats = ((UsageStatsManager) gqeVar.f.a()).queryAndAggregateUsageStats(instantA.minus(gqe.b).toEpochMilli(), instantA.toEpochMilli());
            mapQueryAndAggregateUsageStats.getClass();
            final List listB = agxv.b(new agyk(agxv.c(new agyf(new agyk(new agxn(agqq.C(mapQueryAndAggregateUsageStats.entrySet()), true, new agux() { // from class: gpz
                @Override // defpackage.agux
                public final Object a(Object obj2) {
                    return Boolean.valueOf(((String) ((Map.Entry) obj2).getKey()).length() > 0);
                }
            }), new agux() { // from class: gqa
                @Override // defpackage.agux
                public final Object a(Object obj2) {
                    Map.Entry entry = (Map.Entry) obj2;
                    String str = (String) entry.getKey();
                    UsageStats usageStats = (UsageStats) entry.getValue();
                    long totalTimeInForeground = usageStats.getTotalTimeInForeground() + usageStats.getLastTimeUsed();
                    zdy zdyVar = gqe.a;
                    usageStats.getTotalTimeInForeground();
                    usageStats.getLastTimeUsed();
                    return new gpy(str, totalTimeInForeground);
                }
            }), new gqc()), 30), new agux() { // from class: gqb
                @Override // defpackage.agux
                public final Object a(Object obj2) {
                    return ((gpy) obj2).a;
                }
            }));
            fiu fiuVar = (fiu) gqeVar.c.a();
            this.a = 1;
            Object objB = fiuVar.e.b(new agux() { // from class: fhu
                @Override // defpackage.agux
                public final Object a(Object obj2) {
                    fnp fnpVar = (fnp) obj2;
                    fic ficVar = fiu.a;
                    fnpVar.getClass();
                    fnd fndVar = fnpVar.c;
                    if (fndVar == null) {
                        fndVar = fnd.a;
                    }
                    List list = listB;
                    if (agvy.c(fndVar.d, list)) {
                        return fnpVar;
                    }
                    fno fnoVar = new fno();
                    fnoVar.B(fnpVar);
                    fnd fndVarA = fnq.a(fnoVar);
                    fmv fmvVar = new fmv();
                    fmvVar.B(fndVarA);
                    fne.c(fmvVar);
                    if ((fmvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        fmvVar.y();
                    }
                    ((fnd) fmvVar.b).d = abzb.b;
                    fne.c(fmvVar);
                    if ((fmvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        fmvVar.y();
                    }
                    fnd fndVar2 = (fnd) fmvVar.b;
                    abxs abxsVar = fndVar2.d;
                    if (!abxsVar.c()) {
                        int size = abxsVar.size();
                        fndVar2.d = abxsVar.d(size + size);
                    }
                    abus.m(list, fndVar2.d);
                    fnd fndVarA2 = fne.a(fmvVar);
                    if ((fnoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        fnoVar.y();
                    }
                    fnp fnpVar2 = (fnp) fnoVar.b;
                    fnpVar2.c = fndVarA2;
                    fnpVar2.b |= 1;
                    return fnq.c(fnoVar);
                }
            }, this);
            if (objB != agtgVar) {
                objB = agpu.a;
            }
            if (objB == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gqd(this.b, agswVar);
    }
}
