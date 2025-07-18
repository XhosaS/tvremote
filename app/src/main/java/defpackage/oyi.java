package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import j$.util.DesugarCollections;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oyi extends ozl implements owl {
    public static final zdy a = zdy.h("com/google/android/libraries/home/homegraph/foyer/FoyerHome");
    public final Set b;
    public final oxp c;
    public final oxp d;
    public final oxn e;

    public oyi(oxn oxnVar, Set set, ozi oziVar, abhn abhnVar) {
        super(oziVar);
        this.e = oxnVar;
        this.b = set;
        this.c = new oyh(this);
        this.d = new ozo(oziVar, abhnVar.b);
        l(abhnVar);
    }

    @Override // defpackage.owl
    public final owv a(String str, abhk abhkVar, Collection collection, owj owjVar) {
        str.getClass();
        abhkVar.getClass();
        owjVar.getClass();
        if (!collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((own) it.next()).c() != null) {
                    ((zdv) a.a(pai.a).q("com/google/android/libraries/home/homegraph/foyer/FoyerHome", "createRoom", 671, "FoyerHome.kt")).u("Device is already assigned to a room - can't assign to a new room");
                    break;
                }
            }
        }
        oxs oxsVar = this.g;
        afil afilVarA = abhl.a;
        if (afilVarA == null) {
            synchronized (abhl.class) {
                afilVarA = abhl.a;
                if (afilVarA == null) {
                    afii afiiVarC = afil.c();
                    afiiVarC.c = afik.UNARY;
                    afiiVarC.d = afil.b("google.internal.home.foyer.v1.SpacesService", "CreateSpace");
                    afiiVarC.e = true;
                    abfp abfpVar = abfp.a;
                    ExtensionRegistryLite extensionRegistryLite = agea.a;
                    afiiVarC.a = new agdz(abfpVar);
                    afiiVarC.b = new agdz(abhh.a);
                    afilVarA = afiiVarC.a();
                    abhl.a = afilVarA;
                }
            }
        }
        afil afilVar = afilVarA;
        abfp abfpVar2 = abfp.a;
        abfo abfoVar = new abfo();
        String strB = b();
        if ((abfoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abfoVar.y();
        }
        abfp abfpVar3 = (abfp) abfoVar.b;
        abfpVar3.c = strB;
        DesugarCollections.unmodifiableList(abfpVar3.e).getClass();
        ArrayList arrayList = new ArrayList(agqq.i(collection, 10));
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(((own) it2.next()).d());
        }
        if ((abfoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abfoVar.y();
        }
        abfp abfpVar4 = (abfp) abfoVar.b;
        abxs abxsVar = abfpVar4.e;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            abfpVar4.e = abxsVar.d(size + size);
        }
        abus.m(arrayList, abfpVar4.e);
        abhh abhhVar = abhh.a;
        abhg abhgVar = new abhg();
        abhi.b(str, abhgVar);
        if ((abhgVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abhgVar.y();
        }
        abhh abhhVar2 = (abhh) abhgVar.b;
        abhhVar2.e = abhkVar;
        abhhVar2.b |= 1;
        abhh abhhVarA = abhi.a(abhgVar);
        if ((abfoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abfoVar.y();
        }
        abfp abfpVar5 = (abfp) abfoVar.b;
        abfpVar5.d = abhhVarA;
        abfpVar5.b |= 1;
        abxd abxdVarV = abfoVar.v();
        abxdVarV.getClass();
        return oxsVar.d(afilVar, owjVar, (abfp) abxdVarV, new Function() { // from class: oyf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo116andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                abhh abhhVar3 = (abhh) obj;
                abhhVar3.getClass();
                List listSingletonList = Collections.singletonList(abhhVar3);
                listSingletonList.getClass();
                oxp oxpVar = this.a.c;
                oxpVar.f(listSingletonList, false);
                return (oww) oxpVar.get(abhhVar3.c);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, "oauth2:https://www.googleapis.com/auth/homegraph", aerh.b());
    }

    @Override // defpackage.owl
    public final String b() {
        String str = ((abhn) k()).b;
        str.getClass();
        return str;
    }

    @Override // defpackage.owl
    public final String c() {
        String str = ((abhn) k()).c;
        str.getClass();
        return str;
    }

    @Override // defpackage.owl
    public final Set d() {
        return agqq.A(this.c.d());
    }

    @Override // defpackage.owl
    public final owv e(String str, String str2, String str3, abff abffVar, String str4, String str5, String str6, abhk abhkVar, Boolean bool, Boolean bool2, final owj owjVar) {
        str.getClass();
        abffVar.getClass();
        owjVar.getClass();
        abfv abfvVar = abfv.a;
        abfu abfuVar = new abfu();
        abes abesVar = abes.a;
        aber aberVar = new aber();
        String strD = aerk.d();
        strD.getClass();
        if ((aberVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            aberVar.y();
        }
        ((abes) aberVar.b).b = strD;
        if ((aberVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            aberVar.y();
        }
        ((abes) aberVar.b).c = str;
        abxd abxdVarV = aberVar.v();
        abxdVarV.getClass();
        abes abesVar2 = (abes) abxdVarV;
        if ((abfuVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abfuVar.y();
        }
        abfv abfvVar2 = (abfv) abfuVar.b;
        abfvVar2.d = abesVar2;
        abfvVar2.b |= 1;
        abfv abfvVarA = abfw.a(abfuVar);
        abft abftVar = abft.a;
        abfs abfsVar = new abfs();
        if ((abfsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abfsVar.y();
        }
        abft abftVar2 = (abft) abfsVar.b;
        abftVar2.c = abfvVarA;
        abftVar2.b |= 1;
        if (str2 == null) {
            str2 = "";
        }
        if ((abfsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abfsVar.y();
        }
        ((abft) abfsVar.b).d = str2;
        if ((abfsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abfsVar.y();
        }
        abft abftVar3 = (abft) abfsVar.b;
        abftVar3.f = abffVar;
        abftVar3.b |= 2;
        if (str3 != null && ((pag) pag.Y.get(str3)) == pag.GOOGLE_NEST_HUB_MAX) {
            abgv abgvVar = abgv.a;
            abgu abguVar = new abgu();
            abhd abhdVar = abhd.a;
            abhc abhcVar = new abhc();
            bool.booleanValue();
            if ((abhcVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                abhcVar.y();
            }
            ((abhd) abhcVar.b).b = false;
            bool2.booleanValue();
            if ((abhcVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                abhcVar.y();
            }
            ((abhd) abhcVar.b).c = false;
            abxd abxdVarV2 = abhcVar.v();
            abxdVarV2.getClass();
            abhd abhdVar2 = (abhd) abxdVarV2;
            if ((abguVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                abguVar.y();
            }
            abgv abgvVar2 = (abgv) abguVar.b;
            abgvVar2.c = abhdVar2;
            abgvVar2.b |= 1;
            abxd abxdVarV3 = abguVar.v();
            abxdVarV3.getClass();
            abgv abgvVar3 = (abgv) abxdVarV3;
            if ((abfsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                abfsVar.y();
            }
            abft abftVar4 = (abft) abfsVar.b;
            abftVar4.h = abgvVar3;
            abftVar4.b |= 32768;
        }
        abxd abxdVarV4 = abfsVar.v();
        abxdVarV4.getClass();
        abft abftVar5 = (abft) abxdVarV4;
        abfl abflVar = abfl.a;
        abfk abfkVar = new abfk();
        String strB = b();
        if ((abfkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abfkVar.y();
        }
        ((abfl) abfkVar.b).e = strB;
        if ((abfkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abfkVar.y();
        }
        abfl abflVar2 = (abfl) abfkVar.b;
        abflVar2.f = abftVar5;
        abflVar2.b |= 1;
        if (str3 != null && str3.length() != 0) {
            if ((abfkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                abfkVar.y();
            }
            ((abfl) abfkVar.b).j = str3;
        }
        if (str5 != null && str5.length() != 0) {
            if ((abfkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                abfkVar.y();
            }
            ((abfl) abfkVar.b).g = str5;
            int i = true != abffVar.c ? 4 : 5;
            if ((abfkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                abfkVar.y();
            }
            ((abfl) abfkVar.b).i = i - 2;
        }
        "".length();
        if ((abfkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abfkVar.y();
        }
        ((abfl) abfkVar.b).h = "";
        if (str4 != null && str4.length() != 0) {
            if ((abfkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                abfkVar.y();
            }
            abfl abflVar3 = (abfl) abfkVar.b;
            abflVar3.c = 4;
            abflVar3.d = str4;
        } else if (str6 != null && str6.length() != 0 && abhkVar != null) {
            abhh abhhVar = abhh.a;
            abhg abhgVar = new abhg();
            abhi.b(str6, abhgVar);
            if ((abhgVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                abhgVar.y();
            }
            abhh abhhVar2 = (abhh) abhgVar.b;
            abhhVar2.e = abhkVar;
            abhhVar2.b |= 1;
            abhh abhhVarA = abhi.a(abhgVar);
            if ((abfkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                abfkVar.y();
            }
            abfl abflVar4 = (abfl) abfkVar.b;
            abflVar4.d = abhhVarA;
            abflVar4.c = 7;
        }
        abxd abxdVarV5 = abfkVar.v();
        abxdVarV5.getClass();
        ozi oziVar = this.f;
        abfl abflVar5 = (abfl) abxdVarV5;
        oxg oxgVar = oxg.CREATE_DEVICE;
        afil afilVarA = abgr.a;
        if (afilVarA == null) {
            synchronized (abgr.class) {
                afilVarA = abgr.a;
                if (afilVarA == null) {
                    afii afiiVarC = afil.c();
                    afiiVarC.c = afik.UNARY;
                    afiiVarC.d = afil.b("google.internal.home.foyer.v1.HomeDevicesService", "CreateDevice");
                    afiiVarC.e = true;
                    abfl abflVar6 = abfl.a;
                    ExtensionRegistryLite extensionRegistryLite = agea.a;
                    afiiVarC.a = new agdz(abflVar6);
                    afiiVarC.b = new agdz(abfn.a);
                    afilVarA = afiiVarC.a();
                    abgr.a = afilVarA;
                }
            }
        }
        return oziVar.v(oxgVar, afilVarA, new owj() { // from class: oyg
            /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x00bd  */
            /* JADX WARN: Removed duplicated region for block: B:62:0x00c6 A[EDGE_INSN: B:62:0x00c6->B:53:0x00c6 BREAK  A[LOOP:1: B:35:0x0097->B:63:?], SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:63:? A[LOOP:1: B:35:0x0097->B:63:?, LOOP_END, SYNTHETIC] */
            @Override // defpackage.owj
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void a(io.grpc.Status r8, java.lang.Object r9) {
                /*
                    r7 = this;
                    abfn r9 = (defpackage.abfn) r9
                    r8.getClass()
                    oyi r0 = r7.a
                    boolean r1 = r8.e()
                    if (r1 == 0) goto L55
                    if (r9 == 0) goto L55
                    java.lang.String r1 = r9.d
                    r1.getClass()
                    int r2 = r1.length()
                    if (r2 <= 0) goto L2b
                    oxn r2 = r0.e
                    android.content.SharedPreferences r2 = r2.a
                    android.content.SharedPreferences$Editor r2 = r2.edit()
                    java.lang.String r3 = "assistantSettingsVersionInfo"
                    android.content.SharedPreferences$Editor r1 = r2.putString(r3, r1)
                    r1.apply()
                L2b:
                    java.util.Set r1 = r0.b
                    java.util.Iterator r1 = r1.iterator()
                L31:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L6e
                    java.lang.Object r2 = r1.next()
                    oxo r2 = (defpackage.oxo) r2
                    abft r3 = r9.b
                    if (r3 != 0) goto L43
                    abft r3 = defpackage.abft.a
                L43:
                    abfv r3 = r3.c
                    if (r3 != 0) goto L49
                    abfv r3 = defpackage.abfv.a
                L49:
                    abes r3 = r3.d
                    if (r3 != 0) goto L4f
                    abes r3 = defpackage.abes.a
                L4f:
                    java.lang.String r3 = r3.c
                    r2.a()
                    goto L31
                L55:
                    zdy r1 = defpackage.oyi.a
                    zeo r1 = r1.c()
                    r2 = 569(0x239, float:7.97E-43)
                    java.lang.String r3 = "FoyerHome.kt"
                    java.lang.String r4 = "com/google/android/libraries/home/homegraph/foyer/FoyerHome"
                    java.lang.String r5 = "createDevice$lambda$40"
                    zeo r1 = r1.q(r4, r5, r2, r3)
                    zdv r1 = (defpackage.zdv) r1
                    java.lang.String r2 = "CreateDevice failed with status %s"
                    r1.x(r2, r8)
                L6e:
                    r1 = 0
                    if (r9 == 0) goto L88
                    abxs r2 = r9.c
                    if (r2 == 0) goto L88
                    java.lang.Object r2 = defpackage.agqq.o(r2)
                    abew r2 = (defpackage.abew) r2
                    if (r2 == 0) goto L88
                    abhh r2 = r2.b
                    if (r2 != 0) goto L83
                    abhh r2 = defpackage.abhh.a
                L83:
                    if (r2 == 0) goto L88
                    java.lang.String r2 = r2.c
                    goto L89
                L88:
                    r2 = r1
                L89:
                    oxp r3 = r0.d
                    java.util.Collection r3 = r3.d()
                    java.util.Set r3 = defpackage.agqq.A(r3)
                    java.util.Iterator r3 = r3.iterator()
                L97:
                    boolean r4 = r3.hasNext()
                    if (r4 == 0) goto Lc5
                    java.lang.Object r4 = r3.next()
                    r5 = r4
                    own r5 = (defpackage.own) r5
                    java.lang.String r5 = r5.n()
                    if (r9 == 0) goto Lbd
                    abft r6 = r9.b
                    if (r6 != 0) goto Lb0
                    abft r6 = defpackage.abft.a
                Lb0:
                    if (r6 == 0) goto Lbd
                    abfv r6 = r6.c
                    if (r6 != 0) goto Lb8
                    abfv r6 = defpackage.abfv.a
                Lb8:
                    if (r6 == 0) goto Lbd
                    java.lang.String r6 = r6.c
                    goto Lbe
                Lbd:
                    r6 = r1
                Lbe:
                    boolean r5 = defpackage.agvy.c(r5, r6)
                    if (r5 == 0) goto L97
                    goto Lc6
                Lc5:
                    r4 = r1
                Lc6:
                    own r4 = (defpackage.own) r4
                    if (r2 == 0) goto Ld3
                    oxp r9 = r0.c
                    java.lang.Object r9 = r9.get(r2)
                    r1 = r9
                    oww r1 = (defpackage.oww) r1
                Ld3:
                    owj r9 = r2
                    owk r0 = new owk
                    r0.<init>(r1)
                    r9.a(r8, r0)
                    defpackage.fzw.j(r8)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.oyg.a(io.grpc.Status, java.lang.Object):void");
            }
        }, abflVar5, "oauth2:https://www.googleapis.com/auth/connected-device-registration", aerh.b());
    }

    @Override // defpackage.ozl
    public final /* synthetic */ MessageLite f(MessageLite messageLite) {
        abhn abhnVar = (abhn) messageLite;
        abxs abxsVar = abhnVar.e;
        abxsVar.getClass();
        ArrayList arrayList = new ArrayList(abxsVar);
        abxs abxsVar2 = abhnVar.d;
        abxsVar2.getClass();
        abhm abhmVar = new abhm();
        abhmVar.B(abhnVar);
        DesugarCollections.unmodifiableList(((abhn) abhmVar.b).e).getClass();
        if ((abhmVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abhmVar.y();
        }
        abhn abhnVar2 = (abhn) abhmVar.b;
        abzb abzbVar = abzb.b;
        abhnVar2.e = abzbVar;
        DesugarCollections.unmodifiableList(((abhn) abhmVar.b).d).getClass();
        if ((abhmVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abhmVar.y();
        }
        ((abhn) abhmVar.b).d = abzbVar;
        abhn abhnVarA = abho.a(abhmVar);
        this.c.f(abxsVar2, true);
        this.d.f(arrayList, true);
        return abhnVarA;
    }

    @Override // defpackage.ozl
    public final /* synthetic */ MessageLite o(MessageLite messageLite) {
        abhm abhmVar = new abhm();
        abhmVar.B((abhn) messageLite);
        DesugarCollections.unmodifiableList(((abhn) abhmVar.b).e).getClass();
        oza ozaVar = ozi.a;
        List listA = ozaVar.a(this.d);
        if ((abhmVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abhmVar.y();
        }
        abhn abhnVar = (abhn) abhmVar.b;
        abxs abxsVar = abhnVar.e;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            abhnVar.e = abxsVar.d(size + size);
        }
        abus.m(listA, abhnVar.e);
        DesugarCollections.unmodifiableList(((abhn) abhmVar.b).d).getClass();
        List listA2 = ozaVar.a(this.c);
        if ((abhmVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abhmVar.y();
        }
        abhn abhnVar2 = (abhn) abhmVar.b;
        abxs abxsVar2 = abhnVar2.d;
        if (!abxsVar2.c()) {
            int size2 = abxsVar2.size();
            abhnVar2.d = abxsVar2.d(size2 + size2);
        }
        abus.m(listA2, abhnVar2.d);
        return abho.a(abhmVar);
    }
}
