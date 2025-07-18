package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aael implements aafh, aaff {
    public final aafh[] a;
    public final aaff[] b;
    private final int c;
    private final int d;

    public aael(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            Object obj = list.get(i);
            if (obj instanceof aael) {
                f(arrayList, ((aael) obj).a);
            } else {
                arrayList.add(obj);
            }
            Object obj2 = list.get(i + 1);
            if (obj2 instanceof aael) {
                f(arrayList2, ((aael) obj2).b);
            } else {
                arrayList2.add(obj2);
            }
        }
        if (arrayList.contains(null) || arrayList.isEmpty()) {
            this.a = null;
            this.c = 0;
        } else {
            int size2 = arrayList.size();
            this.a = new aafh[size2];
            int iB = 0;
            for (int i2 = 0; i2 < size2; i2++) {
                aafh aafhVar = (aafh) arrayList.get(i2);
                iB += aafhVar.b();
                this.a[i2] = aafhVar;
            }
            this.c = iB;
        }
        if (arrayList2.contains(null) || arrayList2.isEmpty()) {
            this.b = null;
            this.d = 0;
            return;
        }
        int size3 = arrayList2.size();
        this.b = new aaff[size3];
        int iA = 0;
        for (int i3 = 0; i3 < size3; i3++) {
            aaff aaffVar = (aaff) arrayList2.get(i3);
            iA += aaffVar.a();
            this.b[i3] = aaffVar;
        }
        this.d = iA;
    }

    private static final void f(List list, Object[] objArr) {
        if (objArr != null) {
            for (Object obj : objArr) {
                list.add(obj);
            }
        }
    }

    @Override // defpackage.aaff
    public final int a() {
        return this.d;
    }

    @Override // defpackage.aafh
    public final int b() {
        return this.c;
    }

    @Override // defpackage.aaff
    public final int c(aafb aafbVar, CharSequence charSequence, int i) {
        aaff[] aaffVarArr = this.b;
        if (aaffVarArr == null) {
            throw new UnsupportedOperationException();
        }
        for (int i2 = 0; i2 < aaffVarArr.length && i >= 0; i2++) {
            i = aaffVarArr[i2].c(aafbVar, charSequence, i);
        }
        return i;
    }

    @Override // defpackage.aafh
    public final void d(Appendable appendable, aach aachVar, Locale locale) {
        aafh[] aafhVarArr = this.a;
        if (aafhVarArr == null) {
            throw new UnsupportedOperationException();
        }
        if (locale == null) {
            locale = Locale.getDefault();
        }
        for (aafh aafhVar : aafhVarArr) {
            aafhVar.d(appendable, aachVar, locale);
        }
    }

    @Override // defpackage.aafh
    public final void e(Appendable appendable, long j, aabk aabkVar, int i, aabs aabsVar, Locale locale) {
        aafh[] aafhVarArr = this.a;
        if (aafhVarArr == null) {
            throw new UnsupportedOperationException();
        }
        Locale locale2 = locale == null ? Locale.getDefault() : locale;
        for (aafh aafhVar : aafhVarArr) {
            aafhVar.e(appendable, j, aabkVar, i, aabsVar, locale2);
        }
    }
}
