package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class kh implements ctj {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kh(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [abk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, yc] */
    @Override // defpackage.ctj
    public final Object a() {
        switch (this.b) {
            case 0:
                Object obj = this.a;
                cih cihVar = new cih(new ki(obj, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (!dnx.aB(Looper.myLooper(), Looper.getMainLooper())) {
                        new Handler(Looper.getMainLooper()).post(new bb(obj, (Object) cihVar, 7, (byte[]) null));
                        break;
                    } else {
                        ((kk) obj).p(cihVar);
                        break;
                    }
                }
                break;
            case 1:
                break;
            case 2:
                ?? r0 = ((cih) this.a).a;
                if (r0 != 0) {
                    r0.run();
                }
                break;
            case 3:
                xs xsVar = new xs();
                ?? r1 = this.a;
                yf yfVarN = r1 instanceof wy ? ((wy) r1).n() : yd.a;
                yfVarN.getClass();
                cmt cmtVar = new cmt(r1.K(), xsVar, yfVarN);
                int i = cun.a;
                break;
            case 4:
                ((abf) this.a).a.c();
                break;
            case 5:
                ((abf) this.a).a.b();
                break;
            case 6:
                ((abf) this.a).a.c();
                break;
            case 7:
                ((abf) this.a).a();
                break;
            default:
                ?? r02 = this.a;
                r02.m().a(new abg(r02));
                break;
        }
        return cse.a;
    }
}
