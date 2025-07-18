package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import io.grpc.Status;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ozi implements owx, oxr {
    public static final oza a = new oza();
    public static final zdy b = zdy.h("com/google/android/libraries/home/homegraph/foyer/FoyerHomeGraph");
    private final pad A;
    private boolean B;
    public final ozx c;
    public final Executor d;
    public final oxs e;
    public final String f;
    public boolean h;
    public final oxp i;
    public List k;
    public List l;
    public List m;
    public List n;
    public String o;
    public List p;
    public abgi q;
    public owv r;
    public boolean s;
    public String t;
    public boolean u;
    public final Optional v;
    private final Context w;
    private final ozr x;
    private final Optional y;
    private final agte z;
    public final Set g = new CopyOnWriteArraySet();
    public final oxp j = new ozo(this, null);

    public ozi(oym oymVar, Context context, ozx ozxVar, ozr ozrVar, Executor executor, oxs oxsVar, Optional optional, Optional optional2, agte agteVar, pad padVar, String str) {
        this.w = context;
        this.c = ozxVar;
        this.x = ozrVar;
        this.d = executor;
        this.e = oxsVar;
        this.y = optional2;
        this.z = agteVar;
        this.A = padVar;
        this.f = str;
        this.i = new ozp(this, oymVar);
        agrd agrdVar = agrd.a;
        this.k = agrdVar;
        this.l = agrdVar;
        this.m = agrdVar;
        this.n = agrdVar;
        this.p = agrdVar;
        abgi abgiVar = abgi.a;
        abgiVar.getClass();
        this.q = abgiVar;
        this.v = optional;
        ahbu.b(agteVar);
        oxsVar.c(this);
        oyz oyzVar = new oyz(this);
        IntentFilter intentFilter = new IntentFilter("ApplicationState.CHANGED");
        intentFilter.addCategory("app_visibility");
        bfs bfsVarA = bfs.a(context);
        synchronized (bfsVarA.a) {
            bfr bfrVar = new bfr(intentFilter, oyzVar);
            ArrayList arrayList = (ArrayList) bfsVarA.a.get(oyzVar);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                bfsVarA.a.put(oyzVar, arrayList);
            }
            arrayList.add(bfrVar);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList arrayList2 = (ArrayList) bfsVarA.b.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    bfsVarA.b.put(action, arrayList2);
                }
                arrayList2.add(bfrVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object s(defpackage.ozi r4, defpackage.oxg r5, defpackage.agsw r6) {
        /*
            boolean r0 = r6 instanceof defpackage.ozb
            if (r0 == 0) goto L13
            r0 = r6
            ozb r0 = (defpackage.ozb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ozb r0 = new ozb
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.agpl.b(r6)
            goto L82
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.agpl.b(r6)
            r0.c = r3
            ahar r6 = new ahar
            agsw r0 = defpackage.agth.c(r0)
            r6.<init>(r0, r3)
            r6.z()
            boolean r0 = r4.s
            if (r0 == 0) goto L4f
            ypn r4 = defpackage.ypn.DATA_SOURCE_UNKNOWN
            agpk r5 = new agpk
            r5.<init>(r4)
            r6.e(r5)
            goto L7b
        L4f:
            ozd r0 = new ozd
            r0.<init>(r4, r6)
            ozc r2 = new ozc
            r2.<init>(r4, r0)
            r6.a(r2)
            r4.i(r0)
            r4.j(r5)
            boolean r5 = r4.s
            if (r5 == 0) goto L7b
            r4.k(r0)
            agzy r4 = r6.d
            java.lang.Object r4 = r4.a
            boolean r4 = r4 instanceof defpackage.ahed
            if (r4 == 0) goto L7b
            ypn r4 = defpackage.ypn.DATA_SOURCE_UNKNOWN
            agpk r5 = new agpk
            r5.<init>(r4)
            r6.e(r5)
        L7b:
            java.lang.Object r6 = r6.m()
            if (r6 != r1) goto L82
            return r1
        L82:
            agpk r6 = (defpackage.agpk) r6
            java.lang.Object r4 = r6.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ozi.s(ozi, oxg, agsw):java.lang.Object");
    }

    @Override // defpackage.owx
    public final owl a() {
        owl owlVarB = null;
        if (!this.s) {
            ((zdv) b.a(pai.a).q("com/google/android/libraries/home/homegraph/foyer/FoyerHomeGraph", "getCurrentHome", 918, "FoyerHomeGraph.kt")).u("Refresh homes before calling this");
            return null;
        }
        String string = this.x.a.getString(pae.a("current_home_id", this.f), null);
        if (string != null && string.length() != 0) {
            owlVarB = b(string);
        }
        if (owlVarB == null) {
            ((zdv) b.d().q("com/google/android/libraries/home/homegraph/foyer/FoyerHomeGraph", "getCurrentHome", 930, "FoyerHomeGraph.kt")).x("Could not find home with ID: %s", string);
        }
        Set setG = g();
        if (owlVarB != null || setG.isEmpty()) {
            return owlVarB;
        }
        Iterator it = setG.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            String strC = ((owl) next).c();
            do {
                Object next2 = it.next();
                String strC2 = ((owl) next2).c();
                int iCompareTo = strC.compareTo(strC2);
                if (iCompareTo > 0) {
                    strC = strC2;
                }
                if (iCompareTo > 0) {
                    next = next2;
                }
            } while (it.hasNext());
        }
        owl owlVar = (owl) next;
        l(owlVar);
        return owlVar;
    }

    @Override // defpackage.owx
    public final owl b(String str) {
        if (!this.s) {
            ((zdv) b.a(pai.a).q("com/google/android/libraries/home/homegraph/foyer/FoyerHomeGraph", "getHome", 960, "FoyerHomeGraph.kt")).u("Refresh homes before calling this");
        }
        return (owl) this.i.get(str);
    }

    @Override // defpackage.owx
    public final own c(final String str) {
        Object next;
        Object obj = null;
        if (str == null || str.length() == 0) {
            ((zdv) b.a(pai.a).q("com/google/android/libraries/home/homegraph/foyer/FoyerHomeGraph", "findDeviceByCastId", 1064, "FoyerHomeGraph.kt")).u("findDeviceByCastId: Empty cast ID");
            return null;
        }
        agux aguxVar = new agux() { // from class: oyt
            @Override // defpackage.agux
            public final Object a(Object obj2) {
                own ownVar = (own) obj2;
                ownVar.getClass();
                return Boolean.valueOf(agvy.c(ownVar.e(), str));
            }
        };
        agxo agxoVar = new agxo(new agxp(agqq.C(this.i.d()), agye.a));
        while (true) {
            if (!agxoVar.hasNext()) {
                next = null;
                break;
            }
            next = agxoVar.next();
            if (((Boolean) aguxVar.a(next)).booleanValue()) {
                break;
            }
        }
        oyl oylVar = (oyl) next;
        if (oylVar != null) {
            return oylVar;
        }
        Iterator it = this.j.d().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next2 = it.next();
            if (((Boolean) aguxVar.a(next2)).booleanValue()) {
                obj = next2;
                break;
            }
        }
        return (own) obj;
    }

    @Override // defpackage.owx
    public final owv d(final oxg oxgVar, final owj owjVar) {
        oxgVar.getClass();
        final String string = Locale.getDefault().toString();
        string.getClass();
        abxk abxkVar = abgm.a;
        final abgn abgnVar = new abgn(new abgl());
        abgl abglVar = abgnVar.a;
        if ((abglVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abglVar.y();
        }
        ((abgm) abglVar.b).i = true;
        if ((abglVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abglVar.y();
        }
        ((abgm) abglVar.b).e = true;
        Optional optional = this.y;
        final agux aguxVar = new agux() { // from class: oyx
            @Override // defpackage.agux
            public final Object a(Object obj) {
                oxq oxqVar = (oxq) obj;
                oxqVar.getClass();
                boolean zC = oxqVar.c();
                abgl abglVar2 = abgnVar.a;
                if ((abglVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    abglVar2.y();
                }
                abgm abgmVar = (abgm) abglVar2.b;
                abxk abxkVar2 = abgm.a;
                abgmVar.f = zC;
                boolean zD = oxqVar.d();
                if ((abglVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    abglVar2.y();
                }
                ((abgm) abglVar2.b).j = zD;
                boolean zB = oxqVar.b();
                if ((abglVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    abglVar2.y();
                }
                abgm abgmVar2 = (abgm) abglVar2.b;
                abgmVar2.k = zB;
                new abxl(abgmVar2.l, abgm.a);
                List listA = oxqVar.a();
                listA.getClass();
                abglVar2.a(listA);
                boolean zE = oxqVar.e();
                if ((abglVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    abglVar2.y();
                }
                ((abgm) abglVar2.b).g = zE;
                return agpu.a;
            }
        };
        optional.ifPresent(new Consumer() { // from class: oyy
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                aguxVar.a(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        if (aeqy.c() || aerq.c()) {
            abgg abggVarA = oxf.a();
            if ((abglVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                abglVar.y();
            }
            abgm abgmVar = (abgm) abglVar.b;
            abgmVar.h = abggVarA;
            abgmVar.c |= 1;
        }
        boolean zC = agvy.c(string, this.o);
        String str = this.t;
        if (str != null && str.length() != 0 && zC) {
            if ((abglVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                abglVar.y();
            }
            ((abgm) abglVar.b).d = str;
        }
        abxd abxdVarV = abglVar.v();
        abxdVarV.getClass();
        return this.e.e(this.f, abhs.a(), new owj() { // from class: oyo
            @Override // defpackage.owj
            public final void a(Status status, Object obj) {
                Void r8 = (Void) obj;
                status.getClass();
                if (!status.e()) {
                    ozi oziVar = this.a;
                    ((zdv) ((zdv) ozi.b.c()).p(status.o).q("com/google/android/libraries/home/homegraph/foyer/FoyerHomeGraph", "refreshHomeGraph$lambda$13", 553, "FoyerHomeGraph.kt")).u("GetHomeGraph Failed when refreshing");
                    Iterator it = oziVar.g.iterator();
                    while (it.hasNext()) {
                        ((owu) it.next()).t(status);
                    }
                }
                owjVar.a(status, r8);
            }
        }, (abgm) abxdVarV, new Function() { // from class: oyp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo116andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                abgq abgqVar = (abgq) obj;
                abgqVar.getClass();
                ozi oziVar = this.a;
                oziVar.s = true;
                oziVar.z(abgqVar);
                oziVar.o = string;
                return null;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, aerh.b());
    }

    @Override // defpackage.owx
    public final Object e(oxg oxgVar, agsw agswVar) {
        return s(this, oxgVar, agswVar);
    }

    @Override // defpackage.owx
    public final /* synthetic */ String f() {
        owl owlVarA = a();
        if (owlVarA != null) {
            return owlVarA.b();
        }
        return null;
    }

    @Override // defpackage.owx
    public final Set g() {
        if (!this.s) {
            ((zdv) b.a(pai.a).q("com/google/android/libraries/home/homegraph/foyer/FoyerHomeGraph", "getHomes", 775, "FoyerHomeGraph.kt")).u("Refresh homes before calling this");
        }
        return agqq.A(this.i.d());
    }

    @Override // defpackage.owx
    public final ahgr h() {
        return new ahhg(new ozh(this, null), new ahgm(new ozg(this, null)));
    }

    @Override // defpackage.owx
    public final void i(owu owuVar) {
        this.g.add(owuVar);
    }

    @Override // defpackage.owx
    public final void j(oxg oxgVar) {
        int i;
        oxgVar.getClass();
        if (this.s || this.r != null || this.A.b()) {
            return;
        }
        long epochMilli = Instant.now().toEpochMilli();
        long j = 0;
        long j2 = this.c.a.getLong(pae.a("home_graph_last_refreshed", this.f), 0L);
        if (j2 == 0) {
            i = 2;
        } else {
            j = epochMilli - j2;
            i = j < Duration.ofHours(aerk.a.eV().a()).toMillis() ? 3 : 4;
        }
        int i2 = i;
        if (i2 == 3) {
            x(oxgVar, null, 3, j);
        } else {
            w(oxgVar, false, i2, j);
        }
    }

    @Override // defpackage.owx
    public final void k(owu owuVar) {
        owuVar.getClass();
        this.g.remove(owuVar);
    }

    @Override // defpackage.owx
    public final void l(owl owlVar) {
        if (owlVar == null) {
            ((zdv) b.d().q("com/google/android/libraries/home/homegraph/foyer/FoyerHomeGraph", "setCurrentHome", 942, "FoyerHomeGraph.kt")).u("Setting currentHome to null");
        }
        this.x.a.edit().putString(pae.a("current_home_id", this.f), owlVar != null ? owlVar.b() : null).apply();
        this.B = true;
        t();
    }

    @Override // defpackage.owx
    public final boolean m() {
        return this.s;
    }

    @Override // defpackage.owx
    public final owv n(String str, final owj owjVar) {
        if (!this.s) {
            ((zdv) b.a(pai.a).q("com/google/android/libraries/home/homegraph/foyer/FoyerHomeGraph", "createHome", 1175, "FoyerHomeGraph.kt")).u("Refresh homes before calling this");
        }
        abhn abhnVar = abhn.a;
        abhm abhmVar = new abhm();
        if ((abhmVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abhmVar.y();
        }
        ((abhn) abhmVar.b).c = str;
        abhn abhnVarA = abho.a(abhmVar);
        oxg oxgVar = oxg.CREATE_HOME;
        afil afilVarA = abhs.a;
        if (afilVarA == null) {
            synchronized (abhs.class) {
                afilVarA = abhs.a;
                if (afilVarA == null) {
                    afii afiiVarC = afil.c();
                    afiiVarC.c = afik.UNARY;
                    afiiVarC.d = afil.b("google.internal.home.foyer.v1.StructuresService", "CreateStructure");
                    afiiVarC.e = true;
                    abfr abfrVar = abfr.a;
                    ExtensionRegistryLite extensionRegistryLite = agea.a;
                    afiiVarC.a = new agdz(abfrVar);
                    afiiVarC.b = new agdz(abhn.a);
                    afilVarA = afiiVarC.a();
                    abhs.a = afilVarA;
                }
            }
        }
        owj owjVar2 = new owj() { // from class: oyv
            @Override // defpackage.owj
            public final void a(Status status, Object obj) {
                oyi oyiVarQ;
                abhn abhnVar2 = (abhn) obj;
                status.getClass();
                if (!status.e() || abhnVar2 == null) {
                    ((zdv) ozi.b.d().q("com/google/android/libraries/home/homegraph/foyer/FoyerHomeGraph", "createHome$lambda$71", 1192, "FoyerHomeGraph.kt")).u("Failed to create structure.");
                    oyiVarQ = null;
                } else {
                    ozi oziVar = this.a;
                    String str2 = abhnVar2.b;
                    str2.getClass();
                    oyiVarQ = oziVar.q(str2);
                    oziVar.l(oyiVarQ);
                }
                owjVar.a(status, oyiVarQ);
            }
        };
        abfr abfrVar2 = abfr.a;
        abfq abfqVar = new abfq();
        if ((Integer.MIN_VALUE & abfqVar.b.memoizedSerializedSize) == 0) {
            abfqVar.y();
        }
        abfr abfrVar3 = (abfr) abfqVar.b;
        abfrVar3.c = abhnVarA;
        abfrVar3.b |= 1;
        abxd abxdVarV = abfqVar.v();
        abxdVarV.getClass();
        return p(oxgVar, afilVarA, owjVar2, (abfr) abxdVarV);
    }

    @Override // defpackage.oxr
    public final void o(MessageLite messageLite, afil afilVar) {
        messageLite.getClass();
        afilVar.getClass();
        if (!(messageLite instanceof abgq) || !((abgq) messageLite).f) {
            if (this.u) {
                return;
            }
            this.c.a(this.f);
            return;
        }
        Optional optional = this.v;
        if (optional.isPresent()) {
            ((zdv) b.b().q("com/google/android/libraries/home/homegraph/foyer/FoyerHomeGraph", "onRpcSucceeded", 1308, "FoyerHomeGraph.kt")).x("Logging result of method: %s", afilVar.b);
            ozu ozuVar = (ozu) optional.get();
            r();
            ozuVar.a();
        }
        this.u = true;
        u();
        t();
    }

    public final owv p(oxg oxgVar, afil afilVar, owj owjVar, MessageLite messageLite) {
        oxgVar.getClass();
        return v(oxgVar, afilVar, owjVar, messageLite, "oauth2:https://www.googleapis.com/auth/homegraph", aerh.b());
    }

    public final oyi q(String str) {
        return (oyi) this.i.get(str);
    }

    public final ozw r() {
        ozw ozwVar = ozw.a;
        ozv ozvVar = new ozv();
        DesugarCollections.unmodifiableList(((ozw) ozvVar.b).c).getClass();
        oza ozaVar = a;
        List listA = ozaVar.a(this.i);
        if ((ozvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ozvVar.y();
        }
        ozw ozwVar2 = (ozw) ozvVar.b;
        abxs abxsVar = ozwVar2.c;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            ozwVar2.c = abxsVar.d(size + size);
        }
        abus.m(listA, ozwVar2.c);
        DesugarCollections.unmodifiableList(((ozw) ozvVar.b).d).getClass();
        List listA2 = ozaVar.a(this.j);
        if ((ozvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ozvVar.y();
        }
        ozw ozwVar3 = (ozw) ozvVar.b;
        abxs abxsVar2 = ozwVar3.d;
        if (!abxsVar2.c()) {
            int size2 = abxsVar2.size();
            ozwVar3.d = abxsVar2.d(size2 + size2);
        }
        abus.m(listA2, ozwVar3.d);
        DesugarCollections.unmodifiableList(((ozw) ozvVar.b).k).getClass();
        List list = this.n;
        list.getClass();
        if ((ozvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ozvVar.y();
        }
        ozw ozwVar4 = (ozw) ozvVar.b;
        abxs abxsVar3 = ozwVar4.k;
        if (!abxsVar3.c()) {
            int size3 = abxsVar3.size();
            ozwVar4.k = abxsVar3.d(size3 + size3);
        }
        abus.m(list, ozwVar4.k);
        DesugarCollections.unmodifiableList(((ozw) ozvVar.b).e).getClass();
        List list2 = this.k;
        list2.getClass();
        if ((ozvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ozvVar.y();
        }
        ozw ozwVar5 = (ozw) ozvVar.b;
        abxs abxsVar4 = ozwVar5.e;
        if (!abxsVar4.c()) {
            int size4 = abxsVar4.size();
            ozwVar5.e = abxsVar4.d(size4 + size4);
        }
        abus.m(list2, ozwVar5.e);
        DesugarCollections.unmodifiableList(((ozw) ozvVar.b).j).getClass();
        List list3 = this.p;
        list3.getClass();
        if ((ozvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ozvVar.y();
        }
        ozw ozwVar6 = (ozw) ozvVar.b;
        abxs abxsVar5 = ozwVar6.j;
        if (!abxsVar5.c()) {
            int size5 = abxsVar5.size();
            ozwVar6.j = abxsVar5.d(size5 + size5);
        }
        abus.m(list3, ozwVar6.j);
        DesugarCollections.unmodifiableList(((ozw) ozvVar.b).f).getClass();
        List list4 = this.l;
        list4.getClass();
        if ((ozvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ozvVar.y();
        }
        ozw ozwVar7 = (ozw) ozvVar.b;
        abxs abxsVar6 = ozwVar7.f;
        if (!abxsVar6.c()) {
            int size6 = abxsVar6.size();
            ozwVar7.f = abxsVar6.d(size6 + size6);
        }
        abus.m(list4, ozwVar7.f);
        abgi abgiVar = this.q;
        abgiVar.getClass();
        if ((ozvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ozvVar.y();
        }
        ozw ozwVar8 = (ozw) ozvVar.b;
        ozwVar8.l = abgiVar;
        ozwVar8.b |= 1;
        DesugarCollections.unmodifiableList(ozwVar8.g).getClass();
        List list5 = this.m;
        list5.getClass();
        if ((ozvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ozvVar.y();
        }
        ozw ozwVar9 = (ozw) ozvVar.b;
        abxs abxsVar7 = ozwVar9.g;
        if (!abxsVar7.c()) {
            int size7 = abxsVar7.size();
            ozwVar9.g = abxsVar7.d(size7 + size7);
        }
        abus.m(list5, ozwVar9.g);
        boolean z = this.h;
        if ((ozvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ozvVar.y();
        }
        ((ozw) ozvVar.b).m = z;
        String str = this.o;
        if (str != null) {
            if ((ozvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ozvVar.y();
            }
            ((ozw) ozvVar.b).h = str;
        }
        String str2 = this.t;
        if (str2 != null) {
            if ((ozvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ozvVar.y();
            }
            ((ozw) ozvVar.b).i = str2;
        }
        abxd abxdVarV = ozvVar.v();
        abxdVarV.getClass();
        return (ozw) abxdVarV;
    }

    public final void t() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((owu) it.next()).i(this.B);
        }
        this.B = false;
    }

    public final void u() {
        if (this.s) {
            final pad padVar = this.A;
            final ozw ozwVarR = r();
            oyu oyuVar = new oyu(this);
            if (padVar.b()) {
                ((zdv) pad.a.a(pai.a).q("com/google/android/libraries/home/homegraph/foyer/storage/HomeGraphStore", "save", 88, "HomeGraphStore.java")).u("Saving in the middle of a load will overwrite the data just passed in.");
                synchronized (padVar.g) {
                    zyd zydVar = padVar.h;
                    if (zydVar != null) {
                        zydVar.cancel(false);
                        padVar.h = null;
                    }
                }
                padVar.a(null);
            }
            zxn.p(padVar.f.submit(new Callable() { // from class: ozy
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int iA;
                    ozw ozwVar = ozwVarR;
                    pad padVar2 = padVar;
                    synchronized (padVar2.b) {
                        try {
                            FileOutputStream fileOutputStreamOpenFileOutput = padVar2.c.openFileOutput(padVar2.d, 0);
                            try {
                                int i = ozwVar.memoizedSerializedSize;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    iA = abza.a.a(ozwVar.getClass()).a(ozwVar);
                                    if (iA < 0) {
                                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                    }
                                } else {
                                    iA = i & Integer.MAX_VALUE;
                                    if (iA == Integer.MAX_VALUE) {
                                        iA = abza.a.a(ozwVar.getClass()).a(ozwVar);
                                        if (iA < 0) {
                                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                        }
                                        ozwVar.memoizedSerializedSize = (Integer.MIN_VALUE & ozwVar.memoizedSerializedSize) | iA;
                                    }
                                }
                                abvy abvyVar = new abvy(fileOutputStreamOpenFileOutput, abvz.F(iA));
                                abza.a.a(ozwVar.getClass()).m(ozwVar, abwa.a(abvyVar));
                                abvyVar.O();
                                if (fileOutputStreamOpenFileOutput != null) {
                                    fileOutputStreamOpenFileOutput.close();
                                }
                            } catch (Throwable th) {
                                if (fileOutputStreamOpenFileOutput != null) {
                                    try {
                                        fileOutputStreamOpenFileOutput.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                                throw th;
                            }
                        } catch (IOException e) {
                            ((zdv) ((zdv) ((zdv) pad.a.c()).p(e)).q("com/google/android/libraries/home/homegraph/foyer/storage/HomeGraphStore", "saveCallable", 120, "HomeGraphStore.java")).u("Exception saving cache file");
                            return false;
                        }
                    }
                    return true;
                }
            }), new paa(oyuVar), padVar.e);
        }
    }

    public final owv v(final oxg oxgVar, afil afilVar, owj owjVar, MessageLite messageLite, String str, long j) {
        oxgVar.getClass();
        return this.e.b(this.f, afilVar, owjVar, messageLite, new Function() { // from class: oyr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo116andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                abgq abgqVar = (abgq) obj;
                abgqVar.getClass();
                this.a.z(abgqVar);
                return null;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, str, j);
    }

    public final void w(final oxg oxgVar, final boolean z, final int i, final long j) {
        ((zdv) b.b().q("com/google/android/libraries/home/homegraph/foyer/FoyerHomeGraph", "loadDataFromServer", 332, "FoyerHomeGraph.kt")).u("Attempting server load");
        this.r = d(oxgVar, new owj() { // from class: oyn
            @Override // defpackage.owj
            public final void a(Status status, Object obj) {
                status.getClass();
                ozi oziVar = this.a;
                oziVar.r = null;
                if (status.e()) {
                    Iterator it = oziVar.g.iterator();
                    while (it.hasNext()) {
                        ((owu) it.next()).r(ypn.SERVER);
                    }
                    return;
                }
                int i2 = i;
                boolean z2 = z;
                long j2 = j;
                ((zdv) ((zdv) ozi.b.c()).p(status.o).q("com/google/android/libraries/home/homegraph/foyer/FoyerHomeGraph", "loadDataFromServer$lambda$1", 351, "FoyerHomeGraph.kt")).u("GetHomeGraph Failed when loading from server");
                if (z2) {
                    oziVar.y(i2, j2, status);
                } else {
                    oziVar.x(oxgVar, status, i2, j2);
                }
            }
        });
    }

    public final void x(final oxg oxgVar, final Status status, final int i, final long j) {
        ((zdv) b.b().q("com/google/android/libraries/home/homegraph/foyer/FoyerHomeGraph", "loadDataFromStore", 373, "FoyerHomeGraph.kt")).u("Attempting store load");
        pac pacVar = new pac() { // from class: oys
            @Override // defpackage.pac
            public final void a(ozw ozwVar) {
                ozi oziVar = this.a;
                if (ozwVar == null) {
                    int i2 = i;
                    Status status2 = status;
                    long j2 = j;
                    if (status2 == null) {
                        oziVar.w(oxgVar, true, i2, j2);
                        return;
                    } else {
                        oziVar.y(i2, j2, status2);
                        return;
                    }
                }
                oziVar.t = ozwVar.i;
                oxp oxpVar = oziVar.i;
                abxs abxsVar = ozwVar.c;
                abxsVar.getClass();
                oxpVar.f(abxsVar, true);
                oxp oxpVar2 = oziVar.j;
                abxs abxsVar2 = ozwVar.d;
                abxsVar2.getClass();
                oxpVar2.f(abxsVar2, true);
                abxs abxsVar3 = ozwVar.k;
                abxsVar3.getClass();
                oziVar.n = abxsVar3;
                abxs abxsVar4 = ozwVar.e;
                abxsVar4.getClass();
                oziVar.k = abxsVar4;
                abxs abxsVar5 = ozwVar.f;
                abxsVar5.getClass();
                oziVar.l = abxsVar5;
                abxs abxsVar6 = ozwVar.g;
                abxsVar6.getClass();
                oziVar.m = abxsVar6;
                abgi abgiVar = ozwVar.l;
                if (abgiVar == null) {
                    abgiVar = abgi.a;
                }
                abgiVar.getClass();
                oziVar.q = abgiVar;
                oziVar.h = ozwVar.m;
                oziVar.o = ozwVar.h;
                abxs abxsVar7 = ozwVar.j;
                abxsVar7.getClass();
                oziVar.p = abxsVar7;
                oziVar.s = true;
                Iterator it = oziVar.g.iterator();
                while (it.hasNext()) {
                    ((owu) it.next()).r(ypn.CACHE);
                }
                Optional optional = oziVar.v;
                if (optional.isPresent()) {
                    ozu ozuVar = (ozu) optional.get();
                    oziVar.r();
                    ozuVar.a();
                }
                final oyq oyqVar = new oyq(oziVar);
                if (uea.d(Thread.currentThread())) {
                    oyqVar.a.t();
                } else {
                    oziVar.d.execute(new Runnable() { // from class: oyw
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((oyq) oyqVar).a.t();
                        }
                    });
                }
            }
        };
        final pad padVar = this.A;
        List list = padVar.i;
        synchronized (list) {
            list.add(pacVar);
        }
        if (padVar.b()) {
            return;
        }
        synchronized (padVar.g) {
            padVar.h = padVar.f.submit(new Callable() { // from class: ozz
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    byte bByteValue;
                    pad padVar2 = padVar;
                    synchronized (padVar2.b) {
                        try {
                            try {
                                File fileStreamPath = padVar2.c.getFileStreamPath(padVar2.d);
                                if (!fileStreamPath.exists()) {
                                    return null;
                                }
                                fileStreamPath.getClass();
                                byte[] bArrA = zks.a(fileStreamPath);
                                abxd abxdVarH = abxd.h(ozw.a, bArrA, 0, bArrA.length, ExtensionRegistryLite.getGeneratedRegistry());
                                if (abxdVarH != null && (bByteValue = ((Byte) abxdVarH.cM(1, null)).byteValue()) != 1) {
                                    if (bByteValue != 0) {
                                        boolean zL = abza.a.a(abxdVarH.getClass()).l(abxdVarH);
                                        abxdVarH.cM(2, true != zL ? null : abxdVarH);
                                        if (zL) {
                                        }
                                    }
                                    throw new abzz().a();
                                }
                                return (ozw) abxdVarH;
                            } catch (IOException e) {
                                e = e;
                                ((zdv) ((zdv) ((zdv) pad.a.c()).p(e)).q("com/google/android/libraries/home/homegraph/foyer/storage/HomeGraphStore", "loadCallable", 182, "HomeGraphStore.java")).u("Exception reading cache file");
                                return null;
                            } catch (IllegalArgumentException e2) {
                                e = e2;
                                ((zdv) ((zdv) ((zdv) pad.a.c()).p(e)).q("com/google/android/libraries/home/homegraph/foyer/storage/HomeGraphStore", "loadCallable", 182, "HomeGraphStore.java")).u("Exception reading cache file");
                                return null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            });
            zxn.p(padVar.h, new pab(padVar), padVar.e);
        }
    }

    public final void y(int i, long j, Status status) {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((owu) it.next()).q(i, j, status);
        }
    }

    public final void z(abgq abgqVar) {
        own ownVarC;
        Set set = this.g;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((owu) it.next()).s();
        }
        if (abgqVar.f) {
            this.t = abgqVar.e;
            abxs abxsVar = abgqVar.j;
            abxsVar.getClass();
            this.n = abxsVar;
            abxs abxsVar2 = abgqVar.d;
            abxsVar2.getClass();
            this.k = abxsVar2;
            abxs abxsVar3 = abgqVar.g;
            abxsVar3.getClass();
            this.l = abxsVar3;
            abxs abxsVar4 = abgqVar.i;
            abxsVar4.getClass();
            this.m = abxsVar4;
            abgi abgiVar = abgqVar.l;
            if (abgiVar == null) {
                abgiVar = abgi.a;
            }
            abgiVar.getClass();
            this.q = abgiVar;
            abxs abxsVar5 = abgqVar.k;
            abxsVar5.getClass();
            boolean z = false;
            if (!abxsVar5.isEmpty()) {
                Iterator<E> it2 = abxsVar5.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    abgx abgxVar = (abgx) it2.next();
                    if (agvy.c(abgxVar.b, aerk.a.eV().d())) {
                        int i = abgxVar.c;
                        char c = i != 0 ? i != 1 ? i != 2 ? i != 3 ? (char) 0 : (char) 5 : (char) 4 : (char) 3 : (char) 2;
                        if (c != 0 && c == 3) {
                            z = true;
                            break;
                        }
                    }
                }
            }
            this.h = z;
            abxs abxsVar6 = abgqVar.b;
            abxsVar6.getClass();
            this.i.f(abxsVar6, true);
            abxs abxsVar7 = abgqVar.c;
            abxsVar7.getClass();
            Iterator it3 = abxsVar7.iterator();
            while (it3.hasNext()) {
                abfv abfvVar = ((abft) it3.next()).c;
                if (abfvVar == null) {
                    abfvVar = abfv.a;
                }
                abes abesVar = abfvVar.d;
                if (abesVar == null) {
                    abesVar = abes.a;
                }
                abesVar.getClass();
                if (agvy.c(aerk.d(), abesVar.b) && (ownVarC = c(abesVar.c)) != null && ownVarC.b() != null) {
                    it3.remove();
                }
            }
            this.j.f(abxsVar7, true);
            abxs abxsVar8 = abgqVar.h;
            abxsVar8.getClass();
            this.p = abxsVar8;
            Iterator it4 = set.iterator();
            while (it4.hasNext()) {
                ((owu) it4.next()).p();
            }
        }
    }
}
