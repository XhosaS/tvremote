package defpackage;

import java.util.Comparator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ary implements Comparator {
    private final /* synthetic */ int a;

    public /* synthetic */ ary(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        if (i == 0) {
            return Long.compare(((arv) ((dln) obj).b).a, ((arv) ((dln) obj2).b).a);
        }
        if (i == 1) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = (byte[]) obj2;
            mh mhVar = oo.a;
            int length = bArr.length;
            int length2 = bArr2.length;
            if (length != length2) {
                return length - length2;
            }
            for (int i2 = 0; i2 < bArr.length; i2++) {
                byte b = bArr[i2];
                byte b2 = bArr2[i2];
                if (b != b2) {
                    return b - b2;
                }
            }
            return 0;
        }
        if (i != 2) {
            return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
        }
        cey ceyVarA = cey.a(obj);
        cey ceyVarA2 = cey.a(obj2);
        if (ceyVarA != ceyVarA2) {
            return ceyVarA.compareTo(ceyVarA2);
        }
        int iOrdinal = ceyVarA.ordinal();
        if (iOrdinal == 0) {
            return ((Boolean) obj).compareTo((Boolean) obj2);
        }
        if (iOrdinal == 1) {
            return ((String) obj).compareTo((String) obj2);
        }
        if (iOrdinal == 2) {
            return ((Long) obj).compareTo((Long) obj2);
        }
        if (iOrdinal == 3) {
            return ((Double) obj).compareTo((Double) obj2);
        }
        throw null;
    }
}
