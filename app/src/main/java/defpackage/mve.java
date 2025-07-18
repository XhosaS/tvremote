package defpackage;

import android.util.Pair;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.youtube.android.libraries.elements.templates.EkoProcessor;
import io.grpc.Status;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mve implements nzy {
    public final oat a;
    public final aehf b;

    public mve(oat oatVar, aehf aehfVar) {
        this.a = oatVar;
        this.b = aehfVar;
    }

    @Override // defpackage.nzz
    public final abwk a() {
        return acvq.b;
    }

    @Override // defpackage.nzy
    public final /* bridge */ /* synthetic */ agff b(Object obj, final nzx nzxVar) {
        final acvq acvqVar = (acvq) obj;
        return agfy.b(acvqVar).a(new aggz() { // from class: mvd
            @Override // defpackage.aggz
            public final Object a(Object obj2) throws abxv {
                int iA;
                acyw acywVar = acyw.a;
                acyv acyvVar = new acyv();
                abxc abxcVar = acvu.b;
                acvt acvtVar = new acvt();
                final acvq acvqVar2 = acvqVar;
                acrq acrqVar = acvqVar2.d;
                if (acrqVar == null) {
                    acrqVar = acrq.a;
                }
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
                    abvo abvoVar = abvo.b;
                    byte[] bArr = new byte[iA];
                    boolean z = abvz.e;
                    abvw abvwVar = new abvw(bArr, 0, iA);
                    abza.a.a(acrqVar.getClass()).m(acrqVar, abwa.a(abvwVar));
                    abvo abvoVarA = abvk.a(abvwVar, bArr);
                    if ((acvtVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        acvtVar.y();
                    }
                    acvu acvuVar = (acvu) acvtVar.b;
                    acvuVar.c |= 1;
                    acvuVar.d = abvoVarA;
                    acyvVar.f(abxcVar, (acvu) acvtVar.v());
                    acyw acywVar2 = (acyw) acyvVar.v();
                    acuz acuzVar = acvqVar2.c;
                    if (acuzVar == null) {
                        acuzVar = acuz.a;
                    }
                    abxc abxcVar2 = acul.b;
                    MessageLite messageLite = abxcVar2.a;
                    acuz acuzVar2 = acuz.a;
                    if (messageLite != acuzVar2) {
                        throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                    }
                    Object objK = acuzVar.n.k(abxcVar2.d);
                    int i2 = ((acul) (objK == null ? abxcVar2.b : abxcVar2.b(objK))).d;
                    acuj acujVar = acuj.a;
                    acui acuiVar = new acui();
                    if ((acuiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        acuiVar.y();
                    }
                    acuj acujVar2 = (acuj) acuiVar.b;
                    acywVar2.getClass();
                    acujVar2.d = acywVar2;
                    acujVar2.c |= 2;
                    acuz acuzVar3 = acvqVar2.c;
                    if (acuzVar3 != null) {
                        acuzVar2 = acuzVar3;
                    }
                    if ((acuiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        acuiVar.y();
                    }
                    acuj acujVar3 = (acuj) acuiVar.b;
                    acuzVar2.getClass();
                    acujVar3.f = acuzVar2;
                    acujVar3.c |= 16;
                    try {
                        byte[] bArr2 = new byte[6];
                        abvw abvwVar2 = new abvw(bArr2, 0, 6);
                        abvwVar2.x((i2 << 3) | 2);
                        abvwVar2.x(0);
                        try {
                            abxd abxdVarH = abxd.h(acur.a, bArr2, 0, 6, ExtensionRegistryLite.a);
                            if (abxdVarH != null) {
                                abxd abxdVar = null;
                                byte bByteValue = ((Byte) abxdVarH.cM(1, null)).byteValue();
                                if (bByteValue != 1) {
                                    if (bByteValue != 0) {
                                        boolean zL = abza.a.a(abxdVarH.getClass()).l(abxdVarH);
                                        if (true == zL) {
                                            abxdVar = abxdVarH;
                                        }
                                        abxdVarH.cM(2, abxdVar);
                                        if (zL) {
                                        }
                                    }
                                    throw new abzz().a();
                                }
                            }
                            acur acurVar = (acur) abxdVarH;
                            if ((acuiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                acuiVar.y();
                            }
                            acuj acujVar4 = (acuj) acuiVar.b;
                            acurVar.getClass();
                            acujVar4.e = acurVar;
                            acujVar4.c |= 8;
                            final nzx nzxVar2 = nzxVar;
                            final mve mveVar = this.a;
                            final acuj acujVar5 = (acuj) acuiVar.v();
                            final oat oatVar = mveVar.a;
                            return agfo.f(new Callable() { // from class: mwf
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    int iA2;
                                    acul aculVar;
                                    int i3;
                                    int i4;
                                    int i5;
                                    acuj acujVar6 = acujVar5;
                                    acur acurVar2 = acujVar6.e;
                                    if (acurVar2 == null) {
                                        acurVar2 = acur.a;
                                    }
                                    ByteBuffer byteBuffer = oex.a;
                                    try {
                                        int i6 = acurVar2.memoizedSerializedSize;
                                        if ((i6 & Integer.MIN_VALUE) != 0) {
                                            iA2 = abza.a.a(acurVar2.getClass()).a(acurVar2);
                                            if (iA2 < 0) {
                                                throw new IllegalStateException(a.b(iA2, "serialized size must be non-negative, was "));
                                            }
                                        } else {
                                            iA2 = i6 & Integer.MAX_VALUE;
                                            if (iA2 == Integer.MAX_VALUE) {
                                                iA2 = abza.a.a(acurVar2.getClass()).a(acurVar2);
                                                if (iA2 < 0) {
                                                    throw new IllegalStateException(a.b(iA2, "serialized size must be non-negative, was "));
                                                }
                                                acurVar2.memoizedSerializedSize = (Integer.MIN_VALUE & acurVar2.memoizedSerializedSize) | iA2;
                                            }
                                        }
                                        byte[] bArr3 = new byte[iA2];
                                        boolean z2 = abvz.e;
                                        abvw abvwVar3 = new abvw(bArr3, 0, iA2);
                                        abza.a.a(acurVar2.getClass()).m(acurVar2, abwa.a(abvwVar3));
                                        abvwVar3.K();
                                        oex oexVarA = oex.a(bArr3);
                                        if ((acujVar6.c & 16) == 0) {
                                            return new agot(oexVarA);
                                        }
                                        acuz acuzVar4 = acujVar6.f;
                                        if (acuzVar4 == null) {
                                            acuzVar4 = acuz.a;
                                        }
                                        abxc abxcVar3 = acul.b;
                                        MessageLite messageLite2 = abxcVar3.a;
                                        acuz acuzVar5 = acuz.a;
                                        if (messageLite2 != acuzVar5) {
                                            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                                        }
                                        abwr abwrVar = acuzVar4.n;
                                        abxb abxbVar = abxcVar3.d;
                                        acwn acwnVar = null;
                                        if (!abwrVar.n(abxbVar)) {
                                            aculVar = null;
                                        } else {
                                            if (messageLite2 != acuzVar5) {
                                                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                                            }
                                            Object objK2 = acuzVar4.n.k(abxbVar);
                                            aculVar = (acul) (objK2 == null ? abxcVar3.b : abxcVar3.b(objK2));
                                        }
                                        abxc abxcVar4 = acwn.b;
                                        MessageLite messageLite3 = abxcVar4.a;
                                        if (messageLite3 != acuzVar5) {
                                            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                                        }
                                        abwr abwrVar2 = acuzVar4.n;
                                        abxb abxbVar2 = abxcVar4.d;
                                        if (abwrVar2.n(abxbVar2)) {
                                            if (messageLite3 != acuzVar5) {
                                                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                                            }
                                            Object objK3 = acuzVar4.n.k(abxbVar2);
                                            acwnVar = (acwn) (objK3 == null ? abxcVar4.b : abxcVar4.b(objK3));
                                        }
                                        if (aculVar == null && acwnVar == null) {
                                            return new agot(oexVarA);
                                        }
                                        if (aculVar != null && acwnVar != null && (i4 = aculVar.d) != (i5 = acwnVar.c)) {
                                            throw new ocp(a.k(i5, i4, "ComponentType dataStoreSubscriptionConfig.resultField=", ", environmentSubscriptionConfig.resultField="));
                                        }
                                        yyn yynVar = new yyn(4);
                                        if (aculVar != null) {
                                            i3 = aculVar.d;
                                            yyn yynVar2 = new yyn(4);
                                            for (acun acunVar : aculVar.c) {
                                                if ((acunVar.b & 1) != 0) {
                                                    yynVar2.c(acunVar.c, Integer.valueOf(acunVar.d));
                                                }
                                            }
                                            yynVar.f(yynVar2.a(true));
                                        } else {
                                            i3 = 0;
                                        }
                                        if (acwnVar != null) {
                                            i3 = acwnVar.c;
                                            yynVar.f(yyr.k("/environment", Integer.valueOf(acwnVar.d)));
                                        }
                                        mwj mwjVarA = mwj.a(oexVarA);
                                        yyr yyrVarA = yynVar.a(true);
                                        if (yyrVarA.isEmpty()) {
                                            return new agot(mwjVarA.b(i3));
                                        }
                                        try {
                                            yyn yynVar3 = new yyn(4);
                                            HashMap map = new HashMap();
                                            byte[] bArr4 = mwjVarA.a;
                                            int i7 = abvt.g;
                                            abvt abvtVarL = abvt.L(bArr4, 0, bArr4.length, false);
                                            while (!abvtVarL.C()) {
                                                int iM = abvtVarL.m();
                                                int i8 = iM >>> 3;
                                                if ((iM & 7) == 2) {
                                                    map.put(Integer.valueOf(i8), ((abvp) abvtVarL).G(((abvp) abvtVarL).j()));
                                                } else {
                                                    abvtVarL.E(iM);
                                                }
                                            }
                                            zdl it = yyrVarA.entrySet().iterator();
                                            while (it.hasNext()) {
                                                Map.Entry entry = (Map.Entry) it.next();
                                                String str = (String) entry.getKey();
                                                Integer num = (Integer) entry.getValue();
                                                num.intValue();
                                                byte[] bArr5 = (byte[]) map.get(num);
                                                if (bArr5 == null) {
                                                    bArr5 = ock.a;
                                                }
                                                yynVar3.c(str, bArr5);
                                            }
                                            yyr yyrVarA2 = yynVar3.a(true);
                                            yzq<String> yzqVarKeySet = yyrVarA.keySet();
                                            ArrayList arrayList = new ArrayList(yzqVarKeySet.size());
                                            for (final String str2 : yzqVarKeySet) {
                                                oat oatVar2 = oatVar;
                                                arrayList.add(oatVar2.a(str2).j(new aggz() { // from class: mwh
                                                    @Override // defpackage.aggz
                                                    public final Object a(Object obj3) {
                                                        return Pair.create(str2, (yqt) obj3);
                                                    }
                                                }));
                                            }
                                            mwk mwkVar = new mwk(yyrVarA2);
                                            int i9 = agfl.a;
                                            aghn.c(i9);
                                            agjs agjsVar = new agjs(arrayList, mwkVar, i9 + i9);
                                            aggz aggzVar = agoh.k;
                                            return agjsVar.j(new mwi(i3, yyrVarA, mwjVarA));
                                        } catch (IOException e) {
                                            throw new ocp("Failed to process default model", e);
                                        }
                                    } catch (IOException e2) {
                                        throw new RuntimeException(a.u(acurVar2, " to a byte array threw an IOException (should never happen)."), e2);
                                    }
                                }
                            }).p(oex.b).a(new aggz() { // from class: mvc
                                @Override // defpackage.aggz
                                public final Object a(Object obj3) throws abxv {
                                    int iA2;
                                    oex oexVar = (oex) obj3;
                                    oaa oaaVar = (oaa) mveVar.b.a();
                                    acrq acrqVar2 = acvqVar2.d;
                                    if (acrqVar2 == null) {
                                        acrqVar2 = acrq.a;
                                    }
                                    try {
                                        try {
                                            int i3 = acrqVar2.memoizedSerializedSize;
                                            if ((i3 & Integer.MIN_VALUE) != 0) {
                                                iA2 = abza.a.a(acrqVar2.getClass()).a(acrqVar2);
                                                if (iA2 < 0) {
                                                    throw new IllegalStateException(a.b(iA2, "serialized size must be non-negative, was "));
                                                }
                                            } else {
                                                iA2 = i3 & Integer.MAX_VALUE;
                                                if (iA2 == Integer.MAX_VALUE) {
                                                    iA2 = abza.a.a(acrqVar2.getClass()).a(acrqVar2);
                                                    if (iA2 < 0) {
                                                        throw new IllegalStateException(a.b(iA2, "serialized size must be non-negative, was "));
                                                    }
                                                    acrqVar2.memoizedSerializedSize = (Integer.MIN_VALUE & acrqVar2.memoizedSerializedSize) | iA2;
                                                }
                                            }
                                            byte[] bArr3 = new byte[iA2];
                                            boolean z2 = abvz.e;
                                            abvw abvwVar3 = new abvw(bArr3, 0, iA2);
                                            abza.a.a(acrqVar2.getClass()).m(acrqVar2, abwa.a(abvwVar3));
                                            abvwVar3.K();
                                            aeef aeefVarA = EkoProcessor.a(bArr3, mwj.a(oexVar).a);
                                            Status status = aeefVarA.a;
                                            if (!status.e()) {
                                                throw new ocp("Eko processor error: " + status.getDescription());
                                            }
                                            byte[] bArr4 = aeefVarA.b;
                                            bArr4.getClass();
                                            abxd abxdVarH2 = abxd.h(CommandOuterClass$Command.a, bArr4, 0, bArr4.length, ExtensionRegistryLite.getGeneratedRegistry());
                                            if (abxdVarH2 != null) {
                                                abxd abxdVar2 = null;
                                                byte bByteValue2 = ((Byte) abxdVarH2.cM(1, null)).byteValue();
                                                if (bByteValue2 != 1) {
                                                    if (bByteValue2 != 0) {
                                                        boolean zL2 = abza.a.a(abxdVarH2.getClass()).l(abxdVarH2);
                                                        if (true == zL2) {
                                                            abxdVar2 = abxdVarH2;
                                                        }
                                                        abxdVarH2.cM(2, abxdVar2);
                                                        if (zL2) {
                                                        }
                                                    }
                                                    throw new abzz().a();
                                                }
                                            }
                                            return oaaVar.c((CommandOuterClass$Command) abxdVarH2, nzxVar2);
                                        } catch (IOException e) {
                                            throw new RuntimeException(a.C(acrqVar2, "byte array"), e);
                                        }
                                    } catch (IOException e2) {
                                        throw new ocp("Invalid eko template in DynamicEntitiesCommandHandler", e2);
                                    }
                                }
                            });
                        } catch (abxv e) {
                            throw new ocp("Invalid model in DynamicEntitiesCommandHandler", e);
                        }
                    } catch (IOException e2) {
                        throw new ocp("Invalid model creation in DynamicEntitiesCommandHandler", e2);
                    }
                } catch (IOException e3) {
                    throw new RuntimeException(a.u(acrqVar, " to a ByteString threw an IOException (should never happen)."), e3);
                }
            }
        });
    }
}
