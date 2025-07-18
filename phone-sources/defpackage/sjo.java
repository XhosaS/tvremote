package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.zip.GZIPInputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sjo {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    public final qgx a() {
        try {
            Map mapB = b();
            Object objA = this.c;
            qgu qguVar = qgu.a;
            if (mapB.containsKey(qguVar)) {
                List list = (List) mapB.get(qguVar);
                if (!list.isEmpty() && sij.L((CharSequence) list.get(0), "gzip")) {
                    objA = tzu.a(new GZIPInputStream(new ByteArrayInputStream((byte[]) objA)));
                }
            }
            this.d = objA;
        } catch (IOException e) {
            this.e = e;
        }
        ?? r4 = this.b;
        if (r4 == 0) {
            throw new IllegalStateException("Missing required properties: headers");
        }
        Object obj = this.f;
        Object obj2 = this.a;
        Object obj3 = this.c;
        Object obj4 = this.d;
        byte[] bArr = (byte[]) obj4;
        byte[] bArr2 = (byte[]) obj3;
        return new qgx((Integer) obj, (String) obj2, r4, bArr2, bArr, (Exception) this.e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final Map b() {
        ?? r0 = this.b;
        if (r0 != 0) {
            return r0;
        }
        throw new IllegalStateException("Property \"headers\" has not been set");
    }

    public final void c(Context context) {
        context.getClass();
        this.f = context;
    }

    public final void d() {
        this.d = "OneGoogle";
    }

    public final void e(Executor executor) {
        executor.getClass();
        this.c = executor;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final riv f() {
        Object obj = this.f;
        obj.getClass();
        ?? r3 = this.c;
        r3.getClass();
        Object obj2 = this.b;
        obj2.getClass();
        Object obj3 = this.a;
        obj3.getClass();
        Object obj4 = this.d;
        obj4.getClass();
        ntp ntpVar = new ntp(obj, (byte[]) null);
        osk oskVar = new osk();
        Object handler = this.e;
        if (handler == null) {
            HandlerThread handlerThread = new HandlerThread("ProtoDataStore-Message-Handler");
            handlerThread.start();
            handler = new Handler(handlerThread.getLooper());
        }
        slc slcVar = new slc();
        Context context = (Context) obj;
        slcVar.a = context.getApplicationContext();
        slcVar.c = "com.google.android.gms.permission.INTERNAL_BROADCAST";
        slcVar.b = new pri(0);
        slcVar.d = (Handler) handler;
        slf slfVar = new slf(slcVar);
        npj npjVar = omt.a;
        nwq nwqVar = new nwq(context, (byte[]) null);
        nvj nvjVar = nvj.a;
        return new riv(context, r3, (String) obj4, (aafi) obj3, (unc) obj2, ntpVar, oskVar, slfVar, nwqVar);
    }
}
