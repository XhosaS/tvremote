package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.ComponentConfig;
import com.google.android.libraries.elements.interfaces.CoreUpbSubscriptionProcessorRegistrar;
import com.google.android.libraries.elements.interfaces.EnvironmentDataSource;
import com.google.android.libraries.elements.interfaces.HybridElement;
import com.google.android.libraries.elements.interfaces.SubscriptionObserverConfig;
import com.google.android.libraries.elements.interfaces.SubscriptionProcessorResolver;
import com.google.android.libraries.elements.interfaces.SubscriptionResources;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mma implements mou {
    public final yqt a;
    public final oco b;
    public final aehf c;
    public final mxi d;
    public final ComponentConfig e;
    public final agow f;
    public final boolean g;
    public final aehf h;
    public final oap i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final mzj m;
    private final boolean n;
    private final agfx o;

    public mma(yqt yqtVar, oco ocoVar, aehf aehfVar, mxi mxiVar, agow agowVar, mzj mzjVar, agfx agfxVar, yqt yqtVar2, aehf aehfVar2, yqt yqtVar3, yqt yqtVar4, yqt yqtVar5, yqt yqtVar6, yqt yqtVar7) {
        Boolean bool = false;
        bool.getClass();
        this.a = yqtVar;
        this.b = ocoVar;
        this.d = mxiVar;
        bool.getClass();
        bool.getClass();
        bool.getClass();
        this.c = aehfVar;
        ogi ogiVar = (ogi) ((yqz) yqtVar5.b(new yqi() { // from class: mlv
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return new ogg((ComponentConfig) obj);
            }
        })).a;
        ogiVar.g(true);
        this.e = ogiVar.a();
        this.f = agowVar;
        this.m = mzjVar;
        bool.getClass();
        this.g = ((Boolean) ((yqz) yqtVar2).a).booleanValue();
        this.h = aehfVar2;
        this.n = ((Boolean) ((yqz) yqtVar3).a).booleanValue();
        bool.getClass();
        this.o = agfxVar;
        bool.getClass();
        this.i = ogk.a;
        this.j = ((Boolean) ((yqz) yqtVar4).a).booleanValue();
        bool.getClass();
        this.k = ((Boolean) ((yqz) yqtVar6).a).booleanValue();
        this.l = ((Boolean) ((yqz) yqtVar7).a).booleanValue();
        bool.getClass();
        bool.getClass();
    }

    @Override // defpackage.mou
    public final drn a(final dru druVar, final oal oalVar, final nid nidVar) {
        nnf nnfVarJ = nidVar.j();
        mii miiVar = nhb.I;
        if (!nnfVarJ.b(miiVar)) {
            throw new ocp("Missing ComponentType extension");
        }
        final nhb nhbVar = (nhb) nidVar.j().a(miiVar);
        nlr nlrVarI = nidVar.m() ? nidVar.i() : och.a;
        ofl oflVar = ((nyx) oalVar).e;
        ofl oflVar2 = ofl.a;
        if (oflVar == null) {
            oflVar = oflVar2;
        }
        final ofn ofnVarA = oflVar.a();
        agfo agfoVarF = agfo.f(new Callable() { // from class: mlu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                EnvironmentDataSource mqnVar;
                SubscriptionProcessorResolver subscriptionProcessorResolverCreateEmpty;
                final SubscriptionResources subscriptionResources;
                EnvironmentDataSource environmentDataSource;
                nhb nhbVar2 = nhbVar;
                boolean z = nhbVar2.i() && nhbVar2.g().b(nik.M);
                final mma mmaVar = this.a;
                final oal oalVar2 = oalVar;
                ByteStore byteStore = (ByteStore) ((agow) ((yqz) mmaVar.a).a).a();
                EnvironmentDataSource mqnVar2 = null;
                if (z) {
                    mxi mxiVar = mmaVar.d;
                    yqw.A(nhbVar2 instanceof nrt);
                    ArrayList arrayList = new ArrayList();
                    if (nhbVar2.i()) {
                        nhg nhgVarG = nhbVar2.g();
                        mii miiVar2 = nik.M;
                        if (nhgVarG.b(miiVar2)) {
                            nik nikVar = (nik) nhbVar2.g().a(miiVar2);
                            if (nikVar.h()) {
                                nil nilVarG = nikVar.g();
                                for (int i = 0; i < nilVarG.g(); i++) {
                                    arrayList.add(Integer.valueOf(nilVarG.h(i) - 1));
                                }
                            }
                        }
                    }
                    mqnVar = new mpf(mxiVar.b(oalVar2, new mwu(arrayList)));
                } else {
                    mqnVar = null;
                }
                Integer numValueOf = mmaVar.g ? Integer.valueOf(((nyx) oalVar2).s) : null;
                nhbVar2.k();
                SubscriptionObserverConfig subscriptionObserverConfig = new SubscriptionObserverConfig(false, numValueOf, false, false, false);
                if (mmaVar.k && mmaVar.l) {
                    subscriptionProcessorResolverCreateEmpty = SubscriptionProcessorResolver.createEmpty();
                    if (subscriptionProcessorResolverCreateEmpty == null) {
                        throw new ocp("Error creating SubscriptionProcessorResolverUpb - createEmpty returned null");
                    }
                    CoreUpbSubscriptionProcessorRegistrar.registerProcessors(subscriptionProcessorResolverCreateEmpty, byteStore);
                    if (mqnVar == null) {
                        environmentDataSource = mqnVar2;
                        nyx nyxVar = (nyx) oalVar2;
                        subscriptionResources = new SubscriptionResources(subscriptionObserverConfig, environmentDataSource, null, nyxVar.y, nyxVar.z);
                    } else if (mmaVar.j) {
                        mqnVar2 = new mqn(mqnVar);
                        environmentDataSource = mqnVar2;
                        nyx nyxVar2 = (nyx) oalVar2;
                        subscriptionResources = new SubscriptionResources(subscriptionObserverConfig, environmentDataSource, null, nyxVar2.y, nyxVar2.z);
                    } else {
                        environmentDataSource = mqnVar;
                        nyx nyxVar22 = (nyx) oalVar2;
                        subscriptionResources = new SubscriptionResources(subscriptionObserverConfig, environmentDataSource, null, nyxVar22.y, nyxVar22.z);
                    }
                } else {
                    if (mqnVar == null) {
                        mqnVar = null;
                    } else if (mmaVar.j) {
                        mqnVar = new mqn(mqnVar);
                    }
                    subscriptionProcessorResolverCreateEmpty = (SubscriptionProcessorResolver) SubscriptionProcessorResolver.create(byteStore, mqnVar, null, subscriptionObserverConfig).a(new vs() { // from class: mlq
                        @Override // defpackage.vs
                        public final Object a(Object obj) {
                            return new ocp("Error creating SubscriptionProcessorResolver", (Throwable) obj);
                        }
                    });
                    subscriptionResources = null;
                }
                final SubscriptionProcessorResolver subscriptionProcessorResolver = subscriptionProcessorResolverCreateEmpty;
                nid nidVar2 = nidVar;
                if (nidVar2 == null) {
                    throw new ocp("Missing element");
                }
                if (!nidVar2.n()) {
                    throw new ocp("Invalid component Element: missing type");
                }
                nnf nnfVarJ2 = nidVar2.j();
                mii miiVar3 = nhb.I;
                if (!nnfVarJ2.b(miiVar3)) {
                    throw new ocp("Invalid component Element: missing ComponentType");
                }
                nhb nhbVar3 = (nhb) nidVar2.j().a(miiVar3);
                if (!nhbVar3.j()) {
                    throw new ocp("Invalid component Element: missing TemplateConfig");
                }
                nmp nmpVarH = nhbVar3.h();
                mii miiVar4 = nni.ad;
                if (!nmpVarH.b(miiVar4)) {
                    throw new ocp("Invalid component Element: missing UriTemplateConfig");
                }
                if (!((nni) nhbVar3.h().a(miiVar4)).g()) {
                    throw new ocp("Invalid component Element: missing uri");
                }
                final ofn ofnVar = ofnVarA;
                final dru druVar2 = druVar;
                UpbMessage upbMessage = ((nsu) nidVar2).b;
                final HybridElement hybridElementCreateFromNativeUpb = HybridElement.createFromNativeUpb(upbMessage.a, upbMessage.c.a);
                return agfo.e(new agfq() { // from class: mlr
                    /* JADX WARN: Removed duplicated region for block: B:55:0x015c  */
                    @Override // defpackage.agfq
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void a(defpackage.agfp r18) {
                        /*
                            Method dump skipped, instructions count: 534
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.mlr.a(agfp):void");
                    }
                }).h(new aggy() { // from class: mlw
                    @Override // defpackage.aggy
                    public final void a(Object obj) {
                        ofnVar.f();
                    }
                }, aghm.b).o(new ohb(new aggy() { // from class: mlx
                    @Override // defpackage.aggy
                    public final void a(Object obj) {
                        ofnVar.b();
                    }
                })).h(aghm.c, new aggv() { // from class: mly
                    @Override // defpackage.aggv
                    public final void a() {
                        ofnVar.a();
                    }
                });
            }
        });
        mln mlnVarAA = mlp.aA(druVar);
        mlnVarAA.c(oalVar);
        mlnVarAA.e(agfoVarF);
        mlnVarAA.f(this.b);
        mlnVarAA.g(ofnVarA);
        mlnVarAA.ab();
        mlnVarAA.h(new mmc(nhbVar, nlrVarI));
        mlnVarAA.ad();
        mlnVarAA.aa(this.m);
        mlnVarAA.ac();
        mlnVarAA.d(this.n);
        mlnVarAA.af();
        mlnVarAA.b(this.o);
        mlnVarAA.ae();
        return mlnVarAA;
    }
}
