package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.hardware.hdmi.HdmiControlManager;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adx {
    private static volatile adx b;
    public final Object a;

    public adx(Object obj) {
        this.a = obj;
    }

    public static adx a() {
        if (b == null) {
            synchronized (adx.class) {
                if (b == null) {
                    b = new adx();
                }
            }
        }
        return b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final void b(adp adpVar) {
        this.a.add(0, adpVar);
    }

    public final Bundle c(String str) {
        abn abnVar = (abn) this.a;
        if (!abnVar.e) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = abnVar.d;
        if (bundle == null) {
            return null;
        }
        Bundle bundleA = bundle.containsKey(str) ? abh.a(bundle, str) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            abnVar.d = null;
        }
        return bundleA;
    }

    public final void d(String str, abj abjVar) {
        Object obj = this.a;
        synchronized (((abn) obj).f) {
            Map map = ((abn) obj).b;
            if (map.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            map.put(str, abjVar);
        }
    }

    public final void e(Exception exc) {
        ((amn) this.a).k(exc);
    }

    public final void f(Object obj) {
        ((amn) this.a).l(obj);
    }

    public final void g(Exception exc) {
        qp.q(exc, "Exception must not be null");
        Object obj = this.a;
        amn amnVar = (amn) obj;
        synchronized (amnVar.a) {
            if (((amn) obj).b) {
                return;
            }
            ((amn) obj).b = true;
            ((amn) obj).d = exc;
            amnVar.e.h((ami) obj);
        }
    }

    public final void h(Object obj) {
        ((amn) this.a).n(obj);
    }

    public final void i() {
        ((amn) ((adx) this.a).a).n(null);
    }

    public final ApplicationInfo j(String str, int i) {
        return ((Context) this.a).getPackageManager().getApplicationInfo(str, i);
    }

    public final PackageInfo k(String str, int i) {
        return ((Context) this.a).getPackageManager().getPackageInfo(str, i);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    public final void l(cau cauVar) {
        bdq.h(!cauVar.a(), "range must not be empty, but was %s", cauVar);
        this.a.add(cauVar);
    }

    public adx(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public adx(byte[] bArr) {
        this.a = new amn();
    }

    public adx(byte[] bArr, byte[] bArr2) {
        this.a = new adx((byte[]) null);
    }

    private adx() {
        this.a = new CopyOnWriteArrayList();
    }

    public adx(adx adxVar) {
        this.a = new amn();
        byj byjVar = new byj(this, null);
        Object obj = adxVar.a;
        amn amnVar = (amn) obj;
        amnVar.i(amm.a, new alw(byjVar));
    }

    public adx(Context context, byte[] bArr, byte[] bArr2) {
        this.a = context.getSharedPreferences("keystore-cache-version-file", 0);
    }

    public adx(Context context, byte[] bArr) {
        this.a = (HdmiControlManager) context.getSystemService(HdmiControlManager.class);
    }

    public adx(short[] sArr) {
        this.a = new ArrayList();
    }
}
