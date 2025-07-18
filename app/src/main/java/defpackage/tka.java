package defpackage;

import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import com.youtube.android.libraries.elements.templates.EkoProcessor;
import io.grpc.Status;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tka implements nzy {
    public final oat a;

    public tka(oat oatVar) {
        this.a = oatVar;
    }

    @Override // defpackage.nzz
    public final abwk a() {
        return addw.b;
    }

    @Override // defpackage.nzy
    public final /* bridge */ /* synthetic */ agff b(Object obj, final nzx nzxVar) {
        final addw addwVar = (addw) obj;
        abxs abxsVar = addwVar.d;
        aghn.b(abxsVar, "source is null");
        agkn agknVar = new agkn(abxsVar);
        aggz aggzVar = agoh.k;
        agkl agklVar = new agkl(agknVar, new aggz() { // from class: tjs
            @Override // defpackage.aggz
            public final Object a(Object obj2) {
                final adcn adcnVar = (adcn) obj2;
                int i = adcnVar.c;
                if (i != 2) {
                    if (i == 3) {
                        return agfy.b(new yxz(adcnVar.e, (abvo) adcnVar.d));
                    }
                    throw new AssertionError();
                }
                tka tkaVar = this.a;
                agkd agkdVar = new agkd(tkaVar.a.a((String) adcnVar.d), null);
                aggz aggzVar2 = agoh.m;
                return agkdVar.c(new aggz() { // from class: tjz
                    @Override // defpackage.aggz
                    public final Object a(Object obj3) {
                        abvo abvoVarU;
                        yqt yqtVar = (yqt) obj3;
                        String str = adcnVar.e;
                        if (!yqtVar.g() || ((byte[]) yqtVar.c()).length <= 0) {
                            abvoVarU = abvo.b;
                        } else {
                            byte[] bArr = (byte[]) yqtVar.c();
                            abvoVarU = abvo.u(bArr, 0, bArr.length);
                        }
                        return new yxz(str, abvoVarU);
                    }
                });
            }
        });
        aggz aggzVar2 = agoh.k;
        aggz aggzVar3 = new aggz() { // from class: tjt
            @Override // defpackage.aggz
            public final Object a(Object obj2) {
                return (String) ((Map.Entry) obj2).getKey();
            }
        };
        aggz aggzVar4 = new aggz() { // from class: tju
            @Override // defpackage.aggz
            public final Object a(Object obj2) {
                return (abvo) ((Map.Entry) obj2).getValue();
            }
        };
        agny agnyVar = agny.a;
        aghl aghlVar = new aghl(aggzVar4, aggzVar3);
        aghn.b(agnyVar, "initialValueSupplier is null");
        agjp agjpVar = new agjp(agklVar, aghlVar);
        aggz aggzVar5 = agoh.m;
        aglv aglvVar = new aglv(agjpVar.c(new aggz() { // from class: tjv
            @Override // defpackage.aggz
            public final Object a(Object obj2) {
                Map map = (Map) obj2;
                adcl adclVar = adcl.a;
                adcj adcjVar = new adcj();
                if ((adcjVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    adcjVar.y();
                }
                adcl adclVar2 = (adcl) adcjVar.b;
                abyl abylVar = adclVar2.c;
                if (!abylVar.b) {
                    adclVar2.c = abylVar.a();
                }
                nzx nzxVar2 = nzxVar;
                adclVar2.c.putAll(map);
                SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = ((nyv) nzxVar2).e;
                if (senderStateOuterClass$SenderState != null) {
                    if ((adcjVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        adcjVar.y();
                    }
                    adcl adclVar3 = (adcl) adcjVar.b;
                    adclVar3.d = senderStateOuterClass$SenderState;
                    adclVar3.b |= 1;
                }
                return (adcl) adcjVar.v();
            }
        }).c(new aggz() { // from class: tjw
            @Override // defpackage.aggz
            public final Object a(Object obj2) {
                int iA;
                int iA2;
                adcl adclVar = (adcl) obj2;
                acrq acrqVar = addwVar.e;
                if (acrqVar == null) {
                    acrqVar = acrq.a;
                }
                try {
                    try {
                        int i = acrqVar.memoizedSerializedSize;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            iA = abza.a.a(acrqVar.getClass()).a(acrqVar);
                            if (iA < 0) {
                                throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                            }
                        } else {
                            iA = i & Integer.MAX_VALUE;
                            if (iA == Integer.MAX_VALUE) {
                                iA = abza.a.a(acrqVar.getClass()).a(acrqVar);
                                if (iA < 0) {
                                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                }
                                acrqVar.memoizedSerializedSize = (acrqVar.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                            }
                        }
                        byte[] bArr = new byte[iA];
                        boolean z = abvz.e;
                        abvw abvwVar = new abvw(bArr, 0, iA);
                        abza.a.a(acrqVar.getClass()).m(acrqVar, abwa.a(abvwVar));
                        abvwVar.K();
                        try {
                            int i2 = adclVar.memoizedSerializedSize;
                            if ((i2 & Integer.MIN_VALUE) != 0) {
                                iA2 = abza.a.a(adclVar.getClass()).a(adclVar);
                                if (iA2 < 0) {
                                    throw new IllegalStateException(a.b(iA2, "serialized size must be non-negative, was "));
                                }
                            } else {
                                iA2 = i2 & Integer.MAX_VALUE;
                                if (iA2 == Integer.MAX_VALUE) {
                                    iA2 = abza.a.a(adclVar.getClass()).a(adclVar);
                                    if (iA2 < 0) {
                                        throw new IllegalStateException(a.b(iA2, "serialized size must be non-negative, was "));
                                    }
                                    adclVar.memoizedSerializedSize = (adclVar.memoizedSerializedSize & Integer.MIN_VALUE) | iA2;
                                }
                            }
                            byte[] bArr2 = new byte[iA2];
                            abvw abvwVar2 = new abvw(bArr2, 0, iA2);
                            abza.a.a(adclVar.getClass()).m(adclVar, abwa.a(abvwVar2));
                            abvwVar2.K();
                            aeef aeefVarA = EkoProcessor.a(bArr, bArr2);
                            Status status = aeefVarA.a;
                            if (status.e()) {
                                byte[] bArr3 = aeefVarA.b;
                                bArr3.getClass();
                                return bArr3;
                            }
                            throw new ocp("Eko processor error: " + status.getDescription());
                        } catch (IOException e) {
                            throw new RuntimeException(a.C(adclVar, "byte array"), e);
                        }
                    } catch (IOException e2) {
                        throw new RuntimeException(a.C(acrqVar, "byte array"), e2);
                    }
                } catch (IOException e3) {
                    throw new ocp("Invalid eko template", e3);
                }
            }
        }), new aggy() { // from class: tjx
            @Override // defpackage.aggy
            public final void a(Object obj2) {
                this.a.a.b(addwVar.f, (byte[]) obj2);
            }
        });
        aggz aggzVar6 = agoh.m;
        agio agioVar = new agio(aglvVar);
        aggz aggzVar7 = agoh.n;
        return agioVar.e(new aggy() { // from class: tjy
            @Override // defpackage.aggy
            public final void a(Object obj2) {
                addw addwVar2 = addwVar;
                yqw.B((addwVar2.c & 2) != 0, "No output path (to_datastore) specified");
                yqw.B(1 == (addwVar2.c & 1), "No Transform specified");
                HashSet hashSet = new HashSet();
                for (adcn adcnVar : addwVar2.d) {
                    yqw.B(1 == (adcnVar.b & 1), "TransformSource with no name");
                    int i = adcnVar.c;
                    yqw.B(i == 2 || i == 3, "TransformSource with no source");
                    yqw.F(hashSet.add(adcnVar.e), "Repeated TransformSource name '%s'", adcnVar.e);
                }
            }
        });
    }
}
