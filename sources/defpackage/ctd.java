package defpackage;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ctd implements Serializable, csv {
    public final csv a;

    public ctd(csv csvVar) {
        this.a = csvVar;
    }

    @Override // defpackage.csv
    public final void c(Object obj) {
        csv csvVar = this;
        while (true) {
            csvVar.getClass();
            ctd ctdVar = (ctd) csvVar;
            csv csvVar2 = ctdVar.a;
            csvVar2.getClass();
            try {
                obj = ctdVar.d(obj);
                if (obj == ctc.a) {
                    return;
                }
            } catch (Throwable th) {
                obj = new csb(th);
            }
            if (!(csvVar2 instanceof ctd)) {
                csvVar2.c(obj);
                return;
            }
            csvVar = csvVar2;
        }
    }

    protected abstract Object d(Object obj);

    public csv e(Object obj, csv csvVar) {
        throw null;
    }

    public String toString() {
        String name = getClass().getName();
        Objects.toString(name);
        return "Continuation at ".concat(String.valueOf(name));
    }
}
