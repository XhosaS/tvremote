package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.Component;
import com.google.android.libraries.elements.interfaces.ComponentConfig;
import com.google.android.libraries.elements.interfaces.ComponentSharedResources;
import com.google.android.libraries.elements.interfaces.ComponentState;
import com.google.android.libraries.elements.interfaces.EnvironmentDataSource;
import com.google.android.libraries.elements.interfaces.HybridElement;
import com.google.android.libraries.elements.interfaces.LegacyMaterializationResult;
import com.google.android.libraries.elements.interfaces.MaterializationResult;
import com.google.android.libraries.elements.interfaces.SubscriptionObserverConfig;
import com.google.android.libraries.elements.interfaces.SubscriptionProcessorResolver;
import com.youtube.android.libraries.elements.StatusOr;
import io.grpc.Status;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mqk implements mou {
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
    public final mzj k;
    private final boolean l;
    private final agfx m;

    public mqk(yqt yqtVar, oco ocoVar, aehf aehfVar, mxi mxiVar, agow agowVar, mzj mzjVar, agfx agfxVar, yqt yqtVar2, aehf aehfVar2, yqt yqtVar3, yqt yqtVar4, yqt yqtVar5) {
        this.a = yqtVar;
        this.b = ocoVar;
        this.d = mxiVar;
        Boolean bool = false;
        bool.getClass();
        bool.getClass();
        bool.getClass();
        this.c = aehfVar;
        ogi ogiVar = (ogi) ((yqz) yqtVar5.b(new yqi() { // from class: mqf
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return new ogg((ComponentConfig) obj);
            }
        })).a;
        ogiVar.g(true);
        this.e = ogiVar.a();
        this.f = agowVar;
        this.k = mzjVar;
        bool.getClass();
        this.g = ((Boolean) ((yqz) yqtVar2).a).booleanValue();
        bool.getClass();
        this.h = aehfVar2;
        this.l = ((Boolean) ((yqz) yqtVar3).a).booleanValue();
        bool.getClass();
        this.m = agfxVar;
        bool.getClass();
        this.i = ogj.a;
        this.j = ((Boolean) ((yqz) yqtVar4).a).booleanValue();
        bool.getClass();
        bool.getClass();
        zcp.b.getClass();
        bool.getClass();
    }

    @Override // defpackage.mou
    public final drn a(final dru druVar, final oal oalVar, nid nidVar) {
        final nhf nhfVar = (nhf) nidVar.j().a(nhf.J);
        if (nhfVar == null) {
            throw new ocp("Missing SharedComponentType extension");
        }
        nlr nlrVarI = nidVar.m() ? nidVar.i() : och.a;
        ofl oflVar = ((nyx) oalVar).e;
        ofl oflVar2 = ofl.a;
        if (oflVar == null) {
            oflVar = oflVar2;
        }
        final ofn ofnVarA = oflVar.a();
        agfo agfoVarF = agfo.f(new Callable() { // from class: mqb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                EnvironmentDataSource mqnVar;
                final mqk mqkVar = this.a;
                yqt yqtVar = mqkVar.a;
                final nhf nhfVar2 = nhfVar;
                boolean zL = nhfVar2.l();
                ByteStore byteStore = (ByteStore) ((agow) ((yqz) yqtVar).a).a();
                final oal oalVar2 = oalVar;
                if (zL) {
                    mxi mxiVar = mqkVar.d;
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < nhfVar2.h(); i++) {
                        arrayList.add(Integer.valueOf(nhfVar2.g(i)));
                    }
                    mqnVar = new mpf(mxiVar.b(oalVar2, new mwu(arrayList)));
                } else {
                    mqnVar = null;
                }
                Integer numValueOf = mqkVar.g ? Integer.valueOf(((nyx) oalVar2).s) : null;
                nhfVar2.m();
                SubscriptionObserverConfig subscriptionObserverConfig = new SubscriptionObserverConfig(false, numValueOf, false, false, false);
                if (mqnVar != null && mqkVar.j) {
                    mqnVar = new mqn(mqnVar);
                }
                final ofn ofnVar = ofnVarA;
                final dru druVar2 = druVar;
                final SubscriptionProcessorResolver subscriptionProcessorResolver = (SubscriptionProcessorResolver) SubscriptionProcessorResolver.create(byteStore, mqnVar, null, subscriptionObserverConfig).a(new vs() { // from class: mqg
                    @Override // defpackage.vs
                    public final Object a(Object obj) {
                        return new ocp("Error creating SubscriptionProcessorResolver", (Throwable) obj);
                    }
                });
                return agfo.e(new agfq() { // from class: mqh
                    @Override // defpackage.agfq
                    public final void a(agfp agfpVar) {
                        ComponentState componentState;
                        agfp agfpVar2;
                        HybridElement hybridElementCopyFromNative;
                        Status statusB;
                        final mqk mqkVar2 = mqkVar;
                        mqkVar2.c.a();
                        dru druVar3 = druVar2;
                        mpc mpcVar = (mpc) druVar3.h(mpc.class);
                        final oal oalVar3 = oalVar2;
                        nhf nhfVar3 = nhfVar2;
                        SubscriptionProcessorResolver subscriptionProcessorResolver2 = subscriptionProcessorResolver;
                        final nxl nxlVar = null;
                        if (mpcVar != null) {
                            ComponentState componentStateA = mpcVar.a(((nyx) oalVar3).i);
                            if (componentStateA == null) {
                                componentStateA = ComponentState.create();
                            }
                            componentState = componentStateA;
                        } else {
                            componentState = null;
                        }
                        try {
                            if (nhfVar3.i() == 0) {
                                hybridElementCopyFromNative = HybridElement.create(nhfVar3.j());
                            } else {
                                long jI = nhfVar3.i();
                                MaterializationResult materializationResult = ((nyx) oalVar3).u;
                                hybridElementCopyFromNative = materializationResult == null ? HybridElement.copyFromNative(jI) : HybridElement.createFromNative(jI, materializationResult);
                            }
                            HybridElement hybridElement = hybridElementCopyFromNative;
                            if (hybridElement == null) {
                                agfpVar2 = agfpVar;
                                try {
                                    throw new ocp("Failed to create C++ Component");
                                } catch (ocp e) {
                                    e = e;
                                    agfpVar2.a(e);
                                    return;
                                }
                            }
                            final Component component = (Component) Component.createWithElement(hybridElement, subscriptionProcessorResolver2, (ComponentSharedResources) mqkVar2.h.a(), mqkVar2.e, componentState, null).a(new vs() { // from class: mqi
                                @Override // defpackage.vs
                                public final Object a(Object obj) {
                                    return new ocp("Error creating Component", (Throwable) obj);
                                }
                            });
                            if (mpcVar != null && componentState != null && !componentState.isEmpty()) {
                                mpcVar.b(((nyx) oalVar3).i, componentState);
                            }
                            ofn ofnVar2 = ofnVar;
                            String templateUri = component.getTemplateUri();
                            ofnVar2.e(templateUri);
                            if (!TextUtils.isEmpty(templateUri)) {
                                oalVar3.T(templateUri, "|");
                            }
                            mqa mqaVar = new mqa(ofnVar2, component, oalVar3, agfpVar, null, mqkVar2.f, mqkVar2.i, druVar3);
                            component.setObserver(mqaVar);
                            try {
                                ofn ofnVar3 = mqaVar.a;
                                ofnVar3.g();
                                StatusOr statusOrMaterialize = mqaVar.b.materialize(true);
                                LegacyMaterializationResult legacyMaterializationResult = (LegacyMaterializationResult) statusOrMaterialize.value;
                                if (legacyMaterializationResult == null) {
                                    ocp ocpVar = new ocp(a.p(statusOrMaterialize.status, "Error materializing SharedComponentType: "), statusOrMaterialize.status.asException());
                                    mqaVar.d.d(ocpVar);
                                    statusB = Status.b(ocpVar);
                                    ofnVar3.c();
                                } else {
                                    int materializationNumber = legacyMaterializationResult.getMaterializationNumber();
                                    mlb mlbVar = new mlb(new nbd(aefm.j(ByteBuffer.wrap(legacyMaterializationResult.getElement()))), null, null);
                                    synchronized (mqaVar) {
                                        if (materializationNumber > mqaVar.i) {
                                            mqaVar.i = materializationNumber;
                                            mqaVar.h.k.incrementAndGet();
                                            mqaVar.d.b(mlbVar);
                                        }
                                    }
                                    statusB = Status.OK;
                                }
                                if (!statusB.e()) {
                                    acwf acwfVar = acwf.a;
                                    acwe acweVar = new acwe();
                                    int iValue = statusB.getCode().value();
                                    if ((acweVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        acweVar.y();
                                    }
                                    acwf acwfVar2 = (acwf) acweVar.b;
                                    acwfVar2.b = 1 | acwfVar2.b;
                                    acwfVar2.c = iValue;
                                    if (!yqv.c(statusB.getDescription())) {
                                        String description = statusB.getDescription();
                                        if ((acweVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                            acweVar.y();
                                        }
                                        acwf acwfVar3 = (acwf) acweVar.b;
                                        description.getClass();
                                        acwfVar3.b |= 2;
                                        acwfVar3.d = description;
                                    }
                                    acwg acwgVar = acwg.a;
                                    acvx acvxVar = new acvx();
                                    acsw acswVar = acsw.LOG_TYPE_INTERNAL_ERROR;
                                    if ((acvxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        acvxVar.y();
                                    }
                                    acwg acwgVar2 = (acwg) acvxVar.b;
                                    acwgVar2.c = acswVar.E;
                                    acwgVar2.b |= 2;
                                    if ((acvxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        acvxVar.y();
                                    }
                                    acwg acwgVar3 = (acwg) acvxVar.b;
                                    acwf acwfVar4 = (acwf) acweVar.v();
                                    acwfVar4.getClass();
                                    acwgVar3.f = acwfVar4;
                                    acwgVar3.b |= 64;
                                    mqkVar2.b.e((acwg) acvxVar.v(), oalVar3, statusB.o, "componentDidUpdate error.", new Object[0]);
                                }
                                agfpVar.c(new aggx(nxlVar, component, oalVar3) { // from class: mqj
                                    public final /* synthetic */ nxl b = null;
                                    public final /* synthetic */ Component c;
                                    public final /* synthetic */ oal d;

                                    {
                                        this.c = component;
                                        this.d = oalVar3;
                                    }

                                    @Override // defpackage.aggx
                                    public final void a() {
                                        Status statusDispose = this.c.dispose();
                                        if (statusDispose.e()) {
                                            return;
                                        }
                                        acwf acwfVar5 = acwf.a;
                                        acwe acweVar2 = new acwe();
                                        int iValue2 = statusDispose.getCode().value();
                                        if ((acweVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                            acweVar2.y();
                                        }
                                        acwf acwfVar6 = (acwf) acweVar2.b;
                                        acwfVar6.b |= 1;
                                        acwfVar6.c = iValue2;
                                        if (!yqv.c(statusDispose.getDescription())) {
                                            String description2 = statusDispose.getDescription();
                                            if ((acweVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                                acweVar2.y();
                                            }
                                            acwf acwfVar7 = (acwf) acweVar2.b;
                                            description2.getClass();
                                            acwfVar7.b |= 2;
                                            acwfVar7.d = description2;
                                        }
                                        acwg acwgVar4 = acwg.a;
                                        acvx acvxVar2 = new acvx();
                                        acsw acswVar2 = acsw.LOG_TYPE_INTERNAL_ERROR;
                                        if ((acvxVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                            acvxVar2.y();
                                        }
                                        acwg acwgVar5 = (acwg) acvxVar2.b;
                                        acwgVar5.c = acswVar2.E;
                                        acwgVar5.b |= 2;
                                        if ((acvxVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                            acvxVar2.y();
                                        }
                                        oal oalVar4 = this.d;
                                        mqk mqkVar3 = this.a;
                                        acwg acwgVar6 = (acwg) acvxVar2.b;
                                        acwf acwfVar8 = (acwf) acweVar2.v();
                                        acwfVar8.getClass();
                                        acwgVar6.f = acwfVar8;
                                        acwgVar6.b |= 64;
                                        mqkVar3.b.e((acwg) acvxVar2.v(), oalVar4, statusDispose.o, "Error disposing Component.", new Object[0]);
                                    }
                                });
                            } finally {
                                mqaVar.a.c();
                            }
                        } catch (ocp e2) {
                            e = e2;
                            agfpVar2 = agfpVar;
                        }
                    }
                }).h(new aggy() { // from class: mqc
                    @Override // defpackage.aggy
                    public final void a(Object obj) {
                        ofnVar.f();
                    }
                }, aghm.b).o(new ohb(new aggy() { // from class: mqd
                    @Override // defpackage.aggy
                    public final void a(Object obj) {
                        ofnVar.b();
                    }
                })).h(aghm.c, new aggv() { // from class: mqe
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
        mlnVarAA.h(new mmc(nhfVar, nlrVarI));
        mlnVarAA.ad();
        mlnVarAA.aa(this.k);
        mlnVarAA.ac();
        mlnVarAA.d(this.l);
        mlnVarAA.af();
        mlnVarAA.b(this.m);
        mlnVarAA.ae();
        return mlnVarAA;
    }
}
