package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.apps.googletv.app.player.offline.OfflineService;
import com.google.common.collect.UnmodifiableIterator;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class etv implements Handler.Callback {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ etv(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v37, types: [idy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [ecu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [ecx, java.lang.Object] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        byte[] bArr = null;
        switch (this.b) {
            case 0:
                Object obj = this.a;
                etw etwVar = (etw) obj;
                if (etwVar.f) {
                    return false;
                }
                int i = message.what;
                if (i != 1) {
                    if (i != 2) {
                        return false;
                    }
                    etwVar.c();
                    etx etxVar = etwVar.a;
                    Object obj2 = message.obj;
                    String str = edt.a;
                    etxVar.f.post(new eoy(etxVar, (IOException) obj2, 7, bArr));
                    return true;
                }
                try {
                    final etx etxVar2 = ((etw) obj).a;
                    etxVar2.i.getClass();
                    etxVar2.i.e.getClass();
                    etxVar2.i.c.getClass();
                    if (etxVar2.d == 2) {
                        int length = etxVar2.i.e.length;
                        int length2 = ((ekc[]) etxVar2.o.a).length;
                        etxVar2.k = (List[][]) Array.newInstance((Class<?>) List.class, length, length2);
                        etxVar2.l = (List[][]) Array.newInstance((Class<?>) List.class, length, length2);
                        for (int i2 = 0; i2 < length; i2++) {
                            for (int i3 = 0; i3 < length2; i3++) {
                                etxVar2.k[i2][i3] = new ArrayList();
                                etxVar2.l[i2][i3] = DesugarCollections.unmodifiableList(etxVar2.k[i2][i3]);
                            }
                        }
                        etxVar2.j = new exi[length];
                        etxVar2.n = new qza[length];
                        for (int i4 = 0; i4 < length; i4++) {
                            etxVar2.j[i4] = etxVar2.i.e[i4].h();
                            sro sroVarC = etxVar2.c(i4);
                            ezd ezdVar = etxVar2.e;
                            ezdVar.i = (qza) sroVarC.c;
                            qza[] qzaVarArr = etxVar2.n;
                            qza qzaVar = ezdVar.i;
                            qzaVar.getClass();
                            qzaVarArr[i4] = qzaVar;
                        }
                        etxVar2.g = true;
                        etxVar2.h = true;
                    } else {
                        a.ab(true);
                        etxVar2.i.d.getClass();
                        etxVar2.g = true;
                    }
                    etxVar2.f.post(new Runnable() { // from class: etp
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r5v6, types: [com.google.common.collect.BiMap, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.Iterable, java.lang.Object] */
                        @Override // java.lang.Runnable
                        public final void run() {
                            etx etxVar3 = etxVar2;
                            jdq jdqVar = etxVar3.m;
                            jdqVar.getClass();
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            enr enrVar = jdqVar.b;
                            int iA = enrVar.a();
                            int i5 = 0;
                            for (int i6 = 0; i6 < iA; i6++) {
                                gsf gsfVarF = enrVar.f(i6);
                                gsfVarF.getClass();
                                ?? r9 = gsfVarF.b;
                                r9.getClass();
                                ArrayList arrayList = new ArrayList();
                                for (Object obj3 : r9) {
                                    if (((enp) obj3).b == 3) {
                                        arrayList.add(obj3);
                                    }
                                }
                                ArrayList arrayList2 = new ArrayList(yfm.z(arrayList, 10));
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    List list = ((enp) it.next()).c;
                                    list.getClass();
                                    ArrayList arrayList3 = new ArrayList();
                                    Iterator it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        String str2 = ((enz) it2.next()).e.N;
                                        if (str2 != null) {
                                            arrayList3.add(str2);
                                        }
                                    }
                                    arrayList2.add(Boolean.valueOf(linkedHashSet.addAll(arrayList3)));
                                }
                            }
                            String[] strArr = (String[]) linkedHashSet.toArray(new String[0]);
                            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
                            try {
                                etxVar3.a();
                                eyu eyuVar = new eyu(etx.a);
                                eyuVar.z = true;
                                eyuVar.t();
                                for (eke ekeVar : etxVar3.o.s()) {
                                    int iDk = ekeVar.dk();
                                    eyuVar.y(iDk, iDk != 3);
                                }
                                int i7 = etxVar3.d;
                                a.ab(true);
                                a.ab(etxVar3.g);
                                int length3 = etxVar3.i.e.length;
                                int length4 = strArr2.length;
                                int i8 = 0;
                                while (i8 < length4) {
                                    eyuVar.w(strArr2[i8]);
                                    eyv eyvVar = new eyv(eyuVar);
                                    for (int i9 = i5; i9 < length3; i9++) {
                                        ezd ezdVar2 = etxVar3.e;
                                        ezdVar2.k(eyvVar);
                                        etxVar3.c(i9);
                                        UnmodifiableIterator it3 = eyvVar.am.values().iterator();
                                        while (it3.hasNext()) {
                                            ebb ebbVar = (ebb) it3.next();
                                            eyu eyuVar2 = new eyu(eyvVar);
                                            eyuVar2.h(ebbVar);
                                            ezdVar2.k(new eyv(eyuVar2));
                                            etxVar3.c(i9);
                                        }
                                    }
                                    i8++;
                                    i5 = 0;
                                }
                                jdr jdrVar = jdqVar.a;
                                vfg vfgVar = (vfg) jdrVar.f.b.inverse().get(enrVar);
                                byte[] bArrH = vfgVar != null ? vfgVar.h() : null;
                                dzt dztVar = etxVar3.b;
                                Uri uri = dztVar.i;
                                eue eueVar = new eue(uri.toString(), uri);
                                eueVar.b(dztVar.j);
                                dzq dzqVar = dztVar.k;
                                eueVar.b = dzqVar != null ? dzqVar.a() : null;
                                eueVar.c = dztVar.n;
                                eueVar.d = bArrH;
                                if (i7 == 2) {
                                    etxVar3.a();
                                    ArrayList arrayList4 = new ArrayList();
                                    ArrayList arrayList5 = new ArrayList();
                                    int length5 = etxVar3.k.length;
                                    for (int i10 = 0; i10 < length5; i10++) {
                                        arrayList5.clear();
                                        int length6 = etxVar3.k[i10].length;
                                        for (int i11 = 0; i11 < length6; i11++) {
                                            arrayList5.addAll(etxVar3.k[i10][i11]);
                                        }
                                        arrayList4.addAll(etxVar3.i.e[i10].i(arrayList5));
                                    }
                                    eueVar.a = arrayList4;
                                }
                                euh euhVarA = eueVar.a();
                                euh euhVar = new euh(euhVarA.a, euhVarA.b, euhVarA.c, euhVarA.d, jdqVar.c, euhVarA.f, euhVarA.g, euhVarA.h, euhVarA.i);
                                ksy ksyVar = jdqVar.d;
                                euh euhVar2 = new euh(ksyVar.c, euhVar.b, euhVar.c, euhVar.d, euhVar.e, euhVar.f, euhVar.g, euhVar.h, euhVar.i);
                                Context context = jdqVar.e;
                                euk.m(context, euk.i(context, OfflineService.class, "androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD", true).putExtra("download_request", euhVar2).putExtra("stop_reason", 0), true);
                                etxVar3.b();
                                ykr.q(jdrVar.b, null, 0, new ixs(jdrVar, context, ksyVar, (yih) null, 7), 3);
                            } catch (eii e) {
                                throw new IllegalStateException(e);
                            }
                        }
                    });
                    return true;
                } catch (eii e) {
                    etwVar.b.obtainMessage(2, new IOException(e)).sendToTarget();
                    break;
                }
            case 1:
                fvu fvuVar = (fvu) this.a;
                Iterator it = ((CopyOnWriteArraySet) fvuVar.f).iterator();
                while (it.hasNext()) {
                    ecy ecyVar = (ecy) it.next();
                    ?? r3 = fvuVar.e;
                    if (!ecyVar.c && ecyVar.b) {
                        dzb dzbVarI = ecyVar.d.i();
                        ecyVar.d = new rin(null, null);
                        ecyVar.b = false;
                        r3.a(ecyVar.a, dzbVarI);
                    }
                    if (fvuVar.c.c()) {
                        return true;
                    }
                }
                return true;
            case 2:
                int i5 = message.what;
                Object obj3 = this.a;
                if (i5 == 1) {
                    List list = (List) message.obj;
                    euc eucVar = (euc) obj3;
                    eucVar.h = true;
                    eucVar.l = DesugarCollections.unmodifiableList(list);
                    boolean zG = eucVar.g();
                    Iterator it2 = eucVar.e.iterator();
                    while (it2.hasNext()) {
                        ((eua) it2.next()).c(eucVar);
                    }
                    if (zG) {
                        eucVar.b();
                    }
                } else if (i5 == 2) {
                    int i6 = message.arg1;
                    int i7 = message.arg2;
                    euc eucVar2 = (euc) obj3;
                    eucVar2.f -= i6;
                    eucVar2.g = i7;
                    if (eucVar2.f()) {
                        Iterator it3 = eucVar2.e.iterator();
                        while (it3.hasNext()) {
                            ((eua) it3.next()).f();
                        }
                    }
                } else {
                    if (i5 != 3) {
                        throw new IllegalStateException();
                    }
                    eyy eyyVar = (eyy) message.obj;
                    euc eucVar3 = (euc) obj3;
                    eucVar3.l = DesugarCollections.unmodifiableList(eyyVar.b);
                    Object obj4 = eyyVar.d;
                    boolean zG2 = eucVar3.g();
                    if (eyyVar.a) {
                        Iterator it4 = eucVar3.e.iterator();
                        while (it4.hasNext()) {
                            ((eua) it4.next()).b(eucVar3, (etn) obj4);
                        }
                    } else {
                        Iterator it5 = eucVar3.e.iterator();
                        while (it5.hasNext()) {
                            ((eua) it5.next()).a(eucVar3, (etn) obj4, (Exception) eyyVar.c);
                        }
                    }
                    if (zG2) {
                        eucVar3.b();
                    }
                }
                return true;
            case 3:
                if (message.what == 1) {
                    ((htn) this.a).c((htm) message.obj);
                    return true;
                }
                if (message.what != 2) {
                    return false;
                }
                ((htn) this.a).c.j((htm) message.obj);
                return false;
            case 4:
                this.a.c(message.obj);
                return true;
            case 5:
                int i8 = message.arg1;
                Object obj5 = this.a;
                synchronized (obj5) {
                    SparseArray sparseArray = ((nus) obj5).d;
                    nuu nuuVar = (nuu) sparseArray.get(i8);
                    if (nuuVar == null) {
                        Log.w("MessengerIpcClient", a.cf(i8, "Received response for unknown request: "));
                    } else {
                        sparseArray.remove(i8);
                        ((nus) obj5).d();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            nuuVar.c(new nuv("Not supported by GmsCore"));
                        } else {
                            nuuVar.a(data);
                        }
                    }
                }
                return true;
            case 6:
                int i9 = message.what;
                if (i9 == 0) {
                    HashMap map = ((obi) this.a).c;
                    synchronized (map) {
                        obh obhVar = (obh) message.obj;
                        obj objVar = (obj) map.get(obhVar);
                        if (objVar != null && objVar.b()) {
                            if (objVar.c) {
                                obi obiVar = objVar.g;
                                obiVar.e.removeMessages(1, objVar.e);
                                obiVar.f.b(obiVar.d, objVar);
                                objVar.c = false;
                                objVar.b = 2;
                            }
                            map.remove(obhVar);
                        }
                    }
                    return true;
                }
                if (i9 != 1) {
                    return false;
                }
                HashMap map2 = ((obi) this.a).c;
                synchronized (map2) {
                    obh obhVar2 = (obh) message.obj;
                    obj objVar2 = (obj) map2.get(obhVar2);
                    if (objVar2 != null && objVar2.b == 3) {
                        Log.e("GmsClientSupervisor", a.ct(obhVar2, "Timeout waiting for ServiceConnection callback "), new Exception());
                        ComponentName componentName = objVar2.f;
                        if (componentName == null) {
                            componentName = obhVar2.c;
                        }
                        if (componentName == null) {
                            String str2 = obhVar2.b;
                            ocv.aF(str2);
                            componentName = new ComponentName(str2, "unknown");
                        }
                        objVar2.onServiceDisconnected(componentName);
                    }
                }
                return true;
            default:
                if (message.what == 0) {
                    ((sbd) this.a).c((sbe) message.obj);
                }
                return true;
        }
    }

    public etv(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
