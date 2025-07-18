package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.google.android.apps.tvsearch.results.suggestion.SuggestionChipList;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lzb implements hzx, fbp {
    public String e;
    public zyu k;
    public fas s;
    private fed v;
    private final eyw x;
    private final agow y;
    private final feh z;
    private static final zdy u = zdy.h("com/google/android/katniss/search/serviceapi/ipc/SearchProcessClient");
    public static final yzq a = yzq.u(0, 1, 2, 5, 22, 23, 30, 34, 40, 41, 49, 59);
    public static boolean b = false;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final Object f = new Object();
    public final List g = new ArrayList();
    final Queue h = new ConcurrentLinkedQueue();
    private boolean w = false;
    public boolean i = false;
    public final Object j = new Object();
    public boolean l = true;
    public final Object m = new Object();
    public boolean n = false;
    public volatile boolean o = true;
    public volatile boolean p = false;
    public volatile boolean q = false;
    public final Queue r = new ConcurrentLinkedQueue();
    public boolean t = false;

    public lzb(eyw eywVar, feh fehVar, agow agowVar) {
        ((zdv) ((zdv) u.b()).q("com/google/android/katniss/search/serviceapi/ipc/SearchProcessClient", "<init>", 245, "SearchProcessClient.java")).u("Create the SearchProcessClient");
        this.x = eywVar;
        this.z = fehVar;
        this.y = agowVar;
    }

    private final void H() {
        synchronized (this.m) {
            if (this.v == null) {
                return;
            }
            while (true) {
                Queue queue = this.h;
                if (queue.isEmpty()) {
                    return;
                } else {
                    this.v.a((Message) queue.poll());
                }
            }
        }
    }

    public static Message g(String str, byte[] bArr) {
        Message messageObtain = Message.obtain((Handler) null, 1);
        Bundle bundle = new Bundle();
        bundle.putByteArray(str, bArr);
        messageObtain.setData(bundle);
        return messageObtain;
    }

    public final void A(boolean z) {
        k();
        Message messageObtain = Message.obtain((Handler) null, 8);
        Bundle bundle = new Bundle();
        bundle.putBoolean("has_tts", z);
        messageObtain.setData(bundle);
        j(messageObtain);
    }

    public final void B(String str) {
        k();
        Message messageObtain = Message.obtain((Handler) null, 0);
        Bundle bundle = new Bundle();
        bundle.putString("foreground_app_package", str);
        bundle.putBoolean("should_warm_up", true);
        messageObtain.setData(bundle);
        j(messageObtain);
    }

    public final void C(String str, int i) {
        k();
        Message messageObtain = Message.obtain((Handler) null, -1);
        Bundle bundle = new Bundle();
        bundle.putString("recognized_text", str);
        bundle.putInt("state", i);
        messageObtain.setData(bundle);
        j(messageObtain);
    }

    public final void D(String str) {
        k();
        Message messageObtain = Message.obtain((Handler) null, 3);
        Bundle bundle = new Bundle();
        bundle.putString("recognized_text", str);
        messageObtain.setData(bundle);
        j(messageObtain);
    }

    public final void E(boolean z) {
        k();
        Message messageObtain = Message.obtain((Handler) null, 29);
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_voice_search", z);
        messageObtain.setData(bundle);
        j(messageObtain);
    }

    public final void F() {
        k();
        j(Message.obtain((Handler) null, 9));
    }

    public final boolean G() {
        return this.c.get() && !this.d.get();
    }

    @Override // defpackage.fbp
    public final void a() {
        k();
        j(Message.obtain((Handler) null, 35));
    }

    @Override // defpackage.fbp
    public final void b(byte[] bArr) {
        u(fbo.x.a(), bArr);
    }

    @Override // defpackage.fbp
    public final void c(boolean z, byte[] bArr) {
        k();
        Message messageObtain = Message.obtain((Handler) null, 34);
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_assistant_content", z);
        bundle.putByteArray("contextual_space_tips_object", bArr);
        messageObtain.setData(bundle);
        j(messageObtain);
    }

    @Override // defpackage.fbp
    public final void d() {
        k();
        Message messageObtain = Message.obtain((Handler) null, 23);
        messageObtain.setData(new Bundle());
        j(messageObtain);
    }

    @Override // defpackage.hzx
    public final void e() {
        k();
        j(Message.obtain((Handler) null, 10));
    }

    @Override // defpackage.hzx
    public final void f() {
        k();
        j(Message.obtain((Handler) null, 11));
    }

    public final lyx h(String str) {
        zyu zyuVar;
        if (this.x.k) {
            synchronized (this.f) {
                zyuVar = this.k;
            }
            if (zyuVar == null) {
                synchronized (this.f) {
                    this.k = new zyu();
                }
                k();
                Message messageObtain = Message.obtain((Handler) null, 7);
                Bundle bundle = new Bundle();
                bundle.putString("foreground_app_package", str);
                messageObtain.setData(bundle);
                j(messageObtain);
            }
        }
        Object obj = this.f;
        synchronized (obj) {
            zyu zyuVar2 = this.k;
            if (zyuVar2 == null) {
                return null;
            }
            try {
                lyx lyxVar = (lyx) zyuVar2.t(1L, TimeUnit.SECONDS);
                synchronized (obj) {
                    this.k = null;
                }
                return lyxVar;
            } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException unused) {
                synchronized (this.f) {
                    if (!zyuVar2.isDone()) {
                        zyuVar2.cancel(true);
                    }
                    this.k = null;
                    ((zdv) ((zdv) u.c()).q("com/google/android/katniss/search/serviceapi/ipc/SearchProcessClient", "getConversationUiParams", 666, "SearchProcessClient.java")).u("Times out while waiting for getting updated Ui Params.");
                    return null;
                }
            }
        }
    }

    public final void i(String str, byte[] bArr) {
        k();
        Message messageObtain = Message.obtain((Handler) null, 18);
        Bundle bundle = new Bundle();
        bundle.putString("action_name", str);
        bundle.putByteArray("action_arg", bArr);
        messageObtain.setData(bundle);
        j(messageObtain);
        this.l = false;
    }

    public final void j(Message message) {
        synchronized (this.m) {
            if (((Boolean) this.y.a()).booleanValue()) {
                if (!this.w) {
                    if (!a.contains(Integer.valueOf(message.what))) {
                        this.h.add(message);
                        return;
                    } else {
                        this.w = true;
                        H();
                    }
                }
                fed fedVar = this.v;
                if (fedVar != null) {
                    fedVar.a(message);
                }
            } else if (!this.n && this.o && this.v == null) {
                this.h.add(message);
            } else {
                fed fedVar2 = this.v;
                if (fedVar2 != null) {
                    fedVar2.a(message);
                } else {
                    ((zdv) ((zdv) u.d()).q("com/google/android/katniss/search/serviceapi/ipc/SearchProcessClient", "checkAndEnqueueMessage", 884, "SearchProcessClient.java")).x("ipcConnection is null. Dropped msg: %s", message);
                }
            }
        }
    }

    public final void k() {
        synchronized (this.m) {
            if (this.n || !this.o) {
                if (this.v == null) {
                    this.v = this.z.a("com.google.android.apps.tvsearch.controller.libas.KatnissSearchProcessService");
                    if (((Boolean) this.y.a()).booleanValue()) {
                        return;
                    }
                    H();
                }
            }
        }
    }

    public final void l() {
        k();
        j(Message.obtain((Handler) null, 42));
        this.l = true;
    }

    public final void m() {
        synchronized (this.m) {
            this.w = false;
            this.h.clear();
        }
    }

    public final void n() {
        synchronized (this.f) {
            this.k = null;
        }
    }

    public final void o() {
        k();
        j(Message.obtain((Handler) null, 5));
    }

    public final void p(boolean z) {
        this.q = z;
        this.r.clear();
        this.p = z;
    }

    public final void q(boolean z) {
        k();
        Message messageObtain = Message.obtain((Handler) null, 6);
        Bundle bundle = new Bundle();
        bundle.putBoolean("follow_on_update", z);
        messageObtain.setData(bundle);
        j(messageObtain);
    }

    public final void r() {
        if (this.p) {
            this.r.add(new Runnable() { // from class: lyy
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.r();
                }
            });
        } else {
            k();
            j(Message.obtain((Handler) null, 32));
        }
    }

    public final void s() {
        if (this.l) {
            return;
        }
        if (G()) {
            l();
            return;
        }
        b = true;
        this.t = true;
        k();
        j(Message.obtain((Handler) null, 2));
        l();
    }

    public final void t() {
        k();
        j(Message.obtain((Handler) null, 27));
    }

    public final void u(String str, byte[] bArr) {
        b = true;
        k();
        j(g(str, bArr));
    }

    public final void v() {
        Message messageObtain = Message.obtain((Handler) null, 15);
        Bundle bundle = new Bundle();
        bundle.putBoolean("finish_activity", true);
        messageObtain.setData(bundle);
        j(messageObtain);
    }

    public final void w(String str) {
        int iA;
        String strA = fbo.ac.a();
        xqu xquVar = xqu.a;
        xqt xqtVar = new xqt();
        if ((xqtVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xqtVar.y();
        }
        xqu xquVar2 = (xqu) xqtVar.b;
        str.getClass();
        xquVar2.b |= 1;
        xquVar2.c = str;
        xqu xquVar3 = (xqu) xqtVar.v();
        try {
            int i = xquVar3.memoizedSerializedSize;
            if ((i & Integer.MIN_VALUE) != 0) {
                iA = abza.a.a(xquVar3.getClass()).a(xquVar3);
                if (iA < 0) {
                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                }
            } else {
                iA = i & Integer.MAX_VALUE;
                if (iA == Integer.MAX_VALUE) {
                    iA = abza.a.a(xquVar3.getClass()).a(xquVar3);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                    xquVar3.memoizedSerializedSize = (xquVar3.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                }
            }
            byte[] bArr = new byte[iA];
            boolean z = abvz.e;
            abvw abvwVar = new abvw(bArr, 0, iA);
            abza.a.a(xquVar3.getClass()).m(xquVar3, abwa.a(abvwVar));
            abvwVar.K();
            u(strA, bArr);
        } catch (IOException e) {
            throw new RuntimeException(a.u(xquVar3, " to a byte array threw an IOException (should never happen)."), e);
        }
    }

    public final void x(final SuggestionChipList suggestionChipList) {
        if (this.p) {
            this.r.add(new Runnable() { // from class: lza
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.x(suggestionChipList);
                }
            });
            return;
        }
        k();
        Message messageObtain = Message.obtain((Handler) null, 39);
        Bundle bundle = new Bundle();
        bundle.putParcelable("suggestion_chip_list", suggestionChipList);
        messageObtain.setData(bundle);
        j(messageObtain);
    }

    public final void y(final boolean z) {
        if (this.p) {
            this.r.add(new Runnable() { // from class: lyz
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.y(z);
                }
            });
            return;
        }
        k();
        Message messageObtain = Message.obtain((Handler) null, 19);
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_playing", z);
        messageObtain.setData(bundle);
        j(messageObtain);
    }

    public final void z(boolean z) {
        synchronized (this.j) {
            this.i = z;
        }
    }
}
