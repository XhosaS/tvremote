package defpackage;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ukf implements ukj {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ukf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.ukj
    public final Object a(uki ukiVar) {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? FirebaseMessagingRegistrar.lambda$getComponents$0((ulb) this.a, ukiVar) : new ums((Context) ukiVar.e(Context.class), ((uiz) ukiVar.e(uiz.class)).g(), uiv.d(ukiVar, umt.class), ukiVar.b(upt.class), (Executor) ukiVar.d((ulb) this.a)) : this.a : this.a;
    }
}
