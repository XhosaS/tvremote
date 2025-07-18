package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import io.grpc.Status;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oyl extends ozk implements own {
    public static final oyk a = new oyk();
    private String b;

    static {
        Pattern.compile("DEVICE_[0-9A-Fa-f]{16}").getClass();
    }

    public oyl(ozi oziVar, abft abftVar, String str) {
        super(oziVar, str);
        l(abftVar);
    }

    private final String m(String... strArr) {
        String str;
        int i = 0;
        while (true) {
            if (i >= strArr.length) {
                str = null;
                break;
            }
            str = strArr[i];
            if (str != null && str.length() != 0) {
                break;
            }
            i++;
        }
        return str == null ? "" : str;
    }

    @Override // defpackage.own
    public final ouq a() {
        Map map = ouq.a;
        String str = ((abft) k()).e;
        if (str == null) {
            return ouq.b;
        }
        Object obj = ouq.a.get(str);
        if (obj == null) {
            obj = ouq.b;
        }
        return (ouq) obj;
    }

    @Override // defpackage.own
    public final owl b() {
        return j();
    }

    @Override // defpackage.own
    public final oww c() {
        oxp oxpVar;
        Collection collectionD;
        Set setA;
        oyi oyiVarJ = j();
        Object obj = null;
        if (oyiVarJ == null || (oxpVar = oyiVarJ.c) == null || (collectionD = oxpVar.d()) == null) {
            return null;
        }
        Iterator it = collectionD.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ozn oznVar = (ozn) next;
            synchronized (oznVar.a) {
                setA = agqq.A(oznVar.b);
            }
            String str = this.b;
            if (str == null) {
                agvy.b("stableFoyerId");
                str = null;
            }
            if (setA.contains(str)) {
                obj = next;
                break;
            }
        }
        return (ozn) obj;
    }

    @Override // defpackage.own
    public final abfv d() {
        abfv abfvVar = ((abft) k()).c;
        if (abfvVar == null) {
            abfvVar = abfv.a;
        }
        abfvVar.getClass();
        return abfvVar;
    }

    @Override // defpackage.own
    public final /* synthetic */ String e() {
        if (!h()) {
            return null;
        }
        abes abesVar = d().d;
        if (abesVar == null) {
            abesVar = abes.a;
        }
        String str = abesVar.c;
        str.getClass();
        return str;
    }

    @Override // defpackage.ozl
    public final /* bridge */ /* synthetic */ MessageLite f(MessageLite messageLite) {
        abft abftVar = (abft) messageLite;
        abfv abfvVar = abftVar.c;
        if (abfvVar == null) {
            abfvVar = abfv.a;
        }
        this.b = paf.a(abfvVar);
        return abftVar;
    }

    @Override // defpackage.own
    public final String g() {
        Object next;
        oyk oykVar = a;
        abfy abfyVar = ((abft) k()).g;
        if (abfyVar == null) {
            abfyVar = abfy.a;
        }
        String strA = oykVar.a(abfyVar.b);
        abfy abfyVar2 = ((abft) k()).g;
        if (abfyVar2 == null) {
            abfyVar2 = abfy.a;
        }
        abxs abxsVar = abfyVar2.d;
        abxsVar.getClass();
        ArrayList arrayList = new ArrayList(agqq.i(abxsVar, 10));
        Iterator<E> it = abxsVar.iterator();
        while (it.hasNext()) {
            arrayList.add(oykVar.a((String) it.next()));
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            String str = (String) next;
            if (str != null && str.length() != 0) {
                break;
            }
        }
        String str2 = (String) next;
        if (str2 == null) {
            str2 = "";
        }
        abfy abfyVar3 = ((abft) k()).g;
        if (abfyVar3 == null) {
            abfyVar3 = abfy.a;
        }
        String strA2 = oykVar.a(abfyVar3.c);
        return h() ? m(null, strA2) : m(null, strA, str2, strA2);
    }

    @Override // defpackage.own
    public final boolean h() {
        String strD = aerk.d();
        abes abesVar = d().d;
        if (abesVar == null) {
            abesVar = abes.a;
        }
        String str = abesVar.b;
        str.getClass();
        return agvy.c(strD, str);
    }

    @Override // defpackage.own
    public final void i(String str, final owj owjVar) {
        str.getClass();
        oxg oxgVar = oxg.UPDATE_DEVICE_NAME;
        afil afilVarA = abgr.b;
        if (afilVarA == null) {
            synchronized (abgr.class) {
                afilVarA = abgr.b;
                if (afilVarA == null) {
                    afii afiiVarC = afil.c();
                    afiiVarC.c = afik.UNARY;
                    afiiVarC.d = afil.b("google.internal.home.foyer.v1.HomeDevicesService", "UpdateDeviceSettings");
                    afiiVarC.e = true;
                    abhu abhuVar = abhu.a;
                    ExtensionRegistryLite extensionRegistryLite = agea.a;
                    afiiVarC.a = new agdz(abhuVar);
                    afiiVarC.b = new agdz(abhw.a);
                    afilVarA = afiiVarC.a();
                    abgr.b = afilVarA;
                }
            }
        }
        owj owjVar2 = new owj() { // from class: oyj
            @Override // defpackage.owj
            public final void a(Status status, Object obj) {
                oyk oykVar = oyl.a;
                status.getClass();
                owjVar.a(status, null);
            }
        };
        abhu abhuVar2 = abhu.a;
        abht abhtVar = new abht();
        abfv abfvVarD = d();
        if ((abhtVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abhtVar.y();
        }
        abhu abhuVar3 = (abhu) abhtVar.b;
        abhuVar3.c = abfvVarD;
        abhuVar3.b |= 1;
        abfj abfjVar = abfj.a;
        abfi abfiVar = new abfi();
        abfh abfhVar = abfh.a;
        abfg abfgVar = new abfg();
        if ((abfgVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abfgVar.y();
        }
        ((abfh) abfgVar.b).b = str;
        abxd abxdVarV = abfgVar.v();
        abxdVarV.getClass();
        abfh abfhVar2 = (abfh) abxdVarV;
        if ((abfiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abfiVar.y();
        }
        abfj abfjVar2 = (abfj) abfiVar.b;
        abfjVar2.c = abfhVar2;
        abfjVar2.b |= 1;
        abxd abxdVarV2 = abfiVar.v();
        abxdVarV2.getClass();
        abfj abfjVar3 = (abfj) abxdVarV2;
        if ((abhtVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abhtVar.y();
        }
        abhu abhuVar4 = (abhu) abhtVar.b;
        abhuVar4.e = abfjVar3;
        abhuVar4.b |= 4;
        abwq abwqVar = abwq.a;
        abwp abwpVar = new abwp();
        DesugarCollections.unmodifiableList(((abwq) abwpVar.b).b).getClass();
        if ((abwpVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abwpVar.y();
        }
        abwq abwqVar2 = (abwq) abwpVar.b;
        abxs abxsVar = abwqVar2.b;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            abwqVar2.b = abxsVar.d(size + size);
        }
        abwqVar2.b.add("basic_settings.name");
        abxd abxdVarV3 = abwpVar.v();
        abxdVarV3.getClass();
        abwq abwqVar3 = (abwq) abxdVarV3;
        if ((abhtVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abhtVar.y();
        }
        ozi oziVar = this.f;
        abhu abhuVar5 = (abhu) abhtVar.b;
        abhuVar5.d = abwqVar3;
        abhuVar5.b |= 2;
        abxd abxdVarV4 = abhtVar.v();
        abxdVarV4.getClass();
        oziVar.p(oxgVar, afilVarA, owjVar2, (abhu) abxdVarV4);
    }

    @Override // defpackage.own
    public final String n() {
        String str = d().c;
        str.getClass();
        return str;
    }
}
