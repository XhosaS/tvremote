package defpackage;

import com.google.android.apps.googletv.app.device.presentation.fab.MediaDeviceFloatingActionButton;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gwp implements yjv {
    private final /* synthetic */ int a;

    public /* synthetic */ gwp(int i) {
        this.a = i;
    }

    @Override // defpackage.yjv
    public final Object a(Object obj) {
        ghi ghiVarA;
        ink inkVar;
        Integer numValueOf = null;
        switch (this.a) {
            case 0:
                ((bwi) obj).getClass();
                return ygi.a;
            case 1:
                gte gteVar = (gte) obj;
                gteVar.getClass();
                String simpleName = gteVar.getClass().getSimpleName();
                simpleName.getClass();
                return simpleName;
            case 2:
                gwu gwuVar = (gwu) obj;
                gwuVar.getClass();
                return gwuVar;
            case 3:
                vtw vtwVar = (vtw) obj;
                vtwVar.getClass();
                ioc iocVar = ((iod) vtwVar.b).g;
                if (iocVar == null) {
                    iocVar = ioc.a;
                }
                vtw vtwVar2 = (vtw) iocVar.a(5, null);
                vtwVar2.x(iocVar);
                vwe vweVarE = igv.e();
                if (!vtwVar2.b.A()) {
                    vtwVar2.u();
                }
                ioc iocVar2 = (ioc) vtwVar2.b;
                iocVar2.c = vweVarE;
                iocVar2.b |= 1;
                ioc iocVar3 = (ioc) vtwVar2.r();
                if (!vtwVar.b.A()) {
                    vtwVar.u();
                }
                iod iodVar = (iod) vtwVar.b;
                iocVar3.getClass();
                iodVar.g = iocVar3;
                iodVar.b |= 1;
                return ygi.a;
            case 4:
                vtw vtwVar3 = (vtw) obj;
                vtwVar3.getClass();
                ioc iocVar4 = ((iod) vtwVar3.b).g;
                if (iocVar4 == null) {
                    iocVar4 = ioc.a;
                }
                vtw vtwVar4 = (vtw) iocVar4.a(5, null);
                vtwVar4.x(iocVar4);
                if (!vtwVar4.b.A()) {
                    vtwVar4.u();
                }
                vuc vucVar = vtwVar4.b;
                ioc iocVar5 = (ioc) vucVar;
                iocVar5.e = null;
                iocVar5.b &= -3;
                if (!vucVar.A()) {
                    vtwVar4.u();
                }
                vuc vucVar2 = vtwVar4.b;
                ((ioc) vucVar2).d = 0;
                if (!vucVar2.A()) {
                    vtwVar4.u();
                }
                vuc vucVar3 = vtwVar4.b;
                ioc iocVar6 = (ioc) vucVar3;
                iocVar6.g = null;
                iocVar6.b &= -5;
                if (!vucVar3.A()) {
                    vtwVar4.u();
                }
                ((ioc) vtwVar4.b).f = 0;
                ioc iocVar7 = (ioc) vtwVar4.r();
                if (!vtwVar3.b.A()) {
                    vtwVar3.u();
                }
                iod iodVar2 = (iod) vtwVar3.b;
                iocVar7.getClass();
                iodVar2.g = iocVar7;
                iodVar2.b |= 1;
                return ygi.a;
            case 5:
                vtw vtwVar5 = (vtw) obj;
                vtwVar5.getClass();
                if (!vtwVar5.b.A()) {
                    vtwVar5.u();
                }
                iod iodVar3 = (iod) vtwVar5.b;
                iod iodVar4 = iod.a;
                iodVar3.g = null;
                iodVar3.b &= -2;
                return ygi.a;
            case 6:
                ghiVarA = ((gic) obj).a("SELECT cache_id as cacheId, cache_key as cacheKey, cache_val_bytes as cacheValueBytes FROM persistent_cache ORDER BY access_time_millis ASC");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (ghiVarA.l()) {
                        long jB = ghiVarA.b(0);
                        byte[] bArrM = ghiVarA.m(1);
                        try {
                            vuc vucVarP = vuc.p(ink.a, bArrM, 0, bArrM.length, vtp.a());
                            vuc.B(vucVarP);
                            inkVar = (ink) vucVarP;
                        } catch (Exception unused) {
                            krd.c("Failed to parse byteArray into CacheKey proto");
                            inkVar = null;
                        }
                        if (inkVar == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.google.android.apps.googletv.app.data.store.CacheKey', but it was NULL.");
                        }
                        arrayList.add(new ijg(jB, inkVar, (int) ghiVarA.b(2)));
                    }
                    return arrayList;
                } finally {
                }
            case 7:
                ghiVarA = ((gic) obj).a("SELECT SUM(cache_val_bytes) FROM persistent_cache");
                try {
                    if (ghiVarA.l() && !ghiVarA.k(0)) {
                        numValueOf = Integer.valueOf((int) ghiVarA.b(0));
                    }
                    return numValueOf;
                } finally {
                }
            case 8:
                try {
                    ((gic) obj).a("DELETE FROM persistent_cache").l();
                    return ygi.a;
                } finally {
                }
            case 9:
                try {
                    ((gic) obj).a("\n      DELETE FROM media_library_item_metadata\n    ").l();
                    return ygi.a;
                } finally {
                }
            case 10:
                ksn ksnVar = (ksn) obj;
                ipc ipcVar = iqo.a;
                ksnVar.getClass();
                return ksnVar.a;
            case 11:
                ira iraVar = (ira) obj;
                iraVar.getClass();
                return Boolean.valueOf(iraVar.b <= 0);
            case 12:
                ((dav) obj).getClass();
                iod iodVar5 = iod.a;
                iodVar5.getClass();
                return iodVar5;
            case 13:
                iti itiVar = (iti) obj;
                itiVar.getClass();
                itiVar.c();
                return ygi.a;
            case 14:
                iti itiVar2 = (iti) obj;
                itiVar2.getClass();
                itiVar2.a();
                return ygi.a;
            case 15:
                iti itiVar3 = (iti) obj;
                itiVar3.getClass();
                itiVar3.b();
                return ygi.a;
            case 16:
                ((ith) obj).getClass();
                return true;
            case 17:
                ith ithVar = (ith) obj;
                ithVar.getClass();
                return Boolean.valueOf(ithVar.b() != null);
            case 18:
                ((ith) obj).getClass();
                return true;
            case 19:
                int i = MediaDeviceFloatingActionButton.d;
                ((ith) obj).getClass();
                return Boolean.valueOf(!r11.o());
            default:
                int i2 = MediaDeviceFloatingActionButton.d;
                ((ith) obj).getClass();
                return Boolean.valueOf(!r11.o());
        }
    }
}
