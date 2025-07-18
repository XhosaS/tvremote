package defpackage;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class uon implements ony {
    public final /* synthetic */ String a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ uon(FirebaseInstanceId firebaseInstanceId, String str, String str2, int i) {
        this.d = i;
        this.b = firebaseInstanceId;
        this.c = str;
        this.a = str2;
    }

    @Override // defpackage.ony
    public final onz a(Object obj) {
        if (this.d == 0) {
            FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
            String str = (String) obj;
            FirebaseMessaging.m(firebaseMessaging.d).g(firebaseMessaging.c(), this.a, str, firebaseMessaging.g.c());
            Object obj2 = this.c;
            if (obj2 == null || !str.equals(((uoy) obj2).b)) {
                firebaseMessaging.e(str);
            }
            return osk.r(str);
        }
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) this.b;
        und undVar = firebaseInstanceId.d;
        String str2 = (String) obj;
        aafi aafiVar = FirebaseInstanceId.h;
        String strF = firebaseInstanceId.f();
        String str3 = this.a;
        aafiVar.i(strF, (String) this.c, str3, str2, undVar.c());
        return osk.r(new ulp((Object) str2, (byte[]) null));
    }

    public /* synthetic */ uon(FirebaseMessaging firebaseMessaging, String str, uoy uoyVar, int i) {
        this.d = i;
        this.b = firebaseMessaging;
        this.a = str;
        this.c = uoyVar;
    }
}
