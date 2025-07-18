package defpackage;

import com.google.firebase.iid.FirebaseInstanceId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aamp implements aamx {
    final FirebaseInstanceId a;

    public aamp(FirebaseInstanceId firebaseInstanceId) {
        this.a = firebaseInstanceId;
    }

    @Override // defpackage.aamx
    public final lvf a() {
        FirebaseInstanceId firebaseInstanceId = this.a;
        String strE = firebaseInstanceId.e();
        if (strE != null) {
            return lvq.c(strE);
        }
        aahf aahfVar = firebaseInstanceId.d;
        FirebaseInstanceId.g(aahfVar);
        return firebaseInstanceId.a(aaml.e(aahfVar), "*").a(lvm.a, new luj() { // from class: aamo
            @Override // defpackage.luj
            public final Object a(lvf lvfVar) {
                return ((aamk) lvfVar.e()).a;
            }
        });
    }

    @Override // defpackage.aamx
    public final void b(aape aapeVar) {
        this.a.i.add(aapeVar);
    }

    @Override // defpackage.aamx
    public final void c() {
        this.a.e();
    }
}
