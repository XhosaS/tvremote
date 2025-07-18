package defpackage;

import com.google.protobuf.MessageLite;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abzk {
    public static final acaa a;

    static {
        abza abzaVar = abza.a;
        a = new acac();
    }

    public static void A(int i, List list, abwa abwaVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof abxe)) {
            if (!z) {
                while (i2 < list.size()) {
                    abwaVar.a.n(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abvz abvzVar = abwaVar.a;
            abvzVar.v(i, 2);
            int I = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                I += abvz.I(((Integer) list.get(i3)).intValue());
            }
            abvzVar.x(I);
            while (i2 < list.size()) {
                abvzVar.o(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        abxe abxeVar = (abxe) list;
        if (!z) {
            while (i2 < abxeVar.c) {
                abvz abvzVar2 = abwaVar.a;
                abxeVar.i(i2);
                abvzVar2.n(i, abxeVar.b[i2]);
                i2++;
            }
            return;
        }
        abvz abvzVar3 = abwaVar.a;
        abvzVar3.v(i, 2);
        int I2 = 0;
        for (int i4 = 0; i4 < abxeVar.c; i4++) {
            abxeVar.i(i4);
            I2 += abvz.I(abxeVar.b[i4]);
        }
        abvzVar3.x(I2);
        while (i2 < abxeVar.c) {
            abxeVar.i(i2);
            abvzVar3.o(abxeVar.b[i2]);
            i2++;
        }
    }

    public static void B(int i, List list, abwa abwaVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof abyf)) {
            if (!z) {
                while (i2 < list.size()) {
                    abwaVar.a.y(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abvz abvzVar = abwaVar.a;
            abvzVar.v(i, 2);
            int I = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                I += abvz.I(((Long) list.get(i3)).longValue());
            }
            abvzVar.x(I);
            while (i2 < list.size()) {
                abvzVar.z(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        abyf abyfVar = (abyf) list;
        if (!z) {
            while (i2 < abyfVar.c) {
                abvz abvzVar2 = abwaVar.a;
                abyfVar.h(i2);
                abvzVar2.y(i, abyfVar.b[i2]);
                i2++;
            }
            return;
        }
        abvz abvzVar3 = abwaVar.a;
        abvzVar3.v(i, 2);
        int I2 = 0;
        for (int i4 = 0; i4 < abyfVar.c; i4++) {
            abyfVar.h(i4);
            I2 += abvz.I(abyfVar.b[i4]);
        }
        abvzVar3.x(I2);
        while (i2 < abyfVar.c) {
            abyfVar.h(i2);
            abvzVar3.z(abyfVar.b[i2]);
            i2++;
        }
    }

    public static void C(int i, List list, abwa abwaVar, abzj abzjVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            abwaVar.c(i, list.get(i2), abzjVar);
        }
    }

    public static void D(int i, List list, abwa abwaVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof abxe)) {
            if (!z) {
                while (i2 < list.size()) {
                    abwaVar.a.j(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abvz abvzVar = abwaVar.a;
            abvzVar.v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            abvzVar.x(i3);
            while (i2 < list.size()) {
                abvzVar.k(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        abxe abxeVar = (abxe) list;
        if (!z) {
            while (i2 < abxeVar.c) {
                abvz abvzVar2 = abwaVar.a;
                abxeVar.i(i2);
                abvzVar2.j(i, abxeVar.b[i2]);
                i2++;
            }
            return;
        }
        abvz abvzVar3 = abwaVar.a;
        abvzVar3.v(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < abxeVar.c; i6++) {
            abxeVar.i(i6);
            int i7 = abxeVar.b[i6];
            i5 += 4;
        }
        abvzVar3.x(i5);
        while (i2 < abxeVar.c) {
            abxeVar.i(i2);
            abvzVar3.k(abxeVar.b[i2]);
            i2++;
        }
    }

    public static void E(int i, List list, abwa abwaVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof abyf)) {
            if (!z) {
                while (i2 < list.size()) {
                    abwaVar.a.l(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abvz abvzVar = abwaVar.a;
            abvzVar.v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            abvzVar.x(i3);
            while (i2 < list.size()) {
                abvzVar.m(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        abyf abyfVar = (abyf) list;
        if (!z) {
            while (i2 < abyfVar.c) {
                abvz abvzVar2 = abwaVar.a;
                abyfVar.h(i2);
                abvzVar2.l(i, abyfVar.b[i2]);
                i2++;
            }
            return;
        }
        abvz abvzVar3 = abwaVar.a;
        abvzVar3.v(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < abyfVar.c; i6++) {
            abyfVar.h(i6);
            long j = abyfVar.b[i6];
            i5 += 8;
        }
        abvzVar3.x(i5);
        while (i2 < abyfVar.c) {
            abyfVar.h(i2);
            abvzVar3.m(abyfVar.b[i2]);
            i2++;
        }
    }

    public static void F(int i, List list, abwa abwaVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof abxe)) {
            if (!z) {
                while (i2 < list.size()) {
                    abvz abvzVar = abwaVar.a;
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    abvzVar.w(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            abvz abvzVar2 = abwaVar.a;
            abvzVar2.v(i, 2);
            int iH = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iH += abvz.H((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            abvzVar2.x(iH);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                abvzVar2.x((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        abxe abxeVar = (abxe) list;
        if (!z) {
            while (i2 < abxeVar.c) {
                abvz abvzVar3 = abwaVar.a;
                abxeVar.i(i2);
                int i4 = abxeVar.b[i2];
                abvzVar3.w(i, (i4 >> 31) ^ (i4 + i4));
                i2++;
            }
            return;
        }
        abvz abvzVar4 = abwaVar.a;
        abvzVar4.v(i, 2);
        int iH2 = 0;
        for (int i5 = 0; i5 < abxeVar.c; i5++) {
            abxeVar.i(i5);
            int i6 = abxeVar.b[i5];
            iH2 += abvz.H((i6 >> 31) ^ (i6 + i6));
        }
        abvzVar4.x(iH2);
        while (i2 < abxeVar.c) {
            abxeVar.i(i2);
            int i7 = abxeVar.b[i2];
            abvzVar4.x((i7 >> 31) ^ (i7 + i7));
            i2++;
        }
    }

    public static void G(int i, List list, abwa abwaVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof abyf)) {
            if (!z) {
                while (i2 < list.size()) {
                    abvz abvzVar = abwaVar.a;
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    abvzVar.y(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i2++;
                }
                return;
            }
            abvz abvzVar2 = abwaVar.a;
            abvzVar2.v(i, 2);
            int I = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                I += abvz.I((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            abvzVar2.x(I);
            while (i2 < list.size()) {
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                abvzVar2.z((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i2++;
            }
            return;
        }
        abyf abyfVar = (abyf) list;
        if (!z) {
            while (i2 < abyfVar.c) {
                abvz abvzVar3 = abwaVar.a;
                abyfVar.h(i2);
                long j = abyfVar.b[i2];
                abvzVar3.y(i, (j + j) ^ (j >> 63));
                i2++;
            }
            return;
        }
        abvz abvzVar4 = abwaVar.a;
        abvzVar4.v(i, 2);
        int I2 = 0;
        for (int i4 = 0; i4 < abyfVar.c; i4++) {
            abyfVar.h(i4);
            long j2 = abyfVar.b[i4];
            I2 += abvz.I((j2 + j2) ^ (j2 >> 63));
        }
        abvzVar4.x(I2);
        while (i2 < abyfVar.c) {
            abyfVar.h(i2);
            long j3 = abyfVar.b[i2];
            abvzVar4.z((j3 >> 63) ^ (j3 + j3));
            i2++;
        }
    }

    public static void H(int i, List list, abwa abwaVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof abyc)) {
            while (i2 < list.size()) {
                abwaVar.a.t(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        abyc abycVar = (abyc) list;
        while (i2 < list.size()) {
            Object objC = abycVar.c();
            if (objC instanceof String) {
                abwaVar.a.t(i, (String) objC);
            } else {
                abwaVar.a.h(i, (abvo) objC);
            }
            i2++;
        }
    }

    public static void I(int i, List list, abwa abwaVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof abxe)) {
            if (!z) {
                while (i2 < list.size()) {
                    abwaVar.a.w(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abvz abvzVar = abwaVar.a;
            abvzVar.v(i, 2);
            int iH = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iH += abvz.H(((Integer) list.get(i3)).intValue());
            }
            abvzVar.x(iH);
            while (i2 < list.size()) {
                abvzVar.x(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        abxe abxeVar = (abxe) list;
        if (!z) {
            while (i2 < abxeVar.c) {
                abvz abvzVar2 = abwaVar.a;
                abxeVar.i(i2);
                abvzVar2.w(i, abxeVar.b[i2]);
                i2++;
            }
            return;
        }
        abvz abvzVar3 = abwaVar.a;
        abvzVar3.v(i, 2);
        int iH2 = 0;
        for (int i4 = 0; i4 < abxeVar.c; i4++) {
            abxeVar.i(i4);
            iH2 += abvz.H(abxeVar.b[i4]);
        }
        abvzVar3.x(iH2);
        while (i2 < abxeVar.c) {
            abxeVar.i(i2);
            abvzVar3.x(abxeVar.b[i2]);
            i2++;
        }
    }

    public static void J(int i, List list, abwa abwaVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof abyf)) {
            if (!z) {
                while (i2 < list.size()) {
                    abwaVar.a.y(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abvz abvzVar = abwaVar.a;
            abvzVar.v(i, 2);
            int I = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                I += abvz.I(((Long) list.get(i3)).longValue());
            }
            abvzVar.x(I);
            while (i2 < list.size()) {
                abvzVar.z(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        abyf abyfVar = (abyf) list;
        if (!z) {
            while (i2 < abyfVar.c) {
                abvz abvzVar2 = abwaVar.a;
                abyfVar.h(i2);
                abvzVar2.y(i, abyfVar.b[i2]);
                i2++;
            }
            return;
        }
        abvz abvzVar3 = abwaVar.a;
        abvzVar3.v(i, 2);
        int I2 = 0;
        for (int i4 = 0; i4 < abyfVar.c; i4++) {
            abyfVar.h(i4);
            I2 += abvz.I(abyfVar.b[i4]);
        }
        abvzVar3.x(I2);
        while (i2 < abyfVar.c) {
            abyfVar.h(i2);
            abvzVar3.z(abyfVar.b[i2]);
            i2++;
        }
    }

    static int a(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof abxe)) {
            int I = 0;
            while (i < size) {
                I += abvz.I(((Integer) list.get(i)).intValue());
                i++;
            }
            return I;
        }
        abxe abxeVar = (abxe) list;
        int I2 = 0;
        while (i < size) {
            abxeVar.i(i);
            I2 += abvz.I(abxeVar.b[i]);
            i++;
        }
        return I2;
    }

    static int b(List list) {
        return list.size() * 4;
    }

    static int c(List list) {
        return list.size() * 8;
    }

    static int d(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof abxe)) {
            int I = 0;
            while (i < size) {
                I += abvz.I(((Integer) list.get(i)).intValue());
                i++;
            }
            return I;
        }
        abxe abxeVar = (abxe) list;
        int I2 = 0;
        while (i < size) {
            abxeVar.i(i);
            I2 += abvz.I(abxeVar.b[i]);
            i++;
        }
        return I2;
    }

    static int e(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof abyf)) {
            int I = 0;
            while (i < size) {
                I += abvz.I(((Long) list.get(i)).longValue());
                i++;
            }
            return I;
        }
        abyf abyfVar = (abyf) list;
        int I2 = 0;
        while (i < size) {
            abyfVar.h(i);
            I2 += abvz.I(abyfVar.b[i]);
            i++;
        }
        return I2;
    }

    static int f(int i, Object obj, abzj abzjVar) {
        int i2 = i << 3;
        if (!(obj instanceof abyb)) {
            return abvz.H(i2) + abvz.E((MessageLite) obj, abzjVar);
        }
        int iH = abvz.H(i2);
        int iA = ((abyb) obj).a();
        return iH + abvz.H(iA) + iA;
    }

    static int g(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof abxe)) {
            int iH = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iH += abvz.H((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iH;
        }
        abxe abxeVar = (abxe) list;
        int iH2 = 0;
        while (i < size) {
            abxeVar.i(i);
            int i2 = abxeVar.b[i];
            iH2 += abvz.H((i2 >> 31) ^ (i2 + i2));
            i++;
        }
        return iH2;
    }

    static int h(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof abyf)) {
            int I = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                I += abvz.I((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return I;
        }
        abyf abyfVar = (abyf) list;
        int I2 = 0;
        while (i < size) {
            abyfVar.h(i);
            long j = abyfVar.b[i];
            I2 += abvz.I((j >> 63) ^ (j + j));
            i++;
        }
        return I2;
    }

    static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof abxe)) {
            int iH = 0;
            while (i < size) {
                iH += abvz.H(((Integer) list.get(i)).intValue());
                i++;
            }
            return iH;
        }
        abxe abxeVar = (abxe) list;
        int iH2 = 0;
        while (i < size) {
            abxeVar.i(i);
            iH2 += abvz.H(abxeVar.b[i]);
            i++;
        }
        return iH2;
    }

    static int j(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof abyf)) {
            int I = 0;
            while (i < size) {
                I += abvz.I(((Long) list.get(i)).longValue());
                i++;
            }
            return I;
        }
        abyf abyfVar = (abyf) list;
        int I2 = 0;
        while (i < size) {
            abyfVar.h(i);
            I2 += abvz.I(abyfVar.b[i]);
            i++;
        }
        return I2;
    }

    static Object k(Object obj, int i, List list, abxg abxgVar, Object obj2, acaa acaaVar) {
        if (abxgVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (acqc.b(iIntValue) == null) {
                    obj2 = m(obj, i, iIntValue, obj2, acaaVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) list.get(i3);
            int iIntValue2 = num.intValue();
            if (acqc.b(iIntValue2) != null) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                obj2 = m(obj, i, iIntValue2, obj2, acaaVar);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return obj2;
    }

    static Object l(Object obj, int i, List list, abxh abxhVar, Object obj2, acaa acaaVar) {
        if (abxhVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!abxhVar.a(iIntValue)) {
                    obj2 = m(obj, i, iIntValue, obj2, acaaVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) list.get(i3);
            int iIntValue2 = num.intValue();
            if (abxhVar.a(iIntValue2)) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                obj2 = m(obj, i, iIntValue2, obj2, acaaVar);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return obj2;
    }

    static Object m(Object obj, int i, int i2, Object obj2, acaa acaaVar) {
        if (obj2 == null) {
            obj2 = acaaVar.a(obj);
        }
        acaaVar.g(obj2, i, i2);
        return obj2;
    }

    static void n(abwm abwmVar, Object obj, Object obj2) {
        abzp abzpVar = ((abwz) obj2).n.b;
        if (abzpVar.isEmpty()) {
            return;
        }
        abwr abwrVarA = abwmVar.a(obj);
        int i = abzpVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            abwrVarA.g(abzpVar.d(i2));
        }
        Iterator it = abzpVar.a().iterator();
        while (it.hasNext()) {
            abwrVarA.g((Map.Entry) it.next());
        }
    }

    static boolean o(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int p(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (abvz.H(i << 3) + 4);
    }

    static int q(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (abvz.H(i << 3) + 8);
    }

    static void r(Object obj, Object obj2) {
        abxd abxdVar = (abxd) obj;
        acab acabVar = abxdVar.unknownFields;
        acab acabVar2 = ((abxd) obj2).unknownFields;
        acab acabVar3 = acab.a;
        if (!acabVar3.equals(acabVar2)) {
            if (acabVar3.equals(acabVar)) {
                int i = acabVar.b + acabVar2.b;
                int[] iArrCopyOf = Arrays.copyOf(acabVar.c, i);
                System.arraycopy(acabVar2.c, 0, iArrCopyOf, acabVar.b, acabVar2.b);
                Object[] objArrCopyOf = Arrays.copyOf(acabVar.d, i);
                System.arraycopy(acabVar2.d, 0, objArrCopyOf, acabVar.b, acabVar2.b);
                acabVar = new acab(i, iArrCopyOf, objArrCopyOf, true);
            } else if (!acabVar2.equals(acabVar3)) {
                acabVar.b();
                int i2 = acabVar.b + acabVar2.b;
                acabVar.c(i2);
                System.arraycopy(acabVar2.c, 0, acabVar.c, acabVar.b, acabVar2.b);
                System.arraycopy(acabVar2.d, 0, acabVar.d, acabVar.b, acabVar2.b);
                acabVar.b = i2;
            }
        }
        abxdVar.unknownFields = acabVar;
    }

    public static void s(int i, List list, abwa abwaVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof abve)) {
            if (!z) {
                while (i2 < list.size()) {
                    abwaVar.a.Q(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            abvz abvzVar = abwaVar.a;
            abvzVar.v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            abvzVar.x(i3);
            while (i2 < list.size()) {
                abvzVar.P(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        abve abveVar = (abve) list;
        if (!z) {
            while (i2 < abveVar.c) {
                abvz abvzVar2 = abwaVar.a;
                abveVar.f(i2);
                abvzVar2.Q(i, abveVar.b[i2]);
                i2++;
            }
            return;
        }
        abvz abvzVar3 = abwaVar.a;
        abvzVar3.v(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < abveVar.c; i6++) {
            abveVar.f(i6);
            boolean z2 = abveVar.b[i6];
            i5++;
        }
        abvzVar3.x(i5);
        while (i2 < abveVar.c) {
            abveVar.f(i2);
            abvzVar3.P(abveVar.b[i2] ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void t(int i, List list, abwa abwaVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            abwaVar.a.h(i, (abvo) list.get(i2));
        }
    }

    public static void u(int i, List list, abwa abwaVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof abwd)) {
            if (!z) {
                while (i2 < list.size()) {
                    abwaVar.a.l(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            abvz abvzVar = abwaVar.a;
            abvzVar.v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            abvzVar.x(i3);
            while (i2 < list.size()) {
                abvzVar.m(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        abwd abwdVar = (abwd) list;
        if (!z) {
            while (i2 < abwdVar.c) {
                abvz abvzVar2 = abwaVar.a;
                abwdVar.g(i2);
                abvzVar2.l(i, Double.doubleToRawLongBits(abwdVar.b[i2]));
                i2++;
            }
            return;
        }
        abvz abvzVar3 = abwaVar.a;
        abvzVar3.v(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < abwdVar.c; i6++) {
            abwdVar.g(i6);
            double d = abwdVar.b[i6];
            i5 += 8;
        }
        abvzVar3.x(i5);
        while (i2 < abwdVar.c) {
            abwdVar.g(i2);
            abvzVar3.m(Double.doubleToRawLongBits(abwdVar.b[i2]));
            i2++;
        }
    }

    public static void v(int i, List list, abwa abwaVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof abxe)) {
            if (!z) {
                while (i2 < list.size()) {
                    abwaVar.a.n(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abvz abvzVar = abwaVar.a;
            abvzVar.v(i, 2);
            int I = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                I += abvz.I(((Integer) list.get(i3)).intValue());
            }
            abvzVar.x(I);
            while (i2 < list.size()) {
                abvzVar.o(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        abxe abxeVar = (abxe) list;
        if (!z) {
            while (i2 < abxeVar.c) {
                abvz abvzVar2 = abwaVar.a;
                abxeVar.i(i2);
                abvzVar2.n(i, abxeVar.b[i2]);
                i2++;
            }
            return;
        }
        abvz abvzVar3 = abwaVar.a;
        abvzVar3.v(i, 2);
        int I2 = 0;
        for (int i4 = 0; i4 < abxeVar.c; i4++) {
            abxeVar.i(i4);
            I2 += abvz.I(abxeVar.b[i4]);
        }
        abvzVar3.x(I2);
        while (i2 < abxeVar.c) {
            abxeVar.i(i2);
            abvzVar3.o(abxeVar.b[i2]);
            i2++;
        }
    }

    public static void w(int i, List list, abwa abwaVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof abxe)) {
            if (!z) {
                while (i2 < list.size()) {
                    abwaVar.a.j(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abvz abvzVar = abwaVar.a;
            abvzVar.v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            abvzVar.x(i3);
            while (i2 < list.size()) {
                abvzVar.k(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        abxe abxeVar = (abxe) list;
        if (!z) {
            while (i2 < abxeVar.c) {
                abvz abvzVar2 = abwaVar.a;
                abxeVar.i(i2);
                abvzVar2.j(i, abxeVar.b[i2]);
                i2++;
            }
            return;
        }
        abvz abvzVar3 = abwaVar.a;
        abvzVar3.v(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < abxeVar.c; i6++) {
            abxeVar.i(i6);
            int i7 = abxeVar.b[i6];
            i5 += 4;
        }
        abvzVar3.x(i5);
        while (i2 < abxeVar.c) {
            abxeVar.i(i2);
            abvzVar3.k(abxeVar.b[i2]);
            i2++;
        }
    }

    public static void x(int i, List list, abwa abwaVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof abyf)) {
            if (!z) {
                while (i2 < list.size()) {
                    abwaVar.a.l(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abvz abvzVar = abwaVar.a;
            abvzVar.v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            abvzVar.x(i3);
            while (i2 < list.size()) {
                abvzVar.m(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        abyf abyfVar = (abyf) list;
        if (!z) {
            while (i2 < abyfVar.c) {
                abvz abvzVar2 = abwaVar.a;
                abyfVar.h(i2);
                abvzVar2.l(i, abyfVar.b[i2]);
                i2++;
            }
            return;
        }
        abvz abvzVar3 = abwaVar.a;
        abvzVar3.v(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < abyfVar.c; i6++) {
            abyfVar.h(i6);
            long j = abyfVar.b[i6];
            i5 += 8;
        }
        abvzVar3.x(i5);
        while (i2 < abyfVar.c) {
            abyfVar.h(i2);
            abvzVar3.m(abyfVar.b[i2]);
            i2++;
        }
    }

    public static void y(int i, List list, abwa abwaVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof abwt)) {
            if (!z) {
                while (i2 < list.size()) {
                    abwaVar.a.j(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            abvz abvzVar = abwaVar.a;
            abvzVar.v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            abvzVar.x(i3);
            while (i2 < list.size()) {
                abvzVar.k(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        abwt abwtVar = (abwt) list;
        if (!z) {
            while (i2 < abwtVar.d) {
                abvz abvzVar2 = abwaVar.a;
                abwtVar.h(i2);
                abvzVar2.j(i, Float.floatToRawIntBits(abwtVar.c[i2]));
                i2++;
            }
            return;
        }
        abvz abvzVar3 = abwaVar.a;
        abvzVar3.v(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < abwtVar.d; i6++) {
            abwtVar.h(i6);
            float f = abwtVar.c[i6];
            i5 += 4;
        }
        abvzVar3.x(i5);
        while (i2 < abwtVar.d) {
            abwtVar.h(i2);
            abvzVar3.k(Float.floatToRawIntBits(abwtVar.c[i2]));
            i2++;
        }
    }

    public static void z(int i, List list, abwa abwaVar, abzj abzjVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            abwaVar.b(i, list.get(i2), abzjVar);
        }
    }
}
