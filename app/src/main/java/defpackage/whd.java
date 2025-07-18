package defpackage;

import android.content.Context;
import android.database.Cursor;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class whd implements rog {
    private final Optional a;
    private final agow b;
    private final agow c;
    private final agow d;

    public whd(Optional optional, agow agowVar, agow agowVar2, agow agowVar3) {
        agowVar.getClass();
        agowVar2.getClass();
        agowVar3.getClass();
        this.a = optional;
        this.b = agowVar;
        this.c = agowVar2;
        this.d = agowVar3;
    }

    @Override // defpackage.rog
    public final void a() {
        this.a.isPresent();
        if (rnu.a()) {
            Object obj = ((aejh) this.d).b;
            obj.getClass();
            if (!((Boolean) agwl.a((Optional) obj, false)).booleanValue()) {
                whc whcVar = (whc) this.b.a();
                if (whcVar.c.a()) {
                    whcVar.b(true);
                    return;
                } else {
                    boolean z = whcVar.i;
                    return;
                }
            }
            final wig wigVar = (wig) this.c.a();
            Context context = wigVar.b;
            if (rnu.b() == null) {
                ((zdv) wigVar.h.d().q("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner", "runListeners", 94, "StartupAfterPackageReplacedWithRetryRunner.kt")).u("Couldn't determine current process name. Skipping startup after package replaced listeners.");
            } else {
                if (!wigVar.c.a()) {
                    boolean z2 = wigVar.i;
                    return;
                }
                zvh zvhVar = new zvh() { // from class: who
                    @Override // defpackage.zvh
                    public final zyd a() {
                        final wig wigVar2 = wigVar;
                        return mhv.b(wigVar2.b, wyo.b(new zvh() { // from class: whh
                            @Override // defpackage.zvh
                            public final zyd a() {
                                final wig wigVar3 = wigVar2;
                                uot uotVarA = wigVar3.a();
                                StringBuilder sb = new StringBuilder();
                                ArrayList arrayList = new ArrayList();
                                sb.append("SELECT * FROM AllListenersSucceededVersionTable WHERE version_code = (?)");
                                arrayList.add(Long.valueOf(wigVar3.f));
                                wzv wzvVar = new wzv(uotVarA.a(uqh.a(sb, arrayList)));
                                final agvb agvbVar = new agvb() { // from class: whn
                                    @Override // defpackage.agvb
                                    public final Object a(Object obj2, Object obj3) {
                                        uqe uqeVar = wig.a;
                                        ((zvz) obj2).getClass();
                                        return Boolean.valueOf(((Cursor) obj3).getCount() > 0);
                                    }
                                };
                                zvy zvyVar = new zvy() { // from class: whx
                                    @Override // defpackage.zvy
                                    public final Object a(zvz zvzVar, Object obj2) {
                                        uqe uqeVar = wig.a;
                                        zvzVar.getClass();
                                        return agvbVar.a(zvzVar, obj2);
                                    }
                                };
                                ExecutorService executorService = wigVar3.d;
                                wzx wzxVarD = wzvVar.b(zvyVar, executorService).d();
                                final agux aguxVar = new agux() { // from class: why
                                    @Override // defpackage.agux
                                    public final Object a(Object obj2) {
                                        Exception exc = (Exception) obj2;
                                        exc.getClass();
                                        ((zdv) ((zdv) wigVar3.h.d()).p(exc).q("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner", "didAllListenersAlreadySucceed$lambda$33", 361, "StartupAfterPackageReplacedWithRetryRunner.kt")).u("Failed to get all listeners succeeded at this version");
                                        return false;
                                    }
                                };
                                wzx wzxVarC = wzxVarD.c(Exception.class, new yqi() { // from class: whz
                                    @Override // defpackage.yqi
                                    public final Object apply(Object obj2) {
                                        uqe uqeVar = wig.a;
                                        return aguxVar.a(obj2);
                                    }
                                }, zwk.a);
                                final agux aguxVar2 = new agux() { // from class: whv
                                    @Override // defpackage.agux
                                    public final Object a(Object obj2) {
                                        Boolean bool = (Boolean) obj2;
                                        bool.getClass();
                                        if (bool.booleanValue()) {
                                            return zxy.a;
                                        }
                                        final wig wigVar4 = wigVar3;
                                        uot uotVarA2 = wigVar4.a();
                                        final wia wiaVar = new wia(wigVar4.f);
                                        zwc zwcVarC = uotVarA2.a.c();
                                        zvv zvvVarD = wyo.d(new zvv() { // from class: uos
                                            @Override // defpackage.zvv
                                            public final zwc a(zvz zvzVar, Object obj3) {
                                                final wia wiaVar2 = wiaVar;
                                                return new zwc(((upe) obj3).a(new uqj() { // from class: uoy
                                                    @Override // defpackage.uqj
                                                    public final Object a(uqk uqkVar) throws InterruptedException {
                                                        uqe uqeVar = wig.a;
                                                        StringBuilder sb2 = new StringBuilder();
                                                        ArrayList arrayList2 = new ArrayList();
                                                        sb2.append("DELETE FROM ListenerSuccessfulRuns WHERE version_code != ?");
                                                        Long lValueOf = Long.valueOf(wiaVar2.a);
                                                        arrayList2.add(lValueOf);
                                                        uqkVar.c(uqh.a(sb2, arrayList2));
                                                        StringBuilder sb3 = new StringBuilder();
                                                        ArrayList arrayList3 = new ArrayList();
                                                        sb3.append("DELETE FROM AllListenersSucceededVersionTable WHERE version_code != ?");
                                                        arrayList3.add(lValueOf);
                                                        uqkVar.c(uqh.a(sb3, arrayList3));
                                                        return null;
                                                    }
                                                }));
                                            }
                                        });
                                        zwk zwkVar = zwk.a;
                                        zwx zwxVarF = zwcVarC.e(zvvVarD, zwkVar).f();
                                        final agux aguxVar3 = new agux() { // from class: wib
                                            @Override // defpackage.agux
                                            public final Object a(Object obj3) {
                                                Exception exc = (Exception) obj3;
                                                exc.getClass();
                                                ((zdv) ((zdv) wigVar4.h.d()).p(exc).q("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner", "tryPurgeOldVersions$lambda$24", 273, "StartupAfterPackageReplacedWithRetryRunner.kt")).u("Failed to purge old versions");
                                                return zxy.a;
                                            }
                                        };
                                        zyd zydVarH = zud.h(zwxVarF, Exception.class, wyo.c(new zvi() { // from class: wic
                                            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, zyd] */
                                            @Override // defpackage.zvi
                                            public final zyd a(Object obj3) {
                                                uqe uqeVar = wig.a;
                                                return aguxVar3.a(obj3);
                                            }
                                        }), zwkVar);
                                        final agux aguxVar4 = new agux() { // from class: whp
                                            @Override // defpackage.agux
                                            public final Object a(Object obj3) {
                                                StringBuilder sb2 = new StringBuilder();
                                                ArrayList arrayList2 = new ArrayList();
                                                sb2.append("SELECT * FROM ListenerSuccessfulRuns WHERE version_code = ?");
                                                final wig wigVar5 = wigVar4;
                                                arrayList2.add(Long.valueOf(wigVar5.f));
                                                wzv wzvVar2 = new wzv(wigVar5.a().a(uqh.a(sb2, arrayList2)));
                                                final agvb agvbVar2 = new agvb() { // from class: whi
                                                    @Override // defpackage.agvb
                                                    public final Object a(Object obj4, Object obj5) {
                                                        Cursor cursor = (Cursor) obj5;
                                                        uqe uqeVar = wig.a;
                                                        ((zvz) obj4).getClass();
                                                        agrx agrxVar = new agrx(10);
                                                        while (cursor.moveToNext()) {
                                                            String string = cursor.getString(cursor.getColumnIndexOrThrow("listener_key"));
                                                            string.getClass();
                                                            agrxVar.add(string);
                                                        }
                                                        return agqq.a(agrxVar);
                                                    }
                                                };
                                                wzx wzxVarD2 = wzvVar2.b(new zvy() { // from class: whj
                                                    @Override // defpackage.zvy
                                                    public final Object a(zvz zvzVar, Object obj4) {
                                                        uqe uqeVar = wig.a;
                                                        zvzVar.getClass();
                                                        return agvbVar2.a(zvzVar, obj4);
                                                    }
                                                }, wigVar5.e).d();
                                                final agux aguxVar5 = new agux() { // from class: whk
                                                    @Override // defpackage.agux
                                                    public final Object a(Object obj4) {
                                                        Exception exc = (Exception) obj4;
                                                        exc.getClass();
                                                        ((zdv) ((zdv) wigVar5.h.d()).p(exc).q("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner", "getListenersPreviouslySucceededAtThisVersion$lambda$29", 314, "StartupAfterPackageReplacedWithRetryRunner.kt")).u("Failed to get listeners previously succeeded at this version");
                                                        return agrd.a;
                                                    }
                                                };
                                                return wzxVarD2.c(Exception.class, new yqi() { // from class: whl
                                                    @Override // defpackage.yqi
                                                    public final Object apply(Object obj4) {
                                                        uqe uqeVar = wig.a;
                                                        return aguxVar5.a(obj4);
                                                    }
                                                }, zwk.a);
                                            }
                                        };
                                        zvi zviVarC = wyo.c(new zvi() { // from class: whq
                                            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, zyd] */
                                            @Override // defpackage.zvi
                                            public final zyd a(Object obj3) {
                                                uqe uqeVar = wig.a;
                                                return aguxVar4.a(obj3);
                                            }
                                        });
                                        ExecutorService executorService2 = wigVar4.d;
                                        zyd zydVarH2 = zuz.h(zydVarH, zviVarC, executorService2);
                                        final Map map = wigVar4.j;
                                        final agux aguxVar5 = new agux() { // from class: whr
                                            @Override // defpackage.agux
                                            public final Object a(Object obj3) {
                                                List list = (List) obj3;
                                                list.getClass();
                                                Set setEntrySet = map.entrySet();
                                                ArrayList arrayList2 = new ArrayList();
                                                for (Object obj4 : setEntrySet) {
                                                    if (!list.contains(((Map.Entry) obj4).getKey())) {
                                                        arrayList2.add(obj4);
                                                    }
                                                }
                                                agrx agrxVar = new agrx(10);
                                                Iterator it = arrayList2.iterator();
                                                while (true) {
                                                    final wig wigVar5 = wigVar4;
                                                    if (!it.hasNext()) {
                                                        final List listA = agqq.a(agrxVar);
                                                        return xab.a(listA).a(new Callable() { // from class: whe
                                                            @Override // java.util.concurrent.Callable
                                                            public final Object call() {
                                                                uqe uqeVar = wig.a;
                                                                List list2 = listA;
                                                                boolean z3 = true;
                                                                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                                                    ListIterator listIterator = ((agrx) list2).listIterator(0);
                                                                    while (true) {
                                                                        if (!listIterator.hasNext()) {
                                                                            break;
                                                                        }
                                                                        Object objO = zxn.o((zyd) listIterator.next());
                                                                        objO.getClass();
                                                                        if (!((Boolean) objO).booleanValue()) {
                                                                            z3 = false;
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                return Boolean.valueOf(z3);
                                                            }
                                                        }, wigVar5.d);
                                                    }
                                                    final Map.Entry entry = (Map.Entry) it.next();
                                                    wif wifVar = new wif(entry);
                                                    zyh zyhVar = wigVar5.e;
                                                    zyd zydVarN = zxn.n(zxn.l(wyo.b(wifVar), zyhVar), 180L, TimeUnit.SECONDS, zyhVar);
                                                    vqi.c(zydVarN, "Client StartupAfterPackageReplacedListener failed for key: %s", new aawt(aaws.NO_USER_DATA, entry.getKey()));
                                                    zydVarN.getClass();
                                                    xaa xaaVarD = xab.d(zydVarN);
                                                    Callable callable = new Callable() { // from class: whf
                                                        @Override // java.util.concurrent.Callable
                                                        public final Object call() {
                                                            uqe uqeVar = wig.a;
                                                            return true;
                                                        }
                                                    };
                                                    zwk zwkVar2 = zwk.a;
                                                    zyd zydVarG = zud.g(xaaVarD.a(callable, zwkVar2), Exception.class, wyo.a(new yqi() { // from class: whg
                                                        @Override // defpackage.yqi
                                                        public final Object apply(Object obj5) {
                                                            uqe uqeVar = wig.a;
                                                            ((Exception) obj5).getClass();
                                                            return false;
                                                        }
                                                    }), zwkVar2);
                                                    final agux aguxVar6 = new agux() { // from class: wid
                                                        @Override // defpackage.agux
                                                        public final Object a(Object obj5) {
                                                            Boolean bool2 = (Boolean) obj5;
                                                            bool2.getClass();
                                                            if (!bool2.booleanValue()) {
                                                                return zxn.h(false);
                                                            }
                                                            Map.Entry entry2 = entry;
                                                            wig wigVar6 = wigVar5;
                                                            String str = (String) entry2.getKey();
                                                            str.getClass();
                                                            uot uotVarA3 = wigVar6.a();
                                                            StringBuilder sb2 = new StringBuilder();
                                                            ArrayList arrayList3 = new ArrayList();
                                                            sb2.append("INSERT INTO ListenerSuccessfulRuns (listener_key, version_code) VALUES (?, ?)");
                                                            arrayList3.add(str);
                                                            arrayList3.add(Long.valueOf(wigVar6.f));
                                                            zyd zydVarB = uotVarA3.b(uqh.a(sb2, arrayList3));
                                                            zydVarB.getClass();
                                                            return zuz.h(zydVarB, wyo.c(new zvi() { // from class: whm
                                                                @Override // defpackage.zvi
                                                                public final zyd a(Object obj6) {
                                                                    uqe uqeVar = wig.a;
                                                                    return zxn.h(true);
                                                                }
                                                            }), wigVar6.d);
                                                        }
                                                    };
                                                    agrxVar.add(zuz.h(zydVarG, wyo.c(new zvi() { // from class: wie
                                                        /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, zyd] */
                                                        @Override // defpackage.zvi
                                                        public final zyd a(Object obj5) {
                                                            uqe uqeVar = wig.a;
                                                            return aguxVar6.a(obj5);
                                                        }
                                                    }), wigVar5.d));
                                                }
                                            }
                                        };
                                        zyd zydVarH3 = zuz.h(zydVarH2, wyo.c(new zvi() { // from class: whs
                                            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, zyd] */
                                            @Override // defpackage.zvi
                                            public final zyd a(Object obj3) {
                                                uqe uqeVar = wig.a;
                                                return aguxVar5.a(obj3);
                                            }
                                        }), executorService2);
                                        final agux aguxVar6 = new agux() { // from class: wht
                                            @Override // defpackage.agux
                                            public final Object a(Object obj3) {
                                                Boolean bool2 = (Boolean) obj3;
                                                bool2.getClass();
                                                if (!bool2.booleanValue()) {
                                                    return zxy.a;
                                                }
                                                uot uotVarA3 = wigVar4.a();
                                                StringBuilder sb2 = new StringBuilder();
                                                ArrayList arrayList2 = new ArrayList();
                                                sb2.append("INSERT INTO AllListenersSucceededVersionTable (version_code) VALUES (?)");
                                                arrayList2.add(Long.valueOf(r6.f));
                                                zyd zydVarB = uotVarA3.b(uqh.a(sb2, arrayList2));
                                                zydVarB.getClass();
                                                return zydVarB;
                                            }
                                        };
                                        return zuz.h(zydVarH3, wyo.c(new zvi() { // from class: whu
                                            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, zyd] */
                                            @Override // defpackage.zvi
                                            public final zyd a(Object obj3) {
                                                uqe uqeVar = wig.a;
                                                return aguxVar6.a(obj3);
                                            }
                                        }), executorService2);
                                    }
                                };
                                return zuz.h(wzxVarC, wyo.c(new zvi() { // from class: whw
                                    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, zyd] */
                                    @Override // defpackage.zvi
                                    public final zyd a(Object obj2) {
                                        uqe uqeVar = wig.a;
                                        return aguxVar2.a(obj2);
                                    }
                                }), executorService);
                            }
                        }), wigVar2.e);
                    }
                };
                vqi.c(zxn.l(wyo.b(zvhVar), wigVar.e), "StartupAfterPackageReplacedListenerWithRetryRunner infrastructure failure.", new Object[0]);
            }
        }
    }
}
