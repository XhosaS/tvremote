package defpackage;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kil {
    public final DataHolder a;
    public int b;
    public int c;

    public kil(DataHolder dataHolder, int i) {
        int length;
        this.a = dataHolder;
        int i2 = 0;
        kkk.f(i >= 0 && i < dataHolder.h);
        this.b = i;
        kkk.f(i >= 0 && i < dataHolder.h);
        while (true) {
            int[] iArr = dataHolder.g;
            length = iArr.length;
            if (i2 >= length) {
                break;
            }
            if (i < iArr[i2]) {
                i2--;
                break;
            }
            i2++;
        }
        this.c = i2 == length ? i2 - 1 : i2;
    }

    public final String a(String str) {
        int i = this.b;
        int i2 = this.c;
        DataHolder dataHolder = this.a;
        dataHolder.a(str, i);
        return dataHolder.d[i2].getString(i, dataHolder.c.getInt(str));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kil) {
            kil kilVar = (kil) obj;
            if (kki.a(Integer.valueOf(kilVar.b), Integer.valueOf(this.b)) && kki.a(Integer.valueOf(kilVar.c), Integer.valueOf(this.c)) && kilVar.a == this.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), this.a});
    }
}
