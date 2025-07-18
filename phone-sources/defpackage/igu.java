package defpackage;

import android.os.Bundle;
import com.google.android.apps.googletv.app.presentation.pages.home.GtvHomePageActivity;
import com.google.firebase.messaging.FirebaseMessaging;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class igu implements onv {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ igu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, yjv] */
    @Override // defpackage.onv
    public final void e(Object obj) throws NumberFormatException {
        switch (this.b) {
            case 0:
                this.a.a(obj);
                break;
            case 1:
                this.a.a(obj);
                break;
            case 2:
                GtvHomePageActivity.$r8$lambda$lu4qoCJbCISzjA3NMIH8j1dNF9g((GtvHomePageActivity) this.a, (ulp) obj);
                break;
            case 3:
                ((nmg) this.a).k = new ntp((Bundle) obj);
                break;
            case 4:
                nxb nxbVar = (nxb) obj;
                int i = nor.a;
                boolean z = false;
                if (nxbVar != null && nxbVar.a()) {
                    z = true;
                }
                ((kwy) this.a).w(Boolean.valueOf(z));
                break;
            case 5:
                ConcurrentHashMap concurrentHashMap = opz.a;
                this.a.a(obj);
                break;
            case 6:
                tvn tvnVar = oxn.a;
                this.a.a(obj);
                break;
            case 7:
                upe upeVar = (upe) obj;
                if (((FirebaseMessaging) this.a).i() && upeVar.d.a() != null && !upeVar.e()) {
                    upeVar.d(0L);
                    break;
                }
                break;
            default:
                num numVar = (num) obj;
                if (numVar != null) {
                    Object obj2 = this.a;
                    uiv.w(numVar.a);
                    ((FirebaseMessaging) obj2).d();
                    break;
                }
                break;
        }
    }
}
