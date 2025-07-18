package defpackage;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import j$.util.Optional;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffr implements ffp, icr {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/controller/interactorprocessproxy/InteractorProcessClientImpl");
    private final fed b;

    public ffr(feh fehVar, hkz hkzVar) {
        ComponentName componentName = irm.a;
        this.b = fehVar.a(irm.o.getClassName());
        hkzVar.a.add(new ffq(this));
    }

    @Override // defpackage.ffp
    public final void a() {
        ((zdv) ((zdv) a.b()).q("com/google/android/apps/tvsearch/controller/interactorprocessproxy/InteractorProcessClientImpl", "assistantSetupActivityReset", 174, "InteractorProcessClientImpl.java")).u("#assistantSetupActivityReset");
        this.b.a(Message.obtain((Handler) null, 18));
    }

    @Override // defpackage.ffp
    public final void b(boolean z) {
        this.b.a(Message.obtain((Handler) null, true != z ? 7 : 6));
    }

    @Override // defpackage.ffp
    public final void c(String str) {
        Message messageObtain = Message.obtain((Handler) null, 34);
        Bundle bundle = new Bundle();
        bundle.putString("ledAction", str);
        messageObtain.setData(bundle);
        this.b.a(messageObtain);
    }

    @Override // defpackage.ffp
    public final void d(Account account) {
        Message messageObtain = Message.obtain((Handler) null, 54);
        Bundle bundle = new Bundle();
        bundle.putParcelable("account", account);
        messageObtain.setData(bundle);
        this.b.a(messageObtain);
    }

    @Override // defpackage.ffp
    public final void e() {
        ((zdv) ((zdv) a.d()).q("com/google/android/apps/tvsearch/controller/interactorprocessproxy/InteractorProcessClientImpl", "markResetAllDataAndShutdownComplete", 267, "InteractorProcessClientImpl.java")).u("ResetAllDataAndShutdown Complete, yet no future to mark completion.");
    }

    @Override // defpackage.ffp
    public final void f(String str, int i) {
        Message messageObtain = Message.obtain((Handler) null, 1);
        Bundle bundle = new Bundle();
        bundle.putString("searchTerm", str);
        bundle.putInt("discovery_channel", i);
        messageObtain.setData(bundle);
        this.b.a(messageObtain);
    }

    @Override // defpackage.ffp
    public final void g() {
        this.b.a(Message.obtain((Handler) null, 8));
    }

    @Override // defpackage.ffp
    public final void h(String str) {
        Message messageObtain = Message.obtain((Handler) null, 56);
        Bundle bundle = new Bundle();
        bundle.putString("fcmToken", str);
        messageObtain.setData(bundle);
        this.b.a(messageObtain);
    }

    @Override // defpackage.ffp
    public final void i() {
        this.b.a(Message.obtain((Handler) null, 36));
    }

    @Override // defpackage.ffp
    public final void j() {
        this.b.a(Message.obtain((Handler) null, 12));
    }

    @Override // defpackage.ffp
    public final void k(Intent intent) {
        Message messageObtain = Message.obtain((Handler) null, 16);
        messageObtain.setData(intent.getExtras());
        this.b.a(messageObtain);
    }

    @Override // defpackage.ffp
    public final void l(xht xhtVar, String str, Optional optional) {
        int iA;
        Message messageObtain = Message.obtain((Handler) null, 4);
        Bundle bundle = new Bundle();
        try {
            int i = xhtVar.memoizedSerializedSize;
            if ((i & Integer.MIN_VALUE) != 0) {
                iA = abza.a.a(xhtVar.getClass()).a(xhtVar);
                if (iA < 0) {
                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                }
            } else {
                iA = i & Integer.MAX_VALUE;
                if (iA == Integer.MAX_VALUE) {
                    iA = abza.a.a(xhtVar.getClass()).a(xhtVar);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                    xhtVar.memoizedSerializedSize = (Integer.MIN_VALUE & xhtVar.memoizedSerializedSize) | iA;
                }
            }
            byte[] bArr = new byte[iA];
            boolean z = abvz.e;
            abvw abvwVar = new abvw(bArr, 0, iA);
            abza.a.a(xhtVar.getClass()).m(xhtVar, abwa.a(abvwVar));
            abvwVar.K();
            bundle.putByteArray(str, bArr);
            if (optional.isPresent()) {
                bundle.putInt("discovery_channel", ((Integer) optional.get()).intValue());
            }
            messageObtain.setData(bundle);
            this.b.a(messageObtain);
        } catch (IOException e) {
            throw new RuntimeException(a.x(xhtVar, "Serializing ", " to a byte array threw an IOException (should never happen)."), e);
        }
    }

    @Override // defpackage.ffp
    public final void m(String str, xhe xheVar) {
        int iA;
        Message messageObtain = Message.obtain((Handler) null, 5);
        Bundle bundle = new Bundle();
        try {
            int i = xheVar.memoizedSerializedSize;
            if ((i & Integer.MIN_VALUE) != 0) {
                iA = abza.a.a(xheVar.getClass()).a(xheVar);
                if (iA < 0) {
                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                }
            } else {
                iA = i & Integer.MAX_VALUE;
                if (iA == Integer.MAX_VALUE) {
                    iA = abza.a.a(xheVar.getClass()).a(xheVar);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                    xheVar.memoizedSerializedSize = (Integer.MIN_VALUE & xheVar.memoizedSerializedSize) | iA;
                }
            }
            byte[] bArr = new byte[iA];
            boolean z = abvz.e;
            abvw abvwVar = new abvw(bArr, 0, iA);
            abza.a.a(xheVar.getClass()).m(xheVar, abwa.a(abvwVar));
            abvwVar.K();
            bundle.putByteArray(str, bArr);
            messageObtain.setData(bundle);
            this.b.a(messageObtain);
        } catch (IOException e) {
            throw new RuntimeException(a.u(xheVar, " to a byte array threw an IOException (should never happen)."), e);
        }
    }

    @Override // defpackage.ffp
    public final void n(Intent intent) {
        Message messageObtain = Message.obtain((Handler) null, 57);
        messageObtain.setData(intent.getExtras());
        this.b.a(messageObtain);
    }

    @Override // defpackage.ffp
    public final void o(String str, jlv jlvVar) {
        Message messageObtain = Message.obtain((Handler) null, 55);
        Bundle bundle = new Bundle();
        bundle.putString("searchTerm", str);
        bundle.putInt("invocationType", jlvVar.k);
        messageObtain.setData(bundle);
        this.b.a(messageObtain);
    }

    @Override // defpackage.ffp
    public final void p(boolean z) {
        Message messageObtain = Message.obtain((Handler) null, 10);
        Bundle bundle = new Bundle();
        bundle.putBoolean("response_rendered", z);
        messageObtain.setData(bundle);
        this.b.a(messageObtain);
    }

    @Override // defpackage.ffp
    public final void q() {
        this.b.a(Message.obtain((Handler) null, 0));
    }

    @Override // defpackage.ffp
    public final void r(String str, String str2) {
        Message messageObtain = Message.obtain((Handler) null, 9);
        Bundle bundle = new Bundle();
        bundle.putString("activityClassName", str);
        bundle.putString("lifecycleAction", str2);
        ((zdv) ((zdv) a.b()).q("com/google/android/apps/tvsearch/controller/interactorprocessproxy/InteractorProcessClientImpl", "updateActivityLifecycle", 100, "InteractorProcessClientImpl.java")).F("Update %s lifecycle to interactor process, the Activity's lifecycle event is %s", str, str2);
        messageObtain.setData(bundle);
        this.b.a(messageObtain);
    }

    @Override // defpackage.ffp
    public final void s(byte[] bArr) {
        Message messageObtain = Message.obtain((Handler) null, 3);
        Bundle bundle = new Bundle();
        bundle.putByteArray("displayContextParams", bArr);
        messageObtain.setData(bundle);
        this.b.a(messageObtain);
    }

    @Override // defpackage.ffp
    public final void t(int i) {
        Message messageObtain = Message.obtain((Handler) null, -1);
        Bundle bundle = new Bundle();
        bundle.putInt("state", i);
        messageObtain.setData(bundle);
        this.b.a(messageObtain);
    }

    @Override // defpackage.ffp
    public final void u(byte[] bArr) {
        Message messageObtain = Message.obtain((Handler) null, 17);
        Bundle bundle = new Bundle();
        bundle.putByteArray("suggested_queries", bArr);
        messageObtain.setData(bundle);
        this.b.a(messageObtain);
    }

    @Override // defpackage.ffp
    public final void v(byte[] bArr) {
        Message messageObtain = Message.obtain((Handler) null, 53);
        Bundle bundle = new Bundle();
        bundle.putByteArray("xuikitParams", bArr);
        messageObtain.setData(bundle);
        this.b.a(messageObtain);
    }

    @Override // defpackage.ffp
    public final void w() {
        this.b.a(Message.obtain((Handler) null, 2));
    }

    @Override // defpackage.icr
    public final void x(icq icqVar) {
        Bundle bundle = icqVar.a;
        if (bundle.isEmpty()) {
            throw new IllegalStateException("Attempting to send a settings mirror with no content.");
        }
        Message messageA = gzr.a(15);
        messageA.setData(bundle);
        this.b.a(messageA);
    }
}
