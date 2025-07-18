package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
class uqr implements uqm {
    int b = 0;
    double[] a = new double[5];

    @Override // defpackage.uqm
    public final aayo a() {
        aayi aayiVar = aayi.a;
        aayf aayfVar = new aayf();
        for (int i = 0; i < this.b; i++) {
            aayh aayhVar = aayh.a;
            aayg aaygVar = new aayg();
            double d = this.a[i];
            if ((aaygVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                aaygVar.y();
            }
            aayh aayhVar2 = (aayh) aaygVar.b;
            aayhVar2.b |= 1;
            aayhVar2.c = d;
            if ((aaygVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                aaygVar.y();
            }
            aayh aayhVar3 = (aayh) aaygVar.b;
            aayhVar3.b |= 2;
            aayhVar3.d = 1L;
            if ((Integer.MIN_VALUE & aayfVar.b.memoizedSerializedSize) == 0) {
                aayfVar.y();
            }
            aayi aayiVar2 = (aayi) aayfVar.b;
            aayh aayhVar4 = (aayh) aaygVar.v();
            aayhVar4.getClass();
            abxs abxsVar = aayiVar2.b;
            if (!abxsVar.c()) {
                int size = abxsVar.size();
                aayiVar2.b = abxsVar.d(size + size);
            }
            aayiVar2.b.add(aayhVar4);
        }
        aayo aayoVar = aayo.a;
        aayn aaynVar = new aayn();
        if ((aaynVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            aaynVar.y();
        }
        aayo aayoVar2 = (aayo) aaynVar.b;
        aayi aayiVar3 = (aayi) aayfVar.v();
        aayiVar3.getClass();
        aayoVar2.c = aayiVar3;
        aayoVar2.b = 3;
        return (aayo) aaynVar.v();
    }

    @Override // defpackage.uqm
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Double d = (Double) obj;
        int i = this.b + 1;
        double[] dArr = this.a;
        int length = dArr.length;
        if (i - length > 0) {
            int i2 = length + (length >> 1);
            if (i2 - i < 0) {
                i2 = i;
            }
            if ((-2147483639) + i2 > 0) {
                if (i < 0) {
                    throw new OutOfMemoryError();
                }
                i2 = 2147483639;
                if (i > 2147483639) {
                    i2 = Integer.MAX_VALUE;
                }
            }
            this.a = Arrays.copyOf(dArr, i2);
        }
        this.a[this.b] = d.doubleValue();
        this.b++;
    }

    public final String toString() {
        return ", count = " + this.b + ", value =" + Arrays.toString(this.a);
    }
}
