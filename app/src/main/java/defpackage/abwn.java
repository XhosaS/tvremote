package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abwn extends abwm {
    @Override // defpackage.abwm
    public final abwr a(Object obj) {
        abwz abwzVar = (abwz) obj;
        abwr abwrVar = abwzVar.n;
        if (abwrVar.c) {
            abwzVar.n = abwrVar.clone();
        }
        return abwzVar.n;
    }

    @Override // defpackage.abwm
    public final Object b(Object obj, abzd abzdVar, Object obj2, ExtensionRegistryLite extensionRegistryLite, abwr abwrVar, Object obj3, acaa acaaVar) throws abxu {
        Object objValueOf;
        Object objK;
        ArrayList arrayList;
        abxc abxcVar = (abxc) obj2;
        abxb abxbVar = abxcVar.d;
        boolean z = abxbVar.d;
        int i = abxbVar.b;
        if (z && abxbVar.e) {
            acap acapVar = acap.DOUBLE;
            acap acapVar2 = abxbVar.c;
            switch (acapVar2.ordinal()) {
                case 0:
                    arrayList = new ArrayList();
                    abzdVar.z(arrayList);
                    break;
                case 1:
                    arrayList = new ArrayList();
                    abzdVar.D(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    abzdVar.F(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    abzdVar.M(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    abzdVar.E(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    abzdVar.C(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    abzdVar.B(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    abzdVar.y(arrayList);
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    throw new IllegalStateException("Type cannot be packed: ".concat(String.valueOf(String.valueOf(acapVar2))));
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    arrayList = new ArrayList();
                    abzdVar.L(arrayList);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    ArrayList arrayList2 = new ArrayList();
                    abzdVar.A(arrayList2);
                    obj3 = abzk.k(obj, i, arrayList2, abxbVar.a, obj3, acaaVar);
                    arrayList = arrayList2;
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    arrayList = new ArrayList();
                    abzdVar.G(arrayList);
                    break;
                case 15:
                    arrayList = new ArrayList();
                    abzdVar.H(arrayList);
                    break;
                case 16:
                    arrayList = new ArrayList();
                    abzdVar.I(arrayList);
                    break;
                case 17:
                    arrayList = new ArrayList();
                    abzdVar.J(arrayList);
                    break;
            }
            abwrVar.m(abxbVar, arrayList);
            return obj3;
        }
        acap acapVar3 = abxbVar.c;
        if (acapVar3 != acap.ENUM) {
            switch (acapVar3.ordinal()) {
                case 0:
                    objValueOf = Double.valueOf(abzdVar.a());
                    break;
                case 1:
                    objValueOf = Float.valueOf(abzdVar.b());
                    break;
                case 2:
                    objValueOf = Long.valueOf(abzdVar.k());
                    break;
                case 3:
                    objValueOf = Long.valueOf(abzdVar.n());
                    break;
                case 4:
                    objValueOf = Integer.valueOf(abzdVar.f());
                    break;
                case 5:
                    objValueOf = Long.valueOf(abzdVar.j());
                    break;
                case 6:
                    objValueOf = Integer.valueOf(abzdVar.e());
                    break;
                case 7:
                    objValueOf = Boolean.valueOf(abzdVar.O());
                    break;
                case 8:
                    objValueOf = abzdVar.u();
                    break;
                case 9:
                    if (!z) {
                        Object objK2 = abwrVar.k(abxbVar);
                        if (objK2 instanceof abxd) {
                            abzj abzjVarA = abza.a.a(objK2.getClass());
                            if ((((abxd) objK2).memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                Object objE = abzjVarA.e();
                                abzjVarA.h(objE, objK2);
                                abwrVar.m(abxbVar, objE);
                                objK2 = objE;
                            }
                            abzdVar.w(objK2, abzjVarA, extensionRegistryLite);
                            return obj3;
                        }
                    }
                    Class<?> cls = abxcVar.c.getClass();
                    abvu abvuVar = (abvu) abzdVar;
                    abvuVar.N(3);
                    objValueOf = abvuVar.r(abza.a.a(cls), extensionRegistryLite);
                    break;
                case 10:
                    if (!z) {
                        Object objK3 = abwrVar.k(abxbVar);
                        if (objK3 instanceof abxd) {
                            abzj abzjVarA2 = abza.a.a(objK3.getClass());
                            if ((((abxd) objK3).memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                Object objE2 = abzjVarA2.e();
                                abzjVarA2.h(objE2, objK3);
                                abwrVar.m(abxbVar, objE2);
                                objK3 = objE2;
                            }
                            abzdVar.x(objK3, abzjVarA2, extensionRegistryLite);
                            return obj3;
                        }
                    }
                    objValueOf = abzdVar.t(abxcVar.c.getClass(), extensionRegistryLite);
                    break;
                case 11:
                    objValueOf = abzdVar.o();
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    objValueOf = Integer.valueOf(abzdVar.i());
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    throw new IllegalStateException("Shouldn't reach here.");
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    objValueOf = Integer.valueOf(abzdVar.g());
                    break;
                case 15:
                    objValueOf = Long.valueOf(abzdVar.l());
                    break;
                case 16:
                    objValueOf = Integer.valueOf(abzdVar.h());
                    break;
                case 17:
                    objValueOf = Long.valueOf(abzdVar.m());
                    break;
                default:
                    objValueOf = null;
                    break;
            }
        } else {
            int iF = abzdVar.f();
            if (acqc.b(iF) == null) {
                return abzk.m(obj, i, iF, obj3, acaaVar);
            }
            objValueOf = Integer.valueOf(iF);
        }
        if (z) {
            abwrVar.l(abxbVar, objValueOf);
            return obj3;
        }
        int iOrdinal = acapVar3.ordinal();
        if ((iOrdinal == 9 || iOrdinal == 10) && (objK = abwrVar.k(abxbVar)) != null) {
            Charset charset = abxt.a;
            objValueOf = ((MessageLite) objK).cN().j((MessageLite) objValueOf).w();
        }
        abwrVar.m(abxbVar, objValueOf);
        return obj3;
    }

    @Override // defpackage.abwm
    public final void c(Object obj) {
        ((abwz) obj).n.f();
    }

    @Override // defpackage.abwm
    public final void d(abzd abzdVar, Object obj, ExtensionRegistryLite extensionRegistryLite, abwr abwrVar) {
        abxc abxcVar = (abxc) obj;
        abwrVar.m(abxcVar.d, abzdVar.t(abxcVar.c.getClass(), extensionRegistryLite));
    }

    @Override // defpackage.abwm
    public final void e(abwa abwaVar, Map.Entry entry) {
        abxb abxbVar = (abxb) entry.getKey();
        if (abxbVar.d) {
            acap acapVar = acap.DOUBLE;
            switch (abxbVar.c.ordinal()) {
                case 0:
                    abzk.u(abxbVar.b, (List) entry.getValue(), abwaVar, abxbVar.e);
                    break;
                case 1:
                    abzk.y(abxbVar.b, (List) entry.getValue(), abwaVar, abxbVar.e);
                    break;
                case 2:
                    abzk.B(abxbVar.b, (List) entry.getValue(), abwaVar, abxbVar.e);
                    break;
                case 3:
                    abzk.J(abxbVar.b, (List) entry.getValue(), abwaVar, abxbVar.e);
                    break;
                case 4:
                    abzk.A(abxbVar.b, (List) entry.getValue(), abwaVar, abxbVar.e);
                    break;
                case 5:
                    abzk.x(abxbVar.b, (List) entry.getValue(), abwaVar, abxbVar.e);
                    break;
                case 6:
                    abzk.w(abxbVar.b, (List) entry.getValue(), abwaVar, abxbVar.e);
                    break;
                case 7:
                    abzk.s(abxbVar.b, (List) entry.getValue(), abwaVar, abxbVar.e);
                    break;
                case 8:
                    abzk.H(abxbVar.b, (List) entry.getValue(), abwaVar);
                    break;
                case 9:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        abzk.z(abxbVar.b, (List) entry.getValue(), abwaVar, abza.a.a(list.get(0).getClass()));
                        break;
                    }
                    break;
                case 10:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        abzk.C(abxbVar.b, (List) entry.getValue(), abwaVar, abza.a.a(list2.get(0).getClass()));
                        break;
                    }
                    break;
                case 11:
                    abzk.t(abxbVar.b, (List) entry.getValue(), abwaVar);
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    abzk.I(abxbVar.b, (List) entry.getValue(), abwaVar, abxbVar.e);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    abzk.A(abxbVar.b, (List) entry.getValue(), abwaVar, abxbVar.e);
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    abzk.D(abxbVar.b, (List) entry.getValue(), abwaVar, abxbVar.e);
                    break;
                case 15:
                    abzk.E(abxbVar.b, (List) entry.getValue(), abwaVar, abxbVar.e);
                    break;
                case 16:
                    abzk.F(abxbVar.b, (List) entry.getValue(), abwaVar, abxbVar.e);
                    break;
                case 17:
                    abzk.G(abxbVar.b, (List) entry.getValue(), abwaVar, abxbVar.e);
                    break;
            }
        }
        acap acapVar2 = acap.DOUBLE;
        switch (abxbVar.c.ordinal()) {
            case 0:
                abwaVar.a.l(abxbVar.b, Double.doubleToRawLongBits(((Double) entry.getValue()).doubleValue()));
                break;
            case 1:
                abwaVar.a.j(abxbVar.b, Float.floatToRawIntBits(((Float) entry.getValue()).floatValue()));
                break;
            case 2:
                abwaVar.a.y(abxbVar.b, ((Long) entry.getValue()).longValue());
                break;
            case 3:
                abwaVar.a.y(abxbVar.b, ((Long) entry.getValue()).longValue());
                break;
            case 4:
                abwaVar.a.n(abxbVar.b, ((Integer) entry.getValue()).intValue());
                break;
            case 5:
                abwaVar.a.l(abxbVar.b, ((Long) entry.getValue()).longValue());
                break;
            case 6:
                abwaVar.a.j(abxbVar.b, ((Integer) entry.getValue()).intValue());
                break;
            case 7:
                abwaVar.a.Q(abxbVar.b, ((Boolean) entry.getValue()).booleanValue());
                break;
            case 8:
                abwaVar.a.t(abxbVar.b, (String) entry.getValue());
                break;
            case 9:
                abwaVar.b(abxbVar.b, entry.getValue(), abza.a.a(entry.getValue().getClass()));
                break;
            case 10:
                abwaVar.c(abxbVar.b, entry.getValue(), abza.a.a(entry.getValue().getClass()));
                break;
            case 11:
                abwaVar.a.h(abxbVar.b, (abvo) entry.getValue());
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                abwaVar.a.w(abxbVar.b, ((Integer) entry.getValue()).intValue());
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                abwaVar.a.n(abxbVar.b, ((Integer) entry.getValue()).intValue());
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                abwaVar.a.j(abxbVar.b, ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                abwaVar.a.l(abxbVar.b, ((Long) entry.getValue()).longValue());
                break;
            case 16:
                int i = abxbVar.b;
                int iIntValue = ((Integer) entry.getValue()).intValue();
                abwaVar.a.w(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                int i2 = abxbVar.b;
                long jLongValue = ((Long) entry.getValue()).longValue();
                abwaVar.a.y(i2, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }
}
