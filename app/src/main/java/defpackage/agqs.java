package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public class agqs extends agqr {
    public static final int c(List list) {
        return list.size() - 1;
    }

    public static final List d(Object... objArr) {
        objArr.getClass();
        return objArr.length > 0 ? agqj.c(objArr) : agrd.a;
    }

    public static final List e(Object... objArr) {
        objArr.getClass();
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new agqh(objArr, true));
    }

    public static final List f(List list) {
        int size = list.size();
        if (size == 0) {
            return agrd.a;
        }
        if (size != 1) {
            return list;
        }
        List listSingletonList = Collections.singletonList(list.get(0));
        listSingletonList.getClass();
        return listSingletonList;
    }

    public static final void g() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static final void h() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
