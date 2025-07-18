package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bxm extends bxn {
    private final Object a;
    private final String b;
    private final String c;
    private final bxr d;
    private final int e;

    public bxm(Object obj, String str, String str2, int i) {
        Collection collectionSingletonList;
        this.a = obj;
        this.b = str;
        this.c = str2;
        this.e = i;
        bxr bxrVar = new bxr(c(obj, str2));
        StackTraceElement[] stackTrace = bxrVar.getStackTrace();
        stackTrace.getClass();
        int length = stackTrace.length;
        int i2 = length - 2;
        i2 = i2 < 0 ? 0 : i2;
        if (i2 == 0) {
            collectionSingletonList = agrd.a;
        } else if (i2 >= length) {
            collectionSingletonList = agqj.n(stackTrace);
        } else if (i2 == 1) {
            collectionSingletonList = Collections.singletonList(stackTrace[length - 1]);
            collectionSingletonList.getClass();
        } else {
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = length - i2; i3 < length; i3++) {
                arrayList.add(stackTrace[i3]);
            }
            collectionSingletonList = arrayList;
        }
        bxrVar.setStackTrace((StackTraceElement[]) collectionSingletonList.toArray(new StackTraceElement[0]));
        this.d = bxrVar;
    }

    @Override // defpackage.bxn
    public final Object b() throws bxr {
        int i = this.e - 1;
        if (i == 0) {
            throw this.d;
        }
        if (i != 1) {
            return null;
        }
        Log.d(this.b, c(this.a, this.c));
        return null;
    }

    @Override // defpackage.bxn
    public final bxn a(String str, agux aguxVar) {
        return this;
    }
}
