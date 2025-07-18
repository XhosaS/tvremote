package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import io.grpc.Status;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ozn extends ozk implements oww {
    public final Object a;
    public final Set b;
    private final abhk c;

    public ozn(ozi oziVar, abhh abhhVar, String str) {
        super(oziVar, str);
        this.a = new Object();
        this.b = new LinkedHashSet();
        l(abhhVar);
        abhk abhkVar = ((abhh) k()).e;
        abhkVar = abhkVar == null ? abhk.a : abhkVar;
        abhkVar.getClass();
        this.c = abhkVar;
    }

    @Override // defpackage.oww
    public final owv a(Collection collection, final owj owjVar) {
        abgz abgzVar;
        owjVar.getClass();
        ArrayList<own> arrayList = new ArrayList();
        for (Object obj : collection) {
            oww owwVarC = ((own) obj).c();
            if (owwVarC == null || !agvy.c(owwVarC.c(), c())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(agqq.i(arrayList, 10));
        for (own ownVar : arrayList) {
            abfv abfvVar = abfv.a;
            abfu abfuVar = new abfu();
            String strN = ownVar.n();
            if ((Integer.MIN_VALUE & abfuVar.b.memoizedSerializedSize) == 0) {
                abfuVar.y();
            }
            ((abfv) abfuVar.b).c = strN;
            arrayList2.add(abfw.a(abfuVar));
        }
        if (arrayList2.isEmpty()) {
            abgzVar = null;
        } else {
            abgz abgzVar2 = abgz.a;
            abgy abgyVar = new abgy();
            String strC = c();
            if ((abgyVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                abgyVar.y();
            }
            abgz abgzVar3 = (abgz) abgyVar.b;
            abgzVar3.b = strC;
            DesugarCollections.unmodifiableList(abgzVar3.c).getClass();
            if ((abgyVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                abgyVar.y();
            }
            abgz abgzVar4 = (abgz) abgyVar.b;
            abxs abxsVar = abgzVar4.c;
            if (!abxsVar.c()) {
                int size = abxsVar.size();
                abgzVar4.c = abxsVar.d(size + size);
            }
            abus.m(arrayList2, abgzVar4.c);
            abxd abxdVarV = abgyVar.v();
            abxdVarV.getClass();
            abgzVar = (abgz) abxdVarV;
        }
        if (abgzVar == null) {
            return new oxa(owjVar);
        }
        ozi oziVar = this.f;
        oxg oxgVar = oxg.ASSIGN_DEVICE;
        afil afilVarA = abhl.b;
        if (afilVarA == null) {
            synchronized (abhl.class) {
                afilVarA = abhl.b;
                if (afilVarA == null) {
                    afii afiiVarC = afil.c();
                    afiiVarC.c = afik.UNARY;
                    afiiVarC.d = afil.b("google.internal.home.foyer.v1.SpacesService", "BatchModifySpacesDevices");
                    afiiVarC.e = true;
                    abfb abfbVar = abfb.a;
                    ExtensionRegistryLite extensionRegistryLite = agea.a;
                    afiiVarC.a = new agdz(abfbVar);
                    afiiVarC.b = new agdz(abfd.a);
                    afilVarA = afiiVarC.a();
                    abhl.b = afilVarA;
                }
            }
        }
        owj owjVar2 = new owj() { // from class: ozm
            @Override // defpackage.owj
            public final void a(Status status, Object obj2) {
                status.getClass();
                owjVar.a(status, null);
            }
        };
        abfb abfbVar2 = abfb.a;
        abfa abfaVar = new abfa();
        abhb abhbVar = abhb.a;
        abha abhaVar = new abha();
        DesugarCollections.unmodifiableList(((abhb) abhaVar.b).b).getClass();
        if ((abhaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abhaVar.y();
        }
        abhb abhbVar2 = (abhb) abhaVar.b;
        abxs abxsVar2 = abhbVar2.b;
        if (!abxsVar2.c()) {
            int size2 = abxsVar2.size();
            abhbVar2.b = abxsVar2.d(size2 + size2);
        }
        abhbVar2.b.add(abgzVar);
        abxd abxdVarV2 = abhaVar.v();
        abxdVarV2.getClass();
        abhb abhbVar3 = (abhb) abxdVarV2;
        if ((Integer.MIN_VALUE & abfaVar.b.memoizedSerializedSize) == 0) {
            abfaVar.y();
        }
        abfb abfbVar3 = (abfb) abfaVar.b;
        abfbVar3.c = abhbVar3;
        abfbVar3.b |= 1;
        abxd abxdVarV3 = abfaVar.v();
        abxdVarV3.getClass();
        return oziVar.p(oxgVar, afilVarA, owjVar2, (abfb) abxdVarV3);
    }

    @Override // defpackage.oww
    public final abhk b() {
        return this.c;
    }

    @Override // defpackage.oww
    public final String c() {
        String str = ((abhh) k()).c;
        str.getClass();
        return str;
    }

    @Override // defpackage.oww
    public final String d() {
        String str = ((abhh) k()).d;
        str.getClass();
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0019 A[SYNTHETIC] */
    @Override // defpackage.oww
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Set e() {
        /*
            r11 = this;
            oyi r0 = r11.j()
            if (r0 != 0) goto L9
            agrf r0 = defpackage.agrf.a
            return r0
        L9:
            java.lang.Object r1 = r11.a
            monitor-enter(r1)
            java.util.Set r2 = r11.b     // Catch: java.lang.Throwable -> L77
            java.lang.String r3 = "FoyerHome.kt"
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L77
            r4.<init>()     // Catch: java.lang.Throwable -> L77
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L77
        L19:
            boolean r5 = r2.hasNext()     // Catch: java.lang.Throwable -> L77
            if (r5 == 0) goto L71
            java.lang.Object r5 = r2.next()     // Catch: java.lang.Throwable -> L77
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L77
            oxp r6 = r0.d     // Catch: java.lang.Throwable -> L77
            java.lang.Object r6 = r6.get(r5)     // Catch: java.lang.Throwable -> L77
            own r6 = (defpackage.own) r6     // Catch: java.lang.Throwable -> L77
            r7 = 0
            if (r6 != 0) goto L4b
            zdy r6 = defpackage.oyi.a     // Catch: java.lang.Throwable -> L77
            java.util.logging.Level r8 = defpackage.pai.a     // Catch: java.lang.Throwable -> L77
            zdv r6 = r6.a(r8)     // Catch: java.lang.Throwable -> L77
            java.lang.String r8 = "com/google/android/libraries/home/homegraph/foyer/FoyerHome"
            java.lang.String r9 = "lookupDevices"
            r10 = 1242(0x4da, float:1.74E-42)
            zeo r6 = r6.q(r8, r9, r10, r3)     // Catch: java.lang.Throwable -> L77
            zdv r6 = (defpackage.zdv) r6     // Catch: java.lang.Throwable -> L77
            java.lang.String r8 = "Device not found: %s"
            r6.x(r8, r5)     // Catch: java.lang.Throwable -> L77
        L49:
            r6 = r7
            goto L6b
        L4b:
            ouq r8 = r6.a()     // Catch: java.lang.Throwable -> L77
            ouq r9 = defpackage.ouq.y     // Catch: java.lang.Throwable -> L77
            if (r8 != r9) goto L6b
            zdy r6 = defpackage.oyi.a     // Catch: java.lang.Throwable -> L77
            zeo r6 = r6.d()     // Catch: java.lang.Throwable -> L77
            java.lang.String r8 = "com/google/android/libraries/home/homegraph/foyer/FoyerHome"
            java.lang.String r9 = "lookupDevices"
            r10 = 1245(0x4dd, float:1.745E-42)
            zeo r6 = r6.q(r8, r9, r10, r3)     // Catch: java.lang.Throwable -> L77
            zdv r6 = (defpackage.zdv) r6     // Catch: java.lang.Throwable -> L77
            java.lang.String r8 = "Ignore group: %s."
            r6.x(r8, r5)     // Catch: java.lang.Throwable -> L77
            goto L49
        L6b:
            if (r6 == 0) goto L19
            r4.add(r6)     // Catch: java.lang.Throwable -> L77
            goto L19
        L71:
            java.util.Set r0 = defpackage.agqq.A(r4)     // Catch: java.lang.Throwable -> L77
            monitor-exit(r1)
            return r0
        L77:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ozn.e():java.util.Set");
    }

    @Override // defpackage.ozl
    public final /* bridge */ /* synthetic */ MessageLite f(MessageLite messageLite) {
        abhh abhhVar = (abhh) messageLite;
        synchronized (this.a) {
            Set set = this.b;
            set.clear();
            Iterator it = abhhVar.f.iterator();
            while (it.hasNext()) {
                abfv abfvVar = ((abgc) it.next()).b;
                if (abfvVar == null) {
                    abfvVar = abfv.a;
                }
                String strA = paf.a(abfvVar);
                strA.getClass();
                set.add(strA);
            }
        }
        return abhhVar;
    }
}
