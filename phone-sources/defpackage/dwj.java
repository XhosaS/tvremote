package defpackage;

import java.util.HashMap;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwj implements dvi {
    private final /* synthetic */ int a;
    private final Object b;

    public dwj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [duy, java.lang.Object] */
    @Override // defpackage.dvi
    public final void a(dvk dvkVar, dvc dvcVar) {
        duy[] duyVarArr;
        int i = this.a;
        if (i == 0) {
            if (dvcVar != dvc.ON_CREATE) {
                Objects.toString(dvcVar);
                throw new IllegalStateException("Next event must be ON_CREATE, it was ".concat(dvcVar.toString()));
            }
            dvkVar.getLifecycle().d(this);
            ((dwo) this.b).a();
            return;
        }
        if (i != 1) {
            ?? r3 = this.b;
            r3.a();
            r3.a();
            return;
        }
        new HashMap();
        int i2 = 0;
        while (true) {
            duyVarArr = (duy[]) this.b;
            if (i2 >= duyVarArr.length) {
                break;
            }
            duyVarArr[i2].a();
            i2++;
        }
        for (duy duyVar : duyVarArr) {
            duyVar.a();
        }
    }
}
