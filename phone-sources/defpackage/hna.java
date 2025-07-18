package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hna {
    public final hts a;
    public final cuj b;
    private final Class c;
    private final List d;
    private final String e;

    public hna(Class cls, Class cls2, Class cls3, List list, hts htsVar, cuj cujVar) {
        this.c = cls;
        this.d = list;
        this.a = htsVar;
        this.b = cujVar;
        this.e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final hnv a(hlw hlwVar, int i, int i2, hll hllVar, List list) throws hnr {
        List list2 = this.d;
        int size = list2.size();
        hnv hnvVarA = null;
        for (int i3 = 0; i3 < size; i3++) {
            hln hlnVar = (hln) list2.get(i3);
            try {
                if (hlnVar.b(hlwVar.a(), hllVar)) {
                    hnvVarA = hlnVar.a(hlwVar.a(), i, i2, hllVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                list.add(e);
            }
            if (hnvVarA != null) {
                break;
            }
        }
        if (hnvVarA != null) {
            return hnvVarA;
        }
        throw new hnr(this.e, new ArrayList(list));
    }

    public final String toString() {
        hts htsVar = this.a;
        List list = this.d;
        return "DecodePath{ dataClass=" + String.valueOf(this.c) + ", decoders=" + String.valueOf(list) + ", transcoder=" + htsVar.toString() + "}";
    }
}
