package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tkb extends tjk {
    private static final String j = Build.MANUFACTURER + " " + Build.MODEL;
    public tig e;
    public tju f;
    public tjp g;
    tkg h;
    tka i;
    private tjx k;
    private final String l;
    private final String m;

    public tkb(Context context, tkm tkmVar, zft zftVar, Handler handler) {
        super(context, tkmVar, zftVar, handler);
        String strF = null;
        if (j().booleanValue() && (tkmVar instanceof tkx)) {
            strF = ((tkx) tkmVar).f();
        }
        this.m = strF;
        this.l = context.getPackageName();
        tjy tjyVar = new tjy(this);
        this.g = tjyVar;
        tjyVar.execute(context);
    }

    private final int i() {
        return this.d.a().getPort();
    }

    private final Boolean j() {
        tkm tkmVar = this.d;
        if (tkmVar instanceof tkx) {
            return ((tkx) tkmVar).d();
        }
        return false;
    }

    private final InetAddress k() {
        try {
            return InetAddress.getByName(this.d.a().getHost());
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    @Override // defpackage.tjo
    public final void a() {
        tjp tjpVar = this.g;
        if (tjpVar != null) {
            tjpVar.cancel(true);
        }
        tjx tjxVar = this.k;
        if (tjxVar != null) {
            tjxVar.c();
            this.k = null;
        }
        tju tjuVar = this.f;
        if (tjuVar != null) {
            ((tjt) tjuVar.f).b();
            this.f = null;
        }
    }

    @Override // defpackage.tjo
    public final void b(tms tmsVar) {
        tjx tjxVar;
        Socket socket;
        if (this.g == null && ((tjxVar = this.k) == null || (socket = tjxVar.g) == null || !socket.isConnected())) {
            return;
        }
        tjx tjxVar2 = this.k;
        if (tjxVar2.a().booleanValue() && tmsVar.b == 10 && ((tnj) tmsVar.c).c == 26 && tjxVar2.d != null) {
            tkm tkmVar = tjxVar2.k;
            if (tkmVar instanceof tkx) {
                tjxVar2.e = ((tkx) tkmVar).e("isDeviceInStandbyMode");
            }
            if (tjxVar2.e.equals("true")) {
                tka tkaVar = tjxVar2.l;
                ((tkb) tkaVar.b).g(tkaVar.a);
            }
        }
        if (tmsVar.b == 2) {
            boolean z = tjxVar2.f;
            boolean z2 = (((tmr) tmsVar.c).c & (-33)) != 0;
            tjxVar2.f = z2;
            if (z != z2) {
                Handler handler = tjxVar2.c;
                handler.sendMessage(handler.obtainMessage(4, Boolean.valueOf(z2)));
            }
        }
        Handler handler2 = tjxVar2.c;
        handler2.sendMessage(handler2.obtainMessage(3, tmsVar));
    }

    @Override // defpackage.tjo
    public final void d(String str) {
        tju tjuVar = this.f;
        if (tjuVar != null) {
            ((tjt) tjuVar.f).c(str);
        }
    }

    public final void e(boolean z) {
        if (j().booleanValue()) {
            g(z);
        } else {
            f(z);
        }
    }

    public final void f(boolean z) {
        tjx tjxVar = new tjx(this.c, k(), i(), new tjz(this, this, this.b), this.e, this.m, this.d, this.i);
        this.k = tjxVar;
        if (z) {
            tjxVar.m.c();
        }
        tjxVar.c.post(new tci(tjxVar, 13));
    }

    public final void g(boolean z) {
        this.i = new tka(this, z);
        if (this.h == null) {
            this.h = new tkg(this.c, k(), this.e, this.m, this.i);
        }
        tkg tkgVar = this.h;
        tkgVar.c.post(new tci(tkgVar, 15));
    }

    public final void h() {
        this.k = null;
        tju tjuVar = new tju(k(), i() + 1, this.e, new zft(this, null), this.l, j);
        this.f = tjuVar;
        ((tjt) tjuVar.f).start();
    }
}
