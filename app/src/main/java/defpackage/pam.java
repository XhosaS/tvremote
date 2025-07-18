package defpackage;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public class pam {
    public static zlv a(pao paoVar, int i) {
        if (paoVar == null) {
            throw new NullPointerException("Use VeTreeNode.EMPTY instead of null");
        }
        if (((pak) paoVar).a == null) {
            return null;
        }
        zlv zlvVarD = d();
        zlu zluVar = new zlu();
        zluVar.B(zlvVarD);
        zon zonVar = zon.a;
        zom zomVar = new zom();
        if ((zomVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zomVar.y();
        }
        zon zonVar2 = (zon) zomVar.b;
        zonVar2.b |= 4;
        zonVar2.d = i;
        zon zonVar3 = (zon) zomVar.v();
        if ((zluVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zluVar.y();
        }
        zlv zlvVar = (zlv) zluVar.b;
        zlv zlvVar2 = zlv.a;
        zonVar3.getClass();
        zlvVar.f = zonVar3;
        zlvVar.b |= 16;
        ArrayList arrayList = new ArrayList();
        zpn zpnVar = ((zlv) zluVar.b).c;
        if (zpnVar == null) {
            zpnVar = zpn.a;
        }
        e(arrayList, paoVar, -1, zpnVar);
        if (!arrayList.isEmpty()) {
            if ((zluVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                zluVar.y();
            }
            ((zlv) zluVar.b).d = abzb.b;
            if ((zluVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                zluVar.y();
            }
            zlv zlvVar3 = (zlv) zluVar.b;
            abxs abxsVar = zlvVar3.d;
            if (!abxsVar.c()) {
                int size = abxsVar.size();
                zlvVar3.d = abxsVar.d(size + size);
            }
            abus.m(arrayList, zlvVar3.d);
        }
        return (zlv) zluVar.v();
    }

    public static zlv b(View view) {
        pao paoVarB = (view == null || paq.a(view) == null) ? null : paq.b(view);
        if (paoVarB == null) {
            return null;
        }
        return a(paoVarB, 472);
    }

    public static zlv c(View view, int i) {
        zlv zlvVar = null;
        if (view == null) {
            Log.e("ClientVe", "Failed to create ClientVisualElementsProto for user interaction because the view is null.");
            return null;
        }
        pan panVarA = paq.a(view);
        if (panVarA == null) {
            Log.e("ClientVe", a.t(view, "Failed to create ClientVisualElementsProto for user interaction on view ", " because the view is not tagged for visual element logging."));
            return null;
        }
        int i2 = i - 1;
        if (!panVarA.c(i2) && i != 1) {
            Log.e("ClientVe", "Failed to create ClientVisualElementsProto for user interaction " + i2 + " on " + ((zpk) panVarA.a.b).d + " because that user interaction is not enabled for the VE.");
            return null;
        }
        zpk zpkVarA = panVarA.a();
        if (!panVarA.d) {
            zpk zpkVar = (zpk) panVarA.a.b;
            int i3 = zpkVar.b;
            if ((i3 & 1) == 0 && (i3 & 2048) == 0) {
                Log.e("ClientVe", "Failed to create ClientVisualElementsProto for user interaction on " + zpkVar.d + " because there is no runtime impression information on the VE.");
                return null;
            }
        }
        if (panVarA.c(i2) || i == 1) {
            zlv zlvVarD = d();
            zlu zluVar = new zlu();
            zluVar.B(zlvVarD);
            zon zonVar = zon.a;
            zom zomVar = new zom();
            int i4 = ((zpk) panVarA.a.b).d;
            if ((zomVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                zomVar.y();
            }
            zon zonVar2 = (zon) zomVar.b;
            zonVar2.b |= 4;
            zonVar2.d = i4;
            if ((zomVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                zomVar.y();
            }
            zon zonVar3 = (zon) zomVar.b;
            zonVar3.b |= 16;
            zonVar3.f = i2;
            zon zonVar4 = (zon) zomVar.v();
            if ((zluVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                zluVar.y();
            }
            zlv zlvVar2 = (zlv) zluVar.b;
            zlv zlvVar3 = zlv.a;
            zonVar4.getClass();
            zlvVar2.f = zonVar4;
            zlvVar2.b |= 16;
            zlvVar = (zlv) zluVar.v();
        } else {
            Log.e("ClientVe", "Failed to create ClientVisualElementsProto for user interaction " + i2 + " on " + ((zpk) panVarA.a.b).d + " because that user interaction is not enabled for the VE.");
        }
        zlu zluVar2 = new zlu();
        zluVar2.B(zlvVar);
        zpn zpnVar = zpkVarA.f;
        if (zpnVar == null) {
            zpnVar = zpn.a;
        }
        if ((zluVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zluVar2.y();
        }
        zlv zlvVar4 = (zlv) zluVar2.b;
        zlv zlvVar5 = zlv.a;
        zpnVar.getClass();
        zlvVar4.e = zpnVar;
        zlvVar4.b |= 2;
        zon zonVar5 = ((zlv) zluVar2.b).f;
        if (zonVar5 == null) {
            zonVar5 = zon.a;
        }
        zom zomVar2 = new zom();
        zomVar2.B(zonVar5);
        int i5 = zpkVarA.c;
        if ((zomVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zomVar2.y();
        }
        zon zonVar6 = (zon) zomVar2.b;
        zonVar6.b |= 8;
        zonVar6.e = i5;
        zon zonVar7 = (zon) zomVar2.v();
        if ((zluVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zluVar2.y();
        }
        zlv zlvVar6 = (zlv) zluVar2.b;
        zonVar7.getClass();
        zlvVar6.f = zonVar7;
        zlvVar6.b |= 16;
        return (zlv) zluVar2.v();
    }

    private static zlv d() {
        zlv zlvVar = zlv.a;
        zlu zluVar = new zlu();
        zpn zpnVarA = pal.a();
        if ((zluVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zluVar.y();
        }
        zlv zlvVar2 = (zlv) zluVar.b;
        zpnVarA.getClass();
        zlvVar2.c = zpnVarA;
        zlvVar2.b |= 1;
        return (zlv) zluVar.v();
    }

    private static void e(ArrayList arrayList, pao paoVar, int i, zpn zpnVar) {
        pan panVarA = paoVar.a();
        if (panVarA != null) {
            zot zotVar = zot.a;
            zoq zoqVar = new zoq();
            zpj zpjVar = panVarA.a;
            int i2 = ((zpk) zpjVar.b).d;
            if ((zoqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                zoqVar.y();
            }
            zot zotVar2 = (zot) zoqVar.b;
            zotVar2.b |= 1;
            zotVar2.c = i2;
            int i3 = panVarA.e;
            if (i3 != 1) {
                if ((zoqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    zoqVar.y();
                }
                zot zotVar3 = (zot) zoqVar.b;
                int i4 = i3 - 1;
                if (i3 == 0) {
                    throw null;
                }
                zotVar3.i = i4;
                zotVar3.b |= 32;
            }
            if (panVarA.b() != null) {
                acjc acjcVarB = panVarA.b();
                if ((zoqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    zoqVar.y();
                }
                zot zotVar4 = (zot) zoqVar.b;
                acjcVarB.getClass();
                zotVar4.h = acjcVarB;
                zotVar4.b |= 16;
            }
            zoqVar.B((zot) panVarA.b.v());
            arrayList.add((zot) zoqVar.v());
            int size = arrayList.size() - 1;
            if (i >= 0) {
                zot zotVar5 = (zot) arrayList.get(i);
                zoq zoqVar2 = new zoq();
                zoqVar2.B(zotVar5);
                zoqVar2.a(size);
                arrayList.set(i, (zot) zoqVar2.v());
            }
            i = arrayList.size() - 1;
            zpk zpkVarA = panVarA.a();
            zpj zpjVar2 = new zpj();
            zpjVar2.B(zpkVarA);
            if ((zpjVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                zpjVar2.y();
            }
            zpk zpkVar = (zpk) zpjVar2.b;
            zpnVar.getClass();
            zpkVar.f = zpnVar;
            zpkVar.b |= 2048;
            if ((zpjVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                zpjVar2.y();
            }
            zpk zpkVar2 = (zpk) zpjVar2.b;
            zpkVar2.b |= 1;
            zpkVar2.c = i;
            zpk zpkVar3 = (zpk) zpjVar2.v();
            int i5 = ((zpk) zpjVar.b).d;
            abxd abxdVar = zpjVar.a;
            if ((abxdVar.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            zpjVar.b = (abxd) abxdVar.cM(4, null);
            zpjVar.B(zpkVar3);
            if ((zpjVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                zpjVar.y();
            }
            zpk zpkVar4 = (zpk) zpjVar.b;
            zpkVar4.b |= 8;
            zpkVar4.d = i5;
        }
        Iterator it = paoVar.b().iterator();
        while (it.hasNext()) {
            e(arrayList, (pao) it.next(), i, zpnVar);
        }
    }
}
