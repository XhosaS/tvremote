package defpackage;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.dynamiclinks.internal.FirebaseDynamicLinkRegistrar;
import com.google.firebase.iid.Registrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ulk implements ukj {
    private final /* synthetic */ int a;

    public /* synthetic */ ulk(int i) {
        this.a = i;
    }

    @Override // defpackage.ukj
    public final Object a(uki ukiVar) {
        switch (this.a) {
            case 0:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.a();
            case 1:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.a();
            case 2:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.a();
            case 3:
                return ull.a;
            case 4:
                return TransportRegistrar.lambda$getComponents$0(ukiVar);
            case 5:
                return TransportRegistrar.lambda$getComponents$1(ukiVar);
            case 6:
                return TransportRegistrar.lambda$getComponents$2(ukiVar);
            case 7:
                return FirebaseDynamicLinkRegistrar.lambda$getComponents$0(ukiVar);
            case 8:
                return Registrar.lambda$getComponents$0(ukiVar);
            case 9:
                return Registrar.lambda$getComponents$1(ukiVar);
            case 10:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(ukiVar);
            default:
                Set setD = uiv.d(ukiVar, upr.class);
                upq upqVar = upq.a;
                if (upqVar == null) {
                    synchronized (upq.class) {
                        upqVar = upq.a;
                        if (upqVar == null) {
                            upqVar = new upq();
                            upq.a = upqVar;
                        }
                    }
                }
                return new upp(setD, upqVar);
        }
    }
}
