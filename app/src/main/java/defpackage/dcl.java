package defpackage;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dcl {
    public final dmo a;
    public final afh b;
    private final Class c;
    private final List d;
    private final String e;

    public dcl(Class cls, Class cls2, Class cls3, List list, dmo dmoVar, afh afhVar) {
        this.c = cls;
        this.d = list;
        this.a = dmoVar;
        this.b = afhVar;
        this.e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final ddp a(day dayVar, int i, int i2, dan danVar, List list) throws ddj {
        List list2 = this.d;
        int size = list2.size();
        ddp ddpVarA = null;
        for (int i3 = 0; i3 < size; i3++) {
            dap dapVar = (dap) list2.get(i3);
            try {
                if (dapVar.b(dayVar.a(), danVar)) {
                    ddpVarA = dapVar.a(dayVar.a(), i, i2, danVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for ".concat(String.valueOf(String.valueOf(dapVar))), e);
                }
                list.add(e);
            }
            if (ddpVarA != null) {
                break;
            }
        }
        if (ddpVarA != null) {
            return ddpVarA;
        }
        throw new ddj(this.e, new ArrayList(list));
    }

    public final String toString() {
        dmo dmoVar = this.a;
        List list = this.d;
        return "DecodePath{ dataClass=" + String.valueOf(this.c) + ", decoders=" + String.valueOf(list) + ", transcoder=" + dmoVar.toString() + "}";
    }
}
