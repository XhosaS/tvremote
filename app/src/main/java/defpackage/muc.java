package defpackage;

import android.util.Pair;
import com.google.protobuf.ExtensionRegistryLite;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class muc implements oec {
    private static final String a = "muc";
    private static final AtomicInteger b = new AtomicInteger();
    private final oco c;
    private final Map d;
    private final Map e;

    public muc(Map map, Map map2, oco ocoVar) {
        Boolean bool = false;
        bool.getClass();
        this.c = ocoVar;
        yyn yynVar = new yyn(4);
        for (Map.Entry entry : ((yyr) map).entrySet()) {
            yynVar.c(Integer.valueOf(((mrn) entry.getValue()).a().a), (mrn) entry.getValue());
        }
        yyn yynVar2 = new yyn(4);
        if (!map2.isEmpty()) {
            for (Map.Entry entry2 : ((yyr) map2).entrySet()) {
                yynVar2.c(Integer.valueOf(((mro) ((Pair) entry2.getValue()).first).a().a()), (Pair) entry2.getValue());
            }
        }
        this.d = yynVar.a(true);
        this.e = yynVar2.a(true);
    }

    @Override // defpackage.oec
    public final mii a() {
        return nku.W;
    }

    @Override // defpackage.oee
    public final /* bridge */ /* synthetic */ void b(dru druVar, oal oalVar, String str, Object obj, obz obzVar, nzw nzwVar) {
        d(oalVar, (nku) obj, obzVar);
    }

    @Override // defpackage.oee
    public final /* synthetic */ void c(dru druVar, oal oalVar, String str, niv nivVar, Object obj, obz obzVar, nzw nzwVar) {
        b(druVar, oalVar, str, obj, obzVar, nzwVar);
    }

    public final void d(oal oalVar, nku nkuVar, obz obzVar) {
        int i;
        mrm mrmVarB;
        oal oalVar2 = oalVar;
        if (nkuVar.g() == 0) {
            return;
        }
        nyx nyxVar = (nyx) oalVar2;
        AtomicReference atomicReference = nyxVar.t;
        if (atomicReference == null) {
            this.c.b(acsw.LOG_TYPE_INTERNAL_ERROR, oalVar2, "scrollStrategyListenerHolder is unavailable.", new Object[0]);
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < nkuVar.g()) {
            nkq nkqVarH = nkuVar.h(i2);
            int[] iArrF = nkqVarH.f();
            int length = iArrF.length;
            if (length != 0) {
                if (length > 1) {
                    acwg acwgVar = acwg.a;
                    acvx acvxVar = new acvx();
                    acsw acswVar = acsw.LOG_TYPE_INVALID_FIELD;
                    if ((acvxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        acvxVar.y();
                    }
                    acwg acwgVar2 = (acwg) acvxVar.b;
                    acwgVar2.c = acswVar.E;
                    acwgVar2.b |= 2;
                    List listE = ztm.e(iArrF);
                    if ((acvxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        acvxVar.y();
                    }
                    acwg acwgVar3 = (acwg) acvxVar.b;
                    abxj abxjVar = acwgVar3.e;
                    if (abxjVar.c()) {
                        i = Integer.MIN_VALUE;
                    } else {
                        int size = abxjVar.size();
                        i = Integer.MIN_VALUE;
                        acwgVar3.e = abxjVar.d(size + size);
                    }
                    abus.m(listE, acwgVar3.e);
                    this.c.c((acwg) acvxVar.v(), oalVar2, "Multiple extensions found in intersection observer (default to first extension).", new Object[0]);
                } else {
                    i = Integer.MIN_VALUE;
                }
                int i3 = iArrF[0];
                if (mij.a(i3)) {
                    mrn mrnVar = (mrn) this.d.get(Integer.valueOf(i3));
                    if (mrnVar == null) {
                        throw new ocp(a.b(i3, "Unknown Flatbuffer extension: "));
                    }
                    mil milVarA = nkqVarH.a(mrnVar.a());
                    nzv nzvVarP = nzx.p();
                    nyu nyuVar = (nyu) nzvVarP;
                    nyuVar.d = obzVar;
                    nyuVar.f = oalVar2;
                    nyuVar.e = nyxVar.q;
                    mrmVarB = mrnVar.b(milVarA, nzvVarP.e());
                } else {
                    Pair pair = (Pair) this.e.get(Integer.valueOf(i3));
                    if (pair != null) {
                        try {
                            mro mroVar = (mro) pair.first;
                            ogw.b(abvt.Q((ByteBuffer) zag.f(nkqVarH.d(i3))), (abyy) pair.second, ExtensionRegistryLite.getGeneratedRegistry());
                            nzv nzvVarP2 = nzx.p();
                            ((nyu) nzvVarP2).d = obzVar;
                            ((nyu) nzvVarP2).f = oalVar2;
                            ((nyu) nzvVarP2).e = ((nyx) oalVar2).q;
                            nzvVarP2.e();
                            mrmVarB = mroVar.b();
                        } catch (abxv | IllegalArgumentException | NoSuchElementException e) {
                            acwg acwgVar4 = acwg.a;
                            acvx acvxVar2 = new acvx();
                            acsw acswVar2 = acsw.LOG_TYPE_WIRE_FORMAT_ERROR;
                            if ((acvxVar2.b.memoizedSerializedSize & i) == 0) {
                                acvxVar2.y();
                            }
                            acwg acwgVar5 = (acwg) acvxVar2.b;
                            acwgVar5.c = acswVar2.E;
                            acwgVar5.b |= 2;
                            acvxVar2.a(i3);
                            this.c.e((acwg) acvxVar2.v(), oalVar2, e, "Failed to resolve Intersection Property Extension in IntersectionPropertiesConverter.", new Object[0]);
                        }
                    } else {
                        mrmVarB = null;
                    }
                }
                if (mrmVarB != null) {
                    arrayList.add(mrmVarB);
                }
            }
            i2++;
            oalVar2 = oalVar;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        mub mubVar = new mub(atomicReference, arrayList, a + b.incrementAndGet(), this.c, oalVar);
        obzVar.C(mubVar);
        obzVar.o(mubVar);
        obzVar.i(mubVar);
    }
}
