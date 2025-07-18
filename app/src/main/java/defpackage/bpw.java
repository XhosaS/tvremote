package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bpw {
    public static final int a(brj brjVar, String str) {
        int iA = brjVar.a();
        for (int i = 0; i < iA; i++) {
            if (agvy.c(str, brjVar.c(i))) {
                return i;
            }
        }
        return -1;
    }

    public static final int b(brj brjVar, String str) {
        int iA = bpx.a(brjVar, str);
        if (iA >= 0) {
            return iA;
        }
        int iA2 = brjVar.a();
        ArrayList arrayList = new ArrayList(iA2);
        for (int i = 0; i < iA2; i++) {
            arrayList.add(brjVar.c(i));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + agqq.G(arrayList, null, null, null, null, 63) + ']');
    }
}
