package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.videos.R;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pkg {
    public final Object a;
    public final Object b;

    public pkg(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public static nuh n(int i) {
        nuh nuhVar = new nuh((short[]) null);
        nuhVar.a = i;
        return nuhVar;
    }

    public static pkg o(iea ieaVar, idb idbVar, ksy ksyVar, Resources resources) {
        krz krzVar = new krz(ieg.a);
        krzVar.a = new ids[]{ieaVar};
        krzVar.d(new lxf(ieaVar, idbVar, ksyVar, resources, 7));
        iea ieaVarA = krzVar.a();
        iff iffVar = new iff();
        iffVar.f(R.layout.details_rentalexpiry);
        iffVar.c = new mlw(6);
        iffVar.g(ksd.a());
        iffVar.d();
        return new pkg(ieaVarA, iffVar.c(), (char[]) null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, qpl] */
    private final void p(List list, String str, int i, int i2) {
        if (str.isEmpty()) {
            return;
        }
        list.add(this.b.d(str, i, i2));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, qpl] */
    private final void q(List list, String str) {
        if (str.isEmpty()) {
            return;
        }
        list.add(this.b.c());
    }

    public final pjr a(int i) {
        return new pjr(ntp.y(i), new oyj(16), (pkg) this.a, null);
    }

    public final void b(boolean z) {
        if (z) {
            return;
        }
        e(new IllegalStateException());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final void c(Object obj) {
        ?? r0 = this.a;
        if (r0.isEmpty()) {
            return;
        }
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            Object obj2 = ((pku) it.next()).a;
            long jAd = rdd.ad();
            if (jAd != -1) {
                vty vtyVar = ((pju) obj).e;
                long j = jAd * 1000;
                if (!vtyVar.b.A()) {
                    vtyVar.u();
                }
                pka pkaVar = (pka) vtyVar.b;
                pka pkaVar2 = pka.a;
                pkaVar.b |= 4;
                pkaVar.f = j;
            }
            pju pjuVar = (pju) obj;
            pks pksVar = pjuVar.c;
            if (pksVar instanceof pkd) {
                pkd pkdVar = (pkd) pksVar;
                if (!pjuVar.e.bJ(pnj.a)) {
                    pkdVar.q(false);
                } else if (!pksVar.o()) {
                    pkdVar.q(true);
                }
            }
            pkv pkvVar = (pkv) obj2;
            pky pkyVar = pkvVar.b;
            pks pksVar2 = pjuVar.c;
            vty vtyVar2 = pjuVar.e;
            ucy ucyVar = ((pka) vtyVar2.b).d;
            if (ucyVar == null) {
                ucyVar = ucy.a;
            }
            if ((ucyVar.b & RecyclerView.ItemAnimator.FLAG_MOVED) != 0) {
                int iR = pksVar2.r();
                int iAL = a.aL(((pka) vtyVar2.b).e);
                if ((iAL != 0 ? iAL : 1) == iR || !pkyVar.d(pjuVar, iR)) {
                }
            } else {
                pkyVar.a.add(obj);
            }
            pkvVar.b();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final void d(Object obj) {
        ?? r0 = this.a;
        if (r0.isEmpty()) {
            return;
        }
        for (pku pkuVar : r0) {
            ((pju) obj).e();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, pkq] */
    public final void e(RuntimeException runtimeException) {
        this.b.a(runtimeException);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final boolean f() {
        return !this.a.isEmpty();
    }

    public final List g(uyc uycVar) {
        ArrayList arrayList = new ArrayList();
        Context context = (Context) this.a;
        int iB = pgy.b(uycVar, context);
        int iA = pgy.a(uycVar, context);
        p(arrayList, uycVar.c == 5 ? (String) uycVar.d : "", iB, iA);
        Iterator<E> it = uycVar.l.iterator();
        while (it.hasNext()) {
            uye uyeVar = ((uyw) it.next()).e;
            if (uyeVar == null) {
                uyeVar = uye.a;
            }
            p(arrayList, uyeVar.b == 1 ? (String) uyeVar.c : "", iB, iA);
        }
        return arrayList;
    }

    public final List h(uyc uycVar) {
        ArrayList arrayList = new ArrayList();
        Context context = (Context) this.a;
        pgy.b(uycVar, context);
        pgy.a(uycVar, context);
        q(arrayList, uycVar.c == 5 ? (String) uycVar.d : "");
        Iterator<E> it = uycVar.l.iterator();
        while (it.hasNext()) {
            uye uyeVar = ((uyw) it.next()).e;
            if (uyeVar == null) {
                uyeVar = uye.a;
            }
            q(arrayList, uyeVar.b == 1 ? (String) uyeVar.c : "");
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, yow] */
    public final uhp i(oyd oydVar, uxd uxdVar) {
        oydVar.getClass();
        return wae.W(this.b, new pfo(this, oydVar, uxdVar, (yih) null, 1));
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, yow] */
    public final uhp j(oyd oydVar, pfq pfqVar) {
        oydVar.getClass();
        pfqVar.getClass();
        return wae.W(this.b, new pfo(this, oydVar, pfqVar, (yih) null, 0));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public final void k(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        ?? r0 = this.a;
        synchronized (r0) {
            map = new HashMap((Map) r0);
        }
        ?? r2 = this.b;
        synchronized (r2) {
            map2 = new HashMap((Map) r2);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).n(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((kwy) entry2.getKey()).v(new nwk(status));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ndw] */
    public final void l(ndu nduVar) {
        ntr ntrVar = new ntr((nts) this.a, vsz.q((byte[]) this.b.a(nduVar.b)));
        ntrVar.o = nduVar.c + (-1) != 1 ? 1 : 2;
        Integer num = nduVar.a;
        if (num != null) {
            ntrVar.i(num.intValue());
        }
        if (ntrVar.b) {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        }
        ntrVar.b = true;
        ((nty) ((nts) ntrVar.a).f).c(ntrVar).k(new ont() { // from class: ndy
            @Override // defpackage.ont
            public final void a(onz onzVar) {
                onzVar.d();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [iea, java.lang.Object] */
    public final void m(ntp ntpVar) {
        ntpVar.c(this.b, (ifc) this.a);
    }

    public pkg(Object obj, Object obj2, byte[] bArr) {
        this.a = obj;
        this.b = obj2;
    }

    public pkg(Object obj, Object obj2, char[] cArr) {
        this.b = obj;
        this.a = obj2;
    }

    public pkg(pkg pkgVar) {
        this.a = pkgVar;
        this.b = new pke(this, pkgVar);
    }

    public pkg(Context context, String str, ndw ndwVar) {
        int i = nts.m;
        nsu nsuVar = new nsu(context, str);
        nsuVar.b(ntn.b);
        nts ntsVar = new nts(nsuVar.a, nsuVar.b, nsuVar.d, nsuVar.c, nsuVar.e);
        try {
            throw new IllegalArgumentException(String.format("Clearcut does not support setting log source int values (%s, %d). Use log source name instead.", str, Integer.valueOf(Integer.parseInt(str))));
        } catch (NumberFormatException unused) {
            this.a = ntsVar;
            this.b = ndwVar;
        }
    }

    public pkg(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.a = new Messenger(iBinder);
            this.b = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.b = new nuo(iBinder);
            this.a = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public pkg() {
        this.a = DesugarCollections.synchronizedMap(new WeakHashMap());
        this.b = DesugarCollections.synchronizedMap(new WeakHashMap());
    }
}
